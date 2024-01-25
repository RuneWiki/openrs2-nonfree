import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!k", name = "n", descriptor = "F")
	public static float aFloat116;

	@OriginalMember(owner = "client!k", name = "u", descriptor = "I")
	public static int anInt5555;

	@OriginalMember(owner = "client!k", name = "o", descriptor = "[S")
	public static final short[] aShortArray75 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!k", name = "p", descriptor = "Lclient!tc;")
	public static Class305 aClass305_6 = null;

	@OriginalMember(owner = "client!k", name = "v", descriptor = "[I")
	public static int[] anIntArray333 = new int[2];

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIB)I")
	public static int method4596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static296.anIntArray369[arg1 & 0x3] : Static417.anIntArray501[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(B[I)Ljava/lang/String;")
	public static String method4598(@OriginalArg(1) int[] arg0) {
		@Pc(7) StringBuffer local7 = new StringBuffer();
		@Pc(9) int local9 = Static347.anInt7042;
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			@Pc(19) Class63 local19 = Static440.aClass187_2.method4849(arg0[local11]);
			if (local19.anInt2293 != -1) {
				@Pc(31) Class37 local31 = (Class37) Static403.aClass211_50.method5534((long) local19.anInt2293);
				if (local31 == null) {
					@Pc(39) Class20 local39 = Static599.method814(Static579.aClass254_137, local19.anInt2293, 0);
					if (local39 != null) {
						local31 = Static546.aClass15_16.method5275(local39, true);
						Static403.aClass211_50.method5529((long) local19.anInt2293, local31);
					}
				}
				if (local31 != null) {
					Static528.aClass37Array11[local9] = local31;
					local7.append(" <img=").append(local9).append(">");
					local9++;
				}
			}
		}
		return local7.toString();
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(B[Lclient!tc;I)V")
	public static void method4599(@OriginalArg(1) Class305[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(10) int local10 = 0; local10 < arg0.length; local10++) {
			@Pc(15) Class305 local15 = arg0[local10];
			if (local15 != null && arg1 == local15.anInt9199 && !Static68.method1702(local15)) {
				if (local15.anInt9211 == 0) {
					method4599(arg0, local15.anInt9167);
					if (local15.aClass305Array2 != null) {
						method4599(local15.aClass305Array2, local15.anInt9167);
					}
					@Pc(52) Class3_Sub18 local52 = (Class3_Sub18) Static283.aClass25_23.method946((long) local15.anInt9167);
					if (local52 != null) {
						Static101.method2147(local52.anInt3962);
					}
				}
				if (local15.anInt9211 == 6 && local15.anInt9189 != -1) {
					@Pc(73) Class174 local73 = Static532.aClass157_2.method3734(local15.anInt9189);
					if (local73 != null) {
						local15.anInt9183 += Static377.anInt7320;
						@Pc(84) int local84 = local15.anInt9204;
						while (local15.anInt9183 > local73.anIntArray325[local15.anInt9204]) {
							local15.anInt9183 -= local73.anIntArray325[local15.anInt9204];
							local15.anInt9204++;
							if (local15.anInt9204 >= local73.anIntArray326.length) {
								local15.anInt9204 -= local73.anInt5485;
								if (local15.anInt9204 < 0 || local15.anInt9204 >= local73.anIntArray326.length) {
									local15.anInt9204 = 0;
								}
							}
							local15.anInt9186 = local15.anInt9204 + 1;
							if (local73.anIntArray326.length <= local15.anInt9186) {
								local15.anInt9186 -= local73.anInt5485;
								if (local15.anInt9186 < 0 || local73.anIntArray326.length <= local15.anInt9186) {
									local15.anInt9186 = -1;
								}
							}
							Static282.method4860(local15);
						}
						if (local84 != local15.anInt9204) {
							Static499.method7540(local73, local15.anInt9204);
						}
					}
				}
			}
		}
	}
}
