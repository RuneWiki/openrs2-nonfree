import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static573 {

	@OriginalMember(owner = "client!wp", name = "d", descriptor = "I")
	public static int anInt9601 = 0;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILclient!cr;Ljava/awt/Component;II)Lclient!fl;")
	public static Class45 method7835(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(2) Component arg2, @OriginalArg(4) int arg3) {
		if (Static508.anInt8600 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(31) Class45 local31 = (Class45) Class.forName("Class45_Sub1").getDeclaredConstructor().newInstance();
			local31.anInt7850 = arg0;
			local31.anIntArray621 = new int[(Static570.aBoolean666 ? 2 : 1) * 256];
			local31.method6499(arg2);
			local31.anInt7853 = (arg0 & 0xFFFFFC00) + 1024;
			if (local31.anInt7853 > 16384) {
				local31.anInt7853 = 16384;
			}
			local31.method6489(local31.anInt7853);
			if (Static390.anInt6936 > 0 && Static175.aClass67_1 == null) {
				Static175.aClass67_1 = new Class67();
				Static175.aClass67_1.aClass57_1 = arg1;
				arg1.method916(Static390.anInt6936, Static175.aClass67_1);
			}
			if (Static175.aClass67_1 != null) {
				if (Static175.aClass67_1.aClass45Array1[arg3] != null) {
					throw new IllegalArgumentException();
				}
				Static175.aClass67_1.aClass45Array1[arg3] = local31;
			}
			return local31;
		} catch (@Pc(106) Throwable local106) {
			try {
				@Pc(117) Class45_Sub2 local117 = new Class45_Sub2(arg1, arg3);
				local117.anInt7850 = arg0;
				local117.anIntArray621 = new int[(Static570.aBoolean666 ? 2 : 1) * 256];
				local117.method6499(arg2);
				local117.anInt7853 = 16384;
				local117.method6489(local117.anInt7853);
				if (Static390.anInt6936 > 0 && Static175.aClass67_1 == null) {
					Static175.aClass67_1 = new Class67();
					Static175.aClass67_1.aClass57_1 = arg1;
					arg1.method916(Static390.anInt6936, Static175.aClass67_1);
				}
				if (Static175.aClass67_1 != null) {
					if (Static175.aClass67_1.aClass45Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					Static175.aClass67_1.aClass45Array1[arg3] = local117;
				}
				return local117;
			} catch (@Pc(179) Throwable local179) {
				return new Class45();
			}
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIIILclient!rq;I)V")
	public static void method7836(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) Class29_Sub2_Sub1 arg2, @OriginalArg(6) int arg3) {
		Static196.method2957(0, arg0, arg2.aByte103, arg2.anInt9222, arg3, arg1, arg2.anInt9218);
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(III)Z")
	public static boolean method7837(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
