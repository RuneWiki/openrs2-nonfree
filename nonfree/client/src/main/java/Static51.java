import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static51 {

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
	public static int anInt1261;

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_18 = new Class286(27, 8);

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
	public static int anInt1262 = -1;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)Z")
	public static boolean method900(@OriginalArg(0) int arg0) {
		Static444.anInt7770 = arg0 + 1 & 0xFFFF;
		Static142.aBoolean240 = true;
		return true;
	}
}
