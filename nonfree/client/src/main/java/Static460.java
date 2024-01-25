import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!su", name = "h", descriptor = "I")
	public static int anInt7893;

	@OriginalMember(owner = "client!su", name = "j", descriptor = "I")
	public static int anInt7895;

	@OriginalMember(owner = "client!su", name = "a", descriptor = "[I")
	public static final int[] anIntArray602 = new int[25];

	@OriginalMember(owner = "client!su", name = "b", descriptor = "D")
	public static double aDouble9 = -1.0D;

	@OriginalMember(owner = "client!su", name = "f", descriptor = "Lclient!uaa;")
	public static final Class288 aClass288_60 = new Class288(64);

	@OriginalMember(owner = "client!su", name = "g", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_78 = new Class236(10, 3);

	@OriginalMember(owner = "client!su", name = "i", descriptor = "I")
	public static int anInt7894 = 104;

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Lclient!qa;I)V")
	public static void method6392(@OriginalArg(0) Class62 arg0) {
		arg0.N(0, 0, Static383.anInt6994, 350);
		arg0.f(0, 0, Static383.anInt6994, 350, Static180.anInt3497 << 24 | 0x332277, 1);
		@Pc(27) int local27 = 350 / Static297.anInt7036;
		@Pc(39) int local39;
		if (Static532.anInt8981 > 0) {
			local39 = 346 - Static297.anInt7036 - 4;
			@Pc(49) int local49 = local39 * local27 / (Static532.anInt8981 + local27 - 1);
			@Pc(51) int local51 = 4;
			if (Static532.anInt8981 > 1) {
				local51 = (local39 - local49) * (Static532.anInt8981 + -1 + -Static488.anInt6246) / (Static532.anInt8981 - 1) + 4;
			}
			arg0.f(Static383.anInt6994 - 16, local51, 12, local49, Static180.anInt3497 << 24 | 0x332277, 2);
			for (@Pc(89) int local89 = Static488.anInt6246; local89 < Static488.anInt6246 + local27 && local89 < Static532.anInt8981; local89++) {
				@Pc(98) String[] local98 = Static514.method7107('\b', Static193.aStringArray19[local89]);
				@Pc(107) int local107 = (Static383.anInt6994 - 8 - 16) / local98.length;
				for (@Pc(109) int local109 = 0; local109 < local98.length; local109++) {
					@Pc(117) int local117 = local107 * local109 + 8;
					arg0.N(local117, 0, local107 + local117 - 8, 350);
					Static492.aClass13_3.method7211(-16777216, local117, 350 - (local89 - Static488.anInt6246) * Static297.anInt7036 - Static73.aClass256_3.anInt7540 - Static350.anInt4879 - 2, local98[local109], -1);
				}
			}
		}
		arg0.N(0, 0, Static383.anInt6994, 350);
		arg0.method7042(Static383.anInt6994, 350 - Static350.anInt4879, 0, -1);
		Static130.aClass13_2.method7211(-16777216, 10, 350 - Static312.aClass256_7.anInt7540 - 1, "--> " + Static256.aString52, -1);
		if (!Static538.aBoolean658) {
			return;
		}
		local39 = -1;
		if (Static481.anInt8318 % 30 > 15) {
			local39 = 16777215;
		}
		arg0.method7064(12, Static312.aClass256_7.method6113("--> " + Static256.aString52.substring(0, Static484.anInt8949)) + 10, 350 - (Static312.aClass256_7.anInt7540 + 11), local39);
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(JJ)J")
	public static long method6394(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}
}
