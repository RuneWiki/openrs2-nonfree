import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
	public static int anInt5411;

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString177 = "glow2:";

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString178 = "Started 3d Library";

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIILclient!h;Lclient!h;IIIIJ)V")
	public static void method4235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class22 arg4, @OriginalArg(5) Class22 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) long arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class102 local6 = new Class102();
		local6.aLong113 = arg10;
		local6.anInt2949 = arg1 * 128 + 64;
		local6.anInt2953 = arg2 * 128 + 64;
		local6.anInt2943 = arg3;
		local6.aClass22_4 = arg4;
		local6.aClass22_5 = arg5;
		local6.anInt2947 = arg6;
		local6.anInt2950 = arg7;
		local6.anInt2945 = arg8;
		local6.anInt2951 = arg9;
		for (@Pc(46) int local46 = arg0; local46 >= 0; local46--) {
			if (Static122.aClass1_Sub17ArrayArrayArray3[local46][arg1][arg2] == null) {
				Static122.aClass1_Sub17ArrayArrayArray3[local46][arg1][arg2] = new Class1_Sub17(local46, arg1, arg2);
			}
		}
		Static122.aClass1_Sub17ArrayArrayArray3[arg0][arg1][arg2].aClass102_1 = local6;
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)V")
	public static void method4236() {
		Static111.aClass169_65.method4018();
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(II)V")
	public static void method4237(@OriginalArg(1) int arg0) {
		if (arg0 > 256) {
			arg0 = 256;
		}
		if (arg0 > 10) {
			arg0 = 10;
		}
		Static87.anInt1607 += arg0 * 128;
		@Pc(48) int local48;
		if (Static87.anInt1607 > Static95.anIntArray474.length) {
			Static87.anInt1607 -= Static95.anIntArray474.length;
			local48 = (int) (Math.random() * 12.0D);
			Static134.method2181(Static143.aClass103_Sub2Array1[local48]);
		}
		local48 = 0;
		@Pc(59) int local59 = arg0 * 128;
		@Pc(65) int local65 = (256 - arg0) * 128;
		@Pc(67) int local67;
		@Pc(97) int local97;
		for (local67 = 0; local67 < local65; local67++) {
			local97 = Static311.anIntArray531[local48 + local59] - arg0 * Static95.anIntArray474[Static87.anInt1607 + local48 & Static95.anIntArray474.length + -1] / 6;
			if (local97 < 0) {
				local97 = 0;
			}
			Static311.anIntArray531[local48++] = local97;
		}
		@Pc(137) int local137;
		@Pc(147) int local147;
		for (local67 = 256 - arg0; local67 < 256; local67++) {
			local97 = local67 * 128;
			for (local137 = 0; local137 < 128; local137++) {
				local147 = (int) (Math.random() * 100.0D);
				if (local147 < 50 && local137 > 10 && local137 < 118) {
					Static311.anIntArray531[local137 + local97] = 255;
				} else {
					Static311.anIntArray531[local137 + local97] = 0;
				}
			}
		}
		for (local67 = 0; local67 < 256 - arg0; local67++) {
			Static36.anIntArray53[local67] = Static36.anIntArray53[arg0 + local67];
		}
		for (local67 = 256 - arg0; local67 < 256; local67++) {
			Static36.anIntArray53[local67] = (int) (Math.sin((double) Static225.anInt4440 / 14.0D) * 16.0D + Math.sin((double) Static225.anInt4440 / 15.0D) * 14.0D + Math.sin((double) Static225.anInt4440 / 16.0D) * 12.0D);
			Static225.anInt4440++;
		}
		Static122.anInt2458 += arg0;
		local67 = ((Static37.anInt757 & 0x1) + arg0) / 2;
		if (local67 <= 0) {
			return;
		}
		for (local97 = 0; local97 < Static122.anInt2458; local97++) {
			local137 = (int) (Math.random() * 124.0D) + 2;
			local147 = (int) (Math.random() * 128.0D) + 128;
			Static311.anIntArray531[local137 + (local147 << 7)] = 192;
		}
		Static122.anInt2458 = 0;
		@Pc(312) int local312;
		for (local97 = 0; local97 < 256; local97++) {
			local147 = local97 * 128;
			local137 = 0;
			for (local312 = -local67; local312 < 128; local312++) {
				if (local312 + local67 < 128) {
					local137 += Static311.anIntArray531[local67 + local147 + local312];
				}
				if (local312 - local67 - 1 >= 0) {
					local137 -= Static311.anIntArray531[local147 + local312 - local67 - 1];
				}
				if (local312 >= 0) {
					Static258.anIntArray452[local147 + local312] = local137 / (local67 * 2 + 1);
				}
			}
		}
		for (local97 = 0; local97 < 128; local97++) {
			local137 = 0;
			for (local147 = -local67; local147 < 256; local147++) {
				local312 = local147 * 128;
				if (local147 + local67 < 256) {
					local137 += Static258.anIntArray452[local312 + local97 + local67 * 128];
				}
				if (local147 - local67 - 1 >= 0) {
					local137 -= Static258.anIntArray452[local97 + local312 - local67 * 128 - 128];
				}
				if (local147 >= 0) {
					Static311.anIntArray531[local312 + local97] = local137 / (local67 * 2 + 1);
				}
			}
		}
	}
}
