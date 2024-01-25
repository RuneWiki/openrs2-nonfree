import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!eba", name = "j", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_76 = new Class194(36, -2);

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IIIJ)V")
	public static void method2148(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2) {
		@Pc(10) int local10 = (int) arg2 >> 14 & 0x1F;
		@Pc(17) int local17 = (int) arg2 >> 20 & 0x3;
		@Pc(28) int local28 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static276.method4535(arg0, true, arg1, local17, 0, 0, 0, local10);
			return;
		}
		@Pc(42) Class330 local42 = Static370.aClass284_3.method6915(local28);
		@Pc(55) int local55;
		@Pc(58) int local58;
		if (local17 == 0 || local17 == 2) {
			local55 = local42.anInt9221;
			local58 = local42.anInt9193;
		} else {
			local55 = local42.anInt9193;
			local58 = local42.anInt9221;
		}
		@Pc(69) int local69 = local42.anInt9244;
		if (local17 != 0) {
			local69 = (local69 << local17 & 0xF) + (local69 >> 4 - local17);
		}
		Static276.method4535(arg0, true, arg1, 0, local55, local58, local69, 0);
	}
}
