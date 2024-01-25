import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static658 {

	@OriginalMember(owner = "client!uo", name = "E", descriptor = "F")
	public static float aFloat196 = 0.0F;

	@OriginalMember(owner = "client!uo", name = "I", descriptor = "Lclient!gn;")
	public static final Class136 aClass136_48 = new Class136(32);

	@OriginalMember(owner = "client!uo", name = "f", descriptor = "(B)V")
	public static void method8805() {
		Static17.method291();
		Static639.method8665(Static713.aClass3_Sub55_31.aClass15_Sub10_1.method3763() == 1);
		Static164.aClass33_1 = Static326.method4877(0, Static310.aClass47_4, Static67.aCanvas1, 22050);
		Static90.method1213(Static93.method1258((Class3_Sub22_Sub5) null));
		Static261.aClass33_4 = Static326.method4877(1, Static310.aClass47_4, Static67.aCanvas1, 2048);
		Static261.aClass33_4.method8232(Static155.aClass3_Sub22_Sub4_1);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "([Lclient!bla;II)V")
	public static void method8808(@OriginalArg(0) Class19_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class19_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt11205;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt11205 < local27 + (local29 & 0x1)) {
				@Pc(44) Class19_Sub1 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method8808(arg0, arg1, local10 - 1);
		method8808(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "()V")
	public static void method8809() {
		Static121.method2069(Static241.anInt4521);
	}
}
