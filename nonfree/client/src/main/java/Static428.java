import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!oc", name = "q", descriptor = "Lclient!hs;")
	public static final Class162 aClass162_8 = new Class162("", 14);

	@OriginalMember(owner = "client!oc", name = "n", descriptor = "Z")
	public static boolean aBoolean510 = false;

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "(I)[Lclient!nv;")
	public static Class258[] method6432() {
		return new Class258[] { Static3.aClass258_1, Static7.aClass258_2, Static419.aClass258_14 };
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!sfa;III)V")
	public static void method6434(@OriginalArg(0) Class14_Sub2_Sub17 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!Static455.aBoolean533) {
			return;
		}
		@Pc(11) int local11 = 0;
		@Pc(25) int local25;
		for (@Pc(17) Class14_Sub2_Sub20 local17 = (Class14_Sub2_Sub20) arg0.aClass269_142.method6494(); local17 != null; local17 = (Class14_Sub2_Sub20) arg0.aClass269_142.method6491()) {
			local25 = Static323.method5076(local17);
			if (local25 > local11) {
				local11 = local25;
			}
		}
		local11 += 8;
		Static345.anInt5864 = (Static575.aBoolean661 ? 26 : 22) + arg0.anInt9298 * 16;
		local25 = arg0.anInt9298 * 16 + 21;
		@Pc(71) int local71 = Static189.anInt3199 + Static501.anInt8738;
		if (local11 + local71 > Static563.anInt4939) {
			local71 = Static189.anInt3199 - local11;
		}
		if (local71 < 0) {
			local71 = 0;
		}
		@Pc(103) int local103 = Static575.aBoolean661 ? 33 : 31;
		@Pc(110) int local110 = arg2 + 13 - local103;
		if (local25 + local110 > Static506.anInt8791) {
			local110 = Static506.anInt8791 - local25;
		}
		if (local110 < 0) {
			local110 = 0;
		}
		Static406.anInt7035 = local71;
		Static52.aClass14_Sub2_Sub17_1 = arg0;
		Static91.anInt1595 = local11;
		Static381.anInt6705 = local110;
	}

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)V")
	public static void method6435() {
		@Pc(8) Class14_Sub2_Sub9 local8 = Static499.method7527(0L, 15);
		local8.method4001();
	}
}
