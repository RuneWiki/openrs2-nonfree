import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!lm", name = "h", descriptor = "Lclient!ig;")
	public static Class12 aClass12_10;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "Lclient!hi;")
	public static final Class106 aClass106_7 = new Class106(9, 0, 4, 1);

	@OriginalMember(owner = "client!lm", name = "f", descriptor = "[I")
	public static final int[] anIntArray332 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!lm", name = "g", descriptor = "[Lclient!wr;")
	public static final Class266[] aClass266Array1 = new Class266[4];

	@OriginalMember(owner = "client!lm", name = "j", descriptor = "I")
	public static int anInt3878 = 0;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!ia;I)V")
	public static void method3464(@OriginalArg(0) Class6_Sub15_Sub1 arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static7.anInt156; local12++) {
			@Pc(18) int local18 = Static56.anIntArray98[local12];
			@Pc(22) Class3_Sub3_Sub6_Sub1 local22 = Static355.aClass3_Sub3_Sub6_Sub1Array1[local18];
			@Pc(26) int local26 = arg0.method3111();
			if ((local26 & 0x80) != 0) {
				local26 += arg0.method3111() << 8;
			}
			if ((local26 & 0x2000) != 0) {
				local26 += arg0.method3111() << 16;
			}
			Static319.method4549(local26, arg0, local18, local22);
		}
	}
}
