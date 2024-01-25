import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
	public static int anInt5290;

	@OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
	public static int anInt5295;

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "Lclient!ei;")
	public static final Class44 aClass44_7 = new Class44(64);

	@OriginalMember(owner = "client!rc", name = "r", descriptor = "Z")
	public static boolean aBoolean405 = false;

	@OriginalMember(owner = "client!rc", name = "t", descriptor = "[I")
	public static final int[] anIntArray411 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!rc", name = "z", descriptor = "Lclient!ei;")
	public static final Class44 aClass44_8 = new Class44(64);

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!at;I)Lclient!wr;")
	public static Class25_Sub4 method4845(@OriginalArg(0) Class1_Sub7 arg0) {
		return new Class25_Sub4(arg0.method2141(), arg0.method2141(), arg0.method2141(), arg0.method2141(), arg0.method2119(), arg0.method2132());
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IJLclient!fp;)V")
	public static void method4848(@OriginalArg(1) long arg0, @OriginalArg(2) Class63 arg1) {
		Static199.anInt4042 = 0;
		Static131.anInt2837 = Static240.anInt4900;
		Static240.anInt4900 = 0;
		@Pc(14) long local14 = Static183.method3462();
		for (@Pc(19) Class32_Sub2 local19 = (Class32_Sub2) Static185.aClass195_5.method5302(); local19 != null; local19 = (Class32_Sub2) Static185.aClass195_5.method5298()) {
			if (local19.method1408(arg1, arg0)) {
				Static199.anInt4042++;
			}
		}
		if (Static329.aBoolean465 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static185.aClass195_5.method5303() + ", running: " + Static199.anInt4042 + ". Particles: " + Static240.anInt4900 + ". Time taken: " + (Static183.method3462() - local14) + "ms");
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)Z")
	public static boolean method4850(@OriginalArg(0) int arg0) {
		if (Static180.aBooleanArray18[arg0]) {
			return true;
		} else if (Static84.aClass30_24.method1152(arg0)) {
			@Pc(21) int local21 = Static84.aClass30_24.method1180(arg0);
			if (local21 == 0) {
				Static180.aBooleanArray18[arg0] = true;
				return true;
			}
			if (Static341.aClass112ArrayArray1[arg0] == null) {
				Static341.aClass112ArrayArray1[arg0] = new Class112[local21];
			}
			for (@Pc(43) int local43 = 0; local43 < local21; local43++) {
				if (Static341.aClass112ArrayArray1[arg0][local43] == null) {
					@Pc(60) byte[] local60 = Static84.aClass30_24.method1161(local43, arg0);
					if (local60 != null) {
						@Pc(72) Class112 local72 = Static341.aClass112ArrayArray1[arg0][local43] = new Class112();
						local72.anInt3376 = (arg0 << 16) + local43;
						if (local60[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local72.method3109(new Class1_Sub7(local60));
					}
				}
			}
			Static180.aBooleanArray18[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "([II[III)V")
	public static void method4852(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg1) {
			return;
		}
		@Pc(14) int local14 = (arg1 + arg3) / 2;
		@Pc(16) int local16 = arg1;
		@Pc(20) int local20 = arg0[local14];
		arg0[local14] = arg0[arg3];
		arg0[arg3] = local20;
		@Pc(34) int local34 = arg2[local14];
		arg2[local14] = arg2[arg3];
		arg2[arg3] = local34;
		for (@Pc(46) int local46 = arg1; local46 < arg3; local46++) {
			if (local20 + (local46 & 0x1) > arg0[local46]) {
				@Pc(65) int local65 = arg0[local46];
				arg0[local46] = arg0[local16];
				arg0[local16] = local65;
				@Pc(79) int local79 = arg2[local46];
				arg2[local46] = arg2[local16];
				arg2[local16++] = local79;
			}
		}
		arg0[arg3] = arg0[local16];
		arg0[local16] = local20;
		arg2[arg3] = arg2[local16];
		arg2[local16] = local34;
		method4852(arg0, arg1, arg2, local16 - 1);
		method4852(arg0, local16 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZ)V")
	public static void method4853(@OriginalArg(1) boolean arg0) {
		Static51.aBoolean88 = arg0;
		@Pc(20) int local20;
		@Pc(35) int local35;
		@Pc(49) int local49;
		@Pc(55) int local55;
		@Pc(59) int local59;
		@Pc(137) int local137;
		if (!Static51.aBoolean88) {
			local20 = Static180.aClass1_Sub7_Sub2_2.method2161();
			@Pc(31) boolean local31 = Static180.aClass1_Sub7_Sub2_2.method2135() == 1;
			local35 = Static180.aClass1_Sub7_Sub2_2.method2161();
			@Pc(39) int local39 = Static180.aClass1_Sub7_Sub2_2.method2135();
			Static236.method4375(local39);
			local49 = (Static366.anInt7026 - Static180.aClass1_Sub7_Sub2_2.anInt2219) / 16;
			Static232.anIntArrayArray47 = new int[local49][4];
			for (local55 = 0; local55 < local49; local55++) {
				for (local59 = 0; local59 < 4; local59++) {
					Static232.anIntArrayArray47[local55][local59] = Static180.aClass1_Sub7_Sub2_2.method2140();
				}
			}
			Static42.aByteArrayArray2 = null;
			Static37.anIntArray60 = new int[local49];
			Static290.anIntArray446 = new int[local49];
			Static3.anIntArray7 = null;
			Static355.aByteArrayArray19 = new byte[local49][];
			Static258.aByteArrayArray4 = new byte[local49][];
			Static180.anIntArray280 = new int[local49];
			Static349.aByteArrayArray18 = new byte[local49][];
			Static112.anIntArray187 = new int[local49];
			Static200.anIntArray311 = new int[local49];
			Static359.aByteArrayArray20 = new byte[local49][];
			local49 = 0;
			for (local59 = (local20 - (Static311.anInt5653 >> 4)) / 8; local59 <= (local20 + (Static311.anInt5653 >> 4)) / 8; local59++) {
				for (local137 = (local35 - (Static189.anInt3820 >> 4)) / 8; local137 <= (local35 + (Static189.anInt3820 >> 4)) / 8; local137++) {
					Static37.anIntArray60[local49] = local137 + (local59 << 8);
					Static200.anIntArray311[local49] = Static166.aClass30_53.method1153("m" + local59 + "_" + local137);
					Static290.anIntArray446[local49] = Static166.aClass30_53.method1153("l" + local59 + "_" + local137);
					Static180.anIntArray280[local49] = Static166.aClass30_53.method1153("um" + local59 + "_" + local137);
					Static112.anIntArray187[local49] = Static166.aClass30_53.method1153("ul" + local59 + "_" + local137);
					local49++;
				}
			}
			Static231.method4294(local31, false, local20, local35);
			return;
		}
		local20 = Static180.aClass1_Sub7_Sub2_2.method2161();
		@Pc(258) int local258 = Static180.aClass1_Sub7_Sub2_2.method2123();
		local35 = Static180.aClass1_Sub7_Sub2_2.method2132();
		@Pc(273) boolean local273 = Static180.aClass1_Sub7_Sub2_2.method2132() == 1;
		Static236.method4375(local35);
		Static180.aClass1_Sub7_Sub2_2.method2166();
		for (local49 = 0; local49 < 4; local49++) {
			for (local55 = 0; local55 < Static311.anInt5653 >> 3; local55++) {
				for (local59 = 0; local59 < Static189.anInt3820 >> 3; local59++) {
					local137 = Static180.aClass1_Sub7_Sub2_2.method2169(1);
					if (local137 == 1) {
						Static1.anIntArrayArrayArray4[local49][local55][local59] = Static180.aClass1_Sub7_Sub2_2.method2169(26);
					} else {
						Static1.anIntArrayArrayArray4[local49][local55][local59] = -1;
					}
				}
			}
		}
		Static180.aClass1_Sub7_Sub2_2.method2167();
		local55 = (Static366.anInt7026 - Static180.aClass1_Sub7_Sub2_2.anInt2219) / 16;
		Static232.anIntArrayArray47 = new int[local55][4];
		for (local59 = 0; local59 < local55; local59++) {
			for (local137 = 0; local137 < 4; local137++) {
				Static232.anIntArrayArray47[local59][local137] = Static180.aClass1_Sub7_Sub2_2.method2140();
			}
		}
		Static200.anIntArray311 = new int[local55];
		Static258.aByteArrayArray4 = new byte[local55][];
		Static180.anIntArray280 = new int[local55];
		Static359.aByteArrayArray20 = new byte[local55][];
		Static112.anIntArray187 = new int[local55];
		Static355.aByteArrayArray19 = new byte[local55][];
		Static42.aByteArrayArray2 = null;
		Static290.anIntArray446 = new int[local55];
		Static3.anIntArray7 = null;
		Static349.aByteArrayArray18 = new byte[local55][];
		Static37.anIntArray60 = new int[local55];
		local55 = 0;
		for (local137 = 0; local137 < 4; local137++) {
			for (@Pc(419) int local419 = 0; local419 < Static311.anInt5653 >> 3; local419++) {
				for (@Pc(423) int local423 = 0; local423 < Static189.anInt3820 >> 3; local423++) {
					@Pc(433) int local433 = Static1.anIntArrayArrayArray4[local137][local419][local423];
					if (local433 != -1) {
						@Pc(442) int local442 = local433 >> 14 & 0x3FF;
						@Pc(448) int local448 = local433 >> 3 & 0x7FF;
						@Pc(458) int local458 = (local442 / 8 << 8) + local448 / 8;
						for (@Pc(460) int local460 = 0; local460 < local55; local460++) {
							if (local458 == Static37.anIntArray60[local460]) {
								local458 = -1;
								break;
							}
						}
						if (local458 != -1) {
							Static37.anIntArray60[local55] = local458;
							@Pc(493) int local493 = local458 >> 8 & 0xFF;
							@Pc(497) int local497 = local458 & 0xFF;
							Static200.anIntArray311[local55] = Static166.aClass30_53.method1153("m" + local493 + "_" + local497);
							Static290.anIntArray446[local55] = Static166.aClass30_53.method1153("l" + local493 + "_" + local497);
							Static180.anIntArray280[local55] = Static166.aClass30_53.method1153("um" + local493 + "_" + local497);
							Static112.anIntArray187[local55] = Static166.aClass30_53.method1153("ul" + local493 + "_" + local497);
							local55++;
						}
					}
				}
			}
		}
		Static231.method4294(local273, false, local20, local258);
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
	public static void method4854() {
		Static180.aClass1_Sub7_Sub2_2.method2166();
		@Pc(19) int local19 = Static180.aClass1_Sub7_Sub2_2.method2169(8);
		@Pc(24) int local24;
		if (local19 < Static277.anInt5394) {
			for (local24 = local19; local24 < Static277.anInt5394; local24++) {
				Static162.anIntArray242[Static24.anInt578++] = Static81.anIntArray143[local24];
			}
		}
		if (Static277.anInt5394 < local19) {
			throw new RuntimeException("gnpov1");
		}
		Static277.anInt5394 = 0;
		for (local24 = 0; local24 < local19; local24++) {
			@Pc(62) int local62 = Static81.anIntArray143[local24];
			@Pc(66) Class11_Sub2_Sub6_Sub2 local66 = Static231.aClass11_Sub2_Sub6_Sub2Array1[local62];
			@Pc(71) int local71 = Static180.aClass1_Sub7_Sub2_2.method2169(1);
			if (local71 == 0) {
				Static81.anIntArray143[Static277.anInt5394++] = local62;
				local66.anInt6745 = Static51.anInt1301;
			} else {
				@Pc(94) int local94 = Static180.aClass1_Sub7_Sub2_2.method2169(2);
				if (local94 == 0) {
					Static81.anIntArray143[Static277.anInt5394++] = local62;
					local66.anInt6745 = Static51.anInt1301;
					Static42.anIntArray72[Static342.anInt6506++] = local62;
				} else {
					@Pc(141) int local141;
					@Pc(153) int local153;
					if (local94 == 1) {
						Static81.anIntArray143[Static277.anInt5394++] = local62;
						local66.anInt6745 = Static51.anInt1301;
						local141 = Static180.aClass1_Sub7_Sub2_2.method2169(3);
						local66.method5900(local141, 1);
						local153 = Static180.aClass1_Sub7_Sub2_2.method2169(1);
						if (local153 == 1) {
							Static42.anIntArray72[Static342.anInt6506++] = local62;
						}
					} else if (local94 == 2) {
						Static81.anIntArray143[Static277.anInt5394++] = local62;
						local66.anInt6745 = Static51.anInt1301;
						if (Static180.aClass1_Sub7_Sub2_2.method2169(1) == 1) {
							local141 = Static180.aClass1_Sub7_Sub2_2.method2169(3);
							local66.method5900(local141, 2);
							local153 = Static180.aClass1_Sub7_Sub2_2.method2169(3);
							local66.method5900(local153, 2);
						} else {
							local141 = Static180.aClass1_Sub7_Sub2_2.method2169(3);
							local66.method5900(local141, 0);
						}
						local141 = Static180.aClass1_Sub7_Sub2_2.method2169(1);
						if (local141 == 1) {
							Static42.anIntArray72[Static342.anInt6506++] = local62;
						}
					} else if (local94 == 3) {
						Static162.anIntArray242[Static24.anInt578++] = local62;
					}
				}
			}
		}
	}
}
