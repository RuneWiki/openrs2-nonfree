import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!re", name = "vc", descriptor = "I")
	public static int anInt6618;

	@OriginalMember(owner = "client!re", name = "mb", descriptor = "I")
	public static int anInt6560 = 0;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IZ)V")
	public static void method5563(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static170.anInt3050 != -1) {
				Static210.method3584(Static170.anInt3050);
			}
			for (@Pc(18) Class1_Sub35 local18 = (Class1_Sub35) Static468.aClass17_36.method735(); local18 != null; local18 = (Class1_Sub35) Static468.aClass17_36.method740()) {
				if (!local18.method7527()) {
					local18 = (Class1_Sub35) Static468.aClass17_36.method735();
					if (local18 == null) {
						break;
					}
				}
				Static217.method7162(false, local18, true);
			}
			Static170.anInt3050 = -1;
			Static468.aClass17_36 = new Class17(8);
			Static141.method2294();
			Static170.anInt3050 = Static253.anInt4956;
			Static465.method6533(false);
			Static299.method4748();
			Static180.method2684(Static170.anInt3050);
		}
		Static111.aBoolean140 = true;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "([S[Ljava/lang/String;Z)V")
	public static void method5617(@OriginalArg(0) short[] arg0, @OriginalArg(1) String[] arg1) {
		Static496.method6743(arg1, arg0, 0, arg1.length - 1);
	}
}
