import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
	public static int anInt3912;

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "J")
	public static long aLong139 = 0L;

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!ij;Lclient!ij;Lclient!ij;B)V")
	public static void method3478(@OriginalArg(0) Class93 arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) Class93 arg2) {
		Static123.aClass93_49 = arg2;
		Static162.method2861(arg0, arg1);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IB)V")
	public static void method3479(@OriginalArg(0) int arg0) {
		Static258.method4531();
		@Pc(10) int local10 = Static313.method5470(arg0).anInt6578;
		if (local10 == 0) {
			return;
		}
		@Pc(20) int local20 = Static134.anIntArray205[arg0];
		if (local10 == 6) {
			Static275.anInt5464 = local20;
		}
		if (local10 == 5) {
			Static267.anInt5259 = local20;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IZLclient!ea;)V")
	public static void method3480(@OriginalArg(0) int arg0, @OriginalArg(2) Class55 arg1) {
		Static350.method5960(arg1);
		@Pc(14) int local14;
		@Pc(18) int local18;
		if (arg0 > 1) {
			for (local14 = 0; local14 < Static22.anInt481; local14++) {
				for (local18 = 0; local18 < Static269.anInt5281; local18++) {
					if ((Static255.aByteArrayArrayArray13[1][local14][local18] & 0x2) == 2) {
						Static216.method3986(local14, local18);
					}
				}
			}
		}
		for (local14 = 0; local14 < arg0; local14++) {
			for (local18 = 0; local18 <= Static269.anInt5281; local18++) {
				for (@Pc(62) int local62 = 0; local62 <= Static22.anInt481; local62++) {
					@Pc(79) int local79;
					@Pc(81) int local81;
					@Pc(83) int local83;
					@Pc(123) int local123;
					@Pc(127) int local127;
					@Pc(221) int local221;
					@Pc(229) int local229;
					@Pc(249) int local249;
					@Pc(253) int local253;
					if ((Static8.aByteArrayArrayArray3[local14][local62][local18] & 0x1) != 0) {
						local79 = local18;
						local81 = local18;
						local83 = local14;
						while (local79 > 0 && (Static8.aByteArrayArrayArray3[local14][local62][local79 - 1] & 0x1) != 0) {
							local79--;
						}
						while (local81 < Static269.anInt5281 && (Static8.aByteArrayArrayArray3[local14][local62][local81 + 1] & 0x1) != 0) {
							local81++;
						}
						local123 = local14;
						label164: while (local83 > 0) {
							for (local127 = local79; local127 <= local81; local127++) {
								if ((Static8.aByteArrayArrayArray3[local83 - 1][local62][local127] & 0x1) == 0) {
									break label164;
								}
							}
							local83--;
						}
						label153: while (local123 < 3) {
							for (local127 = local79; local127 <= local81; local127++) {
								if ((Static8.aByteArrayArrayArray3[local123 + 1][local62][local127] & 0x1) == 0) {
									break label153;
								}
							}
							local123++;
						}
						local127 = (local81 + 1 - local79) * (local123 + 1 - local83);
						if (local127 >= 2) {
							local221 = Static217.anIntArrayArrayArray8[local123][local62][local79] - 240;
							local229 = Static217.anIntArrayArrayArray8[local83][local62][local79];
							Static6.method102(1, local62 * 128, local62 * 128, local79 * 128, local81 * 128 + 128, local221, local229);
							for (local249 = local83; local249 <= local123; local249++) {
								for (local253 = local79; local253 <= local81; local253++) {
									Static8.aByteArrayArrayArray3[local249][local62][local253] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((Static8.aByteArrayArrayArray3[local14][local62][local18] & 0x2) != 0) {
						local79 = local62;
						local81 = local62;
						local83 = local14;
						local123 = local14;
						while (local79 > 0 && (Static8.aByteArrayArrayArray3[local14][local79 - 1][local18] & 0x2) != 0) {
							local79--;
						}
						while (local81 < Static22.anInt481 && (Static8.aByteArrayArrayArray3[local14][local81 + 1][local18] & 0x2) != 0) {
							local81++;
						}
						label218: while (local83 > 0) {
							for (local127 = local79; local127 <= local81; local127++) {
								if ((Static8.aByteArrayArrayArray3[local83 - 1][local127][local18] & 0x2) == 0) {
									break label218;
								}
							}
							local83--;
						}
						label207: while (local123 < 3) {
							for (local127 = local79; local127 <= local81; local127++) {
								if ((Static8.aByteArrayArrayArray3[local123 + 1][local127][local18] & 0x2) == 0) {
									break label207;
								}
							}
							local123++;
						}
						local127 = (local123 + 1 - local83) * (local81 + 1 - local79);
						if (local127 >= 2) {
							local221 = Static217.anIntArrayArrayArray8[local123][local79][local18] - 240;
							local229 = Static217.anIntArrayArrayArray8[local83][local79][local18];
							Static6.method102(2, local79 * 128, local81 * 128 + 128, local18 * 128, local18 * 128, local221, local229);
							for (local249 = local83; local249 <= local123; local249++) {
								for (local253 = local79; local253 <= local81; local253++) {
									Static8.aByteArrayArrayArray3[local249][local253][local18] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((Static8.aByteArrayArrayArray3[local14][local62][local18] & 0x4) != 0) {
						local79 = local62;
						local81 = local62;
						local83 = local18;
						local123 = local18;
						while (local83 > 0 && (Static8.aByteArrayArrayArray3[local14][local62][local83 - 1] & 0x4) != 0) {
							local83--;
						}
						while (local123 < Static269.anInt5281 && (Static8.aByteArrayArrayArray3[local14][local62][local123 + 1] & 0x4) != 0) {
							local123++;
						}
						label271: while (local79 > 0) {
							for (local127 = local83; local127 <= local123; local127++) {
								if ((Static8.aByteArrayArrayArray3[local14][local79 - 1][local127] & 0x4) == 0) {
									break label271;
								}
							}
							local79--;
						}
						label260: while (local81 < Static22.anInt481) {
							for (local127 = local83; local127 <= local123; local127++) {
								if ((Static8.aByteArrayArrayArray3[local14][local81 + 1][local127] & 0x4) == 0) {
									break label260;
								}
							}
							local81++;
						}
						if ((local81 + 1 - local79) * (local123 + 1 - local83) >= 4) {
							local127 = Static217.anIntArrayArrayArray8[local14][local79][local83];
							Static6.method102(4, local79 * 128, local81 * 128 + 128, local83 * 128, local123 * 128 + 128, local127, local127);
							for (@Pc(664) int local664 = local79; local664 <= local81; local664++) {
								for (local221 = local83; local221 <= local123; local221++) {
									Static8.aByteArrayArrayArray3[local14][local664][local221] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V")
	public static void method3482() {
		@Pc(1) Class109 local1 = Static60.aClass109_23;
		synchronized (Static60.aClass109_23) {
			Static60.aClass109_23.method2850();
		}
	}
}
