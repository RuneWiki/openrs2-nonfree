import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!s", name = "Cb", descriptor = "Lclient!ke;")
	public static Class43 aClass43_33;

	@OriginalMember(owner = "client!s", name = "jb", descriptor = "Lclient!ua;")
	public static Class82 aClass82_51 = new Class82(500);

	@OriginalMember(owner = "client!s", name = "wb", descriptor = "I")
	public static int anInt3513 = 0;

	@OriginalMember(owner = "client!s", name = "Db", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1246 = Static146.method2172("Ok");

	@OriginalMember(owner = "client!s", name = "zb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1244 = aClass77_1246;

	@OriginalMember(owner = "client!s", name = "Ab", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1245 = Static146.method2172("Welt");

	@OriginalMember(owner = "client!s", name = "Bb", descriptor = "I")
	public static volatile int anInt3516 = 0;

	@OriginalMember(owner = "client!s", name = "Eb", descriptor = "I")
	public static int anInt3517 = 2;

	@OriginalMember(owner = "client!s", name = "Fb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1247 = Static146.method2172("mapdots");

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method2426(@OriginalArg(0) Component arg0) {
		arg0.removeMouseListener(Static84.aClass30_2);
		arg0.removeMouseMotionListener(Static84.aClass30_2);
		arg0.removeFocusListener(Static84.aClass30_2);
		Static23.anInt715 = 0;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIBIII)I")
	public static int method2427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg1 & 0x1) == 1) {
			@Pc(13) int local13 = arg2;
			arg2 = arg4;
			arg4 = local13;
		}
		@Pc(25) int local25 = arg3 & 0x3;
		if (local25 == 0) {
			return arg0;
		} else if (local25 == 1) {
			return arg5;
		} else if (local25 == 2) {
			return 1 + 7 - arg2 - arg0;
		} else {
			return 1 + 7 - arg4 - arg5;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!qf;I)Lclient!qf;")
	public static Class66 method2428(@OriginalArg(0) Class66 arg0) {
		@Pc(12) Class66 local12 = Static108.method1923(arg0);
		if (local12 == null) {
			local12 = arg0.aClass66_10;
		}
		return local12;
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(B)V")
	public static void method2429() {
		aClass82_51 = null;
		aClass77_1244 = null;
		aClass77_1245 = null;
		aClass77_1247 = null;
		aClass43_33 = null;
		aClass77_1246 = null;
	}
}
