import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!mca", name = "k", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_145 = new Class150(75, 0);

	@OriginalMember(owner = "client!mca", name = "m", descriptor = "[I")
	public static final int[] anIntArray412 = new int[13];

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(IILclient!jj;IZZ[BI)Lclient!og;")
	public static Class4_Sub2_Sub1 method4982(@OriginalArg(2) Class62_Sub3 arg0, @OriginalArg(3) int arg1, @OriginalArg(6) byte[] arg2, @OriginalArg(7) int arg3) {
		if (arg0.aBoolean273 || Static281.method4574(arg3) && Static281.method4574(arg1)) {
			return new Class4_Sub2_Sub1(arg0, 3553, 6406, arg3, arg1, false, arg2, 6406);
		} else if (arg0.aBoolean271) {
			return new Class4_Sub2_Sub1(arg0, 34037, 6406, arg3, arg1, false, arg2, 6406);
		} else {
			return new Class4_Sub2_Sub1(arg0, 6406, arg3, arg1, Static179.method3071(arg3), Static179.method3071(arg1), arg2, 6406);
		}
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(IIIZI)V")
	public static void method4984(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static334.aLong191 = 0L;
		@Pc(8) int local8 = Static503.method6935();
		if (arg3 == 3 || local8 == 3) {
			arg2 = true;
		}
		if (!Static110.aClass62_15.method7049()) {
			arg2 = true;
		}
		Static128.method2401(local8, arg1, arg3, arg2, arg0);
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(B)V")
	public static void method4985() {
		Static523.anInt8857 = -1;
		Static239.anInt4818 = 1;
		if (Static291.aString59 == null) {
			Static75.method1357(35);
		} else {
			@Pc(33) Class5_Sub3 local33 = new Class5_Sub3(Static18.method598(Static307.method5029(Static291.aString59)));
			@Pc(37) long local37 = local33.method4172();
			Static386.aLong114 = local33.method4172();
			Static257.method4354(true, "", Static193.method3234(local37));
		}
	}
}
