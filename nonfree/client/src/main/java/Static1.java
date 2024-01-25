import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "D")
	public static double aDouble20;

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "Lclient!rt;")
	public static Class309 aClass309_7;

	@OriginalMember(owner = "client!aa", name = "g", descriptor = "Lclient!pia;")
	public static Class272 aClass272_18;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "Lclient!ln;")
	public static final Class216 aClass216_14 = new Class216(15, 0, 1, 0);

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "Lclient!ht;")
	public static final Class151 aClass151_10 = new Class151();

	@OriginalMember(owner = "client!aa", name = "i", descriptor = "Z")
	public static boolean aBoolean648 = false;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)[Lclient!jn;")
	public static Class183[] method7584() {
		return new Class183[] { Static47.aClass183_1, Static471.aClass183_11, Static352.aClass183_10 };
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!cca;IB[I)V")
	public static void method7585(@OriginalArg(0) Class4_Sub2_Sub1_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(10) boolean local10;
		if (arg0.anIntArray85 != null) {
			local10 = true;
			for (@Pc(12) int local12 = 0; local12 < arg0.anIntArray85.length; local12++) {
				if (arg0.anIntArray85[local12] != arg2[local12]) {
					local10 = false;
					break;
				}
			}
			if (local10 && arg0.anInt1277 != -1) {
				@Pc(48) Class362 local48 = Static435.aClass298_1.method7034(arg0.anInt1277);
				@Pc(51) int local51 = local48.anInt10002;
				if (local51 == 1) {
					arg0.anInt1271 = arg1;
					arg0.anInt1201 = 0;
					arg0.anInt1211 = 1;
					arg0.anInt1221 = 0;
					arg0.anInt1223 = 0;
					if (!arg0.aBoolean71) {
						Static67.method1108(arg0, arg0.anInt1223, local48);
					}
				}
				if (local51 == 2) {
					arg0.anInt1221 = 0;
				}
			}
		}
		local10 = true;
		for (@Pc(100) int local100 = 0; local100 < arg2.length; local100++) {
			if (arg2[local100] != -1) {
				local10 = false;
			}
			if (arg0.anIntArray85 == null || arg0.anIntArray85[local100] == -1 || Static435.aClass298_1.method7034(arg2[local100]).anInt10005 >= Static435.aClass298_1.method7034(arg0.anIntArray85[local100]).anInt10005) {
				arg0.anInt1281 = arg0.anInt1280;
				arg0.anIntArray85 = arg2;
				arg0.anInt1271 = arg1;
			}
		}
		if (local10) {
			arg0.anInt1271 = arg1;
			arg0.anIntArray85 = arg2;
			arg0.anInt1281 = arg0.anInt1280;
		}
	}
}
