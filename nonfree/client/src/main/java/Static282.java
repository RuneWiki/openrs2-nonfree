import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!jk", name = "w", descriptor = "F")
	public static float aFloat65;

	@OriginalMember(owner = "client!jk", name = "o", descriptor = "[[B")
	public static final byte[][] aByteArrayArray11 = new byte[50][];

	@OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
	public static int anInt4887 = 104;

	@OriginalMember(owner = "client!jk", name = "m", descriptor = "[I")
	public static final int[] anIntArray273 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IZI)V")
	public static void method4148(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(10) Class5_Sub48 local10 = Static507.method7441(arg0, arg1);
		if (local10 != null) {
			for (@Pc(23) int local23 = 0; local23 < local10.anIntArray523.length; local23++) {
				local10.anIntArray523[local23] = -1;
				local10.anIntArray524[local23] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(III)Z")
	public static boolean method4150(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static90.method1352(arg0, arg1) | (arg0 & 0x800) != 0 || Static395.method5775(arg0, arg1);
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIII)V")
	public static void method4151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class5_Sub5_Sub6 local9 = Static478.method6972((long) arg0, 8);
		local9.method2687();
		local9.anInt3059 = arg2;
		local9.anInt3058 = arg1;
		local9.anInt3064 = arg3;
	}
}
