import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static620 {

	@OriginalMember(owner = "client!wd", name = "D", descriptor = "F")
	public static float aFloat208 = 0.0F;

	@OriginalMember(owner = "client!wd", name = "E", descriptor = "Lclient!rf;")
	public static final Class292 aClass292_7 = new Class292();

	@OriginalMember(owner = "client!wd", name = "J", descriptor = "F")
	public static float aFloat209 = 1024.0F;

	@OriginalMember(owner = "client!wd", name = "L", descriptor = "I")
	public static int anInt10048 = -1;

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(II)Lclient!jia;")
	public static Class172 method8609(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static110.aFloat79 == 3.0D) {
				return Static168.aClass172_4;
			}
			if ((double) Static110.aFloat79 == 4.0D) {
				return Static422.aClass172_7;
			}
			if ((double) Static110.aFloat79 == 6.0D) {
				return Static357.aClass172_6;
			}
			if ((double) Static110.aFloat79 >= 8.0D) {
				return Static512.aClass172_11;
			}
		} else if (arg0 == 1) {
			if ((double) Static110.aFloat79 == 3.0D) {
				return Static357.aClass172_6;
			}
			if ((double) Static110.aFloat79 == 4.0D) {
				return Static512.aClass172_11;
			}
			if ((double) Static110.aFloat79 == 6.0D) {
				return Static142.aClass172_12;
			}
			if ((double) Static110.aFloat79 >= 8.0D) {
				return Static424.aClass172_8;
			}
		} else if (arg0 == 2) {
			if ((double) Static110.aFloat79 == 3.0D) {
				return Static142.aClass172_12;
			}
			if ((double) Static110.aFloat79 == 4.0D) {
				return Static424.aClass172_8;
			}
			if ((double) Static110.aFloat79 == 6.0D) {
				return Static54.aClass172_1;
			}
			if ((double) Static110.aFloat79 >= 8.0D) {
				return Static289.aClass172_10;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method8610(@OriginalArg(0) String arg0) {
		Static582.method8231(arg0, "", 0, 0, "", "");
	}
}
