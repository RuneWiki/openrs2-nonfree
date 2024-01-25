import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!gka", name = "R", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!gka", name = "F", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_128 = new Class179(32, -1);

	@OriginalMember(owner = "client!gka", name = "O", descriptor = "[I")
	public static final int[] anIntArray181 = new int[200];

	@OriginalMember(owner = "client!gka", name = "U", descriptor = "I")
	public static int anInt3222 = -2;

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(III[BI[BIII)V")
	public static void method2682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg1 >> 2);
		@Pc(15) int local15 = -(arg1 & 0x3);
		for (@Pc(23) int local23 = -arg4; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local10; local27 < 0; local27++) {
				local31 = arg7++;
				arg5[local31] += arg3[arg2++];
				@Pc(43) int local43 = arg7++;
				arg5[local43] += arg3[arg2++];
				@Pc(55) int local55 = arg7++;
				arg5[local55] += arg3[arg2++];
				@Pc(67) int local67 = arg7++;
				arg5[local67] += arg3[arg2++];
			}
			for (@Pc(85) int local85 = local15; local85 < 0; local85++) {
				local31 = arg7++;
				arg5[local31] += arg3[arg2++];
			}
			arg2 += arg0;
			arg7 += arg6;
		}
	}

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(Lclient!oq;III)V")
	public static void method2684(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class351 local12;
		if (arg2 < Static209.anInt3602) {
			local12 = Static441.aClass351ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass2_Sub1_Sub3_1 != null && local12.aClass2_Sub1_Sub3_1.method8451()) {
				arg0.method8462(local12.aClass2_Sub1_Sub3_1, Static655.anInt10510, true, 0, Static576.aClass132_15, 0);
			}
		}
		if (arg3 < Static209.anInt3602) {
			local12 = Static441.aClass351ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass2_Sub1_Sub3_1 != null && local12.aClass2_Sub1_Sub3_1.method8451()) {
				arg0.method8462(local12.aClass2_Sub1_Sub3_1, 0, true, 0, Static576.aClass132_15, Static655.anInt10510);
			}
		}
		if (arg2 < Static209.anInt3602 && arg3 < Static245.anInt4308) {
			local12 = Static441.aClass351ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass2_Sub1_Sub3_1 != null && local12.aClass2_Sub1_Sub3_1.method8451()) {
				arg0.method8462(local12.aClass2_Sub1_Sub3_1, Static655.anInt10510, true, 0, Static576.aClass132_15, Static655.anInt10510);
			}
		}
		if (arg2 < Static209.anInt3602 && arg3 > 0) {
			local12 = Static441.aClass351ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass2_Sub1_Sub3_1 != null && local12.aClass2_Sub1_Sub3_1.method8451()) {
				arg0.method8462(local12.aClass2_Sub1_Sub3_1, Static655.anInt10510, true, 0, Static576.aClass132_15, -Static655.anInt10510);
			}
		}
	}

	@OriginalMember(owner = "client!gka", name = "c", descriptor = "(Z)V")
	public static void method2687() {
		Static54.anInt1106 = 0;
		@Pc(16) int local16 = Static534.anInt8753 + (Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10006 >> 9);
		@Pc(23) int local23 = (Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10001 >> 9) + Static234.anInt4239;
		if (local16 >= 3053 && local16 <= 3156 && local23 >= 3056 && local23 <= 3136) {
			Static54.anInt1106 = 1;
		}
		if (local16 >= 3072 && local16 <= 3118 && local23 >= 9492 && local23 <= 9535) {
			Static54.anInt1106 = 1;
		}
		if (Static54.anInt1106 == 1 && local16 >= 3139 && local16 <= 3199 && local23 >= 3008 && local23 <= 3062) {
			Static54.anInt1106 = 0;
		}
	}
}
