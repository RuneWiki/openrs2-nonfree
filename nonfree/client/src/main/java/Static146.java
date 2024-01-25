import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ZLclient!md;)V")
	public static void method2744(@OriginalArg(1) Class20_Sub1_Sub1 arg0) {
		@Pc(9) int local9 = arg0.anInt8978 - Static445.anInt7791;
		@Pc(21) int local21 = arg0.anInt8962 * 128 + arg0.method7808() * 64;
		@Pc(32) int local32 = arg0.anInt8981 * 128 + arg0.method7808() * 64;
		arg0.anInt9036 = 0;
		arg0.anInt8949 += (local32 - arg0.anInt8949) / local9;
		arg0.anInt8954 += (local21 - arg0.anInt8954) / local9;
		if (arg0.anInt8971 == 0) {
			arg0.method7820(8192);
		}
		if (arg0.anInt8971 == 1) {
			arg0.method7820(12288);
		}
		if (arg0.anInt8971 == 2) {
			arg0.method7820(0);
		}
		if (arg0.anInt8971 == 3) {
			arg0.method7820(4096);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ZC)Z")
	public static boolean method2745(@OriginalArg(1) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(III)V")
	public static void method2746(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub2_Sub16 local8 = Static422.method6588(6, arg1);
		local8.method6693();
		local8.anInt7487 = arg0;
	}
}
