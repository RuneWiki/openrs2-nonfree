import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!an", name = "D", descriptor = "[[S")
	public static short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!an", name = "y", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray2 = new String[100];

	@OriginalMember(owner = "client!an", name = "B", descriptor = "[I")
	public static final int[] anIntArray12 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!an", name = "E", descriptor = "F")
	public static float aFloat7 = 1.0F;

	@OriginalMember(owner = "client!an", name = "I", descriptor = "Z")
	public static boolean aBoolean22 = false;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIIZLclient!lp;Z)V")
	public static void method156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class138 arg4, @OriginalArg(6) boolean arg5) {
		if (Static109.anInt6886 >= 50 || (arg4 == null || arg4.anIntArrayArray36 == null || arg1 >= arg4.anIntArrayArray36.length || arg4.anIntArrayArray36[arg1] == null)) {
			return;
		}
		@Pc(32) int local32 = arg4.anIntArrayArray36[arg1][0];
		@Pc(36) int local36 = local32 >> 8;
		@Pc(42) int local42 = local32 >> 5 & 0x7;
		@Pc(46) int local46 = local32 & 0x1F;
		@Pc(65) int local65;
		if (arg4.anIntArrayArray36[arg1].length > 1) {
			local65 = (int) ((double) arg4.anIntArrayArray36[arg1].length * Math.random());
			if (local65 > 0) {
				local36 = arg4.anIntArrayArray36[arg1][local65];
			}
		}
		if (local46 == 0) {
			if (arg5) {
				Static187.method2934(local36, local42, 255, 0);
			}
		} else if (Static323.aClass50_Sub1_1.anInt3449 != 0) {
			local65 = arg0 - 64 >> 7;
			@Pc(109) int local109 = arg3 - 64 >> 7;
			Static86.aClass269Array1[Static109.anInt6886++] = new Class269((byte) 1, local36, local42, 0, 255, (local65 << 16) + (arg2 << 24) + (local109 << 8) + local46);
		}
	}

	@OriginalMember(owner = "client!an", name = "d", descriptor = "(I)[Lclient!sp;")
	public static Class219[] method157() {
		return new Class219[] { Static373.aClass219_6, Static53.aClass219_1, Static217.aClass219_3, Static420.aClass219_7, Static286.aClass219_5, Static229.aClass219_4 };
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IBI)I")
	public static int method158(@OriginalArg(2) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(43) int local43 = (arg0 & 0x7F) * 96 >> 7;
			if (local43 < 2) {
				local43 = 2;
			} else if (local43 > 126) {
				local43 = 126;
			}
			return (arg0 & 0xFF80) + local43;
		}
	}
}
