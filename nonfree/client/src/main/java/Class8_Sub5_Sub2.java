import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public final class Class8_Sub5_Sub2 extends Class8_Sub5 implements Interface4 {

	@OriginalMember(owner = "client!np", name = "P", descriptor = "Z")
	private final boolean aBoolean330;

	@OriginalMember(owner = "client!np", name = "F", descriptor = "B")
	private final byte aByte74;

	@OriginalMember(owner = "client!np", name = "I", descriptor = "Z")
	private final boolean aBoolean329;

	@OriginalMember(owner = "client!np", name = "O", descriptor = "B")
	private final byte aByte75;

	@OriginalMember(owner = "client!np", name = "W", descriptor = "S")
	private final short aShort67;

	@OriginalMember(owner = "client!np", name = "B", descriptor = "B")
	private final byte aByte73;

	@OriginalMember(owner = "client!np", name = "T", descriptor = "Z")
	private final boolean aBoolean331;

	@OriginalMember(owner = "client!np", name = "U", descriptor = "Lclient!t;")
	private Class116 aClass116_5;

	@OriginalMember(owner = "client!np", name = "M", descriptor = "Lclient!ba;")
	private Class4_Sub2_Sub3 aClass4_Sub2_Sub3_5;

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Lclient!ya;Lclient!ho;IIIIZIIIII)V")
	public Class8_Sub5_Sub2(@OriginalArg(0) Class135 arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static411.method5579(arg10, arg11));
		this.aBoolean330 = arg6;
		this.aByte74 = (byte) arg2;
		this.aBoolean329 = arg1.anInt2871 != 0 && !arg6;
		this.aByte75 = (byte) arg11;
		super.anInt5128 = arg3;
		this.aShort67 = (short) arg1.anInt2875;
		this.aByte73 = (byte) arg10;
		super.anInt5133 = arg5;
		this.aBoolean331 = arg0.method5337() && arg1.aBoolean216 && !this.aBoolean330 && Static413.aClass49_Sub1_1.method2478(Static341.anInt5549) != 0;
		@Pc(77) Class55 local77 = this.method3568(2048, this.aBoolean331, arg0);
		if (local77 != null) {
			this.aClass116_5 = local77.aClass116_4;
			this.aClass4_Sub2_Sub3_5 = local77.aClass4_Sub2_Sub3_4;
		}
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(IILclient!ya;)Lclient!t;")
	private Class116 method3565(@OriginalArg(0) int arg0, @OriginalArg(2) Class135 arg1) {
		if (this.aClass116_5 != null && arg1.method5356(this.aClass116_5.P(), arg0) == 0) {
			return this.aClass116_5;
		} else {
			@Pc(29) Class55 local29 = this.method3568(arg0, false, arg1);
			return local29 == null ? null : local29.aClass116_4;
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5877(@OriginalArg(0) Class135 arg0) {
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(I)I")
	@Override
	public int method5603() {
		return this.aShort67 & 0xFFFF;
	}

	@OriginalMember(owner = "client!np", name = "d", descriptor = "(I)V")
	@Override
	public void method5607() {
		if (this.aClass116_5 != null) {
			this.aClass116_5.method3105();
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Z)I")
	@Override
	public int method5600() {
		return this.aByte75;
	}

	@OriginalMember(owner = "client!np", name = "c", descriptor = "(Z)I")
	@Override
	public int method4114() {
		return this.aClass116_5 == null ? 0 : this.aClass116_5.MA();
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5602() {
		return this.aBoolean331;
	}

	@OriginalMember(owner = "client!np", name = "c", descriptor = "(I)I")
	@Override
	public int method5606() {
		return this.aByte73;
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5605(@OriginalArg(1) Class135 arg0) {
		@Pc(14) Class4_Sub2_Sub3 local14;
		if (this.aClass4_Sub2_Sub3_5 == null && this.aBoolean331) {
			@Pc(25) Class55 local25 = this.method3568(262144, true, arg0);
			local14 = local25 == null ? null : local25.aClass4_Sub2_Sub3_4;
		} else {
			local14 = this.aClass4_Sub2_Sub3_5;
			this.aClass4_Sub2_Sub3_5 = null;
		}
		if (local14 != null) {
			Static323.method4972(local14, this.aByte74, super.anInt5128, super.anInt5133, null);
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IILclient!ya;)Lclient!t;")
	@Override
	public Class116 method5604(@OriginalArg(0) int arg0, @OriginalArg(2) Class135 arg1) {
		return this.method3565(arg0, arg1);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ZLclient!ya;)Lclient!lo;")
	@Override
	public Class20_Sub5 method5880(@OriginalArg(1) Class135 arg0) {
		if (this.aClass116_5 == null) {
			return null;
		}
		@Pc(11) Class35 local11 = arg0.method5398();
		local11.j(super.anInt5129 + super.anInt5128, super.anInt5123, super.anInt5130 + super.anInt5133);
		@Pc(27) Class20_Sub5 local27 = null;
		if (this.aBoolean329) {
			local27 = Static371.method4760(1);
		}
		this.aClass116_5.method3117(local11, local27 == null ? null : local27.aClass20_Sub8Array1[0], 0);
		return local27;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ILclient!ya;II)Z")
	@Override
	public boolean method5878(@OriginalArg(1) Class135 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class116 local9 = this.method3565(131072, arg0);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class35 local14 = arg0.method5398();
			local14.j(super.anInt5128, super.anInt5123, super.anInt5133);
			return local9.method3107(arg1, arg2, local14, false);
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5601(@OriginalArg(1) Class135 arg0) {
		@Pc(20) Class4_Sub2_Sub3 local20;
		if (this.aClass4_Sub2_Sub3_5 == null && this.aBoolean331) {
			@Pc(31) Class55 local31 = this.method3568(262144, true, arg0);
			local20 = local31 == null ? null : local31.aClass4_Sub2_Sub3_4;
		} else {
			local20 = this.aClass4_Sub2_Sub3_5;
			this.aClass4_Sub2_Sub3_5 = null;
		}
		if (local20 != null) {
			Static432.method5741(local20, this.aByte74, super.anInt5128, super.anInt5133, null);
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(BIZLclient!ya;)Lclient!dp;")
	private Class55 method3568(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class135 arg2) {
		@Pc(18) Class114 local18 = Static51.aClass151_1.method2917(this.aShort67 & 0xFFFF);
		@Pc(30) Class41 local30;
		@Pc(25) Class41 local25;
		if (this.aBoolean330) {
			local25 = Static228.aClass41Array2[0];
			local30 = Static169.aClass41Array1[this.aByte74];
		} else {
			local30 = Static228.aClass41Array2[this.aByte74];
			if (this.aByte74 >= 3) {
				local25 = null;
			} else {
				local25 = Static228.aClass41Array2[this.aByte74 + 1];
			}
		}
		return local18.method2190(super.anInt5128, super.anInt5123, arg1, local25, this.aByte73, arg2, arg0, local30, super.anInt5133, this.aByte75);
	}
}
