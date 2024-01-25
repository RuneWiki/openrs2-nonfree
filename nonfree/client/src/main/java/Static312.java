import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!tm", name = "L", descriptor = "I")
	public static int anInt6076;

	@OriginalMember(owner = "client!tm", name = "G", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_128 = new Class85("Take", "Nehmen", "Prendre", "Pegar");

	@OriginalMember(owner = "client!tm", name = "H", descriptor = "Z")
	public static boolean aBoolean510 = false;

	@OriginalMember(owner = "client!tm", name = "M", descriptor = "J")
	public static volatile long aLong211 = 0L;

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "(B)V")
	public static void method5453() {
		if (Static32.anInt628 == -1) {
			return;
		}
		@Pc(11) int local11 = Static316.aClass118_3.method4054();
		@Pc(20) int local20 = Static316.aClass118_3.method4050();
		if (Static150.aClass5_Sub26_1 != null) {
			local11 = Static150.aClass5_Sub26_1.method4478();
			local20 = Static150.aClass5_Sub26_1.method4483();
		}
		Static213.method3824(Static32.anInt628, 0, 0, Static168.anInt3376, local11, local20, 0, 0, Static256.anInt5066);
		if (Static188.aClass201_7 != null) {
			Static324.method5613(local20, local11);
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(CI)Z")
	public static boolean method5459(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}
}
