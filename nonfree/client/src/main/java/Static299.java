import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!tf", name = "x", descriptor = "[I")
	public static int[] anIntArray639;

	@OriginalMember(owner = "client!tf", name = "E", descriptor = "I")
	public static int anInt5659;

	@OriginalMember(owner = "client!tf", name = "t", descriptor = "I")
	public static int anInt5652 = -1;

	@OriginalMember(owner = "client!tf", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString255 = "level: ";

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IBIIIIZFI)[[I")
	public static int[][] method5130(@OriginalArg(7) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class6_Sub1_Sub30 local13 = new Class6_Sub1_Sub30();
		local13.anInt4997 = 3;
		local13.aBoolean350 = false;
		local13.anInt4998 = (int) (arg0 * 4096.0F);
		local13.anInt4999 = 4;
		local13.anInt4989 = 8;
		local13.method5611();
		Static117.method2381(256, 64);
		for (@Pc(47) int local47 = 0; local47 < 256; local47++) {
			local13.method4562(local9[local47], local47);
		}
		return local9;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!qa;I)Z")
	public static boolean method5133(@OriginalArg(0) Class165 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean330) {
			return false;
		} else if (!arg0.method4325()) {
			return false;
		} else if (Static54.aClass108_7.method2900((long) arg0.anInt4678) == null) {
			return Static252.aClass108_28.method2900((long) arg0.anInt4700) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method5136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class187 local7 = Static39.aClass187ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class214 local13 = local7.aClass214_19; local13 != null; local13 = local13.aClass214_21) {
			@Pc(17) Class44_Sub4 local17 = local13.aClass44_Sub4_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort90 == arg1 && local17.aShort89 == arg2) {
				Static102.method4773(local17);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!dp;BLclient!dp;)V")
	public static void method5138(@OriginalArg(0) Class53 arg0, @OriginalArg(2) Class53 arg1) {
		Static145.aClass53_82 = arg1;
		Static153.aClass53_85 = arg0;
	}
}
