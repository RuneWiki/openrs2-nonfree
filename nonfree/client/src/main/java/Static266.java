import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!ne", name = "R", descriptor = "Z")
	public static boolean aBoolean321;

	@OriginalMember(owner = "client!ne", name = "J", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_73 = new Class177(45, 3);

	@OriginalMember(owner = "client!ne", name = "K", descriptor = "I")
	public static int anInt5157 = 0;

	@OriginalMember(owner = "client!ne", name = "M", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_120 = new Class263(73, 5);

	@OriginalMember(owner = "client!ne", name = "O", descriptor = "[I")
	public static final int[] anIntArray487 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!ne", name = "P", descriptor = "Lclient!wv;")
	public static final Class272 aClass272_3 = new Class272("stellardawn", 1);

	@OriginalMember(owner = "client!ne", name = "Q", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_121 = new Class263(43, 0);

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(B)V")
	public static void method3952() {
		for (@Pc(6) Class41_Sub2 local6 = (Class41_Sub2) Static251.aClass117_7.method2958(); local6 != null; local6 = (Class41_Sub2) Static251.aClass117_7.method2958()) {
			Static435.method5862(local6);
		}
		@Pc(36) int local36;
		@Pc(35) int local35;
		if (Static12.aClass34_Sub1_1.method5471(Static262.anInt2805)) {
			local35 = 3;
			local36 = 0;
		} else {
			local35 = Static313.anInt5847;
			local36 = Static313.anInt5847;
		}
		Static55.method1061();
		for (@Pc(45) int local45 = local36; local45 <= local35; local45++) {
			Static55.method1053();
			Static55.method1050(local45);
			Static55.method1051(local45);
		}
		Static55.method1057();
		Static55.method1046();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "()V")
	public static void method3954() {
		Static96.anInt2298 = 0;
		label208: for (@Pc(3) int local3 = 0; local3 < Static156.anInt3364; local3++) {
			@Pc(8) Class230 local8 = Static160.aClass230Array1[local3];
			@Pc(12) int local12;
			if (Static309.anIntArray740 != null) {
				for (local12 = 0; local12 < Static309.anIntArray740.length; local12++) {
					if (Static309.anIntArray740[local12] != -1000000 && (local8.anInt6720 <= Static309.anIntArray740[local12] || local8.anInt6714 <= Static309.anIntArray740[local12]) && (local8.anInt6701 <= Static19.anIntArray33[local12] || local8.anInt6710 <= Static19.anIntArray33[local12]) && (local8.anInt6701 >= Static445.anIntArray720[local12] || local8.anInt6710 >= Static445.anIntArray720[local12]) && (local8.anInt6712 <= Static42.anIntArray107[local12] || local8.anInt6715 <= Static42.anIntArray107[local12]) && (local8.anInt6712 >= Static83.anIntArray218[local12] || local8.anInt6715 >= Static83.anIntArray218[local12])) {
						continue label208;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(128) int local128;
			@Pc(164) int local164;
			@Pc(143) boolean local143;
			if (local8.anInt6707 == 1) {
				local12 = local8.anInt6703 + Static235.anInt4661 - Static166.anInt3464;
				if (local12 >= 0 && local12 <= Static235.anInt4661 + Static235.anInt4661) {
					local110 = local8.anInt6722 + Static235.anInt4661 - Static31.anInt2066;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static235.anInt4661 + Static235.anInt4661) {
						continue;
					}
					local128 = local8.anInt6713 + Static235.anInt4661 - Static31.anInt2066;
					if (local128 > Static235.anInt4661 + Static235.anInt4661) {
						local128 = Static235.anInt4661 + Static235.anInt4661;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static335.aBooleanArrayArray4[local12][local110++]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static17.anInt393 - local8.anInt6701;
						if (local164 > Static45.anInt1145) {
							local8.anInt6704 = 1;
						} else {
							if (local164 >= -Static45.anInt1145) {
								continue;
							}
							local8.anInt6704 = 2;
							local164 = -local164;
						}
						local8.anInt6708 = (local8.anInt6712 - Static237.anInt4683 << 8) / local164;
						local8.anInt6700 = (local8.anInt6715 - Static237.anInt4683 << 8) / local164;
						local8.anInt6716 = (local8.anInt6720 - Static379.anInt6891 << 8) / local164;
						local8.anInt6718 = (local8.anInt6714 - Static379.anInt6891 << 8) / local164;
						Static316.aClass230Array2[Static96.anInt2298++] = local8;
					}
				}
			} else if (local8.anInt6707 == 2) {
				local12 = local8.anInt6722 + Static235.anInt4661 - Static31.anInt2066;
				if (local12 >= 0 && local12 <= Static235.anInt4661 + Static235.anInt4661) {
					local110 = local8.anInt6703 + Static235.anInt4661 - Static166.anInt3464;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static235.anInt4661 + Static235.anInt4661) {
						continue;
					}
					local128 = local8.anInt6702 + Static235.anInt4661 - Static166.anInt3464;
					if (local128 > Static235.anInt4661 + Static235.anInt4661) {
						local128 = Static235.anInt4661 + Static235.anInt4661;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static335.aBooleanArrayArray4[local110++][local12]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static237.anInt4683 - local8.anInt6712;
						if (local164 > Static45.anInt1145) {
							local8.anInt6704 = 3;
						} else {
							if (local164 >= -Static45.anInt1145) {
								continue;
							}
							local8.anInt6704 = 4;
							local164 = -local164;
						}
						local8.anInt6717 = (local8.anInt6701 - Static17.anInt393 << 8) / local164;
						local8.anInt6721 = (local8.anInt6710 - Static17.anInt393 << 8) / local164;
						local8.anInt6716 = (local8.anInt6720 - Static379.anInt6891 << 8) / local164;
						local8.anInt6718 = (local8.anInt6714 - Static379.anInt6891 << 8) / local164;
						Static316.aClass230Array2[Static96.anInt2298++] = local8;
					}
				}
			} else if (local8.anInt6707 == 4) {
				local12 = local8.anInt6720 - Static379.anInt6891;
				if (local12 > Static367.anInt6709) {
					local110 = local8.anInt6722 + Static235.anInt4661 - Static31.anInt2066;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static235.anInt4661 + Static235.anInt4661) {
						continue;
					}
					local128 = local8.anInt6713 + Static235.anInt4661 - Static31.anInt2066;
					if (local128 > Static235.anInt4661 + Static235.anInt4661) {
						local128 = Static235.anInt4661 + Static235.anInt4661;
					} else if (local128 < 0) {
						continue;
					}
					@Pc(435) int local435 = local8.anInt6703 + Static235.anInt4661 - Static166.anInt3464;
					if (local435 < 0) {
						local435 = 0;
					} else if (local435 > Static235.anInt4661 + Static235.anInt4661) {
						continue;
					}
					local164 = local8.anInt6702 + Static235.anInt4661 - Static166.anInt3464;
					if (local164 > Static235.anInt4661 + Static235.anInt4661) {
						local164 = Static235.anInt4661 + Static235.anInt4661;
					} else if (local164 < 0) {
						continue;
					}
					@Pc(468) boolean local468 = false;
					label180: for (@Pc(470) int local470 = local435; local470 <= local164; local470++) {
						for (@Pc(473) int local473 = local110; local473 <= local128; local473++) {
							if (Static335.aBooleanArrayArray4[local470][local473]) {
								local468 = true;
								break label180;
							}
						}
					}
					if (local468) {
						local8.anInt6704 = 5;
						local8.anInt6717 = (local8.anInt6701 - Static17.anInt393 << 8) / local12;
						local8.anInt6721 = (local8.anInt6710 - Static17.anInt393 << 8) / local12;
						local8.anInt6708 = (local8.anInt6712 - Static237.anInt4683 << 8) / local12;
						local8.anInt6700 = (local8.anInt6715 - Static237.anInt4683 << 8) / local12;
						Static316.aClass230Array2[Static96.anInt2298++] = local8;
					}
				}
			}
		}
	}
}
