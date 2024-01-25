import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IBIII)V")
	public static void method282(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) Class5_Sub3_Sub17 local14 = Static358.method5408(18, (long) arg1 | (long) arg0 << 32);
		local14.method7286();
		local14.anInt8549 = arg2;
		local14.anInt8546 = arg3;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "([BI)[B")
	public static byte[] method286(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class5_Sub41 local8 = new Class5_Sub41(arg0);
		@Pc(12) int local12 = local8.method7816();
		@Pc(23) int local23 = local8.method7804();
		if (local23 < 0 || Static604.anInt9938 != 0 && Static604.anInt9938 < local23) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(45) byte[] local45 = new byte[local23];
			local8.method7802(local23, 0, local45);
			return local45;
		} else {
			@Pc(57) int local57 = local8.method7804();
			if (local57 < 0 || Static604.anInt9938 != 0 && local57 > Static604.anInt9938) {
				throw new RuntimeException();
			}
			@Pc(75) byte[] local75 = new byte[local57];
			if (local12 == 1) {
				Static473.method6785(local75, local57, arg0, local23);
			} else {
				@Pc(88) Class222 local88 = Static203.aClass222_1;
				synchronized (Static203.aClass222_1) {
					Static203.aClass222_1.method5413(local8, local75);
				}
			}
			return local75;
		}
	}
}
