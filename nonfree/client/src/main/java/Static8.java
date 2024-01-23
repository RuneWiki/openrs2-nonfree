import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ah", name = "B", descriptor = "[Lclient!i;")
	public static Class54[] aClass54Array1;

	@OriginalMember(owner = "client!ah", name = "H", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!ah", name = "J", descriptor = "Lclient!ni;")
	public static Class84 aClass84_1;

	@OriginalMember(owner = "client!ah", name = "K", descriptor = "[I")
	public static int[] anIntArray20;

	@OriginalMember(owner = "client!ah", name = "N", descriptor = "Lclient!jb;")
	public static Class28 aClass28_3;

	@OriginalMember(owner = "client!ah", name = "I", descriptor = "[I")
	public static int[] anIntArray19 = new int[1000];

	@OriginalMember(owner = "client!ah", name = "L", descriptor = "I")
	public static int anInt258 = 0;

	@OriginalMember(owner = "client!ah", name = "M", descriptor = "I")
	public static int anInt259 = 0;

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(B)I")
	public static int method250() {
		return Static124.anInt2695;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIILclient!af;Lclient!af;IIJ)V")
	public static void method251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5 arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class97 local8 = new Class97();
		local8.aLong136 = arg8;
		local8.anInt3715 = arg1 * 128 + 64;
		local8.anInt3719 = arg2 * 128 + 64;
		local8.anInt3718 = arg3;
		local8.aClass5_8 = arg4;
		local8.aClass5_9 = arg5;
		local8.anInt3712 = arg6;
		local8.anInt3713 = arg7;
		for (@Pc(42) int local42 = arg0; local42 >= 0; local42--) {
			if (Static174.aClass1_Sub9ArrayArrayArray2[local42][arg1][arg2] == null) {
				Static174.aClass1_Sub9ArrayArrayArray2[local42][arg1][arg2] = new Class1_Sub9(local42, arg1, arg2);
			}
		}
		Static174.aClass1_Sub9ArrayArrayArray2[arg0][arg1][arg2].aClass97_1 = local8;
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)V")
	public static void method252() {
		try {
			if (Static116.anInt2569 == 1) {
				@Pc(10) int local10 = Static218.aClass1_Sub6_Sub2_3.method1468();
				if (local10 > 0 && Static218.aClass1_Sub6_Sub2_3.method1448()) {
					local10 -= Static37.anInt766;
					if (local10 < 0) {
						local10 = 0;
					}
					Static218.aClass1_Sub6_Sub2_3.method1445(local10);
					return;
				}
				Static218.aClass1_Sub6_Sub2_3.method1451();
				Static218.aClass1_Sub6_Sub2_3.method1457();
				Static39.aClass12_1 = null;
				if (Static16.aClass28_7 == null) {
					Static116.anInt2569 = 0;
				} else {
					Static116.anInt2569 = 2;
				}
				Static194.aClass1_Sub27_1 = null;
			}
		} catch (@Pc(52) Exception local52) {
			local52.printStackTrace();
			Static218.aClass1_Sub6_Sub2_3.method1451();
			Static16.aClass28_7 = null;
			Static116.anInt2569 = 0;
			Static194.aClass1_Sub27_1 = null;
			Static39.aClass12_1 = null;
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(III[B)Z")
	public static boolean method253(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(3) boolean local3 = true;
		@Pc(12) Class1_Sub26 local12 = new Class1_Sub26(arg2);
		@Pc(14) int local14 = -1;
		label68: while (true) {
			@Pc(18) int local18 = local12.method2996();
			if (local18 == 0) {
				return local3;
			}
			local14 += local18;
			@Pc(29) boolean local29 = false;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(64) int local64;
				@Pc(89) Class101 local89;
				do {
					@Pc(68) int local68;
					@Pc(72) int local72;
					do {
						do {
							do {
								do {
									@Pc(37) int local37;
									while (local29) {
										local37 = local12.method2946();
										if (local37 == 0) {
											continue label68;
										}
										local12.method2945();
									}
									local37 = local12.method2946();
									if (local37 == 0) {
										continue label68;
									}
									local31 += local37 - 1;
									@Pc(52) int local52 = local31 & 0x3F;
									@Pc(58) int local58 = local31 >> 6 & 0x3F;
									local64 = local12.method2945() >> 2;
									local68 = arg1 + local58;
									local72 = arg0 + local52;
								} while (local68 <= 0);
							} while (local72 <= 0);
						} while (local68 >= 103);
					} while (local72 >= 103);
					local89 = Static170.method2725(local14);
				} while (local64 == 22 && !Static163.aBoolean317 && local89.anInt3896 == 0 && local89.anInt3921 != 1 && !local89.aBoolean347);
				local29 = true;
				if (!local89.method2845()) {
					Static65.anInt1532++;
					local3 = false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!jb;Lclient!jb;ILclient!jb;Lclient!jb;)V")
	public static void method254(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(3) Class28 arg2, @OriginalArg(4) Class28 arg3) {
		Static30.aClass28_14 = arg1;
		Static199.aClass28_70 = arg2;
		Static57.aClass28_83 = arg0;
		Static141.aClass28_54 = arg3;
		Static6.aClass86ArrayArray11 = new Class86[Static57.aClass28_83.method825()][];
		Static43.aBooleanArray7 = new boolean[Static57.aClass28_83.method825()];
	}
}
