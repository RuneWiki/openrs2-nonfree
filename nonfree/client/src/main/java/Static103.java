import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!dl", name = "yb", descriptor = "[I")
	public static int[] anIntArray152 = new int[2];

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIILclient!es;)V")
	public static void method1600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class15_Sub3 arg3) {
		@Pc(4) Class133 local4 = Static90.method4174(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass15_Sub3_2 = arg3;
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIBI)V")
	public static void method1603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg0 + "," + (arg2 >> 6) + "," + (arg1 >> 6) + "," + (arg2 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(local35);
		Static460.method6443(false, local35, true);
	}
}
