import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!ko", name = "p", descriptor = "Lclient!vh;")
	public static Class250 aClass250_50;

	@OriginalMember(owner = "client!ko", name = "n", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_26 = new Class27(16);

	@OriginalMember(owner = "client!ko", name = "o", descriptor = "I")
	public static int anInt3917 = -1;

	@OriginalMember(owner = "client!ko", name = "q", descriptor = "Z")
	public static boolean aBoolean271 = true;

	@OriginalMember(owner = "client!ko", name = "r", descriptor = "[Z")
	public static final boolean[] aBooleanArray13 = new boolean[200];

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILclient!ir;)V")
	public static void method3266(@OriginalArg(1) Class26_Sub2_Sub2 arg0) {
		@Pc(14) int local14 = arg0.anInt7088 - Static403.anInt6978;
		@Pc(26) int local26 = arg0.anInt7137 * 128 + arg0.method5535() * 64;
		@Pc(37) int local37 = arg0.anInt7142 * 128 + arg0.method5535() * 64;
		arg0.anInt7150 = 0;
		arg0.anInt7065 += (local37 - arg0.anInt7065) / local14;
		arg0.anInt7068 += (local26 - arg0.anInt7068) / local14;
		if (arg0.anInt7093 == 0) {
			arg0.method5526(8192);
		}
		if (arg0.anInt7093 == 1) {
			arg0.method5526(12288);
		}
		if (arg0.anInt7093 == 2) {
			arg0.method5526(0);
		}
		if (arg0.anInt7093 == 3) {
			arg0.method5526(4096);
		}
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(B)V")
	public static void method3267() {
		Static415.aBoolean464 = true;
	}
}
