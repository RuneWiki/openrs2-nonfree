import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!jq", name = "d", descriptor = "Z")
	public static boolean aBoolean259;

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "Lclient!cv;")
	public static final Class59 aClass59_1 = new Class59();

	@OriginalMember(owner = "client!jq", name = "s", descriptor = "[I")
	public static final int[] anIntArray426 = new int[2];

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILclient!rq;)I")
	public static int method3496(@OriginalArg(1) Class29_Sub2_Sub1 arg0) {
		if (arg0.anInt8549 == 0) {
			return 0;
		}
		@Pc(63) int local63;
		@Pc(56) int local56;
		if (arg0.anInt8513 != -1) {
			@Pc(18) Class29_Sub2_Sub1 local18 = null;
			if (arg0.anInt8513 < 32768) {
				@Pc(30) Class6_Sub28 local30 = (Class6_Sub28) Static31.aClass212_1.method5106((long) arg0.anInt8513);
				if (local30 != null) {
					local18 = local30.aClass29_Sub2_Sub1_Sub1_2;
				}
			} else if (arg0.anInt8513 >= 32768) {
				local18 = Static346.aClass29_Sub2_Sub1_Sub2Array1[arg0.anInt8513 - 32768];
			}
			if (local18 != null) {
				local56 = arg0.anInt9222 - local18.anInt9222;
				local63 = arg0.anInt9218 - local18.anInt9218;
				if (local56 != 0 || local63 != 0) {
					arg0.method6998((int) (Math.atan2((double) local56, (double) local63) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class29_Sub2_Sub1_Sub2) {
			@Pc(86) Class29_Sub2_Sub1_Sub2 local86 = (Class29_Sub2_Sub1_Sub2) arg0;
			if (local86.anInt8601 != -1 && (local86.anInt8582 == 0 || local86.anInt8584 > 0)) {
				local86.method6998(local86.anInt8601);
				local86.anInt8601 = -1;
			}
		} else if (arg0 instanceof Class29_Sub2_Sub1_Sub1) {
			@Pc(115) Class29_Sub2_Sub1_Sub1 local115 = (Class29_Sub2_Sub1_Sub1) arg0;
			if (local115.anInt1820 != -1 && (local115.anInt8582 == 0 || local115.anInt8584 > 0)) {
				local56 = local115.anInt9222 - (local115.anInt1820 - Static218.anInt3718 - Static218.anInt3718) * 256;
				local63 = local115.anInt9218 - (local115.anInt1815 - Static167.anInt3048 - Static167.anInt3048) * 256;
				if (local56 != 0 || local63 != 0) {
					local115.method6998((int) (Math.atan2((double) local56, (double) local63) * 2607.5945876176133D) & 0x3FFF);
				}
				local115.anInt1820 = -1;
			}
		}
		return arg0.method6997();
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V")
	public static void method3497() {
		@Pc(5) Class332 local5 = Static23.aClass332_14;
		synchronized (Static23.aClass332_14) {
			Static23.aClass332_14.method7512();
		}
		local5 = Static234.aClass332_102;
		synchronized (Static234.aClass332_102) {
			Static234.aClass332_102.method7512();
		}
	}
}
