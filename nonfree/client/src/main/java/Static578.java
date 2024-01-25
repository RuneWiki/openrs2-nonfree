import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static578 {

	@OriginalMember(owner = "client!wda", name = "g", descriptor = "Lclient!te;")
	public static final Class318 aClass318_9 = new Class318("", 13);

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(BII)Z")
	public static boolean method7666(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static2.method13(arg1, arg0) | (arg1 & 0x70000) != 0 || Static13.method5362(arg0, arg1);
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Z)V")
	public static void method7667() {
		Static341.anInt6021 = -1;
		Static355.anInt6148 = 0;
		Static329.anInt5894 = -1;
		Static238.anInt4475 = -1;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "([BIII)I")
	public static int method7668(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(14) int local14 = arg2; local14 < arg1; local14++) {
			local7 = local7 >>> 8 ^ Class3_Sub21.anIntArray191[(arg0[local14] ^ local7) & 0xFF];
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "(I)V")
	public static void method7669() {
		Static450.aBoolean583 = true;
	}
}
