import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "[[B")
	public static byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray15 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
	public static int anInt1632 = 0;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)V")
	public static void method1430(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub2_Sub6 local10 = Static371.method5808(7, arg0);
		local10.method1775();
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)V")
	public static void method1431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class80 local7 = client.lb[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass31_Sub4_2 != null) {
			local7.aClass31_Sub4_2 = null;
		}
		if (local7.aClass31_Sub4_1 != null) {
			local7.aClass31_Sub4_1 = null;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZLclient!ul;)V")
	public static void method1433(@OriginalArg(1) Class246 arg0) {
		Static374.anInt6118 = arg0.method5478("p11_full");
		Static295.anInt5134 = arg0.method5478("p12_full");
		Static218.anInt4007 = arg0.method5478("b12_full");
		Static350.anInt5830 = arg0.method5478("hitmarks");
		Static287.anInt5019 = arg0.method5478("hitbar_default");
		Static390.anInt6279 = arg0.method5478("timerbar_default");
		Static117.anInt2416 = arg0.method5478("headicons_pk");
		Static278.anInt4902 = arg0.method5478("headicons_prayer");
		Static20.anInt4991 = arg0.method5478("hint_headicons");
		Static158.anInt2981 = arg0.method5478("hint_mapmarkers");
		Static426.anInt6882 = arg0.method5478("mapflag");
		Static156.anInt2955 = arg0.method5478("cross");
		Static180.anInt6842 = arg0.method5478("mapdots");
		Static174.anInt3226 = arg0.method5478("scrollbar");
		Static191.anInt3422 = arg0.method5478("name_icons");
		Static245.anInt4499 = arg0.method5478("floorshadows");
		Static269.anInt4765 = arg0.method5478("compass");
		Static310.anInt5356 = arg0.method5478("otherlevel");
		Static242.anInt4444 = arg0.method5478("hint_mapedge");
	}
}
