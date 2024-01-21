import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "Lclient!pb;")
	public static Class71 aClass71_28;

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "[I")
	public static int[] anIntArray271;

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
	public static int anInt3025;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1056 = Static151.method2243("::errortest");

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1057 = Static151.method2243("(U5");

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)Lclient!rb;")
	public static Class85 method2153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub18 local7 = Static92.aClass2_Sub18ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass85_1;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!pb;BLclient!mb;Lclient!pb;Lclient!mb;)Lclient!ji;")
	public static Class2_Sub1_Sub12 method2154(@OriginalArg(0) Class71 arg0, @OriginalArg(2) Class62 arg1, @OriginalArg(3) Class71 arg2, @OriginalArg(4) Class62 arg3) {
		@Pc(16) int local16 = arg0.method2114(arg3);
		@Pc(22) int local22 = arg0.method2142(arg1, local16);
		return Static44.method690(arg2, arg0, local16, local22);
	}
}
