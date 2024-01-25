import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static479 {

	@OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
	public static int anInt9649;

	@OriginalMember(owner = "client!ta", name = "k", descriptor = "Lclient!nc;")
	public static final Class208 aClass208_16 = new Class208();

	@OriginalMember(owner = "client!ta", name = "o", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_125 = new Class160(6, 0);

	@OriginalMember(owner = "client!ta", name = "t", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_126 = new Class160(79, 8);

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!u;I)I")
	public static int method7871(@OriginalArg(0) Class6_Sub48 arg0) {
		@Pc(9) String local9 = Static568.method7783(arg0);
		@Pc(11) int[] local11 = null;
		if (Static557.method7618(arg0.anInt8333)) {
			local11 = Static295.aClass256_2.method5924((int) arg0.aLong215).anIntArray315;
		} else if (arg0.anInt8334 != -1) {
			local11 = Static295.aClass256_2.method5924(arg0.anInt8334).anIntArray315;
		} else if (Static197.method2979(arg0.anInt8333)) {
			@Pc(42) Class6_Sub28 local42 = (Class6_Sub28) Static31.aClass212_1.method5106((long) arg0.aLong215);
			if (local42 != null) {
				@Pc(47) Class29_Sub2_Sub1_Sub1 local47 = local42.aClass29_Sub2_Sub1_Sub1_2;
				@Pc(50) Class257 local50 = local47.aClass257_1;
				if (local50.anIntArray571 != null) {
					local50 = local50.method5935(Static505.aClass30_1);
				}
				if (local50 != null) {
					local11 = local50.anIntArray572;
				}
			}
		} else if (Static90.method1435(arg0.anInt8333)) {
			@Pc(82) Class313 local82;
			if (arg0.anInt8333 == 1006) {
				local82 = Static260.aClass100_1.method2008((int) arg0.aLong215);
			} else {
				local82 = Static260.aClass100_1.method2008((int) (arg0.aLong215 >>> 32 & 0x7FFFFFFFL));
			}
			if (local82.anIntArray650 != null) {
				local82 = local82.method6967(Static505.aClass30_1);
			}
			if (local82 != null) {
				local11 = local82.anIntArray654;
			}
		}
		if (local11 != null) {
			local9 = local9 + Static334.method5111(local11);
		}
		@Pc(137) int local137 = Static338.aClass146_7.method3174(Static156.aClass4Array5, local9);
		if (arg0.aBoolean572) {
			local137 += Static261.aClass4_14.QA() + 4;
		}
		return local137;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!dga;I)Lclient!qu;")
	public static Class10_Sub2 method7873(@OriginalArg(0) Class6_Sub14 arg0) {
		@Pc(12) Class10 local12 = Static490.method6769(arg0);
		@Pc(16) int local16 = arg0.method6027();
		@Pc(20) int local20 = arg0.method6027();
		@Pc(24) int local24 = arg0.method6006();
		return new Class10_Sub2(local12.aClass277_10, local12.aClass137_13, local12.anInt7622, local12.anInt7626, local12.anInt7621, local12.anInt7623, local12.anInt7624, local16, local20, local24);
	}
}
