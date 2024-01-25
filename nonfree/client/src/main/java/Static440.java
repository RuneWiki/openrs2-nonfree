import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
	public static int anInt2580;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "Lclient!pda;")
	public static Class283 aClass283_5;

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_76 = new Class160(124, 0);

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "Lclient!oga;")
	public static final Class269 aClass269_60 = new Class269();

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
	public static int anInt2581 = 0;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIILclient!in;)V")
	public static void method2421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub3_Sub4 arg4) {
		@Pc(4) Class89 local4 = Static289.method4810(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		arg4.anInt11184 = (arg1 << Static110.anInt1858) + Static193.anInt9749;
		arg4.anInt11182 = arg3;
		arg4.anInt11178 = (arg2 << Static110.anInt1858) + Static193.anInt9749;
		local4.aClass4_Sub3_Sub4_1 = arg4;
		@Pc(36) int local36 = Static258.aClass159Array1 == Static346.aClass159Array2 ? 1 : 0;
		if (arg4.method9489()) {
			if (arg4.method9476()) {
				arg4.aClass4_Sub3_25 = Static111.aClass4_Sub3Array2[local36];
				Static111.aClass4_Sub3Array2[local36] = arg4;
				return;
			}
			arg4.aClass4_Sub3_25 = Static664.aClass4_Sub3Array5[local36];
			Static664.aClass4_Sub3Array5[local36] = arg4;
			Static282.aBoolean384 = true;
			return;
		}
		arg4.aClass4_Sub3_25 = Static170.aClass4_Sub3Array3[local36];
		Static170.aClass4_Sub3Array3[local36] = arg4;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIILclient!ha;Lclient!qga;)V")
	public static void method2422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class144 arg4, @OriginalArg(5) Class299 arg5) {
		for (@Pc(3) int local3 = 7; local3 >= 0; local3--) {
			for (@Pc(9) int local9 = 127; local9 >= 0; local9--) {
				@Pc(27) int local27 = (arg0 & 0x3F) << 10 | (local3 & 0x7) << 7 | local9 & 0x7F;
				Static302.method4913(true, false);
				@Pc(35) int local35 = Static302.anIntArray299[local27];
				Static545.method5452(arg2 ^ 0xAE16CBE4, false, true);
				arg4.aa(arg3 + (arg5.anInt8573 * local9 >> 7), (arg5.anInt8547 * (-local3 + 7) >> 3) + arg1, (arg5.anInt8573 >> 7) + 1, (arg5.anInt8547 >> 3) + 1, local35, 0);
			}
		}
		if (arg2 != 1374237767) {
			method2422(-79, 30, -60, -91, (Class144) null, (Class299) null);
		}
	}
}
