import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static592 {

	@OriginalMember(owner = "client!wq", name = "g", descriptor = "Lclient!rh;")
	public static Class12 aClass12_1;

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_110 = new Class230(17, 7);

	@OriginalMember(owner = "client!wq", name = "d", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_111 = new Class230(5, 8);

	@OriginalMember(owner = "client!wq", name = "e", descriptor = "[I")
	public static final int[] anIntArray677 = new int[8];

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IZIBZ)I")
	public static int method8349(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) boolean arg2) {
		@Pc(8) Class3_Sub29 local8 = Static535.method7881(false, arg0);
		if (local8 == null) {
			return 0;
		}
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < local8.anIntArray328.length; local21++) {
			if (local8.anIntArray328[local21] >= 0 && local8.anIntArray328[local21] < Static517.aClass23_2.anInt777) {
				@Pc(45) Class18 local45 = Static517.aClass23_2.method901(local8.anIntArray328[local21]);
				@Pc(55) int local55 = local45.method763(Static299.aClass17_2.method758(arg1).anInt7291, arg1);
				if (arg2) {
					local19 += local55 * local8.anIntArray329[local21];
				} else {
					local19 += local55;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(II)V")
	public static void method8350(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = Static129.anInt10429 - Static292.anInt7683;
		if (local8 >= 100) {
			Static267.anInt5668 = 1;
			return;
		}
		@Pc(17) int local17 = (int) Static170.aFloat181;
		if (local17 < Static486.anInt9077 >> 8) {
			local17 = Static486.anInt9077 >> 8;
		}
		if (Static525.aBooleanArray38[4] && local17 < Static254.anIntArray491[4] + 128) {
			local17 = Static254.anIntArray491[4] + 128;
		}
		@Pc(54) int local54 = Static460.anInt8639 + (int) Static533.aFloat188 & 0x3FFF;
		Static183.method3264(Static274.method4782(Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9396, Static212.anInt4380, Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9398) - 200, Static189.anInt3761, arg0, local17, (local17 >> 3) * 3 + 600 << 2, local54, Static65.anInt1699);
		@Pc(98) float local98 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static594.anInt10391 = (int) ((float) Static194.anInt3788 + local98 * (float) (Static594.anInt10391 - Static194.anInt3788));
		Static360.anInt1771 = (int) ((float) (Static360.anInt1771 - Static587.anInt10281) * local98 + (float) Static587.anInt10281);
		Static522.anInt9554 = (int) ((float) Static210.anInt4351 + local98 * (float) (Static522.anInt9554 - Static210.anInt4351));
		Static496.anInt9269 = (int) ((float) Static239.anInt4930 + local98 * (float) (Static496.anInt9269 - Static239.anInt4930));
		@Pc(158) int local158 = Static104.anInt2511 - Static186.anInt3738;
		if (local158 > 8192) {
			local158 -= 16384;
		} else if (local158 < -8192) {
			local158 += 16384;
		}
		Static104.anInt2511 = (int) ((float) local158 * local98 + (float) Static186.anInt3738);
		Static104.anInt2511 &= 0x3FFF;
	}
}
