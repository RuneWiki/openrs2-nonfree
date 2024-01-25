import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!of", name = "p", descriptor = "Z")
	public static boolean aBoolean251;

	@OriginalMember(owner = "client!of", name = "r", descriptor = "I")
	public static int anInt4051;

	@OriginalMember(owner = "client!of", name = "m", descriptor = "Lclient!sl;")
	public static final Class229 aClass229_8 = new Class229("", 12);

	@OriginalMember(owner = "client!of", name = "n", descriptor = "[I")
	public static final int[] anIntArray356 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!of", name = "o", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_89 = new Class55("Examine", "Untersuchen", "Examiner", "Examinar");

	@OriginalMember(owner = "client!of", name = "q", descriptor = "[Lclient!ua;")
	public static final Class242[] aClass242Array3 = new Class242[6];

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ILclient!go;I)I")
	public static int method3215(@OriginalArg(0) int arg0, @OriginalArg(1) Class95 arg1) {
		if (!Static52.method725(arg1).method1908(arg0) && arg1.anObjectArray30 == null) {
			return -1;
		} else if (arg1.anIntArray219 == null || arg0 >= arg1.anIntArray219.length) {
			return -1;
		} else {
			return arg1.anIntArray219[arg0];
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
	public static void method3217() {
		if (Static85.anInt1679 == 2) {
			Static268.anInt4537 = 96;
			return;
		}
		try {
			@Pc(23) Method local23 = Runtime.class.getMethod("maxMemory");
			if (local23 != null) {
				try {
					@Pc(27) Runtime local27 = Runtime.getRuntime();
					@Pc(33) Long local33 = (Long) local23.invoke(local27, (Object[]) null);
					Static268.anInt4537 = (int) (local33 / 1048576L) + 1;
				} catch (@Pc(43) Throwable local43) {
				}
			}
		} catch (@Pc(45) Exception local45) {
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!go;I)V")
	public static void method3219(@OriginalArg(0) Class95 arg0) {
		if (Static210.anInt7039 != arg0.anInt2607) {
			return;
		}
		if (Static104.aClass26_Sub2_Sub4_Sub2_2.aString69 == null) {
			arg0.anInt2665 = 0;
			arg0.anInt2626 = 0;
			return;
		}
		arg0.anInt2670 = 150;
		arg0.anInt2618 = (int) (Math.sin((double) Static274.anInt4617 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt2673 = 5;
		arg0.anInt2665 = Static296.anInt4920;
		arg0.anInt2626 = Static259.method3456(Static104.aClass26_Sub2_Sub4_Sub2_2.aString69);
		arg0.anInt2621 = Static104.aClass26_Sub2_Sub4_Sub2_2.lb;
		arg0.anInt2639 = Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7055;
		arg0.anInt2582 = 0;
		arg0.anInt2659 = Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7103;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIILjava/lang/Object;)[B")
	public static byte[] method3224(@OriginalArg(2) int arg0, @OriginalArg(3) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg1;
			return Static14.method153(local18, arg0);
		} else if (arg1 instanceof Class47) {
			@Pc(30) Class47 local30 = (Class47) arg1;
			return local30.method852(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}
}
