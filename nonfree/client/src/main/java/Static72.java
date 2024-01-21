import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!ig", name = "sb", descriptor = "Lclient!ig;")
	public static Class30_Sub1 aClass30_Sub1_7;

	@OriginalMember(owner = "client!ig", name = "X", descriptor = "Lclient!ed;")
	public static Class23 aClass23_718 = Static169.method2903("null");

	@OriginalMember(owner = "client!ig", name = "hb", descriptor = "[I")
	public static int[] anIntArray264 = new int[200];

	@OriginalMember(owner = "client!ig", name = "pb", descriptor = "I")
	public static int anInt1984 = -1;

	@OriginalMember(owner = "client!ig", name = "ub", descriptor = "Lclient!ed;")
	public static Class23 aClass23_719 = Static169.method2903("Sprites geladen)3");

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(BLclient!ga;)V")
	public static void method1304(@OriginalArg(1) Class30 arg0) {
		Static99.aClass30_34 = arg0;
	}

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "(I)V")
	public static void method1306() {
		aClass23_718 = null;
		aClass23_719 = null;
		anIntArray264 = null;
		aClass30_Sub1_7 = null;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILclient!ed;Lclient!ed;IIZLclient!ga;)V")
	public static void method1307(@OriginalArg(1) Class23 arg0, @OriginalArg(2) Class23 arg1, @OriginalArg(6) Class30 arg2) {
		@Pc(13) int local13 = arg2.method1281(arg1);
		@Pc(19) int local19 = arg2.method1296(arg0, local13);
		Static139.method2445(local13, arg2, 255, local19);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "([Lclient!ed;III)Lclient!ed;")
	public static Class23 method1310(@OriginalArg(0) Class23[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
			if (arg0[arg1 + local20] == null) {
				arg0[local20 + arg1] = Static81.aClass23_510;
			}
			local18 += arg0[local20 + arg1].anInt1053;
		}
		@Pc(50) int local50 = 0;
		@Pc(53) byte[] local53 = new byte[local18];
		@Pc(64) Class23 local64;
		for (@Pc(55) int local55 = 0; local55 < arg2; local55++) {
			local64 = arg0[arg1 + local55];
			Static184.method628(local64.aByteArray10, 0, local53, local50, local64.anInt1053);
			local50 += local64.anInt1053;
		}
		local64 = new Class23();
		local64.anInt1053 = local18;
		local64.aByteArray10 = local53;
		return local64;
	}
}
