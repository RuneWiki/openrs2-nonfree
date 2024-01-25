import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static522 {

	@OriginalMember(owner = "client!rja", name = "n", descriptor = "[Lclient!cs;")
	public static Class3_Sub3_Sub1_Sub1[] aClass3_Sub3_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!rja", name = "t", descriptor = "I")
	public static int anInt8084;

	@OriginalMember(owner = "client!rja", name = "u", descriptor = "Lclient!un;")
	public static Class365 aClass365_1;

	@OriginalMember(owner = "client!rja", name = "h", descriptor = "[I")
	public static final int[] anIntArray555 = new int[8];

	@OriginalMember(owner = "client!rja", name = "k", descriptor = "Lclient!oh;")
	public static final Class268 aClass268_31 = new Class268("", 10);

	@OriginalMember(owner = "client!rja", name = "r", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_176 = new Class151(26, 6);

	@OriginalMember(owner = "client!rja", name = "s", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger9 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(I[BZIIII[BI)V")
	public static void method7030(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg4 >> 2);
		@Pc(25) int local25 = -(arg4 & 0x3);
		for (@Pc(28) int local28 = -arg3; local28 < 0; local28++) {
			@Pc(36) int local36;
			for (@Pc(32) int local32 = local10; local32 < 0; local32++) {
				local36 = arg2++;
				arg1[local36] += arg6[arg0++];
				@Pc(48) int local48 = arg2++;
				arg1[local48] += arg6[arg0++];
				@Pc(60) int local60 = arg2++;
				arg1[local60] += arg6[arg0++];
				@Pc(72) int local72 = arg2++;
				arg1[local72] += arg6[arg0++];
			}
			for (@Pc(87) int local87 = local25; local87 < 0; local87++) {
				local36 = arg2++;
				arg1[local36] += arg6[arg0++];
			}
			arg2 += arg5;
			arg0 += arg7;
		}
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(BIIII)I")
	public static int method7034(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg0 & 0xF;
		@Pc(19) int local19 = local7 < 8 ? arg2 : arg3;
		@Pc(38) int local38 = local7 >= 4 ? (local7 == 12 || local7 == 14 ? arg2 : arg1) : arg3;
		return ((local7 & 0x1) == 0 ? local19 : -local19) + ((local7 & 0x2) == 0 ? local38 : -local38);
	}
}
