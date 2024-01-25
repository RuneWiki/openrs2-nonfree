import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!pm", name = "R", descriptor = "Z")
	public static boolean aBoolean612;

	@OriginalMember(owner = "client!pm", name = "j", descriptor = "Lclient!hn;")
	public static final Class102 aClass102_42 = new Class102(5);

	@OriginalMember(owner = "client!pm", name = "q", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_197 = new Class103(7, 8);

	@OriginalMember(owner = "client!pm", name = "J", descriptor = "I")
	public static int anInt5407 = 0;

	@OriginalMember(owner = "client!pm", name = "Q", descriptor = "Lclient!hn;")
	public static final Class102 aClass102_43 = new Class102(8);

	@OriginalMember(owner = "client!pm", name = "S", descriptor = "I")
	public static int anInt5413 = -1;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(II[[BI[I[I[[B[B)I")
	public static int method4229(@OriginalArg(1) int arg0, @OriginalArg(2) byte[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) byte[] arg6) {
		@Pc(9) int local9 = arg4[arg0];
		@Pc(15) int local15 = arg3[arg0] + local9;
		@Pc(19) int local19 = arg4[arg2];
		@Pc(25) int local25 = arg3[arg2] + local19;
		@Pc(27) int local27 = local9;
		if (local19 > local9) {
			local27 = local19;
		}
		@Pc(34) int local34 = local15;
		if (local25 < local15) {
			local34 = local25;
		}
		@Pc(45) int local45 = arg6[arg0] & 0xFF;
		if ((arg6[arg2] & 0xFF) < local45) {
			local45 = arg6[arg2] & 0xFF;
		}
		@Pc(62) byte[] local62 = arg5[arg0];
		@Pc(66) byte[] local66 = arg1[arg2];
		@Pc(71) int local71 = local27 - local9;
		@Pc(76) int local76 = local27 - local19;
		for (@Pc(78) int local78 = local27; local78 < local34; local78++) {
			@Pc(90) int local90 = local62[local71++] + local66[local76++];
			if (local45 > local90) {
				local45 = local90;
			}
		}
		return -local45;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIIIIZI)Z")
	public static boolean method4232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 < arg3 + arg6 && arg6 < arg1 + arg2) {
			return arg4 + arg7 > arg0 && arg0 + arg5 > arg7;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(B)V")
	public static void method4233() {
		if (Static117.anInt2198 == 2) {
			Static270.anInt4858 = 96;
			return;
		}
		try {
			@Pc(25) Method local25 = Runtime.class.getMethod("maxMemory");
			if (local25 != null) {
				try {
					@Pc(29) Runtime local29 = Runtime.getRuntime();
					@Pc(35) Long local35 = (Long) local25.invoke(local29, (Object[]) null);
					Static270.anInt4858 = (int) (local35 / 1048576L) + 1;
					return;
				} catch (@Pc(45) Throwable local45) {
					return;
				}
			}
		} catch (@Pc(47) Exception local47) {
			return;
		}
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(II)V")
	public static void method4234(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub5_Sub11 local12 = Static188.method2688(arg0, 16);
		local12.method2667();
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(III)Lclient!rv;")
	public static Class25_Sub3 method4238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class169 local7 = Static359.aClass169ArrayArrayArray5[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class25_Sub3 local14 = local7.aClass25_Sub3_1;
			local7.aClass25_Sub3_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILclient!fo;)V")
	public static void method4239(@OriginalArg(1) Class82 arg0) {
		Static46.aClass82_8 = arg0;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IBII)V")
	public static void method4241(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 0) {
			Static52.method867(Static176.aClass103_50);
		}
		if (arg0 == 1) {
			Static52.method867(Static292.aClass103_184);
		}
		Static18.aClass1_Sub28_Sub1_1.method5368(Static160.aClass123_1.method2750(82) ? 1 : 0);
		Static18.aClass1_Sub28_Sub1_1.method5359(arg1 + Static199.anInt3480);
		Static18.aClass1_Sub28_Sub1_1.method5393(arg2 + Static164.anInt2731);
		Static11.anInt185 = arg1;
		Static232.anInt4096 = arg2;
		Static14.aBoolean32 = false;
		Static102.method1561();
	}
}
