import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!wg", name = "I", descriptor = "I")
	public static int anInt7813;

	@OriginalMember(owner = "client!wg", name = "H", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_109 = new Class177(16, 0);

	@OriginalMember(owner = "client!wg", name = "K", descriptor = "Z")
	public static boolean aBoolean509 = false;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!ec;I)V")
	public static void method6042(@OriginalArg(0) Class68 arg0) {
		if (Static124.anInt2755 == arg0.anInt2105) {
			Static58.aBooleanArray8[arg0.anInt2161] = true;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIB)I")
	public static int method6043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return 7 - arg1;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!wc;Lclient!wc;I)V")
	public static void method6045(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(1) Class1_Sub1 arg1) {
		if (arg1.aClass1_Sub1_57 != null) {
			arg1.method6125();
		}
		arg1.aClass1_Sub1_58 = arg0.aClass1_Sub1_58;
		arg1.aClass1_Sub1_57 = arg0;
		arg1.aClass1_Sub1_57.aClass1_Sub1_58 = arg1;
		arg1.aClass1_Sub1_58.aClass1_Sub1_57 = arg1;
	}
}
