import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!tj", name = "m", descriptor = "Lclient!vn;")
	public static Class209 aClass209_9;

	@OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
	public static volatile int anInt5602 = 0;

	@OriginalMember(owner = "client!tj", name = "i", descriptor = "[I")
	public static final int[] anIntArray447 = new int[250];

	@OriginalMember(owner = "client!tj", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString199 = null;

	@OriginalMember(owner = "client!tj", name = "o", descriptor = "I")
	public static int anInt5606 = 0;

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "([BII[Lclient!ao;ZILclient!tj;)V")
	public static void method4717(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class13[] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class122 arg5) {
		@Pc(10) Class3_Sub4 local10 = new Class3_Sub4(arg0);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local10.method3646();
			if (local16 == 0) {
				return;
			}
			local12 += local16;
			@Pc(27) int local27 = 0;
			while (true) {
				@Pc(31) int local31 = local10.method3633();
				if (local31 == 0) {
					break;
				}
				local27 += local31 - 1;
				@Pc(46) int local46 = local27 & 0x3F;
				@Pc(52) int local52 = local27 >> 6 & 0x3F;
				@Pc(56) int local56 = local27 >> 12;
				@Pc(60) int local60 = local10.method3643();
				@Pc(64) int local64 = local60 >> 2;
				@Pc(68) int local68 = local60 & 0x3;
				@Pc(72) int local72 = arg1 + local52;
				@Pc(77) int local77 = local46 + arg4;
				if (local72 > 0 && local77 > 0 && local72 < Static162.anInt2152 - 1 && Static122.anInt2632 - 1 > local77) {
					@Pc(97) Class13 local97 = null;
					if (!arg3) {
						@Pc(101) int local101 = local56;
						if ((Static160.aByteArrayArrayArray9[1][local72][local77] & 0x2) == 2) {
							local101 = local56 - 1;
						}
						if (local101 >= 0) {
							local97 = arg2[local101];
						}
					}
					Static122.method2151(local56, local56, local64, local72, arg5, arg3, -1, local77, local68, local12, true, local97);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4791(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static220.anInt4548 >= 100 && !Static110.aBoolean121 || Static220.anInt4548 >= 200) {
			Static164.method5307(Static10.aString4);
			return;
		}
		@Pc(28) String local28 = Static179.method2989(arg0);
		if (local28 == null) {
			return;
		}
		@Pc(68) String local68;
		for (@Pc(33) int local33 = 0; local33 < Static220.anInt4548; local33++) {
			@Pc(41) String local41 = Static179.method2989(Static12.aStringArray1[local33]);
			if (local41 != null && local41.equals(local28)) {
				Static164.method5307(arg0 + Static103.aString77);
				return;
			}
			if (Static25.aStringArray5[local33] != null) {
				local68 = Static179.method2989(Static25.aStringArray5[local33]);
				if (local68 != null && local68.equals(local28)) {
					Static164.method5307(arg0 + Static103.aString77);
					return;
				}
			}
		}
		for (@Pc(95) int local95 = 0; local95 < Static277.anInt5542; local95++) {
			local68 = Static179.method2989(Static152.aStringArray21[local95]);
			if (local68 != null && local68.equals(local28)) {
				Static164.method5307(Static178.aString140 + arg0 + Static305.aString226);
				return;
			}
			if (Static253.aStringArray31[local95] != null) {
				@Pc(134) String local134 = Static179.method2989(Static253.aStringArray31[local95]);
				if (local134 != null && local134.equals(local28)) {
					Static164.method5307(Static178.aString140 + arg0 + Static305.aString226);
					return;
				}
			}
		}
		if (Static179.method2989(Static349.aClass5_Sub4_Sub4_Sub1_2.aString126).equals(local28)) {
			Static164.method5307(Static50.aString33);
		} else {
			Static291.aClass3_Sub4_Sub2_3.method3682(152);
			Static291.aClass3_Sub4_Sub2_3.method3614(Static54.method909(arg0));
			Static291.aClass3_Sub4_Sub2_3.method3624(arg0);
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lclient!ir;I)V")
	public static void method4797(@OriginalArg(0) Class100 arg0) {
		Static197.anInt4053 = 0;
		Static329.anInt6343 = 0;
		Static223.aClass65_7 = new Class65();
		Static333.aClass8_Sub4_Sub1_Sub1Array2 = new Class8_Sub4_Sub1_Sub1[1024];
		Static116.method2032(arg0);
		Static224.method3901(arg0);
	}
}
