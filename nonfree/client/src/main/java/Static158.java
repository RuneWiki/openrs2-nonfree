import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
	public static int anInt2948;

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
	public static int anInt2949;

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "[[I")
	public static int[][] anIntArrayArray46;

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "[I")
	public static int[] anIntArray340 = new int[5];

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString108 = " from your friend list first.";

	@OriginalMember(owner = "client!lh", name = "h", descriptor = "[I")
	public static int[] anIntArray341 = new int[32];

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z[BI[Lclient!rk;II)V")
	public static void method2619(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) Class153[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(6) Class3_Sub26 local6 = new Class3_Sub26(arg1);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(22) int local22 = local6.method3942();
			if (local22 == 0) {
				return;
			}
			local12 += local22;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local6.method3904();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(51) int local51 = local32 & 0x3F;
				@Pc(55) int local55 = local32 >> 12;
				@Pc(61) int local61 = local32 >> 6 & 0x3F;
				@Pc(65) int local65 = local6.method3915();
				@Pc(69) int local69 = local65 & 0x3;
				@Pc(73) int local73 = local65 >> 2;
				@Pc(77) int local77 = local61 + arg4;
				@Pc(81) int local81 = local51 + arg3;
				if (local77 > 0 && local81 > 0 && local77 < 103 && local81 < 103) {
					@Pc(98) Class153 local98 = null;
					if (!arg0) {
						@Pc(102) int local102 = local55;
						if ((Static41.aByteArrayArrayArray2[1][local77][local81] & 0x2) == 2) {
							local102 = local55 - 1;
						}
						if (local102 >= 0) {
							local98 = arg2[local102];
						}
					}
					Static54.method839(local12, local73, !arg0, local81, local55, local55, local77, arg0, local69, local98);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
	public static void method2620() {
		if (Static214.anInt4184 == 0) {
			return;
		}
		try {
			if (++Static93.anInt1701 > 2000) {
				if (Static150.aClass139_3 != null) {
					Static150.aClass139_3.method3559();
					Static150.aClass139_3 = null;
				}
				if (Static254.anInt5245 >= 1) {
					Static205.anInt4056 = -5;
					Static214.anInt4184 = 0;
					return;
				}
				Static254.anInt5245++;
				if (Static203.anInt3974 == Static51.anInt995) {
					Static51.anInt995 = Static152.anInt2881;
				} else {
					Static51.anInt995 = Static203.anInt3974;
				}
				Static214.anInt4184 = 1;
				Static93.anInt1701 = 0;
			}
			if (Static214.anInt4184 == 1) {
				Static203.aClass178_2 = Static274.aClass176_4.method4521(Static307.aString230, Static51.anInt995);
				Static214.anInt4184 = 2;
			}
			@Pc(138) int local138;
			if (Static214.anInt4184 == 2) {
				if (Static203.aClass178_2.anInt5649 == 2) {
					throw new IOException();
				}
				if (Static203.aClass178_2.anInt5649 != 1) {
					return;
				}
				Static150.aClass139_3 = new Class139((Socket) Static203.aClass178_2.anObject6, Static274.aClass176_4);
				Static203.aClass178_2 = null;
				Static150.aClass139_3.method3556(Static215.aClass3_Sub26_Sub1_2.aByteArray64, Static215.aClass3_Sub26_Sub1_2.anInt4615);
				if (Static32.aClass105_1 != null) {
					Static32.aClass105_1.method2774();
				}
				if (Static187.aClass105_2 != null) {
					Static187.aClass105_2.method2774();
				}
				local138 = Static150.aClass139_3.method3553();
				if (Static32.aClass105_1 != null) {
					Static32.aClass105_1.method2774();
				}
				if (Static187.aClass105_2 != null) {
					Static187.aClass105_2.method2774();
				}
				if (local138 != 21) {
					Static214.anInt4184 = 0;
					Static205.anInt4056 = local138;
					Static150.aClass139_3.method3559();
					Static150.aClass139_3 = null;
					return;
				}
				Static214.anInt4184 = 3;
			}
			if (Static214.anInt4184 == 3) {
				if (Static150.aClass139_3.method3554() < 1) {
					return;
				}
				Static9.aStringArray2 = new String[Static150.aClass139_3.method3553()];
				Static214.anInt4184 = 4;
			}
			if (Static214.anInt4184 == 4) {
				if (Static150.aClass139_3.method3554() < Static9.aStringArray2.length * 8) {
					return;
				}
				Static249.aClass3_Sub26_Sub1_3.anInt4615 = 0;
				Static150.aClass139_3.method3558(Static9.aStringArray2.length * 8, Static249.aClass3_Sub26_Sub1_3.aByteArray64, 0);
				for (local138 = 0; local138 < Static9.aStringArray2.length; local138++) {
					Static9.aStringArray2[local138] = Static92.method1367(Static249.aClass3_Sub26_Sub1_3.method3900());
				}
				Static214.anInt4184 = 0;
				Static205.anInt4056 = 21;
				Static150.aClass139_3.method3559();
				Static150.aClass139_3 = null;
				return;
			}
		} catch (@Pc(245) IOException local245) {
			if (Static150.aClass139_3 != null) {
				Static150.aClass139_3.method3559();
				Static150.aClass139_3 = null;
			}
			if (Static254.anInt5245 >= 1) {
				Static205.anInt4056 = -4;
				Static214.anInt4184 = 0;
			} else {
				Static93.anInt1701 = 0;
				if (Static51.anInt995 == Static203.anInt3974) {
					Static51.anInt995 = Static152.anInt2881;
				} else {
					Static51.anInt995 = Static203.anInt3974;
				}
				Static254.anInt5245++;
				Static214.anInt4184 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IILclient!bg;ZIZ)V")
	public static void method2622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		if (Static62.anInt1162 >= 50 || (arg2 == null || arg2.anIntArrayArray3 == null || arg1 >= arg2.anIntArrayArray3.length || arg2.anIntArrayArray3[arg1] == null)) {
			return;
		}
		@Pc(36) int local36 = arg2.anIntArrayArray3[arg1][0];
		@Pc(40) int local40 = local36 >> 8;
		@Pc(46) int local46 = local36 >> 5 & 0x7;
		@Pc(64) int local64;
		if (arg2.anIntArrayArray3[arg1].length > 1) {
			local64 = (int) (Math.random() * (double) arg2.anIntArrayArray3[arg1].length);
			if (local64 > 0) {
				local40 = arg2.anIntArrayArray3[arg1][local64];
			}
		}
		@Pc(81) int local81 = local36 & 0x1F;
		if (local81 == 0) {
			if (arg3) {
				Static306.method4919(local46, local40, 255, 0);
			}
		} else if (Static305.anInt6006 != 0) {
			Static136.anIntArray306[Static62.anInt1162] = local40;
			local64 = (arg0 - 64) / 128;
			Static289.anIntArray598[Static62.anInt1162] = local46;
			Static277.anIntArray570[Static62.anInt1162] = 0;
			Static151.aClass45Array1[Static62.anInt1162] = null;
			Static175.anIntArray399[Static62.anInt1162] = 255;
			@Pc(137) int local137 = (arg4 - 64) / 128;
			Static131.anIntArray296[Static62.anInt1162] = (local64 << 16) - (-(local137 << 8) - local81);
			Static62.anInt1162++;
		}
	}
}
