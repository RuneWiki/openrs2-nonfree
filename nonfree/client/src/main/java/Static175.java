import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!le", name = "l", descriptor = "I")
	public static int anInt3627;

	@OriginalMember(owner = "client!le", name = "s", descriptor = "Lclient!lf;")
	public static Class90 aClass90_12;

	@OriginalMember(owner = "client!le", name = "j", descriptor = "S")
	public static short aShort35 = 32767;

	@OriginalMember(owner = "client!le", name = "p", descriptor = "Lclient!ng;")
	public static Class140 aClass140_94 = new Class140(64);

	@OriginalMember(owner = "client!le", name = "r", descriptor = "Lclient!tc;")
	public static final Class195 aClass195_36 = new Class195();

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
	public static void method3445() {
		@Pc(10) int local10 = Static232.aClass1_Sub7_Sub1_4.method733(8);
		@Pc(15) int local15;
		if (Static334.anInt6370 > local10) {
			for (local15 = local10; local15 < Static334.anInt6370; local15++) {
				Static192.anIntArray812[Static253.anInt4863++] = Static123.anIntArray290[local15];
			}
		}
		if (local10 > Static334.anInt6370) {
			throw new RuntimeException("gppov1");
		}
		Static334.anInt6370 = 0;
		for (local15 = 0; local15 < local10; local15++) {
			@Pc(54) int local54 = Static123.anIntArray290[local15];
			@Pc(58) Class5_Sub3_Sub3_Sub1 local58 = Static254.aClass5_Sub3_Sub3_Sub1Array1[local54];
			@Pc(65) int local65 = Static232.aClass1_Sub7_Sub1_4.method733(1);
			if (local65 == 0) {
				Static123.anIntArray290[Static334.anInt6370++] = local54;
				local58.anInt4932 = Static215.anInt4246;
			} else {
				@Pc(85) int local85 = Static232.aClass1_Sub7_Sub1_4.method733(2);
				if (local85 == 0) {
					Static123.anIntArray290[Static334.anInt6370++] = local54;
					local58.anInt4932 = Static215.anInt4246;
					Static320.anIntArray768[Static125.anInt2470++] = local54;
				} else {
					@Pc(129) int local129;
					@Pc(141) int local141;
					if (local85 == 1) {
						Static123.anIntArray290[Static334.anInt6370++] = local54;
						local58.anInt4932 = Static215.anInt4246;
						local129 = Static232.aClass1_Sub7_Sub1_4.method733(3);
						local58.method4532(local129, 1);
						local141 = Static232.aClass1_Sub7_Sub1_4.method733(1);
						if (local141 == 1) {
							Static320.anIntArray768[Static125.anInt2470++] = local54;
						}
					} else if (local85 == 2) {
						Static123.anIntArray290[Static334.anInt6370++] = local54;
						local58.anInt4932 = Static215.anInt4246;
						if (Static232.aClass1_Sub7_Sub1_4.method733(1) == 1) {
							local129 = Static232.aClass1_Sub7_Sub1_4.method733(3);
							local58.method4532(local129, 2);
							local141 = Static232.aClass1_Sub7_Sub1_4.method733(3);
							local58.method4532(local141, 2);
						} else {
							local129 = Static232.aClass1_Sub7_Sub1_4.method733(3);
							local58.method4532(local129, 0);
						}
						local129 = Static232.aClass1_Sub7_Sub1_4.method733(1);
						if (local129 == 1) {
							Static320.anIntArray768[Static125.anInt2470++] = local54;
						}
					} else if (local85 == 3) {
						Static192.anIntArray812[Static253.anInt4863++] = local54;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BII)V")
	public static void method3446(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class1_Sub1_Sub2 local15 = Static42.method1000(13, arg1);
		local15.method168();
		local15.anInt85 = arg0;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIII)V")
	public static void method3447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class1_Sub38 local12 = (Class1_Sub38) Static338.aClass26_33.method870((long) arg3);
		if (local12 == null) {
			local12 = new Class1_Sub38();
			Static338.aClass26_33.method877((long) arg3, local12);
		}
		if (arg2 >= local12.anIntArray763.length) {
			@Pc(34) int[] local34 = new int[arg2 + 1];
			@Pc(39) int[] local39 = new int[arg2 + 1];
			for (@Pc(41) int local41 = 0; local41 < local12.anIntArray763.length; local41++) {
				local34[local41] = local12.anIntArray763[local41];
				local39[local41] = local12.anIntArray762[local41];
			}
			for (@Pc(71) int local71 = local12.anIntArray763.length; local71 < arg2; local71++) {
				local34[local71] = -1;
				local39[local71] = 0;
			}
			local12.anIntArray762 = local39;
			local12.anIntArray763 = local34;
		}
		local12.anIntArray763[arg2] = arg0;
		local12.anIntArray762[arg2] = arg1;
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V")
	public static void method3449() {
		if (Static74.aClass181_3 != null) {
			@Pc(15) Class181 local15 = Static74.aClass181_3;
			synchronized (Static74.aClass181_3) {
				Static74.aClass181_3 = null;
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "()V")
	public static void method3454() {
		Static307.method5171(Static56.anInt1240);
	}
}
