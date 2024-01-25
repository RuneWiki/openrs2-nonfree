import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!qi", name = "m", descriptor = "Lclient!qf;")
	public static Class187 aClass187_2;

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
	public static int anInt5633 = 0;

	@OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
	public static int anInt5636 = -1;

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "[I")
	public static final int[] anIntArray445 = new int[4096];

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)V")
	public static void method4528(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub2_Sub1 local12 = Static258.method5559(arg1, 6);
		local12.method202();
		local12.anInt214 = arg0;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "()V")
	public static void method4532() {
		Static172.anInt3166 = 0;
		label208: for (@Pc(3) int local3 = 0; local3 < Static361.anInt6131; local3++) {
			@Pc(8) Class226 local8 = Static179.aClass226Array1[local3];
			@Pc(12) int local12;
			if (Static383.anIntArray543 != null) {
				for (local12 = 0; local12 < Static383.anIntArray543.length; local12++) {
					if (Static383.anIntArray543[local12] != -1000000 && (local8.anInt6773 <= Static383.anIntArray543[local12] || local8.anInt6788 <= Static383.anIntArray543[local12]) && (local8.anInt6784 <= Static356.anIntArray485[local12] || local8.anInt6768 <= Static356.anIntArray485[local12]) && (local8.anInt6784 >= Static349.anIntArray92[local12] || local8.anInt6768 >= Static349.anIntArray92[local12]) && (local8.anInt6774 <= Static4.anIntArray5[local12] || local8.anInt6789 <= Static4.anIntArray5[local12]) && (local8.anInt6774 >= Static284.anIntArray400[local12] || local8.anInt6789 >= Static284.anIntArray400[local12])) {
						continue label208;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(128) int local128;
			@Pc(164) int local164;
			@Pc(143) boolean local143;
			if (local8.anInt6778 == 1) {
				local12 = local8.anInt6776 + Static11.anInt315 - Static384.anInt6665;
				if (local12 >= 0 && local12 <= Static11.anInt315 + Static11.anInt315) {
					local110 = local8.anInt6783 + Static11.anInt315 - Static379.anInt6498;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static11.anInt315 + Static11.anInt315) {
						continue;
					}
					local128 = local8.anInt6779 + Static11.anInt315 - Static379.anInt6498;
					if (local128 > Static11.anInt315 + Static11.anInt315) {
						local128 = Static11.anInt315 + Static11.anInt315;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static250.aBooleanArrayArray3[local12][local110++]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static251.anInt4514 - local8.anInt6784;
						if (local164 > Static13.anInt328) {
							local8.anInt6785 = 1;
						} else {
							if (local164 >= -Static13.anInt328) {
								continue;
							}
							local8.anInt6785 = 2;
							local164 = -local164;
						}
						local8.anInt6782 = (local8.anInt6774 - Static424.anInt7347 << 8) / local164;
						local8.anInt6766 = (local8.anInt6789 - Static424.anInt7347 << 8) / local164;
						local8.anInt6771 = (local8.anInt6773 - Static223.anInt4013 << 8) / local164;
						local8.anInt6780 = (local8.anInt6788 - Static223.anInt4013 << 8) / local164;
						Static446.aClass226Array2[Static172.anInt3166++] = local8;
					}
				}
			} else if (local8.anInt6778 == 2) {
				local12 = local8.anInt6783 + Static11.anInt315 - Static379.anInt6498;
				if (local12 >= 0 && local12 <= Static11.anInt315 + Static11.anInt315) {
					local110 = local8.anInt6776 + Static11.anInt315 - Static384.anInt6665;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static11.anInt315 + Static11.anInt315) {
						continue;
					}
					local128 = local8.anInt6781 + Static11.anInt315 - Static384.anInt6665;
					if (local128 > Static11.anInt315 + Static11.anInt315) {
						local128 = Static11.anInt315 + Static11.anInt315;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static250.aBooleanArrayArray3[local110++][local12]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static424.anInt7347 - local8.anInt6774;
						if (local164 > Static13.anInt328) {
							local8.anInt6785 = 3;
						} else {
							if (local164 >= -Static13.anInt328) {
								continue;
							}
							local8.anInt6785 = 4;
							local164 = -local164;
						}
						local8.anInt6769 = (local8.anInt6784 - Static251.anInt4514 << 8) / local164;
						local8.anInt6770 = (local8.anInt6768 - Static251.anInt4514 << 8) / local164;
						local8.anInt6771 = (local8.anInt6773 - Static223.anInt4013 << 8) / local164;
						local8.anInt6780 = (local8.anInt6788 - Static223.anInt4013 << 8) / local164;
						Static446.aClass226Array2[Static172.anInt3166++] = local8;
					}
				}
			} else if (local8.anInt6778 == 4) {
				local12 = local8.anInt6773 - Static223.anInt4013;
				if (local12 > Static238.anInt4271) {
					local110 = local8.anInt6783 + Static11.anInt315 - Static379.anInt6498;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static11.anInt315 + Static11.anInt315) {
						continue;
					}
					local128 = local8.anInt6779 + Static11.anInt315 - Static379.anInt6498;
					if (local128 > Static11.anInt315 + Static11.anInt315) {
						local128 = Static11.anInt315 + Static11.anInt315;
					} else if (local128 < 0) {
						continue;
					}
					@Pc(435) int local435 = local8.anInt6776 + Static11.anInt315 - Static384.anInt6665;
					if (local435 < 0) {
						local435 = 0;
					} else if (local435 > Static11.anInt315 + Static11.anInt315) {
						continue;
					}
					local164 = local8.anInt6781 + Static11.anInt315 - Static384.anInt6665;
					if (local164 > Static11.anInt315 + Static11.anInt315) {
						local164 = Static11.anInt315 + Static11.anInt315;
					} else if (local164 < 0) {
						continue;
					}
					@Pc(468) boolean local468 = false;
					label180: for (@Pc(470) int local470 = local435; local470 <= local164; local470++) {
						for (@Pc(473) int local473 = local110; local473 <= local128; local473++) {
							if (Static250.aBooleanArrayArray3[local470][local473]) {
								local468 = true;
								break label180;
							}
						}
					}
					if (local468) {
						local8.anInt6785 = 5;
						local8.anInt6769 = (local8.anInt6784 - Static251.anInt4514 << 8) / local12;
						local8.anInt6770 = (local8.anInt6768 - Static251.anInt4514 << 8) / local12;
						local8.anInt6782 = (local8.anInt6774 - Static424.anInt7347 << 8) / local12;
						local8.anInt6766 = (local8.anInt6789 - Static424.anInt7347 << 8) / local12;
						Static446.aClass226Array2[Static172.anInt3166++] = local8;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method4533(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) long local15 = 0L;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			local15 = (long) arg0.charAt(local17) + (local15 << 5) - local15;
		}
		return local15;
	}
}
