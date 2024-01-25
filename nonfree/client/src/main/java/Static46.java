import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
	public static int anInt1301;

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "Lclient!gh;")
	public static Class138 aClass138_1;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILclient!ik;IIIJZ)V")
	public static void method1228(@OriginalArg(0) int arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(3) int arg2, @OriginalArg(5) long arg3) {
		Static35.method1116(arg2, arg0, arg1, arg3);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZZLclient!dq;Z)V")
	public static void method1229(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class3_Sub20 arg2) {
		@Pc(8) int local8 = arg2.anInt2493;
		@Pc(12) int local12 = (int) arg2.aLong345;
		arg2.method9596();
		if (arg0) {
			Static137.method2384(local8);
		}
		Static135.method9090(local8);
		@Pc(29) Class270 local29 = Static254.method3544(local12);
		if (local29 != null) {
			Static539.method7146(local29);
		}
		Static168.method2728();
		if (!arg1 && Static589.anInt8959 != -1) {
			Static682.method9051(1, Static589.anInt8959);
		}
		@Pc(61) Class92 local61 = new Class92(Static432.aClass313_34);
		for (@Pc(66) Class3_Sub20 local66 = (Class3_Sub20) local61.method2383(); local66 != null; local66 = (Class3_Sub20) local61.method2382()) {
			if (!local66.method9597()) {
				local66 = (Class3_Sub20) local61.method2383();
				if (local66 == null) {
					return;
				}
			}
			if (local66.anInt2491 == 3) {
				@Pc(93) int local93 = (int) local66.aLong345;
				if (local8 == local93 >>> 16) {
					method1229(true, arg1, local66);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BILclient!hba;)V")
	public static void method1230(@OriginalArg(1) int arg0, @OriginalArg(2) Class149 arg1) {
		if (Static385.anInt5974 >= 50 || (arg1 == null || arg1.anIntArrayArray13 == null || arg1.anIntArrayArray13.length <= arg0 || arg1.anIntArrayArray13[arg0] == null)) {
			return;
		}
		@Pc(42) int local42 = arg1.anIntArrayArray13[arg0][0];
		@Pc(46) int local46 = local42 >> 8;
		@Pc(65) int local65;
		if (arg1.anIntArrayArray13[arg0].length > 1) {
			local65 = (int) ((double) arg1.anIntArrayArray13[arg0].length * Math.random());
			if (local65 > 0) {
				local46 = arg1.anIntArrayArray13[arg0][local65];
			}
		}
		@Pc(80) int local80 = local42 >> 5 & 0x7;
		local65 = 256;
		if (arg1.anIntArray277 != null && arg1.anIntArray278 != null) {
			local65 = Static155.method2526(arg1.anIntArray278[arg0], arg1.anIntArray277[arg0]);
		}
		if (arg1.aBoolean231) {
			Static606.method7781(false, local65, local46, 255, local80, 0);
		} else {
			Static355.method9493(local65, 255, local80, local46, 0);
		}
	}
}
