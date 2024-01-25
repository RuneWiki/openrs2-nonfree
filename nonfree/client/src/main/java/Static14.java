import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
	public static int anInt259;

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray1 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "Lclient!kg;")
	public static final Class188 aClass188_1 = new Class188("", 18);

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(B[J[Ljava/lang/Object;)V")
	public static void method292(@OriginalArg(1) long[] arg0, @OriginalArg(2) Object[] arg1) {
		Static452.method7674(arg0, 0, arg1, arg0.length - 1);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "([[S[[FI)[[S")
	public static short[][] method294(@OriginalArg(0) short[][] arg0, @OriginalArg(1) float[][] arg1) {
		for (@Pc(15) int local15 = 0; local15 < arg1.length; local15++) {
			for (@Pc(19) int local19 = 0; local19 < arg0[local15].length; local19++) {
				arg0[local15][local19] = (short) (arg1[local15][local19] * 16383.0F);
			}
		}
		return arg0;
	}
}
