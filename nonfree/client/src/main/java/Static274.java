import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!nq", name = "C", descriptor = "I")
	public static int anInt4686;

	@OriginalMember(owner = "client!nq", name = "J", descriptor = "J")
	public static long aLong150;

	@OriginalMember(owner = "client!nq", name = "z", descriptor = "I")
	public static int anInt4684 = -1;

	@OriginalMember(owner = "client!nq", name = "B", descriptor = "Z")
	public static boolean aBoolean336 = false;

	@OriginalMember(owner = "client!nq", name = "D", descriptor = "Lclient!mu;")
	public static Class172 aClass172_1 = new Class172();

	@OriginalMember(owner = "client!nq", name = "G", descriptor = "Lclient!hi;")
	public static final Class106 aClass106_9 = new Class106(7, 0, 1, 1);

	@OriginalMember(owner = "client!nq", name = "H", descriptor = "[I")
	public static final int[] anIntArray410 = new int[13];

	@OriginalMember(owner = "client!nq", name = "I", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_77 = new Class186(13, 3);

	@OriginalMember(owner = "client!nq", name = "h", descriptor = "(I)V")
	public static void method4165() {
		try {
			@Pc(16) Method local16 = Runtime.class.getMethod("availableProcessors");
			if (local16 != null) {
				try {
					@Pc(20) Runtime local20 = Runtime.getRuntime();
					@Pc(26) Integer local26 = (Integer) local16.invoke(local20, (Object[]) null);
					Static8.anInt160 = local26;
				} catch (@Pc(31) Throwable local31) {
				}
			}
		} catch (@Pc(33) Exception local33) {
		}
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(III)Z")
	public static boolean method4166(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x10000) != 0 | Static70.method1382(arg0, arg1) || Static35.method737(arg1, arg0)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && Static73.method1405(arg0, arg1);
		}
	}
}
