import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
	public static int anInt367;

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
	public static int anInt371;

	@OriginalMember(owner = "client!bg", name = "s", descriptor = "I")
	public static int anInt378;

	@OriginalMember(owner = "client!bg", name = "o", descriptor = "Z")
	public static boolean aBoolean27 = false;

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(BI)V")
	public static void method350(@OriginalArg(1) int arg0) {
		@Pc(5) Class70 local5 = Static340.aClass70_20;
		synchronized (Static340.aClass70_20) {
			Static340.aClass70_20.method1399();
			Static340.aClass70_20 = new Class70(arg0);
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)Lclient!ba;")
	public static Class6_Sub1 method351(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return new Class6_Sub1_Sub26();
		} else if (arg0 == 1) {
			return new Class6_Sub1_Sub14();
		} else if (arg0 == 2) {
			return new Class6_Sub1_Sub34();
		} else if (arg0 == 3) {
			return new Class6_Sub1_Sub7();
		} else if (arg0 == 4) {
			return new Class6_Sub1_Sub27();
		} else if (arg0 == 5) {
			return new Class6_Sub1_Sub23();
		} else if (arg0 == 6) {
			return new Class6_Sub1_Sub33();
		} else if (arg0 == 7) {
			return new Class6_Sub1_Sub8();
		} else if (arg0 == 8) {
			return new Class6_Sub1_Sub13();
		} else if (arg0 == 9) {
			return new Class6_Sub1_Sub17();
		} else if (arg0 == 10) {
			return new Class6_Sub1_Sub36();
		} else if (arg0 == 11) {
			return new Class6_Sub1_Sub32();
		} else if (arg0 == 12) {
			return new Class6_Sub1_Sub9();
		} else if (arg0 == 13) {
			return new Class6_Sub1_Sub2();
		} else if (arg0 == 14) {
			return new Class6_Sub1_Sub16();
		} else if (arg0 == 15) {
			return new Class6_Sub1_Sub6();
		} else if (arg0 == 16) {
			return new Class6_Sub1_Sub22();
		} else if (arg0 == 17) {
			return new Class6_Sub1_Sub5();
		} else if (arg0 == 18) {
			return new Class6_Sub1_Sub21_Sub1();
		} else if (arg0 == 19) {
			return new Class6_Sub1_Sub1();
		} else if (arg0 == 20) {
			return new Class6_Sub1_Sub24();
		} else if (arg0 == 21) {
			return new Class6_Sub1_Sub29();
		} else if (arg0 == 22) {
			return new Class6_Sub1_Sub11();
		} else if (arg0 == 23) {
			return new Class6_Sub1_Sub12();
		} else if (arg0 == 24) {
			return new Class6_Sub1_Sub20();
		} else if (arg0 == 25) {
			return new Class6_Sub1_Sub38();
		} else if (arg0 == 26) {
			return new Class6_Sub1_Sub10();
		} else if (arg0 == 27) {
			return new Class6_Sub1_Sub18();
		} else if (arg0 == 28) {
			return new Class6_Sub1_Sub15();
		} else if (arg0 == 29) {
			return new Class6_Sub1_Sub37();
		} else if (arg0 == 30) {
			return new Class6_Sub1_Sub3();
		} else if (arg0 == 31) {
			return new Class6_Sub1_Sub25();
		} else if (arg0 == 32) {
			return new Class6_Sub1_Sub31();
		} else if (arg0 == 33) {
			return new Class6_Sub1_Sub39();
		} else if (arg0 == 34) {
			return new Class6_Sub1_Sub30();
		} else if (arg0 == 35) {
			return new Class6_Sub1_Sub4();
		} else if (arg0 == 36) {
			return new Class6_Sub1_Sub35();
		} else if (arg0 == 37) {
			return new Class6_Sub1_Sub28();
		} else if (arg0 == 38) {
			return new Class6_Sub1_Sub19();
		} else if (arg0 == 39) {
			return new Class6_Sub1_Sub21();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IBZLjava/lang/String;)I")
	public static int method352(@OriginalArg(0) int arg0, @OriginalArg(3) String arg1) {
		@Pc(28) boolean local28 = false;
		@Pc(30) boolean local30 = false;
		@Pc(32) int local32 = 0;
		@Pc(42) int local42 = arg1.length();
		for (@Pc(44) int local44 = 0; local44 < local42; local44++) {
			@Pc(50) char local50 = arg1.charAt(local44);
			if (local44 == 0) {
				if (local50 == '-') {
					local28 = true;
					continue;
				}
				if (local50 == '+') {
					continue;
				}
			}
			@Pc(94) int local94;
			if (local50 >= '0' && local50 <= '9') {
				local94 = local50 - '0';
			} else if (local50 >= 'A' && local50 <= 'Z') {
				local94 = local50 - '7';
			} else if (local50 >= 'a' && local50 <= 'z') {
				local94 = local50 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local94 >= arg0) {
				throw new NumberFormatException();
			}
			if (local28) {
				local94 = -local94;
			}
			@Pc(122) int local122 = local94 + local32 * arg0;
			if (local32 != local122 / arg0) {
				throw new NumberFormatException();
			}
			local32 = local122;
			local30 = true;
		}
		if (!local30) {
			throw new NumberFormatException();
		}
		return local32;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
	public static void method353() {
		@Pc(1) Class70 local1 = Static136.aClass70_47;
		synchronized (Static136.aClass70_47) {
			Static136.aClass70_47.method1405();
		}
		local1 = Static141.aClass70_50;
		synchronized (Static141.aClass70_50) {
			Static141.aClass70_50.method1405();
		}
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(II)I")
	public static int method355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static291.anIntArrayArray183 == null ? 0 : Static291.anIntArrayArray183[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method356(@OriginalArg(1) String arg0) {
		Static247.method4080(0, "", arg0, "", 0);
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
	public static void method357() {
		@Pc(1) Class70 local1 = Static136.aClass70_47;
		synchronized (Static136.aClass70_47) {
			Static136.aClass70_47.method1399();
		}
		local1 = Static141.aClass70_50;
		synchronized (Static141.aClass70_50) {
			Static141.aClass70_50.method1399();
		}
	}
}
