import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!jf", name = "Z", descriptor = "I")
	public static int anInt2534 = 0;

	@OriginalMember(owner = "client!jf", name = "bb", descriptor = "I")
	public static int anInt2536 = 0;

	@OriginalMember(owner = "client!jf", name = "eb", descriptor = "I")
	public static int anInt2539 = 0;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BIII)I")
	public static int method2182(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 / arg1;
		@Pc(18) int local18 = arg1 - 1 & arg2;
		@Pc(24) int local24 = arg1 - 1 & arg0;
		@Pc(28) int local28 = arg0 / arg1;
		@Pc(33) int local33 = Static198.method3359(local7, local28);
		@Pc(40) int local40 = Static198.method3359(local7 + 1, local28);
		@Pc(47) int local47 = Static198.method3359(local7, local28 + 1);
		@Pc(56) int local56 = Static198.method3359(local7 + 1, local28 + 1);
		@Pc(63) int local63 = Static127.method2258(local40, arg1, local33, local18);
		@Pc(70) int local70 = Static127.method2258(local56, arg1, local47, local18);
		return Static127.method2258(local70, arg1, local63, local24);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZB)V")
	public static void method2183(@OriginalArg(0) boolean arg0) {
		@Pc(11) byte[][] local11;
		if (Static60.aBoolean106 && arg0) {
			local11 = Static43.aByteArrayArray23;
		} else {
			local11 = Static75.aByteArrayArray34;
		}
		@Pc(23) int local23 = Static275.aByteArrayArray117.length;
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(32) byte[] local32 = local11[local25];
			if (local32 != null) {
				@Pc(47) int local47 = (Static63.anIntArray105[local25] >> 8) * 64 - Static125.anInt5772;
				@Pc(57) int local57 = (Static63.anIntArray105[local25] & 0xFF) * 64 - Static203.anInt4236;
				Static203.method3422();
				Static260.method4339(arg0, local47, local57, Static98.aClass52Array1, local32);
			}
		}
	}
}
