import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!um", name = "a", descriptor = "I")
	public static int anInt5495;

	@OriginalMember(owner = "client!um", name = "c", descriptor = "I")
	public static int anInt5497;

	@OriginalMember(owner = "client!um", name = "d", descriptor = "Lclient!ph;")
	public static Class138 aClass138_80;

	@OriginalMember(owner = "client!um", name = "e", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!um", name = "f", descriptor = "I")
	public static int anInt5498 = 0;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(III)V")
	public static void method4289(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static264.anIntArray457[arg1] = arg0;
		@Pc(14) Class1_Sub21 local14 = (Class1_Sub21) Static276.aClass156_15.method3821((long) arg1);
		if (local14 == null) {
			local14 = new Class1_Sub21(4611686018427387905L);
			Static276.aClass156_15.method3816((long) arg1, local14);
		} else if (local14.aLong158 != 4611686018427387905L) {
			local14.aLong158 = Static135.method2186() + 500L | 0x4000000000000000L;
		}
	}
}
