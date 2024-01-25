import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!hga", name = "b", descriptor = "[Lclient!f;")
	public static Class78[] aClass78Array10;

	@OriginalMember(owner = "client!hga", name = "n", descriptor = "F")
	public static float aFloat125;

	@OriginalMember(owner = "client!hga", name = "c", descriptor = "Z")
	public static boolean aBoolean290 = false;

	@OriginalMember(owner = "client!hga", name = "h", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!hga", name = "o", descriptor = "[[B")
	public static final byte[][] aByteArrayArray12 = new byte[250][];

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(BIIZ)I")
	public static int method3305(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(12) Class4_Sub18 local12 = Static72.method6564(arg2, arg0);
		if (local12 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(23) int local23 = 0;
			for (@Pc(25) int local25 = 0; local25 < local12.anIntArray143.length; local25++) {
				if (arg1 == local12.anIntArray144[local25]) {
					local23 += local12.anIntArray143[local25];
				}
			}
			return local23;
		}
	}
}
