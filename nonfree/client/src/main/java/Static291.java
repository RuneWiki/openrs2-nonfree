import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet1;

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "F")
	public static float aFloat105;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "Z")
	public static boolean aBoolean339 = false;

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "Lclient!qp;")
	public static final Class280 aClass280_25 = new Class280(8);

	@OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
	public static int anInt5161 = -1;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "([II)Ljava/lang/String;")
	public static String method4631(@OriginalArg(0) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(11) int local11 = Static592.anInt9709;
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(24) Class110 local24 = Static511.aClass8_1.method665(arg0[local13]);
			if (local24.anInt3073 != -1) {
				@Pc(36) Class24 local36 = (Class24) Static176.aClass102_22.method2677((long) local24.anInt3073);
				if (local36 == null) {
					@Pc(44) Class107 local44 = Static645.method2771(Static474.aClass196_98, local24.anInt3073, 0);
					if (local44 != null) {
						local36 = Static323.aClass5_9.method7525(local44, true);
						Static176.aClass102_22.method2674((long) local24.anInt3073, local36);
					}
				}
				if (local36 != null) {
					Static167.aClass24Array8[local11] = local36;
					local9.append(" <img=").append(local11).append(">");
					local11++;
				}
			}
		}
		return local9.toString();
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
	public static void method4632() {
		Static51.anInt1431 = 0;
		Static300.anInt5337 = -1;
		Static520.anInt9372 = -1;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)Z")
	public static boolean method4633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | Static127.method2501(arg1, arg0) || Static375.method6039(arg1, arg0);
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(III)Z")
	public static boolean method4635(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
