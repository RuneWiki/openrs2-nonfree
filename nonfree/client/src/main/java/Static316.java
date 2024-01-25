import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!pf", name = "k", descriptor = "Ljava/lang/Object;")
	public static Object anObject8;

	@OriginalMember(owner = "client!pf", name = "q", descriptor = "I")
	public static int anInt5219;

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_197 = new Class67(74, 5);

	@OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
	public static int anInt5221 = 0;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIB)B")
	public static byte method4172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!ta;IBIIILclient!hm;IJ)V")
	public static void method4176(@OriginalArg(0) Class73 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class107 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) long arg7) {
		@Pc(12) int local12 = arg2 * arg2 + arg1 * arg1;
		if (arg7 < (long) local12) {
			return;
		}
		@Pc(36) int local36 = Math.min(arg5.anInt2648 / 2, arg5.anInt2606 / 2);
		if (local36 * local36 >= local12) {
			Static72.method928(arg2, arg5, arg6, arg0, Static377.aClass85Array12[arg4], arg3, arg1);
			return;
		}
		local36 -= 10;
		@Pc(52) int local52;
		if (Static139.anInt2147 == 4) {
			local52 = (int) Static99.aFloat9 & 0x3FFF;
		} else {
			local52 = Static20.anInt301 + (int) Static99.aFloat9 & 0x3FFF;
		}
		@Pc(63) int local63 = Class1_Sub29.anIntArray537[local52];
		@Pc(67) int local67 = Class1_Sub29.anIntArray536[local52];
		if (Static139.anInt2147 != 4) {
			local67 = local67 * 256 / (Static265.anInt4616 + 256);
			local63 = local63 * 256 / (Static265.anInt4616 + 256);
		}
		@Pc(97) int local97 = local63 * arg1 + local67 * arg2 >> 15;
		@Pc(108) int local108 = arg1 * local67 - local63 * arg2 >> 15;
		@Pc(114) double local114 = Math.atan2((double) local97, (double) local108);
		@Pc(121) int local121 = (int) ((double) local36 * Math.sin(local114));
		@Pc(128) int local128 = (int) (Math.cos(local114) * (double) local36);
		Static63.aClass85Array3[arg4].method5401((float) local121 + (float) arg5.anInt2648 / 2.0F + (float) arg6, (float) -local128 + (float) arg3 + (float) arg5.anInt2606 / 2.0F, 4096, (int) (-local114 / 6.283185307179586D * 65535.0D));
	}
}
