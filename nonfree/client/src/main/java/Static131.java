import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!ic", name = "P", descriptor = "Z")
	public static boolean aBoolean194;

	@OriginalMember(owner = "client!ic", name = "eb", descriptor = "I")
	public static int anInt2532;

	@OriginalMember(owner = "client!ic", name = "cb", descriptor = "[J")
	public static final long[] aLongArray2 = new long[32];

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(Z)V")
	public static void method2330() {
		Static48.aClass95_2 = null;
		Static300.aClass95_13 = null;
		Static170.aClass95_9 = null;
		Static74.aClass95_4 = null;
		Static86.aClass95_5 = null;
		Static17.aClass95_1 = null;
		Static325.aClass95_14 = null;
		Static115.aClass95_8 = null;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIBIIIIIII)V")
	public static void method2331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(5) Class5_Sub22 local5 = null;
		for (@Pc(10) Class5_Sub22 local10 = (Class5_Sub22) Static28.aClass103_21.method2756(); local10 != null; local10 = (Class5_Sub22) Static28.aClass103_21.method2748()) {
			if (arg2 == local10.anInt2669 && arg3 == local10.anInt2675 && arg0 == local10.anInt2674 && local10.anInt2668 == arg1) {
				local5 = local10;
				break;
			}
		}
		if (local5 == null) {
			local5 = new Class5_Sub22();
			local5.anInt2669 = arg2;
			local5.anInt2674 = arg0;
			local5.anInt2675 = arg3;
			local5.anInt2668 = arg1;
			Static148.method2695(local5);
			Static28.aClass103_21.method2745(local5);
		}
		local5.anInt2663 = arg4;
		local5.anInt2666 = arg8;
		local5.anInt2670 = arg5;
		local5.anInt2664 = arg6;
		local5.anInt2667 = arg7;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!ij;Lclient!ij;B)V")
	public static void method2332(@OriginalArg(0) Class93 arg0, @OriginalArg(1) Class93 arg1) {
		Static5.aClass93_5 = arg1;
		Static296.aClass93_114 = arg0;
		Static5.aClass93_5.method2418(34);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!ne;Ljava/lang/Object;I)V")
	public static void method2335(@OriginalArg(0) Class139 arg0, @OriginalArg(1) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < 50 && arg0.anEventQueue1.peekEvent() != null; local25++) {
			Static20.method408(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILclient!jq;IILclient!jq;IIIII)V")
	public static void method2336(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub5_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub5_Sub2 arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(16) int local16 = arg1.method4815();
		if (local16 == -1) {
			return;
		}
		@Pc(29) Class95 local29 = (Class95) Static329.aClass109_59.method2857((long) local16);
		if (local29 == null) {
			@Pc(36) Class100[] local36 = Static363.method2681(Static244.aClass93_93, local16);
			if (local36 == null) {
				return;
			}
			local29 = Static236.aClass55_9.method5229(local36[0]);
			Static329.aClass109_59.method2855((long) local16, local29);
		}
		Static84.method3936(arg3 >> 1, arg5 >> 1, arg4.anInt6632, 0, arg4.anInt6631, arg4.method4807() * 64);
		@Pc(85) int local85 = arg0 + Static123.anIntArray224[0] - 18;
		@Pc(93) int local93 = arg6 + Static123.anIntArray224[1] - 70;
		@Pc(101) int local101 = local85 + arg2 / 4 * 18;
		@Pc(109) int local109 = local93 + arg2 % 4 * 18;
		local29.method5491(local101, local109);
		if (arg4 == arg1) {
			Static236.aClass55_9.method5251(local101 - 1, -256, 18, 18, local109 - 1);
		}
		@Pc(133) Class32_Sub1 local133 = Static276.method5091();
		local133.anInt684 = local109 + 16;
		local133.aClass4_Sub5_Sub2_1 = arg1;
		local133.anInt683 = local101 + 16;
		local133.anInt689 = local101;
		local133.anInt688 = local109;
		Static85.aClass39_2.method809(local133);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILclient!de;BILclient!ea;Lclient!vg;II)V")
	public static void method2337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class46 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class55 arg4, @OriginalArg(6) Class201 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(17) Class215 local17 = Static252.method4463(arg0);
		if (local17 == null || !local17.aBoolean589 || !local17.method5994()) {
			return;
		}
		@Pc(36) int local36;
		if (local17.anIntArray638 != null) {
			@Pc(34) int[] local34 = new int[local17.anIntArray638.length];
			@Pc(46) int local46;
			for (local36 = 0; local36 < local34.length / 2; local36++) {
				if (Static53.anInt992 == 4) {
					local46 = (int) Static164.aFloat24 & 0x3FFF;
				} else {
					local46 = (int) Static164.aFloat24 + Static170.anInt3407 & 0x3FFF;
				}
				@Pc(59) int local59 = Class187.anIntArray571[local46];
				@Pc(63) int local63 = Class187.anIntArray570[local46];
				if (Static53.anInt992 != 4) {
					local63 = local63 * 256 / (Static9.anInt191 + 256);
					local59 = local59 * 256 / (Static9.anInt191 + 256);
				}
				local34[local36 * 2] = (local63 * (arg6 + local17.anIntArray638[local36 * 2] * 4) + (arg1 + local17.anIntArray638[local36 * 2 + 1] * 4) * local59 >> 15) + arg5.anInt6505 / 2 + arg3;
				local34[local36 * 2 + 1] = arg5.anInt6510 / 2 + arg7 - ((local17.anIntArray638[local36 * 2 + 1] * 4 + arg1) * local63 - local59 * (local17.anIntArray638[local36 * 2] * 4 + arg6) >> 15);
			}
			Static71.method1320(arg4, local34, local17.anInt6762, arg5.anIntArray607, arg5.anIntArray605);
			for (local46 = 0; local46 < local34.length / 2 - 1; local46++) {
				arg4.method5245(local34[local46 * 2], local34[local46 * 2 + 1], local34[(local46 + 1) * 2], local34[(local46 + 1) * 2 + 1], local17.anInt6770, arg2, arg3, arg7);
			}
			arg4.method5245(local34[local34.length - 2], local34[local34.length - 1], local34[0], local34[1], local17.anInt6770, arg2, arg3, arg7);
		}
		@Pc(270) Class95 local270 = null;
		if (local17.anInt6749 != -1) {
			local270 = local17.method5992(false, arg4);
			if (local270 != null) {
				Static334.method5777(arg5, arg6, arg1, local270, arg2, arg3, arg7);
			}
		}
		if (local17.aString66 == null) {
			return;
		}
		local36 = 0;
		if (local270 != null) {
			local36 = local270.method5506();
		}
		@Pc(304) Class18 local304 = Static355.aClass18_4;
		@Pc(306) Class36 local306 = Static185.aClass36_6;
		if (local17.anInt6781 == 1) {
			local304 = Static204.aClass18_3;
			local306 = Static92.aClass36_4;
		}
		if (local17.anInt6781 == 2) {
			local304 = Static77.aClass18_1;
			local306 = Static268.aClass36_8;
		}
		Static29.method534(local17.aString66, arg7, local304, local36, arg5, arg6, local17.anInt6757, local306, arg2, arg1, arg3);
		return;
	}
}
