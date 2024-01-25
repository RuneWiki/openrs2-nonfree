import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!qr", name = "y", descriptor = "[Lclient!f;")
	public static Class3[] aClass3Array11;

	@OriginalMember(owner = "client!qr", name = "n", descriptor = "Lclient!vr;")
	public static final Class258 aClass258_40 = new Class258();

	@OriginalMember(owner = "client!qr", name = "x", descriptor = "I")
	public static int anInt5825 = 0;

	@OriginalMember(owner = "client!qr", name = "z", descriptor = "Lclient!vr;")
	public static final Class258 aClass258_41 = new Class258();

	@OriginalMember(owner = "client!qr", name = "A", descriptor = "Lclient!si;")
	public static final Class217 aClass217_33 = new Class217(7, 4);

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)V")
	public static void method4497() {
		@Pc(5) Class69 local5 = Static53.aClass69_12;
		synchronized (Static53.aClass69_12) {
			Static53.aClass69_12.method1600();
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lclient!qa;Lclient!qv;IIIII)V")
	public static void method4500(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static338.anInt5952) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static301.anInt5434) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static241.anInt4414 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class53 local62 = Static40.aClass53ArrayArrayArray2[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static346.aClass146Array2[local17].I(local23, local32) + Static346.aClass146Array2[local17].I(local23 + 1, local32) + Static346.aClass146Array2[local17].I(local23, local32 + 1) + Static346.aClass146Array2[local17].I(local23 + 1, local32 + 1)) / 4 - (Static346.aClass146Array2[arg2].I(arg3, arg4) + Static346.aClass146Array2[arg2].I(arg3 + 1, arg4) + Static346.aClass146Array2[arg2].I(arg3, arg4 + 1) + Static346.aClass146Array2[arg2].I(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class6_Sub1 local143 = local62.aClass6_Sub1_1;
									@Pc(146) Class6_Sub1 local146 = local62.aClass6_Sub1_2;
									if (local143 != null && local143.method5633()) {
										arg1.method5636(local143, arg0, (local32 - arg4) * Static205.anInt3908 + (1 - arg6) * Static40.anInt1024, local1, (local23 - arg3) * Static205.anInt3908 + (1 - arg5) * Static40.anInt1024, local140);
									}
									if (local146 != null && local146.method5633()) {
										arg1.method5636(local146, arg0, (local32 - arg4) * Static205.anInt3908 + (1 - arg6) * Static40.anInt1024, local1, (local23 - arg3) * Static205.anInt3908 + (1 - arg5) * Static40.anInt1024, local140);
									}
									for (@Pc(219) Class165 local219 = local62.aClass165_1; local219 != null; local219 = local219.aClass165_2) {
										@Pc(223) Class6_Sub2 local223 = local219.aClass6_Sub2_2;
										if (local223 != null && local223.method5633() && (local23 == local223.aShort82 || local23 == local3) && (local32 == local223.aShort85 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort84 + 1 - local223.aShort82;
											@Pc(260) int local260 = local223.aShort83 + 1 - local223.aShort85;
											arg1.method5636(local223, arg0, (local223.aShort85 - arg4) * Static205.anInt3908 + (local260 - arg6) * Static40.anInt1024, local1, (local223.aShort82 - arg3) * Static205.anInt3908 + (local252 - arg5) * Static40.anInt1024, local140);
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

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZII)I")
	public static int method4501(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static214.anIntArray331[arg0 & 0x3] : Static234.anIntArray346[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZZ)Z")
	public static boolean method4502(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}
}
