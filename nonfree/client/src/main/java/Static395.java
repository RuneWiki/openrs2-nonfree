import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "F")
	public static float aFloat147;

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "[B")
	public static byte[] aByteArray62;

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_219 = new Class194(28, 4);

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
	public static void method6221() {
		Static503.aClass136_57.method3142();
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BII)I")
	public static int method6222(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) double local10 = Math.log((double) arg1) / Math.log(2.0D);
		@Pc(25) double local25 = Math.log((double) arg0) / Math.log(2.0D);
		@Pc(34) double local34 = Math.random() * (local10 - local25) + local25;
		return (int) (Math.pow(2.0D, local34) + 0.5D);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZII)Z")
	public static boolean method6223(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)I")
	public static int method6225() {
		if (Static129.anInt2734 == 0) {
			Static408.aClass252_2.method6349(new Class151("jaclib"));
			if (Static408.aClass252_2.method6350().method8097() != 100) {
				return 1;
			}
			if (!((Class151) Static408.aClass252_2.method6350()).method3858()) {
				Static554.aClient1.method1303();
			}
			Static129.anInt2734 = 1;
		}
		@Pc(228) int local228;
		@Pc(251) int local251;
		@Pc(265) int local265;
		@Pc(271) int local271;
		if (Static129.anInt2734 == 1) {
			Static428.aClass252Array1 = Static408.method6347();
			Static408.aClass252_1.method6349(new Class14(Static50.aClass343_36));
			Static408.aClass252_3.method6349(new Class151("jaggl"));
			Static408.aClass252_4.method6349(new Class151("jagdx"));
			Static408.aClass252_5.method6349(new Class151("jagmisc"));
			Static408.aClass252_6.method6349(new Class151("sw3d"));
			Static408.aClass252_7.method6349(new Class151("hw3d"));
			Static408.aClass252_8.method6349(new Class151("jagtheora"));
			Static408.aClass252_9.method6349(new Class14(Static567.aClass343_251));
			Static408.aClass252_10.method6349(new Class14(Static94.aClass343_55));
			Static408.aClass252_11.method6349(new Class14(Static605.aClass343_260));
			Static408.aClass252_12.method6349(new Class14(Static202.aClass343_101));
			Static408.aClass252_13.method6349(new Class14(Static258.aClass343_131));
			Static408.aClass252_14.method6349(new Class14(Static632.aClass343_268));
			Static408.aClass252_15.method6349(new Class14(Static509.aClass343_220));
			Static408.aClass252_16.method6349(new Class14(Static93.aClass343_52));
			Static408.aClass252_17.method6349(new Class14(Static128.aClass343_48));
			Static408.aClass252_18.method6349(new Class14(Static10.aClass343_12));
			Static408.aClass252_19.method6349(new Class14(Static422.aClass343_209));
			Static408.aClass252_20.method6349(new Class14(Static108.aClass343_57));
			Static408.aClass252_21.method6349(new Class14(Static132.aClass343_67));
			Static408.aClass252_22.method6349(new Class14(Static62.aClass343_41));
			Static408.aClass252_23.method6349(new Class337(Static148.aClass343_74, "huffman"));
			Static408.aClass252_24.method6349(new Class14(Static468.aClass343_221));
			Static408.aClass252_25.method6349(new Class14(Static22.aClass343_17));
			Static408.aClass252_26.method6349(new Class14(Static394.aClass343_188));
			Static408.aClass252_27.method6349(new Class224(Static207.aClass343_103, "details"));
			for (local228 = 0; local228 < Static428.aClass252Array1.length; local228++) {
				if (Static428.aClass252Array1[local228].method6350() == null) {
					throw new RuntimeException();
				}
			}
			local251 = 0;
			@Pc(253) Class252[] local253 = Static428.aClass252Array1;
			for (@Pc(255) int local255 = 0; local255 < local253.length; local255++) {
				@Pc(261) Class252 local261 = local253[local255];
				local265 = local261.method6351();
				local271 = local261.method6350().method8097();
				local251 += local265 * local271 / 100;
			}
			Static129.anInt2734 = 2;
			Static240.anInt4752 = local251;
		}
		if (Static428.aClass252Array1 == null) {
			return 100;
		}
		local228 = 0;
		local251 = 0;
		@Pc(304) boolean local304 = true;
		@Pc(306) Class252[] local306 = Static428.aClass252Array1;
		for (@Pc(308) int local308 = 0; local308 < local306.length; local308++) {
			@Pc(314) Class252 local314 = local306[local308];
			local271 = local314.method6351();
			@Pc(324) int local324 = local314.method6350().method8097();
			local228 += local271;
			if (local324 < 100) {
				local304 = false;
			}
			local251 += local271 * local324 / 100;
		}
		if (local304) {
			if (!((Class151) Static408.aClass252_5.method6350()).method3858()) {
				Static554.aClient1.method1309();
			}
			if (!((Class151) Static408.aClass252_8.method6350()).method3858()) {
				Static306.aBoolean440 = Static554.aClient1.method1305();
			}
			Static428.aClass252Array1 = null;
		}
		local228 -= Static240.anInt4752;
		local251 -= Static240.anInt4752;
		local265 = local228 <= 0 ? 100 : local251 * 100 / local228;
		if (!local304 && local265 > 99) {
			local265 = 99;
		}
		return local265;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)Z")
	public static boolean method6226(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static311.method5228(arg0, arg1) & Static585.method8123(arg1, arg0);
	}
}
