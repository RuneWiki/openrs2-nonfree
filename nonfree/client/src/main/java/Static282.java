import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!uc", name = "G", descriptor = "[Z")
	public static boolean[] aBooleanArray59;

	@OriginalMember(owner = "client!uc", name = "K", descriptor = "I")
	public static int anInt5386;

	@OriginalMember(owner = "client!uc", name = "u", descriptor = "Lclient!th;")
	public static Class169 aClass169_150 = new Class169(16);

	@OriginalMember(owner = "client!uc", name = "B", descriptor = "Lclient!md;")
	public static Class111 aClass111_1 = new Class111();

	@OriginalMember(owner = "client!uc", name = "H", descriptor = "I")
	public static int anInt5385 = -2;

	@OriginalMember(owner = "client!uc", name = "J", descriptor = "J")
	public static volatile long aLong201 = 0L;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z[B)[B")
	public static byte[] method4193(@OriginalArg(1) byte[] arg0) {
		@Pc(2) int local2 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local2];
		Static319.method508(arg0, 0, local9, 0, local2);
		return local9;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILclient!sb;)V")
	public static void method4197(@OriginalArg(1) Class1_Sub14 arg0) {
		if (arg0.aByteArray34.length - arg0.anInt3290 < 1) {
			return;
		}
		@Pc(23) int local23 = arg0.method2595();
		if (local23 < 0 || local23 > 11) {
			return;
		}
		@Pc(39) byte local39;
		if (local23 == 11) {
			local39 = 33;
		} else if (local23 == 10) {
			local39 = 32;
		} else if (local23 == 9) {
			local39 = 31;
		} else if (local23 == 8) {
			local39 = 30;
		} else if (local23 == 7) {
			local39 = 29;
		} else if (local23 == 6) {
			local39 = 28;
		} else if (local23 == 5) {
			local39 = 28;
		} else if (local23 == 4) {
			local39 = 24;
		} else if (local23 == 3) {
			local39 = 23;
		} else if (local23 == 2) {
			local39 = 22;
		} else if (local23 == 1) {
			local39 = 23;
		} else {
			local39 = 19;
		}
		if (local39 > arg0.aByteArray34.length - arg0.anInt3290) {
			return;
		}
		Static287.anInt5449 = arg0.method2595();
		if (Static287.anInt5449 < 1) {
			Static287.anInt5449 = 1;
		} else if (Static287.anInt5449 > 4) {
			Static287.anInt5449 = 4;
		}
		Static9.method2418(arg0.method2595() == 1);
		Static106.aBoolean159 = arg0.method2595() == 1;
		Static289.aBoolean394 = arg0.method2595() == 1;
		Static280.aBoolean383 = arg0.method2595() == 1;
		Static101.aBoolean145 = arg0.method2595() == 1;
		Static244.aBoolean348 = arg0.method2595() == 1;
		Static215.aBoolean288 = arg0.method2595() == 1;
		Static285.aBoolean387 = arg0.method2595() == 1;
		Static143.anInt2823 = arg0.method2595();
		if (Static143.anInt2823 > 2) {
			Static143.anInt2823 = 2;
		}
		if (local23 < 2) {
			Static302.aBoolean419 = arg0.method2595() == 1;
			arg0.method2595();
		} else {
			Static302.aBoolean419 = arg0.method2595() == 1;
		}
		Static311.aBoolean427 = arg0.method2595() == 1;
		Static269.aBoolean27 = arg0.method2595() == 1;
		Static114.anInt2269 = arg0.method2595();
		if (Static114.anInt2269 > 2) {
			Static114.anInt2269 = 2;
		}
		Static37.anInt756 = Static114.anInt2269;
		Static119.aBoolean428 = arg0.method2595() == 1;
		Static223.anInt4334 = arg0.method2595();
		if (Static223.anInt4334 > 127) {
			Static223.anInt4334 = 127;
		}
		Static311.anInt5846 = arg0.method2595();
		Static315.anInt5926 = arg0.method2595();
		if (Static315.anInt5926 > 127) {
			Static315.anInt5926 = 127;
		}
		if (local23 >= 1) {
			Static191.anInt3925 = arg0.method2593();
			Static63.anInt1285 = arg0.method2593();
		}
		if (local23 >= 3 && local23 < 6) {
			arg0.method2595();
		}
		if (local23 >= 4) {
			@Pc(384) int local384 = arg0.method2595();
			if (Static83.anInt1516 < 96) {
				local384 = 0;
			}
			Static149.method2407(local384);
		}
		if (local23 >= 5) {
			Static12.anInt192 = arg0.method2647();
		}
		if (local23 >= 6) {
			Static247.anInt4901 = arg0.method2595();
		}
		if (local23 >= 7) {
			Static8.aBoolean8 = arg0.method2595() == 1;
		}
		if (local23 >= 8) {
			Static51.aBoolean77 = arg0.method2595() == 1;
		}
		if (local23 >= 9) {
			Static157.anInt3329 = arg0.method2595();
		}
		if (local23 >= 10) {
			Static5.aBoolean1 = arg0.method2595() != 0;
		}
		if (local23 >= 11) {
			Static131.aBoolean192 = arg0.method2595() != 0;
		}
	}

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)V")
	public static void method4198() {
		if (Static58.aFloat31 < Static58.aFloat30) {
			Static58.aFloat31 = (float) ((double) Static58.aFloat31 + (double) Static58.aFloat31 / 30.0D);
			if (Static58.aFloat31 > Static58.aFloat30) {
				Static58.aFloat31 = Static58.aFloat30;
			}
			Static97.method1402();
		} else if (Static58.aFloat30 < Static58.aFloat31) {
			Static58.aFloat31 = (float) ((double) Static58.aFloat31 - (double) Static58.aFloat31 / 30.0D);
			if (Static58.aFloat30 > Static58.aFloat31) {
				Static58.aFloat31 = Static58.aFloat30;
			}
			Static97.method1402();
		}
		if (Static280.anInt5336 != -1 && Static140.anInt2753 != -1) {
			@Pc(62) int local62 = Static140.anInt2753 - Static75.anInt1427;
			@Pc(67) int local67 = Static280.anInt5336 - Static72.anInt1374;
			if (local62 < 2 || local62 > 2) {
				local62 >>= 0x4;
			}
			if (local67 < 2 || local67 > 2) {
				local67 >>= 0x4;
			}
			Static75.anInt1427 += local62;
			if (local67 == 0 && local62 == 0) {
				Static280.anInt5336 = -1;
				Static140.anInt2753 = -1;
			}
			Static72.anInt1374 += local67;
			Static97.method1402();
		}
		if (Static137.anInt2704 > 0) {
			Static314.anInt5911--;
			if (Static314.anInt5911 == 0) {
				Static314.anInt5911 = 100;
				Static137.anInt2704--;
			}
		} else {
			Static283.anInt5402 = -1;
			Static299.anInt5666 = -1;
		}
		if (!Static189.aBoolean263 || Static234.aClass24_23 == null) {
			return;
		}
		for (@Pc(152) Class1_Sub11 local152 = (Class1_Sub11) Static234.aClass24_23.method460(); local152 != null; local152 = (Class1_Sub11) Static234.aClass24_23.method464()) {
			@Pc(161) Class81 local161 = Static50.method874(local152.aClass1_Sub1_Sub10_1.anInt1638);
			if (Static119.anInt5879 == 0 && local152.method977(Static152.anInt3132, Static300.anInt5678)) {
				if (!local152.aClass1_Sub1_Sub10_1.aBoolean126) {
					local152.aClass1_Sub1_Sub10_1.aBoolean126 = true;
					Static67.method1131(local152.aClass1_Sub1_Sub10_1.anInt1638, local161.anInt2195, 15);
				}
				if (local152.aClass1_Sub1_Sub10_1.aBoolean126) {
					Static67.method1131(local152.aClass1_Sub1_Sub10_1.anInt1638, local161.anInt2195, 17);
				}
			} else if (local152.aClass1_Sub1_Sub10_1.aBoolean126) {
				local152.aClass1_Sub1_Sub10_1.aBoolean126 = false;
				Static67.method1131(local152.aClass1_Sub1_Sub10_1.anInt1638, local161.anInt2195, 16);
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "(I)V")
	public static void method4199() {
		Static47.aClass169_34.method4018();
	}
}
