import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!op", name = "e", descriptor = "F")
	public static float aFloat137;

	@OriginalMember(owner = "client!op", name = "a", descriptor = "Lclient!da;")
	public static Class68 aClass68_8;

	@OriginalMember(owner = "client!op", name = "b", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!op", name = "d", descriptor = "I")
	public static int anInt7495 = 0;

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(I)I")
	public static int method6636() {
		if (Static388.anInt6780 == 0) {
			Static508.aClass303_2.method7615(new Class237("jaclib"));
			if (Static508.aClass303_2.method7614().method6097() != 100) {
				return 1;
			}
			if (!((Class237) Static508.aClass303_2.method7614()).method5862()) {
				Static105.aClient4.method1343();
			}
			Static388.anInt6780 = 1;
		}
		@Pc(276) int local276;
		@Pc(304) int local304;
		@Pc(322) int local322;
		@Pc(328) int local328;
		if (Static388.anInt6780 == 1) {
			Static7.aClass303Array1 = Static508.method7618();
			Static508.aClass303_1.method7615(new Class246(Static4.aClass310_1));
			Static508.aClass303_3.method7615(new Class237("jaggl"));
			Static508.aClass303_4.method7615(new Class237("jagdx"));
			Static508.aClass303_5.method7615(new Class237("jagmisc"));
			Static508.aClass303_6.method7615(new Class237("sw3d"));
			Static508.aClass303_7.method7615(new Class237("hw3d"));
			Static508.aClass303_8.method7615(new Class237("jagtheora"));
			Static508.aClass303_9.method7615(new Class246(Static75.aClass310_17));
			Static508.aClass303_10.method7615(new Class246(Static334.aClass310_65));
			Static508.aClass303_11.method7615(new Class246(Static376.aClass310_102));
			Static508.aClass303_12.method7615(new Class246(Static403.aClass310_85));
			Static508.aClass303_13.method7615(new Class246(Static192.aClass310_135));
			Static508.aClass303_14.method7615(new Class246(Static524.aClass310_114));
			Static508.aClass303_15.method7615(new Class246(Static525.aClass310_105));
			Static508.aClass303_16.method7615(new Class246(Static214.aClass310_47));
			Static508.aClass303_17.method7615(new Class246(Static129.aClass310_28));
			Static508.aClass303_18.method7615(new Class246(Static604.aClass310_118));
			Static508.aClass303_19.method7615(new Class246(Static228.aClass310_50));
			Static508.aClass303_20.method7615(new Class246(Static65.aClass310_16));
			Static508.aClass303_21.method7615(new Class246(Static31.aClass310_8));
			Static508.aClass303_22.method7615(new Class246(Static97.aClass310_22));
			Static508.aClass303_23.method7615(new Class216(Static358.aClass310_73, "huffman"));
			Static508.aClass303_24.method7615(new Class246(Static396.aClass310_81));
			Static508.aClass303_25.method7615(new Class246(Static413.aClass310_89));
			Static508.aClass303_26.method7615(new Class246(Static130.aClass310_31));
			Static508.aClass303_27.method7615(new Class182(Static123.aClass310_26, "details"));
			for (local276 = 0; local276 < Static7.aClass303Array1.length; local276++) {
				if (Static7.aClass303Array1[local276].method7614() == null) {
					throw new RuntimeException();
				}
			}
			local304 = 0;
			@Pc(306) Class303[] local306 = Static7.aClass303Array1;
			for (@Pc(308) int local308 = 0; local308 < local306.length; local308++) {
				@Pc(316) Class303 local316 = local306[local308];
				local322 = local316.method7619();
				local328 = local316.method7614().method6097();
				local304 += local322 * local328 / 100;
			}
			Static513.anInt8431 = local304;
			Static388.anInt6780 = 2;
		}
		if (Static7.aClass303Array1 == null) {
			return 100;
		}
		local276 = 0;
		local304 = 0;
		@Pc(362) boolean local362 = true;
		@Pc(364) Class303[] local364 = Static7.aClass303Array1;
		for (@Pc(373) int local373 = 0; local373 < local364.length; local373++) {
			@Pc(379) Class303 local379 = local364[local373];
			local328 = local379.method7619();
			@Pc(391) int local391 = local379.method7614().method6097();
			local304 += local391 * local328 / 100;
			local276 += local328;
			if (local391 < 100) {
				local362 = false;
			}
		}
		if (local362) {
			if (!((Class237) Static508.aClass303_5.method7614()).method5862()) {
				Static105.aClient4.method1354();
			}
			if (!((Class237) Static508.aClass303_8.method7614()).method5862()) {
				Static665.aBoolean758 = Static105.aClient4.method1339();
			}
			Static7.aClass303Array1 = null;
		}
		local304 -= Static513.anInt8431;
		local276 -= Static513.anInt8431;
		local322 = local276 > 0 ? local304 * 100 / local276 : 100;
		if (!local362 && local322 > 99) {
			local322 = 99;
		}
		return local322;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(III)Lclient!in;")
	public static Class4_Sub3_Sub4 method6638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class89 local7 = Static63.aClass89ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(15) Class4_Sub3_Sub4 local15 = local7.aClass4_Sub3_Sub4_1;
			local7.aClass4_Sub3_Sub4_1 = null;
			Static50.method919(local15);
			return local15;
		}
	}
}
