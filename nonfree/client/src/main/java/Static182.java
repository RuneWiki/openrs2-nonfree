import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "Lclient!lc;")
	public static Class98 aClass98_103;

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString120 = "skill: ";

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "J")
	public static long aLong132 = 0L;

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "Z")
	public static boolean aBoolean234 = true;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "([JZ[Ljava/lang/Object;II)V")
	public static void method2848(@OriginalArg(0) long[] arg0, @OriginalArg(2) Object[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg2) {
			return;
		}
		@Pc(19) int local19 = arg2;
		@Pc(25) int local25 = (arg3 + arg2) / 2;
		@Pc(29) long local29 = arg0[local25];
		arg0[local25] = arg0[arg3];
		arg0[arg3] = local29;
		@Pc(43) Object local43 = arg1[local25];
		arg1[local25] = arg1[arg3];
		arg1[arg3] = local43;
		for (@Pc(55) int local55 = arg2; local55 < arg3; local55++) {
			if (arg0[local55] < local29 + (long) (local55 & 0x1)) {
				@Pc(79) long local79 = arg0[local55];
				arg0[local55] = arg0[local19];
				arg0[local19] = local79;
				@Pc(93) Object local93 = arg1[local55];
				arg1[local55] = arg1[local19];
				arg1[local19++] = local93;
			}
		}
		arg0[arg3] = arg0[local19];
		arg0[local19] = local29;
		arg1[arg3] = arg1[local19];
		arg1[local19] = local43;
		method2848(arg0, arg1, arg2, local19 - 1);
		method2848(arg0, arg1, local19 + 1, arg3);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V")
	public static void method2849() {
		if (!Static62.method957() && Static168.anInt3342 != Static210.anInt4103) {
			Static121.method2054(Static210.anInt4103, Static239.aClass12_Sub3_Sub2_2.anIntArray376[0], false, Static25.anInt450, Static257.anInt4842, Static239.aClass12_Sub3_Sub2_2.anIntArray379[0], false);
		} else if (Static103.anInt2191 != Static210.anInt4103 && Static280.method4229(Static210.anInt4103)) {
			Static103.anInt2191 = Static210.anInt4103;
			Static265.method3980();
		}
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)V")
	public static void method2850() {
		aString120 = null;
		aClass98_103 = null;
	}
}
