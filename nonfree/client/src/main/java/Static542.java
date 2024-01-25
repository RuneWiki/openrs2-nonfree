import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static542 {

	@OriginalMember(owner = "client!uu", name = "l", descriptor = "I")
	public static final int anInt8662 = 0;

	@OriginalMember(owner = "client!uu", name = "s", descriptor = "Z")
	public static boolean aBoolean666 = true;

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIIII)V")
	public static void method7209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static488.anInt7959; local3++) {
			@Pc(9) Rectangle local9 = Class72_Sub6.aRectangleArray1[local3];
			if (local9.width + local9.x > arg2 && local9.x < arg0 + arg2 && arg1 < local9.height + local9.y && local9.y < arg3 + arg1) {
				Static319.aBooleanArray17[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "([BB)[B")
	public static byte[] method7210(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static601.method2816(arg0, 0, local9, 0, local6);
		return local9;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(II)Lclient!bu;")
	public static Class3_Sub7_Sub3 method7211(@OriginalArg(0) int arg0) {
		@Pc(12) Class3_Sub7_Sub3 local12 = (Class3_Sub7_Sub3) Static173.aClass116_1.method3126((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static241.aClass322_84.method6802(arg0, 0);
		if (local22 == null || local22.length <= 1) {
			return null;
		}
		try {
			local12 = Static468.method6472(local22);
		} catch (@Pc(36) Exception local36) {
			throw new RuntimeException(local36.getMessage() + " S: " + arg0);
		}
		Static173.aClass116_1.method3127(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IZ)V")
	public static void method7212(@OriginalArg(0) int arg0) {
		@Pc(13) Class3_Sub7_Sub18 local13 = Static543.method7218(8, arg0);
		local13.method7329();
	}
}
