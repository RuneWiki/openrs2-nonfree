import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!en", name = "a", descriptor = "I")
	public static int anInt2301 = 0;

	@OriginalMember(owner = "client!en", name = "b", descriptor = "[Lclient!vaa;")
	public static final Interface18[] anInterface18Array1 = new Interface18[75];

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIBIIIII)V")
	public static void method2223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static278.method4887(arg1)) {
			if (Static465.aClass91ArrayArray1[arg1] == null) {
				Static402.method6388(arg4, arg7, arg2, arg0, Static511.aClass91ArrayArray2[arg1], -1, arg3, arg6, arg5);
			} else {
				Static402.method6388(arg4, arg7, arg2, arg0, Static465.aClass91ArrayArray1[arg1], -1, arg3, arg6, arg5);
			}
		} else if (arg0 == -1) {
			for (@Pc(27) int local27 = 0; local27 < 100; local27++) {
				Static258.aBooleanArray17[local27] = true;
			}
		} else {
			Static258.aBooleanArray17[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(III)Z")
	public static boolean method2224(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static127.method2443(arg0, arg1) || Static461.method7923(arg0, arg1);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(BII)Z")
	public static boolean method2226(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 | Static431.method6697(arg1, arg0) || Static461.method7923(arg0, arg1);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(BI)Lclient!pg;")
	public static Class226 method2227(@OriginalArg(1) int arg0) {
		@Pc(10) Class226 local10 = (Class226) Static169.aClass277_28.method7014((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static275.aClass69_55.method1888(arg0, 1);
		local10 = new Class226();
		local10.anInt6670 = arg0;
		if (local20 != null) {
			local10.method5977(new Class1_Sub17(local20));
		}
		local10.method5981();
		if (local10.anInt6662 == 2 && Static171.aClass230_22.method6144((long) arg0) == null) {
			Static171.aClass230_22.method6139((long) arg0, new Class1_Sub14(Static503.anInt5477));
			Static10.aClass226Array1[Static503.anInt5477++] = local10;
		}
		Static169.aClass277_28.method7016(local10, (long) arg0);
		return local10;
	}
}
