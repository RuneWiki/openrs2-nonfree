import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "Lclient!db;")
	public static final Class64 aClass64_282 = new Class64(71, 6);

	@OriginalMember(owner = "client!mb", name = "u", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_73 = new Class61(14, 4);

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "Lclient!db;")
	public static final Class64 aClass64_283 = new Class64(51, 6);

	@OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
	public static int anInt5705 = 0;

	@OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
	public static final int anInt5706 = 1405;

	@OriginalMember(owner = "client!mb", name = "z", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method4844(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(16) int local16 = 0; local16 < Static282.anInt5285; local16++) {
			if (arg0.equalsIgnoreCase(Static300.aStringArray26[local16])) {
				return local16;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)Z")
	public static boolean method4845() {
		@Pc(7) Class4 local7 = Static354.aClass124_32.aClass4_90.aClass4_288;
		if (local7 == null || Static354.aClass124_32.aClass4_90 == local7) {
			return false;
		}
		@Pc(26) Class4_Sub18 local26 = (Class4_Sub18) local7;
		if (local26.anInt3158 >= 2000) {
			local26.anInt3158 -= 2000;
		}
		return local26.anInt3158 == 1006;
	}
}
