import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!ed", name = "r", descriptor = "Lclient!pf;")
	public static Class1_Sub18_Sub1 aClass1_Sub18_Sub1_1 = new Class1_Sub18_Sub1(5000);

	@OriginalMember(owner = "client!ed", name = "s", descriptor = "Z")
	public static boolean aBoolean101 = false;

	@OriginalMember(owner = "client!ed", name = "t", descriptor = "I")
	public static int anInt1290 = 0;

	@OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
	public static int anInt1291 = 0;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIILclient!j;IJIIII)Z")
	public static boolean method1052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class6 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		return arg4 == null ? true : Static27.method458(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(III[BZ[Lclient!ac;ZI)[I")
	public static int[] method1053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class2[] arg5, @OriginalArg(7) int arg6) {
		@Pc(5) byte local5;
		if (arg4) {
			local5 = 1;
		} else {
			local5 = 4;
		}
		@Pc(19) int local19;
		@Pc(26) int local26;
		if (!arg4) {
			for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
				for (local19 = 0; local19 < 64; local19++) {
					for (local26 = 0; local26 < 64; local26++) {
						if (local19 + arg0 > 0 && local19 + arg0 < 103 && arg2 + local26 > 0 && arg2 + local26 < 103) {
							arg5[local14].anIntArrayArray1[local19 + arg0][arg2 + local26] &= 0xFFDFFFFF;
						}
					}
				}
			}
		}
		@Pc(98) Class1_Sub18 local98 = new Class1_Sub18(arg3);
		local26 = arg6 + arg2;
		local19 = arg1 + arg0;
		@Pc(128) int local128;
		for (@Pc(109) int local109 = 0; local109 < local5; local109++) {
			for (@Pc(123) int local123 = 0; local123 < 64; local123++) {
				for (local128 = 0; local128 < 64; local128++) {
					Static84.method1405(arg4, local128 + arg2, 0, local109, 0, false, local19 + local123, local98, 0, local128 + local26, arg0 + local123);
				}
			}
		}
		@Pc(166) boolean local166 = false;
		@Pc(168) boolean local168 = false;
		@Pc(192) int local192;
		@Pc(243) int local243;
		@Pc(206) int local206;
		@Pc(225) int local225;
		@Pc(247) int local247;
		while (local98.aByteArray71.length > local98.anInt3911) {
			local128 = local98.method3122();
			if (local128 == 128) {
				local166 = true;
				Static40.anIntArray123[0] = local98.method3107();
				Static40.anIntArray123[1] = local98.method3064();
				Static40.anIntArray123[2] = local98.method3064();
				Static40.anIntArray123[3] = local98.method3064();
				Static40.anIntArray123[4] = local98.method3107();
			} else {
				if (local128 != 129) {
					local98.anInt3911--;
					break;
				}
				local168 = true;
				for (local192 = 0; local192 < 4; local192++) {
					@Pc(199) byte local199 = local98.method3082();
					if (local199 == 0) {
						local206 = arg0 + 64;
						if (local206 < 0) {
							local206 = 0;
						} else if (local206 >= 104) {
							local206 = 104;
						}
						local225 = arg2;
						if (arg2 < 0) {
							local225 = 0;
						} else if (arg2 >= 104) {
							local225 = 104;
						}
						local243 = arg0;
						local247 = arg2 + 64;
						if (arg0 < 0) {
							local243 = 0;
						} else if (arg0 >= 104) {
							local243 = 104;
						}
						if (local247 < 0) {
							local247 = 0;
						} else if (local247 >= 104) {
							local247 = 104;
						}
						while (local206 > local243) {
							while (local225 < local247) {
								Static70.aByteArrayArrayArray8[local192][local243][local225] = 0;
								local225++;
							}
							local243++;
						}
					} else if (local199 == 1) {
						for (local243 = 0; local243 < 64; local243 += 4) {
							for (local206 = 0; local206 < 64; local206 += 4) {
								@Pc(322) byte local322 = local98.method3082();
								for (local247 = arg0 + local243; local247 < local243 + arg0 + 4; local247++) {
									for (@Pc(338) int local338 = arg2 + local206; local338 < arg2 + local206 + 4; local338++) {
										if (local247 >= 0 && local247 < 104 && local338 >= 0 && local338 < 104) {
											Static70.aByteArrayArrayArray8[local192][local247][local338] = local322;
										}
									}
								}
							}
						}
					} else if (local199 == 2 && local192 > 0) {
						local225 = arg2;
						local247 = arg2 + 64;
						if (arg2 < 0) {
							local225 = 0;
						} else if (arg2 >= 104) {
							local225 = 104;
						}
						local243 = arg0;
						if (arg0 < 0) {
							local243 = 0;
						} else if (arg0 >= 104) {
							local243 = 104;
						}
						if (local247 < 0) {
							local247 = 0;
						} else if (local247 >= 104) {
							local247 = 104;
						}
						local206 = arg0 + 64;
						if (local206 < 0) {
							local206 = 0;
						} else if (local206 >= 104) {
							local206 = 104;
						}
						while (local206 > local243) {
							while (local225 < local247) {
								Static70.aByteArrayArrayArray8[local192][local243][local225] = Static70.aByteArrayArrayArray8[local192 - 1][local243][local225];
								local225++;
							}
							local243++;
						}
					}
				}
			}
		}
		@Pc(577) int local577;
		if (Static240.aBoolean369 && !arg4) {
			@Pc(547) Class119 local547 = null;
			while (true) {
				while (local98.aByteArray71.length > local98.anInt3911) {
					local192 = local98.method3122();
					if (local192 == 0) {
						local547 = new Class119(local98);
					} else if (local192 == 1) {
						local577 = local98.method3122();
						if (local577 > 0) {
							for (local243 = 0; local243 < local577; local243++) {
								@Pc(596) Class72 local596 = new Class72(local98);
								if (local596.anInt1964 == 31) {
									@Pc(606) Class27 local606 = Static16.method311(local98.method3107());
									local596.method1667(local606.anInt887, local606.anInt892, local606.anInt889, local606.anInt888);
								}
								local596.anInt1961 += arg0 << 7;
								local596.anInt1947 += arg2 << 7;
								local225 = local596.anInt1961 >> 7;
								local247 = local596.anInt1947 >> 7;
								if (local225 >= 0 && local247 >= 0 && local225 < 104 && local247 < 104) {
									local596.aBoolean141 = (Static242.aByteArrayArrayArray23[1][local225][local247] & 0x2) != 0;
									local596.anInt1965 = Static163.anIntArrayArrayArray16[local596.anInt1953][local225][local247] - local596.anInt1965;
									Static194.method2934(local596);
								}
							}
						}
					} else if (local192 == 2) {
						if (local547 == null) {
							local547 = new Class119();
						}
						local547.method2666(local98);
					} else {
						throw new IllegalStateException();
					}
				}
				if (local547 == null) {
					local547 = new Class119();
				}
				for (local192 = 0; local192 < 8; local192++) {
					for (local577 = 0; local577 < 8; local577++) {
						local206 = local577 + (arg2 >> 3);
						local243 = (arg0 >> 3) + local192;
						if (local243 >= 0 && local243 < 13 && local206 >= 0 && local206 < 13) {
							Static147.aClass119ArrayArray1[local243][local206] = local547;
						}
					}
				}
				break;
			}
		}
		if (!local168) {
			for (local128 = 0; local128 < 4; local128++) {
				for (local192 = 0; local192 < 16; local192++) {
					for (local577 = 0; local577 < 16; local577++) {
						local206 = (arg2 >> 2) + local577;
						local243 = local192 + (arg0 >> 2);
						if (local243 >= 0 && local243 < 26 && local206 >= 0 && local206 < 26) {
							Static70.aByteArrayArrayArray8[local128][local243][local206] = 0;
						}
					}
				}
			}
		}
		return local166 ? Static40.anIntArray123 : null;
	}
}
