import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!jd", name = "P", descriptor = "Lclient!mq;")
	public static final Class163 aClass163_4 = new Class163();

	@OriginalMember(owner = "client!jd", name = "S", descriptor = "I")
	public static int anInt3500 = -1;

	@OriginalMember(owner = "client!jd", name = "T", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray6 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BIIILclient!ir;)V")
	public static void method2741(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class11_Sub1_Sub3_Sub2 arg2) {
		@Pc(10) int local10 = arg2.anIntArray246[0];
		@Pc(15) int local15 = arg2.anIntArray247[0];
		if (local10 < 0 || Static147.anInt2300 <= local10 || local15 < 0 || local15 >= Static293.anInt4886 || (arg1 < 0 || Static147.anInt2300 <= arg1 || arg0 < 0 || arg0 >= Static293.anInt4886)) {
			return;
		}
		@Pc(73) int local73 = Static282.method3775(Static385.aClass158Array1[arg2.aByte90], -4, 0, arg1, arg2.method2635(), Static279.anIntArray356, true, 0, local15, 0, 0, local10, Static392.anIntArray462, arg0);
		if (local73 >= 1 && local73 <= 3) {
			for (@Pc(85) int local85 = 0; local85 < local73 - 1; local85++) {
				arg2.method2653(Static279.anIntArray356[local85], Static392.anIntArray462[local85], (byte) 2);
			}
		}
	}
}
