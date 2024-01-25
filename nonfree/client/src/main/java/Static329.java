import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!np", name = "b", descriptor = "I")
	public static int anInt3845;

	@OriginalMember(owner = "client!np", name = "f", descriptor = "I")
	public static int anInt3848;

	@OriginalMember(owner = "client!np", name = "a", descriptor = "Lclient!rb;")
	public static final Class245 aClass245_12 = new Class245(15, 0, 1, 0);

	@OriginalMember(owner = "client!np", name = "e", descriptor = "Z")
	public static boolean aBoolean305 = false;

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!ua;I)I")
	public static int method3403(@OriginalArg(0) Class2_Sub44 arg0) {
		@Pc(7) String local7 = Static288.method5991(arg0);
		@Pc(14) int[] local14 = null;
		if (Static450.method6872(arg0.anInt8460)) {
			local14 = Static464.aClass115_1.method2970((int) arg0.aLong215).anIntArray682;
		} else if (arg0.anInt8465 != -1) {
			local14 = Static464.aClass115_1.method2970(arg0.anInt8465).anIntArray682;
		} else if (Static224.method3540(arg0.anInt8460)) {
			@Pc(46) Class2_Sub11 local46 = (Class2_Sub11) Static71.aClass127_13.method3205((long) arg0.aLong215);
			if (local46 != null) {
				@Pc(51) Class1_Sub1_Sub2_Sub2 local51 = local46.aClass1_Sub1_Sub2_Sub2_1;
				@Pc(54) Class12 local54 = local51.aClass12_1;
				if (local54.anIntArray21 != null) {
					local54 = local54.method455(Static84.aClass302_1);
				}
				if (local54 != null) {
					local14 = local54.anIntArray22;
				}
			}
		} else if (Static326.method5156(arg0.anInt8460)) {
			@Pc(92) Class129 local92;
			if (arg0.anInt8460 == 1006) {
				local92 = Static505.aClass206_4.method5326((int) arg0.aLong215);
			} else {
				local92 = Static505.aClass206_4.method5326((int) (arg0.aLong215 >>> 32 & 0x7FFFFFFFL));
			}
			if (local92.anIntArray392 != null) {
				local92 = local92.method3276(Static84.aClass302_1);
			}
			if (local92 != null) {
				local14 = local92.anIntArray396;
			}
		}
		if (local14 != null) {
			local7 = local7 + Static98.method1916(local14);
		}
		@Pc(142) int local142 = Static188.aClass52_2.method1580(local7, Static376.aClass35Array31);
		if (arg0.aBoolean610) {
			local142 += Static98.aClass35_13.c() + 4;
		}
		return local142;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IB)V")
	public static void method3406(@OriginalArg(0) int arg0) {
		Static268.anInt4930 = arg0;
		@Pc(7) Class231 local7 = Static291.aClass231_45;
		synchronized (Static291.aClass231_45) {
			Static291.aClass231_45.method6240();
		}
	}
}
