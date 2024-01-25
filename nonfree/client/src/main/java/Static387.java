import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!to", name = "a", descriptor = "I")
	public static int anInt6720;

	@OriginalMember(owner = "client!to", name = "x", descriptor = "F")
	public static float aFloat195;

	@OriginalMember(owner = "client!to", name = "f", descriptor = "[I")
	public static final int[] anIntArray581 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!to", name = "m", descriptor = "Lclient!gl;")
	public static final Class93 aClass93_8 = new Class93("", 12);

	@OriginalMember(owner = "client!to", name = "o", descriptor = "I")
	public static int anInt6727 = 100;

	@OriginalMember(owner = "client!to", name = "y", descriptor = "[S")
	public static final short[] aShortArray100 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!to", name = "z", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_96 = new Class242(" ", ": ", " ", " ");

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILclient!ns;)V")
	public static void method5227(@OriginalArg(1) Class166 arg0) {
		Static240.anInt4396 = arg0.method3698("p11_full");
		Static68.anInt4584 = arg0.method3698("p12_full");
		Static220.anInt5563 = arg0.method3698("b12_full");
		Static81.anInt1878 = arg0.method3698("hitmarks");
		Static344.anInt6188 = arg0.method3698("hitbar_default");
		Static220.anInt5565 = arg0.method3698("timerbar_default");
		Static314.anInt5624 = arg0.method3698("headicons_pk");
		Static353.anInt6358 = arg0.method3698("headicons_prayer");
		Static34.anInt802 = arg0.method3698("hint_headicons");
		Static53.anInt1393 = arg0.method3698("hint_mapmarkers");
		Static270.anInt4789 = arg0.method3698("mapflag");
		Static381.anInt6680 = arg0.method3698("cross");
		Static339.anInt5970 = arg0.method3698("mapdots");
		Static294.anInt5304 = arg0.method3698("scrollbar");
		Static160.anInt3011 = arg0.method3698("name_icons");
		Static379.anInt6642 = arg0.method3698("floorshadows");
		Static403.anInt6876 = arg0.method3698("compass");
		Static302.anInt5438 = arg0.method3698("otherlevel");
		Static278.anInt7280 = arg0.method3698("hint_mapedge");
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIIIZZ)V")
	public static void method5228(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) boolean arg4) {
		Static372.anInt7558 = 7;
		Static205.anInt3908 = 0x1 << Static372.anInt7558;
		Static40.anInt1024 = Static205.anInt3908 >> 1;
		Static295.anInt5323 = (int) Math.sqrt((double) (Static40.anInt1024 * Static40.anInt1024 + Static40.anInt1024 * Static40.anInt1024));
		Static97.anInt2088 = Static205.anInt3908 >> 2;
		Static372.anInt7556 = Static205.anInt3908;
		Static301.anInt5434 = arg0;
		Static241.anInt4414 = arg1;
		Static116.anInt2459 = arg2;
		Static301.aClass53ArrayArrayArray4 = new Class53[4][Static301.anInt5434][Static241.anInt4414];
		Static422.aClass146Array3 = new Class146[4];
		if (arg3) {
			Static74.anIntArrayArray14 = new int[Static301.anInt5434][Static241.anInt4414];
			Static146.aByteArrayArray3 = new byte[Static301.anInt5434][Static241.anInt4414];
			Static442.aByteArrayArray21 = new byte[Static301.anInt5434][Static241.anInt4414];
			Static39.aClass53ArrayArrayArray3 = new Class53[1][Static301.anInt5434][Static241.anInt4414];
			Static117.aClass146Array1 = new Class146[1];
		} else {
			Static74.anIntArrayArray14 = null;
			Static146.aByteArrayArray3 = null;
			Static442.aByteArrayArray21 = null;
			Static39.aClass53ArrayArrayArray3 = null;
			Static117.aClass146Array1 = null;
		}
		if (arg4) {
			Static420.aLongArrayArrayArray128 = new long[4][arg0][arg1];
			Static200.aClass169Array1 = new Class169[65535];
			Static417.aBooleanArray27 = new boolean[65535];
			Static340.anInt6033 = 0;
		} else {
			Static420.aLongArrayArrayArray128 = null;
			Static200.aClass169Array1 = null;
			Static417.aBooleanArray27 = null;
			Static340.anInt6033 = 0;
		}
		Static171.method2497(false);
		Static108.aClass224Array2 = new Class224[1000];
		Static18.anInt561 = 0;
		Static31.aClass224Array1 = new Class224[1000];
		Static265.anInt3300 = 0;
		Static370.anIntArrayArrayArray14 = new int[4][Static301.anInt5434 + 1][Static241.anInt4414 + 1];
		Static69.aClass6_Sub2Array2 = new Class6_Sub2[5000];
		Static332.anInt5825 = 0;
		Static282.aBooleanArrayArray5 = new boolean[Static116.anInt2459 + Static116.anInt2459 + 1][Static116.anInt2459 + Static116.anInt2459 + 1];
		Static249.aBooleanArrayArray4 = new boolean[Static116.anInt2459 + Static116.anInt2459 + 2][Static116.anInt2459 + Static116.anInt2459 + 2];
		Static275.aClass16_1 = null;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!hu;ILjava/awt/Frame;)V")
	public static void method5231(@OriginalArg(0) Class114 arg0, @OriginalArg(2) Frame arg1) {
		while (true) {
			@Pc(6) Class108 local6 = arg0.method2362(arg1);
			while (local6.anInt2803 == 0) {
				Static20.method1515(10L);
			}
			if (local6.anInt2803 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static20.method1515(100L);
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IBII)V")
	public static void method5232(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static40.aClass53ArrayArrayArray2 == null) {
			return;
		}
		@Pc(19) long local19 = (long) (arg1 | arg2 << 14 | arg0 << 28);
		@Pc(25) Class4_Sub20 local25 = (Class4_Sub20) Static437.aClass196_41.method4477(local19);
		if (local25 == null) {
			Static363.method5028(arg0, arg1, arg2);
			return;
		}
		@Pc(39) Class4_Sub41 local39 = (Class4_Sub41) local25.aClass258_25.method5538();
		if (local39 == null) {
			Static363.method5028(arg0, arg1, arg2);
			return;
		}
		@Pc(53) Class6_Sub5_Sub1 local53 = (Class6_Sub5_Sub1) Static363.method5028(arg0, arg1, arg2);
		if (local53 == null) {
			local53 = new Class6_Sub5_Sub1();
		} else {
			local53.anInt7159 = local53.anInt7156 = -1;
		}
		local53.anInt7152 = local39.anInt6970;
		local53.anInt7158 = local39.anInt6968;
		label44: while (true) {
			@Pc(86) Class4_Sub41 local86 = (Class4_Sub41) local25.aClass258_25.method5528();
			if (local86 == null) {
				break;
			}
			if (local53.anInt7152 != local86.anInt6970) {
				local53.anInt7159 = local86.anInt6970;
				local53.anInt7154 = local86.anInt6968;
				while (true) {
					@Pc(107) Class4_Sub41 local107 = (Class4_Sub41) local25.aClass258_25.method5528();
					if (local107 == null) {
						break label44;
					}
					if (local53.anInt7152 != local107.anInt6970 && local107.anInt6970 != local53.anInt7159) {
						local53.anInt7156 = local107.anInt6970;
						local53.anInt7155 = local107.anInt6968;
					}
				}
			}
		}
		@Pc(151) int local151 = Static222.method3109((arg1 << 7) + 64, arg0, (arg2 << 7) + 64);
		Static62.method1211(arg0, arg1, arg2, local151, local53);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!cw;ILclient!qa;)I")
	public static int method5233(@OriginalArg(0) Class42 arg0, @OriginalArg(2) Class30 arg1) {
		if (arg0.anInt1624 != -1) {
			return arg0.anInt1624;
		}
		if (arg0.anInt1631 != -1) {
			@Pc(38) Class118 local38 = arg1.anInterface10_7.method4241(arg1.method4682() ? arg0.anInt1631 : arg0.anInt1632);
			if (!local38.aBoolean233) {
				return local38.aShort57;
			}
		}
		return arg0.anInt1625;
	}
}
