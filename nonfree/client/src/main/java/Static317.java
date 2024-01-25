import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!uc", name = "T", descriptor = "[I")
	public static int[] anIntArray479;

	@OriginalMember(owner = "client!uc", name = "U", descriptor = "Lclient!tj;")
	public static Class193 aClass193_100;

	@OriginalMember(owner = "client!uc", name = "K", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_335 = new Class159("flash1:", "blinken1:", "clignotant1:", "flash1:");

	@OriginalMember(owner = "client!uc", name = "P", descriptor = "I")
	public static int anInt6159 = 0;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZ)V")
	public static void method5235(@OriginalArg(1) boolean arg0) {
		@Pc(9) byte[][] local9;
		if (arg0) {
			local9 = Static224.aByteArrayArray18;
		} else {
			local9 = Static115.aByteArrayArray13;
		}
		@Pc(16) int local16 = Static65.aByteArrayArray4.length;
		for (@Pc(23) int local23 = 0; local23 < local16; local23++) {
			@Pc(29) byte[] local29 = local9[local23];
			if (local29 != null) {
				@Pc(42) int local42 = (Static155.anIntArray297[local23] >> 8) * 64 - Static286.anInt6699;
				@Pc(53) int local53 = (Static155.anIntArray297[local23] & 0xFF) * 64 - Static136.anInt3193;
				Static319.method5250();
				Static284.method4836(local29, Static16.aClass170Array1, arg0, local42, Static274.aClass47_9, local53);
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIII)V")
	public static void method5237(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 - arg2 >= Static5.anInt2965 && arg2 + arg3 <= Static220.anInt6565 && Static349.anInt6619 <= arg0 - arg2 && Static195.anInt4097 >= arg2 + arg0) {
			Static251.method4444(arg0, arg3, arg2, arg1);
		} else {
			Static308.method5090(arg0, arg3, arg2, arg1);
		}
	}
}
