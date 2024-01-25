import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!aba", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString18;

	@OriginalMember(owner = "client!aba", name = "g", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray2;

	@OriginalMember(owner = "client!aba", name = "h", descriptor = "Lclient!ho;")
	public static Class9 aClass9_9;

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_19 = new Class289(28, 3);

	@OriginalMember(owner = "client!aba", name = "e", descriptor = "I")
	public static int anInt1080 = 0;

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(ILclient!pja;)I")
	public static int method1019(@OriginalArg(1) Class6_Sub4_Sub12 arg0) {
		@Pc(7) String local7 = Static103.method1677(arg0);
		@Pc(9) int[] local9 = null;
		if (Static273.method4028(arg0.anInt7577)) {
			local9 = Static340.aClass121_1.method2647((int) arg0.aLong224).anIntArray357;
		} else if (arg0.anInt7576 != -1) {
			local9 = Static340.aClass121_1.method2647(arg0.anInt7576).anIntArray357;
		} else if (Static186.method2659(arg0.anInt7577)) {
			@Pc(89) Class6_Sub44 local89 = (Class6_Sub44) Static349.aClass209_32.method5038((long) (int) arg0.aLong224);
			if (local89 != null) {
				@Pc(94) Class2_Sub1_Sub1_Sub3_Sub2 local94 = local89.aClass2_Sub1_Sub1_Sub3_Sub2_2;
				@Pc(97) Class91 local97 = local94.aClass91_1;
				if (local97.anIntArray140 != null) {
					local97 = local97.method2036(Static659.aClass363_3);
				}
				if (local97 != null) {
					local9 = local97.anIntArray142;
				}
			}
		} else if (Static59.method1104(arg0.anInt7577)) {
			@Pc(54) Class308 local54;
			if (arg0.anInt7577 == 1003) {
				local54 = Static411.aClass88_3.method2024((int) arg0.aLong224);
			} else {
				local54 = Static411.aClass88_3.method2024((int) (arg0.aLong224 >>> 32 & 0x7FFFFFFFL));
			}
			if (local54.anIntArray566 != null) {
				local54 = local54.method7297(Static659.aClass363_3);
			}
			if (local54 != null) {
				local9 = local54.anIntArray570;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static521.method7353(local9);
		}
		@Pc(146) int local146 = Static173.aClass151_4.method3326(Static24.aClass9Array7, local7);
		if (arg0.aBoolean504) {
			local146 += Static408.aClass9_28.method8938() + 4;
		}
		return local146;
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(III)Z")
	public static boolean method1022(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x84080) != 0;
	}
}
