import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "Lclient!oi;")
	public static Class185 aClass185_95;

	@OriginalMember(owner = "client!rv", name = "g", descriptor = "Lclient!oi;")
	public static Class185 aClass185_96;

	@OriginalMember(owner = "client!rv", name = "e", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_94 = new Class142("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(III)Lclient!gq;")
	public static Class11_Sub4 method4799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class216 local7 = Static259.aClass216ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass11_Sub4_1;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "([[BLclient!nd;I)V")
	public static void method4801(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class104_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg0.length;
		@Pc(36) int local36;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(23) byte[] local23 = arg0[local17];
			if (local23 != null) {
				@Pc(30) Class1_Sub19 local30 = new Class1_Sub19(local23);
				local36 = Static334.anIntArray397[local17] >> 8;
				@Pc(42) int local42 = Static334.anIntArray397[local17] & 0xFF;
				@Pc(49) int local49 = local36 * 64 - Static315.anInt5207;
				@Pc(56) int local56 = local42 * 64 - Static47.anInt676;
				Static459.method5910();
				arg1.method3718(local49, local30, Static315.anInt5207, local56, Static47.anInt676, Static385.aClass158Array1);
				arg1.method3728(local49, Static186.aClass117_3, local30, local12, local56);
				if (!arg1.aBoolean425 && local36 == Static122.anInt1849 / 8 && Static1.anInt19 / 8 == local42 && local12[0] != -1) {
					Static203.aClass197_1 = Static202.aClass237_27.method5077(local12[1], local12[3], Static429.aClass126_1, local12[2], local12[0]);
					Static331.anInt5431 = local12[4];
				}
			}
		}
		for (@Pc(128) int local128 = 0; local128 < local15; local128++) {
			@Pc(141) int local141 = (Static334.anIntArray397[local128] >> 8) * 64 - Static315.anInt5207;
			local36 = (Static334.anIntArray397[local128] & 0xFF) * 64 - Static47.anInt676;
			@Pc(156) byte[] local156 = arg0[local128];
			if (local156 == null && Static1.anInt19 < 800) {
				Static459.method5910();
				arg1.method3725(local36, local141);
			}
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(BII)Z")
	public static boolean method4802(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
