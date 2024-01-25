import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bi", name = "B", descriptor = "Lclient!qt;")
	public static Class199 aClass199_2;

	@OriginalMember(owner = "client!bi", name = "J", descriptor = "[[Lclient!uu;")
	public static Class247[][] aClass247ArrayArray1;

	@OriginalMember(owner = "client!bi", name = "k", descriptor = "Z")
	public static final boolean aBoolean53 = false;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILclient!fs;I)Lclient!qh;")
	public static Class4_Sub38 method577(@OriginalArg(0) int arg0, @OriginalArg(1) Class76 arg1) {
		@Pc(8) byte[] local8 = arg1.method2122(arg0);
		return local8 == null ? null : new Class4_Sub38(local8);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BF)F")
	public static float method581(@OriginalArg(1) float arg0) {
		return (arg0 * (arg0 * 6.0F - 15.0F) + 10.0F) * arg0 * arg0 * arg0;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!r;I)V")
	public static void method583(@OriginalArg(0) Class16_Sub1_Sub5 arg0) {
		@Pc(9) int local9 = arg0.anInt6018 - Static24.anInt5323;
		@Pc(20) int local20 = arg0.anInt6043 * 128 + arg0.method4751() * 64;
		@Pc(32) int local32 = arg0.anInt6052 * 128 + arg0.method4751() * 64;
		arg0.anInt6892 += (local32 - arg0.anInt6892) / local9;
		arg0.anInt6085 = 0;
		arg0.anInt6893 += (local20 - arg0.anInt6893) / local9;
		if (arg0.lb == 0) {
			arg0.method4743(8192);
		}
		if (arg0.lb == 1) {
			arg0.method4743(12288);
		}
		if (arg0.lb == 2) {
			arg0.method4743(0);
		}
		if (arg0.lb == 3) {
			arg0.method4743(4096);
		}
	}
}
