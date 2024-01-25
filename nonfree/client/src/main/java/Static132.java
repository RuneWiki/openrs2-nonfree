import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
	public static int anInt2246;

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "Lclient!ag;")
	public static final Class8 aClass8_4 = new Class8(4, 1);

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(BLjava/awt/Canvas;ILclient!d;I)Lclient!ha;")
	public static Class95 method1834(@OriginalArg(1) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface6 arg2, @OriginalArg(4) int arg3) {
		return new oa(arg0, arg2, arg3, arg1);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZLclient!vea;)Z")
	public static boolean method1836(@OriginalArg(1) Interface25 arg0) {
		@Pc(15) Class191 local15 = Static319.aClass141_4.method2971(arg0.method8425());
		if (local15.anInt4793 == -1) {
			return true;
		} else {
			@Pc(27) Class273 local27 = Static264.aClass207_3.method4286(local15.anInt4793);
			return local27.anInt7076 == -1 ? true : local27.method6032();
		}
	}
}
