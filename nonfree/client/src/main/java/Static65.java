import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!caa", name = "c", descriptor = "Z")
	public static volatile boolean aBoolean91 = false;

	@OriginalMember(owner = "client!caa", name = "d", descriptor = "I")
	public static int anInt1330 = 0;

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "([SI)[S")
	public static short[] method1162(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) short[] local16 = new short[arg0.length];
			Static681.method4035(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)I")
	public static int method1163() {
		if (Static108.anInt2035 == 0) {
			Static583.aClass341_2.method7726(new Class157("jaclib"));
			if (Static583.aClass341_2.method7724().method8319() != 100) {
				return 1;
			}
			if (!((Class157) Static583.aClass341_2.method7724()).method3677()) {
				Static548.aClient1.method1348();
			}
			Static108.anInt2035 = 1;
		}
		@Pc(230) int local230;
		@Pc(249) int local249;
		@Pc(263) int local263;
		@Pc(269) int local269;
		if (Static108.anInt2035 == 1) {
			Static419.aClass341Array1 = Static583.method7729();
			Static583.aClass341_1.method7726(new Class125(Static610.aClass362_143));
			Static583.aClass341_3.method7726(new Class157("jaggl"));
			Static583.aClass341_4.method7726(new Class157("jagdx"));
			Static583.aClass341_5.method7726(new Class157("jagmisc"));
			Static583.aClass341_6.method7726(new Class157("sw3d"));
			Static583.aClass341_7.method7726(new Class157("hw3d"));
			Static583.aClass341_8.method7726(new Class157("jagtheora"));
			Static583.aClass341_9.method7726(new Class125(Static545.aClass362_122));
			Static583.aClass341_10.method7726(new Class125(Static368.aClass362_75));
			Static583.aClass341_11.method7726(new Class125(Static532.aClass362_114));
			Static583.aClass341_12.method7726(new Class125(Static666.aClass362_154));
			Static583.aClass341_13.method7726(new Class125(Static195.aClass362_41));
			Static583.aClass341_14.method7726(new Class125(Static354.aClass362_73));
			Static583.aClass341_15.method7726(new Class125(Static117.aClass362_22));
			Static583.aClass341_16.method7726(new Class125(Static216.aClass362_46));
			Static583.aClass341_17.method7726(new Class125(Static617.aClass362_78));
			Static583.aClass341_18.method7726(new Class125(Static302.aClass362_60));
			Static583.aClass341_19.method7726(new Class125(Static419.aClass362_90));
			Static583.aClass341_20.method7726(new Class125(Static226.aClass362_48));
			Static583.aClass341_21.method7726(new Class125(Static344.aClass362_72));
			Static583.aClass341_22.method7726(new Class125(Static532.aClass362_115));
			Static583.aClass341_23.method7726(new Class359(Static69.aClass362_140, "huffman"));
			Static583.aClass341_24.method7726(new Class125(Static33.aClass362_118));
			Static583.aClass341_25.method7726(new Class125(Static413.aClass362_88));
			Static583.aClass341_26.method7726(new Class125(Static583.aClass362_138));
			Static583.aClass341_27.method7726(new Class146(Static305.aClass362_61, "details"));
			for (local230 = 0; local230 < Static419.aClass341Array1.length; local230++) {
				if (Static419.aClass341Array1[local230].method7724() == null) {
					throw new RuntimeException();
				}
			}
			local249 = 0;
			@Pc(251) Class341[] local251 = Static419.aClass341Array1;
			for (@Pc(253) int local253 = 0; local253 < local251.length; local253++) {
				@Pc(259) Class341 local259 = local251[local253];
				local263 = local259.method7725();
				local269 = local259.method7724().method8319();
				local249 += local263 * local269 / 100;
			}
			Static108.anInt2035 = 2;
			Static523.anInt8267 = local249;
		}
		if (Static419.aClass341Array1 == null) {
			return 100;
		}
		local230 = 0;
		local249 = 0;
		@Pc(302) boolean local302 = true;
		@Pc(304) Class341[] local304 = Static419.aClass341Array1;
		for (@Pc(306) int local306 = 0; local306 < local304.length; local306++) {
			@Pc(312) Class341 local312 = local304[local306];
			local269 = local312.method7725();
			@Pc(322) int local322 = local312.method7724().method8319();
			local230 += local269;
			if (local322 < 100) {
				local302 = false;
			}
			local249 += local322 * local269 / 100;
		}
		if (local302) {
			if (!((Class157) Static583.aClass341_5.method7724()).method3677()) {
				Static548.aClient1.method1357();
			}
			if (!((Class157) Static583.aClass341_8.method7724()).method3677()) {
				Static450.aBoolean517 = Static548.aClient1.method1360();
			}
			Static419.aClass341Array1 = null;
		}
		local249 -= Static523.anInt8267;
		local230 -= Static523.anInt8267;
		local263 = local230 > 0 ? local249 * 100 / local230 : 100;
		if (!local302 && local263 > 99) {
			local263 = 99;
		}
		return local263;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(IBI)Z")
	public static boolean method1164(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}
}
