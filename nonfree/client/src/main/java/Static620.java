import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static620 {

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray58 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "([Lclient!uv;II)V")
	public static void method8441(@OriginalArg(0) Class344[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			@Pc(18) Class344 local18 = arg0[local12];
			if (local18 != null && local18.anInt9632 == arg1 && !Static76.method1324(local18)) {
				if (local18.anInt9554 == 0) {
					method8441(arg0, local18.anInt9571);
					if (local18.aClass344Array2 != null) {
						method8441(local18.aClass344Array2, local18.anInt9571);
					}
					@Pc(55) Class3_Sub1 local55 = (Class3_Sub1) Static128.aClass25_7.method426((long) local18.anInt9571);
					if (local55 != null) {
						Static135.method2358(local55.anInt24);
					}
				}
				if (local18.anInt9554 == 6 && local18.anInt9601 != -1) {
					@Pc(76) Class267 local76 = Static474.aClass264_2.method6574(local18.anInt9601);
					if (local76 != null) {
						local18.anInt9556 += Static487.anInt8277;
						@Pc(87) int local87 = local18.anInt9582;
						while (local18.anInt9556 > local76.anIntArray456[local18.anInt9582]) {
							local18.anInt9556 -= local76.anIntArray456[local18.anInt9582];
							local18.anInt9582++;
							if (local76.anIntArray458.length <= local18.anInt9582) {
								local18.anInt9582 -= local76.anInt7575;
								if (local18.anInt9582 < 0 || local18.anInt9582 >= local76.anIntArray458.length) {
									local18.anInt9582 = 0;
								}
							}
							local18.anInt9630 = local18.anInt9582 + 1;
							if (local76.anIntArray458.length <= local18.anInt9630) {
								local18.anInt9630 -= local76.anInt7575;
								if (local18.anInt9630 < 0 || local18.anInt9630 >= local76.anIntArray458.length) {
									local18.anInt9630 = -1;
								}
							}
							Static605.method8323(local18);
						}
						if (local18.anInt9582 != local87) {
							Static491.method7210(local76, local18.anInt9582);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZLclient!dc;)V")
	public static void method8442(@OriginalArg(1) Class3_Sub9 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static367.aClass305_5 != null) {
			@Pc(20) int local20;
			try {
				Static367.aClass305_5.method7509(0L);
				Static367.aClass305_5.method7513(local8);
				for (local20 = 0; local20 < 24 && local8[local20] == 0; local20++) {
				}
				if (local20 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(45) Exception local45) {
				for (local20 = 0; local20 < 24; local20++) {
					local8[local20] = -1;
				}
			}
		}
		arg0.method5625(local8, 24, 0);
	}
}
