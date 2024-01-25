import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
	public static int anInt2626;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZIII)I")
	public static int method2229(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class3_Sub5 local12 = Static480.method7117(arg0, arg1);
		if (local12 == null) {
			return 0;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(23) int local23 = 0;
			for (@Pc(25) int local25 = 0; local25 < local12.anIntArray117.length; local25++) {
				if (local12.anIntArray120[local25] == arg2) {
					local23 += local12.anIntArray117[local25];
				}
			}
			return local23;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BII)V")
	public static void method2230(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static55.aFloat69 < Static55.aFloat68) {
			Static55.aFloat69 = (float) ((double) Static55.aFloat69 + (double) Static55.aFloat69 / 30.0D);
			if (Static55.aFloat68 < Static55.aFloat69) {
				Static55.aFloat69 = Static55.aFloat68;
			}
			Static374.method5885();
			Static55.anInt1969 = (int) Static55.aFloat69 >> 1;
			Static55.aByteArrayArrayArray3 = Static524.method7520(Static55.anInt1969);
		} else if (Static55.aFloat69 > Static55.aFloat68) {
			Static55.aFloat69 = (float) ((double) Static55.aFloat69 - (double) Static55.aFloat69 / 30.0D);
			if (Static55.aFloat68 > Static55.aFloat69) {
				Static55.aFloat69 = Static55.aFloat68;
			}
			Static374.method5885();
			Static55.anInt1969 = (int) Static55.aFloat69 >> 1;
			Static55.aByteArrayArrayArray3 = Static524.method7520(Static55.anInt1969);
		}
		if (Static152.anInt3124 != -1 && Static531.anInt9235 != -1) {
			@Pc(79) int local79 = Static152.anInt3124 - Static256.anInt5191;
			if (local79 < 2 || local79 > 2) {
				local79 /= 8;
			}
			@Pc(96) int local96 = Static531.anInt9235 - Static129.anInt2692;
			Static256.anInt5191 += local79;
			if (local96 < 2 || local96 > 2) {
				local96 /= 8;
			}
			if (local79 == 0 && local96 == 0) {
				Static531.anInt9235 = -1;
				Static152.anInt3124 = -1;
			}
			Static129.anInt2692 += local96;
			Static374.method5885();
		}
		if (Static307.anInt4841 <= 0) {
			Static213.anInt4694 = -1;
			Static469.anInt8466 = -1;
		} else {
			Static106.anInt2360--;
			if (Static106.anInt2360 == 0) {
				Static307.anInt4841--;
				Static106.anInt2360 = 100;
			}
		}
		if (!Static514.aBoolean665 || Static325.aClass71_47 == null) {
			return;
		}
		for (@Pc(169) Class3_Sub50 local169 = (Class3_Sub50) Static325.aClass71_47.method2089(); local169 != null; local169 = (Class3_Sub50) Static325.aClass71_47.method2086()) {
			@Pc(178) Class179 local178 = Static55.aClass135_2.method3801(local169.aClass3_Sub31_1.anInt5809);
			if (local169.method7742(arg0, arg1)) {
				if (local178.aStringArray32 != null) {
					if (local178.aStringArray32[4] != null) {
						Static507.method7642(true, local178.aString40, -1, local178.aStringArray32[4], -1, 0, local178.anInt5728, false, 1011, (long) local169.aClass3_Sub31_1.anInt5809);
					}
					if (local178.aStringArray32[3] != null) {
						Static507.method7642(true, local178.aString40, -1, local178.aStringArray32[3], -1, 0, local178.anInt5728, false, 1009, (long) local169.aClass3_Sub31_1.anInt5809);
					}
					if (local178.aStringArray32[2] != null) {
						Static507.method7642(true, local178.aString40, -1, local178.aStringArray32[2], -1, 0, local178.anInt5728, false, 1007, (long) local169.aClass3_Sub31_1.anInt5809);
					}
					if (local178.aStringArray32[1] != null) {
						Static507.method7642(true, local178.aString40, -1, local178.aStringArray32[1], -1, 0, local178.anInt5728, false, 1001, (long) local169.aClass3_Sub31_1.anInt5809);
					}
					if (local178.aStringArray32[0] != null) {
						Static507.method7642(true, local178.aString40, -1, local178.aStringArray32[0], -1, 0, local178.anInt5728, false, 1002, (long) local169.aClass3_Sub31_1.anInt5809);
					}
				}
				if (!local169.aClass3_Sub31_1.aBoolean374) {
					local169.aClass3_Sub31_1.aBoolean374 = true;
					Static60.method1224(Static50.aClass91_1, local169.aClass3_Sub31_1.anInt5809, local178.anInt5728);
				}
				if (local169.aClass3_Sub31_1.aBoolean374) {
					Static60.method1224(Static464.aClass91_9, local169.aClass3_Sub31_1.anInt5809, local178.anInt5728);
				}
			} else if (local169.aClass3_Sub31_1.aBoolean374) {
				local169.aClass3_Sub31_1.aBoolean374 = false;
				Static60.method1224(Static424.aClass91_7, local169.aClass3_Sub31_1.anInt5809, local178.anInt5728);
			}
		}
	}
}
