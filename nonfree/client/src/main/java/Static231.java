import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!lj", name = "N", descriptor = "[Lclient!o;")
	public static Class6[] aClass6Array10;

	@OriginalMember(owner = "client!lj", name = "P", descriptor = "Lclient!ao;")
	public static Class12 aClass12_112;

	@OriginalMember(owner = "client!lj", name = "R", descriptor = "Lclient!fo;")
	public static Class82 aClass82_53;

	@OriginalMember(owner = "client!lj", name = "J", descriptor = "I")
	public static int anInt4065 = 0;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BII)I")
	public static int method3309(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static141.anIntArray316[arg0 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!lj", name = "j", descriptor = "(I)V")
	public static void method3311() {
		if (Static453.aBoolean815) {
			return;
		}
		Static453.aBoolean815 = true;
		Static297.aBoolean669 = true;
		if (Static453.aClass136_Sub1_1.aBoolean495) {
			Static262.aFloat62 = (int) Static262.aFloat62 - 17 & 0xFFFFFFF0;
		} else {
			Static351.aFloat72 += (-12.0F - Static351.aFloat72) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "(III)Lclient!vv;")
	public static Class25_Sub2 method3312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class169 local7 = Static359.aClass169ArrayArrayArray5[arg0][arg1][arg2];
		return local7 == null || local7.aClass25_Sub2_2 == null ? null : local7.aClass25_Sub2_2;
	}
}
