import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rw")
public final class Class296 {

	@OriginalMember(owner = "client!rw", name = "s", descriptor = "Lclient!qh;")
	private Class3_Sub11 aClass3_Sub11_5;

	@OriginalMember(owner = "client!rw", name = "t", descriptor = "[Lclient!uaa;")
	private Class303_Sub1[] aClass303_Sub1Array1;

	@OriginalMember(owner = "client!rw", name = "e", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger4;

	@OriginalMember(owner = "client!rw", name = "q", descriptor = "Lclient!ue;")
	private final Class331 aClass331_2;

	@OriginalMember(owner = "client!rw", name = "p", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger5;

	@OriginalMember(owner = "client!rw", name = "n", descriptor = "Lclient!hca;")
	private final Class125 aClass125_1;

	@OriginalMember(owner = "client!rw", name = "r", descriptor = "Lclient!ft;")
	private Class3_Sub3_Sub2_Sub1 aClass3_Sub3_Sub2_Sub1_1;

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Lclient!ue;Lclient!hca;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class296(@OriginalArg(0) Class331 arg0, @OriginalArg(1) Class125 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aBigInteger4 = arg3;
		this.aClass331_2 = arg0;
		this.aBigInteger5 = arg2;
		this.aClass125_1 = arg1;
		if (!this.aClass331_2.method7005()) {
			this.aClass3_Sub3_Sub2_Sub1_1 = this.aClass331_2.method7000((byte) 0, 255, true, 255);
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(ZLclient!fj;ILclient!fj;B)Lclient!uaa;")
	private Class303_Sub1 method6467(@OriginalArg(1) Class97 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class97 arg2) {
		if (this.aClass3_Sub11_5 == null) {
			throw new RuntimeException();
		} else if (arg1 < 0 || arg1 >= this.aClass303_Sub1Array1.length) {
			throw new RuntimeException();
		} else if (this.aClass303_Sub1Array1[arg1] == null) {
			this.aClass3_Sub11_5.anInt3520 = arg1 * 72 + 6;
			@Pc(48) int local48 = this.aClass3_Sub11_5.method3116();
			@Pc(58) int local58 = this.aClass3_Sub11_5.method3116();
			@Pc(61) byte[] local61 = new byte[64];
			this.aClass3_Sub11_5.method3090(64, local61);
			@Pc(83) Class303_Sub1 local83 = new Class303_Sub1(arg1, arg2, arg0, this.aClass331_2, this.aClass125_1, local48, local61, local58, true);
			this.aClass303_Sub1Array1[arg1] = local83;
			return local83;
		} else {
			return this.aClass303_Sub1Array1[arg1];
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(ILclient!fj;ZLclient!fj;)Lclient!uaa;")
	public Class303_Sub1 method6471(@OriginalArg(0) int arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(3) Class97 arg2) {
		return this.method6467(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(B)Z")
	public boolean method6474() {
		if (this.aClass3_Sub11_5 != null) {
			return true;
		}
		if (this.aClass3_Sub3_Sub2_Sub1_1 == null) {
			if (this.aClass331_2.method7005()) {
				return false;
			}
			this.aClass3_Sub3_Sub2_Sub1_1 = this.aClass331_2.method7000((byte) 0, 255, true, 255);
		}
		if (this.aClass3_Sub3_Sub2_Sub1_1.aBoolean507) {
			return false;
		}
		@Pc(44) Class3_Sub11 local44 = new Class3_Sub11(this.aClass3_Sub3_Sub2_Sub1_1.method5364());
		local44.anInt3520 = 5;
		@Pc(51) int local51 = local44.method3118();
		local44.anInt3520 += local51 * 72;
		@Pc(68) byte[] local68 = new byte[local44.aByteArray36.length - local44.anInt3520];
		local44.method3090(local68.length, local68);
		@Pc(83) byte[] local83;
		if (this.aBigInteger5 == null || this.aBigInteger4 == null) {
			local83 = local68;
		} else {
			@Pc(90) BigInteger local90 = new BigInteger(local68);
			@Pc(97) BigInteger local97 = local90.modPow(this.aBigInteger5, this.aBigInteger4);
			local83 = local97.toByteArray();
		}
		if (local83.length != 65) {
			throw new RuntimeException();
		}
		@Pc(121) byte[] local121 = Static360.method5383(local44.aByteArray36, 5, local44.anInt3520 - local68.length - 5);
		for (@Pc(123) int local123 = 0; local123 < 64; local123++) {
			if (local121[local123] != local83[local123 + 1]) {
				throw new RuntimeException();
			}
		}
		this.aClass303_Sub1Array1 = new Class303_Sub1[local51];
		this.aClass3_Sub11_5 = local44;
		return true;
	}

	@OriginalMember(owner = "client!rw", name = "c", descriptor = "(I)V")
	public void method6476() {
		if (this.aClass303_Sub1Array1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass303_Sub1Array1.length; local11++) {
			if (this.aClass303_Sub1Array1[local11] != null) {
				this.aClass303_Sub1Array1[local11].method6958();
			}
		}
		for (@Pc(32) int local32 = 0; local32 < this.aClass303_Sub1Array1.length; local32++) {
			if (this.aClass303_Sub1Array1[local32] != null) {
				this.aClass303_Sub1Array1[local32].method6955();
			}
		}
	}
}
