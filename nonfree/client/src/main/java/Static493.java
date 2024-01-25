import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static493 {

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
	public static int anInt8442;

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "Lclient!pa;")
	public static final Class265 aClass265_54 = new Class265(50);

	@OriginalMember(owner = "client!ra", name = "m", descriptor = "Z")
	public static boolean aBoolean612 = false;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIII)I")
	public static int method7180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg1 & 0x1) == 1) {
			@Pc(8) int local8 = arg4;
			arg4 = arg2;
			arg2 = local8;
		}
		@Pc(25) int local25 = arg0 & 0x3;
		if (local25 == 0) {
			return arg3;
		} else if (local25 == 1) {
			return 7 + 1 - arg5 - arg4;
		} else if (local25 == 2) {
			return 1 + 7 - arg2 - arg3;
		} else {
			return arg5;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
	public static void method7181() {
		Static154.anInt2536 = -1;
		Static443.anInt7790 = -1;
		Static514.anInt8684 = 0;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V")
	public static void method7182() {
		if (Static285.anApplet5 == null) {
			return;
		}
		try {
			@Pc(10) String local10 = Static285.anApplet5.getParameter("cookiehost");
			@Pc(18) int local18 = (int) (Static124.method1947() / 86400000L) - 11745;
			@Pc(30) String local30 = "usrdob=" + local18 + "; version=1; path=/; domain=" + local10;
			Static680.method2301("document.cookie=\"" + local30 + "\"", Static285.anApplet5);
		} catch (@Pc(49) Throwable local49) {
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)V")
	public static void method7183() {
		Static612.method8231();
		for (@Pc(11) int local11 = 0; local11 < 4; local11++) {
			Static137.aClass234Array1[local11].method5453();
		}
		Static191.method2757();
		Static422.method6420();
		Static203.method2845();
		System.gc();
		Static563.aClass143_13.ya();
	}
}
