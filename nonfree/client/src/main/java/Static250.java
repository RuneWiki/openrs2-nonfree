import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!oj", name = "o", descriptor = "Lclient!ci;")
	public static Class40 aClass40_4;

	@OriginalMember(owner = "client!oj", name = "r", descriptor = "[I")
	public static final int[] anIntArray576 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!oj", name = "A", descriptor = "[I")
	public static final int[] anIntArray578 = new int[50];

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IILclient!dt;B)V")
	public static void method4654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class62 arg2) {
		@Pc(8) Class38 local8 = arg2.method1292(Static347.aClass155_9);
		if (local8 == null) {
			return;
		}
		Static347.aClass155_9.method4867(arg0, arg1, arg2.anInt1546 + arg0, arg1 - -arg2.anInt1551);
		if (Static154.anInt6085 < 3) {
			Static327.aClass110_15.method5095((float) arg2.anInt1546 / 2.0F + (float) arg0, (float) arg1 + (float) arg2.anInt1551 / 2.0F, ((int) -Static352.aFloat68 & 0x3FFF) << 2, local8, arg0, arg1);
		} else {
			Static347.aClass155_9.method4918(local8, arg0, arg1);
		}
	}
}
