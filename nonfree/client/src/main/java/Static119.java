import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "[[B")
	public static final byte[][] aByteArrayArray7 = new byte[50][];

	@OriginalMember(owner = "client!hi", name = "s", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_92 = new Class106("K", "T", "K", "K");

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!ct;Lclient!ct;Lclient!ct;ILclient!ct;)V")
	public static void method2531(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class30 arg1, @OriginalArg(2) Class30 arg2, @OriginalArg(4) Class30 arg3) {
		Static233.aClass30_71 = arg0;
		Static84.aClass30_24 = arg1;
		Static259.aClass30_77 = arg2;
		Static163.aClass30_52 = arg3;
		Static341.aClass112ArrayArray1 = new Class112[Static84.aClass30_24.method1158()][];
		Static180.aBooleanArray18 = new boolean[Static84.aClass30_24.method1158()];
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
	public static void method2534() {
		Static280.method5009(Static26.aClass18_24);
		Static339.aClass1_Sub7_Sub2_4.method2121(0);
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BIILclient!ub;II)V")
	public static void method2536(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub40 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2.anInt6099 == -1 && arg2.anIntArray472 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		if (arg4 > arg2.anInt6092) {
			local15 = arg4 - arg2.anInt6092;
		} else if (arg2.anInt6096 > arg4) {
			local15 = arg2.anInt6096 - arg4;
		}
		@Pc(52) int local52 = Static105.anInt2415 * arg2.anInt6088 >> 8;
		if (arg3 > arg2.anInt6089) {
			local15 += arg3 - arg2.anInt6089;
		} else if (arg3 < arg2.anInt6098) {
			local15 += arg2.anInt6098 - arg3;
		}
		if (arg2.anInt6086 == 0 || local15 - 64 > arg2.anInt6086 || Static105.anInt2415 == 0 || arg0 != arg2.anInt6094) {
			if (arg2.aClass1_Sub6_Sub2_2 != null) {
				Static324.aClass1_Sub6_Sub3_2.method3786(arg2.aClass1_Sub6_Sub2_2);
				arg2.aClass1_Sub6_Sub2_2 = null;
			}
			if (arg2.aClass1_Sub6_Sub2_1 != null) {
				Static324.aClass1_Sub6_Sub3_2.method3786(arg2.aClass1_Sub6_Sub2_1);
				arg2.aClass1_Sub6_Sub2_1 = null;
			}
			return;
		}
		local15 -= 64;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(143) int local143 = (arg2.anInt6086 - local15) * local52 / arg2.anInt6086;
		if (arg2.aClass1_Sub6_Sub2_2 != null) {
			arg2.aClass1_Sub6_Sub2_2.method2521(local143);
		} else if (arg2.anInt6099 >= 0) {
			@Pc(161) Class65 local161 = Static371.method2048(Static265.aClass30_78, arg2.anInt6099, 0);
			if (local161 != null) {
				@Pc(168) Class1_Sub39_Sub1 local168 = local161.method2046().method5474(Static42.aClass70_1);
				@Pc(173) Class1_Sub6_Sub2 local173 = Static372.method2525(local168, local143);
				local173.method2529(-1);
				Static324.aClass1_Sub6_Sub3_2.method3785(local173);
				arg2.aClass1_Sub6_Sub2_2 = local173;
			}
		}
		if (arg2.aClass1_Sub6_Sub2_1 != null) {
			arg2.aClass1_Sub6_Sub2_1.method2521(local143);
			if (!arg2.aClass1_Sub6_Sub2_1.method6047()) {
				arg2.aClass1_Sub6_Sub2_1 = null;
			}
		} else if (arg2.anIntArray472 != null && (arg2.anInt6090 -= arg1) <= 0) {
			@Pc(217) int local217 = (int) ((double) arg2.anIntArray472.length * Math.random());
			@Pc(225) Class65 local225 = Static371.method2048(Static265.aClass30_78, arg2.anIntArray472[local217], 0);
			if (local225 != null) {
				@Pc(232) Class1_Sub39_Sub1 local232 = local225.method2046().method5474(Static42.aClass70_1);
				@Pc(237) Class1_Sub6_Sub2 local237 = Static372.method2525(local232, local143);
				local237.method2529(0);
				Static324.aClass1_Sub6_Sub3_2.method3785(local237);
				arg2.aClass1_Sub6_Sub2_1 = local237;
				arg2.anInt6090 = (int) (Math.random() * (double) (arg2.anInt6087 - arg2.anInt6093)) + arg2.anInt6093;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)V")
	public static void method2539() {
		Static275.aBoolean416 = true;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V")
	public static void method2541(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static306.method5295(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			Static117.method2459(local7);
			local7 = Static195.method3638(":", local7, "%3a");
			local7 = Static195.method3638("@", local7, "%40");
			local7 = Static195.method3638("&", local7, "%26");
			local7 = Static195.method3638("#", local7, "%23");
			if (Static33.aClass75_1.anApplet1 != null) {
				@Pc(105) Class121 local105 = Static33.aClass75_1.method2367(new URL(Static33.aClass75_1.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static184.anInt3731 + "&u=" + Static145.aLong109 + "&v1=" + Static111.aString17 + "&v2=" + Static111.aString16 + "&e=" + local7));
				while (local105.anInt3693 == 0) {
					Static135.method2737(1L);
				}
				if (local105.anInt3693 == 1) {
					@Pc(123) DataInputStream local123 = (DataInputStream) local105.anObject2;
					local123.read();
					local123.close();
				}
			}
		} catch (@Pc(130) Exception local130) {
		}
	}
}
