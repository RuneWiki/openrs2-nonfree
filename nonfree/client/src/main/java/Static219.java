import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!hq", name = "p", descriptor = "I")
	public static int anInt4548 = 0;

	@OriginalMember(owner = "client!hq", name = "v", descriptor = "Lclient!nga;")
	public static final Class233 aClass233_24 = new Class233(4);

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IZ)V")
	public static void method3758(@OriginalArg(1) boolean arg0) {
		for (@Pc(8) Class2_Sub31 local8 = (Class2_Sub31) Static228.aClass238_26.method5833(); local8 != null; local8 = (Class2_Sub31) Static228.aClass238_26.method5838()) {
			if (local8.aClass2_Sub2_Sub5_3 != null) {
				Static1.aClass2_Sub2_Sub2_6.method1042(local8.aClass2_Sub2_Sub5_3);
				local8.aClass2_Sub2_Sub5_3 = null;
			}
			if (local8.aClass2_Sub2_Sub5_2 != null) {
				Static1.aClass2_Sub2_Sub2_6.method1042(local8.aClass2_Sub2_Sub5_2);
				local8.aClass2_Sub2_Sub5_2 = null;
			}
			local8.method8599();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(54) Class2_Sub31 local54 = (Class2_Sub31) Static124.aClass238_22.method5833(); local54 != null; local54 = (Class2_Sub31) Static124.aClass238_22.method5838()) {
			if (local54.aClass2_Sub2_Sub5_3 != null) {
				Static1.aClass2_Sub2_Sub2_6.method1042(local54.aClass2_Sub2_Sub5_3);
				local54.aClass2_Sub2_Sub5_3 = null;
			}
			local54.method8599();
		}
		for (@Pc(80) Class2_Sub31 local80 = (Class2_Sub31) Static634.aClass222_44.method5474(); local80 != null; local80 = (Class2_Sub31) Static634.aClass222_44.method5472()) {
			if (local80.aClass2_Sub2_Sub5_3 != null) {
				Static1.aClass2_Sub2_Sub2_6.method1042(local80.aClass2_Sub2_Sub5_3);
				local80.aClass2_Sub2_Sub5_3 = null;
			}
			local80.method8599();
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)Lclient!gba;")
	public static Class125 method3760(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			if ((double) Static292.aFloat211 == 3.0D) {
				return Static248.aClass125_8;
			}
			if ((double) Static292.aFloat211 == 4.0D) {
				return Static490.aClass125_11;
			}
			if ((double) Static292.aFloat211 == 6.0D) {
				return Static97.aClass125_5;
			}
			if ((double) Static292.aFloat211 >= 8.0D) {
				return Static514.aClass125_13;
			}
		} else if (arg0 == 1) {
			if ((double) Static292.aFloat211 == 3.0D) {
				return Static97.aClass125_5;
			}
			if ((double) Static292.aFloat211 == 4.0D) {
				return Static514.aClass125_13;
			}
			if ((double) Static292.aFloat211 == 6.0D) {
				return Static309.aClass125_9;
			}
			if ((double) Static292.aFloat211 >= 8.0D) {
				return Static25.aClass125_3;
			}
		} else if (arg0 == 2) {
			if ((double) Static292.aFloat211 == 3.0D) {
				return Static309.aClass125_9;
			}
			if ((double) Static292.aFloat211 == 4.0D) {
				return Static25.aClass125_3;
			}
			if ((double) Static292.aFloat211 == 6.0D) {
				return Static370.aClass125_10;
			}
			if ((double) Static292.aFloat211 >= 8.0D) {
				return Static38.aClass125_4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(B[ILclient!fca;[I[I)V")
	public static void method3762(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class11_Sub1_Sub1_Sub2_Sub2 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg3.length; local3++) {
			@Pc(9) int local9 = arg3[local3];
			@Pc(13) int local13 = arg2[local3];
			@Pc(17) int local17 = arg0[local3];
			@Pc(19) int local19 = 0;
			while (local13 != 0 && arg1.aClass203Array3.length > local19) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg1.aClass203Array3[local19] = null;
					} else {
						@Pc(34) Class149 local34 = Static185.aClass303_1.method7201(local9);
						@Pc(37) int local37 = local34.anInt4516;
						@Pc(42) Class203 local42 = arg1.aClass203Array3[local19];
						if (local42 != null) {
							if (local42.anInt5798 == local9) {
								if (local37 == 0) {
									local42 = arg1.aClass203Array3[local19] = null;
								} else if (local37 == 1) {
									local42.anInt5805 = 1;
									local42.anInt5796 = 0;
									local42.anInt5797 = local17;
									local42.anInt5799 = 0;
									local42.anInt5801 = 0;
									if (!arg1.aBoolean276) {
										Static330.method3630(0, local34, arg1);
									}
								} else if (local37 == 2) {
									local42.anInt5799 = 0;
								}
							} else if (local34.anInt4518 >= Static185.aClass303_1.method7201(local42.anInt5798).anInt4518) {
								local42 = arg1.aClass203Array3[local19] = null;
							}
						}
						if (local42 == null) {
							local42 = arg1.aClass203Array3[local19] = new Class203();
							local42.anInt5799 = 0;
							local42.anInt5796 = 0;
							local42.anInt5805 = 1;
							local42.anInt5801 = 0;
							local42.anInt5797 = local17;
							local42.anInt5798 = local9;
							if (!arg1.aBoolean276) {
								Static330.method3630(0, local34, arg1);
							}
						}
					}
				}
				local19++;
				local13 >>>= 0x1;
			}
		}
	}
}
