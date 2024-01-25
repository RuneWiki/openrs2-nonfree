import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static543 {

	@OriginalMember(owner = "client!sja", name = "e", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray8;

	@OriginalMember(owner = "client!sja", name = "j", descriptor = "D")
	public static double aDouble17;

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "Lclient!lk;")
	public static final Class219 aClass219_11 = new Class219();

	@OriginalMember(owner = "client!sja", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray49 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!sja", name = "i", descriptor = "I")
	public static int anInt9260 = 0;

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(ILclient!ec;)I")
	public static int method7945(@OriginalArg(1) Class8_Sub1_Sub3_Sub2 arg0) {
		if (arg0.anInt7020 == 0) {
			return 0;
		}
		@Pc(61) int local61;
		@Pc(54) int local54;
		if (arg0.anInt7041 != -1) {
			@Pc(15) Class8_Sub1_Sub3_Sub2 local15 = null;
			if (arg0.anInt7041 < 32768) {
				@Pc(27) Class5_Sub35 local27 = (Class5_Sub35) Static623.aClass291_43.method6993((long) arg0.anInt7041, 1);
				if (local27 != null) {
					local15 = local27.aClass8_Sub1_Sub3_Sub2_Sub2_2;
				}
			} else if (arg0.anInt7041 >= 32768) {
				local15 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[arg0.anInt7041 - 32768];
			}
			if (local15 != null) {
				local54 = arg0.anInt10355 - local15.anInt10355;
				local61 = arg0.anInt10363 - local15.anInt10363;
				if (local54 != 0 || local61 != 0) {
					arg0.method5989((int) (Math.atan2((double) local54, (double) local61) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class8_Sub1_Sub3_Sub2_Sub1) {
			@Pc(172) Class8_Sub1_Sub3_Sub2_Sub1 local172 = (Class8_Sub1_Sub3_Sub2_Sub1) arg0;
			if (local172.anInt4199 != -1 && (local172.anInt7050 == 0 || local172.anInt7052 > 0)) {
				local172.method5989(local172.anInt4199);
				local172.anInt4199 = -1;
			}
		} else if (arg0 instanceof Class8_Sub1_Sub3_Sub2_Sub2) {
			@Pc(96) Class8_Sub1_Sub3_Sub2_Sub2 local96 = (Class8_Sub1_Sub3_Sub2_Sub2) arg0;
			if (local96.anInt7058 != -1 && (local96.anInt7050 == 0 || local96.anInt7052 > 0)) {
				local54 = local96.anInt10355 - (local96.anInt7058 - Static622.anInt10188 - Static622.anInt10188) * 256;
				local61 = local96.anInt10363 - (local96.anInt7059 - Static668.anInt10683 - Static668.anInt10683) * 256;
				if (local54 != 0 || local61 != 0) {
					local96.method5989((int) (Math.atan2((double) local54, (double) local61) * 2607.5945876176133D) & 0x3FFF);
				}
				local96.anInt7058 = -1;
			}
		}
		return arg0.method5997();
	}
}
