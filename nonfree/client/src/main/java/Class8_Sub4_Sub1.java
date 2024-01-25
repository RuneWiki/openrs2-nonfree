import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class8_Sub4_Sub1 extends Class8_Sub4 implements Interface4 {

	@OriginalMember(owner = "client!de", name = "E", descriptor = "B")
	private final byte aByte21;

	@OriginalMember(owner = "client!de", name = "T", descriptor = "Z")
	private final boolean aBoolean74;

	@OriginalMember(owner = "client!de", name = "z", descriptor = "S")
	private final short aShort23;

	@OriginalMember(owner = "client!de", name = "C", descriptor = "Z")
	private final boolean aBoolean71;

	@OriginalMember(owner = "client!de", name = "I", descriptor = "Z")
	private boolean aBoolean72;

	@OriginalMember(owner = "client!de", name = "A", descriptor = "B")
	private final byte aByte20;

	@OriginalMember(owner = "client!de", name = "N", descriptor = "Z")
	private final boolean aBoolean73;

	@OriginalMember(owner = "client!de", name = "V", descriptor = "Lclient!ba;")
	private Class4_Sub2_Sub3 aClass4_Sub2_Sub3_3;

	@OriginalMember(owner = "client!de", name = "K", descriptor = "Lclient!t;")
	private Class116 aClass116_3;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lclient!ya;Lclient!ho;IIIIZIZ)V")
	public Class8_Sub4_Sub1(@OriginalArg(0) Class135 arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.aBoolean214, arg1.aBoolean215);
		super.anInt6834 = arg3;
		super.anInt6829 = arg5;
		this.aByte21 = (byte) arg2;
		this.aBoolean74 = arg1.anInt2871 != 0 && !arg6;
		this.aShort23 = (short) arg1.anInt2875;
		this.aBoolean71 = arg6;
		this.aBoolean72 = arg8;
		this.aByte20 = (byte) arg7;
		this.aBoolean73 = arg0.method5337() && arg1.aBoolean216 && !this.aBoolean71 && Static413.aClass49_Sub1_1.method2478(Static341.anInt5549) != 0;
		@Pc(67) int local67 = 2048;
		if (this.aBoolean72) {
			local67 |= 0x10000;
		}
		@Pc(82) Class55 local82 = this.method1125(this.aBoolean73, arg0, local67);
		if (local82 != null) {
			this.aClass4_Sub2_Sub3_3 = local82.aClass4_Sub2_Sub3_4;
			this.aClass116_3 = local82.aClass116_4;
			if (this.aBoolean72) {
				this.aClass116_3 = this.aClass116_3.method3123((byte) 0, local67, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5605(@OriginalArg(1) Class135 arg0) {
		@Pc(29) Class4_Sub2_Sub3 local29;
		if (this.aClass4_Sub2_Sub3_3 == null && this.aBoolean73) {
			@Pc(22) Class55 local22 = this.method1125(true, arg0, 262144);
			local29 = local22 == null ? null : local22.aClass4_Sub2_Sub3_4;
		} else {
			local29 = this.aClass4_Sub2_Sub3_3;
			this.aClass4_Sub2_Sub3_3 = null;
		}
		if (local29 != null) {
			Static323.method4972(local29, this.aByte21, super.anInt6834, super.anInt6829, null);
		}
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V")
	@Override
	public void method5607() {
		if (this.aClass116_3 != null) {
			this.aClass116_3.method3105();
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)I")
	@Override
	public int method5600() {
		return this.aByte20;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!ya;II)Z")
	@Override
	public boolean method5878(@OriginalArg(1) Class135 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class116 local15 = this.method1126(131072, arg0);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class35 local20 = arg0.method5398();
			local20.j(super.anInt6834, super.anInt6831, super.anInt6829);
			return local15.method3107(arg1, arg2, local20, false);
		}
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(B)V")
	@Override
	public void method5879() {
		this.aBoolean72 = false;
		if (this.aClass116_3 != null) {
			this.aClass116_3.UA(this.aClass116_3.P() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5602() {
		return this.aBoolean73;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5877(@OriginalArg(0) Class135 arg0) {
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5873() {
		return this.aBoolean72;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ZLclient!ya;)Lclient!lo;")
	@Override
	public Class20_Sub5 method5880(@OriginalArg(1) Class135 arg0) {
		if (this.aClass116_3 == null) {
			return null;
		}
		@Pc(11) Class35 local11 = arg0.method5398();
		local11.j(super.anInt6834, super.anInt6831, super.anInt6829);
		@Pc(26) Class20_Sub5 local26 = null;
		if (this.aBoolean74) {
			local26 = Static371.method4760(1);
		}
		this.aClass116_3.method3117(local11, local26 == null ? null : local26.aClass20_Sub8Array1[0], 0);
		return local26;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!gg;IZIIILclient!ya;)V")
	@Override
	public void method5875(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class135 arg5) {
		if (!(arg0 instanceof Class8_Sub4_Sub1)) {
			return;
		}
		@Pc(17) Class8_Sub4_Sub1 local17 = (Class8_Sub4_Sub1) arg0;
		if (this.aClass116_3 != null && local17.aClass116_3 != null) {
			this.aClass116_3.method3118(local17.aClass116_3, arg1, arg4, arg3, arg2);
			return;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5601(@OriginalArg(1) Class135 arg0) {
		@Pc(25) Class4_Sub2_Sub3 local25;
		if (this.aClass4_Sub2_Sub3_3 == null && this.aBoolean73) {
			@Pc(18) Class55 local18 = this.method1125(true, arg0, 262144);
			local25 = local18 == null ? null : local18.aClass4_Sub2_Sub3_4;
		} else {
			local25 = this.aClass4_Sub2_Sub3_3;
			this.aClass4_Sub2_Sub3_3 = null;
		}
		if (local25 != null) {
			Static432.method5741(local25, this.aByte21, super.anInt6834, super.anInt6829, null);
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ZBLclient!ya;I)Lclient!dp;")
	private Class55 method1125(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class135 arg1, @OriginalArg(3) int arg2) {
		@Pc(21) Class114 local21 = Static51.aClass151_1.method2917(this.aShort23 & 0xFFFF);
		@Pc(46) Class41 local46;
		@Pc(32) Class41 local32;
		if (this.aBoolean71) {
			local46 = Static169.aClass41Array1[this.aByte21];
			local32 = Static228.aClass41Array2[0];
		} else {
			if (this.aByte21 >= 3) {
				local32 = null;
			} else {
				local32 = Static228.aClass41Array2[this.aByte21 + 1];
			}
			local46 = Static228.aClass41Array2[this.aByte21];
		}
		return local21.method2190(super.anInt6834, super.anInt6831, arg0, local32, 22, arg1, arg2, local46, super.anInt6829, this.aByte20);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IILclient!ya;)Lclient!t;")
	@Override
	public Class116 method5604(@OriginalArg(0) int arg0, @OriginalArg(2) Class135 arg1) {
		return this.method1126(arg0, arg1);
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(IILclient!ya;)Lclient!t;")
	private Class116 method1126(@OriginalArg(1) int arg0, @OriginalArg(2) Class135 arg1) {
		if (this.aClass116_3 != null && arg1.method5356(this.aClass116_3.P(), arg0) == 0) {
			return this.aClass116_3;
		} else {
			@Pc(34) Class55 local34 = this.method1125(false, arg1, arg0);
			return local34 == null ? null : local34.aClass116_4;
		}
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(I)I")
	@Override
	public int method5606() {
		return 22;
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(I)I")
	@Override
	public int method5603() {
		return this.aShort23 & 0xFFFF;
	}
}
