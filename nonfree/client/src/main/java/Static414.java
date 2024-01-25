import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!rj", name = "R", descriptor = "[J")
	public static long[] aLongArray12;

	@OriginalMember(owner = "client!rj", name = "D", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_98 = new Class186(1, 3);

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "(II)V")
	public static void method6199(@OriginalArg(1) int arg0) {
		if (!Static89.aClass1_Sub28_Sub1_1.aBoolean316) {
			arg0 = -1;
		}
		if (Static119.anInt2862 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(26) Class281 local26 = Static530.aClass137_2.method3828(arg0);
			@Pc(30) Class242 local30 = local26.method6883();
			if (local30 == null) {
				arg0 = -1;
			} else {
				Static91.aClass182_2.method4808(Static78.aCanvas7, new Point(local26.anInt8117, local26.anInt8118), local30.method5943(), local30.method5944(), local30.method5933());
				Static119.anInt2862 = arg0;
			}
		}
		if (arg0 == -1 && Static119.anInt2862 != -1) {
			Static91.aClass182_2.method4808(Static78.aCanvas7, new Point(), null, -1, -1);
			Static119.anInt2862 = -1;
		}
	}
}
