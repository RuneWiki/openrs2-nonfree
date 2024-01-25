import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!vo", name = "g", descriptor = "[J")
	public static long[] aLongArray9;

	@OriginalMember(owner = "client!vo", name = "k", descriptor = "[Lclient!l;")
	public static Class57[] aClass57Array18;

	@OriginalMember(owner = "client!vo", name = "i", descriptor = "[I")
	public static final int[] anIntArray537 = new int[1000];

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILclient!sl;)V")
	public static void method5476(@OriginalArg(1) Class215 arg0) {
		Static3.aClass4_Sub12_Sub1_5.method1133(arg0.method4926());
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(II)V")
	public static void method5478() {
		@Pc(1) Class68 local1 = Static221.aClass68_24;
		synchronized (Static221.aClass68_24) {
			Static221.aClass68_24.method1788(5);
		}
	}
}
