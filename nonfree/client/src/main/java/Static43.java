import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!bw", name = "q", descriptor = "I")
	public static int anInt805;

	@OriginalMember(owner = "client!bw", name = "r", descriptor = "Lclient!la;")
	public static Class92 aClass92_1;

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "Lclient!ew;")
	public static final Class72 aClass72_10 = new Class72(16);

	@OriginalMember(owner = "client!bw", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray5 = new String[8];

	@OriginalMember(owner = "client!bw", name = "m", descriptor = "I")
	public static int anInt801 = 0;

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IIIII[BI)V")
	public static void method645(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5) {
		if (arg3 > 0 && !Static376.method4880(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg5 <= 0 || Static376.method4880(arg5)) {
			@Pc(39) int local39 = Static334.method4468(arg2);
			@Pc(41) int local41 = 0;
			@Pc(48) int local48 = arg5 <= arg3 ? arg5 : arg3;
			@Pc(52) int local52 = arg3 >> 1;
			@Pc(56) int local56 = arg5 >> 1;
			@Pc(58) byte[] local58 = arg4;
			@Pc(65) byte[] local65 = new byte[local39 * local56 * local52];
			while (true) {
				OpenGL.glTexImage2Dub(arg1, local41, arg0, arg3, arg5, 0, arg2, 5121, local58, 0);
				if (local48 <= 1) {
					return;
				}
				@Pc(84) int local84 = local39 * arg3;
				for (@Pc(86) int local86 = 0; local86 < local39; local86++) {
					@Pc(90) int local90 = local86;
					@Pc(92) int local92 = local86;
					@Pc(96) int local96 = local86 + local84;
					for (@Pc(98) int local98 = 0; local98 < local56; local98++) {
						for (@Pc(102) int local102 = 0; local102 < local52; local102++) {
							@Pc(108) byte local108 = local58[local92];
							local92 += local39;
							@Pc(118) int local118 = local108 + local58[local92];
							@Pc(124) int local124 = local118 + local58[local96];
							local92 += local39;
							local96 += local39;
							@Pc(138) int local138 = local124 + local58[local96];
							local65[local90] = (byte) (local138 >> 2);
							local96 += local39;
							local90 += local39;
						}
						local96 += local84;
						local92 += local84;
					}
				}
				@Pc(175) byte[] local175 = local65;
				local65 = local58;
				arg5 = local56;
				local58 = local175;
				arg3 = local52;
				local48 >>= 0x1;
				local41++;
				local52 >>= 0x1;
				local56 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(BI)I")
	public static int method647(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local10 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local10 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			local10 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local10 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local10++;
		}
		return arg0 + local10;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(JZ)V")
	public static void method648(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}
}
