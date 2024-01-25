import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static629 {

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "Z")
	public static boolean aBoolean787;

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_106 = new Class341(2, 3);

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_107 = new Class341(38, 7);

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "[I")
	public static final int[] anIntArray566 = new int[1000];

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZLclient!fm;I)V")
	public static void method9337(@OriginalArg(1) Class15_Sub3_Sub3_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anIntArray184 == null) {
			return;
		}
		@Pc(13) int local13 = arg0.anIntArray184[arg1 + 1];
		if (local13 == arg0.anInt3985) {
			return;
		}
		arg0.anInt4038 = arg0.anInt4039;
		arg0.anInt4036 = 0;
		arg0.anInt3995 = 1;
		arg0.anInt3985 = local13;
		arg0.anInt4021 = 0;
		arg0.anInt3998 = 0;
		if (arg0.anInt3985 != -1) {
			Static509.method7938(Static354.aClass40_2.method1123(arg0.anInt3985), arg0, arg0.anInt4021);
		}
	}
}
