import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!ll", name = "s", descriptor = "I")
	public static int anInt5136 = 0;

	@OriginalMember(owner = "client!ll", name = "t", descriptor = "I")
	public static final int anInt5137 = 4;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!qa;Lclient!se;IIIII)V")
	public static void method4413(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static323.anInt6015) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static515.anInt3809) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static315.anInt5693 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class262 local62 = Static399.aClass262ArrayArrayArray2[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static532.aClass75Array3[local17].ba(local23, local32) + Static532.aClass75Array3[local17].ba(local23 + 1, local32) + Static532.aClass75Array3[local17].ba(local23, local32 + 1) + Static532.aClass75Array3[local17].ba(local23 + 1, local32 + 1)) / 4 - (Static532.aClass75Array3[arg2].ba(arg3, arg4) + Static532.aClass75Array3[arg2].ba(arg3 + 1, arg4) + Static532.aClass75Array3[arg2].ba(arg3, arg4 + 1) + Static532.aClass75Array3[arg2].ba(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class1_Sub2 local143 = local62.aClass1_Sub2_3;
									@Pc(146) Class1_Sub2 local146 = local62.aClass1_Sub2_2;
									if (local143 != null && local143.method7671()) {
										arg1.method7672((local32 - arg4) * Static136.anInt2574 + (1 - arg6) * Static392.anInt7455, arg0, local140, local1, local143, (local23 - arg3) * Static136.anInt2574 + (1 - arg5) * Static392.anInt7455);
									}
									if (local146 != null && local146.method7671()) {
										arg1.method7672((local32 - arg4) * Static136.anInt2574 + (1 - arg6) * Static392.anInt7455, arg0, local140, local1, local146, (local23 - arg3) * Static136.anInt2574 + (1 - arg5) * Static392.anInt7455);
									}
									for (@Pc(219) Class187 local219 = local62.aClass187_3; local219 != null; local219 = local219.aClass187_1) {
										@Pc(223) Class1_Sub1 local223 = local219.aClass1_Sub1_1;
										if (local223 != null && local223.method7671() && (local23 == local223.aShort127 || local23 == local3) && (local32 == local223.aShort128 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort125 + 1 - local223.aShort127;
											@Pc(260) int local260 = local223.aShort126 + 1 - local223.aShort128;
											arg1.method7672((local223.aShort128 - arg4) * Static136.anInt2574 + (local260 - arg6) * Static392.anInt7455, arg0, local140, local1, local223, (local223.aShort127 - arg3) * Static136.anInt2574 + (local252 - arg5) * Static392.anInt7455);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZZ)V")
	public static void method4414() {
		Static93.method1721(Static259.aClass243_29);
		for (@Pc(21) Class2_Sub9 local21 = (Class2_Sub9) Static110.aClass127_21.method3203(); local21 != null; local21 = (Class2_Sub9) Static110.aClass127_21.method3212()) {
			if (!local21.method7799()) {
				local21 = (Class2_Sub9) Static110.aClass127_21.method3203();
				if (local21 == null) {
					break;
				}
			}
			if (local21.anInt832 == 0) {
				Static368.method5870(true, local21, true);
			}
		}
		if (Static126.aClass310_16 != null) {
			Static273.method4342(Static126.aClass310_16);
			Static126.aClass310_16 = null;
		}
	}
}
