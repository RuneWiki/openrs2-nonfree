import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!ij", name = "h", descriptor = "Lclient!hg;")
	public static Class102 aClass102_5;

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "Lclient!us;")
	public static final Class234 aClass234_87 = new Class234(83, -1);

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray42 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!ij", name = "g", descriptor = "J")
	public static long aLong165 = -1L;

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)V")
	public static void method3924() {
		for (@Pc(6) Class12_Sub3 local6 = (Class12_Sub3) Static26.aClass22_3.method285(); local6 != null; local6 = (Class12_Sub3) Static26.aClass22_3.method285()) {
			Static365.method5441(local6);
		}
		@Pc(39) int local39;
		@Pc(37) int local37;
		if (Static164.aClass154_Sub1_1.method5400(Static2.anInt68)) {
			local37 = 3;
			local39 = 0;
		} else {
			local37 = Static24.anInt332;
			local39 = Static24.anInt332;
		}
		Static48.method911();
		for (@Pc(48) int local48 = local39; local48 <= local37; local48++) {
			Static48.method910();
			Static48.method924(local48);
			Static48.method909(local48);
		}
		Static48.method920();
		Static48.method906();
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZII)I")
	public static int method3926(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static313.anIntArray630[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)V")
	public static void method3927() {
		Static16.aClass139_1.method3075();
	}
}
