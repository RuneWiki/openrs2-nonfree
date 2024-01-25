import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!ht", name = "r", descriptor = "Ljava/lang/Class;")
	private static Class aClass12;

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIIILclient!ha;IBII)V")
	public static void method3414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class57 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface16 local11 = (Interface16) Static87.method1318(arg5, arg6, arg2);
		@Pc(22) Class55 local22;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(50) int local50;
		if (local11 != null) {
			local22 = Static536.aClass392_2.method9293(0, local11.method8089());
			local28 = local11.method8091(false) & 0x3;
			local32 = local11.method8092(18636);
			if (local22.anInt937 == -1) {
				local50 = arg0;
				if (local22.anInt951 > 0) {
					local50 = arg3;
				}
				if (local32 == 0 || local32 == 2) {
					if (local28 == 0) {
						arg4.method7647(4, arg1, arg7, local50);
					} else if (local28 == 1) {
						arg4.method7709(local50, 4, arg7, arg1);
					} else if (local28 == 2) {
						arg4.method7647(4, arg1, arg7 + 3, local50);
					} else if (local28 == 3) {
						arg4.method7709(local50, 4, arg7, arg1 + 3);
					}
				}
				if (local32 == 3) {
					if (local28 == 0) {
						arg4.method7731(local50, arg7, 1, 1, arg1);
					} else if (local28 == 1) {
						arg4.method7731(local50, arg7 + 3, 1, 1, arg1);
					} else if (local28 == 2) {
						arg4.method7731(local50, arg7 + 3, 1, 1, arg1 + 3);
					} else if (local28 == 3) {
						arg4.method7731(local50, arg7, 1, 1, arg1 + 3);
					}
				}
				if (local32 == 2) {
					if (local28 == 0) {
						arg4.method7709(local50, 4, arg7, arg1);
					} else if (local28 == 1) {
						arg4.method7647(4, arg1, arg7 + 3, local50);
					} else if (local28 == 2) {
						arg4.method7709(local50, 4, arg7, arg1 + 3);
					} else if (local28 == 3) {
						arg4.method7647(4, arg1, arg7, local50);
					}
				}
			} else {
				Static450.method6676(local22, arg7, arg4, arg1, local28);
			}
		}
		local11 = (Interface16) Static465.method5496(arg5, arg6, arg2, aClass12 == null ? (aClass12 = Class24_Sub12.a("nda")) : aClass12);
		if (local11 != null) {
			local22 = Static536.aClass392_2.method9293(0, local11.method8089());
			local28 = local11.method8091(false) & 0x3;
			local32 = local11.method8092(18636);
			if (local22.anInt937 != -1) {
				Static450.method6676(local22, arg7, arg4, arg1, local28);
			} else if (local32 == 9) {
				local50 = -1118482;
				if (local22.anInt951 > 0) {
					local50 = -1179648;
				}
				if (local28 == 0 || local28 == 2) {
					arg4.method7655(arg1, arg1 + 3, arg7, arg7 + 3, local50);
				} else {
					arg4.method7655(arg1 + 3, arg1, arg7, arg7 + 3, local50);
				}
			}
		}
		local11 = (Interface16) Static209.method3036(arg5, arg6, arg2);
		if (local11 == null) {
			return;
		}
		local22 = Static536.aClass392_2.method9293(0, local11.method8089());
		local28 = local11.method8091(false) & 0x3;
		if (local22.anInt937 != -1) {
			Static450.method6676(local22, arg7, arg4, arg1, local28);
			return;
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZB)V")
	public static void method3415(@OriginalArg(0) boolean arg0) {
		Static296.aClass203_15.method8336(Static617.aClass57_14.method7720());
		@Pc(15) int[] local15 = Static617.aClass57_14.Y();
		Static325.anInt5804 = local15[1];
		Static25.anInt394 = local15[3];
		Static248.anInt4279 = local15[2];
		Static278.anInt4829 = local15[0];
		if (arg0) {
			Static617.aClass57_14.DA(Static520.anInt8815, Static355.anInt6219, Static365.anInt6315, Static635.anInt10331);
			Static353.method5308(Static436.aDouble15);
		} else {
			Static617.aClass57_14.DA(Static343.anInt6081, Static164.anInt2529, Static550.anInt9294, Static382.anInt9820);
			Static353.method5308(Static386.aDouble13);
		}
	}
}
