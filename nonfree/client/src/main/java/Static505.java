import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static505 {

	@OriginalMember(owner = "client!uaa", name = "f", descriptor = "Z")
	public static boolean aBoolean677 = false;

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(B)V")
	public static void method7520() {
		for (@Pc(6) Class5_Sub8 local6 = (Class5_Sub8) Static436.aClass267_6.method6540(); local6 != null; local6 = (Class5_Sub8) Static436.aClass267_6.method6540()) {
			Static183.method3587(local6);
		}
		@Pc(34) int local34;
		@Pc(36) int local36;
		if (Static104.aClass6_Sub6_Sub1_4.method1075(Static5.anInt145)) {
			local34 = 0;
			local36 = 3;
		} else {
			local36 = Static410.anInt7667;
			local34 = Static410.anInt7667;
		}
		Static69.method1462();
		for (@Pc(45) int local45 = local34; local45 <= local36; local45++) {
			Static69.method1460();
			Static69.method1455(local45);
			Static69.method1456(local45);
		}
		Static69.method1457();
		Static69.method1465();
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Lclient!jo;IZ)Lclient!ed;")
	public static Class82 method7521(@OriginalArg(0) Class168 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) byte[] local13 = arg0.method4438(arg1);
		return local13 == null ? null : new Class82(local13);
	}
}
