import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static569 {

	@OriginalMember(owner = "client!tea", name = "N", descriptor = "I")
	public static int anInt9968;

	@OriginalMember(owner = "client!tea", name = "X", descriptor = "I")
	public static int anInt9977;

	@OriginalMember(owner = "client!tea", name = "M", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_93 = new Class341(60, 3);

	@OriginalMember(owner = "client!tea", name = "U", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_94 = new Class341(26, 15);

	@OriginalMember(owner = "client!tea", name = "cb", descriptor = "[I")
	public static final int[] anIntArray504 = new int[8];

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(IZI)V")
	public static void method8688(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class2_Sub1_Sub5 local9 = Static653.method9595(13, (long) arg1);
		local9.method2486();
		local9.anInt2680 = arg0;
	}
}
