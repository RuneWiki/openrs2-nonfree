import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!gfa", name = "b", descriptor = "Lclient!qfa;")
	public static final Class307 aClass307_43 = new Class307(8);

	@OriginalMember(owner = "client!gfa", name = "b", descriptor = "(I)Lclient!tb;")
	public static Class273 method3092() {
		try {
			return (Class273) Class.forName("od").getDeclaredConstructor().newInstance();
		} catch (@Pc(19) Throwable local19) {
			return null;
		}
	}

	@OriginalMember(owner = "client!gfa", name = "b", descriptor = "(Z)V")
	public static void method3094(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static448.aClass364ArrayArrayArray2 = Static660.aClass364ArrayArrayArray3;
			Static477.aClass259Array3 = Static378.aClass259Array2;
		} else {
			Static448.aClass364ArrayArrayArray2 = Static422.aClass364ArrayArrayArray1;
			Static477.aClass259Array3 = Static43.aClass259Array1;
		}
		Static169.anInt2992 = Static448.aClass364ArrayArrayArray2.length;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(Z)V")
	public static void method3095() {
		Static121.aClass307_28.method7006();
	}
}
