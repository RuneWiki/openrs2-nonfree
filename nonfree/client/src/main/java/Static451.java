import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!wp", name = "e", descriptor = "I")
	public static int anInt7607;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "[I")
	public static final int[] anIntArray529 = new int[1];

	@OriginalMember(owner = "client!wp", name = "d", descriptor = "Z")
	public static boolean aBoolean655 = false;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)I")
	public static int method5937(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(BII)Z")
	public static boolean method5938(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		@Pc(20) Class93 local20 = Static435.aClass30_4.method769(arg1);
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local20.method2064(arg0);
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(III)V")
	public static void method5939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class118 local7 = Static263.aClass118ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass7_Sub3_3 != null) {
			local7.aClass7_Sub3_3 = null;
		}
		if (local7.aClass7_Sub3_2 != null) {
			local7.aClass7_Sub3_2 = null;
		}
	}
}
