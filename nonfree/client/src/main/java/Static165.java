import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!gf", name = "y", descriptor = "I")
	public static int anInt3435;

	@OriginalMember(owner = "client!gf", name = "z", descriptor = "Z")
	public static boolean aBoolean248 = false;

	@OriginalMember(owner = "client!gf", name = "G", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_21 = new Class344(36, 7);

	@OriginalMember(owner = "client!gf", name = "H", descriptor = "Z")
	public static boolean aBoolean249 = false;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!vo;II)Lclient!ll;")
	public static Class198 method2735(@OriginalArg(0) Class348 arg0, @OriginalArg(1) int arg1) {
		@Pc(16) byte[] local16 = arg0.method7969(arg1);
		return local16 == null ? null : new Class198(local16);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)Lclient!kj;")
	public static Class21_Sub1_Sub4 method2737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class182 local7 = Static571.aClass182ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class21_Sub1_Sub4 local14 = local7.aClass21_Sub1_Sub4_1;
			local7.aClass21_Sub1_Sub4_1 = null;
			Static173.method2881(local14);
			return local14;
		}
	}
}
