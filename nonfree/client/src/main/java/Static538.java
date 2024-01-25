import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static538 {

	@OriginalMember(owner = "client!wi", name = "A", descriptor = "Z")
	public static boolean aBoolean658;

	@OriginalMember(owner = "client!wi", name = "r", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_100 = new Class236(7, 6);

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(BIIII)V")
	public static void method7316(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= Static4.anInt6709 && Static492.anInt8451 >= arg3) {
			@Pc(15) int local15 = Static418.method6023(Static398.anInt7144, arg1, Static71.anInt4958);
			@Pc(21) int local21 = Static418.method6023(Static398.anInt7144, arg0, Static71.anInt4958);
			Static256.method4334(arg2, local15, local21, arg3);
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZLclient!n;BLjava/awt/Canvas;)Lclient!qa;")
	public static Class62 method7317(@OriginalArg(0) boolean arg0, @OriginalArg(1) Interface8 arg1, @OriginalArg(3) Canvas arg2) {
		return arg0 ? new Class62_Sub2_Sub1(arg2, arg1) : new Class62_Sub2_Sub2(arg2, arg1);
	}
}
