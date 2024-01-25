import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!fc", name = "W", descriptor = "I")
	public static int anInt1820;

	@OriginalMember(owner = "client!fc", name = "y", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_37 = new Class231("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!fc", name = "S", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_50 = new Class25(81, 28);

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!kj;B)V")
	public static void method1777(@OriginalArg(0) Class11_Sub5_Sub2 arg0) {
		if (arg0 instanceof Class11_Sub5_Sub2_Sub2) {
			@Pc(14) Class11_Sub5_Sub2_Sub2 local14 = (Class11_Sub5_Sub2_Sub2) arg0;
			if (local14.aClass82_1 != null) {
				Static85.method1309(local14.aByte101 != Static127.aClass11_Sub5_Sub2_Sub1_2.aByte101, local14);
				return;
			}
		} else if (arg0 instanceof Class11_Sub5_Sub2_Sub1) {
			@Pc(35) Class11_Sub5_Sub2_Sub1 local35 = (Class11_Sub5_Sub2_Sub1) arg0;
			Static364.method5127(local35, Static127.aClass11_Sub5_Sub2_Sub1_2.aByte101 != local35.aByte101);
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIFFF)F")
	public static float method1782(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		@Pc(14) float[] local14 = Static388.aFloatArrayArray6[arg0];
		return arg2 * local14[2] + local14[0] * arg1 + arg3 * local14[1];
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)V")
	public static void method1784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class36 local7 = Static175.aClass36ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass11_Sub1_2 != null) {
			local7.aClass11_Sub1_2 = null;
		}
		if (local7.aClass11_Sub1_3 != null) {
			local7.aClass11_Sub1_3 = null;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIZ)I")
	public static int method1788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg1 + arg0 * 57;
		@Pc(15) int local15 = local9 << 13 ^ local9;
		@Pc(29) int local29 = Integer.MAX_VALUE & local15 * (local15 * 15731 * local15 + 789221) + 1376312589;
		return local29 >> 19 & 0xFF;
	}
}
