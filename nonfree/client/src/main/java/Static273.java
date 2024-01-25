import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "Lclient!sk;")
	public static Class25 aClass25_3;

	@OriginalMember(owner = "client!jda", name = "e", descriptor = "[[S")
	public static short[][] aShortArrayArray10;

	@OriginalMember(owner = "client!jda", name = "c", descriptor = "Lclient!mo;")
	public static final Class239 aClass239_7 = new Class239("", 16);

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(B[[BLclient!ct;)V")
	public static void method4347(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class67_Sub1 arg1) {
		@Pc(20) int[] local20 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(23) int local23 = arg0.length;
		@Pc(44) int local44;
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(31) byte[] local31 = arg0[local25];
			if (local31 != null) {
				@Pc(38) Class3_Sub17 local38 = new Class3_Sub17(local31);
				local44 = Static442.anIntArray464[local25] >> 8;
				@Pc(50) int local50 = Static442.anIntArray464[local25] & 0xFF;
				@Pc(57) int local57 = local44 * 64 - Static417.anInt7047;
				@Pc(64) int local64 = local50 * 64 - Static347.anInt7851;
				Static312.method4827();
				arg1.method1818(Static27.aClass198Array1, local64, Static347.anInt7851, Static417.anInt7047, local57, local38);
				arg1.method1833(local38, local57, local20, Static582.aClass16_12, local64);
				if (!arg1.aBoolean179 && local44 == Static660.anInt10217 / 8 && Static279.anInt5230 / 8 == local50 && local20[0] != -1) {
					Static578.aClass10_1 = Static377.aClass222_1.method5125(Static357.aClass322_4, local20[2], local20[1], local20[0], local20[3]);
					Static112.anInt2272 = local20[4];
				}
			}
		}
		for (@Pc(137) int local137 = 0; local137 < local23; local137++) {
			@Pc(150) int local150 = (Static442.anIntArray464[local137] >> 8) * 64 - Static417.anInt7047;
			local44 = (Static442.anIntArray464[local137] & 0xFF) * 64 - Static347.anInt7851;
			@Pc(165) byte[] local165 = arg0[local137];
			if (local165 == null && Static279.anInt5230 < 800) {
				Static312.method4827();
				arg1.method1817(local150, local44);
			}
		}
	}
}
