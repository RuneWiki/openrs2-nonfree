import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!so", name = "c", descriptor = "I")
	public static int anInt5976;

	@OriginalMember(owner = "client!so", name = "f", descriptor = "Lclient!tb;")
	public static Class189 aClass189_8;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "Lclient!jg;")
	public static final Class107 aClass107_49 = new Class107(64);

	@OriginalMember(owner = "client!so", name = "d", descriptor = "[I")
	public static final int[] anIntArray460 = new int[50];

	@OriginalMember(owner = "client!so", name = "i", descriptor = "I")
	public static int anInt5980 = 0;

	@OriginalMember(owner = "client!so", name = "j", descriptor = "[I")
	public static final int[] anIntArray461 = new int[50];

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(BLclient!iq;)V")
	public static void method5054(@OriginalArg(1) Class104 arg0) {
		Static17.aClass104_12 = arg0;
		Static183.anInt4054 = Static17.aClass104_12.method2745(19);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!qn;III[Z)Z")
	public static boolean method5055(@OriginalArg(0) Class2_Sub9_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static9.aClass105Array1 != Static121.aClass105Array3) {
			@Pc(11) int local11 = Static101.aClass105Array2[arg1].method4452(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class105 local18 = Static101.aClass105Array2[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.method4452(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method4450(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.method4448(arg0, arg2, local27, arg3);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!pf;I)V")
	public static void method5057(@OriginalArg(0) Class157 arg0) {
		Static197.aClass2_Sub12_Sub2_2.method3171(arg0.method4402());
	}
}
