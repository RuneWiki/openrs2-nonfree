import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!i", name = "i", descriptor = "Lclient!eb;")
	public static Class80 aClass80_5;

	@OriginalMember(owner = "client!i", name = "l", descriptor = "I")
	public static int anInt9211;

	@OriginalMember(owner = "client!i", name = "e", descriptor = "I")
	public static int anInt9206 = -1;

	@OriginalMember(owner = "client!i", name = "g", descriptor = "[I")
	public static final int[] anIntArray693 = new int[1];

	@OriginalMember(owner = "client!i", name = "m", descriptor = "Lclient!vg;")
	public static Class341 aClass341_21 = null;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIII)V")
	public static void method7544(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = arg3;
		@Pc(20) int local20 = -arg3;
		Static433.method6039(arg0, arg3 + arg1, Static171.anIntArrayArray79[arg2], arg1 - arg3);
		@Pc(35) int local35 = -1;
		while (local17 > local15) {
			local35 += 2;
			local15++;
			local20 += local35;
			if (local20 >= 0) {
				local17--;
				local20 -= local17 << 1;
				@Pc(58) int[] local58 = Static171.anIntArrayArray79[local17 + arg2];
				@Pc(64) int[] local64 = Static171.anIntArrayArray79[arg2 - local17];
				@Pc(68) int local68 = arg1 + local15;
				@Pc(73) int local73 = arg1 - local15;
				Static433.method6039(arg0, local68, local58, local73);
				Static433.method6039(arg0, local68, local64, local73);
			}
			@Pc(89) int local89 = arg1 + local17;
			@Pc(94) int local94 = arg1 - local17;
			@Pc(100) int[] local100 = Static171.anIntArrayArray79[local15 + arg2];
			@Pc(107) int[] local107 = Static171.anIntArrayArray79[arg2 - local15];
			Static433.method6039(arg0, local89, local100, local94);
			Static433.method6039(arg0, local89, local107, local94);
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!mo;Ljava/lang/String;I)I")
	public static int method7547(@OriginalArg(0) Class1_Sub35 arg0, @OriginalArg(1) String arg1) {
		@Pc(6) int local6 = arg0.anInt7214;
		@Pc(18) byte[] local18 = Static17.method166(arg1);
		arg0.method5796(local18.length);
		arg0.anInt7214 += Static412.aClass356_1.method7732(0, local18.length, local18, arg0.anInt7214, arg0.aByteArray85);
		return arg0.anInt7214 - local6;
	}
}
