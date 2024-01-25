import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
	public static int anInt4049;

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "J")
	public static long aLong115 = 0L;

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "Z")
	public static volatile boolean aBoolean301 = true;

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
	public static int anInt4050 = 0;

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "Lclient!jk;")
	public static final Class137 aClass137_44 = new Class137(4);

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZI)Lclient!mo;")
	public static Class4_Sub25 method3222(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(19) long local19 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg1);
		return (Class4_Sub25) Static87.aClass67_6.method1429(local19);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!cl;IZZ)V")
	public static void method3223(@OriginalArg(0) Class4_Sub8 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) int local8 = arg0.anInt861;
		@Pc(12) int local12 = (int) arg0.aLong227;
		arg0.method6059();
		if (arg1) {
			Static107.method1600(local8);
		}
		Static432.method5738(local8);
		@Pc(27) Class110 local27 = Static235.method3185(local12);
		if (local27 != null) {
			Static118.method1693(local27);
		}
		Static8.method99();
		if (!arg2 && Static182.anInt3346 != -1) {
			Static199.method2849(Static182.anInt3346, 1);
		}
		@Pc(56) Class106 local56 = new Class106(Static449.aClass67_37);
		for (@Pc(61) Class4_Sub8 local61 = (Class4_Sub8) local56.method1989(); local61 != null; local61 = (Class4_Sub8) local56.method1990()) {
			if (!local61.method6060()) {
				local61 = (Class4_Sub8) local56.method1989();
				if (local61 == null) {
					return;
				}
			}
			if (local61.anInt859 == 3) {
				@Pc(83) int local83 = (int) local61.aLong227;
				if (local8 == local83 >>> 16) {
					method3223(local61, true, arg2);
				}
			}
		}
	}
}
