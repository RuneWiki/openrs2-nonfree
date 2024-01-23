import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!vm", name = "V", descriptor = "[I")
	public static int[] anIntArray643;

	@OriginalMember(owner = "client!vm", name = "Y", descriptor = "F")
	public static float aFloat144;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!ld;Lclient!fh;Lclient!fh;ZLclient!fh;)Z")
	public static boolean method4588(@OriginalArg(0) Class4_Sub6_Sub2 arg0, @OriginalArg(1) Class58 arg1, @OriginalArg(2) Class58 arg2, @OriginalArg(4) Class58 arg3) {
		Static46.aClass4_Sub6_Sub2_3 = arg0;
		Static93.aClass58_59 = arg1;
		Static262.aClass58_93 = arg3;
		Static85.aClass58_41 = arg2;
		return true;
	}

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "(II)V")
	public static void method4590(@OriginalArg(1) int arg0) {
		@Pc(12) Class126 local12 = Static60.aClass126_1;
		synchronized (Static60.aClass126_1) {
			Static216.anInt4215 = arg0;
		}
	}
}
