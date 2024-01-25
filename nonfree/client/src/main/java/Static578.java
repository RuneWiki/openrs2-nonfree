import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static578 {

	@OriginalMember(owner = "client!wfa", name = "D", descriptor = "[[Lclient!vg;")
	public static Class341[][] aClass341ArrayArray2;

	@OriginalMember(owner = "client!wfa", name = "F", descriptor = "I")
	public static int anInt9523 = 0;

	@OriginalMember(owner = "client!wfa", name = "G", descriptor = "[J")
	public static final long[] aLongArray27 = new long[100];

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IILclient!qaa;)V")
	public static void method7765(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub35_Sub2 arg1) {
		Static172.anInt3031 = 0;
		Static301.aBoolean418 = false;
		Static136.method2086(arg1);
		Static179.method7291(arg1);
		if (Static301.aBoolean418) {
			System.out.println("---endgpp---");
		}
		if (arg1.anInt7214 != arg0) {
			throw new RuntimeException("gpi1 pos:" + arg1.anInt7214 + " psize:" + arg0);
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IIIIIIII)V")
	public static void method7766(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < 0 || arg4 < 0 || Static71.anInt1410 - 1 <= arg1 || Static471.anInt8012 - 1 <= arg4) {
			return;
		}
		if (Static292.aClass39ArrayArrayArray2 == null) {
			return;
		}
		@Pc(44) Interface19 local44;
		if (arg2 == 0) {
			local44 = (Interface19) Static82.method1473(arg3, arg1, arg4);
			@Pc(50) Interface19 local50 = (Interface19) Static511.method7108(arg3, arg1, arg4);
			if (local44 != null && arg0 != 2) {
				if (local44 instanceof Class8_Sub3_Sub4_Sub1) {
					((Class8_Sub3_Sub4_Sub1) local44).aClass191_3.method3846(arg5);
				} else {
					Static484.method6553(arg4, arg0, arg3, arg5, arg1, local44.method7640(), arg2, arg6);
				}
			}
			if (local50 != null) {
				if (!(local50 instanceof Class8_Sub3_Sub4_Sub1)) {
					Static484.method6553(arg4, arg0, arg3, arg5, arg1, local50.method7640(), arg2, arg6);
					return;
				}
				((Class8_Sub3_Sub4_Sub1) local50).aClass191_3.method3846(arg5);
				return;
			}
			return;
		}
		if (arg2 == 1) {
			local44 = (Interface19) Static29.method345(arg3, arg1, arg4);
			if (local44 != null) {
				if (local44 instanceof Class8_Sub3_Sub2_Sub1) {
					((Class8_Sub3_Sub2_Sub1) local44).aClass191_1.method3846(arg5);
					return;
				}
				@Pc(123) int local123 = local44.method7640();
				if (arg0 == 4 || arg0 == 5) {
					Static484.method6553(arg4, 4, arg3, arg5, arg1, local123, arg2, arg6);
				} else if (arg0 == 6) {
					Static484.method6553(arg4, 4, arg3, arg5, arg1, local123, arg2, arg6 + 4);
					return;
				} else if (arg0 == 7) {
					Static484.method6553(arg4, 4, arg3, arg5, arg1, local123, arg2, (arg6 + 2 & 0x3) + 4);
					return;
				} else if (arg0 == 8) {
					Static484.method6553(arg4, 4, arg3, arg5, arg1, local123, arg2, arg6 + 4);
					Static484.method6553(arg4, 4, arg3, arg5, arg1, local123, arg2, (arg6 + 2 & 0x3) + 4);
					return;
				}
				return;
			}
			return;
		}
		if (arg2 != 2) {
			if (arg2 == 3) {
				local44 = (Interface19) Static308.method4292(arg3, arg1, arg4);
				if (local44 != null) {
					if (!(local44 instanceof Class8_Sub3_Sub1_Sub2)) {
						Static484.method6553(arg4, arg0, arg3, arg5, arg1, local44.method7640(), arg2, arg6);
						return;
					}
					((Class8_Sub3_Sub1_Sub2) local44).aClass191_2.method3846(arg5);
					return;
				}
			}
			return;
		}
		local44 = (Interface19) Static14.method147(arg3, arg1, arg4, rda.class);
		if (local44 == null) {
			return;
		}
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (local44 instanceof Class8_Sub3_Sub3_Sub5) {
			((Class8_Sub3_Sub3_Sub5) local44).aClass191_4.method3846(arg5);
			return;
		}
		Static484.method6553(arg4, arg0, arg3, arg5, arg1, local44.method7640(), arg2, arg6);
		return;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(III[BI[BIII)V")
	public static void method7767(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(15) int local15 = -(arg6 >> 2);
		@Pc(20) int local20 = -(arg6 & 0x3);
		for (@Pc(23) int local23 = -arg3; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local15; local27 < 0; local27++) {
				local31 = arg7++;
				arg2[local31] = (byte) (arg2[local31] - arg4[arg0++]);
				@Pc(44) int local44 = arg7++;
				arg2[local44] = (byte) (arg2[local44] - arg4[arg0++]);
				@Pc(57) int local57 = arg7++;
				arg2[local57] = (byte) (arg2[local57] - arg4[arg0++]);
				@Pc(70) int local70 = arg7++;
				arg2[local70] = (byte) (arg2[local70] - arg4[arg0++]);
			}
			for (@Pc(89) int local89 = local20; local89 < 0; local89++) {
				local31 = arg7++;
				arg2[local31] = (byte) (arg2[local31] - arg4[arg0++]);
			}
			arg0 += arg1;
			arg7 += arg5;
		}
	}
}
