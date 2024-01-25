import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!dq", name = "H", descriptor = "I")
	public static int anInt1170 = 0;

	@OriginalMember(owner = "client!dq", name = "O", descriptor = "I")
	public static int anInt1177 = 104;

	@OriginalMember(owner = "client!dq", name = "Q", descriptor = "Z")
	public static boolean aBoolean117 = false;

	@OriginalMember(owner = "client!dq", name = "c", descriptor = "(III)Lclient!a;")
	public static Class1_Sub1 method1358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class51 local7 = Static196.aClass51ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass1_Sub1_1;
	}

	@OriginalMember(owner = "client!dq", name = "f", descriptor = "(I)V")
	public static void method1359() {
		if (Class139.lb.length() == 0) {
			return;
		}
		Static35.method5764("--> " + Class139.lb);
		Static133.method2575(false, Class139.lb);
		Static28.anInt436 = 0;
		Class139.lb = "";
		Static353.anInt5913 = 0;
	}

	@OriginalMember(owner = "client!dq", name = "d", descriptor = "(III)V")
	public static void method1360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = Static99.aClass82_3.method2230(Static251.aClass140_124.method4155(Static239.anInt2803));
		@Pc(24) int local24;
		for (@Pc(18) Class2_Sub31 local18 = (Class2_Sub31) Static103.aClass180_24.method4919(); local18 != null; local18 = (Class2_Sub31) Static103.aClass180_24.method4916()) {
			local24 = Static309.method5160(local18);
			if (local13 < local24) {
				local13 = local24;
			}
		}
		local13 += 8;
		local24 = Static225.anInt4918 * 16 + 21;
		@Pc(53) int local53 = arg1 - local13 / 2;
		if (local53 + local13 > Static335.anInt6496) {
			local53 = Static335.anInt6496 - local13;
		}
		if (local53 < 0) {
			local53 = 0;
		}
		@Pc(72) int local72 = arg0;
		if (Static25.anInt396 < arg0 + local24) {
			local72 = Static25.anInt396 - local24;
		}
		Static118.anInt2499 = local53;
		if (local72 < 0) {
			local72 = 0;
		}
		Static130.anInt2766 = Static225.anInt4918 * 16 + (Static257.aBoolean463 ? 26 : 22);
		Static258.aBoolean470 = true;
		Static220.anInt4855 = local72;
		Static118.anInt2488 = local13;
	}
}
