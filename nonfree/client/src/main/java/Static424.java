import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static424 {

	@OriginalMember(owner = "client!qd", name = "M", descriptor = "F")
	public static float aFloat150;

	@OriginalMember(owner = "client!qd", name = "K", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_222 = new Class272(28, 8);

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!r;)V")
	public static void method6051(@OriginalArg(1) Class43 arg0) {
		Static129.aClass197Array1 = new Class197[Static22.anIntArray52.length];
		for (@Pc(11) int local11 = 0; local11 < Static22.anIntArray52.length; local11++) {
			@Pc(22) int local22 = Static22.anIntArray52[local11];
			@Pc(27) Class58 local27 = Static213.method3761(local22, Static350.aClass246_238);
			@Pc(35) Class117 local35 = arg0.method7139(local27, Static606.method7589(Static299.aClass246_141, local22));
			Static129.aClass197Array1[local11] = new Class197(local35, local27);
		}
	}
}
