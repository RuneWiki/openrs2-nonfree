import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!bfa", name = "K", descriptor = "Lclient!bh;")
	public static final Class35 aClass35_1 = new Class35("WTWIP", "office", "_wip", 3);

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(BZ)V")
	public static void method797(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static554.anInt1822 != -1) {
				Static388.method6215(Static554.anInt1822);
			}
			for (@Pc(14) Class6_Sub29 local14 = (Class6_Sub29) Static507.aClass128_42.method3556(); local14 != null; local14 = (Class6_Sub29) Static507.aClass128_42.method3555()) {
				if (!local14.method9042()) {
					local14 = (Class6_Sub29) Static507.aClass128_42.method3556();
					if (local14 == null) {
						break;
					}
				}
				Static221.method3774(false, local14, true);
			}
			Static554.anInt1822 = -1;
			Static507.aClass128_42 = new Class128(8);
			Static302.method5142();
			Static554.anInt1822 = Static583.anInt9673;
			Static71.method1267(false);
			Static643.method8977();
			Static244.method4205(Static554.anInt1822);
		}
		Static286.aString63 = "";
		Static459.aString91 = "";
		Static376.aBoolean460 = false;
		Static620.method8987();
		Static351.anInt6586 = -1;
		Static384.method6193(Static648.anInt10745);
		Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1 = new Class20_Sub2_Sub2_Sub1_Sub1();
		Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10725 = Static442.anInt7975 * 512 / 2;
		Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10729 = Static284.anInt7916 * 512 / 2;
		Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anIntArray335[0] = Static442.anInt7975 / 2;
		Static524.anInt9123 = 0;
		Static580.anInt9662 = 0;
		Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anIntArray336[0] = Static284.anInt7916 / 2;
		if (Static334.anInt6354 == 2) {
			Static524.anInt9123 = Static16.anInt283 << 9;
			Static580.anInt9662 = Static636.anInt10648 << 9;
		} else {
			Static572.method8144();
		}
		Static245.method5548();
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ZCI)I")
	public static int method799(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			@Pc(16) char local16 = Character.toLowerCase(arg0);
			local7 = (local16 << 4) + 1;
		}
		return local7;
	}
}
