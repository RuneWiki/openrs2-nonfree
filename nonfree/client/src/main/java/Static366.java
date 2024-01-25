import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
	public static int anInt6950;

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "Lclient!dj;")
	public static final Class74 aClass74_13 = new Class74(14, 0, 4, 1);

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "Lclient!qk;")
	public static Class279 aClass279_12 = null;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
	public static void method5967() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static424.aBooleanArray19[local3] = false;
		}
		Static490.anInt8498 = 0;
		Static201.anInt3961 = Static557.anInt9304;
		Static194.anInt3777 = Static185.anInt5215;
		Static305.anInt5422 = 5;
		Static531.anInt7436 = Static393.anInt7268;
		Static147.anInt2910 = -1;
		Static331.anInt6175 = -1;
		Static530.anInt9071 = -1;
		Static176.anInt3420 = 0;
		Static561.anInt9389 = Static101.anInt2262;
		Static387.anInt7216 = Static20.anInt824;
		Static29.anInt1007 = Static611.anInt9892;
		Static435.anInt7846 = -1;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg6 == arg5 && arg2 == arg3 && arg4 == arg1 && arg7 == arg0) {
			Static174.method3048(arg6, arg8, arg4, arg2, arg0);
			return;
		}
		@Pc(33) int local33 = arg6;
		@Pc(35) int local35 = arg2;
		@Pc(39) int local39 = arg6 * 3;
		@Pc(43) int local43 = arg2 * 3;
		@Pc(47) int local47 = arg5 * 3;
		@Pc(51) int local51 = arg3 * 3;
		@Pc(55) int local55 = arg1 * 3;
		@Pc(59) int local59 = arg7 * 3;
		@Pc(68) int local68 = arg4 + local47 - local55 - arg6;
		@Pc(79) int local79 = arg0 + local51 - local59 - arg2;
		@Pc(88) int local88 = local39 + local55 - local47 - local47;
		@Pc(98) int local98 = local59 + local43 - local51 - local51;
		@Pc(103) int local103 = local47 - local39;
		@Pc(108) int local108 = local51 - local43;
		for (@Pc(110) int local110 = 128; local110 <= 4096; local110 += 128) {
			@Pc(118) int local118 = local110 * local110 >> 12;
			@Pc(124) int local124 = local118 * local110 >> 12;
			@Pc(128) int local128 = local124 * local68;
			@Pc(132) int local132 = local124 * local79;
			@Pc(136) int local136 = local118 * local88;
			@Pc(140) int local140 = local118 * local98;
			@Pc(144) int local144 = local110 * local103;
			@Pc(148) int local148 = local108 * local110;
			@Pc(159) int local159 = arg6 + (local144 + local128 + local136 >> 12);
			@Pc(171) int local171 = arg2 + (local132 + local140 + local148 >> 12);
			Static174.method3048(local33, arg8, local159, local35, local171);
			local35 = local171;
			local33 = local159;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method5971(@OriginalArg(1) Class5 arg0) {
		if (Static447.aBoolean555) {
			Static491.method7316(arg0);
		} else {
			Static152.method2804(arg0);
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIBI)V")
	public static void method5972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(18) int local18;
		if (arg0 < arg2) {
			for (local18 = arg0; local18 < arg2; local18++) {
				Static460.anIntArrayArray53[local18][arg1] = arg3;
			}
		} else {
			for (local18 = arg2; local18 < arg0; local18++) {
				Static460.anIntArrayArray53[local18][arg1] = arg3;
			}
		}
	}
}
