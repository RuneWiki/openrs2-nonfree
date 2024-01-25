import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "Lclient!l;")
	public static Class57 aClass57_21;

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_287 = new Class22(66, 0);

	@OriginalMember(owner = "client!sp", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray58 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIIIIILclient!r;)V")
	public static void method4939(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) Class16_Sub1_Sub5 arg3) {
		Static378.method3226(arg3.anInt6893, arg3.anInt6892, 0, arg0, arg2, arg3.aByte82, arg1);
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)V")
	public static void method4940() {
		for (@Pc(11) int local11 = 0; local11 < 100; local11++) {
			Static416.aBooleanArray21[local11] = true;
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(BI)V")
	public static void method4942(@OriginalArg(1) int arg0) {
		@Pc(13) Class4_Sub1_Sub11 local13 = Static405.method5222(arg0, 8);
		local13.method2608();
	}
}
