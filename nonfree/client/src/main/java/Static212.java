import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!hp", name = "i", descriptor = "Lclient!hu;")
	public static Class21 aClass21_8;

	@OriginalMember(owner = "client!hp", name = "h", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_52 = new Class71(40, -1);

	@OriginalMember(owner = "client!hp", name = "k", descriptor = "I")
	public static volatile int anInt4965 = -1;

	@OriginalMember(owner = "client!hp", name = "l", descriptor = "[I")
	public static final int[] anIntArray265 = new int[1];

	@OriginalMember(owner = "client!hp", name = "m", descriptor = "Z")
	public static boolean aBoolean371 = false;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Z)V")
	public static void method4040() {
		@Pc(16) int local16 = Static315.anInt9128;
		@Pc(18) int[] local18 = Static533.anIntArray506;
		for (@Pc(20) int local20 = 0; local20 < local16; local20++) {
			@Pc(28) Class15_Sub1_Sub2_Sub2_Sub1 local28 = Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local18[local20]];
			if (local28 != null && local28.anInt8053 > 0) {
				local28.anInt8053--;
				if (local28.anInt8053 == 0) {
					local28.aString85 = null;
				}
			}
		}
		for (@Pc(54) int local54 = 0; local54 < Static59.anInt1906; local54++) {
			@Pc(61) long local61 = (long) Static620.anIntArray609[local54];
			@Pc(67) Class8_Sub50 local67 = (Class8_Sub50) Static278.aClass253_20.method6594(local61);
			if (local67 != null) {
				@Pc(72) Class15_Sub1_Sub2_Sub2_Sub2 local72 = local67.aClass15_Sub1_Sub2_Sub2_Sub2_2;
				if (local72.anInt8053 > 0) {
					local72.anInt8053--;
					if (local72.anInt8053 == 0) {
						local72.aString85 = null;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(II[BI)[B")
	public static byte[] method4042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(15) byte[] local15;
		if (arg0 > 0) {
			local15 = new byte[arg1];
			for (@Pc(17) int local17 = 0; local17 < arg1; local17++) {
				local15[local17] = arg2[arg0 + local17];
			}
		} else {
			local15 = arg2;
		}
		@Pc(39) Class343 local39 = new Class343();
		local39.method7983();
		local39.method7981((long) (arg1 * 8), local15);
		@Pc(53) byte[] local53 = new byte[64];
		local39.method7982(local53);
		return local53;
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)V")
	public static void method4047() {
		for (@Pc(3) int local3 = 0; local3 < Static121.anInt3161; local3++) {
			@Pc(16) int local16 = Static196.method3669(Static121.anInt3161, Static104.anInt2768 + local3) * Static362.anInt6930;
			for (@Pc(18) int local18 = 0; local18 < Static362.anInt6930; local18++) {
				@Pc(29) int local29 = Static196.method3669(Static362.anInt6930, local18 + Static384.anInt7468) + local16;
				if (Static480.anInt8593 == Static86.anIntArray105[local29]) {
					Static596.anInterface11Array1[local29].method8360(0, 0, Static266.anInt5676, Static332.anInt6574, Static266.anInt5676 * local18, Static332.anInt6574 * local3);
				}
			}
		}
	}
}
