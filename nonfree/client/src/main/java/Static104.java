import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!de", name = "o", descriptor = "Ljava/lang/Object;")
	public static Object anObject6;

	@OriginalMember(owner = "client!de", name = "u", descriptor = "I")
	public static int anInt2258 = 0;

	@OriginalMember(owner = "client!de", name = "l", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_32 = new Class397(77, 0);

	@OriginalMember(owner = "client!de", name = "n", descriptor = "[I")
	public static final int[] anIntArray126 = new int[13];

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)Z")
	public static boolean method2098() {
		try {
			if (Static599.anInt9088 == 2) {
				if (Static27.aClass3_Sub8_1 == null) {
					Static27.aClass3_Sub8_1 = Static729.method1125(Static224.aClass182_61, Static144.anInt2671, Static390.anInt6077);
					if (Static27.aClass3_Sub8_1 == null) {
						return false;
					}
				}
				if (Static46.aClass138_1 == null) {
					Static46.aClass138_1 = new Class138(Static202.aClass182_53, Static465.aClass182_92);
				}
				@Pc(41) Class3_Sub33_Sub3 local41 = Static708.aClass3_Sub33_Sub3_4;
				if (Static243.aClass3_Sub33_Sub3_1 != null) {
					local41 = Static243.aClass3_Sub33_Sub3_1;
				}
				if (local41.method7909(Static27.aClass3_Sub8_1, Static46.aClass138_1, Static38.aClass182_7)) {
					Static708.aClass3_Sub33_Sub3_4 = local41;
					Static708.aClass3_Sub33_Sub3_4.method7904();
					@Pc(77) int local77;
					if (Static585.anInt8894 <= 0) {
						Static599.anInt9088 = 0;
						Static708.aClass3_Sub33_Sub3_4.method7887(Static576.anInt10894);
						for (local77 = 0; local77 < Static489.anIntArray780.length; local77++) {
							Static708.aClass3_Sub33_Sub3_4.method7912(Static489.anIntArray780[local77], local77);
							Static489.anIntArray780[local77] = 255;
						}
					} else {
						Static599.anInt9088 = 3;
						Static708.aClass3_Sub33_Sub3_4.method7887(Static576.anInt10894 < Static585.anInt8894 ? Static576.anInt10894 : Static585.anInt8894);
						for (local77 = 0; local77 < Static489.anIntArray780.length; local77++) {
							Static708.aClass3_Sub33_Sub3_4.method7912(Static489.anIntArray780[local77], local77);
							Static489.anIntArray780[local77] = 255;
						}
					}
					if (Static243.aClass3_Sub33_Sub3_1 == null) {
						if (Static93.aLong71 <= 0L) {
							Static708.aClass3_Sub33_Sub3_4.method7911(Static27.aClass3_Sub8_1, Static313.aBoolean333);
						} else {
							Static708.aClass3_Sub33_Sub3_4.method7893(Static313.aBoolean333, Static27.aClass3_Sub8_1, Static93.aLong71);
						}
					}
					if (Static294.aClass107_2 != null) {
						Static294.aClass107_2.method5377(Static708.aClass3_Sub33_Sub3_4);
					}
					Static27.aClass3_Sub8_1 = null;
					Static243.aClass3_Sub33_Sub3_1 = null;
					Static93.aLong71 = 0L;
					Static46.aClass138_1 = null;
					Static224.aClass182_61 = null;
					return true;
				}
			}
		} catch (@Pc(204) Exception local204) {
			local204.printStackTrace();
			Static708.aClass3_Sub33_Sub3_4.method7884();
			Static224.aClass182_61 = null;
			Static243.aClass3_Sub33_Sub3_1 = null;
			Static27.aClass3_Sub8_1 = null;
			Static599.anInt9088 = 0;
			Static46.aClass138_1 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/String;IC)[Ljava/lang/String;")
	public static String[] method2099(@OriginalArg(0) String arg0, @OriginalArg(2) char arg1) {
		@Pc(10) int local10 = Static166.method2693(arg1, arg0);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < local10; local21++) {
			@Pc(25) int local25;
			for (local25 = local19; arg0.charAt(local25) != arg1; local25++) {
			}
			local15[local17++] = arg0.substring(local19, local25);
			local19 = local25 + 1;
		}
		local15[local10] = arg0.substring(local19);
		return local15;
	}
}
