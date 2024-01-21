import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!w", name = "T", descriptor = "I")
	public static int anInt4555 = 0;

	@OriginalMember(owner = "client!w", name = "U", descriptor = "[I")
	public static final int[] anIntArray402 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!w", name = "V", descriptor = "I")
	public static int anInt4556 = 0;

	@OriginalMember(owner = "client!w", name = "X", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1290 = Static81.method1507("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!w", name = "Y", descriptor = "I")
	public static int anInt4558 = 0;

	@OriginalMember(owner = "client!w", name = "bb", descriptor = "[Z")
	public static final boolean[] aBooleanArray19 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

	@OriginalMember(owner = "client!w", name = "fb", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1291 = Static81.method1507("Lade)3)3)3");

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!ve;Lclient!ve;ZLclient!gb;I)V")
	public static void method3447(@OriginalArg(0) Class69 arg0, @OriginalArg(1) Class69 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class1_Sub2_Sub8_Sub1_Sub1 arg3) {
		Static130.aBoolean136 = arg2;
		Static56.aClass69_15 = arg0;
		Static110.aClass69_26 = arg1;
		@Pc(24) int local24 = Static110.aClass69_26.method2220() - 1;
		Static148.anInt3297 = Static110.aClass69_26.method2216(local24) + local24 * 256;
		Static98.aClass1_Sub2_Sub8_Sub1_Sub1_4 = arg3;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IJ)V")
	public static void method3448(@OriginalArg(1) long arg0) {
		if ((long) 0 != arg0) {
			Static176.aClass1_Sub7_Sub1_34.method2808(252);
			Static176.aClass1_Sub7_Sub1_34.method2801(arg0);
		}
	}
}
