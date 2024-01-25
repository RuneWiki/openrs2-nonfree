import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "[[I")
	public static int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
	public static int anInt1232;

	@OriginalMember(owner = "client!dk", name = "f", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "Lclient!fd;")
	public static Class72 aClass72_5 = null;

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "[I")
	public static final int[] anIntArray141 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILclient!am;)V")
	public static void method1019(@OriginalArg(1) Class11 arg0) {
		Static223.anInt4634 = arg0.method301("p11_full");
		Static202.anInt4261 = arg0.method301("p12_full");
		Static55.anInt1221 = arg0.method301("b12_full");
		Static215.anInt4508 = arg0.method301("hitmarks");
		Static272.anInt5589 = arg0.method301("hitbar_default");
		Static106.anInt2366 = arg0.method301("timerbar_default");
		Static40.anInt913 = arg0.method301("headicons_pk");
		Static210.anInt5563 = arg0.method301("headicons_prayer");
		Static311.anInt6245 = arg0.method301("hint_headicons");
		Static316.anInt5504 = arg0.method301("hint_mapmarkers");
		Static193.anInt4170 = arg0.method301("mapflag");
		Static345.anInt6744 = arg0.method301("cross");
		Static354.anInt4900 = arg0.method301("mapdots");
		Static90.anInt2011 = arg0.method301("scrollbar");
		Static307.anInt3769 = arg0.method301("name_icons");
		Static114.anInt2468 = arg0.method301("floorshadows");
		Static98.anInt6646 = arg0.method301("compass");
		Static204.anInt4308 = arg0.method301("hint_mapedge");
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!ii;I)I")
	public static int method1021(@OriginalArg(0) Class4_Sub18 arg0) {
		@Pc(9) String local9 = Static199.method5388(arg0);
		@Pc(11) int[] local11 = null;
		if (Static184.method3416(arg0.anInt2905)) {
			local11 = Static247.method4270((int) arg0.aLong95).anIntArray372;
		} else if (Static156.method3018(arg0.anInt2905)) {
			@Pc(71) Class2_Sub2_Sub1_Sub2 local71 = Static101.aClass2_Sub2_Sub1_Sub2Array6[(int) arg0.aLong95];
			if (local71 != null) {
				local11 = local71.aClass34_1.anIntArray106;
			}
		} else if (Static13.method309(arg0.anInt2905)) {
			if (arg0.anInt2905 == 1010) {
				local11 = Static320.method5290((int) arg0.aLong95).anIntArray153;
			} else {
				local11 = Static320.method5290((int) (arg0.aLong95 >>> 32 & 0x7FFFFFFFL)).anIntArray153;
			}
		}
		if (local11 != null) {
			local9 = local9 + Static46.method875(local11);
		}
		return Static242.aClass106_7.method2877(Static229.aClass60Array12, local9);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V")
	public static void method1022() {
		Static17.aClass58_1 = new Class58(8);
		Static251.anInt5212 = 0;
		for (@Pc(21) Class17_Sub3 local21 = (Class17_Sub3) Static140.aClass204_6.method5359(); local21 != null; local21 = (Class17_Sub3) Static140.aClass204_6.method5357()) {
			local21.method1065();
		}
	}
}
