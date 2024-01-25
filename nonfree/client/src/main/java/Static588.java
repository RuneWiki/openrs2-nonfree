import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static588 {

	@OriginalMember(owner = "client!un", name = "b", descriptor = "I")
	public static int anInt9782;

	@OriginalMember(owner = "client!un", name = "d", descriptor = "I")
	public static int anInt9783;

	@OriginalMember(owner = "client!un", name = "c", descriptor = "Z")
	public static boolean aBoolean707 = false;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(III)Z")
	public static boolean method8332(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x60000) != 0 | Static57.method1305(arg1, arg0) || Static617.method8585(arg1, arg0) || Static253.method4193(arg1, arg0);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIBLclient!rca;)J")
	public static long method8333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Interface25 arg2) {
		@Pc(10) long local10 = 4194304L;
		@Pc(12) long local12 = Long.MIN_VALUE;
		@Pc(19) Class5 local19 = Static79.aClass304_2.method6956(arg2.method6207());
		@Pc(40) long local40 = (long) ((arg2.method6212() | 0x10000) << 14 | arg0 << 7 | arg1 | arg2.method6210() << 20);
		if (local19.anInt81 == 0) {
			local40 |= local12;
		}
		if (local19.anInt61 == 1) {
			local40 |= local10;
		}
		return local40 | (long) arg2.method6207() << 32;
	}
}
