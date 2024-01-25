import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!ve", name = "F", descriptor = "I")
	public static int anInt7003;

	@OriginalMember(owner = "client!ve", name = "y", descriptor = "Z")
	public static boolean aBoolean463 = true;

	@OriginalMember(owner = "client!ve", name = "H", descriptor = "I")
	public static int anInt7005 = -1;

	@OriginalMember(owner = "client!ve", name = "I", descriptor = "[I")
	public static final int[] anIntArray590 = new int[32];

	@OriginalMember(owner = "client!ve", name = "K", descriptor = "[I")
	public static final int[] anIntArray591 = new int[5];

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!dw;B)V")
	public static void method5540(@OriginalArg(0) Class3_Sub2_Sub1_Sub1 arg0) {
		for (@Pc(18) Class2_Sub24 local18 = (Class2_Sub24) Static446.aClass14_49.method309(); local18 != null; local18 = (Class2_Sub24) Static446.aClass14_49.method311()) {
			if (local18.aClass3_Sub2_Sub1_Sub1_1 == arg0) {
				if (local18.aClass2_Sub3_Sub3_2 != null) {
					Static260.aClass2_Sub3_Sub1_2.method1826(local18.aClass2_Sub3_Sub3_2);
					local18.aClass2_Sub3_Sub3_2 = null;
				}
				local18.method5866();
				return;
			}
		}
	}
}
