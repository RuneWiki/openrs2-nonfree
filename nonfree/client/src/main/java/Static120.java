import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!dv", name = "B", descriptor = "I")
	public static int anInt2362;

	@OriginalMember(owner = "client!dv", name = "F", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray1;

	@OriginalMember(owner = "client!dv", name = "w", descriptor = "Z")
	public static boolean aBoolean200 = false;

	@OriginalMember(owner = "client!dv", name = "y", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_42 = new Class126(119, 12);

	@OriginalMember(owner = "client!dv", name = "D", descriptor = "Lclient!eaa;")
	public static final Class92 aClass92_2 = new Class92();

	@OriginalMember(owner = "client!dv", name = "E", descriptor = "[I")
	public static final int[] anIntArray154 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(II)V")
	public static void method2175() {
		Static554.aClass279_45.method6630(5);
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIIII)V")
	public static void method2177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static418.anInt7055 != 1) {
			return;
		}
		@Pc(13) int local13 = arg0 / Static552.anInt8938;
		@Pc(17) int local17 = arg1 / Static552.anInt8938;
		@Pc(25) int local25 = arg2 / Static502.anInt8445;
		@Pc(29) int local29 = arg3 / Static502.anInt8445;
		if (local13 >= Static67.anInt9115 || local17 < 0 || Static653.anInt10053 <= local25 || local29 < 0) {
			return;
		}
		if (Static653.anInt10053 <= local29) {
			local29 = Static653.anInt10053 - 1;
		}
		if (local13 < 0) {
			local13 = 0;
		}
		if (local25 < 0) {
			local25 = 0;
		}
		if (Static67.anInt9115 <= local17) {
			local17 = Static67.anInt9115 - 1;
		}
		for (@Pc(85) int local85 = local25; local85 <= local29; local85++) {
			@Pc(96) int local96 = Static88.method1799(Static638.anInt9840 + local85, Static653.anInt10053) * Static67.anInt9115;
			for (@Pc(98) int local98 = local13; local98 <= local17; local98++) {
				@Pc(109) int local109 = local96 + Static88.method1799(Static125.anInt2416 + local98, Static67.anInt9115);
				Static256.anIntArray322[local109] = Static611.anInt9531;
			}
		}
	}
}
