import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class16_Sub5_Sub2 extends Class16_Sub5 implements Interface6 {

	@OriginalMember(owner = "client!rj", name = "L", descriptor = "S")
	private final short aShort74;

	@OriginalMember(owner = "client!rj", name = "U", descriptor = "Z")
	private final boolean aBoolean550;

	@OriginalMember(owner = "client!rj", name = "W", descriptor = "B")
	private final byte aByte65;

	@OriginalMember(owner = "client!rj", name = "q", descriptor = "Z")
	private boolean aBoolean546;

	@OriginalMember(owner = "client!rj", name = "r", descriptor = "B")
	private final byte aByte63;

	@OriginalMember(owner = "client!rj", name = "v", descriptor = "Z")
	private final boolean aBoolean547;

	@OriginalMember(owner = "client!rj", name = "u", descriptor = "B")
	private final byte aByte64;

	@OriginalMember(owner = "client!rj", name = "H", descriptor = "Z")
	private final boolean aBoolean548;

	@OriginalMember(owner = "client!rj", name = "Q", descriptor = "Lclient!ba;")
	private Class4_Sub1_Sub4 aClass4_Sub1_Sub4_5;

	@OriginalMember(owner = "client!rj", name = "D", descriptor = "Lclient!t;")
	public Class110 aClass110_6;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lclient!ya;Lclient!rd;IIIIZIIZ)V")
	public Class16_Sub5_Sub2(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class202 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static244.method2570(arg7, arg8));
		this.aShort74 = (short) arg1.anInt5823;
		super.anInt6550 = arg3;
		this.aBoolean550 = arg1.anInt5813 != 0 && !arg6;
		this.aByte65 = (byte) arg2;
		this.aBoolean546 = arg9;
		this.aByte63 = (byte) arg8;
		super.anInt6552 = arg5;
		this.aBoolean547 = arg6;
		this.aByte64 = (byte) arg7;
		this.aBoolean548 = arg0.method4242() && arg1.aBoolean526 && !this.aBoolean547 && Static323.aClass50_Sub1_1.method2850(Static177.anInt2973) != 0;
		@Pc(68) int local68 = 2048;
		if (this.aBoolean546) {
			local68 |= 0x10000;
		}
		@Pc(83) Class149 local83 = this.method4653(local68, arg0, this.aBoolean548);
		if (local83 != null) {
			this.aClass4_Sub1_Sub4_5 = local83.aClass4_Sub1_Sub4_4;
			this.aClass110_6 = local83.aClass110_5;
			if (this.aBoolean546) {
				this.aClass110_6 = this.aClass110_6.method4887((byte) 0, local68, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5348(@OriginalArg(0) Class19 arg0) {
		@Pc(21) Class4_Sub1_Sub4 local21;
		if (this.aClass4_Sub1_Sub4_5 == null && this.aBoolean548) {
			@Pc(34) Class149 local34 = this.method4653(262144, arg0, true);
			local21 = local34 == null ? null : local34.aClass4_Sub1_Sub4_4;
		} else {
			local21 = this.aClass4_Sub1_Sub4_5;
			this.aClass4_Sub1_Sub4_5 = null;
		}
		if (local21 != null) {
			Static52.method844(local21, this.aByte65, super.anInt6550, super.anInt6552, null);
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IILclient!ya;Z)Lclient!mg;")
	private Class149 method4653(@OriginalArg(1) int arg0, @OriginalArg(2) Class19 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class202 local13 = Static267.aClass262_2.method5560(this.aShort74 & 0xFFFF);
		@Pc(44) Class65 local44;
		@Pc(30) Class65 local30;
		if (this.aBoolean547) {
			local30 = Static67.aClass65Array1[0];
			local44 = Static285.aClass65Array3[this.aByte65];
		} else {
			if (this.aByte65 >= 3) {
				local30 = null;
			} else {
				local30 = Static67.aClass65Array1[this.aByte65 + 1];
			}
			local44 = Static67.aClass65Array1[this.aByte65];
		}
		return local13.method4589(arg1, super.anInt6550, arg0, super.anInt6554, arg2, this.aByte63, local30, super.anInt6552, this.aByte64, local44);
	}

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5338() {
		return this.aBoolean546;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)I")
	@Override
	public int method5347() {
		return this.aByte63;
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5335(@OriginalArg(0) Class19 arg0) {
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!ya;II)Lclient!t;")
	@Override
	public Class110 method5352(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		return this.method4657(arg1, arg0);
	}

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "(I)V")
	@Override
	public void method5333() {
		this.aBoolean546 = false;
		if (this.aClass110_6 != null) {
			this.aClass110_6.UA(this.aClass110_6.P() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IILclient!fi;BZLclient!ya;I)V")
	@Override
	public void method5337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class19 arg4, @OriginalArg(6) int arg5) {
		if (arg2 instanceof Class16_Sub5_Sub2) {
			@Pc(5) Class16_Sub5_Sub2 local5 = (Class16_Sub5_Sub2) arg2;
			if (this.aClass110_6 != null && local5.aClass110_6 != null) {
				this.aClass110_6.method4891(local5.aClass110_6, arg1, arg5, arg0, arg3);
			}
		} else if (arg2 instanceof Class16_Sub1_Sub6) {
			@Pc(28) Class16_Sub1_Sub6 local28 = (Class16_Sub1_Sub6) arg2;
			if (this.aClass110_6 != null && local28.aClass110_7 != null) {
				this.aClass110_6.method4891(local28.aClass110_7, arg1, arg5, arg0, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)I")
	@Override
	public int method5350() {
		return this.aShort74 & 0xFFFF;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(BILclient!ya;)Lclient!t;")
	private Class110 method4657(@OriginalArg(1) int arg0, @OriginalArg(2) Class19 arg1) {
		if (this.aClass110_6 != null && arg1.method4269(this.aClass110_6.P(), arg0) == 0) {
			return this.aClass110_6;
		} else {
			@Pc(33) Class149 local33 = this.method4653(arg0, arg1, false);
			return local33 == null ? null : local33.aClass110_5;
		}
	}

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "(Lclient!ya;I)Lclient!fk;")
	@Override
	public Class3_Sub3 method5339(@OriginalArg(0) Class19 arg0) {
		if (this.aClass110_6 == null) {
			return null;
		}
		@Pc(11) Class31 local11 = arg0.method4289();
		local11.j(super.anInt6550, super.anInt6554, super.anInt6552);
		@Pc(26) Class3_Sub3 local26 = null;
		if (this.aBoolean550) {
			local26 = Static38.method672(1);
		}
		this.aClass110_6.method4889(local11, local26 == null ? null : local26.aClass3_Sub5Array1[0], 0);
		return local26;
	}

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "(I)I")
	@Override
	public int method5354() {
		return this.aByte64;
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)V")
	@Override
	public void method5353() {
		if (this.aClass110_6 != null) {
			this.aClass110_6.method4886();
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IILclient!ya;I)Z")
	@Override
	public boolean method5341(@OriginalArg(0) int arg0, @OriginalArg(2) Class19 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class110 local13 = this.method4657(131072, arg1);
		if (local13 == null) {
			return false;
		} else {
			@Pc(18) Class31 local18 = arg1.method4289();
			local18.j(super.anInt6550, super.anInt6554, super.anInt6552);
			return local13.method4894(arg2, arg0, local18, false);
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5351() {
		return this.aBoolean548;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZLclient!ya;)V")
	@Override
	public void method5349(@OriginalArg(1) Class19 arg0) {
		@Pc(14) Class4_Sub1_Sub4 local14;
		if (this.aClass4_Sub1_Sub4_5 == null && this.aBoolean548) {
			@Pc(25) Class149 local25 = this.method4653(262144, arg0, true);
			local14 = local25 == null ? null : local25.aClass4_Sub1_Sub4_4;
		} else {
			local14 = this.aClass4_Sub1_Sub4_5;
			this.aClass4_Sub1_Sub4_5 = null;
		}
		if (local14 != null) {
			Static110.method2015(local14, this.aByte65, super.anInt6550, super.anInt6552, null);
		}
	}
}
