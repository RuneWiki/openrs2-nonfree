import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ar")
public final class Class8_Sub2_Sub1 extends Class8_Sub2 implements Interface4 {

	@OriginalMember(owner = "client!ar", name = "G", descriptor = "Z")
	private boolean aBoolean15;

	@OriginalMember(owner = "client!ar", name = "P", descriptor = "S")
	private final short aShort1;

	@OriginalMember(owner = "client!ar", name = "M", descriptor = "Z")
	private final boolean aBoolean16;

	@OriginalMember(owner = "client!ar", name = "s", descriptor = "B")
	private final byte aByte1;

	@OriginalMember(owner = "client!ar", name = "S", descriptor = "Z")
	private final boolean aBoolean17;

	@OriginalMember(owner = "client!ar", name = "Q", descriptor = "B")
	private final byte aByte3;

	@OriginalMember(owner = "client!ar", name = "z", descriptor = "B")
	private final byte aByte2;

	@OriginalMember(owner = "client!ar", name = "E", descriptor = "Z")
	private final boolean aBoolean14;

	@OriginalMember(owner = "client!ar", name = "x", descriptor = "Lclient!ba;")
	private Class4_Sub2_Sub3 aClass4_Sub2_Sub3_1;

	@OriginalMember(owner = "client!ar", name = "y", descriptor = "Lclient!t;")
	public Class116 aClass116_1;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lclient!ya;Lclient!ho;IIIIZIIZ)V")
	public Class8_Sub2_Sub1(@OriginalArg(0) Class135 arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static28.method5890(arg8, arg7));
		this.aBoolean15 = arg9;
		super.anInt5218 = arg5;
		this.aShort1 = (short) arg1.anInt2875;
		this.aBoolean16 = arg1.anInt2871 != 0 && !arg6;
		this.aByte1 = (byte) arg8;
		this.aBoolean17 = arg6;
		super.anInt5212 = arg3;
		this.aByte3 = (byte) arg7;
		this.aByte2 = (byte) arg2;
		this.aBoolean14 = arg0.method5337() && arg1.aBoolean216 && !this.aBoolean17 && Static413.aClass49_Sub1_1.method2478(Static341.anInt5549) != 0;
		@Pc(71) int local71 = 2048;
		if (this.aBoolean15) {
			local71 |= 0x10000;
		}
		@Pc(86) Class55 local86 = this.method268(arg0, this.aBoolean14, local71);
		if (local86 != null) {
			this.aClass4_Sub2_Sub3_1 = local86.aClass4_Sub2_Sub3_4;
			this.aClass116_1 = local86.aClass116_4;
			if (this.aBoolean15) {
				this.aClass116_1 = this.aClass116_1.method3123((byte) 0, local71, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "(I)I")
	@Override
	public int method5606() {
		return this.aByte3;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILclient!ya;II)Z")
	@Override
	public boolean method5878(@OriginalArg(1) Class135 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class116 local14 = this.method269(arg0, 131072);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class35 local19 = arg0.method5398();
			local19.j(super.anInt5212, super.anInt5213, super.anInt5218);
			return local14.method3107(arg1, arg2, local19, false);
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lclient!gg;IZIIILclient!ya;)V")
	@Override
	public void method5875(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class135 arg5) {
		if (arg0 instanceof Class8_Sub2_Sub1) {
			@Pc(39) Class8_Sub2_Sub1 local39 = (Class8_Sub2_Sub1) arg0;
			if (this.aClass116_1 == null || local39.aClass116_1 == null) {
				return;
			}
			this.aClass116_1.method3118(local39.aClass116_1, arg1, arg4, arg3, arg2);
		} else if (arg0 instanceof Class8_Sub3_Sub2) {
			@Pc(20) Class8_Sub3_Sub2 local20 = (Class8_Sub3_Sub2) arg0;
			if (this.aClass116_1 != null && local20.aClass116_2 != null) {
				this.aClass116_1.method3118(local20.aClass116_2, arg1, arg4, arg3, arg2);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Z)I")
	@Override
	public int method5600() {
		return this.aByte1;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IILclient!ya;)Lclient!t;")
	@Override
	public Class116 method5604(@OriginalArg(0) int arg0, @OriginalArg(2) Class135 arg1) {
		return this.method269(arg1, arg0);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ZLclient!ya;)Lclient!lo;")
	@Override
	public Class20_Sub5 method5880(@OriginalArg(1) Class135 arg0) {
		if (this.aClass116_1 == null) {
			return null;
		}
		@Pc(11) Class35 local11 = arg0.method5398();
		local11.j(super.anInt5212, super.anInt5213, super.anInt5218);
		@Pc(21) Class20_Sub5 local21 = null;
		if (this.aBoolean16) {
			local21 = Static371.method4760(1);
		}
		this.aClass116_1.method3117(local11, local21 == null ? null : local21.aClass20_Sub8Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lclient!ya;IZI)Lclient!dp;")
	private Class55 method268(@OriginalArg(0) Class135 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class114 local15 = Static51.aClass151_1.method2917(this.aShort1 & 0xFFFF);
		@Pc(33) Class41 local33;
		@Pc(28) Class41 local28;
		if (this.aBoolean17) {
			local28 = Static228.aClass41Array2[0];
			local33 = Static169.aClass41Array1[this.aByte2];
		} else {
			local33 = Static228.aClass41Array2[this.aByte2];
			if (this.aByte2 < 3) {
				local28 = Static228.aClass41Array2[this.aByte2 + 1];
			} else {
				local28 = null;
			}
		}
		return local15.method2190(super.anInt5212, super.anInt5213, arg1, local28, this.aByte3, arg0, arg2, local33, super.anInt5218, this.aByte1);
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)I")
	@Override
	public int method5603() {
		return this.aShort1 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lclient!ya;BI)Lclient!t;")
	private Class116 method269(@OriginalArg(0) Class135 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass116_1 != null && arg0.method5356(this.aClass116_1.P(), arg1) == 0) {
			return this.aClass116_1;
		} else {
			@Pc(31) Class55 local31 = this.method268(arg0, false, arg1);
			return local31 == null ? null : local31.aClass116_4;
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5873() {
		return this.aBoolean15;
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5605(@OriginalArg(1) Class135 arg0) {
		@Pc(30) Class4_Sub2_Sub3 local30;
		if (this.aClass4_Sub2_Sub3_1 == null && this.aBoolean14) {
			@Pc(23) Class55 local23 = this.method268(arg0, true, 262144);
			local30 = local23 == null ? null : local23.aClass4_Sub2_Sub3_4;
		} else {
			local30 = this.aClass4_Sub2_Sub3_1;
			this.aClass4_Sub2_Sub3_1 = null;
		}
		if (local30 != null) {
			Static323.method4972(local30, this.aByte2, super.anInt5212, super.anInt5218, null);
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5877(@OriginalArg(0) Class135 arg0) {
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5602() {
		return this.aBoolean14;
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(B)V")
	@Override
	public void method5879() {
		this.aBoolean15 = false;
		if (this.aClass116_1 != null) {
			this.aClass116_1.UA(this.aClass116_1.P() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ar", name = "d", descriptor = "(I)V")
	@Override
	public void method5607() {
		if (this.aClass116_1 != null) {
			this.aClass116_1.method3105();
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5601(@OriginalArg(1) Class135 arg0) {
		@Pc(27) Class4_Sub2_Sub3 local27;
		if (this.aClass4_Sub2_Sub3_1 == null && this.aBoolean14) {
			@Pc(20) Class55 local20 = this.method268(arg0, true, 262144);
			local27 = local20 == null ? null : local20.aClass4_Sub2_Sub3_4;
		} else {
			local27 = this.aClass4_Sub2_Sub3_1;
			this.aClass4_Sub2_Sub3_1 = null;
		}
		if (local27 != null) {
			Static432.method5741(local27, this.aByte2, super.anInt5212, super.anInt5218, null);
		}
	}
}
