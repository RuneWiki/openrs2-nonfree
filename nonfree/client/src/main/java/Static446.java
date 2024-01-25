import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!wl", name = "h", descriptor = "B")
	public static byte aByte103;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "[I")
	public static final int[] anIntArray552 = new int[1000];

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "Lclient!ho;")
	public static final Class98 aClass98_18 = new Class98(1, 2, 2, 0);

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!et;BLjava/awt/Frame;)V")
	public static void method5620(@OriginalArg(0) Class66 arg0, @OriginalArg(2) Frame arg1) {
		while (true) {
			@Pc(6) Class199 local6 = arg0.method1727(arg1);
			while (local6.anInt5760 == 0) {
				Static435.method5503(10L);
			}
			if (local6.anInt5760 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static435.method5503(100L);
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIIII)V")
	public static void method5621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static95.anInt1909 = arg3;
		Static27.anInt460 = arg0;
		Static185.anInt3534 = arg4;
		Static259.anInt4881 = arg1;
		Static43.anInt7321 = arg2;
		Static210.anInt3926 = arg5;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(BII)Lclient!sd;")
	public static Class213 method5622(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class213 local7 = new Class213();
		local7.anInt6230 = -1;
		local7.anInt6225 = arg0 + 1 + 5;
		local7.anInt6231 = arg1 + 1 + 5;
		local7.anInt6235 = -1;
		local7.anIntArrayArray48 = new int[local7.anInt6231][local7.anInt6225];
		local7.method4851();
		return local7;
	}
}
