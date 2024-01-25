import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!af", name = "h", descriptor = "I")
	public static int anInt159;

	@OriginalMember(owner = "client!af", name = "j", descriptor = "I")
	public static int anInt160;

	@OriginalMember(owner = "client!af", name = "m", descriptor = "[I")
	public static int[] anIntArray23;

	@OriginalMember(owner = "client!af", name = "n", descriptor = "[Lclient!sm;")
	public static Class41[] aClass41Array1;

	@OriginalMember(owner = "client!af", name = "c", descriptor = "Lclient!ng;")
	public static final Class140 aClass140_6 = new Class140(64);

	@OriginalMember(owner = "client!af", name = "i", descriptor = "Z")
	public static boolean aBoolean21 = true;

	@OriginalMember(owner = "client!af", name = "k", descriptor = "I")
	public static int anInt161 = -1;

	@OriginalMember(owner = "client!af", name = "l", descriptor = "I")
	public static final int anInt162 = 12;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IZ)I")
	public static int method243(@OriginalArg(0) int arg0) {
		@Pc(18) int local18 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(33) int local33 = (arg0 * local24 >> 12) + 40960;
		return local33 * local18 >> 12;
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(B)V")
	public static void method244() {
		if (Static157.anInt3130 <= 0) {
			Static29.aString22 = "";
			return;
		}
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < Static204.aStringArray29.length; local22++) {
			if (Static204.aStringArray29[local22].startsWith("--> ")) {
				local20++;
				if (local20 == Static157.anInt3130) {
					Static29.aString22 = Static204.aStringArray29[local22].substring(4);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
	public static void method245() {
		Static310.aClass140_157.method3813();
	}
}
