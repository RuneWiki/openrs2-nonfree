import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!mr", name = "e", descriptor = "Lclient!jaa;")
	public static Class72 aClass72_1;

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_60 = new Class243(47, 8);

	@OriginalMember(owner = "client!mr", name = "d", descriptor = "I")
	public static int anInt5606 = 10;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method4784(@OriginalArg(1) int arg0) {
		@Pc(18) byte[] local18;
		if (arg0 == 100 && Static80.anInt1660 > 0) {
			local18 = Static195.aByteArrayArray14[--Static80.anInt1660];
			Static195.aByteArrayArray14[Static80.anInt1660] = null;
			return local18;
		} else if (arg0 == 5000 && Static324.anInt6022 > 0) {
			local18 = Static418.aByteArrayArray23[--Static324.anInt6022];
			Static418.aByteArrayArray23[Static324.anInt6022] = null;
			return local18;
		} else if (arg0 == 30000 && Static396.anInt7539 > 0) {
			local18 = Static323.aByteArrayArray20[--Static396.anInt7539];
			Static323.aByteArrayArray20[Static396.anInt7539] = null;
			return local18;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)V")
	public static void method4785() {
		Static68.anInt1451 = 0;
		Static203.anInt3677 = -1;
		Static135.anInt2544 = -1;
		Static440.anInt8023 = -1;
	}
}
