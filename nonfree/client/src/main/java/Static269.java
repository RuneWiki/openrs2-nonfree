import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "Lclient!sg;")
	public static Class97 aClass97_18;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_91 = new Class117("flash3:", "blinken3:", "clignotant3:", "brilho3:");

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "Z")
	public static volatile boolean aBoolean356 = false;

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(B)V")
	public static void method4629() {
		if (Static174.anInt3440 <= 0) {
			Static55.aString9 = "";
			return;
		}
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < Static314.aStringArray21.length; local11++) {
			if (Static314.aStringArray21[local11].startsWith("--> ")) {
				local9++;
				if (Static174.anInt3440 == local9) {
					Static55.aString9 = Static314.aStringArray21[local11].substring(4);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!qa;I)I")
	public static int method4630(@OriginalArg(0) Class67_Sub3_Sub3_Sub2 arg0) {
		@Pc(13) int local13 = arg0.anInt5077;
		@Pc(17) Class55 local17 = arg0.method4374();
		if (arg0.aBoolean328) {
			local13 = arg0.anInt5103;
		} else if (local17.anInt1208 == arg0.anInt5040 || local17.anInt1194 == arg0.anInt5040 || arg0.anInt5040 == local17.anInt1182 || local17.anInt1195 == arg0.anInt5040) {
			local13 = arg0.anInt5108;
		} else if (local17.anInt1211 == arg0.anInt5040 || local17.anInt1177 == arg0.anInt5040 || arg0.anInt5040 == local17.anInt1216 || local17.anInt1190 == arg0.anInt5040) {
			local13 = arg0.anInt5102;
		}
		return local13;
	}
}
