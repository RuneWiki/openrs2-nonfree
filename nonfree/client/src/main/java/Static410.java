import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!qr", name = "K", descriptor = "I")
	public static int anInt7708;

	@OriginalMember(owner = "client!qr", name = "L", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_122 = new Class45(48, 3);

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lclient!dj;IIBLjava/awt/Component;)Lclient!pr;")
	public static Class69 method6418(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Component arg3) {
		if (Static426.anInt6103 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(33) Class69 local33 = (Class69) Class.forName("Class69_Sub2").getDeclaredConstructor().newInstance();
			local33.anInt8253 = arg2;
			local33.anIntArray615 = new int[(Static140.aBoolean250 ? 2 : 1) * 256];
			local33.method6849(arg3);
			local33.anInt8252 = (arg2 & 0xFFFFFC00) + 1024;
			if (local33.anInt8252 > 16384) {
				local33.anInt8252 = 16384;
			}
			local33.method6846(local33.anInt8252);
			if (Static44.anInt846 > 0 && Static12.aClass318_1 == null) {
				Static12.aClass318_1 = new Class318();
				Static12.aClass318_1.aClass71_6 = arg0;
				arg0.method1988(Static12.aClass318_1, Static44.anInt846);
			}
			if (Static12.aClass318_1 != null) {
				if (Static12.aClass318_1.aClass69Array1[arg1] != null) {
					throw new IllegalArgumentException();
				}
				Static12.aClass318_1.aClass69Array1[arg1] = local33;
			}
			return local33;
		} catch (@Pc(111) Throwable local111) {
			try {
				@Pc(117) Class69_Sub1 local117 = new Class69_Sub1(arg0, arg1);
				local117.anIntArray615 = new int[(Static140.aBoolean250 ? 2 : 1) * 256];
				local117.anInt8253 = arg2;
				local117.method6849(arg3);
				local117.anInt8252 = 16384;
				local117.method6846(local117.anInt8252);
				if (Static44.anInt846 > 0 && Static12.aClass318_1 == null) {
					Static12.aClass318_1 = new Class318();
					Static12.aClass318_1.aClass71_6 = arg0;
					arg0.method1988(Static12.aClass318_1, Static44.anInt846);
				}
				if (Static12.aClass318_1 != null) {
					if (Static12.aClass318_1.aClass69Array1[arg1] != null) {
						throw new IllegalArgumentException();
					}
					Static12.aClass318_1.aClass69Array1[arg1] = local117;
				}
				return local117;
			} catch (@Pc(179) Throwable local179) {
				return new Class69();
			}
		}
	}
}
