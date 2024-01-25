import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!gs", name = "i", descriptor = "Lclient!ga;")
	public static Class114 aClass114_4;

	@OriginalMember(owner = "client!gs", name = "l", descriptor = "I")
	public static int anInt9133;

	@OriginalMember(owner = "client!gs", name = "m", descriptor = "I")
	public static int anInt9134;

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "I")
	public static int anInt9127 = 0;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(III[B)[B")
	public static byte[] method7479(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		@Pc(15) byte[] local15 = new byte[32768];
		Static598.method1173(arg1, arg0, local15, 0, 32768);
		return local15;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIII)I")
	public static int method7482(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg2 / arg0;
		@Pc(18) int local18 = arg0 - 1 & arg2;
		@Pc(22) int local22 = arg1 / arg0;
		@Pc(28) int local28 = arg1 & arg0 - 1;
		@Pc(33) int local33 = Static448.method6205(local12, local22);
		@Pc(40) int local40 = Static448.method6205(local12 + 1, local22);
		@Pc(47) int local47 = Static448.method6205(local12, local22 + 1);
		@Pc(56) int local56 = Static448.method6205(local12 + 1, local22 + 1);
		@Pc(63) int local63 = Static161.method2369(local18, arg0, local33, local40);
		@Pc(70) int local70 = Static161.method2369(local18, arg0, local47, local56);
		return Static161.method2369(local28, arg0, local63, local70);
	}
}
