import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class5_Sub1_Sub1 extends Class5_Sub1 implements Interface8 {

	@OriginalMember(owner = "client!ae", name = "D", descriptor = "B")
	private final byte aByte1;

	@OriginalMember(owner = "client!ae", name = "S", descriptor = "B")
	private final byte aByte3;

	@OriginalMember(owner = "client!ae", name = "J", descriptor = "Z")
	private boolean aBoolean19;

	@OriginalMember(owner = "client!ae", name = "w", descriptor = "S")
	private final short aShort1;

	@OriginalMember(owner = "client!ae", name = "K", descriptor = "B")
	private final byte aByte2;

	@OriginalMember(owner = "client!ae", name = "B", descriptor = "Z")
	private final boolean aBoolean18;

	@OriginalMember(owner = "client!ae", name = "N", descriptor = "Z")
	private final boolean aBoolean20;

	@OriginalMember(owner = "client!ae", name = "z", descriptor = "Z")
	private final boolean aBoolean17;

	@OriginalMember(owner = "client!ae", name = "R", descriptor = "Lclient!ek;")
	private Class1_Sub1_Sub8 aClass1_Sub1_Sub8_1;

	@OriginalMember(owner = "client!ae", name = "C", descriptor = "Lclient!hc;")
	public Class78 aClass78_1;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lclient!aa;Lclient!sk;IIIIZIIZ)V")
	public Class5_Sub1_Sub1(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class188 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static325.method4284(arg7, arg8));
		this.aByte1 = (byte) arg7;
		super.anInt5961 = (short) arg5;
		this.aByte3 = (byte) arg2;
		this.aBoolean19 = arg9;
		this.aShort1 = (short) arg1.anInt5535;
		this.aByte2 = (byte) arg8;
		super.anInt5954 = (short) arg3;
		this.aBoolean18 = arg6;
		this.aBoolean20 = arg1.anInt5546 != 0 && !arg6;
		this.aBoolean17 = arg0.method3268() && arg1.aBoolean476 && !this.aBoolean18 && Static158.anInt3147 != 0;
		@Pc(67) int local67 = 1024;
		if (this.aBoolean19) {
			local67 |= 0x8000;
		}
		@Pc(82) Class212 local82 = this.method241(local67, arg0, this.aBoolean17);
		if (local82 != null) {
			this.aClass1_Sub1_Sub8_1 = local82.aClass1_Sub1_Sub8_5;
			this.aClass78_1 = local82.aClass78_6;
			if (this.aBoolean19) {
				this.aClass78_1 = this.aClass78_1.method4394((byte) 0, local67, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)I")
	@Override
	public int method5697() {
		return this.aShort1 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILclient!aa;B)Lclient!hc;")
	private Class78 method238(@OriginalArg(0) int arg0, @OriginalArg(1) Class2 arg1) {
		if (this.aClass78_1 != null && arg1.method3247(this.aClass78_1.method4398(), arg0) == 0) {
			return this.aClass78_1;
		} else {
			@Pc(28) Class212 local28 = this.method241(arg0, arg1, false);
			return local28 == null ? null : local28.aClass78_6;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!aa;Z)V")
	@Override
	public void method5686(@OriginalArg(0) Class2 arg0) {
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5700() {
		return this.aBoolean17;
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)I")
	@Override
	public int method5701() {
		return this.aByte2;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)I")
	@Override
	public int method5699() {
		return this.aByte1;
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(B)V")
	@Override
	public void method5678() {
		this.aBoolean19 = false;
		if (this.aClass78_1 != null) {
			this.aClass78_1.method4373(this.aClass78_1.method4398() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5681() {
		return this.aBoolean19;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V")
	@Override
	public void method5698() {
		if (this.aClass78_1 != null) {
			this.aClass78_1.method4359();
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IILclient!aa;Z)Lclient!vn;")
	private Class212 method241(@OriginalArg(1) int arg0, @OriginalArg(2) Class2 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(12) Class188 local12 = Static126.method2405(this.aShort1 & 0xFFFF);
		@Pc(24) Class41 local24;
		@Pc(19) Class41 local19;
		if (this.aBoolean18) {
			local19 = Static288.aClass41Array5[0];
			local24 = Static236.aClass41Array4[this.aByte3];
		} else {
			local24 = Static288.aClass41Array5[this.aByte3];
			if (this.aByte3 < 3) {
				local19 = Static288.aClass41Array5[this.aByte3 + 1];
			} else {
				local19 = null;
			}
		}
		return local12.method4904(super.anInt5963, local24, this.aByte1, arg1, this.aByte2, local19, super.anInt5954, super.anInt5961, arg2, arg0);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZIILclient!aa;ILclient!qh;)V")
	@Override
	public void method5677(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class5 arg5) {
		if (arg5 instanceof Class5_Sub1_Sub1) {
			@Pc(28) Class5_Sub1_Sub1 local28 = (Class5_Sub1_Sub1) arg5;
			if (this.aClass78_1 != null && local28.aClass78_1 != null) {
				this.aClass78_1.method4400(local28.aClass78_1, arg2, arg4, arg1, arg0);
			}
		} else if (arg5 instanceof Class5_Sub3_Sub2) {
			@Pc(8) Class5_Sub3_Sub2 local8 = (Class5_Sub3_Sub2) arg5;
			if (this.aClass78_1 != null && local8.aClass78_4 != null) {
				this.aClass78_1.method4400(local8.aClass78_4, arg2, arg4, arg1, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(Lclient!aa;B)V")
	@Override
	public void method5696(@OriginalArg(0) Class2 arg0) {
		@Pc(27) Class1_Sub1_Sub8 local27;
		if (this.aClass1_Sub1_Sub8_1 == null && this.aBoolean17) {
			@Pc(20) Class212 local20 = this.method241(131072, arg0, true);
			local27 = local20 == null ? null : local20.aClass1_Sub1_Sub8_5;
		} else {
			local27 = this.aClass1_Sub1_Sub8_1;
			this.aClass1_Sub1_Sub8_1 = null;
		}
		if (local27 != null) {
			Static120.method2164(local27, this.aByte3, super.anInt5954, super.anInt5961, null);
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!aa;IB)Lclient!hc;")
	@Override
	public Class78 method5695(@OriginalArg(0) Class2 arg0, @OriginalArg(1) int arg1) {
		return this.method238(arg1, arg0);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIILclient!aa;)Z")
	@Override
	public boolean method5684(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2 arg2) {
		@Pc(13) Class78 local13 = this.method238(65536, arg2);
		if (local13 == null) {
			return false;
		} else {
			@Pc(18) Class21 local18 = arg2.method3284();
			local18.method2814(super.anInt5954, super.anInt5963, super.anInt5961);
			return local13.method4381(arg0, arg1, local18, false);
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!aa;B)V")
	@Override
	public void method5694(@OriginalArg(0) Class2 arg0) {
		@Pc(14) Class1_Sub1_Sub8 local14;
		if (this.aClass1_Sub1_Sub8_1 == null && this.aBoolean17) {
			@Pc(25) Class212 local25 = this.method241(131072, arg0, true);
			local14 = local25 == null ? null : local25.aClass1_Sub1_Sub8_5;
		} else {
			local14 = this.aClass1_Sub1_Sub8_1;
			this.aClass1_Sub1_Sub8_1 = null;
		}
		if (local14 != null) {
			Static151.method3583(local14, this.aByte3, super.anInt5954, super.anInt5961, null);
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!aa;I)Lclient!cn;")
	@Override
	public Class15_Sub3 method5680(@OriginalArg(0) Class2 arg0) {
		if (this.aClass78_1 == null) {
			return null;
		}
		@Pc(16) Class21 local16 = arg0.method3284();
		local16.method2814(super.anInt5954, super.anInt5963, super.anInt5961);
		@Pc(26) Class15_Sub3 local26 = null;
		if (this.aBoolean20) {
			local26 = Static186.method3613(1);
		}
		this.aClass78_1.method4379(local16, local26 == null ? null : local26.aClass15_Sub2Array1[0], 0);
		return local26;
	}
}
