import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!jc", name = "N", descriptor = "I")
	public static int anInt2305;

	@OriginalMember(owner = "client!jc", name = "S", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray27;

	@OriginalMember(owner = "client!jc", name = "F", descriptor = "[Lclient!dd;")
	public static Class13[] aClass13Array18 = new Class13[100];

	@OriginalMember(owner = "client!jc", name = "R", descriptor = "Z")
	public static boolean aBoolean175 = true;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IB)Z")
	public static boolean method1695(@OriginalArg(0) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!ag;Lclient!ag;B)I")
	public static int method1696(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class4 arg1) {
		@Pc(5) int local5 = 0;
		if (arg0.method2244(Static56.anInt1796)) {
			local5++;
		}
		if (arg1.method2244(Static95.anInt2769)) {
			local5++;
		}
		if (arg1.method2244(Static182.anInt937)) {
			local5++;
		}
		if (arg1.method2244(Static118.anInt3125)) {
			local5++;
		}
		if (arg1.method2244(Static143.anInt3527)) {
			local5++;
		}
		if (arg1.method2244(Static159.anInt3768)) {
			local5++;
		}
		arg1.method2244(Static121.anInt3152);
		arg1.method2244(Static96.anInt2774);
		arg1.method2244(Static157.anInt3726);
		arg1.method2244(Static187.anInt4124);
		arg1.method2244(Static98.anInt3737);
		return local5;
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(B)V")
	public static void method1699() {
		aByteArrayArrayArray27 = null;
		aClass13Array18 = null;
	}
}
