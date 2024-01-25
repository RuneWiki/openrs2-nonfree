import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!lo", name = "q", descriptor = "[[B")
	public static byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(III)V")
	public static void method4876(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class1_Sub2_Sub16 local16 = Static422.method6588(1, arg0);
		local16.method6693();
		local16.anInt7487 = arg1;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(BII)Z")
	public static boolean method4879(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 | Static254.method4603(arg0, arg1) || Static420.method6572(arg0, arg1);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZI)Z")
	public static boolean method4887(@OriginalArg(1) int arg0) {
		if (Static286.aBooleanArray22[arg0]) {
			return true;
		} else if (Static83.aClass69_94.method1911(arg0)) {
			@Pc(23) int local23 = Static83.aClass69_94.method1884(arg0);
			if (local23 == 0) {
				Static286.aBooleanArray22[arg0] = true;
				return true;
			}
			if (Static511.aClass91ArrayArray2[arg0] == null) {
				Static511.aClass91ArrayArray2[arg0] = new Class91[local23];
			}
			for (@Pc(52) int local52 = 0; local52 < local23; local52++) {
				if (Static511.aClass91ArrayArray2[arg0][local52] == null) {
					@Pc(66) byte[] local66 = Static83.aClass69_94.method1888(local52, arg0);
					if (local66 != null) {
						@Pc(78) Class91 local78 = Static511.aClass91ArrayArray2[arg0][local52] = new Class91();
						local78.anInt2368 = local52 + (arg0 << 16);
						if (local66[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local78.method2277(new Class1_Sub17(local66));
					}
				}
			}
			Static286.aBooleanArray22[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IJ)V")
	public static void method4888(@OriginalArg(1) long arg0) {
		if (Static263.aClass64ArrayArrayArray3 != null) {
			if (Static170.anInt3418 == 1 || Static170.anInt3418 == 5) {
				Static51.method1407(arg0);
			} else if (Static170.anInt3418 == 4) {
				Static289.method5094(arg0);
			}
		}
		Static449.method6956((long) Static445.anInt7791, Static455.aClass4_11);
		if (Static328.anInt6167 != -1) {
			Static159.method2884(Static328.anInt6167);
		}
		for (@Pc(48) int local48 = 0; local48 < Static260.anInt5066; local48++) {
			if (Static258.aBooleanArray17[local48]) {
				Static266.aBooleanArray18[local48] = true;
			}
			Static272.aBooleanArray19[local48] = Static258.aBooleanArray17[local48];
			Static258.aBooleanArray17[local48] = false;
		}
		Static304.anInt5906 = Static445.anInt7791;
		if (Static455.aClass4_11.method7166()) {
			Static27.aBoolean62 = true;
		}
		if (Static328.anInt6167 != -1) {
			Static260.anInt5066 = 0;
			Static362.method7037();
		}
		Static455.aClass4_11.n();
		Static113.method2230(Static455.aClass4_11);
		@Pc(95) int local95 = Static139.method2615();
		if (local95 == -1) {
			local95 = Static245.anInt4711;
		}
		if (local95 == -1) {
			local95 = Static449.anInt7879;
		}
		Static54.method1452(local95);
		Static221.method4023(Static242.anInt4651, Static107.aClass20_Sub1_Sub1_Sub1_1.aByte108, Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8954, Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8949);
		Static242.anInt4651 = 0;
	}
}
