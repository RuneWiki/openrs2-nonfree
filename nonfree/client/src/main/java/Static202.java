import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
	public static int anInt3962;

	@OriginalMember(owner = "client!kh", name = "q", descriptor = "Lclient!gw;")
	public static final Class91 aClass91_26 = new Class91();

	@OriginalMember(owner = "client!kh", name = "r", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_54 = new Class212(53, -1);

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIILclient!tf;Lclient!i;Lclient!qa;III)V")
	public static void method3546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class240 arg3, @OriginalArg(4) Class74 arg4, @OriginalArg(5) Class30 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(15) Class217 local15 = Static62.aClass116_1.method3300(arg2);
		if (local15 == null || !local15.aBoolean458 || !local15.method5087(Static67.aClass224_1)) {
			return;
		}
		@Pc(35) int local35;
		if (local15.anIntArray499 != null) {
			@Pc(33) int[] local33 = new int[local15.anIntArray499.length];
			@Pc(49) int local49;
			for (local35 = 0; local35 < local33.length / 2; local35++) {
				if (Static275.anInt5173 == 4) {
					local49 = (int) Static322.aFloat82 & 0x3FFF;
				} else {
					local49 = Static53.anInt4624 + (int) Static322.aFloat82 & 0x3FFF;
				}
				@Pc(60) int local60 = Class4_Sub13.anIntArray497[local49];
				@Pc(64) int local64 = Class4_Sub13.anIntArray496[local49];
				if (Static275.anInt5173 != 4) {
					local60 = local60 * 256 / (Static437.anInt7473 + 256);
					local64 = local64 * 256 / (Static437.anInt7473 + 256);
				}
				local33[local35 * 2] = ((arg1 + local15.anIntArray499[local35 * 2 + 1] * 4) * local60 + (arg6 + local15.anIntArray499[local35 * 2] * 4) * local64 >> 15) + arg7 + arg3.anInt6904 / 2;
				local33[local35 * 2 + 1] = arg0 + arg3.anInt6894 / 2 - ((local15.anIntArray499[local35 * 2 - -1] * 4 + arg1) * local64 + -((local15.anIntArray499[local35 * 2] * 4 + arg6) * local60) >> 15);
			}
			Static152.method2809(arg5, local33, local15.anInt6189, arg3.anIntArray555, arg3.anIntArray553);
			for (local49 = 0; local49 < local33.length / 2 - 1; local49++) {
				arg5.method2069(local33[local49 * 2], local33[local49 * 2 + 1], local33[(local49 + 1) * 2], local33[local49 * 2 + 1 + 2], local15.anInt6163, arg4, arg7, arg0);
			}
			arg5.method2069(local33[local33.length - 2], local33[local33.length - 1], local33[0], local33[1], local15.anInt6163, arg4, arg7, arg0);
		}
		@Pc(270) Class2 local270 = null;
		if (local15.anInt6181 != -1) {
			local270 = local15.method5091(arg5, false);
			if (local270 != null) {
				Static351.method5117(arg4, arg6, arg7, arg1, arg0, arg3, local270);
			}
		}
		if (local15.aString53 == null) {
			return;
		}
		local35 = 0;
		if (local270 != null) {
			local35 = local270.V();
		}
		@Pc(304) Class18 local304 = Static142.aClass18_1;
		@Pc(306) Class84 local306 = Static94.aClass84_3;
		if (local15.anInt6195 == 1) {
			local306 = Static115.aClass84_4;
			local304 = Static330.aClass18_3;
		}
		if (local15.anInt6195 == 2) {
			local306 = Static296.aClass84_10;
			local304 = Static247.aClass18_2;
		}
		Static285.method4433(local35, arg4, arg3, local15.anInt6188, local15.aString53, local304, arg6, arg0, arg7, local306, arg1);
		return;
	}
}
