import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
	public static int anInt3826;

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "[Lclient!u;")
	public static Class227[] aClass227Array1;

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_65 = new Class11(17, 7);

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "Z")
	public static boolean aBoolean292 = false;

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_55 = new Class32("Loading fonts - ", "Lade Schriftsätze - ", "Chargement des polices - ", "Carregando fontes - ");

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method3514(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(11) int local11 = 0; local11 < Static121.anInt2600; local11++) {
			if (arg0.equalsIgnoreCase(Static174.aStringArray82[local11])) {
				return local11;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V")
	public static void method3515() {
		for (@Pc(10) Class2_Sub29 local10 = (Class2_Sub29) Static161.aClass30_18.method694(); local10 != null; local10 = (Class2_Sub29) Static161.aClass30_18.method682()) {
			if (local10.aBoolean295) {
				local10.method3586();
			}
		}
		for (@Pc(30) Class2_Sub29 local30 = (Class2_Sub29) Static386.aClass30_44.method694(); local30 != null; local30 = (Class2_Sub29) Static386.aClass30_44.method682()) {
			if (local30.aBoolean295) {
				local30.method3586();
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZI)I")
	public static int method3517(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(19) int local19 = arg0 * 6 - 61440;
		@Pc(27) int local27 = (local19 * arg0 >> 12) + 40960;
		return local27 * local13 >> 12;
	}
}
