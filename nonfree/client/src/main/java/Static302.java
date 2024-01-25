import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "Lclient!gq;")
	public static Class117 aClass117_5;

	@OriginalMember(owner = "client!mm", name = "k", descriptor = "[I")
	public static final int[] anIntArray836 = new int[14];

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method8211(@OriginalArg(0) String arg0) {
		return Static525.method8028(10, arg0);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IZBZI)V")
	public static void method8214(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static378.method6048(0, arg1, arg2, arg0, arg3, Static529.aClass38_Sub1Array140.length - 1);
		Static452.aClass1_Sub16_2 = null;
		Static452.anInt7896 = 0;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIII)V")
	public static void method8220(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(7) int local7 = arg0 << 3;
		@Pc(11) int local11 = arg1 << 3;
		Static135.aFloat193 = local7;
		Static49.aFloat29 = local11;
		if (Static170.anInt3418 == 2) {
			Static505.anInt6155 = 0;
			Static536.anInt9434 = local11;
			Static469.anInt8096 = local7;
		}
		Static25.method772();
		Static506.aBoolean670 = true;
	}
}
