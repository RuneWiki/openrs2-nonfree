import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!hk", name = "L", descriptor = "[I")
	public static int[] anIntArray345;

	@OriginalMember(owner = "client!hk", name = "U", descriptor = "I")
	public static int anInt3350;

	@OriginalMember(owner = "client!hk", name = "I", descriptor = "I")
	public static int anInt3339 = 64;

	@OriginalMember(owner = "client!hk", name = "V", descriptor = "[Z")
	public static final boolean[] aBooleanArray15 = new boolean[8];

	@OriginalMember(owner = "client!hk", name = "X", descriptor = "Lclient!bu;")
	public static final Class38 aClass38_15 = new Class38(16);

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BZ)V")
	public static void method2610(@OriginalArg(1) boolean arg0) {
		Static326.method4622();
		if (!Static100.method1714(Static170.anInt3494)) {
			return;
		}
		Static180.anInt3907++;
		if (Static180.anInt3907 < 50 && !arg0) {
			return;
		}
		Static180.anInt3907 = 0;
		if (!Static259.aBoolean313 && Static388.aClass236_13 != null) {
			Static32.method677(Static285.aClass177_78);
			try {
				Static388.aClass236_13.method5227(Static433.aClass1_Sub3_Sub1_11.anInt1710, Static433.aClass1_Sub3_Sub1_11.aByteArray14);
				Static433.aClass1_Sub3_Sub1_11.anInt1710 = 0;
			} catch (@Pc(55) IOException local55) {
				Static259.aBoolean313 = true;
			}
		}
		Static326.method4622();
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZI)V")
	public static void method2612() {
		Static32.method677(Static365.aClass177_96);
		for (@Pc(23) Class1_Sub39 local23 = (Class1_Sub39) Static177.aClass38_18.method767(); local23 != null; local23 = (Class1_Sub39) Static177.aClass38_18.method773()) {
			if (!local23.method6175()) {
				local23 = (Class1_Sub39) Static177.aClass38_18.method767();
				if (local23 == null) {
					break;
				}
			}
			if (local23.anInt6174 == 0) {
				Static285.method4176(local23, true, true);
			}
		}
		if (Static18.aClass68_1 != null) {
			Static446.method6042(Static18.aClass68_1);
			Static18.aClass68_1 = null;
		}
	}
}
