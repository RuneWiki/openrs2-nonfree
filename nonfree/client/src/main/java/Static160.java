import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!k", name = "T", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!k", name = "z", descriptor = "Lclient!m;")
	public static final Class127 aClass127_16 = new Class127();

	@OriginalMember(owner = "client!k", name = "V", descriptor = "[J")
	public static final long[] aLongArray5 = new long[32];

	@OriginalMember(owner = "client!k", name = "W", descriptor = "[I")
	public static int[] anIntArray218 = new int[2];

	@OriginalMember(owner = "client!k", name = "X", descriptor = "Z")
	public static boolean aBoolean168 = false;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(II)V")
	public static void method2549(@OriginalArg(1) int arg0) {
		@Pc(16) Class3_Sub7_Sub11 local16 = Static116.method2029(arg0, 14);
		local16.method2502();
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(II)Lclient!ue;")
	public static Class200 method2551(@OriginalArg(1) int arg0) {
		@Pc(11) Class198 local11 = Static250.aClass198_45;
		@Pc(20) Class200 local20;
		synchronized (Static250.aClass198_45) {
			local20 = (Class200) Static250.aClass198_45.method5242((long) arg0);
		}
		if (local20 != null) {
			return local20;
		}
		@Pc(40) byte[] local40 = Static170.aClass100_122.method2319(Static123.method2165(arg0), Static69.method1092(arg0));
		local20 = new Class200();
		if (local40 != null) {
			local20.method5248(new Class3_Sub4(local40));
		}
		@Pc(55) Class198 local55 = Static250.aClass198_45;
		synchronized (Static250.aClass198_45) {
			Static250.aClass198_45.method5231((long) arg0, local20);
			return local20;
		}
	}
}
