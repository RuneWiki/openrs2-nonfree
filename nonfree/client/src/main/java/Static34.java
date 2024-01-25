import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "Lclient!ep;")
	public static Class60 aClass60_3;

	@OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
	public static int anInt904;

	@OriginalMember(owner = "client!cc", name = "s", descriptor = "Lclient!mk;")
	public static Class129 aClass129_1;

	@OriginalMember(owner = "client!cc", name = "p", descriptor = "J")
	public static volatile long aLong28 = 0L;

	@OriginalMember(owner = "client!cc", name = "t", descriptor = "[Z")
	public static final boolean[] aBooleanArray2 = new boolean[200];

	@OriginalMember(owner = "client!cc", name = "w", descriptor = "I")
	public static int anInt909 = -50;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)Lclient!ao;")
	public static Class12 method844(@OriginalArg(1) int arg0) {
		@Pc(15) Class12 local15 = (Class12) Static108.aClass66_36.method1939((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static131.aClass170_57.method4584(29, arg0);
		local15 = new Class12();
		if (local25 != null) {
			local15.method394(arg0, new Class5_Sub1(local25));
		}
		Static108.aClass66_36.method1936((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!ra;I)V")
	public static void method845(@OriginalArg(0) Class170 arg0) {
		Static214.aClass170_77 = arg0;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
	public static void method847() {
		@Pc(1) Class66 local1 = Static173.aClass66_80;
		synchronized (Static173.aClass66_80) {
			Static173.aClass66_80.method1942();
		}
		local1 = Static68.aClass66_27;
		synchronized (Static68.aClass66_27) {
			Static68.aClass66_27.method1942();
		}
	}
}
