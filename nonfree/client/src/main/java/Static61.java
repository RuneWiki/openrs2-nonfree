import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!ke", name = "tb", descriptor = "Z")
	public static boolean aBoolean81;

	@OriginalMember(owner = "client!ke", name = "wb", descriptor = "Lclient!jd;")
	public static Class37 aClass37_21;

	@OriginalMember(owner = "client!ke", name = "yb", descriptor = "Lclient!pb;")
	public static Class41 aClass41_35;

	@OriginalMember(owner = "client!ke", name = "zb", descriptor = "Lclient!oa;")
	public static Class1_Sub1_Sub5_Sub3 aClass1_Sub1_Sub5_Sub3_11;

	@OriginalMember(owner = "client!ke", name = "Qb", descriptor = "[I")
	public static int[] anIntArray222;

	@OriginalMember(owner = "client!ke", name = "hb", descriptor = "[I")
	public static int[] anIntArray221 = new int[25];

	@OriginalMember(owner = "client!ke", name = "mb", descriptor = "I")
	public static int anInt1422 = 0;

	@OriginalMember(owner = "client!ke", name = "Mb", descriptor = "Lclient!rd;")
	private static Class64 aClass64_895 = Static69.method1153("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!ke", name = "ob", descriptor = "Lclient!rd;")
	public static Class64 aClass64_888 = aClass64_895;

	@OriginalMember(owner = "client!ke", name = "qb", descriptor = "I")
	public static volatile int anInt1423 = 0;

	@OriginalMember(owner = "client!ke", name = "ub", descriptor = "Lclient!rd;")
	private static Class64 aClass64_889 = Static69.method1153("Select");

	@OriginalMember(owner = "client!ke", name = "Bb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_890 = Static69.method1153("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!ke", name = "Db", descriptor = "Lclient!rd;")
	public static Class64 aClass64_891 = Static69.method1153("Regelversto-8 melden");

	@OriginalMember(owner = "client!ke", name = "Gb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_892 = Static69.method1153("cross");

	@OriginalMember(owner = "client!ke", name = "Ib", descriptor = "Lclient!rd;")
	public static Class64 aClass64_893 = aClass64_889;

	@OriginalMember(owner = "client!ke", name = "Jb", descriptor = "I")
	public static int anInt1432 = -1;

	@OriginalMember(owner = "client!ke", name = "Kb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_894 = Static69.method1153("Angreifen");

	@OriginalMember(owner = "client!ke", name = "Ob", descriptor = "Lclient!rd;")
	public static Class64 aClass64_896 = Static69.method1153(",Zffentlicher Chat");

	@OriginalMember(owner = "client!ke", name = "Pb", descriptor = "I")
	public static int anInt1435 = 0;

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "(B)V")
	public static void method1078() {
		for (@Pc(11) int local11 = 0; local11 < Static70.anInt1591; local11++) {
			@Pc(17) int local17 = Static7.anIntArray48[local11]--;
			if (Static7.anIntArray48[local11] >= -10) {
				@Pc(90) Class34 local90 = Static25.aClass34Array5[local11];
				if (local90 == null) {
					local90 = Static126.method820(Static10.aClass41_Sub1_1, Static60.anIntArray210[local11]);
					if (local90 == null) {
						continue;
					}
					Static7.anIntArray48[local11] += local90.method819();
					Static25.aClass34Array5[local11] = local90;
				}
				if (Static7.anIntArray48[local11] < 0) {
					@Pc(131) int local131;
					if (Static37.anIntArray136[local11] == 0) {
						local131 = Static46.anInt1086;
					} else {
						@Pc(141) int local141 = (Static37.anIntArray136[local11] & 0xFF) * 128;
						@Pc(149) int local149 = Static37.anIntArray136[local11] >> 16 & 0xFF;
						@Pc(158) int local158 = local149 * 128 + 64 - Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2375;
						@Pc(166) int local166 = Static37.anIntArray136[local11] >> 8 & 0xFF;
						if (local158 < 0) {
							local158 = -local158;
						}
						@Pc(181) int local181 = local166 * 128 + 64 - Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2412;
						if (local181 < 0) {
							local181 = -local181;
						}
						@Pc(192) int local192 = local158 + local181 - 128;
						if (local192 > local141) {
							Static7.anIntArray48[local11] = -100;
							continue;
						}
						if (local192 < 0) {
							local192 = 0;
						}
						local131 = (local141 - local192) * Static69.anInt1549 / local141;
					}
					@Pc(222) Class1_Sub4_Sub1 local222 = local90.method817().method1190(Static67.aClass32_1);
					@Pc(227) Class1_Sub2_Sub1 local227 = Static122.method124(local222, local131);
					local227.method99(Static119.anIntArray452[local11] - 1);
					Static23.aClass1_Sub2_Sub2_1.method1524(local227);
					Static7.anIntArray48[local11] = -100;
				}
			} else {
				Static70.anInt1591--;
				for (@Pc(33) int local33 = local11; local33 < Static70.anInt1591; local33++) {
					Static60.anIntArray210[local33] = Static60.anIntArray210[local33 + 1];
					Static25.aClass34Array5[local33] = Static25.aClass34Array5[local33 + 1];
					Static119.anIntArray452[local33] = Static119.anIntArray452[local33 + 1];
					Static7.anIntArray48[local33] = Static7.anIntArray48[local33 + 1];
					Static37.anIntArray136[local33] = Static37.anIntArray136[local33 + 1];
				}
				local11--;
			}
		}
		if (Static68.anInt1536 <= 0) {
			return;
		}
		Static68.anInt1536 -= 20;
		if (Static68.anInt1536 < 0) {
			Static68.anInt1536 = 0;
		}
		if (Static68.anInt1536 == 0 && Static31.anInt803 != 0 && Static6.anInt317 != -1) {
			Static65.method1103(Static6.anInt317, Static114.aClass41_Sub1_21, 0, Static31.anInt803);
			return;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILclient!td;I)V")
	public static void method1080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub2_Sub1_Sub2 arg2) {
		if (arg1 == arg2.anInt2407 && arg1 != -1) {
			@Pc(59) int local59 = Static10.method254(arg1).anInt709;
			if (local59 == 1) {
				arg2.anInt2359 = 0;
				arg2.anInt2368 = arg0;
				arg2.anInt2357 = 0;
				arg2.anInt2411 = 0;
			}
			if (local59 == 2) {
				arg2.anInt2359 = 0;
			}
		} else if (arg1 == -1 || arg2.anInt2407 == -1 || Static10.method254(arg1).anInt715 >= Static10.method254(arg2.anInt2407).anInt715) {
			arg2.anInt2368 = arg0;
			arg2.anInt2400 = arg2.anInt2410;
			arg2.anInt2359 = 0;
			arg2.anInt2411 = 0;
			arg2.anInt2357 = 0;
			arg2.anInt2407 = arg1;
		}
	}

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "(I)V")
	public static void method1083() {
		aClass64_895 = null;
		aClass64_896 = null;
		aClass64_888 = null;
		aClass64_889 = null;
		anIntArray222 = null;
		aClass64_893 = null;
		aClass1_Sub1_Sub5_Sub3_11 = null;
		aClass64_894 = null;
		aClass64_892 = null;
		aClass37_21 = null;
		aClass64_890 = null;
		aClass41_35 = null;
		anIntArray221 = null;
		aClass64_891 = null;
	}

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "(II)Z")
	public static boolean method1086(@OriginalArg(1) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}
}
