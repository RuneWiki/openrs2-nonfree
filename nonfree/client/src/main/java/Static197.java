import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "[Lclient!rg;")
	public static final Class160_Sub1[] aClass160_Sub1Array2 = new Class160_Sub1[35];

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILclient!ej;IIIB)V")
	public static void method3548(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub16 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1.anInt2207 == -1 && arg1.anIntArray167 == null) {
			return;
		}
		@Pc(16) int local16 = 0;
		@Pc(24) int local24 = Static140.aClass6_Sub48_Sub1_1.anInt9004 * arg1.anInt2214 >> 8;
		if (arg1.anInt2212 < arg2) {
			local16 = arg2 - arg1.anInt2212;
		} else if (arg1.anInt2206 > arg2) {
			local16 = arg1.anInt2206 - arg2;
		}
		if (arg1.anInt2211 < arg0) {
			local16 += arg0 - arg1.anInt2211;
		} else if (arg0 < arg1.anInt2213) {
			local16 += arg1.anInt2213 - arg0;
		}
		if (arg1.anInt2208 == 0 || arg1.anInt2208 < local16 - 256 || Static140.aClass6_Sub48_Sub1_1.anInt9004 == 0 || arg1.anInt2202 != arg3) {
			if (arg1.aClass6_Sub18_Sub1_3 != null) {
				Static374.aClass6_Sub18_Sub4_2.method6380(arg1.aClass6_Sub18_Sub1_3);
				arg1.aClass6_Sub19_Sub1_2 = null;
				arg1.aClass6_Sub18_Sub1_3 = null;
				arg1.aClass6_Sub22_2 = null;
			}
			if (arg1.aClass6_Sub18_Sub1_2 != null) {
				Static374.aClass6_Sub18_Sub4_2.method6380(arg1.aClass6_Sub18_Sub1_2);
				arg1.aClass6_Sub19_Sub1_3 = null;
				arg1.aClass6_Sub22_3 = null;
				arg1.aClass6_Sub18_Sub1_2 = null;
			}
			return;
		}
		local16 -= 256;
		if (local16 < 0) {
			local16 = 0;
		}
		@Pc(152) int local152 = local24 * (arg1.anInt2208 - local16) / arg1.anInt2208;
		@Pc(202) Class6_Sub18_Sub1 local202;
		if (arg1.aClass6_Sub18_Sub1_3 != null) {
			arg1.aClass6_Sub18_Sub1_3.method2697(local152);
		} else if (arg1.anInt2207 >= 0) {
			if (arg1.aBoolean152) {
				if (arg1.aClass6_Sub22_2 == null) {
					arg1.aClass6_Sub22_2 = Static191.method3466(Static423.aClass251_97, arg1.anInt2207);
				}
				if (arg1.aClass6_Sub22_2 != null) {
					if (arg1.aClass6_Sub19_Sub1_2 == null) {
						arg1.aClass6_Sub19_Sub1_2 = arg1.aClass6_Sub22_2.method3458(new int[] { 22050 });
					}
					if (arg1.aClass6_Sub19_Sub1_2 != null) {
						local202 = Static600.method2687(arg1.aClass6_Sub19_Sub1_2, local152);
						local202.method2685(-1);
						Static374.aClass6_Sub18_Sub4_2.method6378(local202);
						arg1.aClass6_Sub18_Sub1_3 = local202;
					}
				}
			} else {
				@Pc(219) Class141 local219 = Static605.method3635(Static58.aClass251_18, arg1.anInt2207, 0);
				if (local219 != null) {
					@Pc(226) Class6_Sub19_Sub1 local226 = local219.method3637().method2832(Static23.aClass250_5);
					@Pc(231) Class6_Sub18_Sub1 local231 = Static600.method2687(local226, local152);
					local231.method2685(-1);
					Static374.aClass6_Sub18_Sub4_2.method6378(local231);
					arg1.aClass6_Sub18_Sub1_3 = local231;
				}
			}
		}
		if (arg1.aClass6_Sub18_Sub1_2 != null) {
			arg1.aClass6_Sub18_Sub1_2.method2697(local152);
			if (!arg1.aClass6_Sub18_Sub1_2.method7803()) {
				arg1.aClass6_Sub19_Sub1_3 = null;
				arg1.aClass6_Sub18_Sub1_2 = null;
				arg1.aClass6_Sub22_3 = null;
			}
		} else if (arg1.anIntArray167 != null && (arg1.anInt2215 -= arg4) <= 0) {
			@Pc(290) int local290;
			if (arg1.aBoolean153) {
				if (arg1.aClass6_Sub22_3 == null) {
					local290 = (int) ((double) arg1.anIntArray167.length * Math.random());
					arg1.aClass6_Sub22_3 = Static191.method3466(Static423.aClass251_97, arg1.anIntArray167[local290]);
				}
				if (arg1.aClass6_Sub22_3 != null) {
					if (arg1.aClass6_Sub19_Sub1_3 == null) {
						arg1.aClass6_Sub19_Sub1_3 = arg1.aClass6_Sub22_3.method3458(new int[] { 22050 });
					}
					if (arg1.aClass6_Sub19_Sub1_3 != null) {
						local202 = Static600.method2687(arg1.aClass6_Sub19_Sub1_3, local152);
						local202.method2685(0);
						Static374.aClass6_Sub18_Sub4_2.method6378(local202);
						arg1.anInt2215 = arg1.anInt2201 + (int) (Math.random() * (double) (arg1.anInt2209 - arg1.anInt2201));
						arg1.aClass6_Sub18_Sub1_2 = local202;
						return;
					}
				}
				return;
			}
			local290 = (int) (Math.random() * (double) arg1.anIntArray167.length);
			@Pc(365) Class141 local365 = Static605.method3635(Static58.aClass251_18, arg1.anIntArray167[local290], 0);
			if (local365 != null) {
				@Pc(372) Class6_Sub19_Sub1 local372 = local365.method3637().method2832(Static23.aClass250_5);
				@Pc(377) Class6_Sub18_Sub1 local377 = Static600.method2687(local372, local152);
				local377.method2685(0);
				Static374.aClass6_Sub18_Sub4_2.method6378(local377);
				arg1.anInt2215 = arg1.anInt2201 + (int) ((double) (arg1.anInt2209 - arg1.anInt2201) * Math.random());
				arg1.aClass6_Sub18_Sub1_2 = local377;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)V")
	public static void method3549() {
		if (Static384.anInt6751 == 6) {
			Static384.anInt6751 = 7;
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!kda;FIFIIFFZFI)[B")
	public static byte[] method3550(@OriginalArg(0) Class84 arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(6) float arg3, @OriginalArg(7) float arg4, @OriginalArg(9) float arg5) {
		@Pc(10) byte[] local10 = new byte[262144];
		Static301.method4764(arg4, arg5, arg2, local10, arg3, 0, arg0, arg1);
		return local10;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)V")
	public static void method3551() {
		if (Static180.anInt3755 != -1) {
			Static133.method2600(false, Static180.anInt3755, -1, -1);
			Static180.anInt3755 = -1;
		}
	}
}
