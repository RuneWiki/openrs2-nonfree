import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "I")
	public static int anInt6954;

	@OriginalMember(owner = "client!vv", name = "s", descriptor = "Lclient!du;")
	public static final Class62 aClass62_39 = new Class62(11, 3);

	@OriginalMember(owner = "client!vv", name = "t", descriptor = "[Lclient!wo;")
	public static final Interface13[] anInterface13Array2 = new Interface13[75];

	@OriginalMember(owner = "client!vv", name = "u", descriptor = "Z")
	public static boolean aBoolean605 = false;

	@OriginalMember(owner = "client!vv", name = "v", descriptor = "Z")
	public static boolean aBoolean606 = true;

	@OriginalMember(owner = "client!vv", name = "x", descriptor = "[I")
	public static final int[] anIntArray509 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(II)V")
	public static void method5526(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub3_Sub1 local8 = Static427.method5426(arg0, 3);
		local8.method385();
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "()V")
	public static void method5527() {
		Static391.anInt6296 = 0;
		label208: for (@Pc(3) int local3 = 0; local3 < Static269.anInt4694; local3++) {
			@Pc(8) Class254 local8 = Static350.aClass254Array2[local3];
			@Pc(12) int local12;
			if (Static336.anIntArray399 != null) {
				for (local12 = 0; local12 < Static336.anIntArray399.length; local12++) {
					if (Static336.anIntArray399[local12] != -1000000 && (local8.anInt6683 <= Static336.anIntArray399[local12] || local8.anInt6671 <= Static336.anIntArray399[local12]) && (local8.anInt6686 <= Static115.anIntArray156[local12] || local8.anInt6675 <= Static115.anIntArray156[local12]) && (local8.anInt6686 >= Static247.anIntArray326[local12] || local8.anInt6675 >= Static247.anIntArray326[local12]) && (local8.anInt6688 <= Static47.anIntArray102[local12] || local8.anInt6677 <= Static47.anIntArray102[local12]) && (local8.anInt6688 >= Static4.anIntArray3[local12] || local8.anInt6677 >= Static4.anIntArray3[local12])) {
						continue label208;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(128) int local128;
			@Pc(164) int local164;
			@Pc(143) boolean local143;
			if (local8.anInt6681 == 1) {
				local12 = local8.anInt6674 + Static99.anInt1331 - Static166.anInt2722;
				if (local12 >= 0 && local12 <= Static99.anInt1331 + Static99.anInt1331) {
					local110 = local8.anInt6673 + Static99.anInt1331 - Static44.anInt638;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static99.anInt1331 + Static99.anInt1331) {
						continue;
					}
					local128 = local8.anInt6680 + Static99.anInt1331 - Static44.anInt638;
					if (local128 > Static99.anInt1331 + Static99.anInt1331) {
						local128 = Static99.anInt1331 + Static99.anInt1331;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static84.aBooleanArrayArray3[local12][local110++]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static188.anInt3434 - local8.anInt6686;
						if (local164 > Static404.anInt6474) {
							local8.anInt6679 = 1;
						} else {
							if (local164 >= -Static404.anInt6474) {
								continue;
							}
							local8.anInt6679 = 2;
							local164 = -local164;
						}
						local8.anInt6672 = (local8.anInt6688 - Static197.anInt3614 << 8) / local164;
						local8.anInt6687 = (local8.anInt6677 - Static197.anInt3614 << 8) / local164;
						local8.anInt6685 = (local8.anInt6683 - Static24.anInt353 << 8) / local164;
						local8.anInt6678 = (local8.anInt6671 - Static24.anInt353 << 8) / local164;
						Static331.aClass254Array1[Static391.anInt6296++] = local8;
					}
				}
			} else if (local8.anInt6681 == 2) {
				local12 = local8.anInt6673 + Static99.anInt1331 - Static44.anInt638;
				if (local12 >= 0 && local12 <= Static99.anInt1331 + Static99.anInt1331) {
					local110 = local8.anInt6674 + Static99.anInt1331 - Static166.anInt2722;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static99.anInt1331 + Static99.anInt1331) {
						continue;
					}
					local128 = local8.anInt6684 + Static99.anInt1331 - Static166.anInt2722;
					if (local128 > Static99.anInt1331 + Static99.anInt1331) {
						local128 = Static99.anInt1331 + Static99.anInt1331;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static84.aBooleanArrayArray3[local110++][local12]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static197.anInt3614 - local8.anInt6688;
						if (local164 > Static404.anInt6474) {
							local8.anInt6679 = 3;
						} else {
							if (local164 >= -Static404.anInt6474) {
								continue;
							}
							local8.anInt6679 = 4;
							local164 = -local164;
						}
						local8.anInt6689 = (local8.anInt6686 - Static188.anInt3434 << 8) / local164;
						local8.anInt6682 = (local8.anInt6675 - Static188.anInt3434 << 8) / local164;
						local8.anInt6685 = (local8.anInt6683 - Static24.anInt353 << 8) / local164;
						local8.anInt6678 = (local8.anInt6671 - Static24.anInt353 << 8) / local164;
						Static331.aClass254Array1[Static391.anInt6296++] = local8;
					}
				}
			} else if (local8.anInt6681 == 4) {
				local12 = local8.anInt6683 - Static24.anInt353;
				if (local12 > Static340.anInt5525) {
					local110 = local8.anInt6673 + Static99.anInt1331 - Static44.anInt638;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static99.anInt1331 + Static99.anInt1331) {
						continue;
					}
					local128 = local8.anInt6680 + Static99.anInt1331 - Static44.anInt638;
					if (local128 > Static99.anInt1331 + Static99.anInt1331) {
						local128 = Static99.anInt1331 + Static99.anInt1331;
					} else if (local128 < 0) {
						continue;
					}
					@Pc(435) int local435 = local8.anInt6674 + Static99.anInt1331 - Static166.anInt2722;
					if (local435 < 0) {
						local435 = 0;
					} else if (local435 > Static99.anInt1331 + Static99.anInt1331) {
						continue;
					}
					local164 = local8.anInt6684 + Static99.anInt1331 - Static166.anInt2722;
					if (local164 > Static99.anInt1331 + Static99.anInt1331) {
						local164 = Static99.anInt1331 + Static99.anInt1331;
					} else if (local164 < 0) {
						continue;
					}
					@Pc(468) boolean local468 = false;
					label180: for (@Pc(470) int local470 = local435; local470 <= local164; local470++) {
						for (@Pc(473) int local473 = local110; local473 <= local128; local473++) {
							if (Static84.aBooleanArrayArray3[local470][local473]) {
								local468 = true;
								break label180;
							}
						}
					}
					if (local468) {
						local8.anInt6679 = 5;
						local8.anInt6689 = (local8.anInt6686 - Static188.anInt3434 << 8) / local12;
						local8.anInt6682 = (local8.anInt6675 - Static188.anInt3434 << 8) / local12;
						local8.anInt6672 = (local8.anInt6688 - Static197.anInt3614 << 8) / local12;
						local8.anInt6687 = (local8.anInt6677 - Static197.anInt3614 << 8) / local12;
						Static331.aClass254Array1[Static391.anInt6296++] = local8;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)V")
	public static void method5528() {
		@Pc(5) int local5 = 0;
		if (Static126.aClass19_Sub1_1.method3339(Static214.anInt3968)) {
			local5 = 55;
		}
		if (!Static126.aClass19_Sub1_1.aBoolean376) {
			local5 |= 0x40;
		}
		Static127.method1580(local5);
		Static86.aClass248_7.method5247(local5);
		Static285.aClass226_2.method4784(local5);
		Static428.aClass196_1.method4167(local5);
		Static46.aClass123_5.method2676(local5);
		Static306.method4068(local5);
		Static67.method5766(local5);
		Static424.method5417(local5);
		Static328.method4318(local5);
		Static200.method2868();
	}
}
