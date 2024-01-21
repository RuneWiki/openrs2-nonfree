import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
	public static int anInt252;

	@OriginalMember(owner = "client!bb", name = "A", descriptor = "Lclient!s;")
	public static Class66 aClass66_1;

	@OriginalMember(owner = "client!bb", name = "I", descriptor = "Lclient!ae;")
	public static Class2_Sub2_Sub1_Sub1 aClass2_Sub2_Sub1_Sub1_6;

	@OriginalMember(owner = "client!bb", name = "O", descriptor = "[Lclient!bc;")
	public static Class2_Sub2_Sub1_Sub2[] aClass2_Sub2_Sub1_Sub2Array1;

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "Lclient!u;")
	private static Class74 aClass74_193 = Static72.method1077("Loaded gamescreen");

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "Lclient!u;")
	public static Class74 aClass74_194 = Static72.method1077("(X100(U(Y");

	@OriginalMember(owner = "client!bb", name = "u", descriptor = "Lclient!u;")
	public static Class74 aClass74_195 = Static72.method1077("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!bb", name = "v", descriptor = "I")
	public static int anInt255 = 0;

	@OriginalMember(owner = "client!bb", name = "x", descriptor = "Z")
	public static boolean aBoolean11 = false;

	@OriginalMember(owner = "client!bb", name = "F", descriptor = "Lclient!u;")
	public static Class74 aClass74_196 = Static72.method1077("null");

	@OriginalMember(owner = "client!bb", name = "G", descriptor = "Lclient!u;")
	public static Class74 aClass74_197 = aClass74_193;

	@OriginalMember(owner = "client!bb", name = "P", descriptor = "J")
	public static long aLong13 = 0L;

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)V")
	public static void method167() {
		if (Static112.anInt2421 < 2 && Static40.anInt960 == 0 && !Static6.aBoolean7) {
			return;
		}
		@Pc(52) Class74 local52;
		if (Static40.anInt960 == 1 && Static112.anInt2421 < 2) {
			local52 = Static91.method1340(new Class74[] { Static92.aClass74_1315, Static48.aClass74_834, Static121.aClass74_1619, Static10.aClass74_295 });
		} else if (Static6.aBoolean7 && Static112.anInt2421 < 2) {
			local52 = Static91.method1340(new Class74[] { Static25.aClass74_526, Static48.aClass74_834, Static4.aClass74_41, Static10.aClass74_295 });
		} else {
			local52 = Static92.aClass74Array14[Static112.anInt2421 - 1];
		}
		if (Static112.anInt2421 > 2) {
			local52 = Static91.method1340(new Class74[] { local52, Static81.aClass74_1227, Static56.method940(Static112.anInt2421 - 2), Static50.aClass74_869 });
		}
		Static54.aClass2_Sub2_Sub1_Sub3_7.method323(local52, 4, 16777215, Static107.anInt2338 / 1000);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)Lclient!hf;")
	public static Class2_Sub2_Sub9 method168(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub2_Sub9 local12 = (Class2_Sub2_Sub9) Static90.aClass16_68.method490((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static47.aClass26_8.method1358(arg0, 9);
		local12 = new Class2_Sub2_Sub9();
		local12.anInt1091 = arg0;
		if (local22 != null) {
			local12.method769(new Class2_Sub10(local22));
		}
		local12.method771();
		Static90.aClass16_68.method492(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!ba;B)V")
	public static void method169(@OriginalArg(0) Class2_Sub2_Sub2_Sub1 arg0) {
		arg0.anInt2663 = arg0.anInt2722;
		if (arg0.anInt2691 == 0) {
			arg0.anInt2709 = 0;
			return;
		}
		if (arg0.anInt2670 != -1 && arg0.anInt2675 == 0) {
			@Pc(35) Class2_Sub2_Sub11 local35 = Static12.method270(arg0.anInt2670);
			if (arg0.anInt2684 > 0 && local35.anInt1524 == 0) {
				arg0.anInt2709++;
				return;
			}
			if (arg0.anInt2684 <= 0 && local35.anInt1513 == 0) {
				arg0.anInt2709++;
				return;
			}
		}
		@Pc(76) int local76 = arg0.anInt2673;
		@Pc(79) int local79 = arg0.anInt2672;
		@Pc(94) int local94 = arg0.anIntArray393[arg0.anInt2691 - 1] * 128 + arg0.anInt2703 * 64;
		@Pc(110) int local110 = arg0.anIntArray394[arg0.anInt2691 - 1] * 128 + arg0.anInt2703 * 64;
		if (local110 - local76 > 256 || local110 - local76 < -256 || local94 - local79 > 256 || local94 - local79 < -256) {
			arg0.anInt2673 = local110;
			arg0.anInt2672 = local94;
			return;
		}
		if (local76 >= local110) {
			if (local110 < local76) {
				if (local79 < local94) {
					arg0.anInt2705 = 768;
				} else if (local94 < local79) {
					arg0.anInt2705 = 256;
				} else {
					arg0.anInt2705 = 512;
				}
			} else if (local94 > local79) {
				arg0.anInt2705 = 1024;
			} else if (local94 < local79) {
				arg0.anInt2705 = 0;
			}
		} else if (local79 < local94) {
			arg0.anInt2705 = 1280;
		} else if (local94 >= local79) {
			arg0.anInt2705 = 1536;
		} else {
			arg0.anInt2705 = 1792;
		}
		@Pc(215) int local215 = arg0.anInt2688;
		@Pc(223) int local223 = arg0.anInt2705 - arg0.anInt2720 & 0x7FF;
		@Pc(225) int local225 = 4;
		@Pc(227) boolean local227 = true;
		if (local223 > 1024) {
			local223 -= 2048;
		}
		if (local223 >= -256 && local223 <= 256) {
			local215 = arg0.anInt2693;
		} else if (local223 >= 256 && local223 < 768) {
			local215 = arg0.anInt2692;
		} else if (local223 >= -768 && local223 <= -256) {
			local215 = arg0.anInt2697;
		}
		if (local215 == -1) {
			local215 = arg0.anInt2693;
		}
		arg0.anInt2663 = local215;
		if (arg0 instanceof Class2_Sub2_Sub2_Sub1_Sub1) {
			local227 = ((Class2_Sub2_Sub2_Sub1_Sub1) arg0).aClass2_Sub2_Sub9_1.aBoolean45;
		}
		if (local227) {
			if (arg0.anInt2720 != arg0.anInt2705 && arg0.anInt2717 == -1 && arg0.anInt2707 != 0) {
				local225 = 2;
			}
			if (arg0.anInt2691 > 2) {
				local225 = 6;
			}
			if (arg0.anInt2691 > 3) {
				local225 = 8;
			}
			if (arg0.anInt2709 > 0 && arg0.anInt2691 > 1) {
				local225 = 8;
				arg0.anInt2709--;
			}
		} else {
			if (arg0.anInt2691 > 1) {
				local225 = 6;
			}
			if (arg0.anInt2691 > 2) {
				local225 = 8;
			}
			if (arg0.anInt2709 > 0 && arg0.anInt2691 > 1) {
				arg0.anInt2709--;
				local225 = 8;
			}
		}
		if (arg0.aBooleanArray14[arg0.anInt2691 - 1]) {
			local225 <<= 0x1;
		}
		if (local94 > local79) {
			arg0.anInt2672 += local225;
			if (arg0.anInt2672 > local94) {
				arg0.anInt2672 = local94;
			}
		} else if (local79 > local94) {
			arg0.anInt2672 -= local225;
			if (local94 > arg0.anInt2672) {
				arg0.anInt2672 = local94;
			}
		}
		if (local76 < local110) {
			arg0.anInt2673 += local225;
			if (arg0.anInt2673 > local110) {
				arg0.anInt2673 = local110;
			}
		} else if (local76 > local110) {
			arg0.anInt2673 -= local225;
			if (local110 > arg0.anInt2673) {
				arg0.anInt2673 = local110;
			}
		}
		if (arg0.anInt2673 == local110 && arg0.anInt2672 == local94) {
			arg0.anInt2691--;
			if (arg0.anInt2684 > 0) {
				arg0.anInt2684--;
			}
		}
		if (local225 >= 8 && arg0.anInt2693 == arg0.anInt2663 && arg0.anInt2676 != -1) {
			arg0.anInt2663 = arg0.anInt2676;
		}
	}

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)V")
	public static void method170() {
		aClass74_196 = null;
		aClass74_195 = null;
		aClass74_197 = null;
		aClass2_Sub2_Sub1_Sub1_6 = null;
		aClass74_193 = null;
		aClass2_Sub2_Sub1_Sub2Array1 = null;
		aClass74_194 = null;
		aClass66_1 = null;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLclient!g;)V")
	public static void method171(@OriginalArg(1) Class26 arg0) {
		Static72.aClass26_16 = arg0;
	}

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "(I)I")
	public static int method172() {
		return 19;
	}
}
