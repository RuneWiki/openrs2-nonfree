import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "Lclient!vb;")
	public static Class251 aClass251_1;

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "Lclient!hh;")
	public static Class109 aClass109_1;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIILclient!qg;)Lclient!ls;")
	public static Class21_Sub2_Sub1 method33(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class121_Sub2 arg4) {
		if (arg4.aBoolean461 || Static362.method5163(arg2) && Static362.method5163(arg0)) {
			return new Class21_Sub2_Sub1(arg4, 3553, arg3, arg1, arg2, arg0, true);
		} else if (arg4.aBoolean484) {
			return new Class21_Sub2_Sub1(arg4, 34037, arg3, arg1, arg2, arg0, true);
		} else {
			return new Class21_Sub2_Sub1(arg4, arg3, arg1, arg2, arg0, Static30.method427(arg2), Static30.method427(arg0), true);
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
	public static void method35() {
		@Pc(10) int local10 = Static327.aClass230_Sub1_1.method5647(Static146.anInt2664);
		if (local10 == 0) {
			Static183.aByteArrayArrayArray7 = null;
			Static435.method4776(0);
		} else if (local10 == 1) {
			Static65.method980((byte) 0);
			Static435.method4776(512);
			if (Static228.aByteArrayArrayArray8 != null) {
				Static35.method479();
			}
		} else {
			Static65.method980((byte) (Static177.anInt3327 - 4 & 0xFF));
			Static435.method4776(2);
		}
		Static101.anInt1975 = Static1.anInt41;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
	public static void method36() {
		Static328.aClass121_9.V(Static15.anInt285, Static327.aClass230_Sub1_1.aBoolean622 ? Static65.anInt1188 + 256 << 0 : -1, 256);
	}
}
