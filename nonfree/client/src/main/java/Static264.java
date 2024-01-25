import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!qo", name = "sd", descriptor = "Lclient!vq;")
	public static final Class211 aClass211_31 = new Class211();

	@OriginalMember(owner = "client!qo", name = "g", descriptor = "(I)V")
	public static void method4475() {
		Static322.aClass70_90.method1405();
		Static309.aClass70_100.method1405();
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZIII)V")
	public static void method4479(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(7) int local7 = arg1 << 3;
		@Pc(11) int local11 = arg0 << 3;
		Static163.aFloat69 = local11;
		Static117.aFloat58 = local7;
		if (Static334.anInt6112 == 2) {
			Static110.anInt2047 = local11;
			Static79.anInt1450 = local7;
			Static53.anInt1017 = 0;
		}
		Static194.method3614();
		Static211.aBoolean291 = true;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!mb;Z)Lclient!mb;")
	public static Class132 method4485(@OriginalArg(0) Class132 arg0) {
		if (arg0.anInt3500 != -1) {
			return Static249.method4316(arg0.anInt3500);
		}
		@Pc(20) int local20 = arg0.anInt3551 >>> 16;
		@Pc(25) Class9 local25 = new Class9(Static197.aClass108_30);
		for (@Pc(30) Class6_Sub30 local30 = (Class6_Sub30) local25.method152(); local30 != null; local30 = (Class6_Sub30) local25.method151()) {
			if (local20 == local30.anInt4313) {
				return Static249.method4316((int) local30.aLong218);
			}
		}
		return null;
	}
}
