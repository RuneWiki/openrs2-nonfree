import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!kp", name = "g", descriptor = "Lclient!di;")
	public static final Class54 aClass54_57 = new Class54(44, 1);

	@OriginalMember(owner = "client!kp", name = "h", descriptor = "I")
	public static int anInt4079 = 10;

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIII)I")
	public static int method3312(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg0;
		} else if (local3 == 2) {
			return 1023 - arg1;
		} else {
			return 1023 - arg0;
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!bf;II)V")
	public static void method3313(@OriginalArg(0) Class22 arg0, @OriginalArg(2) int arg1) {
		if (Static389.aBoolean445) {
			Static389.aBoolean445 = false;
			arg1 = 0;
		}
		if (Static239.aClass22_1 != null && Static239.aClass22_1.method485(arg0)) {
			return;
		}
		Static239.aClass22_1 = arg0;
		Static59.aLong44 = Static21.method458();
		Static419.anInt7044 = arg1;
		Static162.anInt3246 = arg1;
		if (Static162.anInt3246 == 0) {
			Static188.method2968();
			return;
		}
		Static198.aClass155_3 = Static273.aClass155_4;
		Static436.anInt7190 = Static210.anInt4100;
		Static253.anInt4753 = Static179.anInt3514;
		Static199.aFloat61 = Static154.aFloat56;
		Static187.anInt3618 = Static152.anInt3143;
		Static159.aFloat58 = Static345.aFloat83;
		Static68.aFloat77 = Static276.aFloat72;
		Static243.aFloat69 = Static336.aFloat82;
		Static109.aFloat70 = Static202.aFloat63;
		Static60.aFloat21 = Static75.aFloat22;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)V")
	public static void method3314() {
		Static335.aClass2_Sub3_Sub4_2.method4626();
		Static74.aClass160_9 = null;
		Static237.anInt4548 = 1;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)I")
	public static int method3315(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIILclient!ya;II)V")
	public static void method3316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class49 arg3, @OriginalArg(4) int arg4) {
		arg3.OA(arg1, arg0, arg4 + arg1, arg0 + arg2);
		arg3.method4480(arg1, arg4, -16777216, arg0, arg2);
		if (Static23.anInt564 < 100) {
			return;
		}
		@Pc(33) float local33 = (float) Static88.anInt4522 / (float) Static88.anInt4519;
		@Pc(35) int local35 = arg4;
		@Pc(37) int local37 = arg2;
		if (local33 < 1.0F) {
			local37 = (int) ((float) arg4 * local33);
		} else {
			local35 = (int) ((float) arg2 / local33);
		}
		@Pc(64) int local64 = arg0 + (arg2 - local37) / 2;
		@Pc(73) int local73 = arg1 + (arg4 - local35) / 2;
		if (Static118.aClass17_18 == null || arg4 != Static118.aClass17_18.la() || arg2 != Static118.aClass17_18.ma()) {
			Static88.method3639(Static88.anInt4520, Static88.anInt4515 + Static88.anInt4522, Static88.anInt4520 - -Static88.anInt4519, Static88.anInt4515, local73, local64, local73 + local35, local37 + local64);
			Static88.method3641(arg3);
			Static118.aClass17_18 = arg3.method4441(local73, local64, local35, local37, false);
		}
		Static118.aClass17_18.method5767(local73, local64);
		@Pc(122) int local122 = local35 * Static63.anInt1423 / Static88.anInt4519;
		@Pc(128) int local128 = Static446.anInt7246 * local37 / Static88.anInt4522;
		@Pc(136) int local136 = local35 * Static377.anInt6401 / Static88.anInt4519 + local73;
		@Pc(149) int local149 = local37 + local64 - local37 * Static110.anInt2577 / Static88.anInt4522 - local128;
		@Pc(156) int local156 = -1996554240;
		if (Static320.aClass10_28 == Static423.aClass10_43) {
			local156 = -1996488705;
		}
		arg3.O(local136, local149, local122, local128, local156, 1);
		arg3.method4426(local136, local149, local122, local128, local156, 0);
		if (Static338.anInt6358 <= 0) {
			return;
		}
		@Pc(189) int local189;
		if (Static377.anInt6398 > 50) {
			local189 = (100 - Static377.anInt6398) * 5;
		} else {
			local189 = Static377.anInt6398 * 5;
		}
		for (@Pc(200) Class2_Sub18 local200 = (Class2_Sub18) Static88.aClass14_34.method309(); local200 != null; local200 = (Class2_Sub18) Static88.aClass14_34.method311()) {
			@Pc(208) Class48 local208 = Static88.aClass215_3.method4741(local200.anInt3142);
			if (Static207.method3266(local208)) {
				@Pc(229) int local229;
				@Pc(242) int local242;
				if (Static441.anInt300 == local200.anInt3142) {
					local229 = local200.anInt3147 * local35 / Static88.anInt4519 + local73;
					local242 = local64 + local37 * (Static88.anInt4522 - local200.anInt3146) / Static88.anInt4522;
					arg3.method4480(local229 - 2, 4, local189 << 24 | 0xFFFF00, local242 - 2, 4);
				} else if (Static170.anInt3362 != -1 && local208.anInt1195 == Static170.anInt3362) {
					local229 = local35 * local200.anInt3147 / Static88.anInt4519 + local73;
					local242 = local37 * (Static88.anInt4522 - local200.anInt3146) / Static88.anInt4522 + local64;
					arg3.method4480(local229 - 2, 4, local189 << 24 | 0xFFFF00, local242 - 2, 4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!em;I)Ljava/lang/String;")
	public static String method3317(@OriginalArg(0) Class68 arg0) {
		if (Static47.method787(arg0).method5400() == 0) {
			return null;
		} else if (arg0.aString26 == null || arg0.aString26.trim().length() == 0) {
			return Static154.aBoolean245 ? "Hidden-use" : null;
		} else {
			return arg0.aString26;
		}
	}
}
