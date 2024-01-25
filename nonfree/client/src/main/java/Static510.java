import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static510 {

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "Lclient!uc;")
	public static final Class328 aClass328_23 = new Class328(5, 6);

	@OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
	public static int anInt8649 = 0;

	@OriginalMember(owner = "client!tl", name = "g", descriptor = "[Lclient!iaa;")
	public static Class139[] aClass139Array1 = null;

	@OriginalMember(owner = "client!tl", name = "i", descriptor = "Lclient!ca;")
	public static final Class40 aClass40_7 = new Class40();

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ljava/awt/Canvas;BLclient!e;)Lclient!oa;")
	public static Class14 method7078(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Interface4 arg1) {
		return new da(arg0, arg1);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!ji;Z)Lclient!io;")
	public static Class18_Sub2 method7079(@OriginalArg(0) Class6_Sub21 arg0) {
		@Pc(7) Class18 local7 = Static268.method6658(arg0);
		@Pc(11) int local11 = arg0.method6036();
		@Pc(20) int local20 = arg0.method6036();
		return new Class18_Sub2(local7.aClass319_12, local7.aClass247_12, local7.anInt6642, local7.anInt6646, local7.anInt6645, local7.anInt6643, local7.anInt6639, local7.anInt6641, local7.anInt6640, local11, local20);
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V")
	public static void method7081() {
		Static296.anInt5524 = -1;
		Static398.aClass58_37 = null;
	}
}
