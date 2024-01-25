import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class109 {

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "[Lclient!o;")
	private Class240_Sub1[] aClass240_Sub1Array1;

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "Lclient!ek;")
	private Class4_Sub13 aClass4_Sub13_4;

	@OriginalMember(owner = "client!fk", name = "k", descriptor = "Lclient!dga;")
	private final Class72 aClass72_1;

	@OriginalMember(owner = "client!fk", name = "p", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger2;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger1;

	@OriginalMember(owner = "client!fk", name = "h", descriptor = "Lclient!ms;")
	private final Class225 aClass225_1;

	@OriginalMember(owner = "client!fk", name = "m", descriptor = "Lclient!ew;")
	private Class4_Sub6_Sub6_Sub1 aClass4_Sub6_Sub6_Sub1_2;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lclient!dga;Lclient!ms;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class109(@OriginalArg(0) Class72 arg0, @OriginalArg(1) Class225 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aClass72_1 = arg0;
		this.aBigInteger2 = arg3;
		this.aBigInteger1 = arg2;
		this.aClass225_1 = arg1;
		if (!this.aClass72_1.method1865()) {
			this.aClass4_Sub6_Sub6_Sub1_2 = this.aClass72_1.method1851(255, (byte) 0, 255, true);
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)Z")
	public boolean method2508() {
		if (this.aClass4_Sub13_4 != null) {
			return true;
		}
		if (this.aClass4_Sub6_Sub6_Sub1_2 == null) {
			if (this.aClass72_1.method1865()) {
				return false;
			}
			this.aClass4_Sub6_Sub6_Sub1_2 = this.aClass72_1.method1851(255, (byte) 0, 255, true);
		}
		if (this.aClass4_Sub6_Sub6_Sub1_2.aBoolean619) {
			return false;
		}
		@Pc(44) Class4_Sub13 local44 = new Class4_Sub13(this.aClass4_Sub6_Sub6_Sub1_2.method6777());
		local44.anInt9170 = 5;
		@Pc(51) int local51 = local44.method7004();
		local44.anInt9170 += local51 * 72;
		@Pc(68) byte[] local68 = new byte[local44.aByteArray88.length - local44.anInt9170];
		local44.method7049(local68, local68.length);
		@Pc(83) byte[] local83;
		if (this.aBigInteger1 == null || this.aBigInteger2 == null) {
			local83 = local68;
		} else {
			@Pc(90) BigInteger local90 = new BigInteger(local68);
			@Pc(97) BigInteger local97 = local90.modPow(this.aBigInteger1, this.aBigInteger2);
			local83 = local97.toByteArray();
		}
		if (local83.length != 65) {
			throw new RuntimeException();
		}
		@Pc(130) byte[] local130 = Static236.method3843(local44.anInt9170 - local68.length - 5, local44.aByteArray88, 5);
		for (@Pc(132) int local132 = 0; local132 < 64; local132++) {
			if (local83[local132 + 1] != local130[local132]) {
				throw new RuntimeException();
			}
		}
		this.aClass4_Sub13_4 = local44;
		this.aClass240_Sub1Array1 = new Class240_Sub1[local51];
		return true;
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V")
	public void method2510() {
		if (this.aClass240_Sub1Array1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass240_Sub1Array1.length; local11++) {
			if (this.aClass240_Sub1Array1[local11] != null) {
				this.aClass240_Sub1Array1[local11].method5497();
			}
		}
		for (@Pc(39) int local39 = 0; local39 < this.aClass240_Sub1Array1.length; local39++) {
			if (this.aClass240_Sub1Array1[local39] != null) {
				this.aClass240_Sub1Array1[local39].method5496();
			}
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IILclient!vm;Lclient!vm;)Lclient!o;")
	public Class240_Sub1 method2511(@OriginalArg(0) int arg0, @OriginalArg(2) Class346 arg1, @OriginalArg(3) Class346 arg2) {
		return this.method2513(arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZLclient!vm;Lclient!vm;IB)Lclient!o;")
	private Class240_Sub1 method2513(@OriginalArg(1) Class346 arg0, @OriginalArg(2) Class346 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass4_Sub13_4 == null) {
			throw new RuntimeException();
		} else if (arg2 < 0 || this.aClass240_Sub1Array1.length <= arg2) {
			throw new RuntimeException();
		} else if (this.aClass240_Sub1Array1[arg2] == null) {
			this.aClass4_Sub13_4.anInt9170 = arg2 * 72 + 6;
			@Pc(48) int local48 = this.aClass4_Sub13_4.method6990();
			@Pc(53) int local53 = this.aClass4_Sub13_4.method6990();
			@Pc(56) byte[] local56 = new byte[64];
			this.aClass4_Sub13_4.method7049(local56, 64);
			@Pc(80) Class240_Sub1 local80 = new Class240_Sub1(arg2, arg1, arg0, this.aClass72_1, this.aClass225_1, local48, local56, local53, true);
			this.aClass240_Sub1Array1[arg2] = local80;
			return local80;
		} else {
			return this.aClass240_Sub1Array1[arg2];
		}
	}
}
