import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!nh", name = "u", descriptor = "I")
	public static int anInt3546;

	@OriginalMember(owner = "client!nh", name = "x", descriptor = "Lclient!vk;")
	public static Class185 aClass185_4;

	@OriginalMember(owner = "client!nh", name = "W", descriptor = "[I")
	public static int[] anIntArray391;

	@OriginalMember(owner = "client!nh", name = "X", descriptor = "I")
	public static int anInt3560;

	@OriginalMember(owner = "client!nh", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString217 = "flash1:";

	@OriginalMember(owner = "client!nh", name = "O", descriptor = "Lclient!ic;")
	public static Class85 aClass85_16 = new Class85(16);

	@OriginalMember(owner = "client!nh", name = "U", descriptor = "[Lclient!eg;")
	public static Class46[] aClass46Array2 = new Class46[14];

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZI)I")
	public static int method2993(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!vc;III)V")
	public static void method2994(@OriginalArg(0) Class53 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class4_Sub19 local12;
		if (arg2 < Static300.anInt5636) {
			local12 = Static6.aClass4_Sub19ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass42_1 != null && local12.aClass42_1.aClass53_2.method3845()) {
				arg0.method3844(local12.aClass42_1.aClass53_2, 128, 0, 0, true);
			}
		}
		if (arg3 < Static300.anInt5636) {
			local12 = Static6.aClass4_Sub19ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass42_1 != null && local12.aClass42_1.aClass53_2.method3845()) {
				arg0.method3844(local12.aClass42_1.aClass53_2, 0, 0, 128, true);
			}
		}
		if (arg2 < Static300.anInt5636 && arg3 < Static299.anInt5591) {
			local12 = Static6.aClass4_Sub19ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass42_1 != null && local12.aClass42_1.aClass53_2.method3845()) {
				arg0.method3844(local12.aClass42_1.aClass53_2, 128, 0, 128, true);
			}
		}
		if (arg2 < Static300.anInt5636 && arg3 > 0) {
			local12 = Static6.aClass4_Sub19ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass42_1 != null && local12.aClass42_1.aClass53_2.method3845()) {
				arg0.method3844(local12.aClass42_1.aClass53_2, 128, 0, -128, true);
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
	public static void method2995(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		Static181.method2940(arg0, -1, arg1, 9, arg2);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)I")
	public static int method2996(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(26) int local26 = arg0 * 6 - 61440;
		@Pc(34) int local34 = (arg0 * local26 >> 12) + 40960;
		return local13 * local34 >> 12;
	}

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "(B)Lclient!g;")
	public static Class4_Sub3_Sub9 method2997() {
		@Pc(10) Class4_Sub3_Sub9 local10 = (Class4_Sub3_Sub9) Static135.aClass178_11.method4369();
		if (local10 != null) {
			local10.method4854();
			local10.method4856();
			return local10;
		}
		@Pc(35) Class4_Sub3_Sub9 local35;
		do {
			local35 = (Class4_Sub3_Sub9) Static21.aClass178_4.method4369();
			if (local35 == null) {
				return null;
			}
			if (local35.method1522() > Static101.method1677()) {
				return null;
			}
			local35.method4854();
			local35.method4856();
		} while ((local35.aLong218 & Long.MIN_VALUE) == 0L);
		return local35;
	}
}
