import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static535 {

	@OriginalMember(owner = "client!qv", name = "u", descriptor = "F")
	public static float aFloat142;

	@OriginalMember(owner = "client!qv", name = "K", descriptor = "I")
	public static int anInt8478 = 2;

	@OriginalMember(owner = "client!qv", name = "J", descriptor = "I")
	public static int anInt8486 = 0;

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IB)V")
	public static void method7513(@OriginalArg(0) int arg0) {
		Static693.anIntArray741 = new int[arg0];
		Static495.anIntArray566 = new int[arg0];
		Static64.anIntArray100 = new int[arg0];
		Static133.anIntArray166 = new int[arg0];
		Static73.anIntArray109 = new int[arg0];
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lclient!oha;I)V")
	public static void method7515(@OriginalArg(0) Class274 arg0) {
		Static360.aClass274_2 = arg0;
	}
}
