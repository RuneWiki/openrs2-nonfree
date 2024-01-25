import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!kb", name = "J", descriptor = "Z")
	public static boolean aBoolean369;

	@OriginalMember(owner = "client!kb", name = "K", descriptor = "[I")
	public static final int[] anIntArray286 = new int[13];

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI)Z")
	public static boolean method4122(@OriginalArg(1) int arg0) {
		Static347.aBoolean457 = true;
		Static11.anInt816 = arg0 + 1 & 0xFFFF;
		return true;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZZ)V")
	public static void method4123(@OriginalArg(1) boolean arg0) {
		Static487.method7088();
		if (!Static429.method6381(Static9.anInt758)) {
			return;
		}
		Static494.anInt9313++;
		if (Static494.anInt9313 < 50 && !arg0) {
			return;
		}
		Static494.anInt9313 = 0;
		if (!Static24.aBoolean94 && Static528.aClass36_2 != null) {
			@Pc(44) Class4_Sub39 local44 = Static32.method999(Static402.aClass356_1, Static247.aClass344_35);
			Static50.method1166(local44);
			try {
				Static446.method6581();
			} catch (@Pc(51) IOException local51) {
				Static24.aBoolean94 = true;
			}
		}
		Static487.method7088();
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([BI)Ljava/lang/String;")
	public static String method4124(@OriginalArg(0) byte[] arg0) {
		return Static380.method5901(arg0, 0, arg0.length);
	}
}
