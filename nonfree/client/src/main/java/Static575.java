import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static575 {

	@OriginalMember(owner = "client!ta", name = "v", descriptor = "I")
	public static int anInt9550 = 0;

	@OriginalMember(owner = "client!ta", name = "m", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_179 = new Class322(10, -2);

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIII)V")
	public static void method8330(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static143.method439(arg5);
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = arg5 - arg2;
		if (local16 < 0) {
			local16 = 0;
		}
		@Pc(25) int local25 = arg5;
		@Pc(28) int local28 = -arg5;
		@Pc(30) int local30 = local16;
		@Pc(33) int local33 = -local16;
		@Pc(35) int local35 = -1;
		@Pc(37) int local37 = -1;
		@Pc(58) int local58;
		@Pc(66) int local66;
		@Pc(77) int local77;
		@Pc(87) int local87;
		if (arg0 >= Static605.anInt9561 && arg0 <= Static223.anInt4380) {
			@Pc(49) int[] local49 = Static36.anIntArrayArray4[arg0];
			local58 = Static9.method118(Static8.anInt136, Static398.anInt6878, arg3 - arg5);
			local66 = Static9.method118(Static8.anInt136, Static398.anInt6878, arg5 + arg3);
			local77 = Static9.method118(Static8.anInt136, Static398.anInt6878, arg3 - local16);
			local87 = Static9.method118(Static8.anInt136, Static398.anInt6878, arg3 + local16);
			Static367.method5559(-7, local58, arg4, local49, local77);
			Static367.method5559(-7, local77, arg1, local49, local87);
			Static367.method5559(-7, local87, arg4, local49, local66);
		}
		while (local12 < local25) {
			local37 += 2;
			local35 += 2;
			local33 += local37;
			local28 += local35;
			if (local33 >= 0 && local30 >= 1) {
				local30--;
				Static318.anIntArray319[local30] = local12;
				local33 -= local30 << 1;
			}
			local12++;
			@Pc(250) int local250;
			@Pc(258) int local258;
			@Pc(269) int[] local269;
			@Pc(150) int local150;
			if (local28 >= 0) {
				local25--;
				local28 -= local25 << 1;
				local150 = arg0 - local25;
				local58 = arg0 + local25;
				if (local58 >= Static605.anInt9561 && Static223.anInt4380 >= local150) {
					if (local25 >= local16) {
						local66 = Static9.method118(Static8.anInt136, Static398.anInt6878, arg3 + local12);
						local77 = Static9.method118(Static8.anInt136, Static398.anInt6878, arg3 - local12);
						if (local58 <= Static223.anInt4380) {
							Static367.method5559(-7, local77, arg4, Static36.anIntArrayArray4[local58], local66);
						}
						if (local150 >= Static605.anInt9561) {
							Static367.method5559(-7, local77, arg4, Static36.anIntArrayArray4[local150], local66);
						}
					} else {
						local66 = Static318.anIntArray319[local25];
						local77 = Static9.method118(Static8.anInt136, Static398.anInt6878, arg3 + local12);
						local87 = Static9.method118(Static8.anInt136, Static398.anInt6878, arg3 - local12);
						local250 = Static9.method118(Static8.anInt136, Static398.anInt6878, arg3 + local66);
						local258 = Static9.method118(Static8.anInt136, Static398.anInt6878, arg3 - local66);
						if (Static223.anInt4380 >= local58) {
							local269 = Static36.anIntArrayArray4[local58];
							Static367.method5559(-7, local87, arg4, local269, local258);
							Static367.method5559(-7, local258, arg1, local269, local250);
							Static367.method5559(-7, local250, arg4, local269, local77);
						}
						if (local150 >= Static605.anInt9561) {
							local269 = Static36.anIntArrayArray4[local150];
							Static367.method5559(-7, local87, arg4, local269, local258);
							Static367.method5559(-7, local258, arg1, local269, local250);
							Static367.method5559(-7, local250, arg4, local269, local77);
						}
					}
				}
			}
			local150 = arg0 - local12;
			local58 = arg0 + local12;
			if (local58 >= Static605.anInt9561 && local150 <= Static223.anInt4380) {
				local66 = arg3 + local25;
				local77 = arg3 - local25;
				if (local66 >= Static398.anInt6878 && Static8.anInt136 >= local77) {
					local66 = Static9.method118(Static8.anInt136, Static398.anInt6878, local66);
					local77 = Static9.method118(Static8.anInt136, Static398.anInt6878, local77);
					if (local12 < local16) {
						local87 = local30 >= local12 ? local30 : Static318.anIntArray319[local12];
						local250 = Static9.method118(Static8.anInt136, Static398.anInt6878, arg3 + local87);
						local258 = Static9.method118(Static8.anInt136, Static398.anInt6878, arg3 - local87);
						if (local58 <= Static223.anInt4380) {
							local269 = Static36.anIntArrayArray4[local58];
							Static367.method5559(-7, local77, arg4, local269, local258);
							Static367.method5559(-7, local258, arg1, local269, local250);
							Static367.method5559(-7, local250, arg4, local269, local66);
						}
						if (local150 >= Static605.anInt9561) {
							local269 = Static36.anIntArrayArray4[local150];
							Static367.method5559(-7, local77, arg4, local269, local258);
							Static367.method5559(-7, local258, arg1, local269, local250);
							Static367.method5559(-7, local250, arg4, local269, local66);
						}
					} else {
						if (local58 <= Static223.anInt4380) {
							Static367.method5559(-7, local77, arg4, Static36.anIntArrayArray4[local58], local66);
						}
						if (local150 >= Static605.anInt9561) {
							Static367.method5559(-7, local77, arg4, Static36.anIntArrayArray4[local150], local66);
						}
					}
				}
			}
		}
	}
}
