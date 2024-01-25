import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static622 {

	@OriginalMember(owner = "client!uu", name = "e", descriptor = "I")
	public static int anInt10291;

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_151 = new Class171(115, 0);

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "I")
	public static int anInt10289 = -1;

	@OriginalMember(owner = "client!uu", name = "f", descriptor = "I")
	public static int anInt10292 = 0;

	@OriginalMember(owner = "client!uu", name = "g", descriptor = "I")
	public static int anInt10293 = -1;

	@OriginalMember(owner = "client!uu", name = "h", descriptor = "Lclient!jea;")
	public static final Class177 aClass177_31 = new Class177(12, 19);

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)V")
	public static void method8399() {
		if (Static26.aClass382ArrayArray1 == null) {
			return;
		}
		for (@Pc(9) int local9 = 0; local9 < Static26.aClass382ArrayArray1.length; local9++) {
			for (@Pc(13) int local13 = 0; local13 < Static26.aClass382ArrayArray1[local9].length; local13++) {
				Static26.aClass382ArrayArray1[local9][local13] = Static89.aClass382_1;
			}
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ZBI)V")
	public static void method8400(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class3_Sub21 local10 = Static586.method7782(arg1, arg0);
		if (local10 != null) {
			for (@Pc(20) int local20 = 0; local20 < local10.anIntArray174.length; local20++) {
				local10.anIntArray174[local20] = -1;
				local10.anIntArray175[local20] = 0;
			}
		}
	}
}
