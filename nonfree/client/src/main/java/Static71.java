import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "Lclient!uq;")
	public static Class14_Sub48 aClass14_Sub48_1;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)Lclient!tha;")
	public static Class4_Sub3_Sub1 method1139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class89 local7 = Static63.aClass89ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass4_Sub3_Sub1_2;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IBI)V")
	public static void method1141(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class14_Sub2_Sub9 local13 = Static499.method7527(0L, 15);
		local13.method4004();
		local13.anInt4592 = arg0;
		local13.anInt4595 = arg1;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)[Lclient!cg;")
	public static Class59[] method1142() {
		return new Class59[] { Static115.aClass59_4, Static351.aClass59_12, Static268.aClass59_7, Static530.aClass59_8, Static543.aClass59_9, Static594.aClass59_11, Static142.aClass59_5 };
	}
}
