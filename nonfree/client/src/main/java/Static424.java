import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static424 {

	@OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
	public static int anInt7711;

	@OriginalMember(owner = "client!pc", name = "x", descriptor = "I")
	public static int anInt7715;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
	public static void method6723() {
		@Pc(8) Class3_Sub21 local8 = (Class3_Sub21) Static172.aClass216_29.method5457();
		@Pc(25) boolean local25 = Static429.aClass344_9 != null || Static348.anInt6494 > 0;
		@Pc(29) int local29 = local8.method5064();
		@Pc(33) int local33 = local8.method5060();
		if (local25) {
			Static543.anInt9105 = 1;
		}
		if (local25) {
			Static445.aClass3_Sub7_Sub19_30 = Static165.aClass3_Sub7_Sub19_14;
		} else {
			Static353.method5666(Static165.aClass3_Sub7_Sub19_14, local29, local33);
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)V")
	public static void method6725() {
		if (Static23.anInterface21Array1 == null) {
			return;
		}
		@Pc(13) Interface21[] local13 = Static23.anInterface21Array1;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Interface21 local21 = local13[local15];
			local21.method8190();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZII)Z")
	public static boolean method6726(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 | Static290.method4742(arg1, arg0) || Static505.method7347(arg1, arg0);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I[I[ILclient!cea;[I)V")
	public static void method6727(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class9_Sub2_Sub1_Sub2_Sub1 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) int local9 = arg1[local3];
			@Pc(13) int local13 = arg0[local3];
			@Pc(17) int local17 = arg3[local3];
			for (@Pc(19) int local19 = 0; local13 != 0 && local19 < arg2.aClass140Array3.length; local19++) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg2.aClass140Array3[local19] = null;
					} else {
						@Pc(41) Class267 local41 = Static474.aClass264_2.method6574(local9);
						@Pc(44) int local44 = local41.anInt7585;
						@Pc(49) Class140 local49 = arg2.aClass140Array3[local19];
						if (local49 != null) {
							if (local9 == local49.anInt3758) {
								if (local44 == 0) {
									local49 = arg2.aClass140Array3[local19] = null;
								} else if (local44 == 1) {
									local49.anInt3759 = local17;
									local49.anInt3756 = 0;
									local49.anInt3754 = 1;
									local49.anInt3753 = 0;
									local49.anInt3755 = 0;
									if (!arg2.aBoolean772) {
										Static522.method7586(0, arg2, local41);
									}
								} else if (local44 == 2) {
									local49.anInt3753 = 0;
								}
							} else if (local41.anInt7582 >= Static474.aClass264_2.method6574(local49.anInt3758).anInt7582) {
								local49 = arg2.aClass140Array3[local19] = null;
							}
						}
						if (local49 == null) {
							local49 = arg2.aClass140Array3[local19] = new Class140();
							local49.anInt3755 = 0;
							local49.anInt3753 = 0;
							local49.anInt3756 = 0;
							local49.anInt3754 = 1;
							local49.anInt3759 = local17;
							local49.anInt3758 = local9;
							if (!arg2.aBoolean772) {
								Static522.method7586(0, arg2, local41);
							}
						}
					}
				}
				local13 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIBI)V")
	public static void method6728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class3_Sub7_Sub5 local8 = Static138.method2377(10, arg2);
		local8.method1474();
		local8.anInt1728 = arg0;
		local8.anInt1723 = arg3;
		local8.anInt1720 = arg1;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB)V")
	public static void method6729(@OriginalArg(0) int arg0) {
		@Pc(12) Class3_Sub7_Sub5 local12 = Static138.method2377(6, arg0);
		local12.method1473();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!ida;I)Ljava/lang/String;")
	public static String method6731(@OriginalArg(0) Class3_Sub7_Sub13 arg0) {
		return arg0.aString35 + " <col=ffffff>>";
	}
}
