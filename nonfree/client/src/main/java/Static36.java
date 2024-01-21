import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!ec", name = "P", descriptor = "I")
	public static int anInt1020;

	@OriginalMember(owner = "client!ec", name = "eb", descriptor = "Lclient!ld;")
	public static Class52 aClass52_1;

	@OriginalMember(owner = "client!ec", name = "Q", descriptor = "Lclient!ai;")
	private static Class6 aClass6_273 = Static38.method685("OFF");

	@OriginalMember(owner = "client!ec", name = "M", descriptor = "Lclient!ai;")
	public static Class6 aClass6_272 = aClass6_273;

	@OriginalMember(owner = "client!ec", name = "W", descriptor = "Lclient!tb;")
	public static Class2_Sub23 aClass2_Sub23_1 = new Class2_Sub23(0, 0);

	@OriginalMember(owner = "client!ec", name = "ab", descriptor = "Lclient!ob;")
	public static Class60 aClass60_2 = new Class60();

	@OriginalMember(owner = "client!ec", name = "bb", descriptor = "I")
	public static int anInt1028 = 0;

	@OriginalMember(owner = "client!ec", name = "db", descriptor = "Lclient!ai;")
	public static Class6 aClass6_274 = Static38.method685(" )2> <col=ff9040>");

	@OriginalMember(owner = "client!ec", name = "fb", descriptor = "[Z")
	public static boolean[] aBooleanArray3 = new boolean[100];

	@OriginalMember(owner = "client!ec", name = "gb", descriptor = "[I")
	public static int[] anIntArray57 = new int[1000];

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "(I)V")
	public static void method635() {
		aClass52_1 = null;
		aClass6_273 = null;
		aClass60_2 = null;
		aClass6_274 = null;
		aBooleanArray3 = null;
		anIntArray57 = null;
		aClass6_272 = null;
		aClass2_Sub23_1 = null;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BLclient!wa;)Lclient!wa;")
	public static Class87 method636(@OriginalArg(1) Class87 arg0) {
		@Pc(13) int local13 = Static3.method49(Static179.method2802(arg0));
		if (local13 == 0) {
			return null;
		}
		for (@Pc(22) int local22 = 0; local22 < local13; local22++) {
			arg0 = Static57.method940(arg0.anInt4074);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!h;)V")
	public static void method637(@OriginalArg(1) Class2_Sub3_Sub5_Sub1 arg0) {
		arg0.anInt2657 = arg0.anInt2668;
		if (arg0.anInt2687 == 0) {
			arg0.anInt2685 = 0;
			return;
		}
		if (arg0.anInt2658 != -1 && arg0.anInt2682 == 0) {
			@Pc(32) Class2_Sub3_Sub8 local32 = Static129.method2790(arg0.anInt2658);
			if (arg0.anInt2694 > 0 && local32.anInt1696 == 0) {
				arg0.anInt2685++;
				return;
			}
			if (arg0.anInt2694 <= 0 && local32.anInt1688 == 0) {
				arg0.anInt2685++;
				return;
			}
		}
		@Pc(64) int local64 = arg0.anInt2674;
		@Pc(80) int local80 = arg0.anIntArray221[arg0.anInt2687 - 1] * 128 + arg0.anInt2695 * 64;
		@Pc(95) int local95 = arg0.anInt2695 * 64 + arg0.anIntArray223[arg0.anInt2687 - 1] * 128;
		@Pc(98) int local98 = arg0.anInt2672;
		if (local80 - local64 > 256 || local80 - local64 < -256 || local95 - local98 > 256 || local95 - local98 < -256) {
			arg0.anInt2672 = local95;
			arg0.anInt2674 = local80;
			return;
		}
		if (local80 > local64) {
			if (local95 > local98) {
				arg0.anInt2680 = 1280;
			} else if (local98 > local95) {
				arg0.anInt2680 = 1792;
			} else {
				arg0.anInt2680 = 1536;
			}
		} else if (local64 <= local80) {
			if (local95 > local98) {
				arg0.anInt2680 = 1024;
			} else if (local95 < local98) {
				arg0.anInt2680 = 0;
			}
		} else if (local98 < local95) {
			arg0.anInt2680 = 768;
		} else if (local95 < local98) {
			arg0.anInt2680 = 256;
		} else {
			arg0.anInt2680 = 512;
		}
		@Pc(227) int local227 = arg0.anInt2680 - arg0.anInt2681 & 0x7FF;
		if (local227 > 1024) {
			local227 -= 2048;
		}
		@Pc(239) int local239 = arg0.anInt2700;
		@Pc(241) int local241 = 4;
		if (local227 >= -256 && local227 <= 256) {
			local239 = arg0.anInt2667;
		} else if (local227 >= 256 && local227 < 768) {
			local239 = arg0.anInt2656;
		} else if (local227 >= -768 && local227 <= -256) {
			local239 = arg0.anInt2706;
		}
		if (local239 == -1) {
			local239 = arg0.anInt2667;
		}
		@Pc(285) boolean local285 = true;
		arg0.anInt2657 = local239;
		if (arg0 instanceof Class2_Sub3_Sub5_Sub1_Sub2) {
			local285 = ((Class2_Sub3_Sub5_Sub1_Sub2) arg0).aClass2_Sub3_Sub17_1.aBoolean156;
		}
		if (local285) {
			if (arg0.anInt2681 != arg0.anInt2680 && arg0.anInt2699 == -1 && arg0.anInt2707 != 0) {
				local241 = 2;
			}
			if (arg0.anInt2687 > 2) {
				local241 = 6;
			}
			if (arg0.anInt2687 > 3) {
				local241 = 8;
			}
			if (arg0.anInt2685 > 0 && arg0.anInt2687 > 1) {
				arg0.anInt2685--;
				local241 = 8;
			}
		} else {
			if (arg0.anInt2687 > 1) {
				local241 = 6;
			}
			if (arg0.anInt2687 > 2) {
				local241 = 8;
			}
			if (arg0.anInt2685 > 0 && arg0.anInt2687 > 1) {
				local241 = 8;
				arg0.anInt2685--;
			}
		}
		if (arg0.aBooleanArray7[arg0.anInt2687 - 1]) {
			local241 <<= 0x1;
		}
		if (local95 > local98) {
			arg0.anInt2672 += local241;
			if (local95 < arg0.anInt2672) {
				arg0.anInt2672 = local95;
			}
		} else if (local98 > local95) {
			arg0.anInt2672 -= local241;
			if (arg0.anInt2672 < local95) {
				arg0.anInt2672 = local95;
			}
		}
		if (local241 >= 8 && arg0.anInt2657 == arg0.anInt2667 && arg0.anInt2703 != -1) {
			arg0.anInt2657 = arg0.anInt2703;
		}
		if (local80 > local64) {
			arg0.anInt2674 += local241;
			if (local80 < arg0.anInt2674) {
				arg0.anInt2674 = local80;
			}
		} else if (local64 > local80) {
			arg0.anInt2674 -= local241;
			if (local80 > arg0.anInt2674) {
				arg0.anInt2674 = local80;
			}
		}
		if (local80 != arg0.anInt2674 || local95 != arg0.anInt2672) {
			return;
		}
		arg0.anInt2687--;
		if (arg0.anInt2694 > 0) {
			arg0.anInt2694--;
			return;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IILclient!c;)Z")
	public static boolean method638(@OriginalArg(0) int arg0, @OriginalArg(2) Class10 arg1) {
		@Pc(8) byte[] local8 = arg1.method1586(arg0);
		if (local8 == null) {
			return false;
		} else {
			Static38.method682(local8);
			return true;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIBI)I")
	public static int method639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = 256 - arg1;
		return (local8 * (arg0 & 0xFF00FF) + arg1 * (arg2 & 0xFF00FF) & 0xFF00FF00) + ((arg2 & 0xFF00) * arg1 + local8 * (arg0 & 0xFF00) & 0xFF0000) >> 8;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
	public static int method640(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) int local6 = arg0.getKeyChar();
		if (local6 == 8364) {
			return 128;
		} else {
			if (local6 <= 0 || local6 >= 256) {
				local6 = -1;
			}
			return local6;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)Z")
	public static boolean method641(@OriginalArg(0) int arg0) {
		if (Static117.aBooleanArray9[arg0]) {
			return true;
		} else if (Static121.aClass10_93.method1581(arg0)) {
			@Pc(32) int local32 = Static121.aClass10_93.method1588(arg0);
			if (local32 == 0) {
				Static117.aBooleanArray9[arg0] = true;
				return true;
			}
			if (Static180.aClass87ArrayArray1[arg0] == null) {
				Static180.aClass87ArrayArray1[arg0] = new Class87[local32];
			}
			for (@Pc(54) int local54 = 0; local54 < local32; local54++) {
				if (Static180.aClass87ArrayArray1[arg0][local54] == null) {
					@Pc(68) byte[] local68 = Static121.aClass10_93.method1605(local54, arg0);
					if (local68 != null) {
						Static180.aClass87ArrayArray1[arg0][local54] = new Class87();
						Static180.aClass87ArrayArray1[arg0][local54].anInt4085 = (arg0 << 16) + local54;
						if (local68[0] == -1) {
							Static180.aClass87ArrayArray1[arg0][local54].method2756(new Class2_Sub13(local68));
						} else {
							Static180.aClass87ArrayArray1[arg0][local54].method2759(new Class2_Sub13(local68));
						}
					}
				}
			}
			Static117.aBooleanArray9[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
