import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(BILjava/lang/String;)Z")
	public static boolean method4690(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (Static300.anInt4900 != 3) {
			Static338.aClass220_5 = new Class220();
			Static338.aClass220_5.anInt5746 = arg0;
			Static338.aClass220_5.aString62 = arg1;
			if (Static193.aClass178_9 != Static324.aClass178_18) {
				Static338.aClass220_5.anInt5753 = Static338.aClass220_5.anInt5746 + 40000;
				Static338.aClass220_5.anInt5751 = Static338.aClass220_5.anInt5746 + 50000;
			}
			return true;
		}
		@Pc(42) String local42 = "";
		if (Static193.aClass178_9 != Static324.aClass178_18) {
			local42 = ":" + (arg0 + 7000);
		}
		@Pc(57) String local57 = "";
		if (Static7.aString2 != null) {
			local57 = "/p=" + Static7.aString2;
		}
		@Pc(105) String local105 = "http://" + arg1 + local42 + "/l=" + Static429.anInt6999 + "/a=" + Static400.anInt6511 + local57 + "/j" + (Static443.aBoolean524 ? "1" : "0") + ",o" + (Static141.aBoolean165 ? "1" : "0") + ",a2";
		try {
			Static425.aClient1.getAppletContext().showDocument(new URL(local105), "_self");
			return true;
		} catch (@Pc(115) Exception local115) {
			return false;
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(BLclient!ya;)V")
	public static void method4691(@OriginalArg(1) Class135 arg0) {
		@Pc(11) int local11 = Static50.anInt816;
		@Pc(13) int local13 = Static328.anInt5318;
		@Pc(15) int local15 = Static128.anInt7338;
		@Pc(19) int local19 = Static30.anInt522 - 3;
		if (Static301.aClass95_16 == null || Static147.aClass95_6 == null) {
			if (Static13.aClass211_11.method4382(Static437.anInt7251) && Static13.aClass211_11.method4382(Static120.anInt2137)) {
				Static301.aClass95_16 = arg0.method5379(Static465.method4465(Static13.aClass211_11, Static437.anInt7251, 0));
				@Pc(64) Class216 local64 = Static465.method4465(Static13.aClass211_11, Static120.anInt2137, 0);
				Static147.aClass95_6 = arg0.method5379(local64);
				local64.method4476();
				Static286.aClass95_12 = arg0.method5379(local64);
			} else {
				arg0.O(local11, local13, local15, 20, Static73.anInt1500 | 255 - Static61.anInt1105 << 24, 1);
			}
		}
		@Pc(93) int local93;
		@Pc(91) int local91;
		if (Static301.aClass95_16 != null && Static147.aClass95_6 != null) {
			local91 = (local15 - Static147.aClass95_6.la() * 2) / Static301.aClass95_16.la();
			for (local93 = 0; local93 < local91; local93++) {
				Static301.aClass95_16.method5821(local11 + Static147.aClass95_6.la() + Static301.aClass95_16.la() * local93, local13);
			}
			Static147.aClass95_6.method5821(local11, local13);
			Static286.aClass95_12.method5821(local15 + local11 - Static286.aClass95_12.la(), local13);
		}
		Static49.aClass123_1.method5784(local11 + 3, Static412.anInt6979 | 0xFF000000, Static236.aClass15_64.method180(Static429.anInt6999), -1, local13 + 14);
		arg0.O(local11, local13 + 20, local15, local19 - 20, Static73.anInt1500 | -Static61.anInt1105 + 255 << 24, 1);
		local91 = Static455.aClass48_1.method1138();
		local93 = Static455.aClass48_1.method1142();
		@Pc(174) int local174 = 0;
		@Pc(198) int local198;
		for (@Pc(179) Class4_Sub30 local179 = (Class4_Sub30) Static41.aClass244_2.method5263(); local179 != null; local179 = (Class4_Sub30) Static41.aClass244_2.method5271()) {
			local198 = local13 + (-local174 + Static351.anInt5841 - 1) * 16 + 33;
			local174++;
			if (local11 < local91 && local91 < local15 + local11 && local198 - 13 < local93 && local198 + 4 > local93 && local179.aBoolean345) {
				arg0.O(local11, local198 - 12, local15, 16, 255 - Static335.anInt5463 << 24 | Static6.anInt98, 1);
			}
		}
		if ((Static365.aClass95_19 == null || Static8.aClass95_1 == null || Static299.aClass95_15 == null) && Static13.aClass211_11.method4382(Static150.anInt2730) && Static13.aClass211_11.method4382(Static376.anInt6154) && Static13.aClass211_11.method4382(Static242.anInt4049)) {
			@Pc(280) Class216 local280 = Static465.method4465(Static13.aClass211_11, Static376.anInt6154, 0);
			Static8.aClass95_1 = arg0.method5379(local280);
			local280.method4476();
			Static75.aClass95_5 = arg0.method5379(local280);
			Static365.aClass95_19 = arg0.method5379(Static465.method4465(Static13.aClass211_11, Static150.anInt2730, 0));
			@Pc(305) Class216 local305 = Static465.method4465(Static13.aClass211_11, Static242.anInt4049, 0);
			Static299.aClass95_15 = arg0.method5379(local305);
			local305.method4476();
			Static73.aClass95_4 = arg0.method5379(local305);
		}
		local174 = 0;
		@Pc(380) int local380;
		@Pc(338) int local338;
		if (Static365.aClass95_19 != null && Static8.aClass95_1 != null && Static299.aClass95_15 != null) {
			local198 = (local15 - Static299.aClass95_15.la() * 2) / Static365.aClass95_19.la();
			for (local338 = 0; local338 < local198; local338++) {
				Static365.aClass95_19.method5821(local11 + Static299.aClass95_15.la() + local338 * Static365.aClass95_19.la(), local13 - (-local19 + Static365.aClass95_19.ma()));
			}
			local380 = (local19 - Static299.aClass95_15.ma() - 20) / Static8.aClass95_1.ma();
			for (@Pc(382) int local382 = 0; local382 < local380; local382++) {
				Static8.aClass95_1.method5821(local11, local13 + Static8.aClass95_1.ma() * local382 + 20);
				Static75.aClass95_5.method5821(local15 + local11 - Static75.aClass95_5.la(), Static8.aClass95_1.ma() * local382 + 20 + local13);
			}
			Static299.aClass95_15.method5821(local11, local13 + local19 - Static299.aClass95_15.ma());
			Static73.aClass95_4.method5821(local11 + local15 - Static299.aClass95_15.la(), -Static299.aClass95_15.ma() + local19 + local13);
		}
		for (@Pc(452) Class4_Sub30 local452 = (Class4_Sub30) Static41.aClass244_2.method5263(); local452 != null; local452 = (Class4_Sub30) Static41.aClass244_2.method5271()) {
			local338 = (Static351.anInt5841 - local174 - 1) * 16 + local13 + 13 + 20;
			local380 = Static412.anInt6979 | 0xFF000000;
			if (local11 < local91 && local11 + local15 > local91 && local338 - 13 < local93 && local338 + 4 > local93 && local452.aBoolean345) {
				local380 = Static399.anInt6488 | 0xFF000000;
			}
			@Pc(505) int[] local505 = null;
			if (Static176.method2473(local452.anInt4615)) {
				local505 = Static416.aClass64_2.method1372((int) local452.aLong136).anIntArray153;
			} else if (local452.anInt4620 != -1) {
				local505 = Static416.aClass64_2.method1372(local452.anInt4620).anIntArray153;
			} else if (Static418.method5662(local452.anInt4615)) {
				@Pc(542) Class8_Sub3_Sub1_Sub2 local542 = Static367.aClass8_Sub3_Sub1_Sub2Array1[(int) local452.aLong136];
				if (local542 != null) {
					@Pc(547) Class78 local547 = local542.aClass78_1;
					if (local547.anIntArray145 != null) {
						local547 = local547.method1547(Static52.aClass81_1);
					}
					if (local547 != null) {
						local505 = local547.anIntArray146;
					}
				}
			} else if (Static100.method1513(local452.anInt4615)) {
				@Pc(581) Class114 local581;
				if (local452.anInt4615 == 1004) {
					local581 = Static51.aClass151_1.method2917((int) local452.aLong136);
				} else {
					local581 = Static51.aClass151_1.method2917((int) (local452.aLong136 >>> 32 & 0x7FFFFFFFL));
				}
				if (local581.anIntArray235 != null) {
					local581 = local581.method2181(Static52.aClass81_1);
				}
				if (local581 != null) {
					local505 = local581.anIntArray233;
				}
			}
			@Pc(610) String local610 = Static156.method2205(local452);
			if (local505 != null) {
				local610 = local610 + Static24.method335(local505);
			}
			Static49.aClass123_1.method5792(Static226.anIntArray283, Static243.aClass95Array8, local338, local11 + 3, local610, local380);
			if (local452.aBoolean344) {
				Static23.aClass95_23.method5821(local11 + Static363.aClass158_11.method3038(local610) + 5, local338 + -12);
			}
			local174++;
		}
		Static420.method5668(Static50.anInt816, Static128.anInt7338, Static30.anInt522, Static328.anInt5318);
	}
}
