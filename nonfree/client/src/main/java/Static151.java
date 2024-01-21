import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!qi", name = "n", descriptor = "Lclient!pe;")
	public static Class13 aClass13_18;

	@OriginalMember(owner = "client!qi", name = "o", descriptor = "Lclient!tg;")
	public static Class84 aClass84_2;

	@OriginalMember(owner = "client!qi", name = "p", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_740 = Static158.method3034("shake:");

	@OriginalMember(owner = "client!qi", name = "q", descriptor = "[I")
	public static final int[] anIntArray292 = new int[5];

	@OriginalMember(owner = "client!qi", name = "r", descriptor = "Lclient!ob;")
	public static Class60 aClass60_741 = aClass60_740;

	@OriginalMember(owner = "client!qi", name = "s", descriptor = "[Lclient!ca;")
	public static final Class13_Sub1[] aClass13_Sub1Array2 = new Class13_Sub1[256];

	@OriginalMember(owner = "client!qi", name = "t", descriptor = "[Lclient!cb;")
	public static final Class2_Sub1_Sub1_Sub1[] aClass2_Sub1_Sub1_Sub1Array2 = new Class2_Sub1_Sub1_Sub1[4];

	@OriginalMember(owner = "client!qi", name = "v", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_742 = Static158.method3034("(Z");

	@OriginalMember(owner = "client!qi", name = "w", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_743 = aClass60_740;

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)V")
	public static void method2091() {
		@Pc(8) int[] local8 = new int[Static62.anInt1918];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < Static62.anInt1918; local17++) {
			@Pc(23) Class2_Sub1_Sub8 local23 = Static88.method2046(local17);
			if (local23.anInt1526 >= 0 || local23.anInt1558 >= 0) {
				local8[local15++] = local17;
			}
		}
		Static97.anIntArray325 = new int[local15];
		for (@Pc(46) int local46 = 0; local46 < local15; local46++) {
			Static97.anIntArray325[local46] = local8[local46];
		}
	}
}
