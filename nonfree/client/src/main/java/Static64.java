import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "[Lclient!jn;")
	public static Class176[] aClass176Array1;

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "Lclient!cga;")
	public static final Class52 aClass52_1 = new Class52();

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
	public static int anInt1040 = 0;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)V")
	public static void method1076(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		Static536.anInt8899 = -1;
		Static264.anInt4388 = 1;
		Static77.method1243(false, arg1, arg0);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIILclient!d;Lclient!wu;Ljava/awt/Canvas;)Lclient!ha;")
	public static Class126 method1078(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface8 arg2, @OriginalArg(4) Class384 arg3, @OriginalArg(5) Canvas arg4) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		if (arg4 != null) {
			@Pc(12) Dimension local12 = arg4.getSize();
			local5 = local12.width;
			local7 = local12.height;
		}
		return Static199.method6999(local5, local7, arg1, arg2, arg3, arg0, arg4);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIILclient!wu;)Lclient!rc;")
	public static Class298 method1079(@OriginalArg(2) int arg0, @OriginalArg(3) Class384 arg1) {
		@Pc(14) byte[] local14 = arg1.method8885(arg0, 0);
		return local14 == null ? null : new Class298(local14);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)V")
	public static void method1080() {
		@Pc(10) int local10 = 0;
		if (Static627.aClass5_Sub46_31 != null) {
			local10 = Static627.aClass5_Sub46_31.aClass11_Sub19_1.method6459();
		}
		@Pc(27) int local27;
		@Pc(34) int local34;
		if (local10 == 2) {
			local27 = Static489.anInt8353 > 800 ? 800 : Static489.anInt8353;
			local34 = Static374.anInt6594 <= 600 ? Static374.anInt6594 : 600;
			Static254.anInt4283 = local27;
			Static552.anInt9135 = (Static489.anInt8353 - local27) / 2;
			Static649.anInt10495 = 0;
			Static438.anInt7403 = local34;
		} else if (local10 == 1) {
			local27 = Static489.anInt8353 <= 1024 ? Static489.anInt8353 : 1024;
			Static552.anInt9135 = (Static489.anInt8353 - local27) / 2;
			local34 = Static374.anInt6594 > 768 ? 768 : Static374.anInt6594;
			Static254.anInt4283 = local27;
			Static649.anInt10495 = 0;
			Static438.anInt7403 = local34;
		} else {
			Static649.anInt10495 = 0;
			Static552.anInt9135 = 0;
			Static254.anInt4283 = Static489.anInt8353;
			Static438.anInt7403 = Static374.anInt6594;
		}
	}
}
