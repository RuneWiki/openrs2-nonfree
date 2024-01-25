import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!op", name = "U", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_148 = new Class107(75, -1);

	@OriginalMember(owner = "client!op", name = "bb", descriptor = "I")
	public static int anInt5122 = 0;

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(BI)V")
	public static void method4240(@OriginalArg(1) int arg0) {
		for (@Pc(3) Class1 local3 = Static176.aClass96_20.method2342(); local3 != null; local3 = Static176.aClass96_20.method2339()) {
			if ((long) arg0 == (local3.aLong222 >> 48 & 0xFFFFL)) {
				local3.method6020();
			}
		}
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(I)V")
	public static void method4242() {
		Static339.aClass134_46.method3272();
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IZ)V")
	public static void method4245(@OriginalArg(1) boolean arg0) {
		Static99.method1777(arg0, Static95.anInt1971, Static34.anInt715, Static407.anInt6564);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(B[S)[S")
	public static short[] method4247(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) short[] local16 = new short[arg0.length];
			Static468.method4332(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}
}
