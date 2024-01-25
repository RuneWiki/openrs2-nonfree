import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!pq", name = "N", descriptor = "I")
	public static int anInt5485;

	@OriginalMember(owner = "client!pq", name = "J", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_118 = new Class265(61, -2);

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public static boolean method4371(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static393.anInt6567; local11++) {
			if (arg0.equalsIgnoreCase(Static227.aStringArray32[local11])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static67.aStringArray8[local11])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "(I)Z")
	public static boolean method4373() {
		return Static437.aBoolean476;
	}

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "(I)V")
	public static void method4375() {
		Static337.anInt5822 = 0;
		for (@Pc(14) int local14 = 0; local14 < 2048; local14++) {
			Static316.aClass2_Sub23Array2[local14] = null;
			Static160.aByteArray86[local14] = 1;
			Static171.aClass224Array1[local14] = null;
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "([BB)[B")
	public static byte[] method4376(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub23 local8 = new Class2_Sub23(arg0);
		@Pc(17) int local17 = local8.method5495();
		@Pc(21) int local21 = local8.method5508();
		if (local21 < 0 || Static316.anInt5465 != 0 && local21 > Static316.anInt5465) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(47) byte[] local47 = new byte[local21];
			local8.method5509(local21, local47);
			return local47;
		} else {
			@Pc(59) int local59 = local8.method5508();
			if (local59 < 0 || Static316.anInt5465 != 0 && Static316.anInt5465 < local59) {
				throw new RuntimeException();
			}
			@Pc(77) byte[] local77 = new byte[local59];
			if (local17 == 1) {
				Static134.method2279(local77, local59, arg0, local21);
			} else {
				Static430.aClass33_1.method597(local8, local77);
			}
			return local77;
		}
	}
}
