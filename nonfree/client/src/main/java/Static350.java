import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "[I")
	public static final int[] anIntArray573 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

	@OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
	public static int anInt5984 = 0;

	@OriginalMember(owner = "client!ri", name = "n", descriptor = "I")
	public static int anInt5988 = 0;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(III)I")
	public static int method4744(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static414.anIntArray673[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V")
	public static void method4745() {
		Static56.aClass50_1.JA(Static349.aFloat105 * ((float) Static361.aClass85_Sub1_1.anInt2491 * 0.1F + 0.7F));
		Static56.aClass50_1.B(Static386.anInt6594, Static227.aFloat63, Static238.aFloat71, (float) (Static191.anInt3841 << 0), (float) (Static34.anInt560 << 0), (float) (Static19.anInt349 << 0));
		Static56.aClass50_1.method5835(Static447.aClass30_7);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIBI)Lclient!ms;")
	public static Class24_Sub3_Sub2 method4748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class11 local11 = Static309.aClass11ArrayArrayArray2[arg1][arg0][arg2];
		if (local11 == null) {
			return null;
		}
		@Pc(22) Class24_Sub3_Sub2 local22 = null;
		@Pc(24) int local24 = -1;
		for (@Pc(27) Class1 local27 = local11.aClass1_3; local27 != null; local27 = local27.aClass1_1) {
			@Pc(31) Class24_Sub3 local31 = local27.aClass24_Sub3_1;
			if (local31 instanceof Class24_Sub3_Sub2) {
				@Pc(37) Class24_Sub3_Sub2 local37 = (Class24_Sub3_Sub2) local31;
				@Pc(47) int local47 = (local37.method4919() - 1) * 64 + 60;
				@Pc(54) int local54 = local37.anInt7092 - local47 >> 7;
				@Pc(61) int local61 = local37.anInt7094 - local47 >> 7;
				@Pc(68) int local68 = local47 + local37.anInt7092 >> 7;
				@Pc(75) int local75 = local37.anInt7094 + local47 >> 7;
				if (arg0 >= local54 && arg2 >= local61 && local68 >= arg0 && arg2 <= local75) {
					@Pc(113) int local113 = (local75 + 1 - arg2) * (-arg0 + 1 + local68);
					if (local24 < local113) {
						local24 = local113;
						local22 = local37;
					}
				}
			}
		}
		return local22;
	}
}
