import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!ta", name = "P", descriptor = "Lclient!iq;")
	public static Class104 aClass104_159;

	@OriginalMember(owner = "client!ta", name = "R", descriptor = "Lclient!iq;")
	public static Class104 aClass104_160;

	@OriginalMember(owner = "client!ta", name = "T", descriptor = "I")
	public static int anInt6076;

	@OriginalMember(owner = "client!ta", name = "H", descriptor = "Lclient!jg;")
	public static final Class107 aClass107_50 = new Class107(8);

	@OriginalMember(owner = "client!ta", name = "N", descriptor = "Z")
	public static boolean aBoolean539 = false;

	@OriginalMember(owner = "client!ta", name = "Q", descriptor = "I")
	public static int anInt6075 = 0;

	@OriginalMember(owner = "client!ta", name = "S", descriptor = "[Z")
	public static final boolean[] aBooleanArray27 = new boolean[8];

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIII)V")
	public static void method5123(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) int local15 = 0; local15 < Static236.anInt928; local15++) {
			@Pc(21) Rectangle local21 = Class58.aRectangleArray2[local15];
			if (local21.width + local21.x > arg1 && local21.x < arg1 + arg3 && arg0 < local21.y + local21.height && local21.y < arg2 + arg0) {
				Static286.aBooleanArray25[local15] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZII)I")
	public static int method5125(@OriginalArg(1) int arg0) {
		@Pc(14) Class2_Sub21 local14 = Static238.method4329(false, arg0);
		if (local14 == null) {
			return Static327.method5348(arg0).anInt3891;
		}
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < local14.anIntArray245.length; local25++) {
			if (local14.anIntArray245[local25] == -1) {
				local23++;
			}
		}
		return local23 + Static327.method5348(arg0).anInt3891 - local14.anIntArray245.length;
	}
}
