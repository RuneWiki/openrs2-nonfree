import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!vm", name = "Q", descriptor = "I")
	public static int anInt5922;

	@OriginalMember(owner = "client!vm", name = "R", descriptor = "I")
	public static int anInt5923;

	@OriginalMember(owner = "client!vm", name = "W", descriptor = "I")
	public static int anInt5928;

	@OriginalMember(owner = "client!vm", name = "lb", descriptor = "[Lclient!ho;")
	public static Class3_Sub4_Sub12[] aClass3_Sub4_Sub12Array11;

	@OriginalMember(owner = "client!vm", name = "X", descriptor = "J")
	public static long aLong235 = 0L;

	@OriginalMember(owner = "client!vm", name = "Z", descriptor = "I")
	public static int anInt5930 = 1;

	@OriginalMember(owner = "client!vm", name = "db", descriptor = "Ljava/lang/String;")
	public static String aString225 = "M";

	@OriginalMember(owner = "client!vm", name = "fb", descriptor = "I")
	public static int anInt5934 = -1;

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "(B)V")
	public static void method4858() {
		if (Static254.aClass69_1 != null) {
			@Pc(9) Class69 local9 = Static254.aClass69_1;
			synchronized (Static254.aClass69_1) {
				Static254.aClass69_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IILclient!rn;I)[Lclient!qn;")
	public static Class3_Sub4_Sub12_Sub2[] method4859(@OriginalArg(1) int arg0, @OriginalArg(2) Class155 arg1) {
		return Static115.method1878(0, arg1, arg0) ? Static278.method4193() : null;
	}
}
