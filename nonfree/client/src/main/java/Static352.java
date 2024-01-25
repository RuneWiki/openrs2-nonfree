import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_63 = new Class18(22, 3);

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_64 = new Class18(21, 16);

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "[I")
	public static final int[] anIntArray142 = new int[2048];

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
	public static int anInt1802 = -1;

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_65 = new Class18(71, 7);

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_65 = new Class217(78, 6);

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IC)B")
	public static byte method1726(@OriginalArg(1) char arg0) {
		@Pc(25) byte local25;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local25 = (byte) arg0;
		} else if (arg0 == '€') {
			local25 = -128;
		} else if (arg0 == '‚') {
			local25 = -126;
		} else if (arg0 == 'ƒ') {
			local25 = -125;
		} else if (arg0 == '„') {
			local25 = -124;
		} else if (arg0 == '…') {
			local25 = -123;
		} else if (arg0 == '†') {
			local25 = -122;
		} else if (arg0 == '‡') {
			local25 = -121;
		} else if (arg0 == 'ˆ') {
			local25 = -120;
		} else if (arg0 == '‰') {
			local25 = -119;
		} else if (arg0 == 'Š') {
			local25 = -118;
		} else if (arg0 == '‹') {
			local25 = -117;
		} else if (arg0 == 'Œ') {
			local25 = -116;
		} else if (arg0 == 'Ž') {
			local25 = -114;
		} else if (arg0 == '‘') {
			local25 = -111;
		} else if (arg0 == '’') {
			local25 = -110;
		} else if (arg0 == '“') {
			local25 = -109;
		} else if (arg0 == '”') {
			local25 = -108;
		} else if (arg0 == '•') {
			local25 = -107;
		} else if (arg0 == '–') {
			local25 = -106;
		} else if (arg0 == '—') {
			local25 = -105;
		} else if (arg0 == '˜') {
			local25 = -104;
		} else if (arg0 == '™') {
			local25 = -103;
		} else if (arg0 == 'š') {
			local25 = -102;
		} else if (arg0 == '›') {
			local25 = -101;
		} else if (arg0 == 'œ') {
			local25 = -100;
		} else if (arg0 == 'ž') {
			local25 = -98;
		} else if (arg0 == 'Ÿ') {
			local25 = -97;
		} else {
			local25 = 63;
		}
		return local25;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)V")
	public static void method1731(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static269.aFloat26 < Static269.aFloat25) {
			Static269.aFloat26 = (float) ((double) Static269.aFloat26 + (double) Static269.aFloat26 / 30.0D);
			if (Static269.aFloat26 > Static269.aFloat25) {
				Static269.aFloat26 = Static269.aFloat25;
			}
			Static229.method4278();
			Static269.anInt3313 = (int) Static269.aFloat26 >> 1;
			Static269.aByteArrayArrayArray4 = Static129.method2663(Static269.anInt3313);
		} else if (Static269.aFloat25 < Static269.aFloat26) {
			Static269.aFloat26 = (float) ((double) Static269.aFloat26 - (double) Static269.aFloat26 / 30.0D);
			if (Static269.aFloat25 > Static269.aFloat26) {
				Static269.aFloat26 = Static269.aFloat25;
			}
			Static229.method4278();
			Static269.anInt3313 = (int) Static269.aFloat26 >> 1;
			Static269.aByteArrayArrayArray4 = Static129.method2663(Static269.anInt3313);
		}
		if (Static286.anInt5852 != -1 && Static253.anInt5163 != -1) {
			@Pc(79) int local79 = Static286.anInt5852 - Static207.anInt4093;
			if (local79 < 2 || local79 > 2) {
				local79 /= 8;
			}
			@Pc(94) int local94 = Static253.anInt5163 - Static299.anInt4033;
			Static207.anInt4093 += local79;
			if (local94 < 2 || local94 > 2) {
				local94 /= 8;
			}
			if (local79 == 0 && local94 == 0) {
				Static286.anInt5852 = -1;
				Static253.anInt5163 = -1;
			}
			Static299.anInt4033 += local94;
			Static229.method4278();
		}
		if (Static368.anInt7056 <= 0) {
			Static105.anInt2414 = -1;
			Static215.anInt4292 = -1;
		} else {
			Static227.anInt4587--;
			if (Static227.anInt4587 == 0) {
				Static368.anInt7056--;
				Static227.anInt4587 = 100;
			}
		}
		if (!Static202.aBoolean303 || Static164.aClass42_22 == null) {
			return;
		}
		for (@Pc(159) Class1_Sub32 local159 = (Class1_Sub32) Static164.aClass42_22.method1543(); local159 != null; local159 = (Class1_Sub32) Static164.aClass42_22.method1551()) {
			@Pc(167) Class194 local167 = Static226.method4184(local159.aClass1_Sub17_1.anInt1640);
			if (Static313.anInt6023 == 0 && local159.method4280(arg1, arg0)) {
				if (local167.aStringArray38 != null) {
					if (local167.aStringArray38[4] != null) {
						Static295.method5151(-1, 0, false, true, local167.aStringArray38[4], (long) local159.aClass1_Sub17_1.anInt1640, local167.aString52, 1012, local167.anInt5848);
					}
					if (local167.aStringArray38[3] != null) {
						Static295.method5151(-1, 0, false, true, local167.aStringArray38[3], (long) local159.aClass1_Sub17_1.anInt1640, local167.aString52, 1007, local167.anInt5848);
					}
					if (local167.aStringArray38[2] != null) {
						Static295.method5151(-1, 0, false, true, local167.aStringArray38[2], (long) local159.aClass1_Sub17_1.anInt1640, local167.aString52, 1009, local167.anInt5848);
					}
					if (local167.aStringArray38[1] != null) {
						Static295.method5151(-1, 0, false, true, local167.aStringArray38[1], (long) local159.aClass1_Sub17_1.anInt1640, local167.aString52, 1003, local167.anInt5848);
					}
					if (local167.aStringArray38[0] != null) {
						Static295.method5151(-1, 0, false, true, local167.aStringArray38[0], (long) local159.aClass1_Sub17_1.anInt1640, local167.aString52, 1008, local167.anInt5848);
					}
				}
				if (!local159.aClass1_Sub17_1.aBoolean116) {
					local159.aClass1_Sub17_1.aBoolean116 = true;
					Static302.method5244(Static284.aClass105_18, local159.aClass1_Sub17_1.anInt1640, local167.anInt5848);
				}
				if (local159.aClass1_Sub17_1.aBoolean116) {
					Static302.method5244(Static147.aClass105_11, local159.aClass1_Sub17_1.anInt1640, local167.anInt5848);
				}
			} else if (local159.aClass1_Sub17_1.aBoolean116) {
				local159.aClass1_Sub17_1.aBoolean116 = false;
				Static302.method5244(Static110.aClass105_6, local159.aClass1_Sub17_1.anInt1640, local167.anInt5848);
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZLclient!ct;)V")
	public static void method1733(@OriginalArg(1) Class30 arg0) {
		Static86.aClass30_26 = arg0;
		Static280.anInt5460 = Static86.aClass30_26.method1180(16);
	}
}
