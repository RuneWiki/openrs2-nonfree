import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "Lclient!fk;")
	public static Class71 aClass71_1;

	@OriginalMember(owner = "client!bp", name = "d", descriptor = "I")
	public static int anInt601;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray18 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!bp", name = "e", descriptor = "[I")
	public static final int[] anIntArray68 = new int[8];

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZBII)I")
	public static int method539(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class5_Sub14 local8 = Static319.method5550(arg0, arg1);
		if (local8 == null) {
			return 0;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(28) int local28 = 0;
			for (@Pc(30) int local30 = 0; local30 < local8.anIntArray128.length; local30++) {
				if (arg2 == local8.anIntArray129[local30]) {
					local28 += local8.anIntArray128[local30];
				}
			}
			return local28;
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Ljava/lang/String;IIZJIILjava/lang/String;)V")
	public static void method540(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) long arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6) {
		if (!Static93.aBoolean128 && Static160.anInt3181 < 500) {
			@Pc(18) int local18 = arg5 == -1 ? Static199.anInt3970 : arg5;
			@Pc(33) Class5_Sub20 local33 = new Class5_Sub20(arg0, arg6, local18, arg1, arg3, arg2, arg4);
			Class4_Sub3_Sub2.aClass103_139.method2745(local33);
			Static160.anInt3181++;
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IB)V")
	public static void method542(@OriginalArg(0) int arg0) {
		@Pc(8) Class5_Sub1_Sub2 local8 = Static166.method3027(arg0, 10);
		local8.method856();
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IJ[II)Ljava/lang/String;")
	public static String method543(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int[] arg2) {
		if (Static248.anInterface2_1 != null) {
			@Pc(12) String local12 = Static248.anInterface2_1.method637(arg0, arg2, arg1);
			if (local12 != null) {
				return local12;
			}
		}
		return Long.toString(arg1);
	}
}
