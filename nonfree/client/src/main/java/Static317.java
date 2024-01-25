import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!q", name = "b", descriptor = "[I")
	public static int[] anIntArray499;

	@OriginalMember(owner = "client!q", name = "d", descriptor = "Z")
	public static boolean aBoolean389 = false;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ZII)V")
	public static void method4488(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class1_Sub14 local10 = Static48.method871(arg0, arg1);
		if (local10 != null) {
			for (@Pc(20) int local20 = 0; local20 < local10.anIntArray146.length; local20++) {
				local10.anIntArray146[local20] = -1;
				local10.anIntArray145[local20] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(II)I")
	public static int method4489(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return local5 + arg0;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(III)Lclient!fq;")
	public static Class80 method4490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (client.lb[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = client.lb[0][arg1][arg2] != null && client.lb[0][arg1][arg2].aClass80_1 != null;
			if (local28 && arg0 >= Static68.anInt1553 - 1) {
				return null;
			}
			Static262.method3881(arg0, arg1, arg2);
		}
		return client.lb[arg0][arg1][arg2];
	}
}
