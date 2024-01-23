import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
	public static int anInt4579;

	@OriginalMember(owner = "client!lj", name = "g", descriptor = "[S")
	public static short[] aShortArray47;

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "Z")
	public static boolean aBoolean367 = true;

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
	public static int anInt4580 = 0;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IZI)Lclient!uc;")
	public static Class164 method3480(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class164 local15 = new Class164();
		for (@Pc(20) Class8_Sub1_Sub2 local20 = (Class8_Sub1_Sub2) Static89.aClass129_7.method3035(); local20 != null; local20 = (Class8_Sub1_Sub2) Static89.aClass129_7.method3048()) {
			if (local20.aBoolean43 && local20.method421(arg1, arg0)) {
				local15.method3993(local20);
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)[Lclient!wd;")
	public static Class8_Sub1_Sub7[] method3481() {
		@Pc(16) Class8_Sub1_Sub7[] local16 = new Class8_Sub1_Sub7[Static288.anInt1353];
		for (@Pc(18) int local18 = 0; local18 < Static288.anInt1353; local18++) {
			@Pc(29) int local29 = Static92.anIntArray130[local18] * Static135.anIntArray225[local18];
			@Pc(33) byte[] local33 = Static232.aByteArrayArray15[local18];
			if (Static247.aBooleanArray26[local18]) {
				@Pc(114) byte[] local114 = Static241.aByteArrayArray16[local18];
				@Pc(117) int[] local117 = new int[local29];
				for (@Pc(119) int local119 = 0; local119 < local29; local119++) {
					local117[local119] = (local114[local119] & 0xFF) << 24 | Static147.anIntArray236[local33[local119] & 0xFF];
				}
				if (Static116.aBoolean188) {
					local16[local18] = new Class8_Sub1_Sub7_Sub2_Sub1(Static97.anInt1999, Static290.anInt5656, Static25.anIntArray45[local18], Static225.anIntArray345[local18], Static92.anIntArray130[local18], Static135.anIntArray225[local18], local117);
				} else {
					local16[local18] = new Class8_Sub1_Sub7_Sub1_Sub1(Static97.anInt1999, Static290.anInt5656, Static25.anIntArray45[local18], Static225.anIntArray345[local18], Static92.anIntArray130[local18], Static135.anIntArray225[local18], local117);
				}
			} else {
				@Pc(40) int[] local40 = new int[local29];
				for (@Pc(42) int local42 = 0; local42 < local29; local42++) {
					local40[local42] = Static147.anIntArray236[local33[local42] & 0xFF];
				}
				if (Static116.aBoolean188) {
					local16[local18] = new Class8_Sub1_Sub7_Sub2(Static97.anInt1999, Static290.anInt5656, Static25.anIntArray45[local18], Static225.anIntArray345[local18], Static92.anIntArray130[local18], Static135.anIntArray225[local18], local40);
				} else {
					local16[local18] = new Class8_Sub1_Sub7_Sub1(Static97.anInt1999, Static290.anInt5656, Static25.anIntArray45[local18], Static225.anIntArray345[local18], Static92.anIntArray130[local18], Static135.anIntArray225[local18], local40);
				}
			}
		}
		Static147.method2386();
		return local16;
	}
}
