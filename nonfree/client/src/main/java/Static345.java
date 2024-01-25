import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!naa", name = "f", descriptor = "F")
	public static float aFloat162;

	@OriginalMember(owner = "client!naa", name = "g", descriptor = "I")
	public static int anInt5964;

	@OriginalMember(owner = "client!naa", name = "h", descriptor = "I")
	public static int anInt5965;

	@OriginalMember(owner = "client!naa", name = "b", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_74 = new Class154(0, 8);

	@OriginalMember(owner = "client!naa", name = "e", descriptor = "I")
	public static int anInt5963 = 0;

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(IIZ)Z")
	public static boolean method5014(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | Static228.method2765(arg1, arg0) || Static511.method7272(arg1, arg0);
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(B)I")
	public static int method5015() {
		return Static297.anInt4991++;
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lclient!jw;III)V")
	public static void method5016(@OriginalArg(0) Class2_Sub27 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null || arg0 == Static411.aClass70_43.aClass2_39) {
			return;
		}
		@Pc(15) int local15 = arg0.anInt4327;
		@Pc(22) int local22 = arg0.anInt4324;
		@Pc(25) int local25 = arg0.anInt4323;
		@Pc(29) int local29 = (int) arg0.aLong113;
		if (local25 >= 2000) {
			local25 -= 2000;
		}
		@Pc(38) long local38 = arg0.aLong113;
		@Pc(46) Class273 local46;
		if (local25 == 46) {
			local46 = Static494.method6329(local22, local15);
			if (local46 != null) {
				Static175.method4476(local46);
			}
		}
		@Pc(74) Class12_Sub2_Sub1_Sub4_Sub2 local74;
		@Pc(83) Class2_Sub34 local83;
		@Pc(61) Class2_Sub5 local61;
		if (local25 == 48) {
			local61 = (Class2_Sub5) Static436.aClass90_26.method1685((long) local29);
			if (local61 != null) {
				Static323.anInt5430 = arg1;
				Static581.anInt9423 = 2;
				local74 = local61.aClass12_Sub2_Sub1_Sub4_Sub2_1;
				Static206.anInt3015 = 0;
				Static435.anInt6992 = arg2;
				local83 = Static555.method7264(Static284.aClass154_56, Static551.aClass64_2);
				local83.aClass2_Sub7_Sub2_2.method4459(Static106.aClass150_3.method2632(82) ? 1 : 0);
				local83.aClass2_Sub7_Sub2_2.method4492(local29);
				Static100.method1508(local83);
				Static425.method5884(0, -2, local74.method6777(), local74.anIntArray565[0], local74.method6777(), true, 0, local74.anIntArray566[0]);
			}
		}
		@Pc(135) Class12_Sub2_Sub1_Sub4_Sub1 local135;
		@Pc(154) Class2_Sub34 local154;
		if (local25 == 20) {
			local135 = Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local29];
			if (local135 != null) {
				Static206.anInt3015 = 0;
				Static581.anInt9423 = 2;
				Static323.anInt5430 = arg1;
				Static435.anInt6992 = arg2;
				local154 = Static555.method7264(Static342.aClass154_73, Static551.aClass64_2);
				local154.aClass2_Sub7_Sub2_2.method4511(local29);
				local154.aClass2_Sub7_Sub2_2.method4459(Static106.aClass150_3.method2632(82) ? 1 : 0);
				Static100.method1508(local154);
				Static425.method5884(0, -2, local135.method6777(), local135.anIntArray565[0], local135.method6777(), true, 0, local135.anIntArray566[0]);
			}
		}
		@Pc(221) Class2_Sub34 local221;
		if (local25 == 1010) {
			Static323.anInt5430 = arg1;
			Static435.anInt6992 = arg2;
			Static581.anInt9423 = 2;
			Static206.anInt3015 = 0;
			local221 = Static555.method7264(Static234.aClass154_49, Static551.aClass64_2);
			local221.aClass2_Sub7_Sub2_2.method4511(local29);
			Static100.method1508(local221);
		}
		if (local25 == 3) {
			Static581.anInt9423 = 2;
			Static435.anInt6992 = arg2;
			Static323.anInt5430 = arg1;
			Static206.anInt3015 = 0;
			local221 = Static555.method7264(Static394.aClass154_83, Static551.aClass64_2);
			local221.aClass2_Sub7_Sub2_2.method4473(Static106.aClass150_3.method2632(82) ? 1 : 0);
			local221.aClass2_Sub7_Sub2_2.method4520(Static464.anInt7423);
			local221.aClass2_Sub7_Sub2_2.method4513(local29);
			local221.aClass2_Sub7_Sub2_2.method4511(Static229.anInt3341);
			local221.aClass2_Sub7_Sub2_2.method4513(local22 + Static310.anInt5129);
			local221.aClass2_Sub7_Sub2_2.method4512(Static485.anInt7725 + local15);
			local221.aClass2_Sub7_Sub2_2.method4492(Static460.anInt7404);
			Static100.method1508(local221);
			Static131.method1770(local15, local22);
		}
		if (local25 == 12) {
			local135 = Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local29];
			if (local135 != null) {
				Static581.anInt9423 = 2;
				Static323.anInt5430 = arg1;
				Static435.anInt6992 = arg2;
				Static206.anInt3015 = 0;
				local154 = Static555.method7264(Static332.aClass154_129, Static551.aClass64_2);
				local154.aClass2_Sub7_Sub2_2.method4459(Static106.aClass150_3.method2632(82) ? 1 : 0);
				local154.aClass2_Sub7_Sub2_2.method4513(local29);
				Static100.method1508(local154);
				Static425.method5884(0, -2, local135.method6777(), local135.anIntArray565[0], local135.method6777(), true, 0, local135.anIntArray566[0]);
			}
		}
		if (local25 == 49) {
			local135 = Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local29];
			if (local135 != null) {
				Static581.anInt9423 = 2;
				Static435.anInt6992 = arg2;
				Static206.anInt3015 = 0;
				Static323.anInt5430 = arg1;
				local154 = Static555.method7264(Static212.aClass154_43, Static551.aClass64_2);
				local154.aClass2_Sub7_Sub2_2.method4472(Static106.aClass150_3.method2632(82) ? 1 : 0);
				local154.aClass2_Sub7_Sub2_2.method4512(local29);
				Static100.method1508(local154);
				Static425.method5884(0, -2, local135.method6777(), local135.anIntArray565[0], local135.method6777(), true, 0, local135.anIntArray566[0]);
			}
		}
		if (local25 == 18) {
			Static581.anInt9423 = 2;
			Static323.anInt5430 = arg1;
			Static206.anInt3015 = 0;
			Static435.anInt6992 = arg2;
			local221 = Static555.method7264(Static533.aClass154_124, Static551.aClass64_2);
			local221.aClass2_Sub7_Sub2_2.method4492(Static485.anInt7725 + local15);
			local221.aClass2_Sub7_Sub2_2.method4513((int) (local38 >>> 32) & Integer.MAX_VALUE);
			local221.aClass2_Sub7_Sub2_2.method4513(local22 + Static310.anInt5129);
			local221.aClass2_Sub7_Sub2_2.method4472(Static106.aClass150_3.method2632(82) ? 1 : 0);
			Static100.method1508(local221);
			Static80.method1229(local22, local38, local15);
		}
		if (local25 == 1003) {
			Static206.anInt3015 = 0;
			Static435.anInt6992 = arg2;
			Static323.anInt5430 = arg1;
			Static581.anInt9423 = 2;
			local221 = Static555.method7264(Static56.aClass154_8, Static551.aClass64_2);
			local221.aClass2_Sub7_Sub2_2.method4511(local22 + Static310.anInt5129);
			local221.aClass2_Sub7_Sub2_2.method4459(Static106.aClass150_3.method2632(82) ? 1 : 0);
			local221.aClass2_Sub7_Sub2_2.method4511(Integer.MAX_VALUE & (int) (local38 >>> 32));
			local221.aClass2_Sub7_Sub2_2.method4492(local15 + Static485.anInt7725);
			Static100.method1508(local221);
			Static80.method1229(local22, local38, local15);
		}
		if (local25 == 21) {
			Static581.anInt9423 = 2;
			Static435.anInt6992 = arg2;
			Static323.anInt5430 = arg1;
			Static206.anInt3015 = 0;
			local221 = Static555.method7264(Static101.aClass154_20, Static551.aClass64_2);
			local221.aClass2_Sub7_Sub2_2.method4472(Static106.aClass150_3.method2632(82) ? 1 : 0);
			local221.aClass2_Sub7_Sub2_2.method4492(local22 + Static310.anInt5129);
			local221.aClass2_Sub7_Sub2_2.method4512(Static485.anInt7725 + local15);
			local221.aClass2_Sub7_Sub2_2.method4492((int) (local38 >>> 32) & Integer.MAX_VALUE);
			Static100.method1508(local221);
			Static80.method1229(local22, local38, local15);
		}
		if (local25 == 5) {
			Static323.anInt5430 = arg1;
			Static435.anInt6992 = arg2;
			Static206.anInt3015 = 0;
			Static581.anInt9423 = 2;
			local221 = Static555.method7264(Static76.aClass154_16, Static551.aClass64_2);
			local221.aClass2_Sub7_Sub2_2.method4512(local29);
			local221.aClass2_Sub7_Sub2_2.method4511(local22 + Static310.anInt5129);
			local221.aClass2_Sub7_Sub2_2.method4459(Static106.aClass150_3.method2632(82) ? 1 : 0);
			local221.aClass2_Sub7_Sub2_2.method4492(local15 + Static485.anInt7725);
			Static100.method1508(local221);
			Static131.method1770(local15, local22);
		}
		if (local25 == 22) {
			Static435.anInt6992 = arg2;
			Static206.anInt3015 = 0;
			Static581.anInt9423 = 2;
			Static323.anInt5430 = arg1;
			local221 = Static555.method7264(Static535.aClass154_125, Static551.aClass64_2);
			local221.aClass2_Sub7_Sub2_2.method4492(Static229.anInt3341);
			local221.aClass2_Sub7_Sub2_2.method4473(Static106.aClass150_3.method2632(82) ? 1 : 0);
			local221.aClass2_Sub7_Sub2_2.method4512(Static460.anInt7404);
			local221.aClass2_Sub7_Sub2_2.method4489(Static464.anInt7423);
			local221.aClass2_Sub7_Sub2_2.method4492(Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt8406);
			Static100.method1508(local221);
		}
		if (local25 == 1006) {
			Static323.anInt5430 = arg1;
			Static581.anInt9423 = 2;
			Static206.anInt3015 = 0;
			Static435.anInt6992 = arg2;
			local61 = (Class2_Sub5) Static436.aClass90_26.method1685((long) local29);
			if (local61 != null) {
				local74 = local61.aClass12_Sub2_Sub1_Sub4_Sub2_1;
				@Pc(805) Class295 local805 = local74.aClass295_1;
				if (local805.anIntArray493 != null) {
					local805 = local805.method5942(Static426.aClass160_1);
				}
				if (local805 != null) {
					@Pc(824) Class2_Sub34 local824 = Static555.method7264(Static485.aClass154_104, Static551.aClass64_2);
					local824.aClass2_Sub7_Sub2_2.method4511(local805.anInt7325);
					Static100.method1508(local824);
				}
			}
		}
		if (local25 == 57) {
			Static581.anInt9423 = 1;
			Static435.anInt6992 = arg2;
			Static206.anInt3015 = 0;
			Static323.anInt5430 = arg1;
			local221 = Static555.method7264(Static475.aClass154_66, Static551.aClass64_2);
			local221.aClass2_Sub7_Sub2_2.method4513(local15 + Static485.anInt7725);
			local221.aClass2_Sub7_Sub2_2.method4512(Static229.anInt3341);
			local221.aClass2_Sub7_Sub2_2.method4475(Static464.anInt7423);
			local221.aClass2_Sub7_Sub2_2.method4512(Static460.anInt7404);
			local221.aClass2_Sub7_Sub2_2.method4492(local22 + Static310.anInt5129);
			Static100.method1508(local221);
			Static425.method5884(0, -4, 1, local22, 1, true, 0, local15);
		}
		if (local25 == 9) {
			Static581.anInt9423 = 2;
			Static435.anInt6992 = arg2;
			Static323.anInt5430 = arg1;
			Static206.anInt3015 = 0;
			local221 = Static555.method7264(Static591.aClass154_130, Static551.aClass64_2);
			local221.aClass2_Sub7_Sub2_2.method4492(Static460.anInt7404);
			local221.aClass2_Sub7_Sub2_2.method4513((int) (local38 >>> 32) & Integer.MAX_VALUE);
			local221.aClass2_Sub7_Sub2_2.method4512(Static310.anInt5129 + local22);
			local221.aClass2_Sub7_Sub2_2.method4472(Static106.aClass150_3.method2632(82) ? 1 : 0);
			local221.aClass2_Sub7_Sub2_2.method4512(Static229.anInt3341);
			local221.aClass2_Sub7_Sub2_2.method4489(Static464.anInt7423);
			local221.aClass2_Sub7_Sub2_2.method4511(local15 + Static485.anInt7725);
			Static100.method1508(local221);
			Static80.method1229(local22, local38, local15);
		}
		if (local25 == 17) {
			if (Static11.anInt294 > 0 && Static106.aClass150_3.method2632(82) && Static106.aClass150_3.method2632(81)) {
				Static63.method1090(local15 + Static485.anInt7725, Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aByte128, Static310.anInt5129 + local22);
			} else {
				Static206.anInt3015 = 0;
				Static581.anInt9423 = 1;
				Static435.anInt6992 = arg2;
				Static323.anInt5430 = arg1;
				local221 = Static555.method7264(Static434.aClass154_98, Static551.aClass64_2);
				local221.aClass2_Sub7_Sub2_2.method4511(local15 + Static485.anInt7725);
				local221.aClass2_Sub7_Sub2_2.method4513(local22 + Static310.anInt5129);
				Static100.method1508(local221);
			}
		}
		if (local25 == 11) {
			Static206.anInt3015 = 0;
			Static323.anInt5430 = arg1;
			Static435.anInt6992 = arg2;
			Static581.anInt9423 = 2;
			local221 = Static555.method7264(Static503.aClass154_113, Static551.aClass64_2);
			local221.aClass2_Sub7_Sub2_2.method4492(Integer.MAX_VALUE & (int) (local38 >>> 32));
			local221.aClass2_Sub7_Sub2_2.method4492(local15 + Static485.anInt7725);
			local221.aClass2_Sub7_Sub2_2.method4473(Static106.aClass150_3.method2632(82) ? 1 : 0);
			local221.aClass2_Sub7_Sub2_2.method4511(local22 + Static310.anInt5129);
			Static100.method1508(local221);
			Static80.method1229(local22, local38, local15);
		}
		if (local25 == 58) {
			local61 = (Class2_Sub5) Static436.aClass90_26.method1685((long) local29);
			if (local61 != null) {
				Static581.anInt9423 = 2;
				Static323.anInt5430 = arg1;
				local74 = local61.aClass12_Sub2_Sub1_Sub4_Sub2_1;
				Static206.anInt3015 = 0;
				Static435.anInt6992 = arg2;
				local83 = Static555.method7264(Static524.aClass154_120, Static551.aClass64_2);
				local83.aClass2_Sub7_Sub2_2.method4456(Static106.aClass150_3.method2632(82) ? 1 : 0);
				local83.aClass2_Sub7_Sub2_2.method4513(local29);
				Static100.method1508(local83);
				Static425.method5884(0, -2, local74.method6777(), local74.anIntArray565[0], local74.method6777(), true, 0, local74.anIntArray566[0]);
			}
		}
		if (local25 == 8) {
			Static206.anInt3015 = 0;
			Static581.anInt9423 = 2;
			Static323.anInt5430 = arg1;
			Static435.anInt6992 = arg2;
			local221 = Static555.method7264(Static429.aClass154_95, Static551.aClass64_2);
			local221.aClass2_Sub7_Sub2_2.method4511(local29);
			local221.aClass2_Sub7_Sub2_2.method4473(Static106.aClass150_3.method2632(82) ? 1 : 0);
			local221.aClass2_Sub7_Sub2_2.method4512(Static310.anInt5129 + local22);
			local221.aClass2_Sub7_Sub2_2.method4513(Static485.anInt7725 + local15);
			Static100.method1508(local221);
			Static131.method1770(local15, local22);
		}
		if (local25 == 44) {
			local135 = Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local29];
			if (local135 != null) {
				Static206.anInt3015 = 0;
				Static435.anInt6992 = arg2;
				Static323.anInt5430 = arg1;
				Static581.anInt9423 = 2;
				local154 = Static555.method7264(Static496.aClass154_108, Static551.aClass64_2);
				local154.aClass2_Sub7_Sub2_2.method4459(Static106.aClass150_3.method2632(82) ? 1 : 0);
				local154.aClass2_Sub7_Sub2_2.method4512(local29);
				Static100.method1508(local154);
				Static425.method5884(0, -2, local135.method6777(), local135.anIntArray565[0], local135.method6777(), true, 0, local135.anIntArray566[0]);
			}
		}
		if (local25 == 16) {
			local61 = (Class2_Sub5) Static436.aClass90_26.method1685((long) local29);
			if (local61 != null) {
				Static206.anInt3015 = 0;
				Static435.anInt6992 = arg2;
				local74 = local61.aClass12_Sub2_Sub1_Sub4_Sub2_1;
				Static323.anInt5430 = arg1;
				Static581.anInt9423 = 2;
				local83 = Static555.method7264(Static393.aClass154_82, Static551.aClass64_2);
				local83.aClass2_Sub7_Sub2_2.method4472(Static106.aClass150_3.method2632(82) ? 1 : 0);
				local83.aClass2_Sub7_Sub2_2.method4513(local29);
				Static100.method1508(local83);
				Static425.method5884(0, -2, local74.method6777(), local74.anIntArray565[0], local74.method6777(), true, 0, local74.anIntArray566[0]);
			}
		}
		if (local25 == 4) {
			Static206.anInt3015 = 0;
			Static435.anInt6992 = arg2;
			Static581.anInt9423 = 2;
			Static323.anInt5430 = arg1;
			local221 = Static555.method7264(Static442.aClass154_100, Static551.aClass64_2);
			local221.aClass2_Sub7_Sub2_2.method4512(local15 + Static485.anInt7725);
			local221.aClass2_Sub7_Sub2_2.method4472(Static106.aClass150_3.method2632(82) ? 1 : 0);
			local221.aClass2_Sub7_Sub2_2.method4492((int) (local38 >>> 32) & Integer.MAX_VALUE);
			local221.aClass2_Sub7_Sub2_2.method4492(Static310.anInt5129 + local22);
			Static100.method1508(local221);
			Static80.method1229(local22, local38, local15);
		}
		if (local25 == 2) {
			local46 = Static494.method6329(local22, local15);
			if (local46 != null) {
				Static5.method84();
				@Pc(1486) Class2_Sub23 local1486 = Static70.method1164(local46);
				Static125.method1728(local1486.method2767(), local46, local1486.anInt3327);
				Static434.aString105 = Static522.method6727(local46);
				if (Static434.aString105 == null) {
					Static434.aString105 = "Null";
				}
				Static196.aString39 = local46.aString103 + "<col=ffffff>";
			}
			return;
		}
		if (local25 == 30) {
			local135 = Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local29];
			if (local135 != null) {
				Static581.anInt9423 = 2;
				Static206.anInt3015 = 0;
				Static435.anInt6992 = arg2;
				Static323.anInt5430 = arg1;
				local154 = Static555.method7264(Static181.aClass154_34, Static551.aClass64_2);
				local154.aClass2_Sub7_Sub2_2.method4513(local29);
				local154.aClass2_Sub7_Sub2_2.method4472(Static106.aClass150_3.method2632(82) ? 1 : 0);
				Static100.method1508(local154);
				Static425.method5884(0, -2, local135.method6777(), local135.anIntArray565[0], local135.method6777(), true, 0, local135.anIntArray566[0]);
			}
		}
		if (local25 == 59) {
			local135 = Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local29];
			if (local135 != null) {
				Static435.anInt6992 = arg2;
				Static581.anInt9423 = 2;
				Static323.anInt5430 = arg1;
				Static206.anInt3015 = 0;
				local154 = Static555.method7264(Static535.aClass154_125, Static551.aClass64_2);
				local154.aClass2_Sub7_Sub2_2.method4492(Static229.anInt3341);
				local154.aClass2_Sub7_Sub2_2.method4473(Static106.aClass150_3.method2632(82) ? 1 : 0);
				local154.aClass2_Sub7_Sub2_2.method4512(Static460.anInt7404);
				local154.aClass2_Sub7_Sub2_2.method4489(Static464.anInt7423);
				local154.aClass2_Sub7_Sub2_2.method4492(local29);
				Static100.method1508(local154);
				Static425.method5884(0, -2, local135.method6777(), local135.anIntArray565[0], local135.method6777(), true, 0, local135.anIntArray566[0]);
			}
		}
		if (local25 == 6) {
			local135 = Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local29];
			if (local135 != null) {
				Static435.anInt6992 = arg2;
				Static581.anInt9423 = 2;
				Static323.anInt5430 = arg1;
				Static206.anInt3015 = 0;
				local154 = Static555.method7264(Static491.aClass154_105, Static551.aClass64_2);
				local154.aClass2_Sub7_Sub2_2.method4459(Static106.aClass150_3.method2632(82) ? 1 : 0);
				local154.aClass2_Sub7_Sub2_2.method4512(local29);
				Static100.method1508(local154);
				Static425.method5884(0, -2, local135.method6777(), local135.anIntArray565[0], local135.method6777(), true, 0, local135.anIntArray566[0]);
			}
		}
		if (local25 == 1002 || local25 == 1012 || local25 == 1009 || local25 == 1004 || local25 == 1011) {
			Static385.method5332(local29, local15, local25);
		}
		if (local25 == 13) {
			local61 = (Class2_Sub5) Static436.aClass90_26.method1685((long) local29);
			if (local61 != null) {
				Static581.anInt9423 = 2;
				Static206.anInt3015 = 0;
				Static435.anInt6992 = arg2;
				local74 = local61.aClass12_Sub2_Sub1_Sub4_Sub2_1;
				Static323.anInt5430 = arg1;
				local83 = Static555.method7264(Static184.aClass154_35, Static551.aClass64_2);
				local83.aClass2_Sub7_Sub2_2.method4456(Static106.aClass150_3.method2632(82) ? 1 : 0);
				local83.aClass2_Sub7_Sub2_2.method4492(local29);
				Static100.method1508(local83);
				Static425.method5884(0, -2, local74.method6777(), local74.anIntArray565[0], local74.method6777(), true, 0, local74.anIntArray566[0]);
			}
		}
		if (local25 == 10) {
			if (Static11.anInt294 > 0 && Static106.aClass150_3.method2632(82) && Static106.aClass150_3.method2632(81)) {
				Static63.method1090(Static485.anInt7725 + local15, Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aByte128, local22 + Static310.anInt5129);
			} else {
				local221 = Static112.method1664(local22, local15, local29);
				if (local29 == 1) {
					local221.aClass2_Sub7_Sub2_2.method4459(-1);
					local221.aClass2_Sub7_Sub2_2.method4459(-1);
					local221.aClass2_Sub7_Sub2_2.method4511((int) Static313.aFloat157);
					local221.aClass2_Sub7_Sub2_2.method4459(57);
					local221.aClass2_Sub7_Sub2_2.method4459(Static525.anInt8446);
					local221.aClass2_Sub7_Sub2_2.method4459(Static434.anInt6973);
					local221.aClass2_Sub7_Sub2_2.method4459(89);
					local221.aClass2_Sub7_Sub2_2.method4511(Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9374);
					local221.aClass2_Sub7_Sub2_2.method4511(Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9375);
					local221.aClass2_Sub7_Sub2_2.method4459(63);
				} else {
					Static323.anInt5430 = arg1;
					Static206.anInt3015 = 0;
					Static581.anInt9423 = 1;
					Static435.anInt6992 = arg2;
				}
				Static100.method1508(local221);
				Static425.method5884(0, -4, 1, local22, 1, true, 0, local15);
			}
		}
		if (local25 == 60) {
			local135 = Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local29];
			if (local135 != null) {
				Static323.anInt5430 = arg1;
				Static581.anInt9423 = 2;
				Static435.anInt6992 = arg2;
				Static206.anInt3015 = 0;
				local154 = Static555.method7264(Static178.aClass154_33, Static551.aClass64_2);
				local154.aClass2_Sub7_Sub2_2.method4512(local29);
				local154.aClass2_Sub7_Sub2_2.method4472(Static106.aClass150_3.method2632(82) ? 1 : 0);
				Static100.method1508(local154);
				Static425.method5884(0, -2, local135.method6777(), local135.anIntArray565[0], local135.method6777(), true, 0, local135.anIntArray566[0]);
			}
		}
		if (local25 == 45) {
			Static206.anInt3015 = 0;
			Static581.anInt9423 = 2;
			Static435.anInt6992 = arg2;
			Static323.anInt5430 = arg1;
			local221 = Static555.method7264(Static160.aClass154_29, Static551.aClass64_2);
			local221.aClass2_Sub7_Sub2_2.method4511(local29);
			local221.aClass2_Sub7_Sub2_2.method4511(local22 + Static310.anInt5129);
			local221.aClass2_Sub7_Sub2_2.method4513(local15 + Static485.anInt7725);
			local221.aClass2_Sub7_Sub2_2.method4473(Static106.aClass150_3.method2632(82) ? 1 : 0);
			Static100.method1508(local221);
			Static131.method1770(local15, local22);
		}
		if (local25 == 1007) {
			Static323.anInt5430 = arg1;
			Static435.anInt6992 = arg2;
			Static581.anInt9423 = 2;
			Static206.anInt3015 = 0;
			local221 = Static555.method7264(Static513.aClass154_115, Static551.aClass64_2);
			local221.aClass2_Sub7_Sub2_2.method4511(local29);
			Static100.method1508(local221);
		}
		if (local25 == 15 || local25 == 1008) {
			Static513.method6625(local22, arg0.aString53, local29, local15);
		}
		if (local25 == 25) {
			Static581.anInt9423 = 2;
			Static206.anInt3015 = 0;
			Static435.anInt6992 = arg2;
			Static323.anInt5430 = arg1;
			local221 = Static555.method7264(Static70.aClass154_13, Static551.aClass64_2);
			local221.aClass2_Sub7_Sub2_2.method4511(local15 + Static485.anInt7725);
			local221.aClass2_Sub7_Sub2_2.method4513(local29);
			local221.aClass2_Sub7_Sub2_2.method4472(Static106.aClass150_3.method2632(82) ? 1 : 0);
			local221.aClass2_Sub7_Sub2_2.method4513(local22 + Static310.anInt5129);
			Static100.method1508(local221);
			Static131.method1770(local15, local22);
		}
		if (local25 == 23 && Static396.aClass273_10 == null) {
			Static419.method5622(local22, local15);
			Static396.aClass273_10 = Static494.method6329(local22, local15);
			Static155.method2111(Static396.aClass273_10);
		}
		if (local25 == 51) {
			Static581.anInt9423 = 2;
			Static435.anInt6992 = arg2;
			Static206.anInt3015 = 0;
			Static323.anInt5430 = arg1;
			local221 = Static555.method7264(Static340.aClass154_72, Static551.aClass64_2);
			local221.aClass2_Sub7_Sub2_2.method4473(Static106.aClass150_3.method2632(82) ? 1 : 0);
			local221.aClass2_Sub7_Sub2_2.method4511(local29);
			local221.aClass2_Sub7_Sub2_2.method4511(Static310.anInt5129 + local22);
			local221.aClass2_Sub7_Sub2_2.method4492(Static485.anInt7725 + local15);
			Static100.method1508(local221);
			Static131.method1770(local15, local22);
		}
		if (local25 == 50) {
			local61 = (Class2_Sub5) Static436.aClass90_26.method1685((long) local29);
			if (local61 != null) {
				Static435.anInt6992 = arg2;
				Static323.anInt5430 = arg1;
				Static581.anInt9423 = 2;
				local74 = local61.aClass12_Sub2_Sub1_Sub4_Sub2_1;
				Static206.anInt3015 = 0;
				local83 = Static555.method7264(Static20.aClass154_4, Static551.aClass64_2);
				local83.aClass2_Sub7_Sub2_2.method4512(local29);
				local83.aClass2_Sub7_Sub2_2.method4456(Static106.aClass150_3.method2632(82) ? 1 : 0);
				local83.aClass2_Sub7_Sub2_2.method4520(Static464.anInt7423);
				local83.aClass2_Sub7_Sub2_2.method4513(Static229.anInt3341);
				local83.aClass2_Sub7_Sub2_2.method4513(Static460.anInt7404);
				Static100.method1508(local83);
				Static425.method5884(0, -2, local74.method6777(), local74.anIntArray565[0], local74.method6777(), true, 0, local74.anIntArray566[0]);
			}
		}
		if (local25 == 47) {
			local61 = (Class2_Sub5) Static436.aClass90_26.method1685((long) local29);
			if (local61 != null) {
				local74 = local61.aClass12_Sub2_Sub1_Sub4_Sub2_1;
				Static435.anInt6992 = arg2;
				Static206.anInt3015 = 0;
				Static323.anInt5430 = arg1;
				Static581.anInt9423 = 2;
				local83 = Static555.method7264(Static155.aClass154_28, Static551.aClass64_2);
				local83.aClass2_Sub7_Sub2_2.method4473(Static106.aClass150_3.method2632(82) ? 1 : 0);
				local83.aClass2_Sub7_Sub2_2.method4511(local29);
				Static100.method1508(local83);
				Static425.method5884(0, -2, local74.method6777(), local74.anIntArray565[0], local74.method6777(), true, 0, local74.anIntArray566[0]);
			}
		}
		if (local25 == 19) {
			local135 = Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local29];
			if (local135 != null) {
				Static435.anInt6992 = arg2;
				Static581.anInt9423 = 2;
				Static206.anInt3015 = 0;
				Static323.anInt5430 = arg1;
				local154 = Static555.method7264(Static530.aClass154_121, Static551.aClass64_2);
				local154.aClass2_Sub7_Sub2_2.method4512(local29);
				local154.aClass2_Sub7_Sub2_2.method4459(Static106.aClass150_3.method2632(82) ? 1 : 0);
				Static100.method1508(local154);
				Static425.method5884(0, -2, local135.method6777(), local135.anIntArray565[0], local135.method6777(), true, 0, local135.anIntArray566[0]);
			}
		}
		if (Static355.aBoolean473) {
			Static5.method84();
		}
		if (Static354.aClass273_9 != null && Static472.anInt7590 == 0) {
			Static155.method2111(Static354.aClass273_9);
		}
	}
}
