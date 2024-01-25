import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!dma", name = "k", descriptor = "I")
	public static int anInt2335;

	@OriginalMember(owner = "client!dma", name = "e", descriptor = "[S")
	public static short[] aShortArray35;

	@OriginalMember(owner = "client!dma", name = "d", descriptor = "[I")
	public static int[] anIntArray112;

	@OriginalMember(owner = "client!dma", name = "i", descriptor = "Z")
	public static boolean aBoolean189 = false;

	@OriginalMember(owner = "client!dma", name = "a", descriptor = "(II)V")
	public static void method2069(@OriginalArg(1) int arg0) {
		@Pc(1) Class3_Sub4_Sub13 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class313 local8 = Static167.aClass313Array1[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static164.anInt3059; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static509.anInt8656; local15++) {
						local1 = local8.fa(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static394.anInt7067;
							@Pc(32) int local32 = local12 << Static394.anInt7067;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class313 local41 = Static167.aClass313Array1[local36];
								if (local41 != null) {
									@Pc(55) int local55 = local8.method9095(local12, local15) - local41.method9095(local12, local15);
									@Pc(71) int local71 = local8.method9095(local12, local15 + 1) - local41.method9095(local12, local15 + 1);
									@Pc(91) int local91 = local8.method9095(local12 + 1, local15 + 1) - local41.method9095(local12 + 1, local15 + 1);
									@Pc(107) int local107 = local8.method9095(local12 + 1, local15) - local41.method9095(local12 + 1, local15);
									local41.CA(local1, local28, (local55 + local71 + local91 + local107) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dma", name = "a", descriptor = "(Lclient!rba;I)Lclient!np;")
	public static Class260 method2070(@OriginalArg(0) Class3_Sub28 arg0) {
		@Pc(14) Class260 local14 = new Class260();
		local14.anInt7607 = arg0.method5272();
		local14.aClass3_Sub4_Sub6_1 = Static558.aClass233_2.method5417(local14.anInt7607);
		return local14;
	}
}
