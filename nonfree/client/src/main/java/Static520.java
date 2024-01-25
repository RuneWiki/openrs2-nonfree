import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static520 {

	@OriginalMember(owner = "client!vr", name = "j", descriptor = "I")
	public static int anInt8842;

	@OriginalMember(owner = "client!vr", name = "o", descriptor = "[[I")
	public static int[][] anIntArrayArray94;

	@OriginalMember(owner = "client!vr", name = "q", descriptor = "[I")
	public static final int[] anIntArray762 = new int[14];

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method7422(@OriginalArg(1) String arg0) {
		@Pc(11) int local11 = arg0.length();
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < local11; local15++) {
			@Pc(20) char local20 = arg0.charAt(local15);
			if (local20 <= '\u007f') {
				local13++;
			} else if (local20 <= '\u07ff') {
				local13 += 2;
			} else {
				local13 += 3;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIIBII)I")
	public static int method7423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg1 & 0x3;
		if ((arg2 & 0x1) == 1) {
			@Pc(10) int local10 = arg3;
			arg3 = arg5;
			arg5 = local10;
		}
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 1 + 7 - arg3 - arg4;
		} else if (local3 == 2) {
			return 8 - arg5 - arg0;
		} else {
			return arg4;
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIIZ)V")
	public static void method7425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(5) int local5 = 0; local5 < Static361.anInt6491; local5++) {
			@Pc(10) Rectangle local10 = Class1_Sub1_Sub2.aRectangleArray1[local5];
			if (local10.width + local10.x > arg0 && local10.x < arg3 + arg0 && arg1 < local10.y + local10.height && local10.y < arg1 + arg2) {
				Static145.aBooleanArray14[local5] = true;
			}
		}
	}
}
