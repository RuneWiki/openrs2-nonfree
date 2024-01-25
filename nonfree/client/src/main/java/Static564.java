import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static564 {

	@OriginalMember(owner = "client!ta", name = "v", descriptor = "I")
	public static int anInt8658;

	@OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
	public static int anInt8656 = -1;

	@OriginalMember(owner = "client!ta", name = "u", descriptor = "[I")
	public static final int[] anIntArray615 = new int[6];

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)Lclient!wj;")
	public static Class389 method7466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class389 local7 = new Class389();
		local7.anInt10440 = arg0 + 5 + 1;
		local7.anInt10446 = -1;
		local7.anInt10431 = -1;
		local7.anInt10439 = arg1 + 6;
		local7.anIntArrayArray64 = new int[local7.anInt10440][local7.anInt10439];
		local7.method8817();
		return local7;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIZ)Z")
	public static boolean method7467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}
}
