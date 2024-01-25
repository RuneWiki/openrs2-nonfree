import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "Z")
	public static boolean aBoolean17;

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "[[S")
	public static short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "[I")
	public static final int[] anIntArray9 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
	public static volatile int anInt213 = -1;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
	public static void method153() {
		Static19.aClass198_8.method5236();
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)V")
	public static void method154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class45 local7 = Static256.aClass45ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass5_Sub5_1 != null) {
			local7.aClass5_Sub5_1 = null;
		}
		if (local7.aClass5_Sub5_2 != null) {
			local7.aClass5_Sub5_2 = null;
		}
	}
}
