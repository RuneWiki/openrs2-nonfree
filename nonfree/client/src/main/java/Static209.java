import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "Lclient!nd;")
	public static Class60_Sub1 aClass60_Sub1_167;

	@OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
	public static int anInt4434;

	@OriginalMember(owner = "client!wh", name = "p", descriptor = "J")
	public static long aLong148;

	@OriginalMember(owner = "client!wh", name = "A", descriptor = "I")
	public static int anInt4437;

	@OriginalMember(owner = "client!wh", name = "D", descriptor = "[I")
	public static int[] anIntArray517;

	@OriginalMember(owner = "client!wh", name = "t", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2582 = Static118.method2249("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2577 = aClass65_2582;

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2578 = Static118.method2249("Tue");

	@OriginalMember(owner = "client!wh", name = "h", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2579 = Static118.method2249(":clanreq:");

	@OriginalMember(owner = "client!wh", name = "u", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2583 = Static118.method2249("Sun");

	@OriginalMember(owner = "client!wh", name = "r", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2581 = Static118.method2249("Mon");

	@OriginalMember(owner = "client!wh", name = "v", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2584 = Static118.method2249("Wed");

	@OriginalMember(owner = "client!wh", name = "C", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2586 = Static118.method2249("Thu");

	@OriginalMember(owner = "client!wh", name = "w", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2585 = Static118.method2249("Fri");

	@OriginalMember(owner = "client!wh", name = "m", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2580 = Static118.method2249("Sat");

	@OriginalMember(owner = "client!wh", name = "i", descriptor = "[Lclient!oc;")
	public static final Class65[] aClass65Array67 = new Class65[] { aClass65_2583, aClass65_2581, aClass65_2578, aClass65_2584, aClass65_2586, aClass65_2585, aClass65_2580 };

	@OriginalMember(owner = "client!wh", name = "q", descriptor = "Lclient!oh;")
	public static final Class67 aClass67_11 = new Class67(4);

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZI)I")
	public static int method3286(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAB) >>> 1);
		@Pc(25) int local25 = (local14 & 0x33333333) + (local14 >>> 2 & 0x33333333);
		@Pc(33) int local33 = local25 + (local25 >>> 4) & 0xF0F0F0F;
		@Pc(44) int local44 = local33 + (local33 >>> 8);
		@Pc(50) int local50 = local44 + (local44 >>> 16);
		return local50 & 0xFF;
	}

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "(I)V")
	public static void method3291() {
		Static189.aClass87_72.method3061();
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)V")
	public static void method3294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class1_Sub7 local7 = Static83.aClass1_Sub7ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class1_Sub7 local28 = Static83.aClass1_Sub7ArrayArrayArray1[local9][arg0][arg1] = Static83.aClass1_Sub7ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.anInt1686--;
				for (@Pc(38) int local38 = 0; local38 < local28.anInt1677; local38++) {
					@Pc(44) Class54 local44 = local28.aClass54Array2[local38];
					if ((local44.aLong83 >> 29 & 0x3L) == 2L && local44.anInt2639 == arg0 && local44.anInt2632 == arg1) {
						local44.anInt2638--;
					}
				}
			}
		}
		if (Static83.aClass1_Sub7ArrayArrayArray1[0][arg0][arg1] == null) {
			Static83.aClass1_Sub7ArrayArrayArray1[0][arg0][arg1] = new Class1_Sub7(0, arg0, arg1);
		}
		Static83.aClass1_Sub7ArrayArrayArray1[0][arg0][arg1].aClass1_Sub7_1 = local7;
		Static83.aClass1_Sub7ArrayArrayArray1[3][arg0][arg1] = null;
	}
}
