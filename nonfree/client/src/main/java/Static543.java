import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static543 {

	@OriginalMember(owner = "client!ti", name = "r", descriptor = "[I")
	public static int[] anIntArray640;

	@OriginalMember(owner = "client!ti", name = "o", descriptor = "Lclient!uw;")
	public static final Class350 aClass350_9 = new Class350("", 14);

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "([BIII)Ljava/lang/String;")
	public static String method8142(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg2];
		@Pc(10) int local10 = 0;
		@Pc(17) int local17 = arg1;
		@Pc(21) int local21 = arg2 + arg1;
		while (local17 < local21) {
			@Pc(30) int local30 = arg0[local17++] & 0xFF;
			@Pc(39) int local39;
			if (local30 < 128) {
				if (local30 == 0) {
					local39 = 65533;
				} else {
					local39 = local30;
				}
			} else if (local30 < 192) {
				local39 = 65533;
			} else if (local30 >= 224) {
				if (local30 < 240) {
					if (local17 + 1 < local21 && (arg0[local17] & 0xC0) == 128 && (arg0[local17 + 1] & 0xC0) == 128) {
						local39 = (local30 & 0xF) << 12 | (arg0[local17++] & 0x3F) << 6 | arg0[local17++] & 0x3F;
						if (local39 < 2048) {
							local39 = 65533;
						}
					} else {
						local39 = 65533;
					}
				} else if (local30 >= 248) {
					local39 = 65533;
				} else if (local21 > local17 + 2 && (arg0[local17] & 0xC0) == 128 && (arg0[local17 + 1] & 0xC0) == 128 && (arg0[local17 + 2] & 0xC0) == 128) {
					local39 = (local30 & 0x7) << 18 | (arg0[local17++] & 0x3F) << 12 | (arg0[local17++] & 0x3F) << 6 | arg0[local17++] & 0x3F;
					if (local39 >= 65536 && local39 <= 1114111) {
						local39 = 65533;
					} else {
						local39 = 65533;
					}
				} else {
					local39 = 65533;
				}
			} else if (local17 < local21 && (arg0[local17] & 0xC0) == 128) {
				local39 = arg0[local17++] & 0x3F | (local30 & 0x1F) << 6;
				if (local39 < 128) {
					local39 = 65533;
				}
			} else {
				local39 = 65533;
			}
			local8[local10++] = (char) local39;
		}
		return new String(local8, 0, local10);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "([BZ)Ljava/lang/String;")
	public static String method8144(@OriginalArg(0) byte[] arg0) {
		return Static299.method5335(arg0, arg0.length, 0);
	}

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "(II)Z")
	public static boolean method8145(@OriginalArg(1) int arg0) {
		return arg0 == 18 || arg0 == 6 || arg0 == 1011 || arg0 == 13 || arg0 == 16;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IILclient!at;B)V")
	public static void method8146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class24 arg2) {
		if (Static475.aBoolean695) {
			@Pc(13) Class335 local13 = Static58.anInt10722 == -1 ? null : Static229.aClass70_1.method2496(Static58.anInt10722);
			if (Static76.method2235(arg2).method9004() && (Static237.anInt5148 & 0x20) != 0 && (local13 == null || arg2.method614(local13.anInt10093, Static58.anInt10722) != local13.anInt10093)) {
				Static202.method4065(false, Static225.aString47 + " -> " + arg2.aString3, arg2.anInt510, false, arg2.anInt439, arg2.anInt501, true, 6, (long) (arg2.anInt510 | arg2.anInt439 << 0), Static225.aString48, 0L, Static183.anInt4410);
			}
		}
		@Pc(87) String local87;
		for (@Pc(80) int local80 = 9; local80 >= 5; local80--) {
			local87 = Static158.method3484(local80, arg2);
			if (local87 != null) {
				Static202.method4065(false, arg2.aString3, arg2.anInt510, false, arg2.anInt439, arg2.anInt501, true, 1011, (long) (arg2.anInt439 << 0 | arg2.anInt510), local87, (long) (local80 + 1), Static343.method5884(local80, arg2));
			}
		}
		local87 = Static345.method5921(arg2);
		if (local87 != null) {
			Static202.method4065(false, arg2.aString3, arg2.anInt510, false, arg2.anInt439, arg2.anInt501, true, 13, (long) (arg2.anInt439 << 0 | arg2.anInt510), local87, 0L, arg2.anInt444);
		}
		for (@Pc(175) int local175 = 4; local175 >= 0; local175--) {
			@Pc(182) String local182 = Static158.method3484(local175, arg2);
			if (local182 != null) {
				Static202.method4065(false, arg2.aString3, arg2.anInt510, false, arg2.anInt439, arg2.anInt501, true, 18, (long) (arg2.anInt439 << 0 | arg2.anInt510), local182, (long) (local175 + 1), Static343.method5884(local175, arg2));
			}
		}
		if (!Static76.method2235(arg2).method9006()) {
			return;
		}
		if (arg2.aString6 == null) {
			Static202.method4065(false, "", arg2.anInt510, false, arg2.anInt439, arg2.anInt501, true, 16, (long) (arg2.anInt439 << 0 | arg2.anInt510), Static588.aClass351_11.method8691(Static476.anInt8915), 0L, -1);
		} else {
			Static202.method4065(false, "", arg2.anInt510, false, arg2.anInt439, arg2.anInt501, true, 16, (long) (arg2.anInt439 << 0 | arg2.anInt510), arg2.aString6, 0L, -1);
		}
	}
}
