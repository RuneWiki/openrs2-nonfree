import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "[Lclient!lg;")
	public static Class60[] aClass60Array4;

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "Lclient!am;")
	public static Class11 aClass11_31;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "[Lclient!wd;")
	public static final Class18_Sub1[] aClass18_Sub1Array1 = new Class18_Sub1[29];

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "J")
	public static long aLong56 = 0L;

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString46 = "Loaded client variable data";

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
	public static void method1249() {
		if (Static164.aClass92_7.method4462()) {
			Static210.method4726();
			Static164.aClass92_7.method4521(Static101.aCanvas8);
			Static240.method4159();
		} else {
			Static306.method5196(Static6.anInt1971);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "([I[[B[I[BI[[BII)I")
	public static int method1251(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) byte[][] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg2[arg6];
		@Pc(15) int local15 = arg0[arg6] + local9;
		@Pc(19) int local19 = arg2[arg5];
		@Pc(25) int local25 = local19 + arg0[arg5];
		@Pc(27) int local27 = local9;
		if (local9 < local19) {
			local27 = local19;
		}
		@Pc(38) int local38 = local15;
		if (local15 > local25) {
			local38 = local25;
		}
		@Pc(53) int local53 = arg3[arg6] & 0xFF;
		if (local53 > (arg3[arg5] & 0xFF)) {
			local53 = arg3[arg5] & 0xFF;
		}
		@Pc(74) byte[] local74 = arg4[arg6];
		@Pc(78) byte[] local78 = arg1[arg5];
		@Pc(82) int local82 = local27 - local9;
		@Pc(87) int local87 = local27 - local19;
		for (@Pc(89) int local89 = local27; local89 < local38; local89++) {
			@Pc(102) int local102 = local74[local82++] + local78[local87++];
			if (local102 < local53) {
				local53 = local102;
			}
		}
		return -local53;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILclient!am;)V")
	public static void method1252(@OriginalArg(1) Class11 arg0) {
		Static230.aClass11_93 = arg0;
		Static230.aClass11_93.method292(35);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)Lclient!sn;")
	public static Class2_Sub4 method1254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class57 local7 = Static18.aClass57ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass2_Sub4_2;
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)V")
	public static void method1256() {
		Static282.anInt5713 = 0;
		Static248.aClass130_112.method3514();
		Static248.aClass130_112.method3510(Static220.aClass4_Sub18_1);
		Static282.anInt5713++;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B[Lclient!qs;Lclient!vm;I[BZI)V")
	public static void method1257(@OriginalArg(1) Class174[] arg0, @OriginalArg(2) Class92 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(10) Class4_Sub7 local10 = new Class4_Sub7(arg3);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local10.method2399();
			if (local16 == 0) {
				return;
			}
			local12 += local16;
			@Pc(27) int local27 = 0;
			while (true) {
				@Pc(31) int local31 = local10.method2413();
				if (local31 == 0) {
					break;
				}
				local27 += local31 - 1;
				@Pc(43) int local43 = local27 & 0x3F;
				@Pc(49) int local49 = local27 >> 6 & 0x3F;
				@Pc(53) int local53 = local27 >> 12;
				@Pc(57) int local57 = local10.method2380();
				@Pc(61) int local61 = local57 >> 2;
				@Pc(65) int local65 = local57 & 0x3;
				@Pc(69) int local69 = arg5 + local49;
				@Pc(73) int local73 = arg2 + local43;
				if (local69 > 0 && local73 > 0 && Static92.anInt2048 - 1 > local69 && local73 < Static290.anInt5893 - 1) {
					@Pc(92) Class174 local92 = null;
					if (!arg4) {
						@Pc(96) int local96 = local53;
						if ((Static348.aByteArrayArrayArray11[1][local69][local73] & 0x2) == 2) {
							local96 = local53 - 1;
						}
						if (local96 >= 0) {
							local92 = arg0[local96];
						}
					}
					Static46.method880(arg4, local73, local69, local53, true, -1, local92, local12, local61, local53, arg1, local65);
				}
			}
		}
	}
}
