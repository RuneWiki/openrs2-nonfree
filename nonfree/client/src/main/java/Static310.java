import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!wf", name = "h", descriptor = "[I")
	public static int[] anIntArray108;

	@OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
	public static int anInt1321;

	@OriginalMember(owner = "client!wf", name = "m", descriptor = "[[[Lclient!mc;")
	public static Class1_Sub17[][][] aClass1_Sub17ArrayArrayArray2;

	@OriginalMember(owner = "client!wf", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString41 = "Loaded textures";

	@OriginalMember(owner = "client!wf", name = "n", descriptor = "Z")
	public static boolean aBoolean108 = false;

	@OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
	public static int anInt1326 = 0;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(BIII)I")
	public static int method1126(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return arg1 <= arg2 ? (arg2 <= arg0 ? arg2 : arg0) : arg1;
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(II)I")
	public static int method1127(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static212.method3350(arg0);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZIILclient!qf;)V")
	public static void method1128(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class146 arg3) {
		@Pc(4) int local4 = arg3.anInt4345;
		@Pc(11) int local11 = arg3.anInt4371;
		if (arg3.aByte22 == 0) {
			arg3.anInt4371 = arg3.anInt4391;
		} else if (arg3.aByte22 == 1) {
			arg3.anInt4371 = arg0 - arg3.anInt4391;
		} else if (arg3.aByte22 == 2) {
			arg3.anInt4371 = arg3.anInt4391 * arg0 >> 14;
		} else if (arg3.aByte22 == 3) {
			if (arg3.anInt4370 == 2) {
				arg3.anInt4371 = arg3.anInt4391 * 32 + arg3.anInt4415 * (arg3.anInt4391 - 1);
			} else if (arg3.anInt4370 == 7) {
				arg3.anInt4371 = (arg3.anInt4391 - 1) * arg3.anInt4415 + arg3.anInt4391 * 12;
			}
		}
		if (arg3.aByte24 == 0) {
			arg3.anInt4345 = arg3.anInt4357;
		} else if (arg3.aByte24 == 1) {
			arg3.anInt4345 = arg2 - arg3.anInt4357;
		} else if (arg3.aByte24 == 2) {
			arg3.anInt4345 = arg3.anInt4357 * arg2 >> 14;
		} else if (arg3.aByte24 == 3) {
			if (arg3.anInt4370 == 2) {
				arg3.anInt4345 = arg3.anInt4357 * 32 + arg3.anInt4375 * (arg3.anInt4357 - 1);
			} else if (arg3.anInt4370 == 7) {
				arg3.anInt4345 = arg3.anInt4357 * 115 + (arg3.anInt4357 - 1) * arg3.anInt4375;
			}
		}
		if (arg3.aByte24 == 4) {
			arg3.anInt4345 = arg3.anInt4371 * arg3.anInt4395 / arg3.anInt4379;
		}
		if (arg3.aByte22 == 4) {
			arg3.anInt4371 = arg3.anInt4345 * arg3.anInt4379 / arg3.anInt4395;
		}
		if (Static250.aBoolean231 && (Static36.method643(arg3).anInt4031 != 0 || arg3.anInt4370 == 0)) {
			if (arg3.anInt4371 < 5 && arg3.anInt4345 < 5) {
				arg3.anInt4371 = 5;
				arg3.anInt4345 = 5;
			} else {
				if (arg3.anInt4371 <= 0) {
					arg3.anInt4371 = 5;
				}
				if (arg3.anInt4345 <= 0) {
					arg3.anInt4345 = 5;
				}
			}
		}
		if (arg3.anInt4350 == 1337) {
			Static235.aClass146_15 = arg3;
		}
		if (arg1 && arg3.anObjectArray14 != null && (local4 != arg3.anInt4345 || arg3.anInt4371 != local11)) {
			@Pc(284) Class1_Sub29 local284 = new Class1_Sub29();
			local284.anObjectArray32 = arg3.anObjectArray14;
			local284.aClass146_16 = arg3;
			Static250.aClass24_19.method473(local284);
		}
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)I")
	public static int method1129() {
		return 6;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!ph;ILclient!ph;)V")
	public static void method1130(@OriginalArg(0) Class138 arg0, @OriginalArg(2) Class138 arg1) {
		Static78.aClass138_22 = arg1;
		Static92.aClass138_28 = arg0;
	}
}
