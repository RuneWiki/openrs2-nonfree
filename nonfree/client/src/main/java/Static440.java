import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!qq", name = "q", descriptor = "Lclient!jda;")
	public static final Class162 aClass162_8 = new Class162("", 14);

	@OriginalMember(owner = "client!qq", name = "t", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_79 = new Class344(43, 8);

	@OriginalMember(owner = "client!qq", name = "u", descriptor = "[I")
	public static final int[] anIntArray489 = new int[1];

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "(B)Lclient!fu;")
	public static Class4_Sub20 method6501() {
		if (Static572.aClass22_64 == null || Static168.aClass92_1 == null) {
			return null;
		}
		Static168.aClass92_1.method2166(Static572.aClass22_64);
		@Pc(27) Class4_Sub20 local27 = (Class4_Sub20) Static168.aClass92_1.method2165();
		if (local27 == null) {
			return null;
		} else {
			@Pc(37) Class288 local37 = Static572.aClass121_4.method2676(local27.anInt3266);
			return local37 != null && local37.aBoolean607 && local37.method6627(Static572.anInterface17_2) ? local27 : Static135.method2443();
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!ha;III[Z)V")
	public static void method6502(@OriginalArg(0) Class4_Sub6_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static255.aClass115Array2 == Static140.aClass115Array1) {
			return;
		}
		@Pc(10) int local10 = Static432.aClass115Array3[arg1].method8064(arg2, arg3);
		for (@Pc(12) int local12 = 0; local12 <= arg1; local12++) {
			if (arg4 == null || arg4[local12]) {
				@Pc(23) Class115 local23 = Static432.aClass115Array3[local12];
				if (local23 != null) {
					local23.DA(arg0, arg2, local10 - local23.method8064(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}
}
