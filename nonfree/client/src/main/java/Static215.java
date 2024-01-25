import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!kq", name = "D", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_147 = new Class137(55, -1);

	@OriginalMember(owner = "client!kq", name = "G", descriptor = "I")
	public static int anInt3455 = 1;

	@OriginalMember(owner = "client!kq", name = "J", descriptor = "Z")
	public static boolean aBoolean275 = true;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(FZ)F")
	public static float method2846(@OriginalArg(0) float arg0) {
		return (arg0 * (arg0 * 6.0F - 15.0F) + 10.0F) * arg0 * arg0 * arg0;
	}

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "(I)Lclient!cn;")
	public static Class1_Sub7 method2851() {
		if (Static114.aClass254_45 == null || Static60.aClass172_1 == null) {
			return null;
		}
		for (@Pc(21) Class1_Sub7 local21 = (Class1_Sub7) Static60.aClass172_1.method3435(); local21 != null; local21 = (Class1_Sub7) Static60.aClass172_1.method3435()) {
			@Pc(29) Class56 local29 = Static114.aClass101_4.method2104(local21.anInt969);
			if (local29 != null && local29.aBoolean116 && local29.method1234(Static114.anInterface11_2)) {
				return local21;
			}
		}
		return null;
	}
}
