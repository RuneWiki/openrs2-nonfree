import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!oc", name = "M", descriptor = "Lclient!ra;")
	public static final Class320 aClass320_24 = new Class320(13);

	@OriginalMember(owner = "client!oc", name = "I", descriptor = "Lclient!dc;")
	public static final Class72 aClass72_20 = new Class72();

	@OriginalMember(owner = "client!oc", name = "A", descriptor = "Lclient!qfa;")
	public static final Class307 aClass307_71 = new Class307(64);

	@OriginalMember(owner = "client!oc", name = "K", descriptor = "Lclient!ra;")
	public static final Class320 aClass320_25 = new Class320(33);

	@OriginalMember(owner = "client!oc", name = "B", descriptor = "[B")
	public static final byte[] aByteArray70 = new byte[520];

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(BII)I")
	public static int method6241(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13;
		if (arg1 < arg0) {
			local13 = arg1;
			arg1 = arg0;
			arg0 = local13;
		}
		while (arg0 != 0) {
			local13 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local13;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I[BIIIII[BI)V")
	public static void method6242(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg7 >> 2);
		@Pc(25) int local25 = -(arg7 & 0x3);
		for (@Pc(28) int local28 = -arg0; local28 < 0; local28++) {
			@Pc(36) int local36;
			for (@Pc(32) int local32 = local10; local32 < 0; local32++) {
				local36 = arg4++;
				arg6[local36] += arg1[arg2++];
				@Pc(48) int local48 = arg4++;
				arg6[local48] += arg1[arg2++];
				@Pc(60) int local60 = arg4++;
				arg6[local60] += arg1[arg2++];
				@Pc(72) int local72 = arg4++;
				arg6[local72] += arg1[arg2++];
			}
			for (@Pc(89) int local89 = local25; local89 < 0; local89++) {
				local36 = arg4++;
				arg6[local36] += arg1[arg2++];
			}
			arg2 += arg3;
			arg4 += arg5;
		}
	}
}
