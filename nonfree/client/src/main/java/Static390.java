import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "I")
	public static int anInt6847 = 0;

	@OriginalMember(owner = "client!ts", name = "f", descriptor = "I")
	public static int anInt6850 = 0;

	@OriginalMember(owner = "client!ts", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString58 = "";

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIII)V")
	public static void method5373(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class113 local7 = Static176.aClass113ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class4_Sub1 local13 = local7.aClass4_Sub1_2;
		@Pc(16) Class4_Sub1 local16 = local7.aClass4_Sub1_3;
		if (local13 != null) {
			local13.anInt5524 = local13.anInt5524 * arg3 / (0x10 << Static250.anInt4056 - 7);
			local13.anInt5526 = local13.anInt5526 * arg3 / (0x10 << Static250.anInt4056 - 7);
		}
		if (local16 != null) {
			local16.anInt5524 = local16.anInt5524 * arg3 / (0x10 << Static250.anInt4056 - 7);
			local16.anInt5526 = local16.anInt5526 * arg3 / (0x10 << Static250.anInt4056 - 7);
		}
	}
}
