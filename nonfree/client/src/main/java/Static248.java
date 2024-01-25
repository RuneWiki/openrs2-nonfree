import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!it", name = "f", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray2;

	@OriginalMember(owner = "client!it", name = "b", descriptor = "Lclient!hd;")
	public static final Class136 aClass136_4 = new Class136();

	@OriginalMember(owner = "client!it", name = "e", descriptor = "[I")
	public static final int[] anIntArray274 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(I)Lclient!gfa;")
	public static Class2_Sub14 method3410() {
		if (Static193.aClass109_9 == null || Static487.aClass140_1 == null) {
			return null;
		}
		for (@Pc(14) Class2_Sub14 local14 = (Class2_Sub14) Static487.aClass140_1.method2964(); local14 != null; local14 = (Class2_Sub14) Static487.aClass140_1.method2964()) {
			@Pc(25) Class172 local25 = Static193.aClass197_2.method4161(local14.anInt3128);
			if (local25 != null && local25.aBoolean296 && local25.method3771(Static193.anInterface1_2)) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Lclient!vj;I)Lclient!df;")
	public static Class69_Sub1_Sub1 method3412(@OriginalArg(0) Class2_Sub22 arg0) {
		@Pc(12) Class69_Sub1 local12 = Static162.method2433(arg0);
		@Pc(16) int local16 = arg0.method8526();
		return new Class69_Sub1_Sub1(local12.aClass361_10, local12.aClass306_13, local12.anInt9605, local12.anInt9611, local12.anInt9616, local12.anInt9604, local12.anInt9610, local12.anInt9613, local12.anInt9612, local12.anInt1774, local12.anInt1771, local12.anInt1777, local12.anInt1775, local12.anInt1779, local12.anInt1776, local16);
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Lclient!wu;IZ)Lclient!ue;")
	public static Class2_Sub47 method3413(@OriginalArg(0) Class380 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) byte[] local13 = arg0.method8616(arg1);
		return local13 == null ? null : new Class2_Sub47(local13);
	}
}
