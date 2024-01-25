import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!mv", name = "J", descriptor = "[I")
	public static int[] anIntArray406;

	@OriginalMember(owner = "client!mv", name = "L", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_141 = new Class81(20, 17);

	@OriginalMember(owner = "client!mv", name = "M", descriptor = "I")
	public static int anInt5996 = -1;

	@OriginalMember(owner = "client!mv", name = "d", descriptor = "(I)V")
	public static void method5031() {
		if (Static340.anInt6045 == -1 || Static248.anInt4644 == -1) {
			return;
		}
		@Pc(25) int local25 = Static251.anInt4677 + (Static141.anInt2724 * (Static60.anInt1501 - Static251.anInt4677) >> 16);
		Static141.anInt2724 += local25;
		if (Static141.anInt2724 < 65535) {
			Static157.aBoolean206 = false;
			Static414.aBoolean508 = false;
		} else {
			Static141.anInt2724 = 65535;
			if (Static157.aBoolean206) {
				Static414.aBoolean508 = false;
			} else {
				Static414.aBoolean508 = true;
			}
			Static157.aBoolean206 = true;
		}
		@Pc(57) float local57 = (float) Static141.anInt2724 / 65535.0F;
		@Pc(60) float[] local60 = new float[3];
		@Pc(64) int local64 = Static151.anInt2849 * 2;
		@Pc(90) int local90;
		@Pc(123) int local123;
		@Pc(131) int local131;
		@Pc(136) int local136;
		@Pc(146) int local146;
		@Pc(164) int local164;
		for (@Pc(66) int local66 = 0; local66 < 3; local66++) {
			@Pc(78) int local78 = Static505.anIntArrayArrayArray18[Static340.anInt6045][local64][local66] * 3;
			local90 = Static505.anIntArrayArrayArray18[Static340.anInt6045][local64 + 1][local66] * 3;
			local123 = (Static505.anIntArrayArrayArray18[Static340.anInt6045][local64 + 2][local66] + Static505.anIntArrayArrayArray18[Static340.anInt6045][local64 + 2][local66] - Static505.anIntArrayArrayArray18[Static340.anInt6045][local64 + 3][local66]) * 3;
			local131 = Static505.anIntArrayArrayArray18[Static340.anInt6045][local64][local66];
			local136 = local90 - local78;
			local146 = local78 + local123 - local90 * 2;
			local164 = Static505.anIntArrayArrayArray18[Static340.anInt6045][local64 + 2][local66] + local90 - local123 - local131;
			local60[local66] = local57 * (local57 * ((float) local146 + (float) local164 * local57) + (float) local136) + (float) local131;
		}
		Static216.anInt4203 = (int) local60[2] - Static24.anInt674 * 512;
		Static350.anInt6168 = (int) local60[1] * -1;
		Static333.anInt5940 = (int) local60[0] - Static376.anInt6631 * 512;
		@Pc(219) float[] local219 = new float[3];
		local90 = Static205.anInt4107 * 2;
		for (local123 = 0; local123 < 3; local123++) {
			local131 = Static505.anIntArrayArrayArray18[Static248.anInt4644][local90][local123] * 3;
			local136 = Static505.anIntArrayArrayArray18[Static248.anInt4644][local90 + 1][local123] * 3;
			local146 = (Static505.anIntArrayArrayArray18[Static248.anInt4644][local90 + 2][local123] + Static505.anIntArrayArrayArray18[Static248.anInt4644][local90 + 2][local123] - Static505.anIntArrayArrayArray18[Static248.anInt4644][local90 + 3][local123]) * 3;
			local164 = Static505.anIntArrayArrayArray18[Static248.anInt4644][local90][local123];
			@Pc(301) int local301 = local136 - local131;
			@Pc(309) int local309 = local131 + local146 - local136 * 2;
			@Pc(327) int local327 = Static505.anIntArrayArrayArray18[Static248.anInt4644][local90 + 2][local123] + local136 - local164 - local146;
			local219[local123] = (float) local164 + (((float) local309 + local57 * (float) local327) * local57 + (float) local301) * local57;
		}
		@Pc(362) float local362 = local219[0] - local60[0];
		@Pc(373) float local373 = (local219[1] - local60[1]) * -1.0F;
		@Pc(382) float local382 = local219[2] - local60[2];
		@Pc(392) double local392 = Math.sqrt((double) (local382 * local382 + local362 * local362));
		Static124.anInt2517 = (int) (Math.atan2((double) local373, local392) * 2607.5945876176133D) & 0x3FFF;
		Static202.anInt4065 = (int) (-Math.atan2((double) local362, (double) local382) * 2607.5945876176133D) & 0x3FFF;
		Static427.anInt7255 = Static505.anIntArrayArrayArray18[Static340.anInt6045][local64][3] + ((Static505.anIntArrayArrayArray18[Static340.anInt6045][local64 + 2][3] - Static505.anIntArrayArrayArray18[Static340.anInt6045][local64][3]) * Static141.anInt2724 >> 16);
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(IIB)I")
	public static int method5033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V")
	public static void method5034(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int arg7) {
		@Pc(9) Class254 local9 = Static498.aClass254Array1[99];
		for (@Pc(11) int local11 = 99; local11 > 0; local11--) {
			Static498.aClass254Array1[local11] = Static498.aClass254Array1[local11 - 1];
		}
		if (local9 == null) {
			local9 = new Class254(arg2, arg5, arg0, arg6, arg3, arg1, arg7, arg4);
		} else {
			local9.method5686(arg1, arg2, arg7, arg4, arg5, arg0, arg6, arg3);
		}
		Static181.anInt3251 = Static274.anInt5077;
		Static419.anInt7122++;
		Static498.aClass254Array1[0] = local9;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IBI)Z")
	public static boolean method5035(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static404.method5706(arg0, arg1) | (arg0 & 0x800) != 0 || Static563.method7586(arg1, arg0);
	}
}
