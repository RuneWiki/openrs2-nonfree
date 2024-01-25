import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static584 {

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "Lclient!lm;")
	public static Class206 aClass206_2;

	@OriginalMember(owner = "client!uu", name = "l", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_165 = new Class274(1, 4);

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "([[BILclient!wq;)V")
	public static void method8058(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class45_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(20) int local20 = arg0.length;
		@Pc(41) int local41;
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(28) byte[] local28 = arg0[local22];
			if (local28 != null) {
				@Pc(35) Class2_Sub34 local35 = new Class2_Sub34(local28);
				local41 = Static349.anIntArray395[local22] >> 8;
				@Pc(47) int local47 = Static349.anIntArray395[local22] & 0xFF;
				@Pc(53) int local53 = local41 * 64 - Static451.anInt7933;
				@Pc(60) int local60 = local47 * 64 - Static470.anInt8063;
				Static77.method1461();
				arg1.method8515(Static19.aClass179Array2, local35, local60, Static451.anInt7933, Static470.anInt8063, local53);
				arg1.method8530(local12, local53, local35, Static600.aClass87_15, local60);
				if (!arg1.aBoolean755 && Static415.anInt7580 / 8 == local41 && Static127.anInt2955 / 8 == local47 && local12[0] != -1) {
					Static587.aClass17_1 = Static571.aClass169_1.method4175(Static576.aClass343_1, local12[0], local12[1], local12[3], local12[2]);
					Static202.anInt4261 = local12[4];
				}
			}
		}
		for (@Pc(133) int local133 = 0; local133 < local20; local133++) {
			@Pc(146) int local146 = (Static349.anIntArray395[local133] >> 8) * 64 - Static451.anInt7933;
			local41 = (Static349.anIntArray395[local133] & 0xFF) * 64 - Static470.anInt8063;
			@Pc(161) byte[] local161 = arg0[local133];
			if (local161 == null && Static127.anInt2955 < 800) {
				Static77.method1461();
				arg1.method8517(local146, local41);
			}
		}
	}
}
