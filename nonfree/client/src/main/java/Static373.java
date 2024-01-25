import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
	public static int anInt6582;

	@OriginalMember(owner = "client!pl", name = "k", descriptor = "Lclient!is;")
	public static final Class139 aClass139_1 = new Class139();

	@OriginalMember(owner = "client!pl", name = "p", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_115 = new Class6(4, -2);

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!qa;Lclient!jj;BLclient!bc;)V")
	public static void method5704(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class1_Sub25 arg1, @OriginalArg(3) Class24 arg2) {
		@Pc(12) Class12 local12 = arg2.method1187(arg0);
		if (local12 == null) {
			return;
		}
		@Pc(18) int local18 = local12.c();
		if (local18 < local12.la()) {
			local18 = local12.la();
		}
		@Pc(30) int local30 = arg1.anInt4559;
		@Pc(33) int local33 = arg1.anInt4558;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		@Pc(53) int local53;
		@Pc(79) int local79;
		if (arg2.aString3 != null) {
			local35 = Static179.aClass177_4.method4667(null, Static294.aStringArray22, null, arg2.aString3);
			for (local53 = 0; local53 < local35; local53++) {
				@Pc(58) String local58 = Static294.aStringArray22[local53];
				if (local35 - 1 > local53) {
					local58 = local58.substring(0, local58.length() - 4);
				}
				local79 = Static534.aClass210_7.method5456(local58);
				if (local37 < local79) {
					local37 = local79;
				}
			}
			local39 = Static534.aClass210_7.method5452() * local35 + Static534.aClass210_7.method5453() / 2;
		}
		local53 = arg1.anInt4559 + local18 / 2;
		if (local18 + Static451.anInt3556 > local30) {
			local30 = Static451.anInt3556;
			local53 = local37 / 2 + Static451.anInt3556 + local18 / 2 + 5 + 10;
		} else if (Static451.anInt3557 - local18 < local30) {
			local53 = Static451.anInt3557 - local18 / 2 - local37 / 2 - 10 - 5;
			local30 = Static451.anInt3557 - local18;
		}
		@Pc(168) int local168 = arg1.anInt4558;
		if (Static451.anInt3552 + local18 > local33) {
			local168 = Static451.anInt3552 + local18 / 2 + 10;
			local33 = Static451.anInt3552;
		} else if (Static451.anInt3554 - local18 < local33) {
			local168 = Static451.anInt3554 - local18 / 2 - local39 - 10;
			local33 = Static451.anInt3554 - local18;
		}
		local79 = (int) (Math.atan2((double) (local30 - arg1.anInt4559), (double) (local33 - arg1.anInt4558)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local12.method7196((float) local18 / 2.0F + (float) local30, (float) local33 + (float) local18 / 2.0F, 4096, local79);
		@Pc(247) int local247 = -2;
		@Pc(249) int local249 = -2;
		@Pc(251) int local251 = -2;
		@Pc(253) int local253 = -2;
		if (arg2.aString3 != null) {
			local249 = local168;
			local247 = local53 - local37 / 2 - 5;
			local253 = local168 + Static534.aClass210_7.method5452() * local35 + 3;
			local251 = local37 + local247 + 10;
			if (arg2.anInt1146 != 0) {
				arg0.method7632(local247, arg2.anInt1146, local251 - local247, -local168 + local253, local168);
			}
			if (arg2.anInt1149 != 0) {
				arg0.method7599(local253 - local168, local251 - local247, arg2.anInt1149, local247, local168);
			}
			for (@Pc(323) int local323 = 0; local323 < local35; local323++) {
				@Pc(328) String local328 = Static294.aStringArray22[local323];
				if (local35 - 1 > local323) {
					local328 = local328.substring(0, local328.length() - 4);
				}
				Static534.aClass210_7.method5454(arg0, local328, local53, local168, arg2.anInt1172);
				local168 += Static534.aClass210_7.method5452();
			}
		}
		if (arg2.anInt1173 == -1 && arg2.aString3 == null) {
			return;
		}
		local18 >>= 0x1;
		@Pc(380) Class1_Sub18 local380 = new Class1_Sub18(arg1);
		local380.anInt3224 = local33 + local18;
		local380.anInt3228 = local247;
		local380.anInt3220 = local251;
		local380.anInt3227 = local249;
		local380.anInt3229 = local30 - local18;
		local380.anInt3218 = local33 - local18;
		local380.anInt3219 = local253;
		local380.anInt3225 = local18 + local30;
		Static263.aClass38_39.method1426(local380);
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
	public static void method5708() {
		Static514.aClass38_73.method1417();
		for (@Pc(11) Class1_Sub50 local11 = (Class1_Sub50) Static475.aClass38_69.method1419(); local11 != null; local11 = (Class1_Sub50) Static475.aClass38_69.method1415()) {
			if (local11.anInt8983 < 1000) {
				local11.method7983();
				Static514.aClass38_73.method1426(local11);
			}
		}
		Static514.aClass38_73.method1425(Static475.aClass38_69);
		if (Static267.anInt5167 <= 1) {
			Static158.aClass1_Sub50_1 = null;
		} else if (Static179.aBoolean243 && Static126.aClass60_1.method5384(81) && Static267.anInt5167 > 2) {
			Static158.aClass1_Sub50_1 = (Class1_Sub50) Static475.aClass38_69.aClass1_27.aClass1_284.aClass1_284;
		} else {
			Static158.aClass1_Sub50_1 = (Class1_Sub50) Static475.aClass38_69.aClass1_27.aClass1_284;
		}
		@Pc(64) int local64 = -1;
		@Pc(69) Class1_Sub41 local69 = (Class1_Sub41) Static407.aClass38_54.method1419();
		if (local69 != null) {
			local64 = local69.method7875();
		}
		if (!Static25.aBoolean94) {
			if (local64 == 0 && (Static235.anInt4604 == 1 && Static267.anInt5167 > 2 || Static425.method6302())) {
				local64 = 2;
			}
			if (local64 == 2 && Static267.anInt5167 > 0 && local69 != null) {
				if (Static279.aClass309_6 == null && Static372.anInt6577 == 0) {
					Static360.method7850(local69.method7870(), local69.method7866());
				} else {
					Static497.anInt8450 = 2;
				}
			}
			if (local64 == 0 && Static267.anInt5167 > 0) {
				Static419.method6232();
			}
			if (Static279.aClass309_6 != null || Static372.anInt6577 != 0) {
				return;
			}
			Static497.anInt8450 = 0;
			Static478.aClass1_Sub50_3 = null;
			return;
		}
		@Pc(88) int local88;
		@Pc(92) int local92;
		if (local64 == -1) {
			local88 = Static42.aClass191_1.method5138();
			local92 = Static42.aClass191_1.method5141();
			if (local88 < Static504.anInt8565 - 10 || local88 > Static504.anInt8565 + Static85.anInt2199 + 10 || Static380.anInt6684 - 10 > local92 || Static186.anInt3939 + Static380.anInt6684 + 10 < local92) {
				Static73.method1943();
			}
		}
		if (local64 != 0) {
			return;
		}
		local88 = Static504.anInt8565;
		local92 = Static380.anInt6684;
		@Pc(143) int local143 = Static85.anInt2199;
		@Pc(147) int local147 = local69.method7870();
		@Pc(151) int local151 = local69.method7866();
		@Pc(153) int local153 = -1;
		@Pc(171) int local171;
		for (@Pc(155) int local155 = 0; local155 < Static267.anInt5167; local155++) {
			if (Static536.aBoolean650) {
				local171 = (Static267.anInt5167 - local155 - 1) * 16 + local92 + 33;
				if (local88 < local147 && local88 + local143 > local147 && local151 > local171 - 13 && local171 + 4 > local151) {
					local153 = local155;
				}
			} else {
				local171 = (Static267.anInt5167 - local155 - 1) * 16 + local92 + 31;
				if (local147 > local88 && local88 + local143 > local147 && local171 - 13 < local151 && local151 < local171 + 3) {
					local153 = local155;
				}
			}
		}
		if (local153 != -1) {
			local171 = 0;
			@Pc(265) Class157 local265 = new Class157(Static475.aClass38_69);
			for (@Pc(270) Class1_Sub50 local270 = (Class1_Sub50) local265.method4036(); local270 != null; local270 = (Class1_Sub50) local265.method4037()) {
				if (local153 == local171) {
					Static538.method7882(local270, local147, local151);
				}
				local171++;
			}
		}
		Static73.method1943();
		return;
	}
}
