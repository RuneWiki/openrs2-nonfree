import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!vu", name = "I", descriptor = "I")
	public static int anInt7687;

	@OriginalMember(owner = "client!vu", name = "F", descriptor = "S")
	public static short aShort105 = 256;

	@OriginalMember(owner = "client!vu", name = "O", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_229 = new Class214(105, 5);

	@OriginalMember(owner = "client!vu", name = "P", descriptor = "[I")
	public static final int[] anIntArray616 = new int[13];

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(ZLclient!qt;)V")
	public static void method6134(@OriginalArg(1) Class212 arg0) {
		Static457.aClass4_Sub20_Sub1_5.method3238(arg0.method4984());
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIIIIII)V")
	public static void method6135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg2 - arg1;
		@Pc(14) int local14 = arg1 + arg3;
		for (@Pc(16) int local16 = arg3; local16 < local14; local16++) {
			Static236.method3990(arg0, arg4, Static400.anIntArrayArray54[local16], arg5);
		}
		@Pc(36) int local36 = arg1 + arg4;
		for (@Pc(38) int local38 = arg2; local38 > local10; local38--) {
			Static236.method3990(arg0, arg4, Static400.anIntArrayArray54[local38], arg5);
		}
		@Pc(61) int local61 = arg0 - arg1;
		for (@Pc(68) int local68 = local14; local68 <= local10; local68++) {
			@Pc(74) int[] local74 = Static400.anIntArrayArray54[local68];
			Static236.method3990(local36, arg4, local74, arg5);
			Static236.method3990(arg0, local61, local74, arg5);
		}
	}
}
