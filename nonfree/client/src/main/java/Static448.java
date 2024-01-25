import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!oc", name = "W", descriptor = "I")
	public static int anInt7900 = 0;

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "(I)I")
	public static int method6652() {
		return Static293.anInt5243 == 1 ? Static292.anInt5232 : 0;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!av;III)V")
	public static void method6653(@OriginalArg(0) Class20 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static509.aClass20_16 != null || Static555.aBoolean678 || (arg0 == null || Static182.method2795(arg0) == null)) {
			return;
		}
		Static509.aClass20_16 = arg0;
		Static85.aClass20_5 = Static182.method2795(arg0);
		Static349.anInt5938 = 0;
		Static273.anInt5007 = arg2;
		Static659.aBoolean761 = false;
		Static445.anInt7712 = arg1;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)I")
	public static int method6655() {
		if (Static604.anInt9831 == 0) {
			Static692.aClass390_2.method9078(new Class268("jaclib"));
			if (Static692.aClass390_2.method9075().method8879() != 100) {
				return 1;
			}
			if (!((Class268) Static692.aClass390_2.method9075()).method6734()) {
				Static556.aClient1.method1147();
			}
			Static604.anInt9831 = 1;
		}
		@Pc(274) int local274;
		@Pc(296) int local296;
		@Pc(312) int local312;
		@Pc(320) int local320;
		if (Static604.anInt9831 == 1) {
			Static196.aClass390Array1 = Static692.method9082();
			Static692.aClass390_1.method9078(new Class8(Static579.aClass221_55));
			Static692.aClass390_3.method9078(new Class268("jaggl"));
			Static692.aClass390_4.method9078(new Class268("jagdx"));
			Static692.aClass390_5.method9078(new Class268("jagmisc"));
			Static692.aClass390_6.method9078(new Class268("sw3d"));
			Static692.aClass390_7.method9078(new Class268("hw3d"));
			Static692.aClass390_8.method9078(new Class268("jagtheora"));
			Static692.aClass390_9.method9078(new Class8(Static689.aClass221_83));
			Static692.aClass390_10.method9078(new Class8(Static626.aClass221_154));
			Static692.aClass390_11.method9078(new Class8(Static450.aClass221_121));
			Static692.aClass390_12.method9078(new Class8(Static5.aClass221_1));
			Static692.aClass390_13.method9078(new Class8(Static372.aClass221_104));
			Static692.aClass390_14.method9078(new Class8(Static264.aClass221_73));
			Static692.aClass390_15.method9078(new Class8(Static412.aClass221_119));
			Static692.aClass390_16.method9078(new Class8(Static650.aClass221_155));
			Static692.aClass390_17.method9078(new Class8(Static332.aClass221_95));
			Static692.aClass390_18.method9078(new Class8(Static550.aClass221_63));
			Static692.aClass390_19.method9078(new Class8(Static685.aClass221_160));
			Static692.aClass390_20.method9078(new Class8(Static108.aClass221_21));
			Static692.aClass390_21.method9078(new Class8(Static310.aClass221_89));
			Static692.aClass390_22.method9078(new Class8(Static463.aClass221_124));
			Static692.aClass390_23.method9078(new Class380(Static156.aClass221_42, "huffman"));
			Static692.aClass390_24.method9078(new Class8(Static344.aClass221_99));
			Static692.aClass390_25.method9078(new Class8(Static300.aClass221_87));
			Static692.aClass390_26.method9078(new Class8(Static385.aClass221_110));
			Static692.aClass390_27.method9078(new Class128(Static556.aClass221_140, "details"));
			for (local274 = 0; local274 < Static196.aClass390Array1.length; local274++) {
				if (Static196.aClass390Array1[local274].method9075() == null) {
					throw new RuntimeException();
				}
			}
			local296 = 0;
			@Pc(298) Class390[] local298 = Static196.aClass390Array1;
			for (@Pc(300) int local300 = 0; local300 < local298.length; local300++) {
				@Pc(308) Class390 local308 = local298[local300];
				local312 = local308.method9080();
				local320 = local308.method9075().method8879();
				local296 += local320 * local312 / 100;
			}
			Static69.anInt1060 = local296;
			Static604.anInt9831 = 2;
		}
		if (Static196.aClass390Array1 == null) {
			return 100;
		}
		local274 = 0;
		local296 = 0;
		@Pc(350) boolean local350 = true;
		@Pc(352) Class390[] local352 = Static196.aClass390Array1;
		for (@Pc(360) int local360 = 0; local360 < local352.length; local360++) {
			@Pc(366) Class390 local366 = local352[local360];
			local320 = local366.method9080();
			@Pc(376) int local376 = local366.method9075().method8879();
			local274 += local320;
			if (local376 < 100) {
				local350 = false;
			}
			local296 += local320 * local376 / 100;
		}
		if (local350) {
			if (!((Class268) Static692.aClass390_5.method9075()).method6734()) {
				Static556.aClient1.method1156();
			}
			if (!((Class268) Static692.aClass390_8.method9075()).method6734()) {
				Static356.aBoolean482 = Static556.aClient1.method1149();
			}
			Static196.aClass390Array1 = null;
		}
		local274 -= Static69.anInt1060;
		local296 -= Static69.anInt1060;
		local312 = local274 > 0 ? local296 * 100 / local274 : 100;
		if (!local350 && local312 > 99) {
			local312 = 99;
		}
		return local312;
	}
}
