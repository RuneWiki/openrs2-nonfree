import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!pg", name = "P", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1237 = Static51.method932("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!pg", name = "V", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1238 = aClass10_1237;

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "(I)V")
	public static void method2064() {
		aClass10_1237 = null;
		aClass10_1238 = null;
	}

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "(I)V")
	public static void method2065() {
		for (@Pc(15) Class2_Sub20 local15 = (Class2_Sub20) Static136.aClass12_11.method384(); local15 != null; local15 = (Class2_Sub20) Static136.aClass12_11.method381()) {
			if (local15.aClass2_Sub1_Sub10_1 != null) {
				local15.method2158();
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!kh;B)V")
	public static void method2066(@OriginalArg(0) Class29 arg0) {
		Static169.aClass29_70 = arg0;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "([Lclient!fh;II[BLclient!ob;I)V")
	public static void method2067(@OriginalArg(0) Class27[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) Class60 arg3, @OriginalArg(5) int arg4) {
		@Pc(10) Class2_Sub11 local10 = new Class2_Sub11(arg2);
		@Pc(22) int local22 = -1;
		while (true) {
			@Pc(26) int local26 = local10.method1469();
			if (local26 == 0) {
				return;
			}
			@Pc(30) int local30 = 0;
			local22 += local26;
			while (true) {
				@Pc(38) int local38 = local10.method1469();
				if (local38 == 0) {
					break;
				}
				local30 += local38 - 1;
				@Pc(50) int local50 = local30 & 0x3F;
				@Pc(56) int local56 = local30 >> 6 & 0x3F;
				@Pc(60) int local60 = local30 >> 12;
				@Pc(64) int local64 = local10.method1461();
				@Pc(68) int local68 = local64 >> 2;
				@Pc(72) int local72 = local64 & 0x3;
				@Pc(76) int local76 = arg4 + local56;
				@Pc(80) int local80 = local50 + arg1;
				if (local76 > 0 && local80 > 0 && local76 < 103 && local80 < 103) {
					@Pc(96) int local96 = local60;
					if ((Static50.aByteArrayArrayArray3[1][local76][local80] & 0x2) == 2) {
						local96 = local60 - 1;
					}
					@Pc(112) Class27 local112 = null;
					if (local96 >= 0) {
						local112 = arg0[local96];
					}
					Static131.method2088(local72, local76, local60, local80, local68, arg3, local112, local22);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!fa;I)I")
	public static int method2068(@OriginalArg(0) Class23 arg0) {
		@Pc(13) Class2_Sub8 local13 = (Class2_Sub8) Static180.aClass18_14.method683((long) arg0.anInt1056 + ((long) arg0.anInt1057 << 32));
		return local13 == null ? arg0.anInt1091 : local13.anInt1253;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(Z)V")
	public static void method2069() {
		Static26.aClass72_5.method2261();
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(III)I")
	public static int method2070(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 >>> 31;
		return (arg1 + local12) / arg0 - local12;
	}
}
