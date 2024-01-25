import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "[I")
	public static int[] anIntArray244;

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "Z")
	public static boolean aBoolean137;

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
	public static int anInt2522 = 0;

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "[Lclient!bd;")
	public static final Class21[] aClass21Array1 = new Class21[128];

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIZII[II)V")
	public static void method2221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int[] arg4, @OriginalArg(7) int arg5) {
		if (arg3 > 0 && !Static304.method4356(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg5 <= 0 || Static304.method4356(arg5)) {
			@Pc(40) int local40 = 0;
			@Pc(47) int local47 = arg3 >= arg5 ? arg5 : arg3;
			@Pc(62) int local62 = arg3 >> 1;
			@Pc(66) int local66 = arg5 >> 1;
			@Pc(68) int[] local68 = arg4;
			@Pc(73) int[] local73 = new int[local62 * local66];
			while (true) {
				OpenGL.glTexImage2Di(arg2, local40, arg1, arg3, arg5, 0, 32993, arg0, local68, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(92) int local92 = 0;
				@Pc(94) int local94 = 0;
				@Pc(98) int local98 = arg3;
				for (@Pc(100) int local100 = 0; local100 < local66; local100++) {
					for (@Pc(104) int local104 = 0; local104 < local62; local104++) {
						@Pc(111) int local111 = local68[local94++];
						@Pc(116) int local116 = local68[local94++];
						@Pc(121) int local121 = local68[local98++];
						@Pc(127) int local127 = local111 >> 8 & 0xFF;
						@Pc(133) int local133 = local111 >> 16 & 0xFF;
						@Pc(139) int local139 = local111 >> 24 & 0xFF;
						@Pc(144) int local144 = local68[local98++];
						@Pc(148) int local148 = local111 & 0xFF;
						@Pc(156) int local156 = local133 + (local116 >> 16 & 0xFF);
						@Pc(162) int local162 = local148 + (local116 & 0xFF);
						@Pc(170) int local170 = local139 + (local116 >> 24 & 0xFF);
						@Pc(178) int local178 = local127 + (local116 >> 8 & 0xFF);
						@Pc(184) int local184 = local162 + (local121 & 0xFF);
						@Pc(192) int local192 = local156 + (local121 >> 16 & 0xFF);
						@Pc(200) int local200 = local178 + (local121 >> 8 & 0xFF);
						@Pc(208) int local208 = local170 + (local121 >> 24 & 0xFF);
						@Pc(214) int local214 = local184 + (local144 & 0xFF);
						@Pc(222) int local222 = local200 + (local144 >> 8 & 0xFF);
						@Pc(230) int local230 = local192 + (local144 >> 16 & 0xFF);
						@Pc(238) int local238 = local208 + (local144 >> 24 & 0xFF);
						local73[local92++] = (local222 & 0x3FC) << 6 | (local238 & 0x3FC) << 22 | (local230 & 0x3FC) << 14 | local214 >> 2 & 0xFF;
					}
					local94 += arg3;
					local98 += arg3;
				}
				@Pc(291) int[] local291 = local73;
				local73 = local68;
				arg5 = local66;
				arg3 = local62;
				local68 = local291;
				local47 >>= 0x1;
				local40++;
				local62 >>= 0x1;
				local66 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method2222(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(25) String local25 = Static22.method3265(arg0);
		if (local25 == null) {
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < Static193.anInt1026; local30++) {
			@Pc(36) String local36 = Static397.aStringArray53[local30];
			if (local36.startsWith("*")) {
				local36 = local36.substring(1);
			}
			local36 = Static22.method3265(local36);
			if (local36 != null && local36.equals(local25)) {
				Static193.anInt1026--;
				for (@Pc(60) int local60 = local30; local60 < Static193.anInt1026; local60++) {
					Static397.aStringArray53[local60] = Static397.aStringArray53[local60 + 1];
					Static282.aStringArray41[local60] = Static282.aStringArray41[local60 + 1];
					Static409.anIntArray592[local60] = Static409.anIntArray592[local60 + 1];
					Static329.aStringArray46[local60] = Static329.aStringArray46[local60 + 1];
					Static407.anIntArray584[local60] = Static407.anIntArray584[local60 + 1];
					Static215.aBooleanArray13[local60] = Static215.aBooleanArray13[local60 + 1];
				}
				Static151.anInt2580 = Static337.anInt7419;
				Static55.method989(Static50.aClass131_33);
				Static232.aClass1_Sub1_Sub1_2.method4115(Static43.method4229(arg0));
				Static232.aClass1_Sub1_Sub1_2.method4104(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method2223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class211 local7 = Static268.aClass211ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class125 local13 = local7.aClass125_3; local13 != null; local13 = local13.aClass125_1) {
			@Pc(17) Class26_Sub2 local17 = local13.aClass26_Sub2_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort93 == arg1 && local17.aShort94 == arg2) {
				Static269.method3931(local17);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIIII)V")
	public static void method2225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static85.method1427(Static212.anInt452, arg5, Static305.anInt5429);
		@Pc(17) int local17 = Static85.method1427(Static212.anInt452, arg1, Static305.anInt5429);
		@Pc(23) int local23 = Static85.method1427(Static221.anInt4001, arg4, Static83.anInt7380);
		@Pc(29) int local29 = Static85.method1427(Static221.anInt4001, arg3, Static83.anInt7380);
		@Pc(37) int local37 = Static85.method1427(Static212.anInt452, arg5 + arg2, Static305.anInt5429);
		@Pc(46) int local46 = Static85.method1427(Static212.anInt452, arg1 - arg2, Static305.anInt5429);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static217.method3280(Static59.anIntArrayArray34[local48], local23, arg0, local29);
		}
		for (@Pc(68) int local68 = local17; local68 > local46; local68--) {
			Static217.method3280(Static59.anIntArrayArray34[local68], local23, arg0, local29);
		}
		@Pc(90) int local90 = Static85.method1427(Static221.anInt4001, arg2 + arg4, Static83.anInt7380);
		@Pc(99) int local99 = Static85.method1427(Static221.anInt4001, arg3 - arg2, Static83.anInt7380);
		for (@Pc(105) int local105 = local37; local105 <= local46; local105++) {
			@Pc(111) int[] local111 = Static59.anIntArrayArray34[local105];
			Static217.method3280(local111, local23, arg0, local90);
			Static217.method3280(local111, local99, arg0, local29);
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BZ)V")
	public static void method2226(@OriginalArg(1) boolean arg0) {
		Static81.method1403();
		if (Static151.anInt2579 != 30 && Static151.anInt2579 != 25) {
			return;
		}
		Static166.anInt6111++;
		if (Static166.anInt6111 < 50 && !arg0) {
			return;
		}
		Static166.anInt6111 = 0;
		if (!Static37.aBoolean24 && Static372.aClass161_6 != null) {
			Static55.method989(Static265.aClass131_125);
			try {
				Static372.aClass161_6.method3763(Static232.aClass1_Sub1_Sub1_2.aByteArray66, Static232.aClass1_Sub1_Sub1_2.anInt5056);
				Static232.aClass1_Sub1_Sub1_2.anInt5056 = 0;
			} catch (@Pc(62) IOException local62) {
				Static37.aBoolean24 = true;
			}
		}
		Static81.method1403();
	}
}
