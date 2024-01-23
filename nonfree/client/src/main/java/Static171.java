import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "[I")
	public static int[] anIntArray286;

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray3;

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
	public static int anInt3597 = 0;

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString110 = "Opened title screen";

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIILclient!h;JLclient!h;Lclient!h;)V")
	public static void method2882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class22 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) Class22 arg6, @OriginalArg(7) Class22 arg7) {
		@Pc(3) Class164 local3 = new Class164();
		local3.aClass22_9 = arg4;
		local3.anInt5045 = arg1 * 128 + 64;
		local3.anInt5043 = arg2 * 128 + 64;
		local3.anInt5040 = arg3;
		local3.aLong188 = arg5;
		local3.aClass22_7 = arg6;
		local3.aClass22_8 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(42) Class1_Sub17 local42 = Static122.aClass1_Sub17ArrayArrayArray3[arg0][arg1][arg2];
		if (local42 != null) {
			for (@Pc(46) int local46 = 0; local46 < local42.anInt3452; local46++) {
				@Pc(55) Class60 local55 = local42.aClass60Array3[local46];
				if ((local55.aLong64 & 0x400000L) == 4194304L) {
					@Pc(66) int local66 = local55.aClass22_1.method4071();
					if (local66 != -32768 && local66 < local34) {
						local34 = local66;
					}
				}
			}
		}
		local3.anInt5046 = -local34;
		if (Static122.aClass1_Sub17ArrayArrayArray3[arg0][arg1][arg2] == null) {
			Static122.aClass1_Sub17ArrayArrayArray3[arg0][arg1][arg2] = new Class1_Sub17(arg0, arg1, arg2);
		}
		Static122.aClass1_Sub17ArrayArrayArray3[arg0][arg1][arg2].aClass164_1 = local3;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BI)Lclient!pd;")
	public static Class136 method2883(@OriginalArg(1) int arg0) {
		@Pc(10) Class136 local10 = (Class136) Static282.aClass169_150.method4017((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(26) byte[] local26 = Static79.aClass138_23.method3346(30, arg0);
		local10 = new Class136();
		if (local26 != null) {
			local10.method3308(new Class1_Sub14(local26), arg0);
		}
		Static282.aClass169_150.method4016(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)I")
	public static int method2884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class1_Sub8 local10 = (Class1_Sub8) Static247.aClass156_23.method3821((long) arg0);
		if (local10 == null) {
			return 0;
		} else if (arg1 >= 0 && local10.anIntArray58.length > arg1) {
			return local10.anIntArray58[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
	public static void method2885() {
		Static36.method640();
		Static36.method656();
		Static36.method648();
		Static36.method653();
		Static36.method657();
		Static36.method659();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!ta;I)V")
	public static void method2886(@OriginalArg(0) Class1_Sub29 arg0) {
		Static237.method2930(200000, arg0);
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V")
	public static void method2888() {
		Static136.anIntArray221 = null;
		Static128.anIntArray203 = null;
		Static245.aByteArrayArrayArray11 = null;
		Static301.aByteArrayArrayArray21 = null;
		Static231.anIntArrayArrayArray12 = null;
		Static208.aByteArrayArrayArray18 = null;
		Static59.aByteArrayArrayArray8 = null;
		Static265.aByteArrayArrayArray19 = null;
		Static94.anIntArray145 = null;
		Static238.anIntArray434 = null;
		Static289.anIntArray501 = null;
		Static195.anIntArray320 = null;
	}
}
