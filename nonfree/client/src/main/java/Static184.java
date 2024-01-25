import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!haa", name = "K", descriptor = "Lclient!lk;")
	public static Class203 aClass203_63 = null;

	@OriginalMember(owner = "client!haa", name = "M", descriptor = "Lclient!ju;")
	public static final Class173 aClass173_3 = new Class173("WTWIP", 3);

	@OriginalMember(owner = "client!haa", name = "T", descriptor = "[S")
	public static short[] aShortArray88 = new short[256];

	@OriginalMember(owner = "client!haa", name = "X", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray23 = new String[100];

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 == arg3 && arg8 == arg2 && arg0 == arg6 && arg5 == arg7) {
			Static93.method2063(arg3, arg7, arg1, arg8, arg0);
			return;
		}
		@Pc(38) int local38 = arg3;
		@Pc(40) int local40 = arg8;
		@Pc(44) int local44 = arg3 * 3;
		@Pc(48) int local48 = arg8 * 3;
		@Pc(52) int local52 = arg4 * 3;
		@Pc(56) int local56 = arg2 * 3;
		@Pc(60) int local60 = arg6 * 3;
		@Pc(64) int local64 = arg5 * 3;
		@Pc(74) int local74 = local52 + arg0 - local60 - arg3;
		@Pc(83) int local83 = arg7 + local56 - local64 - arg8;
		@Pc(94) int local94 = local60 + local44 - local52 - local52;
		@Pc(103) int local103 = local48 + local64 - local56 - local56;
		@Pc(107) int local107 = local52 - local44;
		@Pc(111) int local111 = local56 - local48;
		for (@Pc(113) int local113 = 128; local113 <= 4096; local113 += 128) {
			@Pc(121) int local121 = local113 * local113 >> 12;
			@Pc(127) int local127 = local113 * local121 >> 12;
			@Pc(131) int local131 = local127 * local74;
			@Pc(135) int local135 = local83 * local127;
			@Pc(139) int local139 = local94 * local121;
			@Pc(143) int local143 = local121 * local103;
			@Pc(147) int local147 = local107 * local113;
			@Pc(151) int local151 = local113 * local111;
			@Pc(161) int local161 = (local147 + local139 + local131 >> 12) + arg3;
			@Pc(172) int local172 = (local143 + local135 + local151 >> 12) + arg8;
			Static93.method2063(local38, local172, arg1, local40, local161);
			local38 = local161;
			local40 = local172;
		}
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IIIZII)V")
	public static void method3180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		if (Static311.aFrame2 != null && (arg2 != 3 || arg1 != Static278.aClass3_Sub13_Sub1_1.anInt5155 || Static278.aClass3_Sub13_Sub1_1.anInt5158 != arg0)) {
			Static553.method7390(Static409.aClass221_6, Static311.aFrame2);
			Static311.aFrame2 = null;
		}
		if (arg2 == 3 && Static311.aFrame2 == null) {
			Static311.aFrame2 = Static161.method2878(0, Static409.aClass221_6, arg0, arg1);
			if (Static311.aFrame2 != null) {
				Static278.aClass3_Sub13_Sub1_1.anInt5158 = arg0;
				Static278.aClass3_Sub13_Sub1_1.anInt5155 = arg1;
				Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
			}
		}
		if (arg2 == 3 && Static311.aFrame2 == null) {
			method3180(-1, -1, Static278.aClass3_Sub13_Sub1_1.anInt5151, true, arg4);
			return;
		}
		@Pc(77) Container local77;
		@Pc(94) Insets local94;
		if (Static311.aFrame2 != null) {
			Static56.anInt1315 = arg1;
			Static224.anInt4385 = arg0;
			local77 = Static311.aFrame2;
		} else if (Static92.aFrame1 == null) {
			if (Static533.anApplet4 == null) {
				local77 = Static498.anApplet_Sub1_1;
			} else {
				local77 = Static533.anApplet4;
			}
			Static56.anInt1315 = local77.getSize().width;
			Static224.anInt4385 = local77.getSize().height;
		} else {
			local94 = Static92.aFrame1.getInsets();
			Static56.anInt1315 = Static92.aFrame1.getSize().width - local94.right - local94.left;
			@Pc(112) int local112 = -local94.bottom;
			Static224.anInt4385 = Static92.aFrame1.getSize().height + local112 - local94.top;
			local77 = Static92.aFrame1;
		}
		if (arg2 == 1) {
			Static26.anInt8939 = (Static56.anInt1315 - Static1.anInt7) / 2;
			Static318.anInt5754 = Static1.anInt7;
			Static447.anInt7372 = Static283.anInt2480;
			Static212.anInt4225 = 0;
		} else {
			Static435.method6111();
		}
		if (Static555.aClass173_8 != Static559.aClass173_9) {
			@Pc(162) boolean local162;
			if (Static318.anInt5754 < 1024 && Static447.anInt7372 < 768) {
				local162 = true;
			} else {
				local162 = false;
			}
		}
		if (arg3) {
			Static437.method6180();
		} else {
			Static347.aCanvas9.setSize(Static318.anInt5754, Static447.anInt7372);
			Static4.aClass43_1.method7209(Static347.aCanvas9);
			if (Static92.aFrame1 == local77) {
				local94 = Static92.aFrame1.getInsets();
				Static347.aCanvas9.setLocation(local94.left + Static26.anInt8939, Static212.anInt4225 + local94.top);
			} else {
				Static347.aCanvas9.setLocation(Static26.anInt8939, Static212.anInt4225);
			}
		}
		if (arg2 >= 2) {
			Static200.aBoolean316 = true;
		} else {
			Static200.aBoolean316 = false;
		}
		if (Static307.anInt5578 != -1) {
			Static517.method6895(true);
		}
		if (Static78.aClass152_2 != null && Static59.method4458(Static246.anInt4542)) {
			Static209.method6886();
		}
		for (@Pc(231) int local231 = 0; local231 < 100; local231++) {
			Static253.aBooleanArray17[local231] = true;
		}
		Static63.aBoolean141 = true;
	}
}
