import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!cq", name = "d", descriptor = "Lclient!pt;")
	public static final Class197 aClass197_1 = new Class197("runescape", 0);

	@OriginalMember(owner = "client!cq", name = "f", descriptor = "Lclient!d;")
	public static final Class44 aClass44_7 = new Class44(4);

	@OriginalMember(owner = "client!cq", name = "g", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_24 = new Class129(6, 3);

	@OriginalMember(owner = "client!cq", name = "h", descriptor = "I")
	public static int anInt1114 = 1;

	@OriginalMember(owner = "client!cq", name = "i", descriptor = "I")
	public static int anInt1115 = -1;

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(III)B")
	public static byte method952(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)V")
	public static void method954(@OriginalArg(0) int arg0) {
		@Pc(13) Class5_Sub2_Sub9 local13 = Static72.method1073(11, arg0);
		local13.method3024();
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(I)V")
	public static void method955() {
		Static180.aClass44_29.method1024();
	}
}
