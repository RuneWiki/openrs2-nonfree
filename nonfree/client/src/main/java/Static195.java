import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "I")
	public static int anInt3812;

	@OriginalMember(owner = "client!jq", name = "h", descriptor = "Lclient!jk;")
	public static Class128 aClass128_4;

	@OriginalMember(owner = "client!jq", name = "d", descriptor = "I")
	public static int anInt3811 = 0;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(JIII)V")
	public static void method3037(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = (int) arg0 >> 14 & 0x1F;
		@Pc(17) int local17 = (int) arg0 >> 20 & 0x3;
		@Pc(28) int local28 = Integer.MAX_VALUE & (int) (arg0 >>> 32);
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static437.method5919(local10, 0, arg1, 0, 0, true, arg2, local17);
			return;
		}
		@Pc(60) Class250 local60 = Static406.aClass150_3.method3508(local28);
		@Pc(70) int local70;
		@Pc(73) int local73;
		if (local17 == 0 || local17 == 2) {
			local73 = local60.anInt7150;
			local70 = local60.anInt7185;
		} else {
			local70 = local60.anInt7150;
			local73 = local60.anInt7185;
		}
		@Pc(84) int local84 = local60.anInt7164;
		if (local17 != 0) {
			local84 = (local84 << local17 & 0xF) + (local84 >> 4 - local17);
		}
		Static437.method5919(0, local70, arg1, local84, local73, true, arg2, 0);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ZI)Lclient!df;")
	public static Class49 method3038(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			if ((double) Static169.aFloat99 == 3.0D) {
				return Static322.aClass49_24;
			}
			if ((double) Static169.aFloat99 == 4.0D) {
				return Static150.aClass49_13;
			}
			if ((double) Static169.aFloat99 == 6.0D) {
				return Static397.aClass49_28;
			}
			if ((double) Static169.aFloat99 >= 8.0D) {
				return Static100.aClass49_31;
			}
		} else if (arg0 == 1) {
			if ((double) Static169.aFloat99 == 3.0D) {
				return Static397.aClass49_28;
			}
			if ((double) Static169.aFloat99 == 4.0D) {
				return Static100.aClass49_31;
			}
			if ((double) Static169.aFloat99 == 6.0D) {
				return Static59.aClass49_7;
			}
			if ((double) Static169.aFloat99 >= 8.0D) {
				return Static374.aClass49_27;
			}
		} else if (arg0 == 2) {
			if ((double) Static169.aFloat99 == 3.0D) {
				return Static59.aClass49_7;
			}
			if ((double) Static169.aFloat99 == 4.0D) {
				return Static374.aClass49_27;
			}
			if ((double) Static169.aFloat99 == 6.0D) {
				return Static23.aClass49_4;
			}
			if ((double) Static169.aFloat99 >= 8.0D) {
				return Static38.aClass49_6;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!pc;Lclient!pc;Z)V")
	public static void method3039(@OriginalArg(0) Class188 arg0, @OriginalArg(1) Class188 arg1) {
		Static174.aClass188_49 = arg0;
		Static314.aClass188_85 = arg1;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(BI)V")
	public static void method3042(@OriginalArg(1) int arg0) {
		@Pc(13) Class2_Sub2_Sub2 local13 = Static15.method236(arg0, 12);
		local13.method435();
	}
}
