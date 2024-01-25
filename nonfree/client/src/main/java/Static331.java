import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!vg", name = "L", descriptor = "[[S")
	public static short[][] aShortArrayArray7;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IILclient!be;I)V")
	public static void method5386(@OriginalArg(1) int arg0, @OriginalArg(2) Class17_Sub1_Sub1_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11;
		@Pc(28) int local28;
		if ((arg0 & 0x800) != 0) {
			local11 = Static311.aClass1_Sub8_Sub1_8.method4552();
			@Pc(14) int[] local14 = new int[local11];
			@Pc(17) int[] local17 = new int[local11];
			@Pc(20) int[] local20 = new int[local11];
			for (@Pc(22) int local22 = 0; local22 < local11; local22++) {
				local28 = Static311.aClass1_Sub8_Sub1_8.method4547();
				if (local28 == 65535) {
					local28 = -1;
				}
				local14[local22] = local28;
				local17[local22] = Static311.aClass1_Sub8_Sub1_8.method4536();
				local20[local22] = Static311.aClass1_Sub8_Sub1_8.method4547();
			}
			Static24.method666(local17, local20, arg1, local14);
		}
		if ((arg0 & 0x100) != 0) {
			local11 = Static311.aClass1_Sub8_Sub1_8.method4538();
			arg1.anInt4866 = Static311.aClass1_Sub8_Sub1_8.method4536();
			arg1.anInt4879 = Static311.aClass1_Sub8_Sub1_8.method4541();
			arg1.aBoolean470 = (local11 & 0x8000) != 0;
			arg1.anInt4878 = local11 & 0x7FFF;
			arg1.anInt4849 = Static5.anInt208 + arg1.anInt4878 + arg1.anInt4866;
		}
		if ((arg0 & 0x20) != 0) {
			arg1.aString50 = Static311.aClass1_Sub8_Sub1_8.method4534();
			if (arg1.aString50.charAt(0) == '~') {
				arg1.aString50 = arg1.aString50.substring(1);
				Static114.method3916(arg1.method563(), arg1.method562(), 2, 0, arg1.aString50);
			} else if (arg1 == Static198.aClass17_Sub1_Sub1_Sub1_3) {
				Static114.method3916(arg1.method563(), arg1.method562(), 2, 0, arg1.aString50);
			}
			arg1.anInt4880 = 150;
			arg1.anInt4823 = 0;
			arg1.anInt4851 = 0;
		}
		if ((arg0 & 0x2) != 0) {
			local11 = Static311.aClass1_Sub8_Sub1_8.method4532();
			@Pc(193) byte[] local193 = new byte[local11];
			@Pc(198) Class1_Sub8 local198 = new Class1_Sub8(local193);
			Static311.aClass1_Sub8_Sub1_8.method4519(local11, local193);
			Static313.aClass1_Sub8Array1[arg2] = local198;
			arg1.method564(local198);
		}
		@Pc(224) int local224;
		if ((arg0 & 0x80) != 0) {
			local11 = Static311.aClass1_Sub8_Sub1_8.method4528();
			local224 = Static311.aClass1_Sub8_Sub1_8.method4541();
			arg1.method4325(local11, Static5.anInt208, local224);
			arg1.lb = Static5.anInt208 + 300;
			arg1.anInt4831 = Static311.aClass1_Sub8_Sub1_8.method4541();
		}
		if ((arg0 & 0x40) != 0) {
			arg1.anInt4829 = Static311.aClass1_Sub8_Sub1_8.method4556();
			if (arg1.anInt4829 == 65535) {
				arg1.anInt4829 = -1;
			}
		}
		@Pc(281) int local281;
		if ((arg0 & 0x1) != 0) {
			local11 = Static311.aClass1_Sub8_Sub1_8.method4538();
			local224 = Static311.aClass1_Sub8_Sub1_8.method4541();
			@Pc(278) int local278 = Static311.aClass1_Sub8_Sub1_8.method4541();
			local281 = Static311.aClass1_Sub8_Sub1_8.anInt5182;
			@Pc(292) boolean local292 = (local11 & 0x8000) != 0;
			if (arg1.aString13 != null && arg1.aClass60_1 != null) {
				@Pc(300) boolean local300 = false;
				if (local224 <= 1) {
					if (!local292 && (Static87.aBoolean206 && !Static278.aBoolean548 || Static145.aBoolean302)) {
						local300 = true;
					} else if (Static110.method5414(arg1.aString13)) {
						local300 = true;
					}
				}
				if (!local300 && Static1.anInt36 == 0) {
					Static22.aClass1_Sub8_6.anInt5182 = 0;
					Static311.aClass1_Sub8_Sub1_8.method4543(Static22.aClass1_Sub8_6.aByteArray81, local278);
					Static22.aClass1_Sub8_6.anInt5182 = 0;
					@Pc(344) int local344 = -1;
					@Pc(363) String local363;
					if (local292) {
						local11 &= 0x7FFF;
						@Pc(354) Class172 local354 = Static202.method3828(Static22.aClass1_Sub8_6);
						local344 = local354.anInt5346;
						local363 = local354.aClass1_Sub4_Sub11_1.method2089(Static22.aClass1_Sub8_6);
					} else {
						local363 = method5388(Static239.method4370(Static132.method2705(Static22.aClass1_Sub8_6)));
					}
					arg1.aString50 = local363.trim();
					arg1.anInt4880 = 150;
					arg1.anInt4823 = local11 & 0xFF;
					arg1.anInt4851 = local11 >> 8;
					@Pc(404) int local404;
					if (local224 == 1 || local224 == 2) {
						local404 = local292 ? 17 : 1;
					} else {
						local404 = local292 ? 17 : 2;
					}
					if (local224 == 2) {
						Static158.method3155(local344, local363, null, "<img=1>" + arg1.method563(), local404, "<img=1>" + arg1.method562(), 0);
					} else if (local224 == 1) {
						Static158.method3155(local344, local363, null, "<img=0>" + arg1.method563(), local404, "<img=0>" + arg1.method562(), 0);
					} else {
						Static158.method3155(local344, local363, null, arg1.method563(), local404, arg1.method562(), 0);
					}
				}
			}
			Static311.aClass1_Sub8_Sub1_8.anInt5182 = local278 + local281;
		}
		if ((arg0 & 0x400) != 0) {
			local11 = Static311.aClass1_Sub8_Sub1_8.method4528();
			local224 = Static311.aClass1_Sub8_Sub1_8.method4552();
			arg1.method4325(local11, Static5.anInt208, local224);
		}
		if ((arg0 & 0x1000) != 0) {
			local11 = Static311.aClass1_Sub8_Sub1_8.method4547();
			if (local11 == 65535) {
				local11 = -1;
			}
			local224 = Static311.aClass1_Sub8_Sub1_8.method4539();
			@Pc(545) boolean local545 = true;
			@Pc(614) Class24 local614;
			if (local11 != -1 && arg1.anInt4884 != -1) {
				@Pc(561) Class67 local561;
				if (local11 == arg1.anInt4884) {
					local561 = Static265.method5633(local11);
					if (local561.aBoolean193 && local561.anInt2088 != -1) {
						local614 = Static110.method5411(local561.anInt2088);
						local28 = local614.anInt1037;
						if (local28 == 0) {
							local545 = false;
						} else if (local28 == 1) {
							local545 = true;
						} else if (local28 == 2) {
							local545 = false;
							arg1.anInt4828 = 0;
						}
					}
				} else {
					local561 = Static265.method5633(local11);
					@Pc(566) Class67 local566 = Static265.method5633(arg1.anInt4884);
					if (local561.anInt2088 != -1 && local566.anInt2088 != -1) {
						@Pc(579) Class24 local579 = Static110.method5411(local561.anInt2088);
						@Pc(584) Class24 local584 = Static110.method5411(local566.anInt2088);
						if (local579.anInt1051 < local584.anInt1051) {
							local545 = false;
						}
					}
				}
			}
			if (local545) {
				arg1.anInt4845 = Static5.anInt208 + (local224 & 0xFFFF);
				arg1.anInt4881 = 0;
				arg1.anInt4855 = 0;
				arg1.anInt4844 = local224 >> 16;
				arg1.anInt4884 = local11;
				arg1.anInt4833 = 1;
				if (arg1.anInt4845 > Static5.anInt208) {
					arg1.anInt4881 = -1;
				}
				if (arg1.anInt4884 != -1 && arg1.anInt4845 == Static5.anInt208) {
					local281 = Static265.method5633(arg1.anInt4884).anInt2088;
					if (local281 != -1) {
						local614 = Static110.method5411(local281);
						if (local614 != null && local614.anIntArray90 != null) {
							Static318.method5216(arg1.anInt5109, arg1.anInt5108, Static198.aClass17_Sub1_Sub1_Sub1_3 == arg1, local614, 0);
						}
					}
				}
			}
		}
		if ((arg0 & 0x8) != 0) {
			arg1.anInt4859 = Static311.aClass1_Sub8_Sub1_8.method4520();
			arg1.anInt4820 = Static311.aClass1_Sub8_Sub1_8.method4547();
		}
		if ((arg0 & 0x4) != 0) {
			local11 = Static311.aClass1_Sub8_Sub1_8.method4520();
			if (local11 == 65535) {
				local11 = -1;
			}
			local224 = Static311.aClass1_Sub8_Sub1_8.method4532();
			Static127.method2625(arg1, local11, local224);
		}
		if ((arg0 & 0x200) == 0) {
			return;
		}
		arg1.anInt4825 = Static311.aClass1_Sub8_Sub1_8.method4541();
		arg1.anInt4862 = Static311.aClass1_Sub8_Sub1_8.method4532();
		arg1.anInt4843 = Static311.aClass1_Sub8_Sub1_8.method4552();
		arg1.anInt4846 = Static311.aClass1_Sub8_Sub1_8.method4532();
		arg1.anInt4873 = Static311.aClass1_Sub8_Sub1_8.method4538() + Static5.anInt208;
		arg1.anInt4868 = Static311.aClass1_Sub8_Sub1_8.method4547() + Static5.anInt208;
		arg1.anInt4826 = Static311.aClass1_Sub8_Sub1_8.method4541();
		arg1.anInt4893 = 1;
		arg1.anInt4897 = 0;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method5388(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 == '<' || local23 == '>') {
				local10 += 3;
			}
		}
		@Pc(43) StringBuffer local43 = new StringBuffer(local10 + local8);
		for (@Pc(45) int local45 = 0; local45 < local8; local45++) {
			@Pc(51) char local51 = arg0.charAt(local45);
			if (local51 == '<') {
				local43.append("<lt>");
			} else if (local51 == '>') {
				local43.append("<gt>");
			} else {
				local43.append(local51);
			}
		}
		return local43.toString();
	}
}
