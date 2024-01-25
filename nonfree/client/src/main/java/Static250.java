import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
	public static int anInt4448;

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "Lclient!la;")
	public static Class137 aClass137_6;

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "[I")
	public static final int[] anIntArray330 = new int[5];

	@OriginalMember(owner = "client!mb", name = "s", descriptor = "J")
	public static long aLong155 = -1L;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IJIB)V")
	public static void method3542(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		@Pc(14) int local14 = (int) arg1 >> 14 & 0x1F;
		@Pc(21) int local21 = (int) arg1 >> 20 & 0x3;
		@Pc(28) int local28 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
		if (local14 != 10 && local14 != 11 && local14 != 22) {
			Static224.method3210(local14, 0, true, 0, local21, arg0, 0, arg2);
			return;
		}
		@Pc(44) Class87 local44 = Static86.aClass248_7.method5246(local28);
		@Pc(54) int local54;
		@Pc(57) int local57;
		if (local21 == 0 || local21 == 2) {
			local54 = local44.anInt1916;
			local57 = local44.anInt1959;
		} else {
			local54 = local44.anInt1959;
			local57 = local44.anInt1916;
		}
		@Pc(68) int local68 = local44.anInt1932;
		if (local21 != 0) {
			local68 = (local68 << local21 & 0xF) + (local68 >> 4 - local21);
		}
		Static224.method3210(0, local54, true, local68, 0, arg0, local57, arg2);
	}
}
