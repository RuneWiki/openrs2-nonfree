import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "Lclient!pa;")
	public static Class103 aClass103_5;

	@OriginalMember(owner = "client!kh", name = "i", descriptor = "Lclient!ke;")
	public static Class1_Sub2_Sub4 aClass1_Sub2_Sub4_4;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "[Z")
	public static boolean[] aBooleanArray8 = new boolean[5];

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "[I")
	public static int[] anIntArray243 = new int[5];

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString200 = "M";

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString201 = "shake:";

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)V")
	public static void method2397(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static142.aClass1_Sub16ArrayArrayArray4 = Static150.aClass1_Sub16ArrayArrayArray5;
			Static38.anIntArrayArrayArray6 = Static32.anIntArrayArrayArray5;
		} else {
			Static142.aClass1_Sub16ArrayArrayArray4 = Static84.aClass1_Sub16ArrayArrayArray1;
			Static38.anIntArrayArrayArray6 = Static4.anIntArrayArrayArray1;
		}
		Static256.anInt5440 = Static142.aClass1_Sub16ArrayArrayArray4.length;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!se;BIII)V")
	public static void method2398(@OriginalArg(0) Class122 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static121.anInt3108 >= 3) {
			Static189.method3200(arg3, arg2, arg0.anIntArray378, arg0.anIntArray372);
		} else {
			((Class1_Sub2_Sub4_Sub1) Static29.aClass1_Sub2_Sub4_1).method911(arg3, arg2, arg0.anInt4695, arg0.anInt4726, Static29.aClass1_Sub2_Sub4_1.anInt1292 / 2, Static29.aClass1_Sub2_Sub4_1.anInt1291 / 2, (int) Static230.aFloat51, arg0.anIntArray378, arg0.anIntArray372);
		}
		Static186.aBooleanArray17[arg1] = true;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IB[BI)Z")
	public static boolean method2399(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class1_Sub13 local12 = new Class1_Sub13(arg1);
		@Pc(14) int local14 = -1;
		label56: while (true) {
			@Pc(18) int local18 = local12.method1788();
			if (local18 == 0) {
				return local7;
			}
			local14 += local18;
			@Pc(26) boolean local26 = false;
			@Pc(28) int local28 = 0;
			while (true) {
				@Pc(34) int local34;
				while (!local26) {
					local34 = local12.method1780();
					if (local34 == 0) {
						continue label56;
					}
					local28 += local34 - 1;
					@Pc(58) int local58 = local28 & 0x3F;
					@Pc(64) int local64 = local28 >> 6 & 0x3F;
					@Pc(70) int local70 = local12.method1772() >> 2;
					@Pc(74) int local74 = arg2 + local64;
					@Pc(78) int local78 = arg0 + local58;
					if (local74 > 0 && local78 > 0 && local74 < 103 && local78 < 103) {
						@Pc(97) Class31 local97 = Static77.method1518(local14);
						if (local70 != 22 || Static249.aBoolean270 || local97.anInt1336 != 0 || local97.anInt1323 == 1 || local97.aBoolean70) {
							if (!local97.method926()) {
								local7 = false;
								Static16.anInt4951++;
							}
							local26 = true;
						}
					}
				}
				local34 = local12.method1780();
				if (local34 == 0) {
					break;
				}
				local12.method1772();
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
	public static void method2401() {
		if (Static83.aClass9_Sub1_Sub1_1 != null && Static83.aClass9_Sub1_Sub1_1.anInt427 + 64 - Static83.aClass9_Sub1_Sub1_1.method208() * 64 >> 7 == Static239.anInt5157 && Static83.aClass9_Sub1_Sub1_1.anInt479 + 64 - Static83.aClass9_Sub1_Sub1_1.method208() * 64 >> 7 == Static262.anInt5501) {
			Static239.anInt5157 = 0;
		}
		@Pc(52) int local52;
		for (@Pc(48) int local48 = 0; local48 < 104; local48++) {
			for (local52 = 0; local52 < 104; local52++) {
				Static265.anIntArrayArray40[local48][local52] = 0;
			}
		}
		for (local52 = 0; local52 < Static238.anInt5146; local52++) {
			@Pc(85) Class9_Sub1_Sub1 local85 = Static147.aClass9_Sub1_Sub1Array1[Static237.anIntArray447[local52]];
			if (local85 != null) {
				local85.aBoolean27 = false;
			}
		}
		for (@Pc(100) int local100 = 0; local100 < Static16.anInt4955; local100++) {
			@Pc(108) Class9_Sub1_Sub2 local108 = Static36.aClass9_Sub1_Sub2Array2[Static142.anIntArray260[local100]];
			if (local108 != null) {
				local108.aBoolean27 = false;
			}
		}
	}
}
