import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static576 {

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "Lclient!rs;")
	public static Class17 aClass17_4;

	@OriginalMember(owner = "client!wa", name = "q", descriptor = "[[B")
	public static byte[][] aByteArrayArray24;

	@OriginalMember(owner = "client!wa", name = "m", descriptor = "[I")
	public static final int[] anIntArray608 = new int[1000];

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIII)V")
	public static void method7468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 < 0 || arg2 < 0 || Static281.anInt4822 - 1 <= arg5 || arg2 >= Static29.anInt491 - 1) {
			return;
		}
		if (Static469.aClass228ArrayArrayArray6 == null) {
			return;
		}
		@Pc(44) Interface14 local44;
		if (arg3 != 0) {
			if (arg3 == 1) {
				local44 = (Interface14) Static552.method7232(arg0, arg5, arg2);
				if (local44 != null) {
					if (!(local44 instanceof Class12_Sub2_Sub4_Sub1)) {
						@Pc(53) int local53 = local44.method7094();
						if (arg6 != 4 && arg6 != 5) {
							if (arg6 != 6) {
								if (arg6 == 7) {
									Static363.method5137(arg2, 4, (arg1 + 2 & 0x3) + 4, arg4, local53, arg3, arg5, arg0);
								} else if (arg6 == 8) {
									Static363.method5137(arg2, 4, arg1 + 4, arg4, local53, arg3, arg5, arg0);
									Static363.method5137(arg2, 4, (arg1 + 2 & 0x3) + 4, arg4, local53, arg3, arg5, arg0);
									return;
								}
								return;
							}
							Static363.method5137(arg2, 4, arg1 + 4, arg4, local53, arg3, arg5, arg0);
							return;
						}
						Static363.method5137(arg2, 4, arg1, arg4, local53, arg3, arg5, arg0);
						return;
					}
					((Class12_Sub2_Sub4_Sub1) local44).aClass244_1.method5153(arg4);
					return;
				}
				return;
			}
			if (arg3 != 2) {
				if (arg3 == 3) {
					local44 = (Interface14) Static347.method5019(arg0, arg5, arg2);
					if (local44 != null) {
						if (!(local44 instanceof Class12_Sub2_Sub2_Sub2)) {
							Static363.method5137(arg2, arg6, arg1, arg4, local44.method7094(), arg3, arg5, arg0);
							return;
						}
						((Class12_Sub2_Sub2_Sub2) local44).aClass244_2.method5153(arg4);
						return;
					}
				}
				return;
			}
			local44 = (Interface14) Static32.method551(arg0, arg5, arg2, je.class);
			if (local44 != null) {
				if (arg6 == 11) {
					arg6 = 10;
				}
				if (!(local44 instanceof Class12_Sub2_Sub1_Sub2)) {
					Static363.method5137(arg2, arg6, arg1, arg4, local44.method7094(), arg3, arg5, arg0);
					return;
				}
				((Class12_Sub2_Sub1_Sub2) local44).aClass244_3.method5153(arg4);
				return;
			}
			return;
		}
		local44 = (Interface14) Static389.method5373(arg0, arg5, arg2);
		@Pc(242) Interface14 local242 = (Interface14) Static371.method5205(arg0, arg5, arg2);
		if (local44 != null && arg6 != 2) {
			if (local44 instanceof Class12_Sub2_Sub5_Sub1) {
				((Class12_Sub2_Sub5_Sub1) local44).aClass244_4.method5153(arg4);
			} else {
				Static363.method5137(arg2, arg6, arg1, arg4, local44.method7094(), arg3, arg5, arg0);
			}
		}
		if (local242 == null) {
			return;
		}
		if (!(local242 instanceof Class12_Sub2_Sub5_Sub1)) {
			Static363.method5137(arg2, arg6, arg1, arg4, local242.method7094(), arg3, arg5, arg0);
			return;
		}
		((Class12_Sub2_Sub5_Sub1) local242).aClass244_4.method5153(arg4);
		return;
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)V")
	public static void method7470() {
		@Pc(7) int local7 = Static84.anInt9548;
		@Pc(9) int[] local9 = Static520.anIntArray555;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class12_Sub2_Sub1_Sub4_Sub1 local19 = Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local9[local11]];
			if (local19 != null && local19.anInt8391 > 0) {
				local19.anInt8391--;
				if (local19.anInt8391 == 0) {
					local19.aString126 = null;
				}
			}
		}
		for (@Pc(49) int local49 = 0; local49 < Static365.anInt6148; local49++) {
			@Pc(56) long local56 = (long) Static461.anIntArray562[local49];
			@Pc(62) Class2_Sub5 local62 = (Class2_Sub5) Static436.aClass90_26.method1685(local56);
			if (local62 != null) {
				@Pc(67) Class12_Sub2_Sub1_Sub4_Sub2 local67 = local62.aClass12_Sub2_Sub1_Sub4_Sub2_1;
				if (local67.anInt8391 > 0) {
					local67.anInt8391--;
					if (local67.anInt8391 == 0) {
						local67.aString126 = null;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZBLclient!ps;)V")
	public static void method7471(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class273 arg1) {
		@Pc(17) int local17 = arg1.anInt6857 == 0 ? arg1.anInt6883 : arg1.anInt6857;
		@Pc(29) int local29 = arg1.anInt6835 == 0 ? arg1.anInt6814 : arg1.anInt6835;
		Static123.method1656(arg1.anInt6810, Static509.aClass273ArrayArray2[arg1.anInt6810 >> 16], local17, local29, arg0);
		if (arg1.aClass273Array2 != null) {
			Static123.method1656(arg1.anInt6810, arg1.aClass273Array2, local17, local29, arg0);
		}
		@Pc(62) Class2_Sub33 local62 = (Class2_Sub33) Static346.aClass90_17.method1685((long) arg1.anInt6810);
		if (local62 != null) {
			Static580.method7356(local17, local62.anInt5981, arg0, local29);
		}
	}
}
