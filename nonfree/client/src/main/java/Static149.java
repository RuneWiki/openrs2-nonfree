import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!ob", name = "L", descriptor = "I")
	public static int anInt3109;

	@OriginalMember(owner = "client!ob", name = "O", descriptor = "[I")
	public static int[] anIntArray324;

	@OriginalMember(owner = "client!ob", name = "D", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1025 = Static186.method3527("Please wait)3)3)3");

	@OriginalMember(owner = "client!ob", name = "E", descriptor = "[I")
	public static int[] anIntArray323 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!ob", name = "I", descriptor = "[Lclient!hh;")
	public static Class50[] aClass50Array58 = new Class50[200];

	@OriginalMember(owner = "client!ob", name = "M", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1026 = aClass50_1025;

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)V")
	public static void method2500() {
		Static31.aClass84_12.method2576();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IBI)V")
	public static void method2501(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(10) int local10 = 0; local10 < Static223.anInt4339; local10++) {
			@Pc(18) Class69 local18 = Static211.method3291(local10);
			if (local18 != null) {
				@Pc(23) int local23 = local18.anInt2302;
				if (local23 >= 0 && !Static215.anInterface4_3.method2511(local23)) {
					local23 = -1;
				}
				@Pc(55) int local55;
				@Pc(65) int local65;
				@Pc(71) int local71;
				@Pc(97) int local97;
				if (local18.anInt2307 >= 0) {
					local65 = local18.anInt2307;
					local71 = arg0 + (local65 & 0x7F);
					if (local71 < 0) {
						local71 = 0;
					} else if (local71 > 127) {
						local71 = 127;
					}
					local97 = local71 + (local65 & 0x380) + (arg1 + local65 & 0xFC00);
					local55 = Static215.anIntArray494[Static71.method1025(local97, 96)];
				} else if (local23 >= 0) {
					local55 = Static215.anIntArray494[Static71.method1025(Static215.anInterface4_3.method2508(local23), 96)];
				} else if (local18.anInt2306 == -1) {
					local55 = -1;
				} else {
					local65 = local18.anInt2306;
					local71 = arg0 + (local65 & 0x7F);
					if (local71 < 0) {
						local71 = 0;
					} else if (local71 > 127) {
						local71 = 127;
					}
					local97 = local71 + (local65 & 0x380) + (arg1 + local65 & 0xFC00);
					local55 = Static215.anIntArray494[Static71.method1025(local97, 96)];
				}
				Static114.anIntArray256[local10 + 1] = local55;
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILjava/lang/String;)Lclient!hh;")
	public static Class50 method2502(@OriginalArg(1) String arg0) {
		@Pc(9) byte[] local9;
		try {
			local9 = arg0.getBytes("ISO-8859-1");
		} catch (@Pc(11) UnsupportedEncodingException local11) {
			local9 = arg0.getBytes();
		}
		@Pc(18) Class50 local18 = new Class50();
		local18.aByteArray12 = local9;
		local18.anInt1705 = 0;
		for (@Pc(34) int local34 = 0; local34 < local9.length; local34++) {
			if (local9[local34] != 0) {
				local9[local18.anInt1705++] = local9[local34];
			}
		}
		return local18;
	}
}
