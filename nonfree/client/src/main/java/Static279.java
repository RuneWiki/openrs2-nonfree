import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!o", name = "j", descriptor = "I")
	public static int anInt4747;

	@OriginalMember(owner = "client!o", name = "m", descriptor = "I")
	public static int anInt4749;

	@OriginalMember(owner = "client!o", name = "d", descriptor = "[I")
	public static final int[] anIntArray416 = new int[1000];

	@OriginalMember(owner = "client!o", name = "h", descriptor = "I")
	public static int anInt4745 = 0;

	@OriginalMember(owner = "client!o", name = "l", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_78 = new Class186(10, 8);

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIFFFIIFLclient!gg;F[BI)V")
	public static void method4215(@OriginalArg(3) float arg0, @OriginalArg(4) float arg1, @OriginalArg(5) float arg2, @OriginalArg(7) int arg3, @OriginalArg(8) float arg4, @OriginalArg(9) Class95 arg5, @OriginalArg(10) float arg6, @OriginalArg(11) byte[] arg7) {
		for (@Pc(8) int local8 = 0; local8 < 16; local8++) {
			Static160.method2634(arg0, arg7, arg6, arg3, arg5, arg4, arg1, arg2, local8);
			arg3 += 16384;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIZ)V")
	public static void method4217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class6_Sub1_Sub12 local8 = Static449.method5975(arg0, 6);
		local8.method3043();
		local8.anInt3397 = arg1;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
	public static void method4219() {
		@Pc(9) Class220 local9 = Static135.aClass220_16;
		synchronized (Static135.aClass220_16) {
			Static135.aClass220_16.method4999();
		}
		local9 = Static61.aClass220_4;
		synchronized (Static61.aClass220_4) {
			Static61.aClass220_4.method4999();
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIZFIIIII)[[I")
	public static int[][] method4220(@OriginalArg(3) float arg0) {
		@Pc(7) int[][] local7 = new int[256][64];
		@Pc(11) Class6_Sub2_Sub11 local11 = new Class6_Sub2_Sub11();
		local11.anInt2222 = 3;
		local11.anInt2220 = 4;
		local11.anInt2218 = 8;
		local11.aBoolean167 = false;
		local11.anInt2228 = (int) (arg0 * 4096.0F);
		local11.method5862();
		Static11.method147(256, 64);
		for (@Pc(38) int local38 = 0; local38 < 256; local38++) {
			local11.method2031(local7[local38], local38);
		}
		return local7;
	}
}
