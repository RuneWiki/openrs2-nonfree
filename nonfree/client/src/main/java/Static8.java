import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ag", name = "P", descriptor = "Lclient!vt;")
	public static Class242 aClass242_1;

	@OriginalMember(owner = "client!ag", name = "S", descriptor = "[[I")
	public static int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!ag", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString1 = "";

	@OriginalMember(owner = "client!ag", name = "N", descriptor = "Lclient!at;")
	public static Class17 aClass17_1 = new Class17();

	@OriginalMember(owner = "client!ag", name = "R", descriptor = "I")
	public static int anInt119 = 0;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!tq;Lclient!hm;IIIII)V")
	public static void method78(@OriginalArg(0) Class164 arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static337.anInt5599) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static19.anInt329) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static230.anInt6113 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class132 local62 = Static25.aClass132ArrayArrayArray1[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static229.aClass42Array3[local17].method3060(local23, local32) + Static229.aClass42Array3[local17].method3060(local23 + 1, local32) + Static229.aClass42Array3[local17].method3060(local23, local32 + 1) + Static229.aClass42Array3[local17].method3060(local23 + 1, local32 + 1)) / 4 - (Static229.aClass42Array3[arg2].method3060(arg3, arg4) + Static229.aClass42Array3[arg2].method3060(arg3 + 1, arg4) + Static229.aClass42Array3[arg2].method3060(arg3, arg4 + 1) + Static229.aClass42Array3[arg2].method3060(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class25_Sub5 local143 = local62.aClass25_Sub5_1;
									@Pc(146) Class25_Sub5 local146 = local62.aClass25_Sub5_2;
									if (local143 != null && local143.method5236()) {
										arg1.method5235(local1, arg0, local143, local140, (local32 - arg4) * Static53.anInt1116 + (1 - arg6) * Static276.anInt5131, (local23 - arg3) * Static53.anInt1116 + (1 - arg5) * Static276.anInt5131);
									}
									if (local146 != null && local146.method5236()) {
										arg1.method5235(local1, arg0, local146, local140, (local32 - arg4) * Static53.anInt1116 + (1 - arg6) * Static276.anInt5131, (local23 - arg3) * Static53.anInt1116 + (1 - arg5) * Static276.anInt5131);
									}
									for (@Pc(219) Class116 local219 = local62.aClass116_3; local219 != null; local219 = local219.aClass116_2) {
										@Pc(223) Class25_Sub1 local223 = local219.aClass25_Sub1_1;
										if (local223 != null && local223.method5236() && (local23 == local223.aShort88 || local23 == local3) && (local32 == local223.aShort89 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort87 + 1 - local223.aShort88;
											@Pc(260) int local260 = local223.aShort90 + 1 - local223.aShort89;
											arg1.method5235(local1, arg0, local223, local140, (local223.aShort89 - arg4) * Static53.anInt1116 + (local260 - arg6) * Static276.anInt5131, (local223.aShort88 - arg3) * Static53.anInt1116 + (local252 - arg5) * Static276.anInt5131);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "h", descriptor = "(I)V")
	public static void method79() {
		for (@Pc(15) Class1_Sub14 local15 = (Class1_Sub14) Static271.aClass17_53.method202(); local15 != null; local15 = (Class1_Sub14) Static271.aClass17_53.method207()) {
			if (local15.anInt1829 > 0) {
				local15.anInt1829--;
			}
			if (local15.anInt1829 != 0) {
				if (local15.anInt1832 > 0) {
					local15.anInt1832--;
				}
				if (local15.anInt1832 == 0 && local15.anInt1831 >= 1 && local15.anInt1823 >= 1 && local15.anInt1831 <= Static92.anInt1675 - 2 && local15.anInt1823 <= Static262.anInt6340 - 2 && (local15.anInt1834 < 0 || Static18.method2856(local15.anInt1834, local15.anInt1825))) {
					Static17.method190(local15.anInt1823, local15.anInt1834, local15.anInt1835, local15.anInt1831, local15.anInt1833, local15.anInt1826, -1, local15.anInt1825);
					local15.anInt1832 = -1;
					if (local15.anInt1837 == local15.anInt1834 && local15.anInt1837 == -1) {
						local15.method5577();
					} else if (local15.anInt1837 == local15.anInt1834 && local15.anInt1835 == local15.anInt1824 && local15.anInt1825 == local15.anInt1827) {
						local15.method5577();
					}
				}
			} else if (local15.anInt1837 < 0 || Static18.method2856(local15.anInt1837, local15.anInt1827)) {
				Static17.method190(local15.anInt1823, local15.anInt1837, local15.anInt1824, local15.anInt1831, local15.anInt1833, local15.anInt1826, -1, local15.anInt1827);
				local15.method5577();
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIII)V")
	public static void method80(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static113.anIntArrayArray30 != null) {
			Static113.anIntArrayArray30[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static351.aByteArrayArray20 != null) {
			Static351.aByteArrayArray20[arg0][arg1] = (byte) (arg3 >> 3);
		}
		if (Static35.aByteArrayArray1 != null) {
			Static35.aByteArrayArray1[arg0][arg1] = (byte) arg4;
		}
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "(III)I")
	public static int method82(@OriginalArg(2) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(16) int local16 = (arg0 & 0x7F) * 96 >> 7;
		if (local16 < 2) {
			local16 = 2;
		} else if (local16 > 126) {
			local16 = 126;
		}
		return (arg0 & 0xFF80) + local16;
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(IIIII)I")
	public static int method83(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg2 & 0xF;
		@Pc(21) int local21 = local7 >= 8 ? arg1 : arg0;
		@Pc(40) int local40 = local7 >= 4 ? (local7 == 12 || local7 == 14 ? arg0 : arg3) : arg1;
		return ((local7 & 0x2) == 0 ? local40 : -local40) + ((local7 & 0x1) == 0 ? local21 : -local21);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!re;I)Lclient!cm;")
	public static Class43_Sub1 method84(@OriginalArg(0) Class1_Sub33 arg0) {
		return new Class43_Sub1(arg0.method5180(), arg0.method5180(), arg0.method5180(), arg0.method5180(), arg0.method5159(), arg0.method5174());
	}
}
