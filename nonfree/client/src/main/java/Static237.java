import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "[Lclient!sf;")
	public static Class183[] aClass183Array2;

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "Lclient!ra;")
	public static Class170 aClass170_82;

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "J")
	public static long aLong154;

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "Lclient!fi;")
	public static final Class66 aClass66_81 = new Class66(50);

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "Lclient!vn;")
	public static final Class211 aClass211_20 = new Class211();

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "J")
	public static long aLong155 = 0L;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIII)V")
	public static void method4035(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static148.anInt3013 = arg2;
		Static151.anInt3086 = arg1;
		Static122.anInt2591 = arg4;
		Static140.anInt2793 = arg0;
		Static230.anInt4510 = arg3;
		Static256.anInt4991 = arg5;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIBLclient!nj;)V")
	public static void method4036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class25_Sub1_Sub1_Sub1 arg2) {
		@Pc(16) int local16;
		if ((arg1 & 0x2) != 0) {
			local16 = Static6.aClass5_Sub1_Sub1_1.method1846();
			@Pc(19) byte[] local19 = new byte[local16];
			@Pc(24) Class5_Sub1 local24 = new Class5_Sub1(local19);
			Static6.aClass5_Sub1_Sub1_1.method1874(local16, local19);
			Static227.aClass5_Sub1Array1[arg0] = local24;
			arg2.method3686(local24);
		}
		if ((arg1 & 0x80) != 0) {
			arg2.anInt5332 = Static6.aClass5_Sub1_Sub1_1.method1875();
			if (arg2.anInt5332 == 65535) {
				arg2.anInt5332 = -1;
			}
		}
		if ((arg1 & 0x800) != 0) {
			local16 = Static6.aClass5_Sub1_Sub1_1.method1867();
			arg2.anInt5305 = Static6.aClass5_Sub1_Sub1_1.method1832();
			arg2.anInt5290 = Static6.aClass5_Sub1_Sub1_1.method1846();
			arg2.anInt5273 = local16 & 0x7FFF;
			arg2.aBoolean402 = (local16 & 0x8000) != 0;
			arg2.anInt5317 = arg2.anInt5305 + arg2.anInt5273 + Static180.anInt3606;
		}
		@Pc(149) int local149;
		@Pc(114) int local114;
		@Pc(263) int local263;
		if ((arg1 & 0x1000) != 0) {
			local16 = Static6.aClass5_Sub1_Sub1_1.method1867();
			if (local16 == 65535) {
				local16 = -1;
			}
			local114 = Static6.aClass5_Sub1_Sub1_1.method1853();
			@Pc(116) boolean local116 = true;
			@Pc(146) Class17 local146;
			if (local16 != -1 && arg2.anInt5269 != -1) {
				@Pc(133) Class128 local133;
				if (local16 == arg2.anInt5269) {
					local133 = Static136.method2578(local16);
					if (local133.aBoolean266 && local133.anInt3759 != -1) {
						local146 = Static261.method4492(local133.anInt3759);
						local149 = local146.anInt505;
						if (local149 == 0) {
							local116 = false;
						} else if (local149 == 1) {
							local116 = true;
						} else if (local149 == 2) {
							arg2.anInt5314 = 0;
							local116 = false;
						}
					}
				} else {
					local133 = Static136.method2578(local16);
					@Pc(186) Class128 local186 = Static136.method2578(arg2.anInt5269);
					if (local133.anInt3759 != -1 && local186.anInt3759 != -1) {
						@Pc(200) Class17 local200 = Static261.method4492(local133.anInt3759);
						@Pc(205) Class17 local205 = Static261.method4492(local186.anInt3759);
						if (local200.anInt506 < local205.anInt506) {
							local116 = false;
						}
					}
				}
			}
			if (local116) {
				arg2.anInt5306 = (local114 & 0xFFFF) + Static180.anInt3606;
				arg2.anInt5269 = local16;
				arg2.anInt5319 = local114 >> 16;
				arg2.anInt5315 = 0;
				arg2.anInt5330 = 0;
				arg2.anInt5279 = 1;
				if (arg2.anInt5306 > Static180.anInt3606) {
					arg2.anInt5315 = -1;
				}
				if (arg2.anInt5269 != -1 && arg2.anInt5306 == Static180.anInt3606) {
					local263 = Static136.method2578(arg2.anInt5269).anInt3759;
					if (local263 != -1) {
						local146 = Static261.method4492(local263);
						if (local146 != null && local146.anIntArray24 != null) {
							Static207.method3696(0, arg2.anInt5769, local146, arg2.anInt5773, Static85.aClass25_Sub1_Sub1_Sub1_1 == arg2);
						}
					}
				}
			}
		}
		if ((arg1 & 0x40) != 0) {
			arg2.aString304 = Static6.aClass5_Sub1_Sub1_1.method1840();
			if (arg2.aString304.charAt(0) == '~') {
				arg2.aString304 = arg2.aString304.substring(1);
				Static170.method3228(0, arg2.method3678(), 2, arg2.aString304, arg2.method3679());
			} else if (Static85.aClass25_Sub1_Sub1_Sub1_1 == arg2) {
				Static170.method3228(0, arg2.method3678(), 2, arg2.aString304, arg2.method3679());
			}
			arg2.anInt5303 = 150;
			arg2.anInt5267 = 0;
			arg2.anInt5264 = 0;
		}
		if ((arg1 & 0x1) != 0) {
			local16 = Static6.aClass5_Sub1_Sub1_1.method1839();
			if (local16 == 65535) {
				local16 = -1;
			}
			local114 = Static6.aClass5_Sub1_Sub1_1.method1846();
			Static74.method1597(local16, local114, arg2);
		}
		if ((arg1 & 0x100) != 0) {
			arg2.anInt5259 = Static6.aClass5_Sub1_Sub1_1.method1832();
			arg2.anInt5304 = Static6.aClass5_Sub1_Sub1_1.method1885();
			arg2.anInt5297 = Static6.aClass5_Sub1_Sub1_1.method1832();
			arg2.anInt5278 = Static6.aClass5_Sub1_Sub1_1.method1832();
			arg2.anInt5329 = Static6.aClass5_Sub1_Sub1_1.method1845() + Static180.anInt3606;
			arg2.anInt5291 = Static6.aClass5_Sub1_Sub1_1.method1845() + Static180.anInt3606;
			arg2.anInt5311 = Static6.aClass5_Sub1_Sub1_1.method1872();
			arg2.anInt5337 = 1;
			arg2.anInt5341 = 0;
		}
		if ((arg1 & 0x200) != 0) {
			local16 = Static6.aClass5_Sub1_Sub1_1.method1885();
			@Pc(455) int[] local455 = new int[local16];
			@Pc(458) int[] local458 = new int[local16];
			@Pc(461) int[] local461 = new int[local16];
			for (@Pc(463) int local463 = 0; local463 < local16; local463++) {
				local149 = Static6.aClass5_Sub1_Sub1_1.method1875();
				if (local149 == 65535) {
					local149 = -1;
				}
				local455[local463] = local149;
				local458[local463] = Static6.aClass5_Sub1_Sub1_1.method1846();
				local461[local463] = Static6.aClass5_Sub1_Sub1_1.method1845();
			}
			Static62.method1265(arg2, local461, local458, local455);
		}
		if ((arg1 & 0x20) != 0) {
			local16 = Static6.aClass5_Sub1_Sub1_1.method1845();
			local114 = Static6.aClass5_Sub1_Sub1_1.method1885();
			@Pc(516) int local516 = Static6.aClass5_Sub1_Sub1_1.method1832();
			local263 = Static6.aClass5_Sub1_Sub1_1.anInt2029;
			@Pc(530) boolean local530 = (local16 & 0x8000) != 0;
			if (arg2.aString237 != null && arg2.aClass61_1 != null) {
				@Pc(538) boolean local538 = false;
				if (local114 <= 1) {
					if (!local530 && (Static343.aBoolean474 && !Static92.aBoolean136 || Static21.aBoolean465)) {
						local538 = true;
					} else if (Static299.method5080(arg2.aString237)) {
						local538 = true;
					}
				}
				if (!local538 && Static322.anInt6105 == 0) {
					Static88.aClass5_Sub1_5.anInt2029 = 0;
					Static6.aClass5_Sub1_Sub1_1.method1836(Static88.aClass5_Sub1_5.aByteArray18, local516);
					Static88.aClass5_Sub1_5.anInt2029 = 0;
					@Pc(586) int local586 = -1;
					@Pc(596) String local596;
					if (local530) {
						local16 &= 0x7FFF;
						@Pc(606) Class120 local606 = Static22.method569(Static88.aClass5_Sub1_5);
						local586 = local606.anInt3558;
						local596 = local606.aClass5_Sub9_Sub12_1.method2634(Static88.aClass5_Sub1_5);
					} else {
						local596 = Static337.method5620(Static314.method5369(Static259.method2973(Static88.aClass5_Sub1_5)));
					}
					arg2.aString304 = local596.trim();
					arg2.anInt5303 = 150;
					arg2.anInt5267 = local16 & 0xFF;
					arg2.anInt5264 = local16 >> 8;
					@Pc(648) int local648;
					if (local114 == 1 || local114 == 2) {
						local648 = local530 ? 17 : 1;
					} else {
						local648 = local530 ? 17 : 2;
					}
					if (local114 == 2) {
						Static243.method4137("<img=1>" + arg2.method3678(), local596, "<img=1>" + arg2.method3679(), local586, null, local648, 0);
					} else if (local114 == 1) {
						Static243.method4137("<img=0>" + arg2.method3678(), local596, "<img=0>" + arg2.method3679(), local586, null, local648, 0);
					} else {
						Static243.method4137(arg2.method3678(), local596, arg2.method3679(), local586, null, local648, 0);
					}
				}
			}
			Static6.aClass5_Sub1_Sub1_1.anInt2029 = local263 + local516;
		}
		if ((arg1 & 0x4) != 0) {
			arg2.anInt5295 = Static6.aClass5_Sub1_Sub1_1.method1867();
			arg2.anInt5309 = Static6.aClass5_Sub1_Sub1_1.method1845();
		}
		if ((arg1 & 0x10) != 0) {
			local16 = Static6.aClass5_Sub1_Sub1_1.method1866();
			local114 = Static6.aClass5_Sub1_Sub1_1.method1885();
			arg2.method4642(Static180.anInt3606, local114, local16);
			arg2.anInt5323 = Static180.anInt3606 + 300;
			arg2.anInt5271 = Static6.aClass5_Sub1_Sub1_1.method1872();
		}
		if ((arg1 & 0x400) != 0) {
			local16 = Static6.aClass5_Sub1_Sub1_1.method1866();
			local114 = Static6.aClass5_Sub1_Sub1_1.method1885();
			arg2.method4642(Static180.anInt3606, local114, local16);
		}
	}
}
