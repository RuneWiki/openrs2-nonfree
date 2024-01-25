import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
	public static int anInt1495;

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
	public static int anInt1496 = 0;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
	public static void method1311() {
		for (@Pc(10) Class3_Sub5_Sub13 local10 = (Class3_Sub5_Sub13) Static287.aClass243_9.method5459(); local10 != null; local10 = (Class3_Sub5_Sub13) Static287.aClass243_9.method5453()) {
			if (local10.anInt6245 > 1) {
				local10.anInt6245 = 0;
				Static294.aClass295_71.method6469(((Class3_Sub5_Sub18) local10.aClass243_10.aClass3_Sub5_44.aClass3_Sub5_66).aLong258, local10);
				local10.aClass243_10.method5460();
			}
		}
		Static166.anInt3037 = 0;
		Static610.anInt10153 = 0;
		Static582.aClass302_69.method6614();
		Static141.aClass333_12.method7485();
		Static287.aClass243_9.method5460();
		Static135.method2274(Static506.aClass3_Sub5_Sub18_6);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IBI)Z")
	public static boolean method1312(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(28) boolean local28 = (arg1 & 0x37) == 0 ? Static559.method7378(arg0, arg1) : Static366.method5268(arg1, arg0);
		return Static131.method2235(arg1, arg0) | (arg0 & 0x10000) != 0 | local28;
	}
}
