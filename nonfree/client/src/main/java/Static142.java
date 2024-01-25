import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Z)I")
	public static int method2094() {
		if (Static26.anInt606 == 0) {
			Static673.aClass392_2.method9098(new Class109("jaclib"));
			if (Static673.aClass392_2.method9101().method9105() != 100) {
				return 1;
			}
			if (!((Class109) Static673.aClass392_2.method9101()).method2217()) {
				Static563.aClient1.method1439();
			}
			Static26.anInt606 = 1;
		}
		@Pc(233) int local233;
		@Pc(256) int local256;
		@Pc(270) int local270;
		@Pc(276) int local276;
		if (Static26.anInt606 == 1) {
			Static251.aClass392Array1 = Static673.method9100();
			Static673.aClass392_1.method9098(new Class211(Static312.aClass8_122));
			Static673.aClass392_3.method9098(new Class109("jaggl"));
			Static673.aClass392_4.method9098(new Class109("jagdx"));
			Static673.aClass392_5.method9098(new Class109("jagmisc"));
			Static673.aClass392_6.method9098(new Class109("sw3d"));
			Static673.aClass392_7.method9098(new Class109("hw3d"));
			Static673.aClass392_8.method9098(new Class109("jagtheora"));
			Static673.aClass392_9.method9098(new Class211(Static630.aClass8_97));
			Static673.aClass392_10.method9098(new Class211(Static340.aClass8_93));
			Static673.aClass392_11.method9098(new Class211(Static307.aClass8_83));
			Static673.aClass392_12.method9098(new Class211(Static593.aClass8_131));
			Static673.aClass392_13.method9098(new Class211(Static49.aClass8_13));
			Static673.aClass392_14.method9098(new Class211(Static5.aClass8_1));
			Static673.aClass392_15.method9098(new Class211(Static169.aClass8_53));
			Static673.aClass392_16.method9098(new Class211(Static112.aClass8_30));
			Static673.aClass392_17.method9098(new Class211(Static43.aClass8_12));
			Static673.aClass392_18.method9098(new Class211(Static563.aClass8_126));
			Static673.aClass392_19.method9098(new Class211(Static309.aClass8_41));
			Static673.aClass392_20.method9098(new Class211(Static613.aClass8_137));
			Static673.aClass392_21.method9098(new Class211(Static163.aClass8_52));
			Static673.aClass392_22.method9098(new Class211(Static488.aClass8_119));
			Static673.aClass392_23.method9098(new Class156(Static390.aClass8_101, "huffman"));
			Static673.aClass392_24.method9098(new Class211(Static656.aClass8_146));
			Static673.aClass392_25.method9098(new Class211(Static146.aClass8_75));
			Static673.aClass392_26.method9098(new Class211(Static466.aClass8_114));
			Static673.aClass392_27.method9098(new Class393(Static663.aClass8_136, "details"));
			for (local233 = 0; local233 < Static251.aClass392Array1.length; local233++) {
				if (Static251.aClass392Array1[local233].method9101() == null) {
					throw new RuntimeException();
				}
			}
			local256 = 0;
			@Pc(258) Class392[] local258 = Static251.aClass392Array1;
			for (@Pc(260) int local260 = 0; local260 < local258.length; local260++) {
				@Pc(266) Class392 local266 = local258[local260];
				local270 = local266.method9096();
				local276 = local266.method9101().method9105();
				local256 += local276 * local270 / 100;
			}
			Static26.anInt606 = 2;
			Static89.anInt9954 = local256;
		}
		if (Static251.aClass392Array1 == null) {
			return 100;
		}
		local233 = 0;
		local256 = 0;
		@Pc(307) boolean local307 = true;
		@Pc(309) Class392[] local309 = Static251.aClass392Array1;
		for (@Pc(317) int local317 = 0; local317 < local309.length; local317++) {
			@Pc(323) Class392 local323 = local309[local317];
			local276 = local323.method9096();
			@Pc(333) int local333 = local323.method9101().method9105();
			local233 += local276;
			if (local333 < 100) {
				local307 = false;
			}
			local256 += local333 * local276 / 100;
		}
		if (local307) {
			if (!((Class109) Static673.aClass392_5.method9101()).method2217()) {
				Static563.aClient1.method1442();
			}
			if (!((Class109) Static673.aClass392_8.method9101()).method2217()) {
				Static132.aBoolean140 = Static563.aClient1.method1436();
			}
			Static251.aClass392Array1 = null;
		}
		local256 -= Static89.anInt9954;
		local233 -= Static89.anInt9954;
		local270 = local233 <= 0 ? 100 : local256 * 100 / local233;
		if (!local307 && local270 > 99) {
			local270 = 99;
		}
		return local270;
	}
}
