import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
	public static int anInt5270 = 0;

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "Z")
	public static boolean aBoolean423 = true;

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "[I")
	public static final int[] anIntArray413 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!lo", name = "f", descriptor = "[Z")
	public static final boolean[] aBooleanArray9 = new boolean[200];

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(III)I")
	public static int method4283(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg0 > 0) {
			local7 = arg1 & 0x1 | local7 << 1;
			arg0--;
			arg1 >>>= 0x1;
		}
		return local7;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(BLclient!vq;)I")
	public static int method4284(@OriginalArg(1) Class8_Sub3_Sub3_Sub1 arg0) {
		if (arg0.anInt6804 == 0) {
			return 0;
		}
		@Pc(73) int local73;
		@Pc(66) int local66;
		if (arg0.anInt6781 != -1) {
			@Pc(25) Class8_Sub3_Sub3_Sub1 local25 = null;
			if (arg0.anInt6781 < 32768) {
				@Pc(53) Class1_Sub42 local53 = (Class1_Sub42) Static84.aClass187_40.method3797((long) arg0.anInt6781);
				if (local53 != null) {
					local25 = local53.aClass8_Sub3_Sub3_Sub1_Sub2_2;
				}
			} else if (arg0.anInt6781 >= 32768) {
				local25 = Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[arg0.anInt6781 - 32768];
			}
			if (local25 != null) {
				local66 = arg0.anInt9365 - local25.anInt9365;
				local73 = arg0.anInt9370 - local25.anInt9370;
				if (local66 != 0 || local73 != 0) {
					arg0.method5433((int) (Math.atan2((double) local66, (double) local73) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class8_Sub3_Sub3_Sub1_Sub1) {
			@Pc(173) Class8_Sub3_Sub3_Sub1_Sub1 local173 = (Class8_Sub3_Sub3_Sub1_Sub1) arg0;
			if (local173.anInt1728 != -1 && (local173.anInt6859 == 0 || local173.anInt6856 > 0)) {
				local173.method5433(local173.anInt1728);
				local173.anInt1728 = -1;
			}
		} else if (arg0 instanceof Class8_Sub3_Sub3_Sub1_Sub2) {
			@Pc(105) Class8_Sub3_Sub3_Sub1_Sub2 local105 = (Class8_Sub3_Sub3_Sub1_Sub2) arg0;
			if (local105.anInt6868 != -1 && (local105.anInt6859 == 0 || local105.anInt6856 > 0)) {
				local66 = local105.anInt9365 - (local105.anInt6868 - Static541.anInt9058 - Static541.anInt9058) * 256;
				local73 = local105.anInt9370 - (local105.anInt6877 - Static116.anInt2289 - Static116.anInt2289) * 256;
				if (local66 != 0 || local73 != 0) {
					local105.method5433((int) (Math.atan2((double) local66, (double) local73) * 2607.5945876176133D) & 0x3FFF);
				}
				local105.anInt6868 = -1;
			}
		}
		return arg0.method5439();
	}
}
