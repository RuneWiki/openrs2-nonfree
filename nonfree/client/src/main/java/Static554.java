import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static554 {

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "I")
	public static int anInt9352 = 0;

	@OriginalMember(owner = "client!tv", name = "o", descriptor = "I")
	public static int anInt9362 = 0;

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIIIILclient!ha;IIIBILclient!ei;)V")
	public static void method8071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class133 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class5_Sub5_Sub4 arg10) {
		if (arg7 < arg1 && arg1 < arg3 + arg7 && arg2 - 13 < arg6 && arg6 < arg2 + 3) {
			arg9 = arg0;
		}
		@Pc(36) String local36 = Static162.method2340(arg10);
		Static16.aClass55_1.method6012(arg9, local36, Static236.aClass28Array10, Static528.anIntArray500, arg2, arg7 + 3);
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)I")
	public static int method8075(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = 0; local3 < Static645.anInt10657 - 1; local3++) {
			if (arg0 < Static442.anIntArray407[local3] + Static570.anIntArray529[local3]) {
				local1 = local3;
				break;
			}
		}
		if (local1 == -1) {
			local1 = Static645.anInt10657 - 1;
		}
		return local1;
	}
}
