import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "I")
	public static int anInt1027;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIII)V")
	public static void method1053(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class6_Sub2_Sub7 local13 = Static401.method5861(arg2, 11);
		local13.method2582();
		local13.anInt2947 = arg0;
		local13.anInt2944 = arg1;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(III)I")
	public static int method1054(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static358.anIntArray474[arg1 & 0x3] : Static47.anIntArray49[arg1 & 0x3];
	}
}
