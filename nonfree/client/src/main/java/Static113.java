import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!fp", name = "o", descriptor = "I")
	public static int anInt2183;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZI)I")
	public static int method1791(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return local5 + arg0;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "([I[I[ILclient!ps;B)V")
	public static void method1792(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class47_Sub1_Sub5_Sub2 arg3) {
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			@Pc(10) int local10 = arg1[local5];
			@Pc(14) int local14 = arg2[local5];
			@Pc(18) int local18 = arg0[local5];
			@Pc(20) int local20 = 0;
			while (local14 != 0 && arg3.aClass226Array3.length > local20) {
				if ((local14 & 0x1) != 0) {
					if (local10 == -1) {
						arg3.aClass226Array3[local20] = null;
					} else {
						@Pc(37) Class58 local37 = Static322.aClass45_5.method690(local10);
						@Pc(40) int local40 = local37.anInt1436;
						@Pc(45) Class226 local45 = arg3.aClass226Array3[local20];
						if (local45 != null) {
							if (local10 == local45.anInt6841) {
								if (local40 == 0) {
									local45 = arg3.aClass226Array3[local20] = null;
								} else if (local40 == 1) {
									local45.anInt6845 = local18;
									local45.anInt6844 = 0;
									local45.anInt6842 = 0;
									local45.anInt6846 = 1;
									local45.anInt6840 = 0;
									Static385.method5367(arg3.aByte97, arg3.anInt7066, 0, local37, Static255.aClass47_Sub1_Sub5_Sub2_2 == arg3, arg3.anInt7060);
								} else if (local40 == 2) {
									local45.anInt6844 = 0;
								}
							} else if (local37.anInt1426 >= Static322.aClass45_5.method690(local45.anInt6841).anInt1426) {
								local45 = arg3.aClass226Array3[local20] = null;
							}
						}
						if (local45 == null) {
							local45 = arg3.aClass226Array3[local20] = new Class226();
							local45.anInt6841 = local10;
							local45.anInt6846 = 1;
							local45.anInt6844 = 0;
							local45.anInt6840 = 0;
							local45.anInt6845 = local18;
							local45.anInt6842 = 0;
							Static385.method5367(arg3.aByte97, arg3.anInt7066, 0, local37, Static255.aClass47_Sub1_Sub5_Sub2_2 == arg3, arg3.anInt7060);
						}
					}
				}
				local20++;
				local14 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILclient!qf;)I")
	public static int method1793(@OriginalArg(1) Class1_Sub14_Sub2 arg0) {
		@Pc(14) int local14 = arg0.method4557(2);
		@Pc(21) int local21;
		if (local14 == 0) {
			local21 = 0;
		} else if (local14 == 1) {
			local21 = arg0.method4557(5);
		} else if (local14 == 2) {
			local21 = arg0.method4557(8);
		} else {
			local21 = arg0.method4557(11);
		}
		return local21;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIIZ)V")
	public static void method1794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(19) int local19 = arg0 << 3;
		@Pc(23) int local23 = arg1 << 3;
		if (Static57.anInt883 == 2) {
			Static432.anInt7548 = local19;
			Static401.anInt7130 = local23;
			Static423.anInt7380 = 0;
		}
		Static147.aFloat59 = local19;
		Static90.aFloat25 = local23;
		Static412.method5593();
		Static5.aBoolean541 = true;
	}
}
