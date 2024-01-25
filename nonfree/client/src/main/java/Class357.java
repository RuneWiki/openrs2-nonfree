import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class357 {

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "[Lclient!bd;")
	private Class30_Sub1[] aClass30_Sub1Array2;

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "Lclient!np;")
	private Class3_Sub11 aClass3_Sub11_7;

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger6;

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "Lclient!mv;")
	private final Class217 aClass217_3;

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "Lclient!ql;")
	private final Class277 aClass277_3;

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger5;

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "Lclient!nu;")
	private Class3_Sub7_Sub1_Sub2 aClass3_Sub7_Sub1_Sub2_2;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lclient!ql;Lclient!mv;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class357(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class217 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aBigInteger6 = arg2;
		this.aClass217_3 = arg1;
		this.aClass277_3 = arg0;
		this.aBigInteger5 = arg3;
		if (!this.aClass277_3.method6124()) {
			this.aClass3_Sub7_Sub1_Sub2_2 = this.aClass277_3.method6121((byte) 0, 255, true, 255);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!at;BLclient!at;IZ)Lclient!bd;")
	private Class30_Sub1 method7710(@OriginalArg(0) Class22 arg0, @OriginalArg(2) Class22 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass3_Sub11_7 == null) {
			throw new RuntimeException();
		} else if (arg2 < 0 || arg2 >= this.aClass30_Sub1Array2.length) {
			throw new RuntimeException();
		} else if (this.aClass30_Sub1Array2[arg2] == null) {
			this.aClass3_Sub11_7.anInt6128 = arg2 * 72 + 6;
			@Pc(51) int local51 = this.aClass3_Sub11_7.method5186();
			@Pc(56) int local56 = this.aClass3_Sub11_7.method5186();
			@Pc(64) byte[] local64 = new byte[64];
			this.aClass3_Sub11_7.method5183(64, local64);
			@Pc(86) Class30_Sub1 local86 = new Class30_Sub1(arg2, arg0, arg1, this.aClass277_3, this.aClass217_3, local51, local64, local56, true);
			this.aClass30_Sub1Array2[arg2] = local86;
			return local86;
		} else {
			return this.aClass30_Sub1Array2[arg2];
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BILclient!at;Lclient!at;)Lclient!bd;")
	public Class30_Sub1 method7712(@OriginalArg(1) int arg0, @OriginalArg(2) Class22 arg1, @OriginalArg(3) Class22 arg2) {
		return this.method7710(arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)Z")
	public boolean method7713() {
		if (this.aClass3_Sub11_7 != null) {
			return true;
		}
		if (this.aClass3_Sub7_Sub1_Sub2_2 == null) {
			if (this.aClass277_3.method6124()) {
				return false;
			}
			this.aClass3_Sub7_Sub1_Sub2_2 = this.aClass277_3.method6121((byte) 0, 255, true, 255);
		}
		if (this.aClass3_Sub7_Sub1_Sub2_2.aBoolean458) {
			return false;
		}
		@Pc(44) Class3_Sub11 local44 = new Class3_Sub11(this.aClass3_Sub7_Sub1_Sub2_2.method5380());
		local44.anInt6128 = 5;
		@Pc(51) int local51 = local44.method5175();
		local44.anInt6128 += local51 * 72;
		@Pc(68) byte[] local68 = new byte[local44.aByteArray62.length - local44.anInt6128];
		local44.method5183(local68.length, local68);
		@Pc(83) byte[] local83;
		if (this.aBigInteger6 == null || this.aBigInteger5 == null) {
			local83 = local68;
		} else {
			@Pc(90) BigInteger local90 = new BigInteger(local68);
			@Pc(97) BigInteger local97 = local90.modPow(this.aBigInteger6, this.aBigInteger5);
			local83 = local97.toByteArray();
		}
		if (local83.length != 65) {
			throw new RuntimeException();
		}
		@Pc(124) byte[] local124 = Static175.method3078(local44.aByteArray62, local44.anInt6128 - local68.length - 5, 5);
		for (@Pc(126) int local126 = 0; local126 < 64; local126++) {
			if (local124[local126] != local83[local126 + 1]) {
				throw new RuntimeException();
			}
		}
		this.aClass30_Sub1Array2 = new Class30_Sub1[local51];
		this.aClass3_Sub11_7 = local44;
		return true;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
	public void method7714() {
		if (this.aClass30_Sub1Array2 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass30_Sub1Array2.length; local11++) {
			if (this.aClass30_Sub1Array2[local11] != null) {
				this.aClass30_Sub1Array2[local11].method587();
			}
		}
		for (@Pc(32) int local32 = 0; local32 < this.aClass30_Sub1Array2.length; local32++) {
			if (this.aClass30_Sub1Array2[local32] != null) {
				this.aClass30_Sub1Array2[local32].method586();
			}
		}
	}
}
