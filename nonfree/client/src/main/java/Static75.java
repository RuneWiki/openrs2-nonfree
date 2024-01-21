import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!ia", name = "X", descriptor = "I")
	public static int anInt1757;

	@OriginalMember(owner = "client!ia", name = "Y", descriptor = "I")
	public static int anInt1758;

	@OriginalMember(owner = "client!ia", name = "M", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_540 = Static181.method2795("<col=ffff00>*V");

	@OriginalMember(owner = "client!ia", name = "U", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_541 = Static181.method2795(":tradereq:");

	@OriginalMember(owner = "client!ia", name = "W", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_542 = Static181.method2795("http:)4)4www)3runescape)3com)4l=");

	@OriginalMember(owner = "client!ia", name = "Z", descriptor = "I")
	public static int anInt1759 = 0;

	@OriginalMember(owner = "client!ia", name = "ab", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_543 = Static181.method2795("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIII)V")
	public static void method1425(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class5 local8 = Static201.method3053(arg2, arg1);
		if (local8 != null && local8.anObjectArray4 != null) {
			@Pc(17) Class2_Sub4 local17 = new Class2_Sub4();
			local17.anObjectArray27 = local8.anObjectArray4;
			local17.aClass5_3 = local8;
			Static89.method3267(local17);
		}
		Static142.aBoolean141 = true;
		Static146.anInt3041 = arg2;
		Static50.anInt1300 = arg1;
		anInt1757 = arg0;
		Static121.method2085(local8);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I")
	public static int method1426(@OriginalArg(1) KeyEvent arg0) {
		@Pc(11) int local11 = arg0.getKeyChar();
		if (local11 == 8364) {
			return 128;
		} else {
			if (local11 <= 0 || local11 >= 256) {
				local11 = -1;
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIILclient!rb;IJ)Z")
	public static boolean method1427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class24 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return Static213.method3227(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8);
		}
	}
}
