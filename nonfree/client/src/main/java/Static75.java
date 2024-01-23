import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
	public static int anInt1212 = 0;

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "Lclient!me;")
	public static Class71 aClass71_11 = null;

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "Lclient!ia;")
	public static Class51 aClass51_371 = Static64.method1101("Art");

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IJIB)Z")
	public static boolean method884(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		@Pc(17) int local17 = (int) arg1 >> 14 & 0x1F;
		@Pc(24) int local24 = (int) arg1 >> 20 & 0x3;
		@Pc(31) int local31 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
		if (local17 == 10 || local17 == 11 || local17 == 22) {
			@Pc(46) Class82 local46 = Static9.method132(local31);
			@Pc(57) int local57;
			@Pc(60) int local60;
			if (local24 == 0 || local24 == 2) {
				local57 = local46.anInt3258;
				local60 = local46.anInt3279;
			} else {
				local60 = local46.anInt3258;
				local57 = local46.anInt3279;
			}
			@Pc(71) int local71 = local46.anInt3280;
			if (local24 != 0) {
				local71 = (local71 << local24 & 0xF) + (local71 >> 4 - local24);
			}
			Static124.method3511(Static73.aClass5_Sub1_Sub1_1.anIntArray233[0], arg0, 0, local57, local71, arg2, Static73.aClass5_Sub1_Sub1_1.anIntArray238[0], 0, true, 2, local60);
		} else {
			Static124.method3511(Static73.aClass5_Sub1_Sub1_1.anIntArray233[0], arg0, local17 + 1, 0, 0, arg2, Static73.aClass5_Sub1_Sub1_1.anIntArray238[0], local24, true, 2, 0);
		}
		Static12.anInt320 = 0;
		Static68.anInt1547 = 2;
		Static83.anInt1948 = Static106.anInt2346;
		Static160.anInt3453 = Static148.anInt3214;
		return true;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BII)I")
	public static int method887(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
