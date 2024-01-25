import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "Lclient!nq;")
	public static Class144 aClass144_68;

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "I")
	public static int anInt4454;

	@OriginalMember(owner = "client!ns", name = "e", descriptor = "Lclient!nq;")
	public static Class144 aClass144_69;

	@OriginalMember(owner = "client!ns", name = "g", descriptor = "I")
	public static int anInt4457;

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "S")
	public static short aShort66 = 320;

	@OriginalMember(owner = "client!ns", name = "h", descriptor = "Z")
	public static boolean aBoolean296 = false;

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZZ)V")
	public static void method3921(@OriginalArg(0) boolean arg0) {
		Static306.method5146(arg0, Static79.anInt5259, Static270.anInt5491, Static164.anInt3090);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IZ)I")
	public static int method3922(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)I")
	public static int method3923(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(IZ)V")
	public static void method3925() {
		@Pc(10) Class26 local10 = Static276.aClass26_50;
		synchronized (Static276.aClass26_50) {
			Static276.aClass26_50.method329(5);
		}
	}
}
