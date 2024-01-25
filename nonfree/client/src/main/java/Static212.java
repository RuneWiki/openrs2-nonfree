import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "Lclient!ak;")
	public static Class9 aClass9_3;

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "Lclient!jk;")
	public static Class106 aClass106_6;

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIIII)V")
	public static void method4086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(12) int local12 = -arg2;
		@Pc(14) int local14 = -1;
		Static39.method919(arg3, Static344.anIntArrayArray65[arg1], arg0 + arg2, arg0 - arg2);
		while (local7 < local9) {
			local14 += 2;
			local12 += local14;
			local7++;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(53) int[] local53 = Static344.anIntArrayArray65[local9 + arg1];
				@Pc(60) int[] local60 = Static344.anIntArrayArray65[arg1 - local9];
				@Pc(65) int local65 = arg0 + local7;
				@Pc(70) int local70 = arg0 - local7;
				Static39.method919(arg3, local53, local65, local70);
				Static39.method919(arg3, local60, local65, local70);
			}
			@Pc(88) int local88 = arg0 + local9;
			@Pc(93) int local93 = arg0 - local9;
			@Pc(99) int[] local99 = Static344.anIntArrayArray65[local7 + arg1];
			@Pc(105) int[] local105 = Static344.anIntArrayArray65[arg1 - local7];
			Static39.method919(arg3, local99, local88, local93);
			Static39.method919(arg3, local105, local88, local93);
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILclient!wo;)V")
	public static void method4087(@OriginalArg(1) Class216 arg0) {
		Static337.anInt6460 = arg0.method5660("p11_full");
		Static86.anInt2149 = arg0.method5660("p12_full");
		Static27.anInt999 = arg0.method5660("b12_full");
		Static232.anInt4766 = arg0.method5660("hitmarks");
		Static228.anInt4739 = arg0.method5660("hitbar_default");
		Static325.anInt6269 = arg0.method5660("timerbar_default");
		Static276.anInt5648 = arg0.method5660("headicons_pk");
		Static260.anInt5589 = arg0.method5660("headicons_prayer");
		Static236.anInt2456 = arg0.method5660("hint_headicons");
		Static194.anInt4147 = arg0.method5660("hint_mapmarkers");
		Static8.anInt5857 = arg0.method5660("mapflag");
		Static297.anInt5824 = arg0.method5660("cross");
		Static1.anInt24 = arg0.method5660("mapdots");
		Static290.anInt5759 = arg0.method5660("scrollbar");
		Static292.anInt4643 = arg0.method5660("name_icons");
		Static228.anInt4741 = arg0.method5660("floorshadows");
		Static139.anInt4699 = arg0.method5660("compass");
		Static27.anInt1009 = arg0.method5660("hint_mapedge");
	}
}
