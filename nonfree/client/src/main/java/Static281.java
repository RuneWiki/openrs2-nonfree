import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!oc", name = "X", descriptor = "Lclient!vo;")
	public static Class253 aClass253_4;

	@OriginalMember(owner = "client!oc", name = "S", descriptor = "[[B")
	public static final byte[][] aByteArrayArray19 = new byte[250][];

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BIIIIIII)V")
	public static void method4259(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = arg6;
		@Pc(15) int local15 = 0;
		@Pc(19) int local19 = arg4 - arg0;
		@Pc(23) int local23 = arg6 - arg0;
		@Pc(27) int local27 = arg4 * arg4;
		@Pc(31) int local31 = arg6 * arg6;
		@Pc(35) int local35 = local19 * local19;
		@Pc(39) int local39 = local23 * local23;
		@Pc(43) int local43 = local31 << 1;
		@Pc(47) int local47 = local27 << 1;
		@Pc(51) int local51 = local39 << 1;
		@Pc(55) int local55 = local35 << 1;
		@Pc(59) int local59 = arg6 << 1;
		@Pc(63) int local63 = local23 << 1;
		@Pc(72) int local72 = local43 + local27 * (1 - local59);
		@Pc(81) int local81 = local31 - (local59 - 1) * local47;
		@Pc(90) int local90 = local51 + local35 * (1 - local63);
		@Pc(99) int local99 = local39 - local55 * (local63 - 1);
		@Pc(103) int local103 = local27 << 2;
		@Pc(107) int local107 = local31 << 2;
		@Pc(111) int local111 = local35 << 2;
		@Pc(115) int local115 = local39 << 2;
		@Pc(119) int local119 = local43 * 3;
		@Pc(125) int local125 = local47 * (local59 - 3);
		@Pc(129) int local129 = local51 * 3;
		@Pc(135) int local135 = local55 * (local63 - 3);
		@Pc(137) int local137 = local107;
		@Pc(143) int local143 = (arg6 - 1) * local103;
		@Pc(145) int local145 = local115;
		@Pc(151) int local151 = (local23 - 1) * local111;
		@Pc(155) int[] local155 = Static62.anIntArrayArray7[arg5];
		Static298.method4405(local155, arg3, arg1 - local19, -arg4 + arg1);
		Static298.method4405(local155, arg2, local19 + arg1, -local19 + arg1);
		Static298.method4405(local155, arg3, arg4 + arg1, local19 + arg1);
		while (local13 > 0) {
			@Pc(199) boolean local199 = local13 <= local23;
			if (local199) {
				if (local90 < 0) {
					while (local90 < 0) {
						local90 += local129;
						local99 += local145;
						local129 += local115;
						local145 += local115;
						local15++;
					}
				}
				if (local99 < 0) {
					local90 += local129;
					local99 += local145;
					local15++;
					local129 += local115;
					local145 += local115;
				}
				local90 += -local151;
				local99 += -local135;
				local151 -= local111;
				local135 -= local111;
			}
			if (local72 < 0) {
				while (local72 < 0) {
					local81 += local137;
					local72 += local119;
					local119 += local107;
					local11++;
					local137 += local107;
				}
			}
			if (local81 < 0) {
				local81 += local137;
				local72 += local119;
				local119 += local107;
				local137 += local107;
				local11++;
			}
			local81 += -local125;
			local72 += -local143;
			local125 -= local103;
			local13--;
			local143 -= local103;
			@Pc(342) int local342 = arg5 - local13;
			@Pc(346) int local346 = local13 + arg5;
			@Pc(351) int local351 = arg1 + local11;
			@Pc(355) int local355 = arg1 - local11;
			if (local199) {
				@Pc(362) int local362 = arg1 + local15;
				@Pc(367) int local367 = arg1 - local15;
				Static298.method4405(Static62.anIntArrayArray7[local342], arg3, local367, local355);
				Static298.method4405(Static62.anIntArrayArray7[local342], arg2, local362, local367);
				Static298.method4405(Static62.anIntArrayArray7[local342], arg3, local351, local362);
				Static298.method4405(Static62.anIntArrayArray7[local346], arg3, local367, local355);
				Static298.method4405(Static62.anIntArrayArray7[local346], arg2, local362, local367);
				Static298.method4405(Static62.anIntArrayArray7[local346], arg3, local351, local362);
			} else {
				Static298.method4405(Static62.anIntArrayArray7[local342], arg3, local351, local355);
				Static298.method4405(Static62.anIntArrayArray7[local346], arg3, local351, local355);
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!eq;ILclient!he;)V")
	public static void method4261(@OriginalArg(0) Class66 arg0, @OriginalArg(2) Class100 arg1) {
		@Pc(10) Class194[] local10 = Static458.method4492(arg1, Static231.anInt7985);
		Static85.aClass87Array5 = new Class87[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static85.aClass87Array5[local16] = arg0.method5038(local10[local16]);
		}
		local10 = Static458.method4492(arg1, Static367.anInt6660);
		Static151.aClass87Array7 = new Class87[local10.length];
		for (@Pc(47) int local47 = 0; local47 < local10.length; local47++) {
			Static151.aClass87Array7[local47] = arg0.method5038(local10[local47]);
		}
		local10 = Static458.method4492(arg1, Static369.anInt4261);
		Static38.aClass87Array2 = new Class87[local10.length];
		for (@Pc(78) int local78 = 0; local78 < local10.length; local78++) {
			Static38.aClass87Array2[local78] = arg0.method5038(local10[local78]);
		}
		local10 = Static458.method4492(arg1, Static257.anInt4679);
		Static77.aClass87Array4 = new Class87[local10.length];
		for (@Pc(109) int local109 = 0; local109 < local10.length; local109++) {
			Static77.aClass87Array4[local109] = arg0.method5038(local10[local109]);
		}
		local10 = Static458.method4492(arg1, Static392.anInt5059);
		Static311.aClass87Array15 = new Class87[local10.length];
		for (@Pc(140) int local140 = 0; local140 < local10.length; local140++) {
			Static311.aClass87Array15[local140] = arg0.method5038(local10[local140]);
		}
		local10 = Static458.method4492(arg1, Static133.anInt6880);
		Static227.aClass87Array13 = new Class87[local10.length];
		for (@Pc(171) int local171 = 0; local171 < local10.length; local171++) {
			Static227.aClass87Array13[local171] = arg0.method5038(local10[local171]);
		}
		local10 = Static458.method4492(arg1, Static211.anInt3898);
		Static340.aClass87Array16 = new Class87[local10.length];
		for (@Pc(198) int local198 = 0; local198 < local10.length; local198++) {
			Static340.aClass87Array16[local198] = arg0.method5038(local10[local198]);
		}
		local10 = Static458.method4492(arg1, Static67.anInt1775);
		Static201.aClass87Array14 = new Class87[local10.length];
		for (@Pc(229) int local229 = 0; local229 < local10.length; local229++) {
			Static201.aClass87Array14[local229] = arg0.method5038(local10[local229]);
		}
		local10 = Static458.method4492(arg1, Static284.anInt5108);
		Static404.aClass87Array17 = new Class87[local10.length];
		for (@Pc(256) int local256 = 0; local256 < local10.length; local256++) {
			Static404.aClass87Array17[local256] = arg0.method5038(local10[local256]);
		}
		local10 = Static458.method4492(arg1, Static321.anInt5549);
		Static192.aClass87Array10 = new Class87[local10.length];
		for (@Pc(295) int local295 = 0; local295 < local10.length; local295++) {
			Static192.aClass87Array10[local295] = arg0.method5038(local10[local295]);
		}
		local10 = Static458.method4492(arg1, Static209.anInt2669);
		Static211.aClass87Array12 = new Class87[local10.length];
		for (@Pc(326) int local326 = 0; local326 < local10.length; local326++) {
			Static211.aClass87Array12[local326] = arg0.method5038(local10[local326]);
		}
		local10 = Static458.method4492(arg1, Static276.anInt4961);
		Static15.aClass87Array1 = new Class87[local10.length];
		for (@Pc(353) int local353 = 0; local353 < local10.length; local353++) {
			Static15.aClass87Array1[local353] = arg0.method5038(local10[local353]);
		}
		Static41.aClass87_4 = arg0.method5038(Static458.method4494(arg1, Static403.anInt7238, 0));
		Static172.aClass87_11 = arg0.method5038(Static458.method4494(arg1, Static86.anInt1025, 0));
		local10 = Static458.method4492(arg1, Static6.anInt255);
		Static95.aClass87Array6 = new Class87[local10.length];
		for (@Pc(396) int local396 = 0; local396 < local10.length; local396++) {
			Static95.aClass87Array6[local396] = arg0.method5038(local10[local396]);
		}
	}
}
