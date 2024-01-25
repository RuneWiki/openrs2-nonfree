import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!at", name = "x", descriptor = "[[B")
	public static byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!at", name = "y", descriptor = "I")
	public static int anInt387;

	@OriginalMember(owner = "client!at", name = "n", descriptor = "Lclient!waa;")
	public static final Class350 aClass350_1 = new Class350(16);

	@OriginalMember(owner = "client!at", name = "t", descriptor = "Lclient!hu;")
	public static final Class147 aClass147_1 = new Class147("", 17);

	@OriginalMember(owner = "client!at", name = "w", descriptor = "I")
	public static int anInt386 = 0;

	@OriginalMember(owner = "client!at", name = "z", descriptor = "I")
	public static int anInt388 = 1;

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Z)V")
	public static void method316() {
		if (Static43.aClass80_1 != null) {
			Static43.aClass80_1.method5603();
		}
		if (Static269.aClass80_3 != null) {
			Static269.aClass80_3.method5603();
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(BZLclient!mt;)V")
	public static void method317(@OriginalArg(2) Class4_Sub7_Sub3 arg0) {
		Static43.aClass80_1.method5607(arg0);
		Static38.method487(Static43.aClass80_1, Static176.aClass176_48, arg0, Static399.aClass176_103, Static112.aClass176_35);
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(IIB)Lclient!n;")
	public static Class225 method318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class225 local12 = Static490.method7272(arg0);
		if (arg1 == -1) {
			return local12;
		} else if (local12 == null || local12.aClass225Array1 == null || local12.aClass225Array1.length <= arg1) {
			return null;
		} else {
			return local12.aClass225Array1[arg1];
		}
	}
}
