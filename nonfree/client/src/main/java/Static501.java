import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static501 {

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "I")
	public static int anInt8061 = 0;

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(BIIII)V")
	public static void method6964(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static491.anInt619 / (float) Static491.anInt624;
		@Pc(11) int local11 = arg1;
		@Pc(13) int local13 = arg0;
		if (local9 < 1.0F) {
			local13 = (int) ((float) arg1 * local9);
		} else {
			local11 = (int) ((float) arg0 / local9);
		}
		@Pc(39) int local39 = arg3 - (arg1 - local11) / 2;
		@Pc(47) int local47 = arg2 - (arg0 - local13) / 2;
		Static124.anInt2052 = Static491.anInt624 * local39 / local11;
		Static381.anInt6410 = Static491.anInt619 - local47 * Static491.anInt619 / local13;
		Static403.anInt6785 = -1;
		Static272.anInt4913 = -1;
		Static127.method1898();
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILclient!gda;ZLjava/lang/String;)Lclient!wm;")
	public static Class396 method6965(@OriginalArg(1) Class126 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2) {
		@Pc(12) int local12 = arg0.method3067(arg2);
		if (local12 == -1) {
			return new Class396(0);
		}
		@Pc(27) int[] local27 = arg0.method3083(local12);
		@Pc(33) Class396 local33 = new Class396(local27.length);
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		while (true) {
			while (local41 < local33.anInt10843) {
				@Pc(57) Class5_Sub36 local57 = new Class5_Sub36(arg0.method3086(local27[local43++], local12));
				@Pc(61) int local61 = local57.method7268();
				@Pc(65) int local65 = local57.method7333();
				@Pc(69) int local69 = local57.method7291();
				if (!arg1 && local69 == 1) {
					local33.anInt10843--;
				} else {
					local33.anIntArray622[local41] = local61;
					local33.anIntArray621[local41] = local65;
					local41++;
				}
			}
			return local33;
		}
	}
}
