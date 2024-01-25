import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static662 {

	@OriginalMember(owner = "client!wj", name = "j", descriptor = "Lclient!aq;")
	public static final Class22 aClass22_62 = new Class22(8);

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)[Lclient!vb;")
	public static Class368[] method8953() {
		return new Class368[] { Static549.aClass368_18, Static213.aClass368_10, Static536.aClass368_12, Static53.aClass368_2, Static165.aClass368_9, Static634.aClass368_23, Static640.aClass368_24, Static505.aClass368_20, Static42.aClass368_1, Static108.aClass368_3, Static471.aClass368_17, Static610.aClass368_22, Static503.aClass368_16, Static304.aClass368_21, Static282.aClass368_13 };
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIB)Z")
	public static boolean method8954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIILclient!ha;IILclient!d;)V")
	public static void method8956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class101 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Interface3 arg5) {
		if (Static95.anInt1689 < 100) {
			Static459.method7365(arg2, arg5);
		}
		arg2.KA(arg0, arg1, arg4 + arg0, arg1 - -arg3);
		@Pc(36) int local36;
		@Pc(48) int local48;
		if (Static95.anInt1689 < 100) {
			local36 = arg4 / 2 + arg0;
			local48 = arg1 + arg3 / 2 - 38;
			arg2.aa(arg0, arg1, arg4, arg3, -16777216, 0);
			arg2.method8129(local36 - 152, local48, 304, 34, Static173.aColorArray2[Static587.anInt10244].getRGB(), 0);
			arg2.aa(local36 - 150, local48 + 2, Static95.anInt1689 * 3, 30, Static61.aColorArray1[Static587.anInt10244].getRGB(), 0);
			Static253.aClass59_5.method9585(local36, Static205.aClass134_18.method3906(Static204.anInt8130), Static408.aColorArray3[Static587.anInt10244].getRGB(), -1, local48 + 20);
			return;
		}
		@Pc(112) int local112 = Static43.anInt8888 - (int) ((float) arg4 / Static331.aFloat187);
		local36 = Static609.anInt10718 + (int) ((float) arg3 / Static331.aFloat187);
		local48 = (int) ((float) arg4 / Static331.aFloat187) + Static43.anInt8888;
		Static251.anInt4886 = Static43.anInt8888 - (int) ((float) arg4 / Static331.aFloat187);
		Static261.anInt4995 = Static609.anInt10718 - (int) ((float) arg3 / Static331.aFloat187);
		@Pc(155) int local155 = Static609.anInt10718 - (int) ((float) arg3 / Static331.aFloat187);
		Static203.anInt4264 = (int) ((float) (arg4 * 2) / Static331.aFloat187);
		Static322.anInt5896 = (int) ((float) (arg3 * 2) / Static331.aFloat187);
		Static331.method9067(local112 + Static331.anInt10589, local36 + Static331.anInt10590, local48 + Static331.anInt10589, Static331.anInt10590 + local155, arg0, arg1, arg4 + arg0, arg3 + arg1 - -1);
		Static331.method9069(arg2);
		@Pc(205) Class271 local205 = Static331.method9078(arg2);
		Static461.method7374(local205, arg2);
		if (Static240.anInt4759 > 0) {
			Static542.anInt9479--;
			if (Static542.anInt9479 == 0) {
				Static542.anInt9479 = 20;
				Static240.anInt4759--;
			}
		}
		if (!Static586.aBoolean742) {
			return;
		}
		@Pc(236) int local236 = arg4 + arg0 - 5;
		@Pc(242) int local242 = arg3 + arg1 - 8;
		Static230.aClass59_3.method9570(16776960, "Fps:" + Static645.anInt10074, -1, local236, local242);
		@Pc(257) int local257 = local242 - 15;
		@Pc(259) Runtime local259 = Runtime.getRuntime();
		@Pc(269) int local269 = (int) ((local259.totalMemory() - local259.freeMemory()) / 1024L);
		@Pc(271) int local271 = 16776960;
		if (local269 > 65536) {
			local271 = 16711680;
		}
		Static230.aClass59_3.method9570(local271, "Mem:" + local269 + "k", -1, local236, local257);
		local242 = local257 - 15;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!r;III[Z)Z")
	public static boolean method8957(@OriginalArg(0) Class2_Sub1_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static245.aClass18Array14 != Static93.aClass18Array33) {
			@Pc(12) int local12 = Static549.aClass18Array30[arg1].method8542(arg3, arg2);
			for (@Pc(14) int local14 = 0; local14 <= arg1; local14++) {
				@Pc(19) Class18 local19 = Static549.aClass18Array30[local14];
				if (local19 != null) {
					@Pc(29) int local29 = local12 - local19.method8542(arg3, arg2);
					if (arg4 != null) {
						arg4[local14] = local19.method8541(arg0, arg2, local29, arg3);
						if (!arg4[local14]) {
							continue;
						}
					}
					local19.CA(arg0, arg2, local29, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method8958(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static645.anInt10075 >= 100) {
			Static439.method7152(Static205.aClass134_39.method3906(Static204.anInt8130));
			return;
		}
		@Pc(25) String local25 = Static426.method9517(arg1);
		if (local25 == null) {
			return;
		}
		@Pc(69) String local69;
		for (@Pc(30) int local30 = 0; local30 < Static645.anInt10075; local30++) {
			@Pc(38) String local38 = Static426.method9517(Static587.aStringArray74[local30]);
			if (local38 != null && local38.equals(local25)) {
				Static439.method7152(arg1 + Static205.aClass134_40.method3906(Static204.anInt8130));
				return;
			}
			if (Static622.aStringArray79[local30] != null) {
				local69 = Static426.method9517(Static622.aStringArray79[local30]);
				if (local69 != null && local69.equals(local25)) {
					Static439.method7152(arg1 + Static205.aClass134_40.method3906(Static204.anInt8130));
					return;
				}
			}
		}
		for (@Pc(105) int local105 = 0; local105 < Static340.anInt6395; local105++) {
			local69 = Static426.method9517(Static438.aStringArray47[local105]);
			if (local69 != null && local69.equals(local25)) {
				Static439.method7152(Static205.aClass134_45.method3906(Static204.anInt8130) + arg1 + Static205.aClass134_46.method3906(Static204.anInt8130));
				return;
			}
			if (Static520.aStringArray59[local105] != null) {
				@Pc(149) String local149 = Static426.method9517(Static520.aStringArray59[local105]);
				if (local149 != null && local149.equals(local25)) {
					Static439.method7152(Static205.aClass134_45.method3906(Static204.anInt8130) + arg1 + Static205.aClass134_46.method3906(Static204.anInt8130));
					return;
				}
			}
		}
		if (Static426.method9517(Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aString29).equals(local25)) {
			Static439.method7152(Static205.aClass134_42.method3906(Static204.anInt8130));
			return;
		}
		@Pc(203) Class2_Sub52 local203 = Static311.method5098(Static636.aClass341_109, Static125.aClass179_1);
		local203.aClass2_Sub8_Sub2_2.method5170(Static297.method4908(arg1) + 1);
		local203.aClass2_Sub8_Sub2_2.method5212(arg1);
		local203.aClass2_Sub8_Sub2_2.method5170(arg0 ? 1 : 0);
		Static38.method791(local203);
	}
}
