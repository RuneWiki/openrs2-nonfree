import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!op", name = "J", descriptor = "Lclient!gda;")
	public static Class126 aClass126_200;

	@OriginalMember(owner = "client!op", name = "H", descriptor = "I")
	public static int anInt7170;

	@OriginalMember(owner = "client!op", name = "N", descriptor = "Lclient!f;")
	public static Class104 aClass104_1;

	@OriginalMember(owner = "client!op", name = "O", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_186 = new Class381(37, -1);

	@OriginalMember(owner = "client!op", name = "K", descriptor = "Lclient!at;")
	public static final Class20 aClass20_37 = new Class20();

	@OriginalMember(owner = "client!op", name = "L", descriptor = "[I")
	public static int[] anIntArray431 = new int[1];

	@OriginalMember(owner = "client!op", name = "c", descriptor = "(III)V")
	public static void method6240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class128 local7 = Static283.aClass128ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			Static370.method5508(local7.aClass4_Sub1_Sub3_1);
			if (local7.aClass4_Sub1_Sub3_1 != null) {
				local7.aClass4_Sub1_Sub3_1 = null;
			}
		}
	}
}
