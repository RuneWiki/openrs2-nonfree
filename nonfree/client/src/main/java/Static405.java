import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!nq", name = "g", descriptor = "I")
	public static int anInt6913;

	@OriginalMember(owner = "client!nq", name = "h", descriptor = "Lclient!nf;")
	public static Class102 aClass102_32;

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_99 = new Class376(64, 11);

	@OriginalMember(owner = "client!nq", name = "i", descriptor = "I")
	public static int anInt6914 = 0;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IJILclient!kh;IILclient!aa;II)V")
	public static void method5785(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class208 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) int local11 = arg2 * arg2 + arg0 * arg0;
		if (arg1 < (long) local11) {
			return;
		}
		@Pc(35) int local35 = Math.min(arg3.anInt5639 / 2, arg3.anInt5630 / 2);
		if (local11 <= local35 * local35) {
			Static378.method5558(arg2, arg4, Static280.aClass102Array14[arg7], arg5, arg6, arg0, arg3);
			return;
		}
		local35 -= 10;
		@Pc(49) int local49;
		if (Static378.anInt6662 == 4) {
			local49 = (int) Static204.aFloat82 & 0x3FFF;
		} else {
			local49 = Static56.anInt1426 + (int) Static204.aFloat82 & 0x3FFF;
		}
		@Pc(62) int local62 = Class3_Sub7_Sub2.anIntArray171[local49];
		@Pc(66) int local66 = Class3_Sub7_Sub2.anIntArray170[local49];
		if (Static378.anInt6662 != 4) {
			local62 = local62 * 256 / (Static433.anInt7606 + 256);
			local66 = local66 * 256 / (Static433.anInt7606 + 256);
		}
		@Pc(97) int local97 = local62 * arg2 + arg0 * local66 >> 14;
		@Pc(108) int local108 = local66 * arg2 - local62 * arg0 >> 14;
		@Pc(114) double local114 = Math.atan2((double) local97, (double) local108);
		@Pc(121) int local121 = (int) (Math.sin(local114) * (double) local35);
		@Pc(128) int local128 = (int) ((double) local35 * Math.cos(local114));
		Static250.aClass102Array11[arg7].method6963((float) local121 + (float) arg4 + (float) arg3.anInt5639 / 2.0F, (float) -local128 + (float) arg6 + (float) arg3.anInt5630 / 2.0F, 4096, (int) (-local114 / 6.283185307179586D * 65535.0D));
	}
}
