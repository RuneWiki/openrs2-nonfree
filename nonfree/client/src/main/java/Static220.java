import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!nr", name = "i", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_103 = new Class85("glow1:", "leuchten1:", "brillant1:", "brilho1:");

	@OriginalMember(owner = "client!nr", name = "j", descriptor = "I")
	public static int anInt4353 = 0;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(ZI)V")
	public static void method4014() {
		@Pc(1) Class109 local1 = Static155.aClass109_36;
		synchronized (Static155.aClass109_36) {
			Static155.aClass109_36.method2859(5);
		}
		local1 = Static236.aClass109_46;
		synchronized (Static236.aClass109_46) {
			Static236.aClass109_46.method2859(5);
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(II)Lclient!qf;")
	public static Class168 method4015(@OriginalArg(0) int arg0) {
		@Pc(10) Class168 local10 = (Class168) Static190.aClass109_6.method2857((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static133.aClass93_52.method2410(arg0, 30);
		local10 = new Class168();
		if (local20 != null) {
			local10.method4605(new Class5_Sub12(local20), arg0);
		}
		Static190.aClass109_6.method2855((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method4016(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}
}
