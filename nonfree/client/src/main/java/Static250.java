import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "[I")
	public static int[] anIntArray238;

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "F")
	public static float aFloat76;

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "[I")
	public static final int[] anIntArray239 = new int[500];

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
	public static final int anInt4757 = -1;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/lang/String;IZLjava/lang/String;I)V")
	public static void method4230(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) String arg3) {
		@Pc(13) Class14_Sub54 local13 = Static594.method8426();
		local13.aClass14_Sub21_Sub2_2.method7747(Static307.aClass358_6.anInt9944);
		local13.aClass14_Sub21_Sub2_2.method7751(0);
		@Pc(28) int local28 = local13.aClass14_Sub21_Sub2_2.anInt8936;
		local13.aClass14_Sub21_Sub2_2.method7751(661);
		@Pc(37) int[] local37 = Static299.method4899(local13);
		@Pc(41) int local41 = local13.aClass14_Sub21_Sub2_2.anInt8936;
		local13.aClass14_Sub21_Sub2_2.method7690(arg0);
		local13.aClass14_Sub21_Sub2_2.method7751(Static449.anInt7513);
		local13.aClass14_Sub21_Sub2_2.method7690(arg3);
		local13.aClass14_Sub21_Sub2_2.method7735(Static653.aLong311);
		local13.aClass14_Sub21_Sub2_2.method7747(Static26.anInt352);
		local13.aClass14_Sub21_Sub2_2.method7747(Static161.aClass80_6.anInt1861);
		Static485.method7320(local13.aClass14_Sub21_Sub2_2);
		@Pc(78) String local78 = Static573.aString106;
		local13.aClass14_Sub21_Sub2_2.method7747(local78 == null ? 0 : 1);
		if (local78 != null) {
			local13.aClass14_Sub21_Sub2_2.method7690(local78);
		}
		local13.aClass14_Sub21_Sub2_2.method7747(arg1);
		local13.aClass14_Sub21_Sub2_2.method7747(arg2 ? 1 : 0);
		local13.aClass14_Sub21_Sub2_2.anInt8936 += 7;
		local13.aClass14_Sub21_Sub2_2.method7710(local37, local13.aClass14_Sub21_Sub2_2.anInt8936, local41);
		local13.aClass14_Sub21_Sub2_2.method7716(local13.aClass14_Sub21_Sub2_2.anInt8936 - local28);
		Static277.aClass347_1.method8308(local13);
		Static649.anInt10662 = 0;
		Static689.anInt11198 = -3;
		Static535.anInt9160 = 0;
		Static465.anInt7807 = 1;
		if (arg1 < 13) {
			Static32.aBoolean770 = true;
			Static474.method7102();
		}
	}
}
