import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "Lclient!hc;")
	public static Class51 aClass51_53;

	@OriginalMember(owner = "client!nd", name = "w", descriptor = "Lclient!se;")
	public static Class122 aClass122_11;

	@OriginalMember(owner = "client!nd", name = "v", descriptor = "[I")
	public static int[] anIntArray274 = new int[2000];

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BI)Lclient!g;")
	public static Class45 method2756(@OriginalArg(1) int arg0) {
		@Pc(10) Class45 local10 = (Class45) Static218.aClass79_32.method2483((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static221.aClass51_72.method1874(Static178.method3052(arg0), Static146.method2661(arg0));
		local10 = new Class45();
		local10.anInt2009 = arg0;
		if (local24 != null) {
			local10.method1463(new Class1_Sub13(local24));
		}
		local10.method1462();
		Static218.aClass79_32.method2486(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)[Lclient!ke;")
	public static Class1_Sub2_Sub4[] method2757() {
		@Pc(8) Class1_Sub2_Sub4[] local8 = new Class1_Sub2_Sub4[Static75.anInt2041];
		for (@Pc(10) int local10 = 0; local10 < Static75.anInt2041; local10++) {
			@Pc(20) int local20 = Static233.anIntArray438[local10] * Static218.anIntArray382[local10];
			@Pc(24) byte[] local24 = Static11.aByteArrayArray1[local10];
			if (Static74.aBooleanArray4[local10]) {
				@Pc(32) byte[] local32 = Static147.aByteArrayArray7[local10];
				@Pc(35) int[] local35 = new int[local20];
				for (@Pc(37) int local37 = 0; local37 < local20; local37++) {
					local35[local37] = Static102.anIntArray201[local24[local37] & 0xFF] | (local32[local37] & 0xFF) << 24;
				}
				local8[local10] = new Class1_Sub2_Sub4_Sub1_Sub1(Static24.anInt806, Static240.anInt5164, Static202.anIntArray345[local10], Static79.anIntArray165[local10], Static218.anIntArray382[local10], Static233.anIntArray438[local10], local35);
			} else {
				@Pc(87) int[] local87 = new int[local20];
				for (@Pc(89) int local89 = 0; local89 < local20; local89++) {
					local87[local89] = Static102.anIntArray201[local24[local89] & 0xFF];
				}
				local8[local10] = new Class1_Sub2_Sub4_Sub1(Static24.anInt806, Static240.anInt5164, Static202.anIntArray345[local10], Static79.anIntArray165[local10], Static218.anIntArray382[local10], Static233.anIntArray438[local10], local87);
			}
		}
		Static259.method4155();
		return local8;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(IZI)V")
	public static void method2758(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static206.anInt4549 = Static46.anInt1376 + Static174.anInt3997 - arg1 - 1;
		Static249.anInt5332 = arg0 - Static209.anInt4574;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIZII)V")
	public static void method2759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static202.anInt4469 <= arg2 && arg2 <= Static94.anInt4237) {
			@Pc(11) int local11 = Static3.method36(Static167.anInt3907, arg3, Static150.anInt3860);
			@Pc(17) int local17 = Static3.method36(Static167.anInt3907, arg1, Static150.anInt3860);
			Static91.method1949(arg2, arg0, local17, local11);
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!gg;)V")
	public static void method2760(@OriginalArg(0) Class47 arg0) {
		for (@Pc(2) int local2 = arg0.anInt2146; local2 <= arg0.anInt2160; local2++) {
			for (@Pc(6) int local6 = arg0.anInt2148; local6 <= arg0.anInt2158; local6++) {
				@Pc(16) Class1_Sub16 local16 = Static142.aClass1_Sub16ArrayArrayArray4[arg0.anInt2159][local2][local6];
				if (local16 != null) {
					@Pc(35) int local35;
					for (@Pc(20) int local20 = 0; local20 < local16.anInt2929; local20++) {
						if (local16.aClass47Array1[local20] == arg0) {
							local16.anInt2929--;
							for (local35 = local20; local35 < local16.anInt2929; local35++) {
								local16.aClass47Array1[local35] = local16.aClass47Array1[local35 + 1];
								local16.anIntArray214[local35] = local16.anIntArray214[local35 + 1];
							}
							local16.aClass47Array1[local16.anInt2929] = null;
							break;
						}
					}
					local16.anInt2932 = 0;
					for (local35 = 0; local35 < local16.anInt2929; local35++) {
						local16.anInt2932 |= local16.anIntArray214[local35];
					}
				}
			}
		}
	}
}
