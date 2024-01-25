import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static499 {

	@OriginalMember(owner = "client!uq", name = "Y", descriptor = "F")
	public static float aFloat161 = 0.25F;

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(III)Z")
	public static boolean method6854(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x40000) != 0 | Static450.method6420(arg0, arg1) || Static290.method6966(arg1, arg0);
	}

	@OriginalMember(owner = "client!uq", name = "d", descriptor = "(II)V")
	public static void method6865(@OriginalArg(1) int arg0) {
		Static418.anInt7355 = arg0;
		Static438.anInt7729 = 2;
		if (Static306.aString51 == null) {
			Static375.method5758(35);
		} else {
			@Pc(20) Class1_Sub6 local20 = new Class1_Sub6(Static388.method5883(Static387.method5880(Static306.aString51)));
			@Pc(24) long local24 = local20.method3949();
			Static157.aLong181 = local20.method3949();
			Static524.method7186("", true, Static545.method7543(local24));
		}
	}

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "(IIIII)I")
	public static int method6920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) int local16 = 65536 - Class310.anIntArray826[arg1 * 8192 / arg3] >> 1;
		return (local16 * arg2 >> 16) + (arg0 * (65536 - local16) >> 16);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IBI)Z")
	public static boolean method6935(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static389.method5894(arg1, arg0) | Static328.method5046(arg0, arg1) | Static475.method5204(arg1, arg0)) & Static538.method7475(arg0, arg1);
	}
}
