import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "Lclient!gj;")
	public static Class31 aClass31_108;

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "Lclient!tq;")
	public static Class191 aClass191_165;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "[I")
	public static final int[] anIntArray384 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
	public static int anInt5037 = 0;

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "Z")
	public static boolean aBoolean461 = false;

	@OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
	public static int anInt5040 = 0;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILclient!dg;)Lclient!hd;")
	public static Class79_Sub1 method4617(@OriginalArg(1) Class2_Sub10 arg0) {
		return new Class79_Sub1(arg0.method4460(), arg0.method4460(), arg0.method4460(), arg0.method4460(), arg0.method4460(), arg0.method4460(), arg0.method4460(), arg0.method4460(), arg0.method4463(), arg0.method4421());
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)Lclient!mj;")
	public static Class62_Sub4 method4618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class8 local7 = Static275.aClass8ArrayArrayArray4[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass62_Sub4_1;
	}
}
