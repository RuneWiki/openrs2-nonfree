import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
public final class Class8_Sub3_Sub2 extends Class8_Sub3 implements Interface4 {

	@OriginalMember(owner = "client!cs", name = "y", descriptor = "S")
	private final short aShort22;

	@OriginalMember(owner = "client!cs", name = "G", descriptor = "B")
	private final byte aByte16;

	@OriginalMember(owner = "client!cs", name = "X", descriptor = "B")
	private final byte aByte17;

	@OriginalMember(owner = "client!cs", name = "Z", descriptor = "Z")
	private final boolean aBoolean64;

	@OriginalMember(owner = "client!cs", name = "S", descriptor = "Z")
	private final boolean aBoolean63;

	@OriginalMember(owner = "client!cs", name = "eb", descriptor = "B")
	private final byte aByte18;

	@OriginalMember(owner = "client!cs", name = "bb", descriptor = "Z")
	private boolean aBoolean65;

	@OriginalMember(owner = "client!cs", name = "M", descriptor = "Z")
	private final boolean aBoolean62;

	@OriginalMember(owner = "client!cs", name = "B", descriptor = "Lclient!t;")
	public Class116 aClass116_2;

	@OriginalMember(owner = "client!cs", name = "R", descriptor = "Lclient!ba;")
	private Class4_Sub2_Sub3 aClass4_Sub2_Sub3_2;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lclient!ya;Lclient!ho;IIIIIZIIIIIIZ)V")
	public Class8_Sub3_Sub2(@OriginalArg(0) Class135 arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt2854 == 1, Static170.method5833(arg13, arg12));
		this.aShort22 = (short) arg1.anInt2875;
		this.aByte16 = (byte) arg13;
		this.aByte17 = (byte) arg3;
		this.aBoolean64 = arg7;
		this.aBoolean63 = arg1.anInt2871 != 0 && !arg7;
		this.aByte18 = (byte) arg12;
		this.aBoolean65 = arg14;
		this.aBoolean62 = arg0.method5337() && arg1.aBoolean216 && !this.aBoolean64 && Static413.aClass49_Sub1_1.method2478(Static341.anInt5549) != 0;
		@Pc(79) int local79 = 2048;
		if (this.aBoolean65) {
			local79 |= 0x10000;
		}
		@Pc(94) Class55 local94 = this.method851(local79, this.aBoolean62, arg0);
		if (local94 != null) {
			this.aClass116_2 = local94.aClass116_4;
			this.aClass4_Sub2_Sub3_2 = local94.aClass4_Sub2_Sub3_4;
			if (this.aBoolean65) {
				this.aClass116_2 = this.aClass116_2.method3123((byte) 0, local79, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(B)V")
	@Override
	public void method5879() {
		this.aBoolean65 = false;
		if (this.aClass116_2 != null) {
			this.aClass116_2.UA(this.aClass116_2.P() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5602() {
		return this.aBoolean62;
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5605(@OriginalArg(1) Class135 arg0) {
		@Pc(20) Class4_Sub2_Sub3 local20;
		if (this.aClass4_Sub2_Sub3_2 == null && this.aBoolean62) {
			@Pc(31) Class55 local31 = this.method851(262144, true, arg0);
			local20 = local31 == null ? null : local31.aClass4_Sub2_Sub3_4;
		} else {
			local20 = this.aClass4_Sub2_Sub3_2;
			this.aClass4_Sub2_Sub3_2 = null;
		}
		if (local20 != null) {
			Static323.method4972(local20, this.aByte17, super.anInt7339, super.anInt7343, null);
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILclient!ya;II)Z")
	@Override
	public boolean method5878(@OriginalArg(1) Class135 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class116 local14 = this.method849(arg0, 131072);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class35 local19 = arg0.method5398();
			local19.j(super.anInt7339, super.anInt7341, super.anInt7343);
			return local14.method3107(arg1, arg2, local19, false);
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ZLclient!ya;)Lclient!lo;")
	@Override
	public Class20_Sub5 method5880(@OriginalArg(1) Class135 arg0) {
		if (this.aClass116_2 == null) {
			return null;
		}
		@Pc(11) Class35 local11 = arg0.method5398();
		local11.j(super.anInt7339, super.anInt7341, super.anInt7343);
		@Pc(21) Class20_Sub5 local21 = null;
		if (this.aBoolean63) {
			local21 = Static371.method4760(1);
		}
		this.aClass116_2.method3117(local11, local21 == null ? null : local21.aClass20_Sub8Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!cs", name = "d", descriptor = "(I)V")
	@Override
	public void method5607() {
		if (this.aClass116_2 != null) {
			this.aClass116_2.method3105();
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5877(@OriginalArg(0) Class135 arg0) {
	}

	@OriginalMember(owner = "client!cs", name = "e", descriptor = "(I)I")
	@Override
	public int method5882() {
		return this.aClass116_2 == null ? 0 : this.aClass116_2.MA();
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5873() {
		return this.aBoolean65;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!ya;IB)Lclient!t;")
	private Class116 method849(@OriginalArg(0) Class135 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass116_2 != null && arg0.method5356(this.aClass116_2.P(), arg1) == 0) {
			return this.aClass116_2;
		} else {
			@Pc(36) Class55 local36 = this.method851(arg1, false, arg0);
			return local36 == null ? null : local36.aClass116_4;
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Z)I")
	@Override
	public int method5600() {
		return this.aByte16;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IZLclient!ya;I)Lclient!dp;")
	private Class55 method851(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class135 arg2) {
		@Pc(13) Class114 local13 = Static51.aClass151_1.method2917(this.aShort22 & 0xFFFF);
		@Pc(21) Class41 local21;
		@Pc(29) Class41 local29;
		if (this.aBoolean64) {
			local29 = Static228.aClass41Array2[0];
			local21 = Static169.aClass41Array1[this.aByte17];
		} else {
			local21 = Static228.aClass41Array2[this.aByte17];
			if (this.aByte17 >= 3) {
				local29 = null;
			} else {
				local29 = Static228.aClass41Array2[this.aByte17 + 1];
			}
		}
		return local13.method2190(super.anInt7339, super.anInt7341, arg1, local29, this.aByte18 == 11 ? 10 : this.aByte18, arg2, arg0, local21, super.anInt7343, this.aByte18 == 11 ? this.aByte16 + 4 : this.aByte16);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5601(@OriginalArg(1) Class135 arg0) {
		@Pc(34) Class4_Sub2_Sub3 local34;
		if (this.aClass4_Sub2_Sub3_2 == null && this.aBoolean62) {
			@Pc(27) Class55 local27 = this.method851(262144, true, arg0);
			local34 = local27 == null ? null : local27.aClass4_Sub2_Sub3_4;
		} else {
			local34 = this.aClass4_Sub2_Sub3_2;
			this.aClass4_Sub2_Sub3_2 = null;
		}
		if (local34 != null) {
			Static432.method5741(local34, this.aByte17, super.anInt7339, super.anInt7343, null);
		}
	}

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "(Z)I")
	public int method852() {
		return this.aClass116_2 == null ? 15 : this.aClass116_2.U() / 4;
	}

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "(I)I")
	@Override
	public int method5606() {
		return this.aByte18;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IILclient!ya;)Lclient!t;")
	@Override
	public Class116 method5604(@OriginalArg(0) int arg0, @OriginalArg(2) Class135 arg1) {
		return this.method849(arg1, arg0);
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)I")
	@Override
	public int method5603() {
		return this.aShort22 & 0xFFFF;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!gg;IZIIILclient!ya;)V")
	@Override
	public void method5875(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class135 arg5) {
		if (arg0 instanceof Class8_Sub2_Sub1) {
			@Pc(39) Class8_Sub2_Sub1 local39 = (Class8_Sub2_Sub1) arg0;
			if (this.aClass116_2 == null || local39.aClass116_1 == null) {
				return;
			}
			this.aClass116_2.method3118(local39.aClass116_1, arg1, arg4, arg3, arg2);
		} else if (arg0 instanceof Class8_Sub3_Sub2) {
			@Pc(20) Class8_Sub3_Sub2 local20 = (Class8_Sub3_Sub2) arg0;
			if (this.aClass116_2 != null && local20.aClass116_2 != null) {
				this.aClass116_2.method3118(local20.aClass116_2, arg1, arg4, arg3, arg2);
				return;
			}
		}
	}
}
