import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!oha", name = "l", descriptor = "Lclient!lga;")
	public static Class223 aClass223_89;

	@OriginalMember(owner = "client!oha", name = "j", descriptor = "[I")
	public static int[] anIntArray471;

	@OriginalMember(owner = "client!oha", name = "d", descriptor = "D")
	public static double aDouble29;

	@OriginalMember(owner = "client!oha", name = "c", descriptor = "[[B")
	public static final byte[][] aByteArrayArray130 = new byte[250][];

	@OriginalMember(owner = "client!oha", name = "e", descriptor = "[I")
	public static final int[] anIntArray470 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!oha", name = "b", descriptor = "S")
	public static short aShort81 = 32767;

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(ZI)I")
	public static int method6510(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (Static512.anIntArray533 == null) {
			return 0;
		} else if (arg0 || Static82.aClass92Array1 == null) {
			@Pc(24) int local24 = 0;
			for (@Pc(26) int local26 = 0; local26 < Static512.anIntArray533.length; local26++) {
				@Pc(34) int local34 = Static512.anIntArray533[local26];
				if (Static173.aClass223_35.method5285(local34)) {
					local24++;
				}
				if (Static57.aClass223_12.method5285(local34)) {
					local24++;
				}
			}
			if (arg1 != -17827) {
				method6510(false, 106);
			}
			return local24;
		} else {
			return Static512.anIntArray533.length * 2;
		}
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method6511(@OriginalArg(1) String arg0) {
		if (arg0.equals("")) {
			return;
		}
		@Pc(16) Class260 local16 = Static629.method8573();
		@Pc(22) Class6_Sub13 local22 = Static30.method353(Static613.aClass241_114, local16.aClass270_2);
		local22.aClass6_Sub15_Sub1_1.method3016(Static290.method8800(arg0));
		local22.aClass6_Sub15_Sub1_1.method2991(arg0);
		local16.method6404(local22);
	}
}
