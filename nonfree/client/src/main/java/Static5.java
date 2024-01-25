import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)I")
	public static int method109() {
		if (Static246.anInt4038 == 0) {
			Static675.aClass393_2.method8957(new Class351("jaclib"));
			if (Static675.aClass393_2.method8958().method7616() != 100) {
				return 1;
			}
			if (!((Class351) Static675.aClass393_2.method8958()).method7618()) {
				Static205.aClient1.method1593();
			}
			Static246.anInt4038 = 1;
		}
		@Pc(235) int local235;
		@Pc(258) int local258;
		@Pc(274) int local274;
		@Pc(282) int local282;
		if (Static246.anInt4038 == 1) {
			Static269.aClass393Array1 = Static675.method8959();
			Static675.aClass393_1.method8957(new Class253(Static388.aClass34_83));
			Static675.aClass393_3.method8957(new Class351("jaggl"));
			Static675.aClass393_4.method8957(new Class351("jagdx"));
			Static675.aClass393_5.method8957(new Class351("jagmisc"));
			Static675.aClass393_6.method8957(new Class351("sw3d"));
			Static675.aClass393_7.method8957(new Class351("hw3d"));
			Static675.aClass393_8.method8957(new Class351("jagtheora"));
			Static675.aClass393_9.method8957(new Class253(Static143.aClass34_31));
			Static675.aClass393_10.method8957(new Class253(Static629.aClass34_125));
			Static675.aClass393_11.method8957(new Class253(Static674.aClass34_134));
			Static675.aClass393_12.method8957(new Class253(Static194.aClass34_48));
			Static675.aClass393_13.method8957(new Class253(Static31.aClass34_124));
			Static675.aClass393_14.method8957(new Class253(Static584.aClass34_60));
			Static675.aClass393_15.method8957(new Class253(Static203.aClass34_53));
			Static675.aClass393_16.method8957(new Class253(Static199.aClass34_50));
			Static675.aClass393_17.method8957(new Class253(Static363.aClass34_82));
			Static675.aClass393_18.method8957(new Class253(Static335.aClass34_72));
			Static675.aClass393_19.method8957(new Class253(Static584.aClass34_59));
			Static675.aClass393_20.method8957(new Class253(Static96.aClass34_21));
			Static675.aClass393_21.method8957(new Class253(Static362.aClass34_81));
			Static675.aClass393_22.method8957(new Class253(Static409.aClass34_85));
			Static675.aClass393_23.method8957(new Class204(Static122.aClass34_28, "huffman"));
			Static675.aClass393_24.method8957(new Class253(Static20.aClass34_4));
			Static675.aClass393_25.method8957(new Class253(Static338.aClass34_73));
			Static675.aClass393_26.method8957(new Class253(Static305.aClass34_68));
			Static675.aClass393_27.method8957(new Class188(Static329.aClass34_71, "details"));
			for (local235 = 0; local235 < Static269.aClass393Array1.length; local235++) {
				if (Static269.aClass393Array1[local235].method8958() == null) {
					throw new RuntimeException();
				}
			}
			local258 = 0;
			@Pc(260) Class393[] local260 = Static269.aClass393Array1;
			for (@Pc(262) int local262 = 0; local262 < local260.length; local262++) {
				@Pc(268) Class393 local268 = local260[local262];
				local274 = local268.method8954();
				local282 = local268.method8958().method7616();
				local258 += local274 * local282 / 100;
			}
			Static92.anInt1911 = local258;
			Static246.anInt4038 = 2;
		}
		if (Static269.aClass393Array1 == null) {
			return 100;
		}
		local235 = 0;
		local258 = 0;
		@Pc(313) boolean local313 = true;
		@Pc(315) Class393[] local315 = Static269.aClass393Array1;
		for (@Pc(317) int local317 = 0; local317 < local315.length; local317++) {
			@Pc(323) Class393 local323 = local315[local317];
			local282 = local323.method8954();
			@Pc(333) int local333 = local323.method8958().method7616();
			local258 += local333 * local282 / 100;
			if (local333 < 100) {
				local313 = false;
			}
			local235 += local282;
		}
		if (local313) {
			if (!((Class351) Static675.aClass393_5.method8958()).method7618()) {
				Static205.aClient1.method1585();
			}
			if (!((Class351) Static675.aClass393_8.method8958()).method7618()) {
				Static321.aBoolean375 = Static205.aClient1.method1590();
			}
			Static269.aClass393Array1 = null;
		}
		local235 -= Static92.anInt1911;
		local258 -= Static92.anInt1911;
		local274 = local235 > 0 ? local258 * 100 / local235 : 100;
		if (!local313 && local274 > 99) {
			local274 = 99;
		}
		return local274;
	}
}
