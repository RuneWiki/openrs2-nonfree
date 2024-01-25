import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!qn", name = "p", descriptor = "[I")
	public static final int[] anIntArray460 = new int[3];

	@OriginalMember(owner = "client!qn", name = "s", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_1 = new Class15(14, 1);

	@OriginalMember(owner = "client!qn", name = "u", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_2 = new Class15(15, 4);

	@OriginalMember(owner = "client!qn", name = "v", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_3 = new Class15(16, -2);

	@OriginalMember(owner = "client!qn", name = "w", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_4 = new Class15(17, 0);

	@OriginalMember(owner = "client!qn", name = "x", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_5 = new Class15(18, -2);

	@OriginalMember(owner = "client!qn", name = "y", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_6 = new Class15(20, 6);

	@OriginalMember(owner = "client!qn", name = "z", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_7 = new Class15(21, 8);

	@OriginalMember(owner = "client!qn", name = "A", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_8 = new Class15(22, -2);

	@OriginalMember(owner = "client!qn", name = "B", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_9 = new Class15(23, 4);

	@OriginalMember(owner = "client!qn", name = "C", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_10 = new Class15(24, -1);

	@OriginalMember(owner = "client!qn", name = "E", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_193 = new Class62("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIIILclient!il;)V")
	public static void method4765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub4 arg4) {
		@Pc(4) Class188 local4 = Static226.method4116(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		arg4.anInt4395 = (arg1 << Static162.anInt3362) + Static291.anInt5453;
		arg4.anInt4399 = arg3;
		arg4.anInt4396 = (arg2 << Static162.anInt3362) + Static291.anInt5453;
		for (@Pc(28) Class168 local28 = local4.aClass168_2; local28 != null; local28 = local28.aClass168_1) {
			if (local28.aClass1_Sub2_1.aBoolean479) {
				@Pc(38) int local38 = local28.aClass1_Sub2_1.method5894();
				if (local38 != -32768 && local38 < local8) {
					local8 = local38;
				}
			}
		}
		if (local8 < 0) {
			arg4.anInt4399 += local8;
			arg4.aBoolean314 = true;
		}
		local4.aClass1_Sub4_1 = arg4;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method4766(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 < 1 || arg1 < 1 || Static89.anInt1891 - 2 < arg4 || Static85.anInt1839 - 2 < arg1) {
			return;
		}
		if (!Static40.method575() && !Static310.method5037(arg1, arg4, arg2, Static73.anInt1627)) {
			return;
		}
		if (Static45.aClass188ArrayArrayArray5 == null) {
			return;
		}
		Static57.aClass133_Sub1_2.method3473(arg5, Static165.aClass178Array1[arg2], arg2, arg1, Static383.aClass48_9, arg4);
		if (arg3 < 0) {
			return;
		}
		@Pc(50) boolean local50 = Static72.aBoolean125;
		Static72.aBoolean125 = true;
		@Pc(54) int local54 = arg2;
		if (arg2 < 3 && Static155.method2770(arg4, arg1)) {
			local54 = arg2 + 1;
		}
		Static57.aClass133_Sub1_2.method3479(arg3, arg6, arg4, Static383.aClass48_9, local54, arg1, arg0, arg2, arg7, Static165.aClass178Array1[arg2]);
		Static72.aBoolean125 = local50;
		return;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(II[SB[Ljava/lang/String;)V")
	public static void method4767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short[] arg2, @OriginalArg(4) String[] arg3) {
		if (arg0 <= arg1) {
			return;
		}
		@Pc(23) int local23 = (arg0 + arg1) / 2;
		@Pc(25) int local25 = arg1;
		@Pc(29) String local29 = arg3[local23];
		arg3[local23] = arg3[arg0];
		arg3[arg0] = local29;
		@Pc(43) short local43 = arg2[local23];
		arg2[local23] = arg2[arg0];
		arg2[arg0] = local43;
		for (@Pc(55) int local55 = arg1; local55 < arg0; local55++) {
			if (local29 == null || arg3[local55] != null && arg3[local55].compareTo(local29) < (local55 & 0x1)) {
				@Pc(76) String local76 = arg3[local55];
				arg3[local55] = arg3[local25];
				arg3[local25] = local76;
				@Pc(90) short local90 = arg2[local55];
				arg2[local55] = arg2[local25];
				arg2[local25++] = local90;
			}
		}
		arg3[arg0] = arg3[local25];
		arg3[local25] = local29;
		arg2[arg0] = arg2[local25];
		arg2[local25] = local43;
		method4767(local25 - 1, arg1, arg2, arg3);
		method4767(arg0, local25 + 1, arg2, arg3);
	}
}
