import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static582 {

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IZLclient!hw;)Z")
	public static boolean method8111(@OriginalArg(0) int arg0, @OriginalArg(2) Class153 arg1) {
		Static526.aClass31_38.method7920(arg1.anIntArray248[arg0], arg1.anIntArray249[arg0], arg1.anIntArray247[arg0], Static217.anIntArray243);
		@Pc(30) int local30 = Static217.anIntArray243[2];
		if (local30 < 50) {
			return false;
		} else {
			arg1.aShortArray44[arg0] = (short) (Static270.anInt5275 + Static381.anInt6906 * Static217.anIntArray243[0] / local30);
			arg1.aShortArray46[arg0] = (short) (Static104.anInt2078 * Static217.anIntArray243[1] / local30 + Static344.anInt6333);
			arg1.aShortArray45[arg0] = (short) local30;
			return true;
		}
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(I)[Lclient!al;")
	public static Class15[] method8112() {
		return new Class15[] { Static277.aClass15_8, Static75.aClass15_5, Static522.aClass15_11 };
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIB)V")
	public static void method8113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class3_Sub7_Sub5 local16 = Static138.method2377(13, arg0);
		local16.method1474();
		local16.anInt1728 = arg1;
	}
}
