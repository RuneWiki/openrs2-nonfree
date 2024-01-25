import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "Z")
	public static boolean aBoolean83 = true;

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "[I")
	public static final int[] anIntArray77 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "[I")
	public static final int[] anIntArray78 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray6 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
	public static int anInt832 = -1;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V")
	public static void method566() {
		Static190.aClass87_36.method2477();
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)Lclient!qc;")
	public static Class17_Sub4 method574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class194 local7 = Static77.aClass194ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass17_Sub4_2;
	}
}
