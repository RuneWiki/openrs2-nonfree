import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!fb", name = "K", descriptor = "I")
	public static int anInt4618;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BII)I")
	public static int method4223(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static214.anIntArray300[arg1 & 0x3] : Static224.anIntArray321[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "(I)Lclient!mfa;")
	public static Class227 method4224() {
		return Static477.method6941();
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)I")
	public static int method4225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg1 > 0) {
			local7 = arg0 & 0x1 | local7 << 1;
			arg1--;
			arg0 >>>= 0x1;
		}
		return local7;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/awt/Component;ZB)Lclient!qha;")
	public static Class13 method4227(@OriginalArg(0) Component arg0) {
		try {
			@Pc(29) Constructor local29 = Class.forName("Class13_Sub1").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class13) local29.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(47) Throwable local47) {
			return new Class13_Sub2(arg0, true);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIZ)V")
	public static void method4228(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static567.method8019(arg0)) {
			Static487.method7152(-1, Static441.aClass357ArrayArray1[arg0], arg3, arg1, arg2);
		}
	}
}
