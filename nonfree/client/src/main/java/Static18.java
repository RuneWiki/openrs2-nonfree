import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!b", name = "b", descriptor = "[I")
	public static int[] anIntArray17;

	@OriginalMember(owner = "client!b", name = "e", descriptor = "I")
	public static int anInt357;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "I")
	public static int anInt355 = 0;

	@OriginalMember(owner = "client!b", name = "c", descriptor = "Z")
	public static boolean aBoolean29 = false;

	@OriginalMember(owner = "client!b", name = "f", descriptor = "I")
	public static int anInt358 = 0;

	@OriginalMember(owner = "client!b", name = "g", descriptor = "I")
	public static int anInt359 = 0;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!es;")
	public static RuntimeException_Sub1 method321(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString59 = local9.aString59 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}
}
