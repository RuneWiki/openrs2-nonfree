import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static469 {

	@OriginalMember(owner = "client!qr", name = "g", descriptor = "Lclient!re;")
	public static Class291 aClass291_1;

	@OriginalMember(owner = "client!qr", name = "h", descriptor = "I")
	public static int anInt8829;

	@OriginalMember(owner = "client!qr", name = "e", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_88 = new Class94(38, 7);

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILclient!wea;Ljava/awt/Component;II)Lclient!cba;")
	public static Class33 method7404(@OriginalArg(0) int arg0, @OriginalArg(1) Class370 arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) int arg3) {
		if (Static215.anInt4848 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(28) Class33 local28 = (Class33) Class.forName("Class33_Sub1").getDeclaredConstructor().newInstance();
			local28.anInt8547 = arg0;
			local28.anIntArray557 = new int[(Static600.aBoolean722 ? 2 : 1) * 256];
			local28.method7225(arg2);
			local28.anInt8543 = (arg0 & 0xFFFFFC00) + 1024;
			if (local28.anInt8543 > 16384) {
				local28.anInt8543 = 16384;
			}
			local28.method7212(local28.anInt8543);
			if (Static558.anInt9993 > 0 && Static452.aClass331_1 == null) {
				Static452.aClass331_1 = new Class331();
				Static452.aClass331_1.aClass370_8 = arg1;
				arg1.method9071(Static452.aClass331_1, Static558.anInt9993);
			}
			if (Static452.aClass331_1 != null) {
				if (Static452.aClass331_1.aClass33Array1[arg3] != null) {
					throw new IllegalArgumentException();
				}
				Static452.aClass331_1.aClass33Array1[arg3] = local28;
			}
			return local28;
		} catch (@Pc(106) Throwable local106) {
			try {
				@Pc(112) Class33_Sub2 local112 = new Class33_Sub2(arg1, arg3);
				local112.anInt8547 = arg0;
				local112.anIntArray557 = new int[(Static600.aBoolean722 ? 2 : 1) * 256];
				local112.method7225(arg2);
				local112.anInt8543 = 16384;
				local112.method7212(local112.anInt8543);
				if (Static558.anInt9993 > 0 && Static452.aClass331_1 == null) {
					Static452.aClass331_1 = new Class331();
					Static452.aClass331_1.aClass370_8 = arg1;
					arg1.method9071(Static452.aClass331_1, Static558.anInt9993);
				}
				if (Static452.aClass331_1 != null) {
					if (Static452.aClass331_1.aClass33Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					Static452.aClass331_1.aClass33Array1[arg3] = local112;
				}
				return local112;
			} catch (@Pc(171) Throwable local171) {
				return new Class33();
			}
		}
	}
}
