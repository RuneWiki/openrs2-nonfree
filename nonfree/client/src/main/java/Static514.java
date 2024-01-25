import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static514 {

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "[Lclient!iga;")
	public static Class173[] aClass173Array1;

	@OriginalMember(owner = "client!rl", name = "l", descriptor = "Lclient!kp;")
	public static Class205 aClass205_3;

	@OriginalMember(owner = "client!rl", name = "i", descriptor = "Lclient!wd;")
	public static Class381 aClass381_2;

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "[I")
	public static final int[] anIntArray503 = new int[64];

	@OriginalMember(owner = "client!rl", name = "h", descriptor = "[Z")
	public static final boolean[] aBooleanArray20 = new boolean[200];

	@OriginalMember(owner = "client!rl", name = "r", descriptor = "[[I")
	public static final int[][] anIntArrayArray48 = new int[128][128];

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "()V")
	public static void method7492() {
		for (@Pc(1) int local1 = 0; local1 < Static158.anInt2473; local1++) {
			@Pc(6) Class8_Sub1_Sub3 local6 = Static15.aClass8_Sub1_Sub3Array1[local1];
			Static486.method7027(local6, true);
			Static15.aClass8_Sub1_Sub3Array1[local1] = null;
		}
		Static158.anInt2473 = 0;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!ec;B)V")
	public static void method7496(@OriginalArg(0) Class8_Sub1_Sub3_Sub2 arg0) {
		if (arg0.anIntArray410 == null && arg0.anIntArray408 == null) {
			return;
		}
		@Pc(17) boolean local17 = true;
		for (@Pc(25) int local25 = 0; local25 < arg0.anIntArray410.length; local25++) {
			@Pc(31) int local31 = -1;
			if (arg0.anIntArray410 != null) {
				local31 = arg0.anIntArray410[local25];
			}
			if (local31 != -1) {
				local17 = false;
				@Pc(91) int local91;
				@Pc(104) int local104;
				@Pc(71) int local71;
				if ((local31 & 0xC0000000) == -1073741824) {
					local71 = local31 & 0xFFFFFFF;
					@Pc(75) int local75 = local71 >> 14;
					@Pc(79) int local79 = local71 & 0x3FFF;
					local91 = arg0.anInt10355 - (-Static622.anInt10188 + local75) * 512 - 256;
					local104 = arg0.anInt10363 - (local79 - Static668.anInt10683) * 512 - 256;
				} else if ((local31 & 0x8000) == 0) {
					@Pc(119) Class5_Sub35 local119 = (Class5_Sub35) Static623.aClass291_43.method6993((long) local31, 1);
					if (local119 == null) {
						arg0.method6002(-1, local25);
						continue;
					}
					@Pc(124) Class8_Sub1_Sub3_Sub2_Sub2 local124 = local119.aClass8_Sub1_Sub3_Sub2_Sub2_2;
					local104 = arg0.anInt10363 - local124.anInt10363;
					local91 = arg0.anInt10355 - local124.anInt10355;
				} else {
					local71 = local31 & 0x7FFF;
					@Pc(158) Class8_Sub1_Sub3_Sub2_Sub1 local158 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local71];
					if (local158 == null) {
						arg0.method6002(-1, local25);
						continue;
					}
					local104 = arg0.anInt10363 - local158.anInt10363;
					local91 = arg0.anInt10355 - local158.anInt10355;
				}
				if (local91 != 0 || local104 != 0) {
					arg0.method6002((int) (Math.atan2((double) local91, (double) local104) * 2607.5945876176133D) & 0x3FFF, local25);
				}
			} else if (!arg0.method6002(-1, local25)) {
				local17 = false;
			}
		}
		if (local17) {
			arg0.anIntArray410 = null;
			arg0.anIntArray408 = null;
		}
	}
}
