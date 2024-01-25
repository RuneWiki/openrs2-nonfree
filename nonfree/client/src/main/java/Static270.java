import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!le", name = "i", descriptor = "Z")
	public static boolean aBoolean363;

	@OriginalMember(owner = "client!le", name = "l", descriptor = "[I")
	public static int[] anIntArray474;

	@OriginalMember(owner = "client!le", name = "o", descriptor = "B")
	public static byte aByte47;

	@OriginalMember(owner = "client!le", name = "h", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_70 = new Class158(66, 7);

	@OriginalMember(owner = "client!le", name = "j", descriptor = "I")
	public static int anInt5584 = 0;

	@OriginalMember(owner = "client!le", name = "k", descriptor = "Lclient!ks;")
	public static final Class168 aClass168_2 = new Class168(16);

	@OriginalMember(owner = "client!le", name = "m", descriptor = "Lclient!oo;")
	public static final Class221 aClass221_3 = new Class221("LIVE", 0);

	@OriginalMember(owner = "client!le", name = "n", descriptor = "[Lclient!tp;")
	public static final Class284[] aClass284Array1 = new Class284[100];

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZBLjava/awt/Component;)Lclient!mo;")
	public static Class54 method4699(@OriginalArg(2) Component arg0) {
		try {
			@Pc(32) Constructor local32 = Class.forName("Class54_Sub1").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class54) local32.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(50) Throwable local50) {
			return new Class54_Sub2(arg0, true);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIII)V")
	public static void method4700(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static7.aClass3_Sub15_Sub1_1.anInt8362 != 0 && arg3 != 0 && Static128.anInt2675 < 50 && arg2 != -1) {
			Static360.aClass70Array1[Static128.anInt2675++] = new Class70((byte) 1, arg2, arg3, arg0, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
	public static void method4701() {
		if (Static405.aBoolean520) {
			return;
		}
		Static405.aBoolean520 = true;
		Static256.aBoolean354 = true;
		if (Static7.aClass3_Sub15_Sub1_1.aBoolean604) {
			Static487.aFloat258 = (int) Static487.aFloat258 + 191 & 0xFFFFFF80;
		} else {
			Static479.aFloat252 += (24.0F - Static479.aFloat252) / 2.0F;
		}
	}
}
