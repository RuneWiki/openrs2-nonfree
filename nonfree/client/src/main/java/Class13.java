import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class13 {

	@OriginalMember(owner = "client!al", name = "c", descriptor = "[Lclient!rg;")
	private Class160_Sub1[] aClass160_Sub1Array1;

	@OriginalMember(owner = "client!al", name = "n", descriptor = "Lclient!ji;")
	private Class6_Sub21 aClass6_Sub21_1;

	@OriginalMember(owner = "client!al", name = "g", descriptor = "Lclient!cs;")
	private final Class55 aClass55_1;

	@OriginalMember(owner = "client!al", name = "j", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger2;

	@OriginalMember(owner = "client!al", name = "o", descriptor = "Lclient!jt;")
	private final Class163 aClass163_1;

	@OriginalMember(owner = "client!al", name = "i", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger1;

	@OriginalMember(owner = "client!al", name = "b", descriptor = "Lclient!mj;")
	private Class6_Sub2_Sub4_Sub2 aClass6_Sub2_Sub4_Sub2_1;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!jt;Lclient!cs;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class13(@OriginalArg(0) Class163 arg0, @OriginalArg(1) Class55 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aClass55_1 = arg1;
		this.aBigInteger2 = arg2;
		this.aClass163_1 = arg0;
		this.aBigInteger1 = arg3;
		if (!this.aClass163_1.method4209()) {
			this.aClass6_Sub2_Sub4_Sub2_1 = this.aClass163_1.method4208((byte) 0, true, 255, 255);
		}
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(I)Z")
	public boolean method328() {
		if (this.aClass6_Sub21_1 != null) {
			return true;
		}
		if (this.aClass6_Sub2_Sub4_Sub2_1 == null) {
			if (this.aClass163_1.method4209()) {
				return false;
			}
			this.aClass6_Sub2_Sub4_Sub2_1 = this.aClass163_1.method4208((byte) 0, true, 255, 255);
		}
		if (this.aClass6_Sub2_Sub4_Sub2_1.aBoolean400) {
			return false;
		}
		@Pc(50) Class6_Sub21 local50 = new Class6_Sub21(this.aClass6_Sub2_Sub4_Sub2_1.method4908());
		local50.anInt7338 = 5;
		@Pc(57) int local57 = local50.method6069();
		local50.anInt7338 += local57 * 72;
		@Pc(74) byte[] local74 = new byte[local50.aByteArray93.length - local50.anInt7338];
		local50.method6053(local74.length, local74);
		@Pc(91) byte[] local91;
		if (this.aBigInteger2 == null || this.aBigInteger1 == null) {
			local91 = local74;
		} else {
			@Pc(98) BigInteger local98 = new BigInteger(local74);
			@Pc(105) BigInteger local105 = local98.modPow(this.aBigInteger2, this.aBigInteger1);
			local91 = local105.toByteArray();
		}
		if (local91.length != 65) {
			throw new RuntimeException();
		}
		@Pc(130) byte[] local130 = Static222.method3989(5, local50.anInt7338 - local74.length - 5, local50.aByteArray93);
		for (@Pc(132) int local132 = 0; local132 < 64; local132++) {
			if (local91[local132 + 1] != local130[local132]) {
				throw new RuntimeException();
			}
		}
		this.aClass6_Sub21_1 = local50;
		this.aClass160_Sub1Array1 = new Class160_Sub1[local57];
		return true;
	}

	@OriginalMember(owner = "client!al", name = "c", descriptor = "(I)V")
	public void method329() {
		if (this.aClass160_Sub1Array1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass160_Sub1Array1.length; local11++) {
			if (this.aClass160_Sub1Array1[local11] != null) {
				this.aClass160_Sub1Array1[local11].method6359();
			}
		}
		for (@Pc(32) int local32 = 0; local32 < this.aClass160_Sub1Array1.length; local32++) {
			if (this.aClass160_Sub1Array1[local32] != null) {
				this.aClass160_Sub1Array1[local32].method6366();
			}
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!kf;IILclient!kf;)Lclient!rg;")
	public Class160_Sub1 method330(@OriginalArg(0) Class172 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class172 arg2) {
		return this.method331(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!kf;Lclient!kf;IIZ)Lclient!rg;")
	private Class160_Sub1 method331(@OriginalArg(0) Class172 arg0, @OriginalArg(1) Class172 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass6_Sub21_1 == null) {
			throw new RuntimeException();
		} else if (arg2 < 0 || arg2 >= this.aClass160_Sub1Array1.length) {
			throw new RuntimeException();
		} else if (this.aClass160_Sub1Array1[arg2] == null) {
			this.aClass6_Sub21_1.anInt7338 = arg2 * 72 + 6;
			@Pc(51) int local51 = this.aClass6_Sub21_1.method6036();
			@Pc(56) int local56 = this.aClass6_Sub21_1.method6036();
			@Pc(59) byte[] local59 = new byte[64];
			this.aClass6_Sub21_1.method6053(64, local59);
			@Pc(81) Class160_Sub1 local81 = new Class160_Sub1(arg2, arg1, arg0, this.aClass163_1, this.aClass55_1, local51, local59, local56, true);
			this.aClass160_Sub1Array1[arg2] = local81;
			return local81;
		} else {
			return this.aClass160_Sub1Array1[arg2];
		}
	}
}
