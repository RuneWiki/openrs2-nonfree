import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static587 {

	@OriginalMember(owner = "client!wm", name = "j", descriptor = "Lclient!ga;")
	public static Class111 aClass111_127;

	@OriginalMember(owner = "client!wm", name = "l", descriptor = "Lclient!eba;")
	public static Class81 aClass81_229;

	@OriginalMember(owner = "client!wm", name = "m", descriptor = "F")
	public static float aFloat213;

	@OriginalMember(owner = "client!wm", name = "g", descriptor = "Lclient!ed;")
	public static final Class84 aClass84_6 = new Class84();

	@OriginalMember(owner = "client!wm", name = "k", descriptor = "[F")
	public static final float[] aFloatArray74 = new float[16];

	@OriginalMember(owner = "client!wm", name = "n", descriptor = "I")
	public static int anInt9497 = 0;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(BII)Z")
	public static boolean method7839(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static221.method3672(arg0, arg1) || Static563.method7586(arg1, arg0);
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)V")
	public static void method7840() {
		if (Static438.aClass12_13 != null) {
			Static438.aClass12_13.method6465();
			Static438.aClass12_13 = null;
			Static360.aClass35_10 = null;
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "([IIIILclient!qq;[I)Lclient!lda;")
	public static Class200_Sub1 method7843(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class12_Sub2 arg3, @OriginalArg(5) int[] arg4) {
		@Pc(23) int local23;
		@Pc(34) int local34;
		@Pc(36) int local36;
		if (!arg3.method6219(Static554.aClass340_14, Static257.aClass297_6)) {
			@Pc(21) int[] local21 = new int[arg2 * arg1];
			for (local23 = 0; local23 < arg1; local23++) {
				local34 = arg2 * local23 + arg4[local23];
				for (local36 = 0; local36 < arg0[local23]; local36++) {
					local21[local34++] = -16777216;
				}
			}
			return new Class200_Sub1(arg3, arg2, arg1, local21);
		}
		@Pc(66) byte[] local66 = new byte[arg1 * arg2];
		for (local23 = 0; local23 < arg1; local23++) {
			local34 = arg2 * local23 + arg4[local23];
			for (local36 = 0; local36 < arg0[local23]; local36++) {
				local66[local34++] = -1;
			}
		}
		return new Class200_Sub1(arg3, arg2, arg1, local66);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ljava/awt/Canvas;Lclient!fa;I)Lclient!r;")
	public static Class12 method7844(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface5 arg1) {
		return new l(arg0, arg1);
	}
}
