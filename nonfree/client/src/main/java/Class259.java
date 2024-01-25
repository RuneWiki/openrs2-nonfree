import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oq")
public final class Class259 {

	@OriginalMember(owner = "client!oq", name = "g", descriptor = "[Lclient!tf;")
	private Class227_Sub1[] aClass227_Sub1Array1;

	@OriginalMember(owner = "client!oq", name = "n", descriptor = "Lclient!jp;")
	private Class3_Sub25 aClass3_Sub25_6;

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger3;

	@OriginalMember(owner = "client!oq", name = "e", descriptor = "Lclient!tv;")
	private final Class341 aClass341_3;

	@OriginalMember(owner = "client!oq", name = "j", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger4;

	@OriginalMember(owner = "client!oq", name = "f", descriptor = "Lclient!nja;")
	private final Class240 aClass240_2;

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "Lclient!fea;")
	private Class3_Sub11_Sub2_Sub2 aClass3_Sub11_Sub2_Sub2_1;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Lclient!tv;Lclient!nja;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class259(@OriginalArg(0) Class341 arg0, @OriginalArg(1) Class240 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aBigInteger3 = arg3;
		this.aClass341_3 = arg0;
		this.aBigInteger4 = arg2;
		this.aClass240_2 = arg1;
		if (!this.aClass341_3.method8303()) {
			this.aClass3_Sub11_Sub2_Sub2_1 = this.aClass341_3.method8302((byte) 0, true, 255, 255);
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ZIZLclient!tk;Lclient!tk;)Lclient!tf;")
	private Class227_Sub1 method6238(@OriginalArg(1) int arg0, @OriginalArg(3) Class337 arg1, @OriginalArg(4) Class337 arg2) {
		if (this.aClass3_Sub25_6 == null) {
			throw new RuntimeException();
		} else if (arg0 < 0 || this.aClass227_Sub1Array1.length <= arg0) {
			throw new RuntimeException();
		} else if (this.aClass227_Sub1Array1[arg0] == null) {
			this.aClass3_Sub25_6.anInt9765 = arg0 * 72 + 6;
			@Pc(48) int local48 = this.aClass3_Sub25_6.method8618();
			@Pc(53) int local53 = this.aClass3_Sub25_6.method8618();
			@Pc(56) byte[] local56 = new byte[64];
			this.aClass3_Sub25_6.method8623(0, 64, local56);
			@Pc(78) Class227_Sub1 local78 = new Class227_Sub1(arg0, arg2, arg1, this.aClass341_3, this.aClass240_2, local48, local56, local53, true);
			this.aClass227_Sub1Array1[arg0] = local78;
			return local78;
		} else {
			return this.aClass227_Sub1Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)Z")
	public boolean method6239() {
		if (this.aClass3_Sub25_6 != null) {
			return true;
		}
		if (this.aClass3_Sub11_Sub2_Sub2_1 == null) {
			if (this.aClass341_3.method8303()) {
				return false;
			}
			this.aClass3_Sub11_Sub2_Sub2_1 = this.aClass341_3.method8302((byte) 0, true, 255, 255);
		}
		if (this.aClass3_Sub11_Sub2_Sub2_1.aBoolean237) {
			return false;
		}
		@Pc(44) Class3_Sub25 local44 = new Class3_Sub25(this.aClass3_Sub11_Sub2_Sub2_1.method2889());
		local44.anInt9765 = 5;
		@Pc(51) int local51 = local44.method8632();
		local44.anInt9765 += local51 * 72;
		@Pc(68) byte[] local68 = new byte[local44.aByteArray106.length - local44.anInt9765];
		local44.method8623(0, local68.length, local68);
		@Pc(98) byte[] local98;
		if (this.aBigInteger4 == null || this.aBigInteger3 == null) {
			local98 = local68;
		} else {
			@Pc(88) BigInteger local88 = new BigInteger(local68);
			@Pc(95) BigInteger local95 = local88.modPow(this.aBigInteger4, this.aBigInteger3);
			local98 = local95.toByteArray();
		}
		if (local98.length != 65) {
			throw new RuntimeException();
		}
		@Pc(126) byte[] local126 = Static492.method7091(5, local44.aByteArray106, local44.anInt9765 - local68.length - 5);
		for (@Pc(128) int local128 = 0; local128 < 64; local128++) {
			if (local126[local128] != local98[local128 + 1]) {
				throw new RuntimeException();
			}
		}
		this.aClass3_Sub25_6 = local44;
		this.aClass227_Sub1Array1 = new Class227_Sub1[local51];
		return true;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(BILclient!tk;Lclient!tk;)Lclient!tf;")
	public Class227_Sub1 method6240(@OriginalArg(1) int arg0, @OriginalArg(2) Class337 arg1, @OriginalArg(3) Class337 arg2) {
		return this.method6238(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)V")
	public void method6241() {
		if (this.aClass227_Sub1Array1 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < this.aClass227_Sub1Array1.length; local17++) {
			if (this.aClass227_Sub1Array1[local17] != null) {
				this.aClass227_Sub1Array1[local17].method8074();
			}
		}
		for (@Pc(42) int local42 = 0; local42 < this.aClass227_Sub1Array1.length; local42++) {
			if (this.aClass227_Sub1Array1[local42] != null) {
				this.aClass227_Sub1Array1[local42].method8078();
			}
		}
	}
}
