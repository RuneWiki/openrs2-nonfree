import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static594 {

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "[Lclient!xa;")
	public static Class37[] aClass37Array17;

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "I")
	public static int anInt10391;

	@OriginalMember(owner = "client!ws", name = "f", descriptor = "Lclient!ufa;")
	public static Class326 aClass326_6;

	@OriginalMember(owner = "client!ws", name = "h", descriptor = "Lclient!re;")
	public static Class279 aClass279_1;

	@OriginalMember(owner = "client!ws", name = "e", descriptor = "I")
	public static int anInt10394 = 0;

	@OriginalMember(owner = "client!ws", name = "g", descriptor = "Z")
	public static boolean aBoolean851 = false;

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Z)I")
	public static int method8380() {
		return Static313.aClass163_1.method3928();
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(III)I")
	public static int method8381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static378.anIntArray665[arg0 & 0x3] : 256;
	}
}
