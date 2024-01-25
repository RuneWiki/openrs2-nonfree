import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!dea", name = "db", descriptor = "Ljava/lang/Thread;")
	public static Thread aThread2;

	@OriginalMember(owner = "client!dea", name = "p", descriptor = "I")
	public static int anInt1748 = 0;

	@OriginalMember(owner = "client!dea", name = "h", descriptor = "Z")
	public static boolean aBoolean128 = false;

	@OriginalMember(owner = "client!dea", name = "W", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_59 = new Class251(39, 8);

	@OriginalMember(owner = "client!dea", name = "B", descriptor = "I")
	public static int anInt1762 = 1;

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(III)V")
	public static void method1691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class89 local7 = Static63.aClass89ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			Static50.method919(local7.aClass4_Sub3_Sub2_1);
			if (local7.aClass4_Sub3_Sub2_1 != null) {
				local7.aClass4_Sub3_Sub2_1 = null;
			}
		}
	}
}
