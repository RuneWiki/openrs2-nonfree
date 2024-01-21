import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!bd", name = "fb", descriptor = "J")
	public static long aLong11;

	@OriginalMember(owner = "client!bd", name = "mb", descriptor = "Lclient!ub;")
	public static Class10_Sub1_Sub1_Sub4 aClass10_Sub1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!bd", name = "jb", descriptor = "Lclient!va;")
	private static Class61 aClass61_74 = Static88.method1421("Enter name of friend to delete from list");

	@OriginalMember(owner = "client!bd", name = "M", descriptor = "Lclient!va;")
	public static Class61 aClass61_71 = aClass61_74;

	@OriginalMember(owner = "client!bd", name = "U", descriptor = "Lclient!va;")
	public static Class61 aClass61_72 = Static88.method1421("redstone1");

	@OriginalMember(owner = "client!bd", name = "W", descriptor = "Lclient!va;")
	public static Class61 aClass61_73 = Static88.method1421("titlebutton");

	@OriginalMember(owner = "client!bd", name = "Y", descriptor = "J")
	public static volatile long aLong10 = 0L;

	@OriginalMember(owner = "client!bd", name = "Z", descriptor = "I")
	public static int anInt208 = 500;

	@OriginalMember(owner = "client!bd", name = "bb", descriptor = "I")
	public static int anInt209 = 0;

	@OriginalMember(owner = "client!bd", name = "nb", descriptor = "J")
	public static volatile long aLong12 = 0L;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)I")
	public static int method164(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -2) {
			return 12345678;
		} else if (arg1 == -1) {
			if (arg0 < 0) {
				arg0 = 0;
			} else if (arg0 > 127) {
				arg0 = 127;
			}
			return 127 - arg0;
		} else {
			arg0 = arg0 * (arg1 & 0x7F) / 128;
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return (arg1 & 0xFF80) + arg0;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/awt/Component;IIZ)Lclient!w;")
	public static Class15 method166(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class15_Sub1");
			@Pc(10) Class15 local10 = (Class15) local6.getDeclaredConstructor().newInstance();
			local10.method590(arg0, arg2, arg1);
			return local10;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class15_Sub2 local28 = new Class15_Sub2();
			local28.method590(arg0, arg2, arg1);
			return local28;
		}
	}

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "(B)V")
	public static void method167() {
		aClass10_Sub1_Sub1_Sub4_1 = null;
		aClass61_71 = null;
		aClass61_74 = null;
		aClass61_72 = null;
		aClass61_73 = null;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(IIII)I")
	public static int method169(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return arg1;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)V")
	public static void method171(@OriginalArg(0) int arg0) {
		@Pc(8) int[] local8 = Static53.aClass10_Sub1_Sub1_Sub1_33.anIntArray31;
		@Pc(11) int local11 = local8.length;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			local8[local13] = 0;
		}
		@Pc(38) int local38;
		@Pc(40) int local40;
		for (@Pc(25) int local25 = 1; local25 < 103; local25++) {
			local38 = (52736 - local25 * 512) * 4 + 24628;
			for (local40 = 1; local40 < 103; local40++) {
				if ((Static21.aByteArrayArrayArray4[arg0][local40][local25] & 0x18) == 0) {
					Static48.aClass54_1.method1344(local8, local38, arg0, local40, local25);
				}
				if (arg0 < 3 && (Static21.aByteArrayArrayArray4[arg0 + 1][local40][local25] & 0x8) != 0) {
					Static48.aClass54_1.method1344(local8, local38, arg0 + 1, local40, local25);
				}
				local38 += 4;
			}
		}
		local38 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + 238 - (10 - ((int) (Math.random() * 20.0D) + 238 - 10 << 8)) + (int) (Math.random() * 20.0D);
		local40 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		Static53.aClass10_Sub1_Sub1_Sub1_33.method146();
		@Pc(151) int local151;
		for (@Pc(147) int local147 = 1; local147 < 103; local147++) {
			for (local151 = 1; local151 < 103; local151++) {
				if ((Static21.aByteArrayArrayArray4[arg0][local151][local147] & 0x18) == 0) {
					Static7.method71(local147, local151, local38, local40, arg0);
				}
				if (arg0 < 3 && (Static21.aByteArrayArrayArray4[arg0 + 1][local151][local147] & 0x8) != 0) {
					Static7.method71(local147, local151, local38, local40, arg0 + 1);
				}
			}
		}
		Static4.anInt27 = 0;
		for (local151 = 0; local151 < 104; local151++) {
			for (@Pc(217) int local217 = 0; local217 < 104; local217++) {
				@Pc(225) int local225 = Static48.aClass54_1.method1385(Static101.anInt2582, local151, local217);
				if (local225 != 0) {
					local225 = local225 >> 14 & 0x7FFF;
					@Pc(238) int local238 = Static18.method405(local225).anInt1366;
					if (local238 >= 0) {
						@Pc(245) int local245 = local151;
						@Pc(247) int local247 = local217;
						if (local238 != 22 && local238 != 29 && local238 != 34 && local238 != 36 && local238 != 46 && local238 != 47 && local238 != 48) {
							@Pc(275) int[][] local275 = Static15.aClass12Array1[Static101.anInt2582].anIntArrayArray6;
							for (@Pc(277) int local277 = 0; local277 < 10; local277++) {
								@Pc(284) int local284 = (int) (Math.random() * 4.0D);
								if (local284 == 0 && local245 > 0 && local245 > local151 - 3 && (local275[local245 - 1][local247] & 0x1280108) == 0) {
									local245--;
								}
								if (local284 == 1 && local245 < 103 && local151 + 3 > local245 && (local275[local245 + 1][local247] & 0x1280180) == 0) {
									local245++;
								}
								if (local284 == 2 && local247 > 0 && local247 > local217 - 3 && (local275[local245][local247 - 1] & 0x1280102) == 0) {
									local247--;
								}
								if (local284 == 3 && local247 < 103 && local247 < local217 + 3 && (local275[local245][local247 + 1] & 0x1280120) == 0) {
									local247++;
								}
							}
						}
						Static54.aClass10_Sub1_Sub1_Sub1Array7[Static4.anInt27] = Static60.aClass10_Sub1_Sub1_Sub1Array8[local238];
						Static34.anIntArray115[Static4.anInt27] = local245;
						Static30.anIntArray101[Static4.anInt27] = local247;
						Static4.anInt27++;
					}
				}
			}
		}
	}
}
