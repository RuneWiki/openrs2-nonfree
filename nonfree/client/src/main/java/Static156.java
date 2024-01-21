import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!rd", name = "J", descriptor = "Lclient!md;")
	public static Class51 aClass51_11 = new Class51(8);

	@OriginalMember(owner = "client!rd", name = "K", descriptor = "Lclient!vc;")
	public static final Class89 aClass89_57 = new Class89(64);

	@OriginalMember(owner = "client!rd", name = "M", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_1074 = Static158.method3034("Ok");

	@OriginalMember(owner = "client!rd", name = "L", descriptor = "Lclient!ob;")
	public static Class60 aClass60_1073 = aClass60_1074;

	@OriginalMember(owner = "client!rd", name = "N", descriptor = "Lclient!vc;")
	public static final Class89 aClass89_58 = new Class89(50);

	@OriginalMember(owner = "client!rd", name = "O", descriptor = "I")
	public static int anInt3973 = 0;

	@OriginalMember(owner = "client!rd", name = "P", descriptor = "I")
	public static int anInt3974 = 1;

	@OriginalMember(owner = "client!rd", name = "Q", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1075 = Static158.method3034("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!rd", name = "R", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1076 = Static158.method3034("runes");

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!ca;ILclient!qe;I)V")
	public static void method3011(@OriginalArg(0) Class13_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class69 arg2) {
		@Pc(3) Class2_Sub18 local3 = new Class2_Sub18();
		local3.aLong151 = arg1;
		local3.anInt3789 = 1;
		local3.aClass13_Sub1_22 = arg0;
		local3.aClass69_4 = arg2;
		@Pc(26) Class67 local26 = Static99.aClass67_5;
		synchronized (Static99.aClass67_5) {
			Static99.aClass67_5.method2843(local3);
		}
		Static159.method3414();
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(IB)I")
	public static int method3014(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
