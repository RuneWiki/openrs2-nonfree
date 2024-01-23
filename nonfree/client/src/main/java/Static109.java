import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
	public static int anInt2178;

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
	public static int anInt2179;

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
	public static int anInt2180;

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "Lclient!ul;")
	public static Class172 aClass172_20 = new Class172(64);

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
	public static void method1851() {
		Static175.aClass4_Sub24_Sub1_1.method3123(228);
		Static175.aClass4_Sub24_Sub1_1.method3079((long) 0);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIII)V")
	public static void method1853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class4_Sub21 local7 = Static261.aClass4_Sub21ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class35 local13 = local7.aClass35_1;
		if (local13 != null) {
			local13.anInt1240 = local13.anInt1240 * arg3 / 16;
			local13.anInt1248 = local13.anInt1248 * arg3 / 16;
		}
	}
}
