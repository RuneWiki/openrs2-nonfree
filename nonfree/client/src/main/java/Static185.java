import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!jk", name = "l", descriptor = "[J")
	public static long[] aLongArray4;

	@OriginalMember(owner = "client!jk", name = "h", descriptor = "Lclient!nj;")
	public static final Class171 aClass171_30 = new Class171(4);

	@OriginalMember(owner = "client!jk", name = "j", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_73 = new Class265(67, 5);

	@OriginalMember(owner = "client!jk", name = "k", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_74 = new Class265(52, 18);

	@OriginalMember(owner = "client!jk", name = "m", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_75 = new Class265(54, 9);

	@OriginalMember(owner = "client!jk", name = "n", descriptor = "[I")
	public static final int[] anIntArray317 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!jk", name = "o", descriptor = "[I")
	public static final int[] anIntArray318 = new int[4096];

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
	public static void method2952() {
		@Pc(5) int local5 = 0;
		if (Static12.aClass79_Sub1_1.method3959(Static399.anInt6653)) {
			local5 = 55;
		}
		if (!Static12.aClass79_Sub1_1.aBoolean352) {
			local5 |= 0x40;
		}
		Static162.method2646(local5);
		Static118.aClass165_2.method3802(local5);
		Static318.aClass144_6.method3268(local5);
		Static219.aClass76_2.method1884(local5);
		Static395.aClass247_2.method5405(local5);
		Static401.method5278(local5);
		Static35.method594(local5);
		Static258.method586(local5);
		Static179.method2880(local5);
		if (Static162.anInt3250 == 10) {
			Static365.method4986(28);
		} else if (Static162.anInt3250 == 30) {
			Static365.method4986(25);
			return;
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(B[[[Lclient!hg;)V")
	public static void method2955(@OriginalArg(1) Class106[][][] arg0) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class106[][] local9 = arg0[local3];
			for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < local9[local11].length; local15++) {
					@Pc(23) Class106 local23 = local9[local11][local15];
					if (local23 != null) {
						if (local23.aClass3_Sub1_2 instanceof Interface6) {
							((Interface6) local23.aClass3_Sub1_2).method5150();
						}
						if (local23.aClass3_Sub3_1 instanceof Interface6) {
							((Interface6) local23.aClass3_Sub3_1).method5150();
						}
						if (local23.aClass3_Sub3_2 instanceof Interface6) {
							((Interface6) local23.aClass3_Sub3_2).method5150();
						}
						if (local23.aClass3_Sub5_1 instanceof Interface6) {
							((Interface6) local23.aClass3_Sub5_1).method5150();
						}
						if (local23.aClass3_Sub5_2 instanceof Interface6) {
							((Interface6) local23.aClass3_Sub5_2).method5150();
						}
						for (@Pc(73) Class4 local73 = local23.aClass4_3; local73 != null; local73 = local73.aClass4_1) {
							@Pc(78) Class3_Sub2 local78 = local73.aClass3_Sub2_1;
							if (local78 instanceof Interface6) {
								((Interface6) local78).method5150();
							}
						}
					}
				}
			}
		}
	}
}
