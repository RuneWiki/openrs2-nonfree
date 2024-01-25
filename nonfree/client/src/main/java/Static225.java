import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
	public static int anInt4017;

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_67 = new Class11(44, 16);

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method3687(@OriginalArg(1) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(8) int local8 = 0;
		for (@Pc(15) int local15 = 0; local15 < local6; local15++) {
			local8 = (local8 << 5) + arg0.charAt(local15) - local8;
		}
		return local8;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!we;I)Z")
	public static boolean method3690(@OriginalArg(0) Class243 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean455) {
			return false;
		} else if (!arg0.method5525(Static338.anInterface8_2)) {
			return false;
		} else if (Static41.aClass246_4.method5613((long) arg0.anInt6352) == null) {
			return Static232.aClass246_21.method5613((long) arg0.anInt6354) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "([BZ)[B")
	public static byte[] method3692(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub16 local8 = new Class2_Sub16(arg0);
		@Pc(12) int local12 = local8.method5350();
		@Pc(16) int local16 = local8.method5346();
		if (local16 < 0 || Static340.anInt5796 != 0 && Static340.anInt5796 < local16) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(44) byte[] local44 = new byte[local16];
			local8.method5357(local16, local44);
			return local44;
		} else {
			@Pc(56) int local56 = local8.method5346();
			if (local56 < 0 || Static340.anInt5796 != 0 && local56 > Static340.anInt5796) {
				throw new RuntimeException();
			}
			@Pc(76) byte[] local76 = new byte[local56];
			if (local12 == 1) {
				Static126.method2506(local76, local56, arg0, local16);
			} else {
				Static318.aClass108_5.method2753(local76, local8);
			}
			return local76;
		}
	}
}
