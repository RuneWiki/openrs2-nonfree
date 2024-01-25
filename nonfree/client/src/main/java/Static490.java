import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static490 {

	@OriginalMember(owner = "client!taa", name = "f", descriptor = "Z")
	public static boolean aBoolean630 = false;

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(I)I")
	public static int method6641() {
		return Static521.aClass163_1.method3469();
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(ILclient!vg;)Ljava/lang/String;")
	public static String method6642(@OriginalArg(1) Class341 arg0) {
		if (Static63.method1137(arg0).method7774() == 0) {
			return null;
		} else if (arg0.aString97 == null || arg0.aString97.trim().length() == 0) {
			return Static595.aBoolean755 ? "Hidden-use" : null;
		} else {
			return arg0.aString97;
		}
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(I[B)[B")
	public static byte[] method6643(@OriginalArg(1) byte[] arg0) {
		@Pc(16) Class1_Sub35 local16 = new Class1_Sub35(arg0);
		@Pc(20) int local20 = local16.method5750();
		@Pc(26) int local26 = local16.method5804();
		if (local26 < 0 || Static192.anInt3569 != 0 && Static192.anInt3569 < local26) {
			throw new RuntimeException();
		} else if (local20 == 0) {
			@Pc(55) byte[] local55 = new byte[local26];
			local16.method5800(local55, local26);
			return local55;
		} else {
			@Pc(67) int local67 = local16.method5804();
			if (local67 < 0 || Static192.anInt3569 != 0 && Static192.anInt3569 < local67) {
				throw new RuntimeException();
			}
			@Pc(81) byte[] local81 = new byte[local67];
			if (local20 == 1) {
				Static560.method7595(local81, local67, arg0, local26);
			} else {
				@Pc(86) Class323 local86 = Static360.aClass323_3;
				synchronized (Static360.aClass323_3) {
					Static360.aClass323_3.method7175(local81, local16);
				}
			}
			return local81;
		}
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(ILjava/lang/String;BLjava/lang/String;)V")
	public static void method6644(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		Static404.anInt7074 = 2;
		Static184.anInt3253 = arg0;
		Static199.method3213(false, arg2, arg1);
	}
}
