import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!lea", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString37;

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "[I")
	public static final int[] anIntArray288 = new int[8];

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(DZ)V")
	public static void method4425(@OriginalArg(0) double arg0) {
		if (Static172.aDouble148 == arg0) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 256; local16++) {
			@Pc(28) int local28 = (int) (Math.pow((double) local16 / 255.0D, arg0) * 255.0D);
			Static574.anIntArray599[local16] = local28 > 255 ? 255 : local28;
		}
		Static172.aDouble148 = arg0;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Ljava/awt/Component;Lclient!pi;BII)Lclient!cv;")
	public static Class8 method4426(@OriginalArg(0) Component arg0, @OriginalArg(1) Class258 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static404.anInt6999 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(38) Class8 local38 = (Class8) Class.forName("Class8_Sub2").getDeclaredConstructor().newInstance();
			local38.anIntArray393 = new int[(Static305.aBoolean394 ? 2 : 1) * 256];
			local38.anInt6471 = arg3;
			local38.method5518(arg0);
			local38.anInt6469 = (-1024 & arg3) + 1024;
			if (local38.anInt6469 > 16384) {
				local38.anInt6469 = 16384;
			}
			local38.method5522(local38.anInt6469);
			if (Static54.anInt1036 > 0 && Static62.aClass250_1 == null) {
				Static62.aClass250_1 = new Class250();
				Static62.aClass250_1.aClass258_4 = arg1;
				arg1.method5881(Static62.aClass250_1, Static54.anInt1036);
			}
			if (Static62.aClass250_1 != null) {
				if (Static62.aClass250_1.aClass8Array1[arg2] != null) {
					throw new IllegalArgumentException();
				}
				Static62.aClass250_1.aClass8Array1[arg2] = local38;
			}
			return local38;
		} catch (@Pc(115) Throwable local115) {
			try {
				@Pc(121) Class8_Sub1 local121 = new Class8_Sub1(arg1, arg2);
				local121.anInt6471 = arg3;
				local121.anIntArray393 = new int[(Static305.aBoolean394 ? 2 : 1) * 256];
				local121.method5518(arg0);
				local121.anInt6469 = 16384;
				local121.method5522(local121.anInt6469);
				if (Static54.anInt1036 > 0 && Static62.aClass250_1 == null) {
					Static62.aClass250_1 = new Class250();
					Static62.aClass250_1.aClass258_4 = arg1;
					arg1.method5881(Static62.aClass250_1, Static54.anInt1036);
				}
				if (Static62.aClass250_1 != null) {
					if (Static62.aClass250_1.aClass8Array1[arg2] != null) {
						throw new IllegalArgumentException();
					}
					Static62.aClass250_1.aClass8Array1[arg2] = local121;
				}
				return local121;
			} catch (@Pc(190) Throwable local190) {
				return new Class8();
			}
		}
	}
}
