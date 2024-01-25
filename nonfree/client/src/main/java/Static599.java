import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static599 {

	@OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
	public static int anInt7771;

	@OriginalMember(owner = "client!uc", name = "x", descriptor = "I")
	public static int anInt7773;

	@OriginalMember(owner = "client!uc", name = "u", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_82 = new Class240(86, -1);

	@OriginalMember(owner = "client!uc", name = "z", descriptor = "Z")
	public static boolean aBoolean544 = false;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!uq;IBLclient!d;ILjava/awt/Canvas;)Lclient!ha;")
	public static Class95 method6438(@OriginalArg(0) Class362 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Interface2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Canvas arg4) {
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		if (arg4 != null) {
			@Pc(20) Dimension local20 = arg4.getSize();
			local13 = local20.width;
			local15 = local20.height;
		}
		return Static214.method8049(arg4, local15, arg1, arg3, arg0, local13, arg2);
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V")
	public static void method6442() {
		Static565.aClass95_13.method8037(Static70.aClass17_1);
		Static565.aClass95_13.DA(Static62.anInt1290, Static28.anInt699, Static461.anInt10709, Static679.anInt10958);
	}
}
