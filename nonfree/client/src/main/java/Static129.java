import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static129 {

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
	public static int anInt3957;

	@OriginalMember(owner = "client!gk", name = "i", descriptor = "[I")
	public static int[] anIntArray331;

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "Lclient!gu;")
	public static Class96 aClass96_24 = new Class96(64);

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "[B")
	public static final byte[] aByteArray61 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
	public static int anInt3956 = -1;

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "Z")
	public static boolean aBoolean282 = false;

	@OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
	public static int anInt3958 = -1;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)Z")
	public static boolean method3338(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)Lclient!go;")
	public static Class91_Sub1 method3340() {
		Static447.anInt7175 = 0;
		return Static413.method5642();
	}
}
