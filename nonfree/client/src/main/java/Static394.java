import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static394 {

	@OriginalMember(owner = "client!ob", name = "J", descriptor = "[[I")
	public static int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!ob", name = "M", descriptor = "Lclient!kp;")
	public static Class176 aClass176_1;

	@OriginalMember(owner = "client!ob", name = "E", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray5 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!vs;Z[[[BIB)Z")
	public static boolean method6361(@OriginalArg(0) Class20_Sub2 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!Static168.aBoolean253) {
			return false;
		}
		@Pc(8) int local8 = arg0.anInt10725 >> Static643.anInt10682;
		@Pc(10) int local10 = local8;
		@Pc(15) int local15 = arg0.anInt10729 >> Static643.anInt10682;
		@Pc(17) int local17 = local15;
		if (arg0 instanceof Class20_Sub2_Sub2) {
			local10 = ((Class20_Sub2_Sub2) arg0).aShort125;
			local17 = ((Class20_Sub2_Sub2) arg0).aShort122;
			local8 = ((Class20_Sub2_Sub2) arg0).aShort124;
			local15 = ((Class20_Sub2_Sub2) arg0).aShort123;
		}
		for (@Pc(38) int local38 = local8; local38 <= local10; local38++) {
			for (@Pc(41) int local41 = local15; local41 <= local17; local41++) {
				if (arg0.aByte130 < Static535.anInt9275 && local38 >= Static43.anInt861 && local38 < Static297.anInt7294 && local41 >= Static555.anInt9436 && local41 < Static554.anInt1819) {
					if ((arg2 == null || arg0.aByte131 < arg3 || arg2[arg0.aByte131][local38][local41] != arg4) && arg0.method9010() && !arg0.method9015(Static565.aClass100_15)) {
						return false;
					}
					if (!arg1 && local38 >= Static162.anInt3371 - 16 && local38 <= Static162.anInt3371 + 16 && local41 >= Static313.anInt5975 - 16 && local41 <= Static313.anInt5975 + 16) {
						if (Static101.aBoolean145) {
							Static322.aClass352Array1[Static602.anInt10028++].method8372(arg0);
							Static602.anInt10028 %= Static167.anInt3476;
						} else {
							arg0.method9016(Static565.aClass100_15);
						}
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZIIIIJLclient!vd;I)V")
	public static void method6362(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) long arg2, @OriginalArg(6) Class353 arg3) {
		Static95.aBoolean128 = false;
		Static479.aClass353_88 = arg3;
		Static552.aLong245 = arg2;
		Static602.anInt10026 = 1;
		Static476.anInt10356 = 0;
		Static182.anInt3750 = 0;
		Static142.anInt2680 = arg0;
		Static592.anInt9875 = arg1;
		Static112.anInt2206 = 10000;
		Static498.aClass6_Sub3_Sub4_3 = null;
	}
}
