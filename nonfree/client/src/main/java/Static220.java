import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!ld", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString37;

	@OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
	public static int anInt4212;

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_100 = new Class81(78, 3);

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
	public static int anInt4206 = 0;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIB)V")
	public static void method3386(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static367.aByteArrayArrayArray16 = new byte[4][arg0][arg1];
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!qa;Lclient!eq;IIIII)V")
	public static void method3392(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static58.anInt1578) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static86.anInt2009) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static360.anInt6340 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class113 local62 = Static176.aClass113ArrayArrayArray3[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static372.aClass106Array11[local17].I(local23, local32) + Static372.aClass106Array11[local17].I(local23 + 1, local32) + Static372.aClass106Array11[local17].I(local23, local32 + 1) + Static372.aClass106Array11[local17].I(local23 + 1, local32 + 1)) / 4 - (Static372.aClass106Array11[arg2].I(arg3, arg4) + Static372.aClass106Array11[arg2].I(arg3 + 1, arg4) + Static372.aClass106Array11[arg2].I(arg3, arg4 + 1) + Static372.aClass106Array11[arg2].I(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class4_Sub4 local143 = local62.aClass4_Sub4_2;
									@Pc(146) Class4_Sub4 local146 = local62.aClass4_Sub4_1;
									if (local143 != null && local143.method5891()) {
										arg1.method5892(local140, arg0, local143, (local23 - arg3) * Static284.anInt5177 + (1 - arg5) * Static176.anInt3421, (local32 - arg4) * Static284.anInt5177 + (1 - arg6) * Static176.anInt3421, local1);
									}
									if (local146 != null && local146.method5891()) {
										arg1.method5892(local140, arg0, local146, (local23 - arg3) * Static284.anInt5177 + (1 - arg5) * Static176.anInt3421, (local32 - arg4) * Static284.anInt5177 + (1 - arg6) * Static176.anInt3421, local1);
									}
									for (@Pc(219) Class134 local219 = local62.aClass134_1; local219 != null; local219 = local219.aClass134_2) {
										@Pc(223) Class4_Sub2 local223 = local219.aClass4_Sub2_1;
										if (local223 != null && local223.method5891() && (local23 == local223.aShort88 || local23 == local3) && (local32 == local223.aShort89 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort87 + 1 - local223.aShort88;
											@Pc(260) int local260 = local223.aShort86 + 1 - local223.aShort89;
											arg1.method5892(local140, arg0, local223, (local223.aShort88 - arg3) * Static284.anInt5177 + (local252 - arg5) * Static176.anInt3421, (local223.aShort89 - arg4) * Static284.anInt5177 + (local260 - arg6) * Static176.anInt3421, local1);
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
}
