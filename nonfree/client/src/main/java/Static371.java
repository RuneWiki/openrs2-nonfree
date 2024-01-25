import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!oba", name = "c", descriptor = "Lclient!sa;")
	public static Class298 aClass298_1;

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "I")
	public static int anInt6168 = -1;

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "[I")
	public static final int[] anIntArray500 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!oba", name = "d", descriptor = "I")
	public static final int anInt6169 = 1337;

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(Z)V")
	public static void method4991() {
		if (Static362.aClass109_5.aBoolean205) {
			Static117.anInt2297 = 96;
			return;
		}
		try {
			@Pc(29) Method local29 = Runtime.class.getMethod("maxMemory");
			if (local29 != null) {
				try {
					@Pc(33) Runtime local33 = Runtime.getRuntime();
					@Pc(39) Long local39 = (Long) local29.invoke(local33, (Object[]) null);
					Static117.anInt2297 = (int) (local39 / 1048576L) + 1;
				} catch (@Pc(49) Throwable local49) {
				}
			}
		} catch (@Pc(51) Exception local51) {
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lclient!eca;I)I")
	public static int method4992(@OriginalArg(0) Class82 arg0) {
		if (Static447.aClass82_5 == arg0) {
			return 7681;
		} else if (arg0 == Static292.aClass82_4) {
			return 8448;
		} else if (arg0 == Static116.aClass82_3) {
			return 34165;
		} else if (Static59.aClass82_2 == arg0) {
			return 260;
		} else if (Static58.aClass82_1 == arg0) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(ZII)V")
	public static void method4993(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class1_Sub25 local10 = Static189.method2917(arg1, arg0);
		if (local10 != null) {
			for (@Pc(15) int local15 = 0; local15 < local10.anIntArray328.length; local15++) {
				local10.anIntArray328[local15] = -1;
				local10.anIntArray327[local15] = 0;
			}
		}
	}
}
