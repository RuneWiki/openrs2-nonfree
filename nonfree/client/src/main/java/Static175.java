import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!ft", name = "y", descriptor = "J")
	public static long aLong94;

	@OriginalMember(owner = "client!ft", name = "l", descriptor = "Lclient!vt;")
	public static final Class381 aClass381_3 = new Class381();

	@OriginalMember(owner = "client!ft", name = "x", descriptor = "Lclient!gca;")
	public static final Class118 aClass118_2 = new Class118();

	@OriginalMember(owner = "client!ft", name = "z", descriptor = "Z")
	public static boolean aBoolean283 = true;

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(III)Z")
	public static boolean method3430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "(I)V")
	public static void method3431() {
		if (Static579.anInt10049 == 7) {
			Static425.method7012(false);
		} else {
			Static314.aClass207_1 = Static395.aClass207_2;
			Static395.aClass207_2 = null;
			Static248.method4408(13);
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIILclient!ww;Lclient!ww;)V")
	public static void method3432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class15_Sub3_Sub4 arg3, @OriginalArg(4) Class15_Sub3_Sub4 arg4) {
		@Pc(4) Class291 local4 = Static654.method9606(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass15_Sub3_Sub4_1 = arg3;
		local4.aClass15_Sub3_Sub4_2 = arg4;
		@Pc(19) int local19 = Static245.aClass18Array14 == Static93.aClass18Array33 ? 1 : 0;
		if (!arg3.method9425()) {
			arg3.aClass15_Sub3_23 = Static98.aClass15_Sub3Array2[local19];
			Static98.aClass15_Sub3Array2[local19] = arg3;
		} else if (arg3.method9434()) {
			arg3.aClass15_Sub3_23 = Static440.aClass15_Sub3Array4[local19];
			Static440.aClass15_Sub3Array4[local19] = arg3;
		} else {
			arg3.aClass15_Sub3_23 = Static603.aClass15_Sub3Array5[local19];
			Static603.aClass15_Sub3Array5[local19] = arg3;
			Static207.aBoolean327 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method9425()) {
			if (arg4.method9434()) {
				arg4.aClass15_Sub3_23 = Static440.aClass15_Sub3Array4[local19];
				Static440.aClass15_Sub3Array4[local19] = arg4;
				return;
			}
			arg4.aClass15_Sub3_23 = Static603.aClass15_Sub3Array5[local19];
			Static603.aClass15_Sub3Array5[local19] = arg4;
			Static207.aBoolean327 = true;
			return;
		}
		arg4.aClass15_Sub3_23 = Static98.aClass15_Sub3Array2[local19];
		Static98.aClass15_Sub3Array2[local19] = arg4;
	}
}
