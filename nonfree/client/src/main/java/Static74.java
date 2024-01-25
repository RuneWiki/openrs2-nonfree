import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!d", name = "n", descriptor = "Lclient!f;")
	public static Class22 aClass22_4;

	@OriginalMember(owner = "client!d", name = "o", descriptor = "Lclient!kn;")
	public static final Class1_Sub29 aClass1_Sub29_1 = new Class1_Sub29(0, 0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ZLclient!vq;)V")
	public static void method1239(@OriginalArg(1) Class8_Sub3_Sub3_Sub1 arg0) {
		@Pc(9) int local9 = arg0.anInt6779 - Static301.anInt5197;
		@Pc(20) int local20 = arg0.anInt6847 * 512 + arg0.method5434() * 256;
		@Pc(31) int local31 = arg0.anInt6796 * 512 + arg0.method5434() * 256;
		arg0.anInt9370 += (local31 - arg0.anInt9370) / local9;
		arg0.anInt9365 += (local20 - arg0.anInt9365) / local9;
		arg0.anInt6856 = 0;
		if (arg0.anInt6789 == 0) {
			arg0.method5433(8192);
		}
		if (arg0.anInt6789 == 1) {
			arg0.method5433(12288);
		}
		if (arg0.anInt6789 == 2) {
			arg0.method5433(0);
		}
		if (arg0.anInt6789 == 3) {
			arg0.method5433(4096);
		}
	}
}
