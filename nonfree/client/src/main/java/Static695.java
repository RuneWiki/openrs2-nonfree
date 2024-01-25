import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static695 {

	@OriginalMember(owner = "client!vs", name = "t", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_128 = new Class286(79, -1);

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method9117(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(21) int local21 = 0; local21 < Static22.anInt373; local21++) {
			if (arg0.equalsIgnoreCase(Static432.aStringArray29[local21])) {
				return local21;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)V")
	public static void method9121() {
		if (!Static272.aBoolean432) {
			Static71.aBoolean90 = true;
			Static272.aBoolean432 = true;
			Static18.aFloat197 += (12.0F - Static18.aFloat197) / 2.0F;
		}
	}
}
