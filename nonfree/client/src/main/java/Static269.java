import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!jj", name = "G", descriptor = "I")
	public static int anInt5045;

	@OriginalMember(owner = "client!jj", name = "M", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_80 = new Class145(79, -1);

	@OriginalMember(owner = "client!jj", name = "O", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_106 = new Class200(25, -2);

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZIIIIIFI)[[I")
	public static int[][] method4434(@OriginalArg(7) float arg0) {
		@Pc(12) int[][] local12 = new int[256][64];
		@Pc(16) Class2_Sub4_Sub9 local16 = new Class2_Sub4_Sub9();
		local16.anInt2512 = 3;
		local16.aBoolean201 = false;
		local16.anInt2519 = 4;
		local16.anInt2514 = 4;
		local16.anInt2515 = (int) (arg0 * 4096.0F);
		local16.method8902();
		Static267.method4404(256, 64);
		for (@Pc(45) int local45 = 0; local45 < 256; local45++) {
			local16.method2130(local12[local45], local45);
		}
		return local12;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIZ)V")
	public static void method4435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub7_Sub2 local8 = Static188.method3210(8, arg2);
		local8.method925();
		local8.anInt855 = arg1;
		local8.anInt858 = arg0;
		local8.anInt852 = arg3;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZ)Lclient!tq;")
	public static Class337 method4436(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static176.aClass337Array1[arg0] : null;
	}
}
