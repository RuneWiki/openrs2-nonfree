import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!kh", name = "M", descriptor = "Lclient!jj;")
	public static Class98 aClass98_6;

	@OriginalMember(owner = "client!kh", name = "P", descriptor = "Lclient!rs;")
	public static Class174 aClass174_4;

	@OriginalMember(owner = "client!kh", name = "O", descriptor = "[I")
	public static final int[] anIntArray286 = new int[500];

	@OriginalMember(owner = "client!kh", name = "T", descriptor = "Lclient!va;")
	public static final Class199 aClass199_17 = new Class199(16);

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "(I)V")
	public static void method3155() {
		Static8.anInt164 = 0;
		@Pc(13) int local13 = (Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5289 >> 7) + Static138.anInt2879;
		@Pc(20) int local20 = (Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5280 >> 7) + Static342.anInt6864;
		if (local13 >= 3053 && local13 <= 3156 && local20 >= 3056 && local20 <= 3136) {
			Static8.anInt164 = 1;
		}
		if (local13 >= 3072 && local13 <= 3118 && local20 >= 9492 && local20 <= 9535) {
			Static8.anInt164 = 1;
		}
		if (Static8.anInt164 == 1 && local13 >= 3139 && local13 <= 3199 && local20 >= 3008 && local20 <= 3062) {
			Static8.anInt164 = 0;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZLclient!fj;)V")
	public static void method3156(@OriginalArg(1) Class62_Sub1_Sub2 arg0) {
		@Pc(8) int local8 = arg0.anInt5296 - Static212.anInt4090;
		@Pc(20) int local20 = arg0.anInt5351 * 128 + arg0.method4777() * 64;
		@Pc(32) int local32 = arg0.anInt5338 * 128 + arg0.method4777() * 64;
		arg0.anInt5366 = 0;
		arg0.anInt5280 += (local32 - arg0.anInt5280) / local8;
		arg0.anInt5289 += (local20 - arg0.anInt5289) / local8;
		if (arg0.anInt5298 == 0) {
			arg0.method4776(8192);
		}
		if (arg0.anInt5298 == 1) {
			arg0.method4776(12288);
		}
		if (arg0.anInt5298 == 2) {
			arg0.method4776(0);
		}
		if (arg0.anInt5298 == 3) {
			arg0.method4776(4096);
		}
	}

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "(B)V")
	public static void method3158() {
		Static330.aClass119_203.method3304();
	}
}
