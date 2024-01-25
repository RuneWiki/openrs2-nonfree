import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!kn", name = "l", descriptor = "Lclient!mg;")
	public static Class160 aClass160_38;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(III)Z")
	public static boolean method3261(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZLclient!cu;)Z")
	public static boolean method3266(@OriginalArg(1) Class48 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean70) {
			return false;
		} else if (!arg0.method932(Static88.anInterface12_2)) {
			return false;
		} else if (Static308.aClass163_35.method3769((long) arg0.anInt1221) == null) {
			return Static142.aClass163_14.method3769((long) arg0.anInt1195) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "()V")
	public static void method3270() {
		Static405.anInt6755 = 0;
		label208: for (@Pc(3) int local3 = 0; local3 < Static358.anInt6072; local3++) {
			@Pc(8) Class210 local8 = Static143.aClass210Array1[local3];
			@Pc(12) int local12;
			if (Static156.anIntArray283 != null) {
				for (local12 = 0; local12 < Static156.anIntArray283.length; local12++) {
					if (Static156.anIntArray283[local12] != -1000000 && (local8.anInt5789 <= Static156.anIntArray283[local12] || local8.anInt5776 <= Static156.anIntArray283[local12]) && (local8.anInt5774 <= Static396.anIntArray557[local12] || local8.anInt5793 <= Static396.anIntArray557[local12]) && (local8.anInt5774 >= Static181.anIntArray311[local12] || local8.anInt5793 >= Static181.anIntArray311[local12]) && (local8.anInt5779 <= Static305.anIntArray440[local12] || local8.anInt5794 <= Static305.anIntArray440[local12]) && (local8.anInt5779 >= Static195.anIntArray330[local12] || local8.anInt5794 >= Static195.anIntArray330[local12])) {
						continue label208;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(128) int local128;
			@Pc(164) int local164;
			@Pc(143) boolean local143;
			if (local8.anInt5783 == 1) {
				local12 = local8.anInt5784 + Static182.anInt3568 - Static312.anInt5514;
				if (local12 >= 0 && local12 <= Static182.anInt3568 + Static182.anInt3568) {
					local110 = local8.anInt5780 + Static182.anInt3568 - Static402.anInt6690;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static182.anInt3568 + Static182.anInt3568) {
						continue;
					}
					local128 = local8.anInt5797 + Static182.anInt3568 - Static402.anInt6690;
					if (local128 > Static182.anInt3568 + Static182.anInt3568) {
						local128 = Static182.anInt3568 + Static182.anInt3568;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static281.aBooleanArrayArray41[local12][local110++]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static123.anInt2736 - local8.anInt5774;
						if (local164 > Static368.anInt6317) {
							local8.anInt5786 = 1;
						} else {
							if (local164 >= -Static368.anInt6317) {
								continue;
							}
							local8.anInt5786 = 2;
							local164 = -local164;
						}
						local8.anInt5792 = (local8.anInt5779 - Static201.anInt3541 << 8) / local164;
						local8.anInt5782 = (local8.anInt5794 - Static201.anInt3541 << 8) / local164;
						local8.anInt5781 = (local8.anInt5789 - Static125.anInt2740 << 8) / local164;
						local8.anInt5778 = (local8.anInt5776 - Static125.anInt2740 << 8) / local164;
						Static385.aClass210Array2[Static405.anInt6755++] = local8;
					}
				}
			} else if (local8.anInt5783 == 2) {
				local12 = local8.anInt5780 + Static182.anInt3568 - Static402.anInt6690;
				if (local12 >= 0 && local12 <= Static182.anInt3568 + Static182.anInt3568) {
					local110 = local8.anInt5784 + Static182.anInt3568 - Static312.anInt5514;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static182.anInt3568 + Static182.anInt3568) {
						continue;
					}
					local128 = local8.anInt5791 + Static182.anInt3568 - Static312.anInt5514;
					if (local128 > Static182.anInt3568 + Static182.anInt3568) {
						local128 = Static182.anInt3568 + Static182.anInt3568;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static281.aBooleanArrayArray41[local110++][local12]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static201.anInt3541 - local8.anInt5779;
						if (local164 > Static368.anInt6317) {
							local8.anInt5786 = 3;
						} else {
							if (local164 >= -Static368.anInt6317) {
								continue;
							}
							local8.anInt5786 = 4;
							local164 = -local164;
						}
						local8.anInt5775 = (local8.anInt5774 - Static123.anInt2736 << 8) / local164;
						local8.anInt5796 = (local8.anInt5793 - Static123.anInt2736 << 8) / local164;
						local8.anInt5781 = (local8.anInt5789 - Static125.anInt2740 << 8) / local164;
						local8.anInt5778 = (local8.anInt5776 - Static125.anInt2740 << 8) / local164;
						Static385.aClass210Array2[Static405.anInt6755++] = local8;
					}
				}
			} else if (local8.anInt5783 == 4) {
				local12 = local8.anInt5789 - Static125.anInt2740;
				if (local12 > Static314.anInt5536) {
					local110 = local8.anInt5780 + Static182.anInt3568 - Static402.anInt6690;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static182.anInt3568 + Static182.anInt3568) {
						continue;
					}
					local128 = local8.anInt5797 + Static182.anInt3568 - Static402.anInt6690;
					if (local128 > Static182.anInt3568 + Static182.anInt3568) {
						local128 = Static182.anInt3568 + Static182.anInt3568;
					} else if (local128 < 0) {
						continue;
					}
					@Pc(435) int local435 = local8.anInt5784 + Static182.anInt3568 - Static312.anInt5514;
					if (local435 < 0) {
						local435 = 0;
					} else if (local435 > Static182.anInt3568 + Static182.anInt3568) {
						continue;
					}
					local164 = local8.anInt5791 + Static182.anInt3568 - Static312.anInt5514;
					if (local164 > Static182.anInt3568 + Static182.anInt3568) {
						local164 = Static182.anInt3568 + Static182.anInt3568;
					} else if (local164 < 0) {
						continue;
					}
					@Pc(468) boolean local468 = false;
					label180: for (@Pc(470) int local470 = local435; local470 <= local164; local470++) {
						for (@Pc(473) int local473 = local110; local473 <= local128; local473++) {
							if (Static281.aBooleanArrayArray41[local470][local473]) {
								local468 = true;
								break label180;
							}
						}
					}
					if (local468) {
						local8.anInt5786 = 5;
						local8.anInt5775 = (local8.anInt5774 - Static123.anInt2736 << 8) / local12;
						local8.anInt5796 = (local8.anInt5793 - Static123.anInt2736 << 8) / local12;
						local8.anInt5792 = (local8.anInt5779 - Static201.anInt3541 << 8) / local12;
						local8.anInt5782 = (local8.anInt5794 - Static201.anInt3541 << 8) / local12;
						Static385.aClass210Array2[Static405.anInt6755++] = local8;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIII)V")
	public static void method3272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 >= arg1) {
			Static64.method1247(arg1, Static280.anIntArrayArray51[arg2], arg3, arg0);
		} else {
			Static64.method1247(arg3, Static280.anIntArrayArray51[arg2], arg1, arg0);
		}
	}
}
