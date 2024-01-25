import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
	public static int anInt1350 = 100;

	@OriginalMember(owner = "client!cr", name = "h", descriptor = "[I")
	public static final int[] anIntArray60 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!cr", name = "i", descriptor = "I")
	public static int anInt1353 = 0;

	@OriginalMember(owner = "client!cr", name = "s", descriptor = "I")
	public static int anInt1363 = 0;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!lj;I)V")
	public static void method1171(@OriginalArg(0) Class78_Sub3 arg0) {
		@Pc(14) byte[] local14;
		if (Static203.anObject9 == null) {
			@Pc(5) Class6_Sub2_Sub1 local5 = new Class6_Sub2_Sub1();
			local14 = local5.method6171();
			Static203.anObject9 = Static161.method2652(local14);
		}
		if (Static8.anObject16 == null) {
			@Pc(29) Class6_Sub1_Sub2 local29 = new Class6_Sub1_Sub2();
			local14 = local29.method4854();
			Static8.anObject16 = Static161.method2652(local14);
		}
		@Pc(48) Class250 local48 = arg0.aClass250_1;
		if (local48.method5427() && Static41.anObject22 == null) {
			local14 = Static426.method6095(4.0F, 16.0F, 0.6F, new Class119_Sub1(419684), 4.0F, 0.5F);
			Static41.anObject22 = Static161.method2652(local14);
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIB)Z")
	public static boolean method1175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | Static480.method6648(arg0, arg1) || Static324.method4819(arg1, arg0);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIII)V")
	public static void method1176(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		anInt1350 = arg0;
		Static120.anInt2491 = 0;
		Static194.anInt3788 = arg1;
		Static330.anInt6025 = 0;
	}
}
