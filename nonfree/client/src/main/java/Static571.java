import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static571 {

	@OriginalMember(owner = "client!rq", name = "z", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_156 = new Class397(125, -2);

	@OriginalMember(owner = "client!rq", name = "r", descriptor = "Z")
	public static boolean aBoolean583 = false;

	@OriginalMember(owner = "client!rq", name = "v", descriptor = "J")
	public static long aLong293 = 0L;

	@OriginalMember(owner = "client!rq", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString114 = null;

	@OriginalMember(owner = "client!rq", name = "f", descriptor = "(I)Lclient!lu;")
	public static Class238_Sub1 method7400() {
		Static193.anInt3303 = 0;
		return Static368.method5066();
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "([BZ)Ljava/lang/String;")
	public static String method7403(@OriginalArg(0) byte[] arg0) {
		return Static579.method7511(0, arg0.length, arg0);
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(II)V")
	public static void method7407(@OriginalArg(1) int arg0) {
		@Pc(16) Class3_Sub7_Sub21 local16 = Static136.method2378((long) arg0, 8);
		local16.method9260();
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(III)Z")
	public static boolean method7409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static242.method3456(arg1, arg0)) {
			return (arg0 & 0xB000) != 0 | Static397.method5358(arg1, arg0) | Static338.method4837(arg0, arg1) ? true : (arg1 & 0x37) == 0 & (Static325.method4735(arg1, arg0) | Static354.method4970(arg1, arg0));
		} else {
			return false;
		}
	}
}
