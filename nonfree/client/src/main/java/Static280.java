import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!rm", name = "n", descriptor = "Lclient!tg;")
	public static Class221 aClass221_2;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!ld;BLclient!wm;II)V", line = 15)
	public static void method5209(@OriginalArg(0) Class135 arg0, @OriginalArg(2) Class19 arg1) {
		Static184.aClass135_24.method3545();
		if (Class121.aBoolean225) {
			return;
		}
		for (@Pc(20) Class2_Sub20 local20 = (Class2_Sub20) arg0.method3552(); local20 != null; local20 = (Class2_Sub20) arg0.method3553()) {
			@Pc(28) Class164 local28 = Static321.aClass125_4.method3380(local20.anInt2944);
			if (Static94.method2166(local28)) {
				@Pc(40) boolean local40 = Static263.method4924(local20, arg1, local28);
				if (local40) {
					Static223.method4185(local20, local28, arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "(III)I", line = 49)
	public static int method5210(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(22) int local22 = (arg0 & 0x7F) * 96 >> 7;
		if (local22 < 2) {
			local22 = 2;
		} else if (local22 > 126) {
			local22 = 126;
		}
		return (arg0 & 0xFF80) + local22;
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(Z)V", line = 95)
	public static void method5211() {
		@Pc(11) int local11 = Class28.anInt751;
		@Pc(13) int[] local13 = Class64.anIntArray121;
		for (@Pc(15) int local15 = 0; local15 < local11; local15++) {
			@Pc(23) Class11_Sub5_Sub2_Sub1 local23 = Class9.aClass11_Sub5_Sub2_Sub1Array1[local13[local15]];
			if (local23 != null && local23.anInt4627 > 0) {
				local23.anInt4627--;
				if (local23.anInt4627 == 0) {
					local23.aString50 = null;
				}
			}
		}
		for (@Pc(49) int local49 = 0; local49 < Class117.anInt3183; local49++) {
			@Pc(55) int local55 = Class149.anIntArray230[local49];
			@Pc(59) Class11_Sub5_Sub2_Sub2 local59 = Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[local55];
			if (local59 != null && local59.anInt4627 > 0) {
				local59.anInt4627--;
				if (local59.anInt4627 == 0) {
					local59.aString50 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IZ)V", line = 209)
	public static void method5212(@OriginalArg(0) int arg0) {
		if (Class123.anInt3361 == 0) {
			Static85.aClass2_Sub12_Sub3_1.method4279(arg0);
		} else {
			Static331.anInt6628 = arg0;
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!qg;BILclient!nh;I)V", line = 227)
	public static void method5213(@OriginalArg(0) Class2_Sub4_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class11_Sub5_Sub2_Sub1 arg2, @OriginalArg(4) int arg3) {
		@Pc(11) byte local11 = -1;
		if ((arg3 & 0x20) != 0) {
			Class222.aByteArray92[arg1] = arg0.method4855();
		}
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(40) int local40;
		@Pc(43) int local43;
		if ((arg3 & 0x8) != 0) {
			local32 = arg0.method4807();
			local36 = arg0.method4805();
			local40 = arg0.method4816();
			local43 = arg0.anInt5289;
			@Pc(51) boolean local51 = (local32 & 0x8000) != 0;
			if (arg2.aString41 != null && arg2.aClass117_1 != null) {
				@Pc(59) boolean local59 = false;
				if (local36 <= 1) {
					if (!local51 && (Class43.aBoolean123 && !Class73.aBoolean159 || Class78_Sub1.aBoolean166)) {
						local59 = true;
					} else if (Static98.method2210(arg2.aString41)) {
						local59 = true;
					}
				}
				if (!local59 && Class150.anInt3781 == 0) {
					Class66.aClass2_Sub4_2.anInt5289 = 0;
					arg0.method4859(Class66.aClass2_Sub4_2.aByteArray73, local40);
					Class66.aClass2_Sub4_2.anInt5289 = 0;
					@Pc(107) int local107 = -1;
					@Pc(117) String local117;
					if (local51) {
						local32 &= 0x7FFF;
						@Pc(127) Class86 local127 = Static267.method5028(Class66.aClass2_Sub4_2);
						local107 = local127.anInt2374;
						local117 = local127.aClass2_Sub2_Sub16_1.method5603(Class66.aClass2_Sub4_2);
					} else {
						local117 = Static144.method2774(Static285.method5277(Class66.aClass2_Sub4_2));
					}
					arg2.aString50 = local117.trim();
					arg2.anInt4592 = local32 & 0xFF;
					arg2.anInt4609 = local32 >> 8;
					arg2.anInt4627 = 150;
					@Pc(167) int local167;
					if (local36 == 1 || local36 == 2) {
						local167 = local51 ? 17 : 1;
					} else {
						local167 = local51 ? 17 : 2;
					}
					if (local36 == 2) {
						Static205.method3875(0, null, local117, local107, local167, "<img=1>" + arg2.method4071(), "<img=1>" + arg2.method4073());
					} else if (local36 == 1) {
						Static205.method3875(0, null, local117, local107, local167, "<img=0>" + arg2.method4071(), "<img=0>" + arg2.method4073());
					} else {
						Static205.method3875(0, null, local117, local107, local167, arg2.method4071(), arg2.method4073());
					}
				}
			}
			arg0.anInt5289 = local43 + local40;
		}
		@Pc(283) int local283;
		@Pc(289) int local289;
		if ((arg3 & 0x400) != 0) {
			local32 = arg0.method4812();
			@Pc(275) int[] local275 = new int[local32];
			@Pc(278) int[] local278 = new int[local32];
			@Pc(281) int[] local281 = new int[local32];
			for (local283 = 0; local283 < local32; local283++) {
				local289 = arg0.method4804();
				if (local289 == 65535) {
					local289 = -1;
				}
				local275[local283] = local289;
				local278[local283] = arg0.method4805();
				local281[local283] = arg0.method4804();
			}
			Static145.method2787(local275, local281, local278, arg2);
		}
		if ((arg3 & 0x1) != 0) {
			local32 = arg0.method4812();
			@Pc(337) byte[] local337 = new byte[local32];
			@Pc(342) Class2_Sub4 local342 = new Class2_Sub4(local337);
			arg0.method4832(local337, local32);
			Class12_Sub4.aClass2_Sub4Array1[arg1] = local342;
			arg2.method4067(local342);
		}
		if ((arg3 & 0x10) != 0) {
			local32 = arg0.method4807();
			if (local32 == 65535) {
				local32 = -1;
			}
			arg2.anInt4602 = local32;
		}
		if ((arg3 & 0x4) != 0) {
			local32 = arg0.method4854();
			if (local32 == 65535) {
				local32 = -1;
			}
			local36 = arg0.method4864();
			Static314.method5708(arg2, local36, local32);
		}
		if ((arg3 & 0x100) != 0) {
			arg2.anInt4606 = arg0.method4855();
			arg2.anInt4580 = arg0.method4855();
			arg2.anInt4569 = arg0.method4842();
			arg2.anInt4591 = arg0.method4826();
			arg2.anInt4613 = arg0.method4807() + Class83.anInt2345;
			arg2.anInt4576 = arg0.method4807() + Class83.anInt2345;
			arg2.anInt4605 = arg0.method4805();
			arg2.anInt4633 = 0;
			if (arg2.aBoolean276) {
				arg2.anInt4569 += arg2.anInt4163;
				arg2.anInt4606 += arg2.anInt4163;
				arg2.anInt4580 += arg2.anInt4175;
				arg2.anInt4634 = 0;
				arg2.anInt4591 += arg2.anInt4175;
			} else {
				arg2.anInt4580 += arg2.anIntArray317[0];
				arg2.anInt4591 += arg2.anIntArray317[0];
				arg2.anInt4634 = 1;
				arg2.anInt4569 += arg2.anIntArray316[0];
				arg2.anInt4606 += arg2.anIntArray316[0];
			}
		}
		if ((arg3 & 0x1000) != 0) {
			local32 = arg0.method4830();
			arg2.anInt4570 = arg0.method4864();
			arg2.anInt4583 = arg0.method4812();
			arg2.anInt4614 = local32 & 0x7FFF;
			arg2.aBoolean319 = (local32 & 0x8000) != 0;
			arg2.anInt4612 = arg2.anInt4614 + Class83.anInt2345 + arg2.anInt4570;
		}
		if ((arg3 & 0x80) != 0) {
			arg2.anInt4168 = arg0.method4830();
			if (arg2.anInt4634 == 0) {
				arg2.method4326(arg2.anInt4168);
				arg2.anInt4168 = -1;
			}
		}
		if ((arg3 & 0x200) != 0) {
			arg2.aString50 = arg0.method4810();
			if (arg2.aString50.charAt(0) == '~') {
				arg2.aString50 = arg2.aString50.substring(1);
				Static32.method4201(arg2.method4073(), 0, arg2.aString50, 2, arg2.method4071());
			} else if (Static17.aClass11_Sub5_Sub2_Sub1_3 == arg2) {
				Static32.method4201(arg2.method4073(), 0, arg2.aString50, 2, arg2.method4071());
			}
			arg2.anInt4592 = 0;
			arg2.anInt4609 = 0;
			arg2.anInt4627 = 150;
		}
		if ((arg3 & 0x2000) != 0) {
			local32 = arg0.method4854();
			local36 = arg0.method4837();
			if (local32 == 65535) {
				local32 = -1;
			}
			@Pc(690) boolean local690 = true;
			@Pc(780) Class157 local780;
			if (local32 != -1 && arg2.anInt4586 != -1) {
				@Pc(707) Class91 local707;
				if (local32 == arg2.anInt4586) {
					local707 = Static299.aClass211_2.method5408(local32);
					if (local707.aBoolean177 && local707.anInt2445 != -1) {
						@Pc(723) Class157 local723 = Static37.aClass85_1.method2373(local707.anInt2445);
						local289 = local723.anInt4017;
						if (local289 == 0) {
							local690 = false;
						} else if (local289 == 1) {
							local690 = true;
						} else if (local289 == 2) {
							arg2.anInt4590 = 0;
							local690 = false;
						}
					}
				} else {
					local707 = Static299.aClass211_2.method5408(local32);
					@Pc(763) Class91 local763 = Static299.aClass211_2.method5408(arg2.anInt4586);
					if (local707.anInt2445 != -1 && local763.anInt2445 != -1) {
						local780 = Static37.aClass85_1.method2373(local707.anInt2445);
						@Pc(786) Class157 local786 = Static37.aClass85_1.method2373(local763.anInt2445);
						if (local780.anInt4018 < local786.anInt4018) {
							local690 = false;
						}
					}
				}
			}
			if (local690) {
				arg2.anInt4630 = local36 >> 16;
				local43 = Class83.anInt2345;
				arg2.anInt4586 = local32;
				arg2.anInt4587 = (local36 & 0xFFFF) + local43;
				arg2.anInt4574 = 0;
				arg2.anInt4611 = 0;
				arg2.anInt4603 = 1;
				if (arg2.anInt4587 > local43) {
					arg2.anInt4574 = -1;
				}
				if (arg2.anInt4586 != -1 && local43 == arg2.anInt4587) {
					local283 = Static299.aClass211_2.method5408(arg2.anInt4586).anInt2445;
					if (local283 != -1) {
						local780 = Static37.aClass85_1.method2373(local283);
						if (local780 != null && local780.anIntArray262 != null) {
							Static1.method4(local780, arg2 == Static17.aClass11_Sub5_Sub2_Sub1_3, arg2.aByte78, arg2.anInt6768, arg2.anInt6770, 0);
						}
					}
				}
			}
		}
		if ((arg3 & 0x40) != 0) {
			local32 = arg0.method4818();
			local36 = arg0.method4812();
			arg2.method4335(local36, local32, Class83.anInt2345);
			arg2.anInt4598 = Class83.anInt2345 + 300;
			arg2.anInt4622 = arg0.method4805();
		}
		if ((arg3 & 0x800) != 0) {
			local32 = Class83.anInt2345;
			local36 = arg0.method4818();
			local40 = arg0.method4812();
			arg2.method4335(local40, local36, local32);
		}
		if ((arg3 & 0x4000) != 0) {
			local11 = arg0.method4842();
		}
		if (!arg2.aBoolean276) {
			return;
		}
		if (local11 == 127) {
			arg2.method4065(arg2.anInt4163, arg2.anInt4175);
			return;
		}
		@Pc(964) byte local964;
		if (local11 == -1) {
			local964 = Class222.aByteArray92[arg1];
		} else {
			local964 = local11;
		}
		arg2.method4069(arg2.anInt4175, arg2.anInt4163, local964);
	}
}
