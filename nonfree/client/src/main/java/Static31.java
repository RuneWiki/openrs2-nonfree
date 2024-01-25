import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!baa", name = "O", descriptor = "I")
	public static int anInt646;

	@OriginalMember(owner = "client!baa", name = "U", descriptor = "F")
	public static float aFloat7;

	@OriginalMember(owner = "client!baa", name = "N", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_23 = new Class200(55, 4);

	@OriginalMember(owner = "client!baa", name = "W", descriptor = "Z")
	public static boolean aBoolean67 = false;

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(II)Z")
	public static boolean method728(@OriginalArg(1) int arg0) {
		if (Static139.aBooleanArray5[arg0]) {
			return true;
		} else if (Static477.aClass238_220.method5565(arg0)) {
			@Pc(21) int local21 = Static477.aClass238_220.method5592(arg0);
			if (local21 == 0) {
				Static139.aBooleanArray5[arg0] = true;
				return true;
			}
			if (Static261.aClass303ArrayArray1[arg0] == null) {
				Static261.aClass303ArrayArray1[arg0] = new Class303[local21];
			}
			for (@Pc(50) int local50 = 0; local50 < local21; local50++) {
				if (Static261.aClass303ArrayArray1[arg0][local50] == null) {
					@Pc(63) byte[] local63 = Static477.aClass238_220.method5567(local50, arg0);
					if (local63 != null) {
						@Pc(75) Class303 local75 = Static261.aClass303ArrayArray1[arg0][local50] = new Class303();
						local75.anInt7962 = (arg0 << 16) + local50;
						if (local63[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local75.method6949(new Class2_Sub17(local63));
					}
				}
			}
			Static139.aBooleanArray5[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(JJ)J")
	public static long method729(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}
}
