import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!uu", name = "tc", descriptor = "Lclient!qm;")
	public static Class4_Sub39 aClass4_Sub39_2;

	@OriginalMember(owner = "client!uu", name = "qb", descriptor = "Lclient!pk;")
	public static final Class183 aClass183_47 = new Class183();

	@OriginalMember(owner = "client!uu", name = "Qb", descriptor = "I")
	public static int anInt6823 = 0;

	@OriginalMember(owner = "client!uu", name = "Yc", descriptor = "Lclient!sl;")
	private static final Class215 aClass215_91 = new Class215(70, 8);

	@OriginalMember(owner = "client!uu", name = "kd", descriptor = "I")
	public static int anInt6861 = -1;

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)V")
	public static void method5301() {
		for (@Pc(7) int local7 = 0; local7 < Static109.anInt6886; local7++) {
			@Pc(13) Class269 local13 = Static86.aClass269Array1[local7];
			if (local13.aByte104 == 2) {
				if (local13.aClass4_Sub15_Sub3_4 == null) {
					local13.anInt7336 = Integer.MIN_VALUE;
				} else {
					Static360.aClass4_Sub15_Sub2_2.method2955(local13.aClass4_Sub15_Sub3_4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(BLclient!cw;)I")
	public static int method5308(@OriginalArg(1) Class4_Sub12_Sub1 arg0) {
		@Pc(10) int local10 = arg0.method1143(2);
		@Pc(27) int local27;
		if (local10 == 0) {
			local27 = 0;
		} else if (local10 == 1) {
			local27 = arg0.method1143(5);
		} else if (local10 == 2) {
			local27 = arg0.method1143(8);
		} else {
			local27 = arg0.method1143(11);
		}
		return local27;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ZILjava/lang/String;II)V")
	public static void method5309(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class247 local8 = Static378.method3230(arg2, arg3);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray15 != null) {
			@Pc(18) Class4_Sub34 local18 = new Class4_Sub34();
			local18.aClass247_15 = local8;
			local18.anObjectArray4 = local8.anObjectArray15;
			local18.aString50 = arg1;
			local18.anInt5250 = arg0;
			Static271.method3894(local18);
		}
		@Pc(35) boolean local35 = true;
		if (local8.anInt6842 != 0) {
			local35 = Static337.method4579(local8);
		}
		if (!local35 || !Static53.method900(local8).method3905(arg0 - 1)) {
			return;
		}
		if (arg0 == 1) {
			Static429.method5476(Static313.aClass215_70);
			Static439.method5547(arg2, arg3, local8.anInt6779);
		}
		if (arg0 == 2) {
			Static429.method5476(Static387.aClass215_85);
			Static439.method5547(arg2, arg3, local8.anInt6779);
		}
		if (arg0 == 3) {
			Static429.method5476(Static145.aClass215_37);
			Static439.method5547(arg2, arg3, local8.anInt6779);
		}
		if (arg0 == 4) {
			Static429.method5476(Static436.aClass215_95);
			Static439.method5547(arg2, arg3, local8.anInt6779);
		}
		if (arg0 == 5) {
			Static429.method5476(Static42.aClass215_8);
			Static439.method5547(arg2, arg3, local8.anInt6779);
		}
		if (arg0 == 6) {
			Static429.method5476(Static7.aClass215_71);
			Static439.method5547(arg2, arg3, local8.anInt6779);
		}
		if (arg0 == 7) {
			Static429.method5476(Static286.aClass215_64);
			Static439.method5547(arg2, arg3, local8.anInt6779);
		}
		if (arg0 == 8) {
			Static429.method5476(Static225.aClass215_46);
			Static439.method5547(arg2, arg3, local8.anInt6779);
		}
		if (arg0 == 9) {
			Static429.method5476(Static401.aClass215_89);
			Static439.method5547(arg2, arg3, local8.anInt6779);
		}
		if (arg0 == 10) {
			Static429.method5476(aClass215_91);
			Static439.method5547(arg2, arg3, local8.anInt6779);
		}
	}
}
