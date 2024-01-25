import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!qk", name = "p", descriptor = "Lclient!rh;")
	public static Class275 aClass275_193 = new Class275();

	@OriginalMember(owner = "client!qk", name = "u", descriptor = "[S")
	public static final short[] aShortArray144 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZLclient!oa;)V")
	public static void method7565(@OriginalArg(1) Class121 arg0) {
		Static400.aClass191Array2 = new Class191[Static380.anIntArray555.length];
		for (@Pc(11) int local11 = 0; local11 < Static380.anIntArray555.length; local11++) {
			@Pc(17) int local17 = Static380.anIntArray555[local11];
			@Pc(22) Class146 local22 = Static261.method3647(local17, Static15.aClass251_139);
			@Pc(30) Class56 local30 = arg0.method7123(local22, Static589.method4742(Static251.aClass251_87, local17));
			Static400.aClass191Array2[local11] = new Class191(local30, local22);
		}
	}
}
