import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static607 {

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "[Lclient!tb;")
	public static Class49[] aClass49Array15;

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
	public static int anInt9573;

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
	public static int anInt9575;

	@OriginalMember(owner = "client!uc", name = "m", descriptor = "Lclient!mq;")
	public static final Class238 aClass238_12 = new Class238();

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_180 = new Class322(137, 8);

	@OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
	public static int anInt9572 = -2;

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
	public static int anInt9574 = -1;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILclient!tf;IILclient!ha;)V")
	public static void method8341(@OriginalArg(1) Class340 arg0, @OriginalArg(4) Class75 arg1) {
		Static527.aClass340_67.method8129();
		if (Static157.aBoolean254) {
			return;
		}
		for (@Pc(17) Class6_Sub24 local17 = (Class6_Sub24) arg0.method8124(); local17 != null; local17 = (Class6_Sub24) arg0.method8134()) {
			@Pc(25) Class361 local25 = Static627.aClass190_5.method4695(local17.anInt4787);
			if (method8345(local25)) {
				@Pc(37) boolean local37 = Static379.method5864(local17, arg1, local25);
				if (local37) {
					Static392.method6008(local17, arg1, local25);
				}
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!uja;I)Z")
	public static boolean method8345(@OriginalArg(0) Class361 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean723) {
			return false;
		} else if (!arg0.method8534(Static627.anInterface10_2)) {
			return false;
		} else if (Static512.aClass74_59.method1401((long) arg0.anInt9787) == null) {
			return Static685.aClass74_77.method1401((long) arg0.anInt9818) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BILjava/lang/String;)V")
	public static void method8348(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(10) Class260 local10 = Static629.method8573();
		@Pc(16) Class6_Sub13 local16 = Static30.method353(Static72.aClass241_20, local10.aClass270_2);
		local16.aClass6_Sub15_Sub1_1.method3016(Static290.method8800(arg1) + 1);
		local16.aClass6_Sub15_Sub1_1.method3016(arg0);
		local16.aClass6_Sub15_Sub1_1.method2991(arg1);
		local10.method6404(local16);
	}
}
