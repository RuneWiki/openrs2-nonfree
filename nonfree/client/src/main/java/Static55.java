import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!bv", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray3 = new String[100];

	@OriginalMember(owner = "client!bv", name = "q", descriptor = "J")
	public static long aLong30 = 0L;

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIII)V")
	public static void method867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static188.anInt10386; local3++) {
			@Pc(14) Rectangle local14 = Class5_Sub5_Sub1.aRectangleArray1[local3];
			if (arg1 < local14.x + local14.width && local14.x < arg1 + arg3 && local14.height + local14.y > arg2 && arg0 + arg2 > local14.y) {
				Static609.aBooleanArray58[local3] = true;
			}
		}
		Static354.method5603(arg1 + arg3, arg1, arg0 + arg2, arg2);
	}
}
