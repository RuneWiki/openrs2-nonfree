import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "I")
	public static int anInt3228;

	@OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
	public static int anInt3230;

	@OriginalMember(owner = "client!fo", name = "l", descriptor = "I")
	public static int anInt3235 = -1;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "([[II)V")
	public static void method2784(@OriginalArg(0) int[][] arg0) {
		Static71.anIntArrayArray5 = arg0;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(III)V")
	public static void method2788(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class291 local14 = Static133.aClass291ArrayArray30[arg1][arg0];
		if (local14 != null) {
			Static65.anInt1293 = local14.anInt8319;
			Static587.anInt9514 = local14.anInt8318;
			Static342.anInt6329 = local14.anInt8324;
		}
		Static554.method7877();
	}
}
