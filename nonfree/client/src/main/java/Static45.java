import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!cm", name = "O", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray11 = new String[100];

	@OriginalMember(owner = "client!cm", name = "T", descriptor = "[C")
	public static final char[] aCharArray3 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)V")
	public static void method915() {
		while (true) {
			if (Static127.aClass4_Sub11_Sub1_3.method708(Static133.anInt3104) >= 11) {
				@Pc(23) int local23 = Static127.aClass4_Sub11_Sub1_3.method711(11);
				if (local23 != 2047) {
					@Pc(30) boolean local30 = false;
					if (Static327.aClass8_Sub1_Sub2_Sub1Array1[local23] == null) {
						Static327.aClass8_Sub1_Sub2_Sub1Array1[local23] = new Class8_Sub1_Sub2_Sub1();
						Static327.aClass8_Sub1_Sub2_Sub1Array1[local23].anInt4916 = local23;
						if (Static1.aClass4_Sub11Array2[local23] != null) {
							Static327.aClass8_Sub1_Sub2_Sub1Array1[local23].method2083(Static1.aClass4_Sub11Array2[local23]);
						}
						local30 = true;
					}
					Static333.anIntArray494[Static289.anInt5643++] = local23;
					@Pc(71) Class8_Sub1_Sub2_Sub1 local71 = Static327.aClass8_Sub1_Sub2_Sub1Array1[local23];
					local71.anInt4940 = Static199.anInt4137;
					@Pc(79) int local79 = Static127.aClass4_Sub11_Sub1_3.method711(5);
					if (local79 > 15) {
						local79 -= 32;
					}
					@Pc(88) int local88 = Static127.aClass4_Sub11_Sub1_3.method711(1);
					@Pc(93) int local93 = Static127.aClass4_Sub11_Sub1_3.method711(1);
					if (local93 == 1) {
						Static311.anIntArray474[Static244.anInt4894++] = local23;
					}
					@Pc(113) int local113 = Static174.anIntArray318[Static127.aClass4_Sub11_Sub1_3.method711(3)];
					@Pc(118) int local118 = Static127.aClass4_Sub11_Sub1_3.method711(5);
					if (local30) {
						local71.method4346(local113);
					}
					if (local118 > 15) {
						local118 -= 32;
					}
					local71.method2084(Static12.anInt267, local118 + Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray416[0], local88 == 1, Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray415[0] + local79);
					continue;
				}
			}
			Static127.aClass4_Sub11_Sub1_3.method712();
			return;
		}
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(IB)I")
	public static int method916(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 2;
		@Pc(25) int local25 = local19 | local19 >>> 4;
		@Pc(31) int local31 = local25 | local25 >>> 8;
		@Pc(37) int local37 = local31 | local31 >>> 16;
		return ~local37 & arg0;
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(II)V")
	public static void method918(@OriginalArg(1) int arg0) {
		@Pc(1) Class198 local1 = Static203.aClass198_153;
		synchronized (Static203.aClass198_153) {
			Static203.aClass198_153.method5213();
			Static203.aClass198_153 = new Class198(arg0);
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(II[Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String[] arg2) {
		if (arg0 == 0) {
			return "";
		} else if (arg0 == 1) {
			@Pc(21) String local21 = arg2[arg1];
			return local21 == null ? "null" : local21.toString();
		} else {
			@Pc(32) int local32 = arg1 + arg0;
			@Pc(34) int local34 = 0;
			for (@Pc(41) int local41 = arg1; local41 < local32; local41++) {
				@Pc(47) String local47 = arg2[local41];
				if (local47 == null) {
					local34 += 4;
				} else {
					local34 += local47.length();
				}
			}
			@Pc(70) StringBuffer local70 = new StringBuffer(local34);
			for (@Pc(72) int local72 = arg1; local72 < local32; local72++) {
				@Pc(78) String local78 = arg2[local72];
				if (local78 == null) {
					local70.append("null");
				} else {
					local70.append(local78);
				}
			}
			return local70.toString();
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIB)I")
	public static int method920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((Static2.aByteArrayArrayArray1[arg2][arg1][arg0] & 0x8) == 0) {
			return arg2 <= 0 || (Static2.aByteArrayArrayArray1[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}
}
