import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!qc", name = "bb", descriptor = "Lclient!fr;")
	public static final Class85 aClass85_35 = new Class85();

	@OriginalMember(owner = "client!qc", name = "db", descriptor = "Lclient!fp;")
	public static final Class83 aClass83_11 = new Class83(13, 0, 1, 0);

	@OriginalMember(owner = "client!qc", name = "eb", descriptor = "Lclient!fp;")
	public static final Class83 aClass83_12 = new Class83(1, 2, 2, 0);

	@OriginalMember(owner = "client!qc", name = "fb", descriptor = "[I")
	public static final int[] anIntArray475 = new int[13];

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!gk;B)V")
	public static void method4222(@OriginalArg(0) Class7_Sub14 arg0) {
		if (arg0.aByteArray75.length - arg0.anInt4989 < 1) {
			return;
		}
		@Pc(25) int local25 = arg0.method3981();
		if (local25 < 0 || local25 > 1 || arg0.aByteArray75.length - arg0.anInt4989 < 2) {
			return;
		}
		@Pc(49) int local49 = arg0.method3943();
		if (arg0.aByteArray75.length - arg0.anInt4989 < local49 * 6) {
			return;
		}
		for (@Pc(63) int local63 = 0; local63 < local49; local63++) {
			@Pc(69) int local69 = arg0.method3943();
			@Pc(73) int local73 = arg0.method3938();
			if (Static101.anIntArray136.length > local69 && Static196.aBooleanArray18[local69] && (Static253.aClass210_1.method4380(local69).aChar3 != '1' || local73 >= -1 && local73 <= 1)) {
				Static101.anIntArray136[local69] = local73;
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLclient!ok;)V")
	public static void method4224(@OriginalArg(1) Class178 arg0) {
		Static272.anInt4601 = arg0.method3836("p11_full");
		Static37.anInt653 = arg0.method3836("p12_full");
		Static1.anInt1 = arg0.method3836("b12_full");
		Static292.anInt4876 = arg0.method3836("hitmarks");
		Static309.anInt5154 = arg0.method3836("hitbar_default");
		Static393.anInt6288 = arg0.method3836("timerbar_default");
		Static374.anInt6085 = arg0.method3836("headicons_pk");
		Static409.anInt6472 = arg0.method3836("headicons_prayer");
		Static225.anInt4944 = arg0.method3836("hint_headicons");
		Static301.anInt5047 = arg0.method3836("hint_mapmarkers");
		Static350.anInt5615 = arg0.method3836("mapflag");
		Static386.anInt6224 = arg0.method3836("cross");
		Static170.anInt4637 = arg0.method3836("mapdots");
		Static297.anInt4921 = arg0.method3836("scrollbar");
		Static280.anInt4685 = arg0.method3836("name_icons");
		Static182.anInt3280 = arg0.method3836("floorshadows");
		Static76.anInt1556 = arg0.method3836("compass");
		Static328.anInt5383 = arg0.method3836("otherlevel");
		Static387.anInt3380 = arg0.method3836("hint_mapedge");
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIZ)V")
	public static void method4226(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static377.anInt6113 == 0) {
			Static179.method5739(false);
		} else {
			Static431.anInt7201 = Static377.anInt6113;
			Static90.method1613(0);
		}
		Static302.anInt5111 = arg1;
		Static51.aBoolean45 = arg3;
		Static317.anInt5202 = arg2;
		Static93.method3422(arg0);
	}
}
