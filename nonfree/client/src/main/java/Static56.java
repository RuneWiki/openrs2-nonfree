import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!bu", name = "d", descriptor = "Ljava/lang/Class;")
	private static Class aClass8;

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "I")
	public static int anInt962 = 0;

	@OriginalMember(owner = "client!bu", name = "e", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_25 = new Class160(50, 9);

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;ZI)V")
	public static void method1003(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3) {
		Static187.aString36 = arg0;
		Static537.aBoolean634 = arg3;
		if (!arg3) {
			Static325.anInt5631 = -1;
		}
		Static314.aString72 = arg2;
		Static662.aBoolean747 = arg1;
		if (!Static537.aBoolean634 && (Static314.aString72.equals("") || Static187.aString36.equals(""))) {
			Static612.method8634(3);
			return;
		}
		Static591.aClass347_3.aBoolean662 = false;
		if (Static686.anInt11152 != 1) {
			Static368.anInt6246 = -1;
			Static270.anInt5019 = 0;
			Static301.anInt5895 = -1;
		}
		Static612.method8634(-3);
		Static531.anInt9126 = 0;
		Static163.anInt2494 = 0;
		Static355.anInt6072 = 1;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "()V")
	public static void method1004() {
		for (@Pc(1) int local1 = 0; local1 < Static306.anInt6132; local1++) {
			if (!Static178.aBooleanArray5[local1]) {
				@Pc(10) Class275 local10 = Static351.aClass275Array5[local1];
				@Pc(13) Class14_Sub18 local13 = local10.aClass14_Sub18_2;
				@Pc(16) int local16 = local10.anInt7473;
				@Pc(22) int local22 = local13.method8343() - Static193.anInt9749;
				@Pc(30) int local30 = (local22 * 2 >> Static110.anInt1858) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method8342() - local22 >> Static110.anInt1858;
				@Pc(53) int local53 = local13.method8341() - local22 >> Static110.anInt1858;
				@Pc(61) int local61 = local13.method8341() + local22 >> Static110.anInt1858;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static180.anInt2928) {
					local61 = Static180.anInt2928 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray93[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static654.anInt10715) {
						local108 = Static654.anInt10715 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(144) Class4_Sub3_Sub3 local144 = Static492.method7403(local16, local125, local78, aClass8 == null ? (aClass8 = Class48.a("iu")) : aClass8);
						if (local144 != null && local144.aByte133 != 0) {
							@Pc(169) boolean local169;
							@Pc(179) boolean local179;
							@Pc(195) short local195;
							@Pc(201) int local201;
							@Pc(207) int local207;
							if (local144.aByte133 == 1) {
								local169 = local125 - 1 >= local100;
								local179 = local125 + 1 <= local108;
								if (!local169 && local78 + 1 <= local61) {
									local195 = local10.aShortArray93[local32 + 1];
									local201 = local45 + (local195 >>> 8);
									local207 = local201 + (local195 & 0xFF);
									local169 = local125 > local201 && local125 < local207;
								}
								if (!local179 && local78 - 1 >= local53) {
									local195 = local10.aShortArray93[local32 - 1];
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
									local195 = local10.aShortArray93[local32 - 1];
									local201 = local45 + (local195 >>> 8);
									local207 = local201 + (local195 & 0xFF);
									local169 = local125 > local201 && local125 < local207;
								}
								if (!local179 && local78 + 1 <= local61) {
									local195 = local10.aShortArray93[local32 + 1];
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
				Static178.aBooleanArray5[local1] = true;
				Static258.aClass159Array1[local16].method8208(local13, local37);
			}
		}
	}
}
