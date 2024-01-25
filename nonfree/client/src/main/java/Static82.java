import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!dca", name = "c", descriptor = "[J")
	public static final long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(III)Z")
	public static boolean method1352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(IIILclient!ua;ILclient!in;Lclient!f;I)V")
	public static void method1353(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class181 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class160 arg4, @OriginalArg(6) Class5 arg5, @OriginalArg(7) int arg6) {
		if (arg5 == null) {
			return;
		}
		@Pc(16) int local16;
		if (Static358.anInt9363 == 4) {
			local16 = (int) Static331.aFloat172 & 0x3FFF;
		} else {
			local16 = Static272.anInt5007 + (int) Static331.aFloat172 & 0x3FFF;
		}
		@Pc(37) int local37 = Math.max(arg4.anInt4182 / 2, arg4.anInt4156 / 2) + 10;
		@Pc(45) int local45 = arg1 * arg1 + arg6 * arg6;
		if (local45 > local37 * local37) {
			return;
		}
		@Pc(59) int local59 = Class85_Sub8.anIntArray426[local16];
		@Pc(63) int local63 = Class85_Sub8.anIntArray427[local16];
		if (Static358.anInt9363 != 4) {
			local63 = local63 * 256 / (Static267.anInt4887 + 256);
			local59 = local59 * 256 / (Static267.anInt4887 + 256);
		}
		@Pc(92) int local92 = local59 * arg1 + local63 * arg6 >> 14;
		@Pc(102) int local102 = arg1 * local63 - arg6 * local59 >> 14;
		arg5.method7799(arg3 + arg4.anInt4182 / 2 + local92 - arg5.A() / 2, arg0 + arg4.anInt4156 / 2 - (local102 + arg5.ca() / 2), arg2, arg3, arg0);
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(IIB)Z")
	public static boolean method1355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(25) boolean local25 = (arg0 & 0x37) == 0 ? Static391.method5620(arg0, arg1) : Static110.method1522(arg1, arg0);
		return local25 | (arg1 & 0x10000) != 0 | Static185.method3006(arg1, arg0);
	}
}
