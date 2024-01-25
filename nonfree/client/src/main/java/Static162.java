import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!gm", name = "r", descriptor = "Lclient!gv;")
	public static Class108 aClass108_1;

	@OriginalMember(owner = "client!gm", name = "t", descriptor = "I")
	public static int anInt2943;

	@OriginalMember(owner = "client!gm", name = "v", descriptor = "Lclient!qp;")
	public static Class239 aClass239_77;

	@OriginalMember(owner = "client!gm", name = "q", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_39 = new Class243(42, 3);

	@OriginalMember(owner = "client!gm", name = "s", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_76 = new Class239(17, -2);

	@OriginalMember(owner = "client!gm", name = "u", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_95 = new Class202("M", "M", "M", "M");

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(III)V")
	public static void method2737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class2_Sub13_Sub15 local13 = Static370.method5893(arg1, 14);
		local13.method6968();
		local13.anInt8318 = arg0;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IILclient!pa;Lclient!wca;IIIBJ)V")
	public static void method2747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class209 arg2, @OriginalArg(3) Class310 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) long arg7) {
		@Pc(12) int local12 = arg4 * arg4 + arg5 * arg5;
		if ((long) local12 > arg7) {
			return;
		}
		@Pc(39) int local39 = Math.min(arg3.anInt9163 / 2, arg3.anInt9198 / 2);
		if (local39 * local39 >= local12) {
			Static426.method6571(arg5, arg6, Static428.aClass35Array34[arg0], arg4, arg3, arg1, arg2);
			return;
		}
		local39 -= 10;
		@Pc(55) int local55;
		if (Static427.anInt7875 == 4) {
			local55 = (int) Static161.aFloat56 & 0x3FFF;
		} else {
			local55 = Static87.anInt1767 + (int) Static161.aFloat56 & 0x3FFF;
		}
		@Pc(66) int local66 = Class125.anIntArray381[local55];
		@Pc(70) int local70 = Class125.anIntArray382[local55];
		if (Static427.anInt7875 != 4) {
			local70 = local70 * 256 / (Static3.anInt111 + 256);
			local66 = local66 * 256 / (Static3.anInt111 + 256);
		}
		@Pc(102) int local102 = arg5 * local66 + arg4 * local70 >> 15;
		@Pc(113) int local113 = arg5 * local70 - local66 * arg4 >> 15;
		@Pc(119) double local119 = Math.atan2((double) local102, (double) local113);
		@Pc(126) int local126 = (int) (Math.sin(local119) * (double) local39);
		@Pc(133) int local133 = (int) ((double) local39 * Math.cos(local119));
		Static65.aClass35Array6[arg0].method7348((float) local126 + (float) arg3.anInt9163 / 2.0F + (float) arg6, (float) -local133 + (float) arg3.anInt9198 / 2.0F + (float) arg1, 4096, (int) (-local119 / 6.283185307179586D * 65535.0D));
	}
}
