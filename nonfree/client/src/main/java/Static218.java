import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!ql", name = "H", descriptor = "F")
	public static float aFloat42;

	@OriginalMember(owner = "client!ql", name = "Q", descriptor = "Lclient!td;")
	public static Class156 aClass156_8;

	@OriginalMember(owner = "client!ql", name = "T", descriptor = "Lclient!vj;")
	public static Class173 aClass173_1;

	@OriginalMember(owner = "client!ql", name = "E", descriptor = "I")
	public static int anInt4313 = 0;

	@OriginalMember(owner = "client!ql", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString258 = "Loaded world list data";

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIII)I")
	public static int method3430(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static260.aByteArrayArrayArray25[arg2][arg1][arg0] & 0x8) == 0) {
			return arg2 <= 0 || (Static260.aByteArrayArrayArray25[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "(I)V")
	public static void method3433() {
		Static242.aClass135_29.method3324();
		Static258.aClass135_35.method3324();
	}

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "(B)V")
	public static void method3436() {
		Static130.aClass1_Sub2_Sub11_12 = null;
		Static146.aClass1_Sub2_Sub11_13 = null;
		Static198.aClass1_Sub2_Sub11_2 = null;
		Static230.aClass1_Sub2_Sub11_10 = null;
		Static216.aClass1_Sub2_Sub11_17 = null;
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(BI)V")
	public static void method3440(@OriginalArg(1) int arg0) {
		if (Static108.method1987(arg0)) {
			Static152.method2619(Static77.aClass71ArrayArray1[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "(B)V")
	public static void method3442() {
		@Pc(7) boolean local7 = false;
		while (!local7) {
			local7 = true;
			for (@Pc(13) int local13 = 0; local13 < Static134.anInt2945 - 1; local13++) {
				if (Static61.aShortArray23[local13] < 1000 && Static61.aShortArray23[local13 + 1] > 1000) {
					local7 = false;
					@Pc(41) String local41 = Static266.aStringArray50[local13];
					Static266.aStringArray50[local13] = Static266.aStringArray50[local13 + 1];
					Static266.aStringArray50[local13 + 1] = local41;
					@Pc(59) String local59 = Static92.aStringArray26[local13];
					Static92.aStringArray26[local13] = Static92.aStringArray26[local13 + 1];
					Static92.aStringArray26[local13 + 1] = local59;
					@Pc(77) int local77 = Static219.anIntArray387[local13];
					Static219.anIntArray387[local13] = Static219.anIntArray387[local13 + 1];
					Static219.anIntArray387[local13 + 1] = local77;
					@Pc(95) int local95 = Static164.anIntArray311[local13];
					Static164.anIntArray311[local13] = Static164.anIntArray311[local13 + 1];
					Static164.anIntArray311[local13 + 1] = local95;
					@Pc(113) int local113 = Static20.anIntArray44[local13];
					Static20.anIntArray44[local13] = Static20.anIntArray44[local13 + 1];
					Static20.anIntArray44[local13 + 1] = local113;
					@Pc(131) short local131 = Static61.aShortArray23[local13];
					Static61.aShortArray23[local13] = Static61.aShortArray23[local13 + 1];
					Static61.aShortArray23[local13 + 1] = local131;
					@Pc(149) long local149 = Static152.aLongArray7[local13];
					Static152.aLongArray7[local13] = Static152.aLongArray7[local13 + 1];
					Static152.aLongArray7[local13 + 1] = local149;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "(B)V")
	public static void method3443() {
		Static77.aClass71ArrayArray1 = new Class71[Static298.aClass91_206.method2492()][];
		Static187.aBooleanArray38 = new boolean[Static298.aClass91_206.method2492()];
	}
}
