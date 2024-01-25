import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static618 {

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
	public static void method8289() {
		if (!Static8.aBoolean11) {
			return;
		}
		@Pc(19) Class261 local19 = Static98.method1508(Static301.anInt4926, Static620.anInt9955);
		if (local19 != null && local19.anObjectArray23 != null) {
			@Pc(28) Class2_Sub46 local28 = new Class2_Sub46();
			local28.aClass261_10 = local19;
			local28.anObjectArray32 = local19.anObjectArray23;
			Static300.method4138(local28);
		}
		Static144.anInt2622 = -1;
		Static558.anInt9109 = -1;
		Static8.aBoolean11 = false;
		if (local19 != null) {
			Static624.method8351(local19);
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)V")
	public static void method8290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class53 local7 = Static28.aClass53ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static54.method261(local7.aClass13_Sub1_Sub3_2);
		Static54.method261(local7.aClass13_Sub1_Sub3_1);
		if (local7.aClass13_Sub1_Sub3_2 != null) {
			local7.aClass13_Sub1_Sub3_2 = null;
		}
		if (local7.aClass13_Sub1_Sub3_1 != null) {
			local7.aClass13_Sub1_Sub3_1 = null;
		}
	}
}
