import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!iia", name = "g", descriptor = "[I")
	public static int[] anIntArray245;

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(B)V")
	public static void method3519() {
		Static539.aClass265_58.method6568();
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(Lclient!cb;IB)Lclient!kf;")
	public static Class198 method3522(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1) {
		@Pc(16) byte[] local16 = arg0.method915(arg1);
		return local16 == null ? null : new Class198(local16);
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(Lclient!ts;IIZ)V")
	public static void method3524(@OriginalArg(0) Class41_Sub1_Sub1_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int[] local6 = new int[4];
		Static685.method8333(local6, 0, local6.length, arg2);
		Static23.method335(local6, arg1, arg0);
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(Z)V")
	public static void method3525(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static129.aClass313ArrayArrayArray7 = Static549.aClass313ArrayArrayArray6;
			Static298.aClass88Array3 = Static176.aClass88Array1;
		} else {
			Static129.aClass313ArrayArrayArray7 = Static392.aClass313ArrayArrayArray4;
			Static298.aClass88Array3 = Static230.aClass88Array2;
		}
		Static202.anInt3256 = Static129.aClass313ArrayArrayArray7.length;
	}
}
