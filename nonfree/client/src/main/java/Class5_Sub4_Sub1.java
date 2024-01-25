import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class5_Sub4_Sub1 extends Class5_Sub4 implements Interface8 {

	@OriginalMember(owner = "client!ga", name = "E", descriptor = "B")
	private final byte aByte18;

	@OriginalMember(owner = "client!ga", name = "J", descriptor = "Z")
	private final boolean aBoolean177;

	@OriginalMember(owner = "client!ga", name = "F", descriptor = "Z")
	private final boolean aBoolean176;

	@OriginalMember(owner = "client!ga", name = "N", descriptor = "S")
	private final short aShort20;

	@OriginalMember(owner = "client!ga", name = "H", descriptor = "B")
	private final byte aByte19;

	@OriginalMember(owner = "client!ga", name = "A", descriptor = "B")
	private final byte aByte17;

	@OriginalMember(owner = "client!ga", name = "x", descriptor = "Z")
	private final boolean aBoolean175;

	@OriginalMember(owner = "client!ga", name = "G", descriptor = "Lclient!hc;")
	private Class78 aClass78_3;

	@OriginalMember(owner = "client!ga", name = "z", descriptor = "Lclient!ek;")
	private Class1_Sub1_Sub8 aClass1_Sub1_Sub8_2;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lclient!aa;Lclient!sk;IIIIZIIIII)V")
	public Class5_Sub4_Sub1(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class188 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static233.method4196(arg10, arg11));
		this.aByte18 = (byte) arg11;
		super.anInt3172 = (short) arg3;
		this.aBoolean177 = arg6;
		this.aBoolean176 = arg1.anInt5546 != 0 && !arg6;
		super.anInt3176 = (short) arg5;
		this.aShort20 = (short) arg1.anInt5535;
		this.aByte19 = (byte) arg10;
		this.aByte17 = (byte) arg2;
		this.aBoolean175 = arg0.method3268() && arg1.aBoolean476 && !this.aBoolean177 && Static158.anInt3147 != 0;
		@Pc(79) Class212 local79 = this.method1906(this.aBoolean175, 1024, arg0);
		if (local79 != null) {
			this.aClass78_3 = local79.aClass78_6;
			this.aClass1_Sub1_Sub8_2 = local79.aClass1_Sub1_Sub8_5;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!aa;I)Lclient!cn;")
	@Override
	public Class15_Sub3 method5680(@OriginalArg(0) Class2 arg0) {
		if (this.aClass78_3 == null) {
			return null;
		}
		@Pc(17) Class21 local17 = arg0.method3284();
		local17.method2814(super.anInt3172 + super.anInt3174, super.anInt3179, super.anInt3176 + super.anInt3173);
		@Pc(34) Class15_Sub3 local34 = null;
		if (this.aBoolean176) {
			local34 = Static186.method3613(1);
		}
		this.aClass78_3.method4379(local17, local34 == null ? null : local34.aClass15_Sub2Array1[0], 0);
		return local34;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)I")
	@Override
	public int method5699() {
		return this.aByte19;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIILclient!aa;)Z")
	@Override
	public boolean method5684(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2 arg2) {
		@Pc(9) Class78 local9 = this.method1904(arg2, 65536);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class21 local14 = arg2.method3284();
			local14.method2814(super.anInt3172, super.anInt3179, super.anInt3176);
			return local9.method4381(arg0, arg1, local14, false);
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(Lclient!aa;B)V")
	@Override
	public void method5696(@OriginalArg(0) Class2 arg0) {
		@Pc(25) Class1_Sub1_Sub8 local25;
		if (this.aClass1_Sub1_Sub8_2 == null && this.aBoolean175) {
			@Pc(18) Class212 local18 = this.method1906(true, 131072, arg0);
			local25 = local18 == null ? null : local18.aClass1_Sub1_Sub8_5;
		} else {
			local25 = this.aClass1_Sub1_Sub8_2;
			this.aClass1_Sub1_Sub8_2 = null;
		}
		if (local25 != null) {
			Static120.method2164(local25, this.aByte17, super.anInt3172, super.anInt3176, null);
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)I")
	@Override
	public int method5697() {
		return this.aShort20 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILclient!aa;I)Lclient!hc;")
	private Class78 method1904(@OriginalArg(1) Class2 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass78_3 != null && arg0.method3247(this.aClass78_3.method4398(), arg1) == 0) {
			return this.aClass78_3;
		} else {
			@Pc(27) Class212 local27 = this.method1906(false, arg1, arg0);
			return local27 == null ? null : local27.aClass78_6;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!aa;Z)V")
	@Override
	public void method5686(@OriginalArg(0) Class2 arg0) {
	}

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "(B)I")
	@Override
	public int method3009() {
		return this.aClass78_3 == null ? 0 : this.aClass78_3.method4388();
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!aa;IB)Lclient!hc;")
	@Override
	public Class78 method5695(@OriginalArg(0) Class2 arg0, @OriginalArg(1) int arg1) {
		return this.method1904(arg0, arg1);
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)I")
	@Override
	public int method5701() {
		return this.aByte18;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZILclient!aa;Z)Lclient!vn;")
	private Class212 method1906(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2 arg2) {
		@Pc(12) Class188 local12 = Static126.method2405(this.aShort20 & 0xFFFF);
		@Pc(29) Class41 local29;
		@Pc(24) Class41 local24;
		if (this.aBoolean177) {
			local24 = Static288.aClass41Array5[0];
			local29 = Static236.aClass41Array4[this.aByte17];
		} else {
			local29 = Static288.aClass41Array5[this.aByte17];
			if (this.aByte17 >= 3) {
				local24 = null;
			} else {
				local24 = Static288.aClass41Array5[this.aByte17 + 1];
			}
		}
		return local12.method4904(super.anInt3179, local29, this.aByte19, arg2, this.aByte18, local24, super.anInt3172, super.anInt3176, arg0, arg1);
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V")
	@Override
	public void method5698() {
		if (this.aClass78_3 != null) {
			this.aClass78_3.method4359();
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5700() {
		return this.aBoolean175;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!aa;B)V")
	@Override
	public void method5694(@OriginalArg(0) Class2 arg0) {
		@Pc(31) Class1_Sub1_Sub8 local31;
		if (this.aClass1_Sub1_Sub8_2 == null && this.aBoolean175) {
			@Pc(24) Class212 local24 = this.method1906(true, 131072, arg0);
			local31 = local24 == null ? null : local24.aClass1_Sub1_Sub8_5;
		} else {
			local31 = this.aClass1_Sub1_Sub8_2;
			this.aClass1_Sub1_Sub8_2 = null;
		}
		if (local31 != null) {
			Static151.method3583(local31, this.aByte17, super.anInt3172, super.anInt3176, null);
		}
	}
}
