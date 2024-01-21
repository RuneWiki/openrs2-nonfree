import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!rd", name = "P", descriptor = "I")
	public static int anInt3040;

	@OriginalMember(owner = "client!rd", name = "G", descriptor = "I")
	public static int anInt3033 = 0;

	@OriginalMember(owner = "client!rd", name = "I", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1379 = Static32.method683(" weitere Optionen");

	@OriginalMember(owner = "client!rd", name = "T", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1380 = Static32.method683("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!rd", name = "V", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1381 = Static32.method683("title_mute");

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZILclient!bg;)Lclient!df;")
	public static Class2_Sub2_Sub2_Sub2 method2359(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class11 arg2) {
		return Static179.method2970(arg2, arg1, arg0) ? Static112.method1898() : null;
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(B)V")
	public static void method2361() {
		aClass49_1380 = null;
		aClass49_1379 = null;
		aClass49_1381 = null;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
	public static void method2362() {
		Static86.aClass2_Sub13_Sub1_13.method2975();
		@Pc(15) int local15 = Static86.aClass2_Sub13_Sub1_13.method2978(8);
		@Pc(20) int local20;
		if (Static1.anInt2 > local15) {
			for (local20 = local15; local20 < Static1.anInt2; local20++) {
				Static111.anIntArray224[Static162.anInt3603++] = Static1.anIntArray1[local20];
			}
		}
		if (local15 > Static1.anInt2) {
			throw new RuntimeException("gnpov1");
		}
		Static1.anInt2 = 0;
		for (local20 = 0; local20 < local15; local20++) {
			@Pc(58) int local58 = Static1.anIntArray1[local20];
			@Pc(62) Class2_Sub2_Sub3_Sub7_Sub1 local62 = Static161.aClass2_Sub2_Sub3_Sub7_Sub1Array1[local58];
			@Pc(67) int local67 = Static86.aClass2_Sub13_Sub1_13.method2978(1);
			if (local67 == 0) {
				Static1.anIntArray1[Static1.anInt2++] = local58;
				local62.anInt3582 = Static127.anInt2757;
			} else {
				@Pc(87) int local87 = Static86.aClass2_Sub13_Sub1_13.method2978(2);
				if (local87 == 0) {
					Static1.anIntArray1[Static1.anInt2++] = local58;
					local62.anInt3582 = Static127.anInt2757;
					Static90.anIntArray192[Static88.anInt1850++] = local58;
				} else {
					@Pc(129) int local129;
					@Pc(139) int local139;
					if (local87 == 1) {
						Static1.anIntArray1[Static1.anInt2++] = local58;
						local62.anInt3582 = Static127.anInt2757;
						local129 = Static86.aClass2_Sub13_Sub1_13.method2978(3);
						local62.method2739(false, local129);
						local139 = Static86.aClass2_Sub13_Sub1_13.method2978(1);
						if (local139 == 1) {
							Static90.anIntArray192[Static88.anInt1850++] = local58;
						}
					} else if (local87 == 2) {
						Static1.anIntArray1[Static1.anInt2++] = local58;
						local62.anInt3582 = Static127.anInt2757;
						local129 = Static86.aClass2_Sub13_Sub1_13.method2978(3);
						local62.method2739(true, local129);
						local139 = Static86.aClass2_Sub13_Sub1_13.method2978(3);
						local62.method2739(true, local139);
						@Pc(195) int local195 = Static86.aClass2_Sub13_Sub1_13.method2978(1);
						if (local195 == 1) {
							Static90.anIntArray192[Static88.anInt1850++] = local58;
						}
					} else if (local87 == 3) {
						Static111.anIntArray224[Static162.anInt3603++] = local58;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "()V")
	public static void method2364() {
		for (@Pc(1) int local1 = 0; local1 < Static168.anInt3668; local1++) {
			@Pc(6) Class22 local6 = Static107.aClass22Array3[local1];
			Static140.method2338(local6);
			Static107.aClass22Array3[local1] = null;
		}
		Static168.anInt3668 = 0;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZII)I")
	public static int method2365(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(29) int local29 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local29;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBII)I")
	public static int method2366(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static81.aByteArrayArrayArray2[arg1][arg2][arg0] & 0x8) == 0) {
			return arg1 <= 0 || (Static81.aByteArrayArrayArray2[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}
}
