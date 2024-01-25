import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!nj", name = "C", descriptor = "I")
	public static int anInt6661;

	@OriginalMember(owner = "client!nj", name = "r", descriptor = "Z")
	public static boolean aBoolean460 = false;

	@OriginalMember(owner = "client!nj", name = "s", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_68 = new Class240(16, 4);

	@OriginalMember(owner = "client!nj", name = "E", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_69 = new Class240(17, -1);

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZILjava/lang/String;Ljava/lang/String;I)V")
	public static void method5587(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		Static259.method3885(arg0, arg1, true, -1, arg2, arg3);
	}

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "(I)[Lclient!ed;")
	public static Class93[] method5588() {
		return new Class93[] { Static33.aClass93_21, Static329.aClass93_12, Static160.aClass93_6, Static534.aClass93_20, Static116.aClass93_3, Static364.aClass93_13, Static303.aClass93_11, Static572.aClass93_23, Static398.aClass93_15, Static197.aClass93_7, Static386.aClass93_14, Static282.aClass93_10, Static551.aClass93_22, Static259.aClass93_9 };
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIZB)V")
	public static void method5589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (Static484.aClass333_30.method7489((long) arg0) != null) {
			return;
		}
		if (Static450.aBoolean517) {
			@Pc(31) Class3_Sub15 local31 = new Class3_Sub15(arg0, new Class207_Sub1(4096, Static261.aClass362_54, arg0), arg1, arg2);
			local31.aClass207_Sub1_1.method8476(Static584.aStringArray63[Static654.anInt10668]);
			Static484.aClass333_30.method7488((long) arg0, local31);
		} else {
			Static417.method5667(arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)V")
	public static void method5591(@OriginalArg(0) int arg0) {
		Static374.anInt6314 = arg0;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIZIII)V")
	public static void method5592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = arg4; local3 <= arg0; local3++) {
			Static578.method7640(arg1, arg3, arg2, Static276.anIntArrayArray32[local3]);
		}
	}
}
