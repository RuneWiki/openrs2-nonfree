import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!ll", name = "f", descriptor = "Lclient!gn;")
	public static Class93 aClass93_3;

	@OriginalMember(owner = "client!ll", name = "j", descriptor = "I")
	public static int anInt3626;

	@OriginalMember(owner = "client!ll", name = "g", descriptor = "Lclient!o;")
	public static final Class169 aClass169_183 = new Class169("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

	@OriginalMember(owner = "client!ll", name = "k", descriptor = "[I")
	public static final int[] anIntArray449 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!ll", name = "m", descriptor = "I")
	public static int anInt3628 = 0;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!sk;Z)V")
	public static void method2954(@OriginalArg(0) Class25_Sub1_Sub1 arg0) {
		@Pc(8) int local8 = arg0.anInt2336 - Static366.anInt5883;
		@Pc(24) int local24 = arg0.anInt2346 * 128 + arg0.method1877() * 64;
		@Pc(36) int local36 = arg0.anInt2329 * 128 + arg0.method1877() * 64;
		arg0.anInt6080 += (local24 - arg0.anInt6080) / local8;
		arg0.anInt2380 = 0;
		arg0.anInt6077 += (local36 - arg0.anInt6077) / local8;
		if (arg0.anInt2334 == 0) {
			arg0.method1889(8192);
		}
		if (arg0.anInt2334 == 1) {
			arg0.method1889(12288);
		}
		if (arg0.anInt2334 == 2) {
			arg0.method1889(0);
		}
		if (arg0.anInt2334 == 3) {
			arg0.method1889(4096);
		}
	}
}
