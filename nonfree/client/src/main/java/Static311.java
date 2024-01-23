import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!wi", name = "T", descriptor = "[Lclient!pa;")
	public static Class1_Sub2_Sub1[] aClass1_Sub2_Sub1Array10;

	@OriginalMember(owner = "client!wi", name = "U", descriptor = "F")
	public static float aFloat172;

	@OriginalMember(owner = "client!wi", name = "H", descriptor = "Lclient!vh;")
	public static Class187 aClass187_157 = new Class187(4);

	@OriginalMember(owner = "client!wi", name = "N", descriptor = "Z")
	public static boolean aBoolean384 = true;

	@OriginalMember(owner = "client!wi", name = "O", descriptor = "Z")
	public static boolean aBoolean385 = false;

	@OriginalMember(owner = "client!wi", name = "Q", descriptor = "I")
	public static int anInt5695 = 0;

	@OriginalMember(owner = "client!wi", name = "S", descriptor = "Ljava/lang/String;")
	public static String aString339 = "Continue";

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IZI[Lclient!ne;II[BI)[I")
	public static int[] method4758(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class118[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6) {
		@Pc(5) byte local5;
		if (arg1) {
			local5 = 1;
		} else {
			local5 = 4;
		}
		@Pc(23) int local23;
		@Pc(30) int local30;
		if (!arg1) {
			for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
				for (local23 = 0; local23 < 64; local23++) {
					for (local30 = 0; local30 < 64; local30++) {
						if (local23 + arg0 > 0 && arg0 + local23 < 103 && local30 + arg6 > 0 && arg6 + local30 < 103) {
							arg3[local18].anIntArrayArray28[arg0 + local23][local30 + arg6] &= 0xFFDFFFFF;
						}
					}
				}
			}
		}
		@Pc(102) Class1_Sub14 local102 = new Class1_Sub14(arg5);
		local30 = arg4 + arg6;
		local23 = arg0 + arg2;
		@Pc(129) int local129;
		for (@Pc(113) int local113 = 0; local113 < local5; local113++) {
			for (@Pc(124) int local124 = 0; local124 < 64; local124++) {
				for (local129 = 0; local129 < 64; local129++) {
					Static61.method1109(0, arg1, local129 + local30, local102, 0, 0, false, arg6 + local129, local124 + local23, arg0 + local124, local113);
				}
			}
		}
		@Pc(166) boolean local166 = false;
		@Pc(168) boolean local168 = false;
		@Pc(238) int local238;
		@Pc(253) int local253;
		@Pc(251) int local251;
		@Pc(272) int local272;
		@Pc(307) int local307;
		while (local102.anInt1480 < local102.aByteArray17.length) {
			local129 = local102.method1378();
			if (local129 == 128) {
				local166 = true;
				Static174.anIntArray284[0] = local102.method1386();
				Static174.anIntArray284[1] = local102.method1356();
				Static174.anIntArray284[2] = local102.method1356();
				Static174.anIntArray284[3] = local102.method1356();
				Static174.anIntArray284[4] = local102.method1386();
			} else {
				if (local129 != 129) {
					local102.anInt1480--;
					break;
				}
				for (local238 = 0; local238 < 4; local238++) {
					@Pc(245) byte local245 = local102.method1363();
					if (local245 == 0) {
						local251 = arg0 + 64;
						local253 = arg0;
						if (local251 < 0) {
							local251 = 0;
						} else if (local251 >= 104) {
							local251 = 104;
						}
						local272 = arg6;
						if (arg0 < 0) {
							local253 = 0;
						} else if (arg0 >= 104) {
							local253 = 104;
						}
						if (arg6 < 0) {
							local272 = 0;
						} else if (arg6 >= 104) {
							local272 = 104;
						}
						local307 = arg6 + 64;
						if (local307 < 0) {
							local307 = 0;
						} else if (local307 >= 104) {
							local307 = 104;
						}
						while (local251 > local253) {
							while (local307 > local272) {
								Static43.aByteArrayArrayArray1[local238][local253][local272] = 0;
								local272++;
							}
							local253++;
						}
					} else if (local245 == 1) {
						for (local253 = 0; local253 < 64; local253 += 4) {
							for (local251 = 0; local251 < 64; local251 += 4) {
								@Pc(373) byte local373 = local102.method1363();
								for (local307 = local253 + arg0; local307 < local253 + arg0 + 4; local307++) {
									for (@Pc(388) int local388 = local251 + arg6; local388 < arg6 + local251 + 4; local388++) {
										if (local307 >= 0 && local307 < 104 && local388 >= 0 && local388 < 104) {
											Static43.aByteArrayArrayArray1[local238][local307][local388] = local373;
										}
									}
								}
							}
						}
					} else if (local245 == 2 && local238 > 0) {
						local251 = arg0 + 64;
						local272 = arg6;
						if (arg6 < 0) {
							local272 = 0;
						} else if (arg6 >= 104) {
							local272 = 104;
						}
						if (local251 < 0) {
							local251 = 0;
						} else if (local251 >= 104) {
							local251 = 104;
						}
						local253 = arg0;
						if (arg0 < 0) {
							local253 = 0;
						} else if (arg0 >= 104) {
							local253 = 104;
						}
						local307 = arg6 + 64;
						if (local307 < 0) {
							local307 = 0;
						} else if (local307 >= 104) {
							local307 = 104;
						}
						while (local251 > local253) {
							while (local307 > local272) {
								Static43.aByteArrayArrayArray1[local238][local253][local272] = Static43.aByteArrayArrayArray1[local238 - 1][local253][local272];
								local272++;
							}
							local253++;
						}
					}
				}
				local168 = true;
			}
		}
		@Pc(587) int local587;
		if (Static156.aBoolean211 && !arg1) {
			@Pc(554) Class126 local554 = null;
			while (true) {
				while (local102.anInt1480 < local102.aByteArray17.length) {
					local238 = local102.method1378();
					if (local238 == 0) {
						local554 = new Class126(local102);
					} else if (local238 == 1) {
						local587 = local102.method1378();
						if (local587 > 0) {
							for (local253 = 0; local253 < local587; local253++) {
								@Pc(606) Class61 local606 = new Class61(local102);
								if (local606.anInt1997 == 31) {
									@Pc(616) Class92 local616 = Static51.method953(local102.method1386());
									local606.method1805(local616.anInt2896, local616.anInt2898, local616.anInt2905, local616.anInt2893);
								}
								local606.anInt2006 += arg6 << 7;
								local606.anInt2004 += arg0 << 7;
								local272 = local606.anInt2004 >> 7;
								local307 = local606.anInt2006 >> 7;
								if (local272 >= 0 && local307 >= 0 && local272 < 104 && local307 < 104) {
									local606.aBoolean111 = (Static104.aByteArrayArrayArray3[1][local272][local307] & 0x2) != 0;
									local606.anInt1993 = Static24.anIntArrayArrayArray2[local606.anInt1999][local272][local307] - local606.anInt1993;
									Static101.method1825(local606);
								}
							}
						}
					} else if (local238 == 2) {
						if (local554 == null) {
							local554 = new Class126();
						}
						local554.method3203(local102);
					} else {
						throw new IllegalStateException();
					}
				}
				if (local554 == null) {
					local554 = new Class126();
				}
				for (local238 = 0; local238 < 8; local238++) {
					for (local587 = 0; local587 < 8; local587++) {
						local253 = local238 + (arg0 >> 3);
						local251 = (arg6 >> 3) + local587;
						if (local253 >= 0 && local253 < 13 && local251 >= 0 && local251 < 13) {
							Static85.aClass126ArrayArray1[local253][local251] = local554;
						}
					}
				}
				break;
			}
		}
		if (!local168) {
			for (local129 = 0; local129 < 4; local129++) {
				for (local238 = 0; local238 < 16; local238++) {
					for (local587 = 0; local587 < 16; local587++) {
						local253 = (arg0 >> 2) + local238;
						local251 = local587 + (arg6 >> 2);
						if (local253 >= 0 && local253 < 26 && local251 >= 0 && local251 < 26) {
							Static43.aByteArrayArrayArray1[local129][local253][local251] = 0;
						}
					}
				}
			}
		}
		return local166 ? Static174.anIntArray284 : null;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(BI)V")
	public static void method4759() {
		Static53.aClass187_33.method4534(5);
		Static182.aClass187_93.method4534(5);
	}
}
