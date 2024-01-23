import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!ia", name = "Q", descriptor = "I")
	public static int anInt2372;

	@OriginalMember(owner = "client!ia", name = "X", descriptor = "I")
	public static int anInt2376;

	@OriginalMember(owner = "client!ia", name = "H", descriptor = "Z")
	public static boolean aBoolean142 = true;

	@OriginalMember(owner = "client!ia", name = "P", descriptor = "I")
	public static int anInt2371 = 0;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILclient!qd;)V")
	public static void method2032(@OriginalArg(1) Class1_Sub24 arg0) {
		if (arg0.aClass1_Sub5_5 != null) {
			arg0.aClass1_Sub5_5.anInt1671 = 0;
		}
		arg0.aBoolean367 = false;
		for (@Pc(16) Class1_Sub24 local16 = arg0.method4618(); local16 != null; local16 = arg0.method4622()) {
			method2032(local16);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
	public static void method2034() {
		Static313.aClass187_80.method4525();
	}
}
