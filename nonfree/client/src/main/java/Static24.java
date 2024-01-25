import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!bb", name = "P", descriptor = "Lclient!er;")
	public static Class69 aClass69_1;

	@OriginalMember(owner = "client!bb", name = "R", descriptor = "I")
	public static int anInt847;

	@OriginalMember(owner = "client!bb", name = "S", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!bb", name = "F", descriptor = "I")
	public static final int anInt838 = -1;

	@OriginalMember(owner = "client!bb", name = "J", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_8 = new Class217(77, 3);

	@OriginalMember(owner = "client!bb", name = "O", descriptor = "I")
	public static int anInt845 = -1;

	@OriginalMember(owner = "client!bb", name = "T", descriptor = "Z")
	public static boolean aBoolean64 = false;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method582(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(Z)V")
	public static void method583() {
		if (Static88.aClass251_2 != null) {
			Static88.aClass251_2.method5345();
			Static88.aClass251_2 = null;
		}
		Static235.method3584();
		Static248.method3735();
		for (@Pc(15) int local15 = 0; local15 < 4; local15++) {
			Static382.aClass29Array3[local15].method751();
		}
		Static210.method3247(false);
		System.gc();
		Static301.method1899();
		Static120.anInt2586 = -1;
		aBoolean64 = false;
		Static393.method5081(true);
		Static223.anInt7618 = 0;
		Static417.anInt6837 = 0;
		Static57.anInt5085 = 0;
		Static166.anInt3385 = 0;
		Static373.anInt6270 = 0;
		for (@Pc(51) int local51 = 0; local51 < Static331.aClass196Array41.length; local51++) {
			Static331.aClass196Array41[local51] = null;
		}
		Static55.method1130();
		for (@Pc(69) int local69 = 0; local69 < 2048; local69++) {
			Static361.aClass7_Sub2_Sub3_Sub2Array1[local69] = null;
		}
		Static54.anInt1472 = 0;
		for (@Pc(84) int local84 = 0; local84 < 32768; local84++) {
			Static139.aClass7_Sub2_Sub3_Sub1Array11[local84] = null;
		}
		Static441.aClass11_43.method312();
		Static434.method5675();
		Static2.anInt51 = 0;
		Static85.aClass49_1.method1316();
		Static432.method5646();
		Static124.method5967();
		Static435.method5708(true);
		try {
			Static456.method852("loggedout", Static66.aClass143_2.anApplet1);
		} catch (@Pc(118) Throwable local118) {
		}
		Static113.aLong169 = 0L;
		Static15.aClass3_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)V")
	public static void method584(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub4_Sub12 local8 = Static393.method5080(arg0, 2);
		local8.method3244();
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(IIB)V")
	public static void method585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static57.aClass183_3 == Static297.aClass183_4) {
			if (Static439.method5750(false, arg0, 0, 1, 1, -2, arg1, 0)) {
				return;
			}
			Static439.method5750(false, arg0, 0, 1, 1, -3, arg1, 0);
		} else if (Static439.method5750(false, arg0, 0, 1, 1, -3, arg1, 0)) {
			return;
		} else {
			Static439.method5750(false, arg0, 0, 1, 1, -2, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIILclient!qa;IZ)V")
	public static void method587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class172 arg6, @OriginalArg(7) int arg7) {
		@Pc(9) Interface8 local9 = (Interface8) Static321.method4376(arg5, arg3, arg0);
		@Pc(22) Class93 local22;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(47) int local47;
		if (local9 != null) {
			local22 = Static435.aClass30_4.method769(local9.method4808());
			local28 = local9.method4807() & 0x3;
			local32 = local9.method4810();
			if (local22.anInt2764 == -1) {
				local47 = arg7;
				if (local22.anInt2768 > 0) {
					local47 = arg1;
				}
				if (local32 == 0 || local32 == 2) {
					if (local28 == 0) {
						arg6.method5504(4, arg4, arg2, local47);
					} else if (local28 == 1) {
						arg6.method5517(arg4, local47, arg2, 4);
					} else if (local28 == 2) {
						arg6.method5504(4, arg4 + 3, arg2, local47);
					} else if (local28 == 3) {
						arg6.method5517(arg4, local47, arg2 + 3, 4);
					}
				}
				if (local32 == 3) {
					if (local28 == 0) {
						arg6.method5507(local47, 1, arg4, arg2, 1);
					} else if (local28 == 1) {
						arg6.method5507(local47, 1, arg4 + 3, arg2, 1);
					} else if (local28 == 2) {
						arg6.method5507(local47, 1, arg4 + 3, arg2 + 3, 1);
					} else if (local28 == 3) {
						arg6.method5507(local47, 1, arg4, arg2 + 3, 1);
					}
				}
				if (local32 == 2) {
					if (local28 == 0) {
						arg6.method5517(arg4, local47, arg2, 4);
					} else if (local28 == 1) {
						arg6.method5504(4, arg4 + 3, arg2, local47);
					} else if (local28 == 2) {
						arg6.method5517(arg4, local47, arg2 + 3, 4);
					} else if (local28 == 3) {
						arg6.method5504(4, arg4, arg2, local47);
					}
				}
			} else {
				Static455.method5992(arg2, local22, arg6, arg4, local28);
			}
		}
		local9 = (Interface8) Static314.method4348(arg5, arg3, arg0, pa.class);
		if (local9 != null) {
			local22 = Static435.aClass30_4.method769(local9.method4808());
			local28 = local9.method4807() & 0x3;
			local32 = local9.method4810();
			if (local22.anInt2764 != -1) {
				Static455.method5992(arg2, local22, arg6, arg4, local28);
			} else if (local32 == 9) {
				local47 = -1118482;
				if (local22.anInt2768 > 0) {
					local47 = -1179648;
				}
				if (local28 == 0 || local28 == 2) {
					arg6.method5511(arg4, arg2 + 3, local47, arg2, arg4 + 3);
				} else {
					arg6.method5511(arg4, arg2, local47, arg2 + 3, arg4 + 3);
				}
			}
		}
		local9 = (Interface8) Static166.method2721(arg5, arg3, arg0);
		if (local9 == null) {
			return;
		}
		local22 = Static435.aClass30_4.method769(local9.method4808());
		local28 = local9.method4807() & 0x3;
		if (local22.anInt2764 != -1) {
			Static455.method5992(arg2, local22, arg6, arg4, local28);
			return;
		}
	}
}
