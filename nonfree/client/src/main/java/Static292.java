import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!ks", name = "K", descriptor = "I")
	public static int anInt5479;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILclient!pca;II)V")
	public static void method4403(@OriginalArg(1) Class251 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class53 local13 = arg0.method5693(Static319.aClass31_11);
		if (local13 == null) {
			return;
		}
		Static319.aClass31_11.da(arg1, arg2, arg0.anInt7285 + arg1, arg0.anInt7215 + arg2);
		if (Static298.anInt5561 >= 3) {
			Static319.aClass31_11.FA(-16777216, local13, arg1, arg2);
		} else {
			Static386.aClass73_36.method7961((float) arg1 + (float) arg0.anInt7285 / 2.0F, (float) arg2 + (float) arg0.anInt7215 / 2.0F, ((int) -Static209.aFloat229 & 0x3FFF) << 2, local13, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIIIILclient!r;III)V")
	public static void method4404(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class31 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface14 local11 = (Interface14) Static597.method8185(arg5, arg2, arg1);
		@Pc(25) Class194 local25;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(51) int local51;
		if (local11 != null) {
			local25 = Static536.aClass146_4.method3721(local11.method4958());
			local31 = local11.method4961() & 0x3;
			local35 = local11.method4959();
			if (local25.anInt5810 == -1) {
				local51 = arg3;
				if (local25.anInt5831 > 0) {
					local51 = arg0;
				}
				if (local35 == 0 || local35 == 2) {
					if (local31 == 0) {
						arg4.method8029(arg7, arg6, 4, local51);
					} else if (local31 == 1) {
						arg4.method8042(local51, 4, arg7, arg6);
					} else if (local31 == 2) {
						arg4.method8029(arg7 + 3, arg6, 4, local51);
					} else if (local31 == 3) {
						arg4.method8042(local51, 4, arg7, arg6 + 3);
					}
				}
				if (local35 == 3) {
					if (local31 == 0) {
						arg4.method8094(arg6, arg7, 1, 1, local51);
					} else if (local31 == 1) {
						arg4.method8094(arg6, arg7 + 3, 1, 1, local51);
					} else if (local31 == 2) {
						arg4.method8094(arg6 + 3, arg7 + 3, 1, 1, local51);
					} else if (local31 == 3) {
						arg4.method8094(arg6 + 3, arg7, 1, 1, local51);
					}
				}
				if (local35 == 2) {
					if (local31 == 0) {
						arg4.method8042(local51, 4, arg7, arg6);
					} else if (local31 == 1) {
						arg4.method8029(arg7 + 3, arg6, 4, local51);
					} else if (local31 == 2) {
						arg4.method8042(local51, 4, arg7, arg6 + 3);
					} else if (local31 == 3) {
						arg4.method8029(arg7, arg6, 4, local51);
					}
				}
			} else {
				Static61.method1510(local31, arg7, arg6, local25, arg4);
			}
		}
		local11 = (Interface14) Static13.method122(arg5, arg2, arg1, ofa.class);
		if (local11 != null) {
			local25 = Static536.aClass146_4.method3721(local11.method4958());
			local31 = local11.method4961() & 0x3;
			local35 = local11.method4959();
			if (local25.anInt5810 != -1) {
				Static61.method1510(local31, arg7, arg6, local25, arg4);
			} else if (local35 == 9) {
				local51 = -1118482;
				if (local25.anInt5831 > 0) {
					local51 = -1179648;
				}
				if (local31 == 0 || local31 == 2) {
					arg4.method8088(local51, arg6 + 3, arg6, arg7, arg7 + 3);
				} else {
					arg4.method8088(local51, arg6, arg6 + 3, arg7, arg7 + 3);
				}
			}
		}
		local11 = (Interface14) Static134.method2611(arg5, arg2, arg1);
		if (local11 == null) {
			return;
		}
		local25 = Static536.aClass146_4.method3721(local11.method4958());
		local31 = local11.method4961() & 0x3;
		if (local25.anInt5810 != -1) {
			Static61.method1510(local31, arg7, arg6, local25, arg4);
			return;
		}
	}
}
