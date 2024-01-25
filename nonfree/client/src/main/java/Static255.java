import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!iha", name = "m", descriptor = "Lclient!lga;")
	public static Class223 aClass223_58;

	@OriginalMember(owner = "client!iha", name = "n", descriptor = "F")
	public static float aFloat98;

	// $FF: synthetic field
	@OriginalMember(owner = "client!iha", name = "a", descriptor = "Ljava/lang/Class;")
	private static Class aClass13;

	@OriginalMember(owner = "client!iha", name = "b", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_79 = new Class322(7, -1);

	@OriginalMember(owner = "client!iha", name = "b", descriptor = "()V")
	public static void method4442() {
		for (@Pc(1) int local1 = 0; local1 < Static259.anInt4979; local1++) {
			if (!Static78.aBooleanArray6[local1]) {
				@Pc(10) Class256 local10 = Static483.aClass256Array1[local1];
				@Pc(13) Class6_Sub10 local13 = local10.aClass6_Sub10_3;
				@Pc(16) int local16 = local10.anInt7105;
				@Pc(22) int local22 = local13.method8331() - Static430.anInt3928;
				@Pc(30) int local30 = (local22 * 2 >> Static594.anInt9440) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method8332() - local22 >> Static594.anInt9440;
				@Pc(53) int local53 = local13.method8329() - local22 >> Static594.anInt9440;
				@Pc(61) int local61 = local13.method8329() + local22 >> Static594.anInt9440;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static63.anInt777) {
					local61 = Static63.anInt777 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray78[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static230.anInt4470) {
						local108 = Static230.anInt4470 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(144) Class60_Sub1_Sub1 local144 = Static122.method2204(local16, local125, local78, aClass13 == null ? (aClass13 = Class172.a("laa")) : aClass13);
						if (local144 != null && local144.aByte127 != 0) {
							@Pc(169) boolean local169;
							@Pc(179) boolean local179;
							@Pc(195) short local195;
							@Pc(201) int local201;
							@Pc(207) int local207;
							if (local144.aByte127 == 1) {
								local169 = local125 - 1 >= local100;
								local179 = local125 + 1 <= local108;
								if (!local169 && local78 + 1 <= local61) {
									local195 = local10.aShortArray78[local32 + 1];
									local201 = local45 + (local195 >>> 8);
									local207 = local201 + (local195 & 0xFF);
									local169 = local125 > local201 && local125 < local207;
								}
								if (!local179 && local78 - 1 >= local53) {
									local195 = local10.aShortArray78[local32 - 1];
									local201 = local45 + (local195 >>> 8);
									local207 = local201 + (local195 & 0xFF);
									local179 = local125 > local201 && local125 < local207;
								}
								if (local169 && !local179) {
									local128 = 4;
								} else if (local179 && !local169) {
									local128 = 2;
								}
							} else {
								local169 = local125 - 1 >= local100;
								local179 = local125 + 1 <= local108;
								if (!local169 && local78 - 1 >= local53) {
									local195 = local10.aShortArray78[local32 - 1];
									local201 = local45 + (local195 >>> 8);
									local207 = local201 + (local195 & 0xFF);
									local169 = local125 > local201 && local125 < local207;
								}
								if (!local179 && local78 + 1 <= local61) {
									local195 = local10.aShortArray78[local32 + 1];
									local201 = local45 + (local195 >>> 8);
									local207 = local201 + (local195 & 0xFF);
									local179 = local125 > local201 && local125 < local207;
								}
								if (local169 && !local179) {
									local128 = 3;
								} else if (local179 && !local169) {
									local128 = 5;
								}
							}
						}
						local37[local94++] = local128;
					}
					local32++;
				}
				Static78.aBooleanArray6[local1] = true;
				Static555.aClass96Array3[local16].method8075(local13, local37);
			}
		}
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(IJ)V")
	public static void method4444(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static544.method7716(arg0 - 1L);
			Static544.method7716(1L);
		} else {
			Static544.method7716(arg0);
		}
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(ZB)V")
	public static void method4446(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static635.anInt9910 != -1) {
				Static333.method5172(Static635.anInt9910);
			}
			for (@Pc(23) Class6_Sub25 local23 = (Class6_Sub25) Static477.aClass74_31.method1404(); local23 != null; local23 = (Class6_Sub25) Static477.aClass74_31.method1405()) {
				if (!local23.method9050()) {
					local23 = (Class6_Sub25) Static477.aClass74_31.method1404();
					if (local23 == null) {
						break;
					}
				}
				Static133.method2562(local23, true, false);
			}
			Static635.anInt9910 = -1;
			Static477.aClass74_31 = new Class74(8);
			Static210.method3843();
			Static635.anInt9910 = Static370.anInt3440;
			Static623.method8541(false);
			Static35.method456();
			Static301.method4834(Static635.anInt9910);
		}
		Static624.aBoolean726 = true;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "()V")
	public static void method4448() {
		for (@Pc(1) int local1 = 0; local1 < Static243.anInt4671; local1++) {
			@Pc(6) Class60_Sub1_Sub1 local6 = Static469.aClass60_Sub1_Sub1Array1[local1];
			Static29.method342(local6, true);
			Static469.aClass60_Sub1_Sub1Array1[local1] = null;
		}
		Static243.anInt4671 = 0;
	}
}
