import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!ji", name = "J", descriptor = "Lclient!ir;")
	public static Class100 aClass100_66;

	@OriginalMember(owner = "client!ji", name = "K", descriptor = "[[I")
	public static int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!ji", name = "R", descriptor = "[[I")
	public static int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!ji", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString110 = "Prepared sound engine";

	@OriginalMember(owner = "client!ji", name = "O", descriptor = "Z")
	public static boolean aBoolean162 = true;

	@OriginalMember(owner = "client!ji", name = "S", descriptor = "J")
	public static long aLong108 = 0L;

	@OriginalMember(owner = "client!ji", name = "U", descriptor = "Ljava/lang/String;")
	public static String aString111 = "K";

	@OriginalMember(owner = "client!ji", name = "X", descriptor = "Z")
	public static boolean aBoolean163 = false;

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "(II)Z")
	public static boolean method2419(@OriginalArg(0) int arg0) {
		if (Static61.aBooleanArray5[arg0]) {
			return true;
		} else if (Static232.aClass100_96.method2284(arg0)) {
			@Pc(25) int local25 = Static232.aClass100_96.method2309(arg0);
			if (local25 == 0) {
				Static61.aBooleanArray5[arg0] = true;
				return true;
			}
			if (Static311.aClass181ArrayArray1[arg0] == null) {
				Static311.aClass181ArrayArray1[arg0] = new Class181[local25];
			}
			for (@Pc(44) int local44 = 0; local44 < local25; local44++) {
				if (Static311.aClass181ArrayArray1[arg0][local44] == null) {
					@Pc(58) byte[] local58 = Static232.aClass100_96.method2319(arg0, local44);
					if (local58 != null) {
						@Pc(70) Class181 local70 = Static311.aClass181ArrayArray1[arg0][local44] = new Class181();
						local70.anInt5761 = (arg0 << 16) + local44;
						if (local58[0] == -1) {
							local70.method4928(new Class3_Sub4(local58));
						} else {
							local70.method4913(new Class3_Sub4(local58));
						}
					}
				}
			}
			Static61.aBooleanArray5[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "(I)I")
	public static int method2421() {
		return Static71.anInt5338;
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "(B)V")
	public static void method2422() {
		if (Static330.anInt6402 < 0) {
			Static330.anInt6402 = 0;
			Static286.anInt5771 = -1;
			Static265.anInt5321 = -1;
		}
		if (Static193.anInt2347 < Static330.anInt6402) {
			Static265.anInt5321 = -1;
			Static330.anInt6402 = Static193.anInt2347;
			Static286.anInt5771 = -1;
		}
		if (Static114.anInt2413 < 0) {
			Static265.anInt5321 = -1;
			Static286.anInt5771 = -1;
			Static114.anInt2413 = 0;
		}
		if (Static114.anInt2413 > Static193.anInt2345) {
			Static286.anInt5771 = -1;
			Static114.anInt2413 = Static193.anInt2345;
			Static265.anInt5321 = -1;
		}
	}

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "(II)Ljava/lang/String;")
	public static String method2423(@OriginalArg(1) int arg0) {
		return arg0 < 999999999 ? Integer.toString(arg0) : "*";
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZI[BI)Ljava/lang/String;")
	public static String method2424(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(13) char[] local13 = new char[arg2];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < arg2; local17++) {
			@Pc(27) int local27 = arg1[local17 + arg0] & 0xFF;
			if (local27 != 0) {
				if (local27 >= 128 && local27 < 160) {
					@Pc(45) char local45 = Static89.aCharArray12[local27 - 128];
					if (local45 == '\u0000') {
						local45 = '?';
					}
					local27 = local45;
				}
				local13[local15++] = (char) local27;
			}
		}
		return new String(local13, 0, local15);
	}

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "(II)Lclient!lm;")
	public static Class3_Sub7_Sub16 method2425(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub7_Sub16 local10 = (Class3_Sub7_Sub16) Static288.aClass188_9.method5061((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static307.aClass100_120.method2319(5, arg0);
		local10 = new Class3_Sub7_Sub16();
		if (local28 != null) {
			local10.method3249(new Class3_Sub4(local28));
		}
		Static288.aClass188_9.method5063(local10, (long) arg0);
		return local10;
	}
}
