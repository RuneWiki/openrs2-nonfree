import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
	public static int anInt4114;

	@OriginalMember(owner = "client!ij", name = "k", descriptor = "[Z")
	public static boolean[] aBooleanArray14;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "Lclient!fw;")
	public static final Class114 aClass114_4 = new Class114();

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(BI)I")
	public static int method3523(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(23) int local23 = (local9 >>> 2 & 0x33333333) + (local9 & 0x33333333);
		@Pc(39) int local39 = (local23 >>> 4) + local23 & 0xF0F0F0F;
		@Pc(45) int local45 = local39 + (local39 >>> 8);
		@Pc(51) int local51 = local45 + (local45 >>> 16);
		return local51 & 0xFF;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method3524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class133 local7 = Static113.aClass133ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class315 local13 = local7.aClass315_1; local13 != null; local13 = local13.aClass315_3) {
			@Pc(17) Class15_Sub2 local17 = local13.aClass15_Sub2_2;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort116 == arg1 && local17.aShort114 == arg2) {
				Static438.method6209(local17);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZII)Z")
	public static boolean method3525(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)V")
	public static void method3527() {
		Static342.aClass330_35.method7680(5);
	}
}
