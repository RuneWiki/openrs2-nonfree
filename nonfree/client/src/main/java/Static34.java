import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!cf", name = "R", descriptor = "I")
	public static int anInt736;

	@OriginalMember(owner = "client!cf", name = "T", descriptor = "Lclient!oj;")
	public static Class13 aClass13_1;

	@OriginalMember(owner = "client!cf", name = "N", descriptor = "[I")
	public static final int[] anIntArray112 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!cf", name = "P", descriptor = "I")
	public static int anInt734 = 0;

	@OriginalMember(owner = "client!cf", name = "S", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray2 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!cf", name = "U", descriptor = "Ljava/lang/String;")
	public static String aString5 = null;

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(III)V")
	public static void method765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class227 local7 = Static297.aClass227ArrayArrayArray7[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass12_Sub2_2 != null) {
			local7.aClass12_Sub2_2 = null;
		}
		if (local7.aClass12_Sub2_3 != null) {
			local7.aClass12_Sub2_3 = null;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)I")
	public static int method767(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
