import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "Lclient!kc;")
	public static Class22 aClass22_6;

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
	public static int anInt1107;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "Lclient!wd;")
	private static Class80 aClass80_369 = Static2.method59("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "Lclient!wd;")
	public static Class80 aClass80_370 = aClass80_369;

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "Lclient!wd;")
	public static Class80 aClass80_371 = Static2.method59(")4l");

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "Lclient!wd;")
	public static Class80 aClass80_372 = aClass80_369;

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
	public static final int anInt1108 = 50;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "([BIII)Z")
	public static boolean method589(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(17) Class2_Sub17 local17 = new Class2_Sub17(arg0);
		@Pc(19) int local19 = -1;
		label65: while (true) {
			@Pc(23) int local23 = local17.method1787();
			if (local23 == 0) {
				return local7;
			}
			local19 += local23;
			@Pc(34) int local34 = 0;
			@Pc(36) boolean local36 = false;
			while (true) {
				@Pc(59) int local59;
				@Pc(98) Class2_Sub1_Sub10 local98;
				do {
					@Pc(74) int local74;
					@Pc(78) int local78;
					do {
						do {
							do {
								do {
									@Pc(42) int local42;
									while (local36) {
										local42 = local17.method1787();
										if (local42 == 0) {
											continue label65;
										}
										local17.method1780();
									}
									local42 = local17.method1787();
									if (local42 == 0) {
										continue label65;
									}
									local34 += local42 - 1;
									local59 = local17.method1780() >> 2;
									@Pc(65) int local65 = local34 >> 6 & 0x3F;
									@Pc(69) int local69 = local34 & 0x3F;
									local74 = local65 + arg2;
									local78 = arg1 + local69;
								} while (local74 <= 0);
							} while (local78 <= 0);
						} while (local74 >= 103);
					} while (local78 >= 103);
					local98 = Static18.method404(local19);
				} while (local59 == 22 && Static18.aBoolean51 && local98.anInt1653 == 0 && !local98.aBoolean112);
				local36 = true;
				if (!local98.method958()) {
					Static121.anInt3086++;
					local7 = false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
	public static void method590() {
		aClass80_372 = null;
		aClass80_370 = null;
		aClass80_371 = null;
		aClass80_369 = null;
		aClass22_6 = null;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
	public static void method591() {
		for (@Pc(7) int local7 = 0; local7 < Static110.anInt2908; local7++) {
			@Pc(13) int local13 = Static85.anIntArray277[local7];
			@Pc(17) Class2_Sub1_Sub1_Sub4_Sub1 local17 = Static35.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local13];
			if (local17 != null) {
				Static13.method225(local17, local17.aClass2_Sub1_Sub13_1.anInt2573);
			}
		}
	}
}
