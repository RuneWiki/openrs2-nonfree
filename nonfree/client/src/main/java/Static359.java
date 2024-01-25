import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!mc", name = "J", descriptor = "Lclient!qj;")
	public static final Class295 aClass295_37 = new Class295(8);

	@OriginalMember(owner = "client!mc", name = "Z", descriptor = "Z")
	public static boolean aBoolean426 = false;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(III[B)I")
	public static int method5201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = arg0; local9 < arg1; local9++) {
			local7 = Class170.anIntArray271[(arg2[local9] ^ local7) & 0xFF] ^ local7 >>> 8;
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)V")
	public static void method5202() {
		if (Static221.anInt3831 == 9) {
			Static279.method4069(5);
		} else if (Static221.anInt3831 == 5 || Static221.anInt3831 == 6) {
			Static279.method4069(3);
		} else if (Static221.anInt3831 == 12) {
			Static279.method4069(3);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)Z")
	public static boolean method5204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | Static516.method6724(arg1, arg0) || Static669.method8386(arg1, arg0);
	}
}
