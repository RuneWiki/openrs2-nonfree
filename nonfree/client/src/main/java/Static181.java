import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
	public static int anInt3660;

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "Lclient!pe;")
	public static Class254 aClass254_57;

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_40 = new Class230(19, 0);

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
	public static int anInt3665 = 0;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!fd;Z)Lclient!qo;")
	public static Class260_Sub2 method3222(@OriginalArg(0) Class3_Sub7 arg0) {
		@Pc(7) Class260 local7 = Static152.method2969(arg0);
		@Pc(11) int local11 = arg0.method6497();
		@Pc(20) int local20 = arg0.method6497();
		return new Class260_Sub2(local7.aClass100_11, local7.aClass237_11, local7.anInt9472, local7.anInt9473, local7.anInt9475, local7.anInt9476, local7.anInt9468, local7.anInt9478, local7.anInt9477, local11, local20);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
	public static void method3223() {
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			Static525.aBooleanArray38[local10] = false;
		}
		Static129.anInt10431 = -1;
		Static267.anInt5668 = 1;
		Static34.anInt967 = 0;
		Static332.anInt6909 = 0;
		Static160.anInt3457 = -1;
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)Z")
	public static boolean method3225() {
		if (Static116.aBoolean210) {
			try {
				Static603.method4977("showVideoAd", Static253.anApplet3);
				return true;
			} catch (@Pc(21) Throwable local21) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!fd;I)Lclient!dv;")
	public static Class72 method3226(@OriginalArg(0) Class3_Sub7 arg0) {
		@Pc(7) String local7 = arg0.method6536();
		@Pc(16) Class100 local16 = Static414.method6700()[arg0.method6538()];
		@Pc(23) Class237 local23 = Static557.method1636()[arg0.method6538()];
		@Pc(29) int local29 = arg0.method6525();
		@Pc(33) int local33 = arg0.method6525();
		@Pc(39) int local39 = arg0.method6538();
		@Pc(43) int local43 = arg0.method6538();
		@Pc(47) int local47 = arg0.method6538();
		@Pc(53) int local53 = arg0.method6535();
		@Pc(57) int local57 = arg0.method6535();
		@Pc(61) int local61 = arg0.method6497();
		@Pc(72) int local72 = arg0.method6497();
		@Pc(76) int local76 = arg0.method6497();
		return new Class72(local7, local16, local23, local29, local33, local39, local43, local47, local53, local57, local61, local72, local76);
	}
}
