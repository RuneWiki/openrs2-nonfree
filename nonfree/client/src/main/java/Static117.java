import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
	public static int anInt3032;

	@OriginalMember(owner = "client!jl", name = "C", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!jl", name = "k", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray22 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!jl", name = "t", descriptor = "I")
	public static int anInt3040 = 0;

	@OriginalMember(owner = "client!jl", name = "w", descriptor = "I")
	public static int anInt3043 = 0;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BLclient!hc;)V")
	public static void method2316(@OriginalArg(1) Class51 arg0) {
		Static30.anInt914 = arg0.method1866("titlebg");
		Static210.anInt4599 = arg0.method1866("logo");
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IILclient!se;IIIII)V")
	public static void method2317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class122 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static142.aBoolean183) {
			Static113.anInt5512 = 32;
		} else {
			Static113.anInt5512 = 0;
		}
		Static142.aBoolean183 = false;
		@Pc(132) int local132;
		if (Static248.anInt5322 != 0) {
			if (arg1 >= arg6 && arg6 + 16 > arg1 && arg5 >= arg3 && arg3 + 16 > arg5) {
				arg2.anInt4653 -= 4;
				Static257.method4146(arg2);
			} else if (arg1 >= arg6 && arg1 < arg6 + 16 && arg4 + arg3 - 16 <= arg5 && arg3 + arg4 > arg5) {
				arg2.anInt4653 += 4;
				Static257.method4146(arg2);
			} else if (arg1 >= arg6 - Static113.anInt5512 && arg1 < arg6 + Static113.anInt5512 + 16 && arg3 + 16 <= arg5 && arg4 + arg3 - 16 > arg5) {
				local132 = (arg4 - 32) * arg4 / arg0;
				if (local132 < 8) {
					local132 = 8;
				}
				@Pc(143) int local143 = arg4 - local132 - 32;
				@Pc(155) int local155 = arg5 - arg3 - local132 / 2 - 16;
				arg2.anInt4653 = local155 * (arg0 - arg4) / local143;
				Static257.method4146(arg2);
				Static142.aBoolean183 = true;
			}
		}
		if (Static175.anInt4030 == 0) {
			return;
		}
		local132 = arg2.anInt4695;
		if (arg1 >= arg6 - local132 && arg5 >= arg3 && arg1 < arg6 + 16 && arg5 <= arg4 + arg3) {
			arg2.anInt4653 += Static175.anInt4030 * 45;
			Static257.method4146(arg2);
			return;
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method2318(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static154.aClass78_5);
		arg0.removeMouseMotionListener(Static154.aClass78_5);
		arg0.removeFocusListener(Static154.aClass78_5);
		Static20.anInt716 = 0;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!ak;IIIIILclient!ai;Lclient!de;)V")
	public static void method2319(@OriginalArg(0) Class9_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class9_Sub1_Sub1 arg5, @OriginalArg(7) Class31 arg6) {
		@Pc(7) Class1_Sub28 local7 = new Class1_Sub28();
		local7.anInt4863 = arg2 * 128;
		local7.anInt4869 = arg3;
		local7.anInt4856 = arg4 * 128;
		if (arg6 != null) {
			local7.anIntArray426 = arg6.anIntArray97;
			local7.anInt4858 = arg6.anInt1302;
			local7.anInt4870 = arg6.anInt1325 * 128;
			local7.anInt4868 = arg6.anInt1312;
			@Pc(43) int local43 = arg6.anInt1321;
			local7.aClass31_1 = arg6;
			local7.anInt4855 = arg6.anInt1327;
			@Pc(53) int local53 = arg6.anInt1331;
			local7.anInt4867 = arg6.anInt1328;
			if (arg1 == 1 || arg1 == 3) {
				local53 = arg6.anInt1321;
				local43 = arg6.anInt1331;
			}
			local7.anInt4865 = (local53 + arg4) * 128;
			local7.anInt4857 = (arg2 + local43) * 128;
			if (arg6.anIntArray100 != null) {
				local7.aBoolean252 = true;
				local7.method3671();
			}
			if (local7.anIntArray426 != null) {
				local7.anInt4859 = (int) ((double) (local7.anInt4868 - local7.anInt4855) * Math.random()) + local7.anInt4855;
			}
			Static25.aClass3_3.method28(local7);
		} else if (arg0 != null) {
			local7.aClass9_Sub1_Sub2_1 = arg0;
			@Pc(127) Class45 local127 = arg0.aClass45_1;
			if (local127.anIntArray154 != null) {
				local7.aBoolean252 = true;
				local127 = local127.method1460();
			}
			if (local127 != null) {
				local7.anInt4857 = (local127.anInt2021 + arg2) * 128;
				local7.anInt4865 = (local127.anInt2021 + arg4) * 128;
				local7.anInt4858 = Static136.method2538(arg0);
				local7.anInt4867 = local127.anInt2025;
				local7.anInt4870 = local127.anInt2026 * 128;
			}
			Static87.aClass3_10.method28(local7);
		} else if (arg5 != null) {
			local7.aClass9_Sub1_Sub1_2 = arg5;
			local7.anInt4857 = (arg5.method208() + arg2) * 128;
			local7.anInt4865 = (arg5.method208() + arg4) * 128;
			local7.anInt4858 = Static217.method3554(arg5);
			local7.anInt4870 = arg5.anInt367 * 128;
			local7.anInt4867 = arg5.anInt380;
			Static32.aClass140_1.method4011(local7, Static93.method2008(arg5.aString12));
		}
	}
}
