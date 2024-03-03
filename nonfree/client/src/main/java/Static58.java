import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!dm", name = "m", descriptor = "I")
	public static int anInt2392;

	@OriginalMember(owner = "client!dm", name = "n", descriptor = "[I")
	public static int[] anIntArray155;

	@OriginalMember(owner = "client!dm", name = "o", descriptor = "Lclient!rc;")
	public static Class42 aClass42_5;

	@OriginalMember(owner = "client!dm", name = "r", descriptor = "[Lclient!jd;")
	public static Class13[] aClass13Array9;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(BLclient!r;)V", line = 8)
	public static void method2392(@OriginalArg(1) Class197 arg0) {
		Static171.anInt80 = arg0.method5076("p11_full");
		Static346.anInt7001 = arg0.method5076("p12_full");
		Static76.anInt6666 = arg0.method5076("b12_full");
		Static348.anInt7015 = arg0.method5076("hitmarks");
		Static179.anInt3541 = arg0.method5076("hitbar_default");
		Static236.anInt4735 = arg0.method5076("timerbar_default");
		Static356.anInt7127 = arg0.method5076("headicons_pk");
		Static156.anInt3189 = arg0.method5076("headicons_prayer");
		Static364.anInt7193 = arg0.method5076("hint_headicons");
		Static338.anInt6779 = arg0.method5076("hint_mapmarkers");
		Static220.anInt4317 = arg0.method5076("mapflag");
		Static146.anInt2808 = arg0.method5076("cross");
		Static303.anInt6224 = arg0.method5076("mapdots");
		Static158.anInt3201 = arg0.method5076("scrollbar");
		Static95.anInt3586 = arg0.method5076("name_icons");
		Static31.anInt798 = arg0.method5076("floorshadows");
		Static130.anInt2591 = arg0.method5076("compass");
		Static299.anInt6019 = arg0.method5076("otherlevel");
		Static348.anInt7017 = arg0.method5076("hint_mapedge");
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IBIIIZ)V", line = 41)
	public static void method2393(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(14) long local14 = (long) (arg2 | (arg4 ? Integer.MIN_VALUE : 0));
		@Pc(20) Class2_Sub41 local20 = (Class2_Sub41) Class233.aClass4_136.method90(local14);
		if (local20 == null) {
			local20 = new Class2_Sub41();
			Class233.aClass4_136.method87(local20, local14);
		}
		if (local20.anIntArray489.length <= arg0) {
			@Pc(50) int[] local50 = new int[arg0 + 1];
			@Pc(55) int[] local55 = new int[arg0 + 1];
			for (@Pc(57) int local57 = 0; local57 < local20.anIntArray489.length; local57++) {
				local50[local57] = local20.anIntArray489[local57];
				local55[local57] = local20.anIntArray488[local57];
			}
			for (@Pc(83) int local83 = local20.anIntArray489.length; local83 < arg0; local83++) {
				local50[local83] = -1;
				local55[local83] = 0;
			}
			local20.anIntArray488 = local55;
			local20.anIntArray489 = local50;
		}
		local20.anIntArray489[arg0] = arg3;
		local20.anIntArray488[arg0] = arg1;
	}
}
