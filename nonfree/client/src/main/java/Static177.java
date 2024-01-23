import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!n", name = "A", descriptor = "I")
	public static int anInt2083;

	@OriginalMember(owner = "client!n", name = "D", descriptor = "[I")
	public static int[] anIntArray183;

	@OriginalMember(owner = "client!n", name = "E", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray19;

	@OriginalMember(owner = "client!n", name = "F", descriptor = "I")
	public static int anInt2086;

	@OriginalMember(owner = "client!n", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString81 = "M";

	@OriginalMember(owner = "client!n", name = "H", descriptor = "[S")
	public static short[] aShortArray42 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!n", name = "I", descriptor = "Ljava/lang/String;")
	public static String aString82 = "Ok";

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(II)V")
	public static void method1741(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class1_Sub17 local7 = Static122.aClass1_Sub17ArrayArrayArray3[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(30) Class1_Sub17 local30 = Static122.aClass1_Sub17ArrayArrayArray3[local9][arg0][arg1] = Static122.aClass1_Sub17ArrayArrayArray3[local9 + 1][arg0][arg1];
			if (local30 != null) {
				local30.anInt3446--;
				for (@Pc(40) int local40 = 0; local40 < local30.anInt3452; local40++) {
					@Pc(49) Class60 local49 = local30.aClass60Array3[local40];
					if ((local49.aLong64 >> 29 & 0x3L) == 2L && local49.anInt1529 == arg0 && local49.anInt1522 == arg1) {
						local49.anInt1521--;
					}
				}
			}
		}
		if (Static122.aClass1_Sub17ArrayArrayArray3[0][arg0][arg1] == null) {
			Static122.aClass1_Sub17ArrayArrayArray3[0][arg0][arg1] = new Class1_Sub17(0, arg0, arg1);
		}
		Static122.aClass1_Sub17ArrayArrayArray3[0][arg0][arg1].aClass1_Sub17_1 = local7;
		Static122.aClass1_Sub17ArrayArrayArray3[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(III)Lclient!tn;")
	public static Class171 method1742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static122.aClass1_Sub17ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class171 local14 = local7.aClass171_1;
			local7.aClass171_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ILclient!sb;)Lclient!li;")
	public static Class12_Sub2 method1743(@OriginalArg(1) Class1_Sub14 arg0) {
		return new Class12_Sub2(arg0.method2623(), arg0.method2623(), arg0.method2623(), arg0.method2623(), arg0.method2588(), arg0.method2595());
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(II)I")
	public static int method1744(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
