import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
	public static int anInt4049;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "[I")
	public static final int[] anIntArray498 = new int[4096];

	@OriginalMember(owner = "client!mk", name = "e", descriptor = "Z")
	public static boolean aBoolean304 = false;

	@OriginalMember(owner = "client!mk", name = "k", descriptor = "Z")
	public static boolean aBoolean305 = true;

	@OriginalMember(owner = "client!mk", name = "l", descriptor = "J")
	public static long aLong136 = 0L;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method3695(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class2_Sub1_Sub2 local16 = Static323.method4982(arg1, 2);
		local16.method410();
		local16.aString1 = arg0;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)V")
	public static void method3696() {
		@Pc(1) Class154 local1 = Static329.aClass154_48;
		synchronized (Static329.aClass154_48) {
			Static329.aClass154_48.method3758(5);
		}
		local1 = Static350.aClass154_53;
		synchronized (Static350.aClass154_53) {
			Static350.aClass154_53.method3758(5);
		}
	}
}
