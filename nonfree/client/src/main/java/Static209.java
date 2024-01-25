import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "[I")
	public static int[] anIntArray272;

	@OriginalMember(owner = "client!ko", name = "i", descriptor = "I")
	public static int anInt3655;

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_55 = new Class146(22, 3);

	@OriginalMember(owner = "client!ko", name = "f", descriptor = "[I")
	public static final int[] anIntArray273 = new int[25];

	@OriginalMember(owner = "client!ko", name = "g", descriptor = "I")
	public static int anInt3654 = 0;

	@OriginalMember(owner = "client!ko", name = "h", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_126 = new Class56(20, 0);

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIIIII)Lclient!kc;")
	public static Class3 method2908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg0 * 986053L ^ (long) arg1 * 97549L ^ (long) arg3 * 67481L ^ (long) arg4 * 475427L ^ (long) arg5 * 32147369L ^ (long) arg2 * 76724863L;
		@Pc(44) Class3 local44 = (Class3) Static120.aClass137_17.method2744(local33);
		if (local44 == null) {
			local44 = Static172.aClass135_4.method5345(arg3, arg1, arg4, arg0, arg5, arg2);
			Static120.aClass137_17.method2732(local33, local44);
			return local44;
		} else {
			return local44;
		}
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)Lclient!fr;")
	public static Class61 method2910() {
		try {
			return new Class61_Sub2();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class61) Class.forName("Class61_Sub1").getDeclaredConstructor().newInstance();
			} catch (@Pc(22) Throwable local22) {
				return new Class61_Sub3();
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "(I)V")
	public static void method2911() {
		if (!Static168.method1847()) {
			return;
		}
		if (Static307.aStringArray35 == null) {
			Static98.method1495();
		}
		Static234.aBoolean295 = true;
		Static5.anInt89 = 0;
		try {
			Static142.aClipboard1 = Static425.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(16) Exception local16) {
		}
	}
}
