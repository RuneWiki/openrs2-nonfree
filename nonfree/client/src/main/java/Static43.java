import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "[[[B")
	public static final byte[][][] aByteArrayArrayArray3 = new byte[4][104][104];

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_270 = Static81.method1507("Location");

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "Lclient!dj;")
	public static Class24 aClass24_269 = aClass24_270;

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "Z")
	public static boolean aBoolean61 = false;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)I")
	public static int method797(@OriginalArg(1) int arg0) {
		@Pc(7) Class1_Sub2_Sub6 local7 = Static41.method1050(arg0);
		@Pc(15) int local15 = local7.anInt1161;
		@Pc(18) int local18 = local7.anInt1160;
		@Pc(21) int local21 = local7.anInt1164;
		@Pc(27) int local27 = Class3.anIntArray410[local21 - local18];
		return Static122.anIntArray213[local15] >> local18 & local27;
	}
}
