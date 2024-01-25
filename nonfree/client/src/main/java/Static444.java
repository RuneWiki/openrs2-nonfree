import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "Lclient!eq;")
	public static Class97 aClass97_111;

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "[I")
	public static final int[] anIntArray536 = new int[8];

	@OriginalMember(owner = "client!pu", name = "d", descriptor = "[I")
	public static final int[] anIntArray537 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!pu", name = "f", descriptor = "[I")
	public static final int[] anIntArray538 = new int[4096];

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(BLclient!vg;)I")
	public static int method6592(@OriginalArg(1) Class11_Sub1_Sub1_Sub2 arg0) {
		if (arg0.anInt3206 == 0) {
			return 0;
		}
		@Pc(64) int local64;
		@Pc(57) int local57;
		if (arg0.anInt3278 != -1) {
			@Pc(18) Class11_Sub1_Sub1_Sub2 local18 = null;
			if (arg0.anInt3278 < 32768) {
				@Pc(44) Class2_Sub51 local44 = (Class2_Sub51) Static357.aClass222_23.method5468((long) arg0.anInt3278);
				if (local44 != null) {
					local18 = local44.aClass11_Sub1_Sub1_Sub2_Sub2_2;
				}
			} else if (arg0.anInt3278 >= 32768) {
				local18 = Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[arg0.anInt3278 - 32768];
			}
			if (local18 != null) {
				local57 = arg0.anInt9925 - local18.anInt9925;
				local64 = arg0.anInt9929 - local18.anInt9929;
				if (local57 != 0 || local64 != 0) {
					arg0.method2771((int) (Math.atan2((double) local57, (double) local64) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class11_Sub1_Sub1_Sub2_Sub1) {
			@Pc(170) Class11_Sub1_Sub1_Sub2_Sub1 local170 = (Class11_Sub1_Sub1_Sub2_Sub1) arg0;
			if (local170.anInt568 != -1 && (local170.anInt3296 == 0 || local170.anInt3295 > 0)) {
				local170.method2771(local170.anInt568);
				local170.anInt568 = -1;
			}
		} else if (arg0 instanceof Class11_Sub1_Sub1_Sub2_Sub2) {
			@Pc(100) Class11_Sub1_Sub1_Sub2_Sub2 local100 = (Class11_Sub1_Sub1_Sub2_Sub2) arg0;
			if (local100.anInt3305 != -1 && (local100.anInt3296 == 0 || local100.anInt3295 > 0)) {
				local57 = local100.anInt9925 - (local100.anInt3305 - Static451.anInt7933 - Static451.anInt7933) * 256;
				local64 = local100.anInt9929 - (local100.anInt3297 - Static470.anInt8063 - Static470.anInt8063) * 256;
				if (local57 != 0 || local64 != 0) {
					local100.method2771((int) (Math.atan2((double) local57, (double) local64) * 2607.5945876176133D) & 0x3FFF);
				}
				local100.anInt3305 = -1;
			}
		}
		return arg0.method2773();
	}
}
