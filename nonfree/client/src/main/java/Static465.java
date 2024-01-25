import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static465 {

	@OriginalMember(owner = "client!qha", name = "f", descriptor = "I")
	public static int anInt7141;

	@OriginalMember(owner = "client!qha", name = "c", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_144 = new Class136(55, 3);

	@OriginalMember(owner = "client!qha", name = "d", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_145 = new Class136(8, 6);

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(IIII)V")
	public static void method6345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = Static627.aClass5_Sub46_31.aClass11_Sub17_4.method5908() * arg2 >> 8;
		if (arg0 == -1 && !Static309.aBoolean451) {
			Static273.method4147();
		} else if (arg0 != -1 && (arg0 != Static68.anInt1096 || !Static533.method386()) && local8 != 0 && !Static309.aBoolean451) {
			Static386.method5960(arg0, arg1, Static7.aClass384_3, local8);
			Static51.method805();
		}
		if (arg0 != Static68.anInt1096) {
			Static476.aClass5_Sub16_Sub1_4 = null;
		}
		Static68.anInt1096 = arg0;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(IIZ[I[Ljava/lang/Object;)V")
	public static void method6354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Object[] arg3) {
		if (arg1 >= arg0) {
			return;
		}
		@Pc(10) int local10 = (arg0 + arg1) / 2;
		@Pc(12) int local12 = arg1;
		@Pc(16) int local16 = arg2[local10];
		arg2[local10] = arg2[arg0];
		arg2[arg0] = local16;
		@Pc(30) Object local30 = arg3[local10];
		arg3[local10] = arg3[arg0];
		arg3[arg0] = local30;
		@Pc(49) int local49 = ~local16 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(51) int local51 = arg1; local51 < arg0; local51++) {
			if (arg2[local51] < (local51 & local49) + local16) {
				@Pc(70) int local70 = arg2[local51];
				arg2[local51] = arg2[local12];
				arg2[local12] = local70;
				@Pc(84) Object local84 = arg3[local51];
				arg3[local51] = arg3[local12];
				arg3[local12++] = local84;
			}
		}
		arg2[arg0] = arg2[local12];
		arg2[local12] = local16;
		arg3[arg0] = arg3[local12];
		arg3[local12] = local30;
		method6354(local12 - 1, arg1, arg2, arg3);
		method6354(arg0, local12 + 1, arg2, arg3);
	}
}
