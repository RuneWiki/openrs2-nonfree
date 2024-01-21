import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
	public static int anInt3014;

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "Lclient!eh;")
	public static Class28 aClass28_145;

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_888 = Static181.method2795("Art");

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_889 = Static181.method2795("Unable to connect)3");

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_890 = Static181.method2795("Registrierter Benutzer");

	@OriginalMember(owner = "client!pb", name = "j", descriptor = "Lclient!qe;")
	public static Class83 aClass83_891 = aClass83_889;

	@OriginalMember(owner = "client!pb", name = "k", descriptor = "Lclient!qe;")
	public static Class83 aClass83_892 = aClass83_889;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)V")
	public static void method2304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class2_Sub23 local7 = Static203.aClass2_Sub23ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class2_Sub23 local28 = Static203.aClass2_Sub23ArrayArrayArray1[local9][arg0][arg1] = Static203.aClass2_Sub23ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.anInt3553--;
				for (@Pc(38) int local38 = 0; local38 < local28.anInt3554; local38++) {
					@Pc(44) Class78 local44 = local28.aClass78Array3[local38];
					if ((local44.aLong107 >> 29 & 0x3L) == 2L && local44.anInt3028 == arg0 && local44.anInt3036 == arg1) {
						local44.anInt3033--;
					}
				}
			}
		}
		if (Static203.aClass2_Sub23ArrayArrayArray1[0][arg0][arg1] == null) {
			Static203.aClass2_Sub23ArrayArrayArray1[0][arg0][arg1] = new Class2_Sub23(0, arg0, arg1);
		}
		Static203.aClass2_Sub23ArrayArrayArray1[0][arg0][arg1].aClass2_Sub23_1 = local7;
		Static203.aClass2_Sub23ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
	public static void method2305() {
		Static25.aClass86_53.method2641();
		Static100.aClass91_7.method2709();
		Static182.aClass86_48.method2641();
	}
}
