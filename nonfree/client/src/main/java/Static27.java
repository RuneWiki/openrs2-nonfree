import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!bk", name = "j", descriptor = "[I")
	public static int[] anIntArray86;

	@OriginalMember(owner = "client!bk", name = "k", descriptor = "Lclient!qp;")
	public static Class171 aClass171_1;

	@OriginalMember(owner = "client!bk", name = "n", descriptor = "[Lclient!lg;")
	public static Class60[] aClass60Array2;

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString14 = "wave2:";

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "[I")
	public static final int[] anIntArray85 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "Z")
	public static boolean aBoolean27 = false;

	@OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
	public static int anInt450 = 0;

	@OriginalMember(owner = "client!bk", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString15 = "You can't add yourself to your own friend list.";

	@OriginalMember(owner = "client!bk", name = "i", descriptor = "Ljava/lang/String;")
	public static final String aString16 = "glow1:";

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!fd;ZIII)V")
	public static void method475(@OriginalArg(0) Class72 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = arg0.anInt1829;
		if (arg0.aByte36 == 0) {
			arg0.anInt1829 = arg0.anInt1827;
		} else if (arg0.aByte36 == 1) {
			arg0.anInt1829 = arg2 - arg0.anInt1827;
		} else if (arg0.aByte36 == 2) {
			arg0.anInt1829 = arg0.anInt1827 * arg2 >> 14;
		} else if (arg0.aByte36 == 3) {
			if (arg0.anInt1825 == 2) {
				arg0.anInt1829 = (arg0.anInt1827 - 1) * arg0.anInt1881 + arg0.anInt1827 * 32;
			} else if (arg0.anInt1825 == 7) {
				arg0.anInt1829 = arg0.anInt1881 * (arg0.anInt1827 - 1) + arg0.anInt1827 * 115;
			}
		}
		@Pc(101) int local101 = arg0.anInt1806;
		if (arg0.aByte35 == 0) {
			arg0.anInt1806 = arg0.anInt1799;
		} else if (arg0.aByte35 == 1) {
			arg0.anInt1806 = arg3 - arg0.anInt1799;
		} else if (arg0.aByte35 == 2) {
			arg0.anInt1806 = arg0.anInt1799 * arg3 >> 14;
		} else if (arg0.aByte35 == 3) {
			if (arg0.anInt1825 == 2) {
				arg0.anInt1806 = arg0.anInt1799 * 32 + arg0.anInt1848 * (arg0.anInt1799 - 1);
			} else if (arg0.anInt1825 == 7) {
				arg0.anInt1806 = (arg0.anInt1799 - 1) * arg0.anInt1848 + arg0.anInt1799 * 12;
			}
		}
		if (arg0.aByte36 == 4) {
			arg0.anInt1829 = arg0.anInt1833 * arg0.anInt1806 / arg0.anInt1812;
		}
		if (arg0.aByte35 == 4) {
			arg0.anInt1806 = arg0.anInt1812 * arg0.anInt1829 / arg0.anInt1833;
		}
		if (Static93.aBoolean179 && (Static46.method876(arg0).anInt269 != 0 || arg0.anInt1825 == 0)) {
			if (arg0.anInt1806 < 5 && arg0.anInt1829 < 5) {
				arg0.anInt1806 = 5;
				arg0.anInt1829 = 5;
			} else {
				if (arg0.anInt1806 <= 0) {
					arg0.anInt1806 = 5;
				}
				if (arg0.anInt1829 <= 0) {
					arg0.anInt1829 = 5;
				}
			}
		}
		if (arg0.anInt1804 == 1337) {
			Static191.aClass72_14 = arg0;
		}
		if (arg1 && arg0.anObjectArray15 != null && (local8 != arg0.anInt1829 || arg0.anInt1806 != local101)) {
			@Pc(290) Class4_Sub22 local290 = new Class4_Sub22();
			local290.anObjectArray34 = arg0.anObjectArray15;
			local290.aClass72_12 = arg0;
			Static238.aClass130_107.method3510(local290);
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BZLjava/lang/String;)V")
	public static void method476(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(13) String local13 = arg1.toLowerCase();
		@Pc(16) short[] local16 = new short[16];
		@Pc(18) int local18 = 0;
		@Pc(24) int local24 = arg0 ? 32768 : 0;
		@Pc(32) int local32 = local24 + (arg0 ? Static306.anInt6194 : Static279.anInt5651);
		for (@Pc(34) int local34 = local24; local34 < local32; local34++) {
			@Pc(40) Class4_Sub1_Sub10 local40 = Static210.method4725(local34);
			if (local40.aBoolean247 && local40.method2619().toLowerCase().indexOf(local13) != -1) {
				if (local18 >= 50) {
					Static162.aShortArray57 = null;
					Static120.anInt2709 = -1;
					return;
				}
				if (local18 >= local16.length) {
					@Pc(69) short[] local69 = new short[local16.length * 2];
					for (@Pc(71) int local71 = 0; local71 < local18; local71++) {
						local69[local71] = local16[local71];
					}
					local16 = local69;
				}
				local16[local18++] = (short) local34;
			}
		}
		Static162.aShortArray57 = local16;
		Static120.anInt2709 = local18;
		Static270.anInt6610 = 0;
		@Pc(104) String[] local104 = new String[Static120.anInt2709];
		for (@Pc(106) int local106 = 0; local106 < Static120.anInt2709; local106++) {
			local104[local106] = Static210.method4725(local16[local106]).method2619();
		}
		Static322.method5311(local104, Static162.aShortArray57);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZLclient!am;)I")
	public static int method477(@OriginalArg(1) Class11 arg0) {
		@Pc(10) int local10 = 0;
		if (arg0.method274(Static215.anInt4508)) {
			local10++;
		}
		if (arg0.method274(Static272.anInt5589)) {
			local10++;
		}
		if (arg0.method274(Static106.anInt2366)) {
			local10++;
		}
		if (arg0.method274(Static40.anInt913)) {
			local10++;
		}
		if (arg0.method274(Static210.anInt5563)) {
			local10++;
		}
		if (arg0.method274(Static311.anInt6245)) {
			local10++;
		}
		if (arg0.method274(Static316.anInt5504)) {
			local10++;
		}
		if (arg0.method274(Static193.anInt4170)) {
			local10++;
		}
		if (arg0.method274(Static345.anInt6744)) {
			local10++;
		}
		if (arg0.method274(Static354.anInt4900)) {
			local10++;
		}
		if (arg0.method274(Static90.anInt2011)) {
			local10++;
		}
		if (arg0.method274(Static307.anInt3769)) {
			local10++;
		}
		if (arg0.method274(Static114.anInt2468)) {
			local10++;
		}
		if (arg0.method274(Static98.anInt6646)) {
			local10++;
		}
		if (arg0.method274(Static204.anInt4308)) {
			local10++;
		}
		return local10;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)I")
	public static int method478() {
		@Pc(7) Class92 local7 = Static164.aClass92_7;
		@Pc(9) boolean local9 = false;
		if (Static6.anInt1971 != 0) {
			@Pc(18) Canvas local18 = new Canvas();
			local18.setSize(100, 100);
			local9 = true;
			local7 = Static164.method3151(null, null, 0, local18, 0);
		}
		@Pc(35) long local35 = Static274.method4763();
		for (@Pc(37) int local37 = 0; local37 < 10000; local37++) {
			local7.method4532();
		}
		@Pc(62) int local62 = (int) (Static274.method4763() - local35);
		local7.method4502(0, 100, 0, 100, -16777216);
		if (local9) {
			local7.method4478();
		}
		return local62;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!km;B)V")
	public static void method480(@OriginalArg(0) Class4_Sub26 arg0) {
		if (Static18.aClass57ArrayArrayArray1 == null) {
			return;
		}
		@Pc(8) Interface5 local8 = null;
		if (arg0.anInt3626 == 0) {
			local8 = (Interface5) Static122.method2458(arg0.anInt3639, arg0.anInt3634, arg0.anInt3641);
		}
		if (arg0.anInt3626 == 1) {
			local8 = (Interface5) Static186.method4780(arg0.anInt3639, arg0.anInt3634, arg0.anInt3641);
		}
		if (arg0.anInt3626 == 2) {
			local8 = (Interface5) Static166.method3153(arg0.anInt3639, arg0.anInt3634, arg0.anInt3641, io.class);
		}
		if (arg0.anInt3626 == 3) {
			local8 = (Interface5) Static5.method210(arg0.anInt3639, arg0.anInt3634, arg0.anInt3641);
		}
		if (local8 == null) {
			arg0.anInt3629 = 0;
			arg0.anInt3640 = 0;
			arg0.anInt3638 = -1;
		} else {
			arg0.anInt3638 = local8.method4729();
			arg0.anInt3640 = local8.method4733();
			arg0.anInt3629 = local8.method4734();
		}
	}
}
