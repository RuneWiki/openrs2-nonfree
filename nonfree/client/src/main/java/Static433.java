import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!vp", name = "j", descriptor = "I")
	public static int anInt7017 = 0;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIIII)V")
	public static void method5752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(14) int local14 = 0; local14 < Static121.anInt2467; local14++) {
			@Pc(20) Rectangle local20 = Class102.aRectangleArray1[local14];
			if (arg3 < local20.width + local20.x && local20.x < arg3 + arg2 && local20.y + local20.height > arg0 && local20.y < arg0 + arg1) {
				Static391.aBooleanArray46[local14] = true;
			}
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "([Ljava/lang/Object;[JI)V")
	public static void method5753(@OriginalArg(0) Object[] arg0, @OriginalArg(1) long[] arg1) {
		Static68.method1380(0, arg0, arg1.length - 1, arg1);
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IB)V")
	public static void method5754(@OriginalArg(0) int arg0) {
		if (!Static125.method2231(arg0)) {
			return;
		}
		@Pc(16) Class251[] local16 = Static437.aClass251ArrayArray2[arg0];
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(23) Class251 local23 = local16[local18];
			if (local23 != null) {
				local23.anInt6721 = 0;
				local23.anInt6716 = 1;
				local23.anInt6717 = 0;
			}
		}
	}
}
