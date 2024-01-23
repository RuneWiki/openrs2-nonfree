import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!tl", name = "w", descriptor = "[Lclient!in;")
	public static Class1_Sub1_Sub3[] aClass1_Sub1_Sub3Array12;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "Lclient!s;")
	public static Class156 aClass156_15 = new Class156(16);

	@OriginalMember(owner = "client!tl", name = "i", descriptor = "I")
	public static int anInt3470 = 1;

	@OriginalMember(owner = "client!tl", name = "x", descriptor = "Lclient!oj;")
	public static Interface4 anInterface4_3 = null;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Z)V")
	public static void method2801() {
		Static147.aClass169_84.method4018();
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)I")
	public static int method2806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "(B)Lclient!wi;")
	public static Class103_Sub2 method2810() {
		@Pc(25) Class103_Sub2 local25 = new Class103_Sub2(Static268.anInt5936, Static110.anInt2184, Static201.anIntArray327[0], Static148.anIntArray242[0], Static134.anIntArray220[0], Static255.anIntArray450[0], Static255.aByteArrayArray15[0], Static40.anIntArray59);
		Static295.method4395();
		return local25;
	}

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "(B)V")
	public static void method2813() {
		if (!Static291.aBoolean404 || Static169.aBoolean251) {
			return;
		}
		@Pc(13) Class1_Sub17[][][] local13 = Static122.aClass1_Sub17ArrayArrayArray3;
		for (@Pc(19) int local19 = 0; local19 < local13.length; local19++) {
			@Pc(27) Class1_Sub17[][] local27 = local13[local19];
			for (@Pc(29) int local29 = 0; local29 < local27.length; local29++) {
				for (@Pc(35) int local35 = 0; local35 < local27[local29].length; local35++) {
					@Pc(47) Class1_Sub17 local47 = local27[local29][local35];
					if (local47 != null) {
						@Pc(65) Class22_Sub4_Sub1 local65;
						if (local47.aClass171_1 != null && local47.aClass171_1.aClass22_10 instanceof Class22_Sub4_Sub1) {
							local65 = (Class22_Sub4_Sub1) local47.aClass171_1.aClass22_10;
							if ((Long.MIN_VALUE & local47.aClass171_1.aLong196) == 0L) {
								local65.method1592(false, true, true, false, true, true);
							} else {
								local65.method1592(true, true, true, true, true, true);
							}
						}
						if (local47.aClass102_1 != null) {
							if (local47.aClass102_1.aClass22_4 instanceof Class22_Sub4_Sub1) {
								local65 = (Class22_Sub4_Sub1) local47.aClass102_1.aClass22_4;
								if ((local47.aClass102_1.aLong113 & Long.MIN_VALUE) == 0L) {
									local65.method1592(false, true, true, false, true, true);
								} else {
									local65.method1592(true, true, true, true, true, true);
								}
							}
							if (local47.aClass102_1.aClass22_5 instanceof Class22_Sub4_Sub1) {
								local65 = (Class22_Sub4_Sub1) local47.aClass102_1.aClass22_5;
								if ((Long.MIN_VALUE & local47.aClass102_1.aLong113) == 0L) {
									local65.method1592(false, true, true, false, true, true);
								} else {
									local65.method1592(true, true, true, true, true, true);
								}
							}
						}
						if (local47.aClass61_1 != null) {
							if (local47.aClass61_1.aClass22_2 instanceof Class22_Sub4_Sub1) {
								local65 = (Class22_Sub4_Sub1) local47.aClass61_1.aClass22_2;
								if ((Long.MIN_VALUE & local47.aClass61_1.aLong65) == 0L) {
									local65.method1592(false, true, true, false, true, true);
								} else {
									local65.method1592(true, true, true, true, true, true);
								}
							}
							if (local47.aClass61_1.aClass22_3 instanceof Class22_Sub4_Sub1) {
								local65 = (Class22_Sub4_Sub1) local47.aClass61_1.aClass22_3;
								if ((Long.MIN_VALUE & local47.aClass61_1.aLong65) == 0L) {
									local65.method1592(false, true, true, false, true, true);
								} else {
									local65.method1592(true, true, true, true, true, true);
								}
							}
						}
						for (@Pc(263) int local263 = 0; local263 < local47.anInt3452; local263++) {
							if (local47.aClass60Array3[local263].aClass22_1 instanceof Class22_Sub4_Sub1) {
								@Pc(282) Class22_Sub4_Sub1 local282 = (Class22_Sub4_Sub1) local47.aClass60Array3[local263].aClass22_1;
								if ((local47.aClass60Array3[local263].aLong64 & Long.MIN_VALUE) == 0L) {
									local282.method1592(false, true, true, false, true, true);
								} else {
									local282.method1592(true, true, true, true, true, true);
								}
							}
						}
					}
				}
			}
		}
		Static169.aBoolean251 = true;
	}
}
