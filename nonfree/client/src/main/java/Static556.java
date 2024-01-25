import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static556 {

	@OriginalMember(owner = "client!tn", name = "i", descriptor = "Lclient!nd;")
	public static Class238 aClass238_253;

	@OriginalMember(owner = "client!tn", name = "f", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_163 = new Class145(39, -1);

	@OriginalMember(owner = "client!tn", name = "l", descriptor = "I")
	public static int anInt9201 = 0;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I[[BLclient!sa;)V")
	public static void method7838(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class309_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg0.length;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = 0; local21 < local15; local21++) {
			@Pc(27) byte[] local27 = arg0[local21];
			if (local27 != null) {
				@Pc(34) Class2_Sub17 local34 = new Class2_Sub17(local27);
				local40 = Static635.anIntArray728[local21] >> 8;
				@Pc(46) int local46 = Static635.anIntArray728[local21] & 0xFF;
				@Pc(53) int local53 = local40 * 64 - Static406.anInt6899;
				@Pc(59) int local59 = local46 * 64 - Static338.anInt5885;
				Static113.method2018();
				arg1.method7101(Static338.anInt5885, Static406.anInt6899, local34, local53, local59, Static520.aClass175Array1);
				arg1.method7110(local12, local53, Static141.aClass13_27, local59, local34);
				if (!arg1.aBoolean603 && Static470.anInt7589 / 8 == local40 && local46 == Static456.anInt7439 / 8 && local12[0] != -1) {
					Static593.aClass224_1 = Static302.aClass181_1.method4374(local12[0], Static405.aClass231_1, local12[2], local12[1], local12[3]);
					Static86.anInt2185 = local12[4];
				}
			}
		}
		for (@Pc(136) int local136 = 0; local136 < local15; local136++) {
			@Pc(149) int local149 = (Static635.anIntArray728[local136] >> 8) * 64 - Static406.anInt6899;
			local40 = (Static635.anIntArray728[local136] & 0xFF) * 64 - Static338.anInt5885;
			@Pc(163) byte[] local163 = arg0[local136];
			if (local163 == null && Static456.anInt7439 < 800) {
				Static113.method2018();
				arg1.method7098(local149, local40);
			}
		}
	}
}
