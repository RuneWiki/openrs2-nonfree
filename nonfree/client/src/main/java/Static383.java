import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "Lclient!ve;")
	public static Class303 aClass303_9;

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
	public static void method7590() {
		if (Static3.anInt53 <= 0) {
			Static457.aString65 = "";
			return;
		}
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < Static300.aStringArray26.length; local8++) {
			if (Static300.aStringArray26[local8].startsWith("--> ")) {
				local6++;
				if (Static3.anInt53 == local6) {
					Static457.aString65 = Static300.aStringArray26[local8].substring(4);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(II)Z")
	public static boolean method7638(@OriginalArg(0) int arg0) {
		Static242.aBoolean147 = true;
		Static242.anInt1986 = arg0 + 1 & 0xFFFF;
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLclient!wn;)V")
	public static void method7639(@OriginalArg(1) Class2_Sub8 arg0) {
		arg0.aClass47_Sub2_Sub3_1 = null;
		if (Static151.anInt3439 < 20) {
			Static526.aClass145_8.method3927(arg0);
			Static151.anInt3439++;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!n;ZIILclient!kda;Ljava/awt/Canvas;)Lclient!qa;")
	public static synchronized Class9 method7645(@OriginalArg(0) Interface8 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class160 arg3, @OriginalArg(5) Canvas arg4) {
		if (arg2 == 0) {
			return Static59.method1639(arg4, false, arg0);
		} else if (arg2 == 2) {
			return Static58.method1889(arg4, arg0);
		} else if (arg2 == 4) {
			return Static59.method1639(arg4, true, arg0);
		} else if (arg2 == 1) {
			return Static418.method6214(arg0, arg4, arg1);
		} else if (arg2 == 5) {
			return Static308.method5117(arg1, arg0, arg4, arg3);
		} else if (arg2 == 3) {
			return Static549.method1410(arg4, arg1, arg3, arg0);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}
}
