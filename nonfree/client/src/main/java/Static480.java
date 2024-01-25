import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static480 {

	@OriginalMember(owner = "client!qha", name = "p", descriptor = "Lclient!la;")
	public static Class208 aClass208_111;

	@OriginalMember(owner = "client!qha", name = "c", descriptor = "Lclient!ef;")
	public static Class102 aClass102_51 = new Class102();

	@OriginalMember(owner = "client!qha", name = "b", descriptor = "(BI)V")
	public static void method6988(@OriginalArg(1) int arg0) {
		@Pc(9) Class5_Sub5_Sub6 local9 = Static478.method6972((long) arg0, 17);
		local9.method2686();
	}

	@OriginalMember(owner = "client!qha", name = "b", descriptor = "(I)I")
	public static int method6994() {
		if (Static137.anInt2259 == 0) {
			Static601.aClass347_2.method8653(new Class258("jaclib"));
			if (Static601.aClass347_2.method8654().method9042() != 100) {
				return 1;
			}
			if (!((Class258) Static601.aClass347_2.method8654()).method6195()) {
				Static454.aClient1.method1242();
			}
			Static137.anInt2259 = 1;
		}
		@Pc(270) int local270;
		@Pc(296) int local296;
		@Pc(312) int local312;
		@Pc(318) int local318;
		if (Static137.anInt2259 == 1) {
			Static525.aClass347Array5 = Static601.method8650();
			Static601.aClass347_1.method8653(new Class207(Static253.aClass208_58));
			Static601.aClass347_3.method8653(new Class258("jaggl"));
			Static601.aClass347_4.method8653(new Class258("jagdx"));
			Static601.aClass347_5.method8653(new Class258("jagmisc"));
			Static601.aClass347_6.method8653(new Class258("sw3d"));
			Static601.aClass347_7.method8653(new Class258("hw3d"));
			Static601.aClass347_8.method8653(new Class258("jagtheora"));
			Static601.aClass347_9.method8653(new Class207(Static226.aClass208_56));
			Static601.aClass347_10.method8653(new Class207(Static26.aClass208_2));
			Static601.aClass347_11.method8653(new Class207(Static449.aClass208_104));
			Static601.aClass347_12.method8653(new Class207(Static404.aClass208_93));
			Static601.aClass347_13.method8653(new Class207(Static43.aClass208_9));
			Static601.aClass347_14.method8653(new Class207(Static292.aClass208_65));
			Static601.aClass347_15.method8653(new Class207(Static348.aClass208_79));
			Static601.aClass347_16.method8653(new Class207(Static264.aClass208_59));
			Static601.aClass347_17.method8653(new Class207(Static289.aClass208_148));
			Static601.aClass347_18.method8653(new Class207(Static275.aClass208_63));
			Static601.aClass347_19.method8653(new Class207(Static106.aClass208_19));
			Static601.aClass347_20.method8653(new Class207(Static400.aClass208_90));
			Static601.aClass347_21.method8653(new Class207(Static69.aClass208_12));
			Static601.aClass347_22.method8653(new Class207(Static451.aClass208_105));
			Static601.aClass347_23.method8653(new Class209(Static265.aClass208_60, "huffman"));
			Static601.aClass347_24.method8653(new Class207(Static491.aClass208_114));
			Static601.aClass347_25.method8653(new Class207(Static343.aClass208_76));
			Static601.aClass347_26.method8653(new Class207(Static85.aClass208_16));
			Static601.aClass347_27.method8653(new Class380(Static529.aClass208_117, "details"));
			for (local270 = 0; local270 < Static525.aClass347Array5.length; local270++) {
				if (Static525.aClass347Array5[local270].method8654() == null) {
					throw new RuntimeException();
				}
			}
			local296 = 0;
			@Pc(298) Class347[] local298 = Static525.aClass347Array5;
			for (@Pc(300) int local300 = 0; local300 < local298.length; local300++) {
				@Pc(308) Class347 local308 = local298[local300];
				local312 = local308.method8647();
				local318 = local308.method8654().method9042();
				local296 += local318 * local312 / 100;
			}
			Static100.anInt1603 = local296;
			Static137.anInt2259 = 2;
		}
		if (Static525.aClass347Array5 == null) {
			return 100;
		}
		local270 = 0;
		local296 = 0;
		@Pc(352) boolean local352 = true;
		@Pc(354) Class347[] local354 = Static525.aClass347Array5;
		for (@Pc(356) int local356 = 0; local356 < local354.length; local356++) {
			@Pc(362) Class347 local362 = local354[local356];
			local318 = local362.method8647();
			@Pc(372) int local372 = local362.method8654().method9042();
			local270 += local318;
			local296 += local372 * local318 / 100;
			if (local372 < 100) {
				local352 = false;
			}
		}
		if (local352) {
			if (!((Class258) Static601.aClass347_5.method8654()).method6195()) {
				Static454.aClient1.method1231();
			}
			if (!((Class258) Static601.aClass347_8.method8654()).method6195()) {
				Static522.aBoolean666 = Static454.aClient1.method1232();
			}
			Static525.aClass347Array5 = null;
		}
		local270 -= Static100.anInt1603;
		local296 -= Static100.anInt1603;
		local312 = local270 > 0 ? local296 * 100 / local270 : 100;
		if (!local352 && local312 > 99) {
			local312 = 99;
		}
		return local312;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(BI)I")
	public static int method6996(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}
