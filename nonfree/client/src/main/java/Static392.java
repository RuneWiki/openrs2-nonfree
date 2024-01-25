import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!qaa", name = "c", descriptor = "I")
	public static int anInt7423;

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "Lclient!dk;")
	public static final Class72 aClass72_11 = new Class72(1);

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Lclient!hh;ZB)V")
	public static void method6186(@OriginalArg(0) Class30_Sub1_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		if (Static8.anInt118 >= 400) {
			return;
		}
		@Pc(12) Class130 local12 = arg0.aClass130_1;
		if (local12.anIntArray308 != null) {
			local12 = local12.method3570(Static393.aClass31_1);
			if (local12 == null) {
				return;
			}
		}
		if (!local12.aBoolean327) {
			return;
		}
		@Pc(30) String local30 = local12.aString37;
		if (local12.anInt4107 != 0) {
			@Pc(53) String local53 = Static518.aClass138_8 == Static293.aClass138_7 ? Static405.aClass88_217.method2391(Static345.anInt6495) : Static144.aClass88_160.method2391(Static345.anInt6495);
			local30 = local30 + Static395.method6205(local12.anInt4107, Static440.aClass30_Sub1_Sub1_Sub1_2.anInt730) + " (" + local53 + local12.anInt4107 + ")";
		}
		if (!Static73.aBoolean136) {
			if (!arg1) {
				@Pc(142) String[] local142 = local12.aStringArray22;
				if (Static225.aBoolean383) {
					local142 = Static156.method3073(local142);
				}
				@Pc(152) int local152;
				if (local142 != null) {
					for (local152 = 4; local152 >= 0; local152--) {
						if (local142[local152] != null && (local12.aByte53 == 0 || !local142[local152].equalsIgnoreCase(Static285.aClass88_156.method2391(Static345.anInt6495)))) {
							@Pc(172) byte local172 = 0;
							@Pc(174) int local174 = Static252.anInt5200;
							if (local152 == 0) {
								local172 = 23;
							}
							if (local152 == 1) {
								local172 = 13;
							}
							if (local152 == 2) {
								local172 = 16;
							}
							if (local152 == 3) {
								local172 = 12;
							}
							if (local152 == 4) {
								local172 = 30;
							}
							if (local12.anInt4083 == local152) {
								local174 = local12.anInt4101;
							}
							if (local152 == local12.anInt4099) {
								local174 = local12.anInt4109;
							}
							Static160.method3297("<col=ffff00>" + local30, 0, 0, local172, -1, true, (long) arg0.anInt4197, local142[local152], local142[local152].equalsIgnoreCase(Static285.aClass88_156.method2391(Static345.anInt6495)) ? local12.anInt4111 : local174, false);
						}
					}
				}
				if (local12.aByte53 == 1 && local142 != null) {
					for (local152 = 4; local152 >= 0; local152--) {
						if (local142[local152] != null && local142[local152].equalsIgnoreCase(Static285.aClass88_156.method2391(Static345.anInt6495))) {
							@Pc(286) short local286 = 0;
							if (Static440.aClass30_Sub1_Sub1_Sub1_2.anInt730 < local12.anInt4107) {
								local286 = 2000;
							}
							@Pc(299) short local299 = 0;
							if (local152 == 0) {
								local299 = 23;
							}
							if (local152 == 1) {
								local299 = 13;
							}
							if (local152 == 2) {
								local299 = 16;
							}
							if (local152 == 3) {
								local299 = 12;
							}
							if (local152 == 4) {
								local299 = 30;
							}
							if (local299 != 0) {
								local299 += local286;
							}
							Static160.method3297("<col=ffff00>" + local30, 0, 0, local299, -1, true, (long) arg0.anInt4197, local142[local152], local12.anInt4111, false);
						}
					}
				}
			}
			Static160.method3297("<col=ffff00>" + local30, 0, 0, 1010, -1, true, (long) arg0.anInt4197, Static481.aClass88_255.method2391(Static345.anInt6495), Static258.anInt5238, arg1);
		} else if (!arg1) {
			@Pc(90) Class213 local90 = Static147.anInt3219 == -1 ? null : Static453.aClass258_2.method6426(Static147.anInt3219);
			if ((Static266.anInt5318 & 0x2) != 0) {
				if (local90 == null || local12.method3567(local90.anInt6063, Static147.anInt3219) != local90.anInt6063) {
					Static160.method3297(Static497.aString104 + " -> <col=ffff00>" + local30, 0, 0, 21, -1, true, (long) arg0.anInt4197, Static274.aString59, Static156.anInt3411, false);
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Lclient!vs;IIIII)V")
	public static void method6188(@OriginalArg(0) Class253 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt7556 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass12_Sub7Array6[local4] != null) {
				arg0.anInt7556++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt7556; local22++) {
			@Pc(31) long local31 = Static130.aLongArrayArrayArray1[arg1][arg2][arg3];
			@Pc(41) Class97 local41;
			while (local31 != 0L) {
				local41 = Static485.aClass97Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass12_Sub7_1 == arg0.aClass12_Sub7Array6[local22]) {
					continue label51;
				}
			}
			local31 = Static130.aLongArrayArrayArray1[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static485.aClass97Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass12_Sub7_1 == arg0.aClass12_Sub7Array6[local22]) {
					continue label51;
				}
			}
			for (@Pc(93) int local93 = local22; local93 < arg0.anInt7556 - 1; local93++) {
				arg0.aClass12_Sub7Array6[local93] = arg0.aClass12_Sub7Array6[local93 + 1];
			}
			arg0.anInt7556--;
		}
	}
}
