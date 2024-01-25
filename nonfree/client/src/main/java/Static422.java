import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
	public static int anInt6875;

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "F")
	public static float aFloat102;

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_101 = new Class134("cyan:", "blaugrün:", "cyan:", "cyan:");

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
	public static int anInt6874 = -2;

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "[Lclient!wh;")
	public static final Class2_Sub5_Sub18[] aClass2_Sub5_Sub18Array6 = new Class2_Sub5_Sub18[14];

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
	public static void method5327() {
		Static35.method530();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILclient!bn;BI)J")
	public static long method5328(@OriginalArg(0) int arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) long local10 = 4194304L;
		@Pc(12) long local12 = 2147483648L;
		@Pc(14) long local14 = Long.MIN_VALUE;
		@Pc(21) Class192 local21 = Static50.aClass190_1.method4218(arg1.method5292());
		@Pc(42) long local42 = (long) (arg0 | arg2 << 7 | arg1.method5296() << 14 | arg1.method5298() << 20 | 0x40000000);
		if (local21.anInt5357 == 0) {
			local42 |= local14;
		}
		if (local21.anInt5339 == 1) {
			local42 |= local10;
		}
		if (local21.aBoolean398) {
			local42 |= local12;
		}
		return local42 | (long) arg1.method5292() << 32;
	}
}
