import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "F")
	public static float aFloat167;

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "[I")
	public static final int[] anIntArray512 = new int[25];

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "[F")
	public static final float[] aFloatArray71 = new float[16];

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "([Lclient!vs;II)V")
	public static void method6943(@OriginalArg(0) Class20_Sub2[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class20_Sub2 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt10727;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt10727 < local27 + (local29 & 0x1)) {
				@Pc(44) Class20_Sub2 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method6943(arg0, arg1, local10 - 1);
		method6943(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
	public static void method6944() {
		if (Static177.aString43.toLowerCase().indexOf("microsoft") != -1) {
			Static631.anIntArray636[189] = 26;
			Static631.anIntArray636[190] = 72;
			Static631.anIntArray636[219] = 42;
			Static631.anIntArray636[221] = 43;
			Static631.anIntArray636[191] = 73;
			Static631.anIntArray636[187] = 27;
			Static631.anIntArray636[223] = 28;
			Static631.anIntArray636[188] = 71;
			Static631.anIntArray636[192] = 58;
			Static631.anIntArray636[220] = 74;
			Static631.anIntArray636[186] = 57;
			Static631.anIntArray636[222] = 59;
			return;
		}
		Static631.anIntArray636[91] = 42;
		if (Static177.aMethod1 == null) {
			Static631.anIntArray636[222] = 59;
			Static631.anIntArray636[192] = 58;
		} else {
			Static631.anIntArray636[222] = 58;
			Static631.anIntArray636[192] = 28;
			Static631.anIntArray636[520] = 59;
		}
		Static631.anIntArray636[93] = 43;
		Static631.anIntArray636[92] = 74;
		Static631.anIntArray636[46] = 72;
		Static631.anIntArray636[47] = 73;
		Static631.anIntArray636[59] = 57;
		Static631.anIntArray636[45] = 26;
		Static631.anIntArray636[44] = 71;
		Static631.anIntArray636[61] = 27;
	}
}
