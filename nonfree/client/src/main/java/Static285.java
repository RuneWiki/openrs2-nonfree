import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!sf", name = "O", descriptor = "Lclient!rb;")
	public static Class172 aClass172_3;

	@OriginalMember(owner = "client!sf", name = "Q", descriptor = "[I")
	public static int[] anIntArray440;

	@OriginalMember(owner = "client!sf", name = "E", descriptor = "Lclient!dr;")
	public static final Class55 aClass55_1 = new Class55();

	@OriginalMember(owner = "client!sf", name = "H", descriptor = "I")
	public static int anInt5644 = 0;

	@OriginalMember(owner = "client!sf", name = "N", descriptor = "S")
	public static short aShort77 = 1;

	@OriginalMember(owner = "client!sf", name = "P", descriptor = "[I")
	public static final int[] anIntArray439 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(ZI)I")
	public static int method4750(@OriginalArg(0) boolean arg0) {
		@Pc(8) long local8 = Static268.method4627();
		for (@Pc(25) Class11_Sub16 local25 = arg0 ? (Class11_Sub16) Static37.aClass58_7.method1008() : (Class11_Sub16) Static37.aClass58_7.method1004(); local25 != null; local25 = (Class11_Sub16) Static37.aClass58_7.method1004()) {
			if ((local25.aLong74 & 0x3FFFFFFFFFFFFFFFL) < local8) {
				if ((local25.aLong74 & 0x4000000000000000L) != 0L) {
					@Pc(45) int local45 = (int) local25.aLong215;
					Static198.anIntArray311[local45] = Static195.anIntArray342[local45];
					local25.method5701();
					return local45;
				}
				local25.method5701();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLclient!nq;)V")
	public static void method4752(@OriginalArg(1) Class144 arg0) {
		Static212.aClass144_66 = arg0;
	}
}
