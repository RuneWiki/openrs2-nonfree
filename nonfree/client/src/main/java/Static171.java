import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_87 = new Class77(44, 3);

	@OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
	public static int anInt3057 = 0;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!ms;I)Lclient!ms;")
	public static Class155 method2802(@OriginalArg(0) Class155 arg0) {
		if (arg0.anInt4144 != -1) {
			return Static240.method3886(arg0.anInt4144);
		}
		@Pc(20) int local20 = arg0.anInt4166 >>> 16;
		@Pc(25) Class187 local25 = new Class187(Static362.aClass214_32);
		for (@Pc(30) Class2_Sub41 local30 = (Class2_Sub41) local25.method4423(); local30 != null; local30 = (Class2_Sub41) local25.method4421()) {
			if (local30.anInt6411 == local20) {
				return Static240.method3886((int) local30.aLong208);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "([BB)[B")
	public static byte[] method2803(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub13 local8 = new Class2_Sub13(arg0);
		@Pc(12) int local12 = local8.method4240();
		@Pc(21) int local21 = local8.method4239();
		if (local21 < 0 || Static244.anInt1025 != 0 && Static244.anInt1025 < local21) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(44) byte[] local44 = new byte[local21];
			local8.method4244(local44, local21);
			return local44;
		} else {
			@Pc(56) int local56 = local8.method4239();
			if (local56 < 0 || Static244.anInt1025 != 0 && local56 > Static244.anInt1025) {
				throw new RuntimeException();
			}
			@Pc(76) byte[] local76 = new byte[local56];
			if (local12 == 1) {
				Static131.method2312(local76, local56, arg0, local21);
			} else {
				Static336.aClass109_1.method2498(local8, local76);
			}
			return local76;
		}
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(Lclient!ms;I)Z")
	public static boolean method2805(@OriginalArg(0) Class155 arg0) {
		if (Static341.anInt6031 == arg0.anInt4155) {
			Static127.anInt2393 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZZ)Z")
	public static boolean method2806(@OriginalArg(1) boolean arg0) {
		@Pc(11) boolean local11 = Static304.aClass82_4.method4463();
		if (arg0 == local11) {
			return true;
		}
		if (!arg0) {
			Static304.aClass82_4.method4547();
		} else if (!Static304.aClass82_4.method4503()) {
			arg0 = false;
		}
		if (local11 == arg0) {
			return false;
		} else {
			Static168.aBoolean222 = arg0;
			Static30.method724(Static92.aClass53_2);
			return true;
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!fc;B)V")
	public static void method2807(@OriginalArg(0) Class71 arg0) {
		Static55.anInt1143 = 0;
		Static110.anInt2197 = 0;
		Static35.aClass56_1 = new Class56();
		Static48.aClass22_Sub4_Sub1_Sub1Array1 = new Class22_Sub4_Sub1_Sub1[1024];
		Static366.method5529(arg0);
		Static1.method29(arg0);
	}
}
