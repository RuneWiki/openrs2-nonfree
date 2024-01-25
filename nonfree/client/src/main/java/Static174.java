import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!ij", name = "G", descriptor = "I")
	public static int anInt3826 = 0;

	@OriginalMember(owner = "client!ij", name = "J", descriptor = "Z")
	public static boolean aBoolean238 = true;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)I")
	public static int method2953(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = 0;
		while (arg1 > 0) {
			local5 = local5 << 1 | arg0 & 0x1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local5;
	}
}
