import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!oi", name = "m", descriptor = "Lclient!ep;")
	public static Class93 aClass93_12 = null;

	@OriginalMember(owner = "client!oi", name = "w", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_78 = new Class181(30, 1);

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIIBII)V")
	public static void method5915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static501.method4264(arg4, Static289.anInt5545, Static96.anInt2302);
		@Pc(17) int local17 = Static501.method4264(arg1, Static289.anInt5545, Static96.anInt2302);
		@Pc(23) int local23 = Static501.method4264(arg5, Class179_Sub2.lb, Static376.anInt7071);
		@Pc(29) int local29 = Static501.method4264(arg2, Class179_Sub2.lb, Static376.anInt7071);
		@Pc(37) int local37 = Static501.method4264(arg3 + arg4, Static289.anInt5545, Static96.anInt2302);
		@Pc(46) int local46 = Static501.method4264(arg1 - arg3, Static289.anInt5545, Static96.anInt2302);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static115.method2332(local23, local29, arg0, Static183.anIntArrayArray26[local48]);
		}
		for (@Pc(70) int local70 = local17; local70 > local46; local70--) {
			Static115.method2332(local23, local29, arg0, Static183.anIntArrayArray26[local70]);
		}
		@Pc(97) int local97 = Static501.method4264(arg5 + arg3, Class179_Sub2.lb, Static376.anInt7071);
		@Pc(106) int local106 = Static501.method4264(arg2 - arg3, Class179_Sub2.lb, Static376.anInt7071);
		for (@Pc(115) int local115 = local37; local115 <= local46; local115++) {
			@Pc(121) int[] local121 = Static183.anIntArrayArray26[local115];
			Static115.method2332(local23, local97, arg0, local121);
			Static115.method2332(local106, local29, arg0, local121);
		}
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(III)V")
	public static void method5916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static256.aClass224ArrayArrayArray1[0][arg1][arg2] != null && Static256.aClass224ArrayArrayArray1[0][arg1][arg2].aClass224_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static256.aClass224ArrayArrayArray1[local22][arg1][arg2] == null) {
				@Pc(46) Class224 local46 = Static256.aClass224ArrayArrayArray1[local22][arg1][arg2] = new Class224(local22, arg1, arg2);
				if (local20) {
					local46.aByte69++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "(I)V")
	public static void method5917() {
		Static406.aClass245_73.method6079();
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!vp;III)V")
	public static void method5918(@OriginalArg(0) Class288 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long local7 = Static447.aLongArrayArrayArray1[arg1][arg2][arg3];
		@Pc(9) long local9 = 0L;
		arg0.anInt8651 = 0;
		@Pc(21) int local21;
		while (local9 <= 48L) {
			local21 = (int) (local7 >> (int) local9 & 0xFFFFL);
			if (local21 <= 0) {
				break;
			}
			arg0.aClass6_Sub29Array6[arg0.anInt8651++] = Static470.aClass342Array1[local21 - 1].aClass6_Sub29_2;
			local9 += 16L;
		}
		for (local21 = arg0.anInt8651; local21 < 4; local21++) {
			arg0.aClass6_Sub29Array6[local21] = null;
		}
	}
}
