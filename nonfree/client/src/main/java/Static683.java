import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static683 {

	@OriginalMember(owner = "client!za", name = "m", descriptor = "Lclient!cka;")
	public static Class62 aClass62_8;

	@OriginalMember(owner = "client!za", name = "o", descriptor = "J")
	public static long aLong313 = 0L;

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IBI)Z")
	public static boolean method9225(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IBIII)V")
	public static void method9226(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) Class5_Sub1_Sub18 local14 = Static123.method1827((long) arg3 | (long) arg0 << 32, 18);
		local14.method7441();
		local14.anInt8635 = arg2;
		local14.anInt8632 = arg1;
	}
}
