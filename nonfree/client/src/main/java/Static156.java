import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!q", name = "lb", descriptor = "[I")
	public static int[] anIntArray386 = new int[2048];

	@OriginalMember(owner = "client!q", name = "vb", descriptor = "[I")
	public static int[] anIntArray387 = new int[128];

	@OriginalMember(owner = "client!q", name = "Cb", descriptor = "I")
	public static int anInt3673 = 0;

	@OriginalMember(owner = "client!q", name = "Kb", descriptor = "Lclient!i;")
	public static Class41 aClass41_981 = Static184.method2923("");

	@OriginalMember(owner = "client!q", name = "Mc", descriptor = "[I")
	public static int[] anIntArray392 = new int[256];

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(B)[Lclient!rh;")
	public static Class60_Sub1[] method2540() {
		@Pc(12) Class60_Sub1[] local12 = new Class60_Sub1[Static154.anInt3619];
		for (@Pc(18) int local18 = 0; local18 < Static154.anInt3619; local18++) {
			local12[local18] = new Class60_Sub1(Static14.anInt415, Static114.anInt2772, Static219.anIntArray501[local18], Static120.anIntArray310[local18], Static89.anIntArray224[local18], Static60.anIntArray498[local18], Static102.aByteArrayArray6[local18], Static25.anIntArray494);
		}
		Static212.method3255();
		return local12;
	}
}
