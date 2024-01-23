import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!db", name = "s", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray2;

	@OriginalMember(owner = "client!db", name = "v", descriptor = "[I")
	public static int[] anIntArray115;

	@OriginalMember(owner = "client!db", name = "C", descriptor = "Ljava/lang/String;")
	public static String aString42 = "flash3:";

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method927(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(4) String local4 = arg1.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg0 ? 32768 : 0;
		@Pc(28) int local28 = local19 + (arg0 ? Static205.anInt4560 : Static170.anInt6011);
		for (@Pc(34) int local34 = local19; local34 < local28; local34++) {
			@Pc(45) Class1_Sub2_Sub20 local45 = Static81.method1454(local34);
			if (local45.aBoolean306 && local45.method4522().toLowerCase().indexOf(local4) != -1) {
				if (local13 >= 50) {
					Static20.anInt5566 = -1;
					Static39.aShortArray27 = null;
					return;
				}
				if (local13 >= local11.length) {
					@Pc(77) short[] local77 = new short[local11.length * 2];
					for (@Pc(79) int local79 = 0; local79 < local13; local79++) {
						local77[local79] = local11[local79];
					}
					local11 = local77;
				}
				local11[local13++] = (short) local34;
			}
		}
		Static39.aShortArray27 = local11;
		Static20.anInt5566 = local13;
		@Pc(109) String[] local109 = new String[Static20.anInt5566];
		Static87.anInt2030 = 0;
		for (@Pc(113) int local113 = 0; local113 < Static20.anInt5566; local113++) {
			local109[local113] = Static81.method1454(local11[local113]).method4522();
		}
		Static232.method4051(local109, Static39.aShortArray27);
	}
}
