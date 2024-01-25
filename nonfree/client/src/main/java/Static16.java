import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "Lclient!bl;")
	public static Class39 aClass39_1;

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
	public static int anInt323;

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "Lclient!nd;")
	public static Class238 aClass238_10;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)I")
	public static int method414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static356.anIntArrayArray72 == null ? 0 : Static356.anIntArrayArray72[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(II)V")
	public static void method416(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub7_Sub2 local8 = Static188.method3210(12, arg0);
		local8.method923();
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIII)V")
	public static void method417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) int local5 = Static113.anInt2402;
		@Pc(7) int local7 = Static312.anInt2315;
		if (Static148.aBoolean241) {
			local5 += Static100.method1939();
			local7 += Static260.method4303();
		}
		@Pc(36) Class31 local36;
		if (Static429.anInt10488 == 1) {
			local36 = Static4.aClass31Array1[Static579.anInt9466 / 100];
			local36.method8793(local5 - 8, local7 + -8);
			Static103.method1953(local7 - 8, local36.method8788() + -8 + local5, local5 - 8, local7 - (8 - local36.method8807()));
		}
		if (Static429.anInt10488 == 2) {
			local36 = Static4.aClass31Array1[Static579.anInt9466 / 100 + 4];
			local36.method8793(local5 - 8, local7 - 8);
			Static103.method1953(local7 - 8, local36.method8788() + -8 + local5, local5 - 8, local36.method8807() + -8 + local7);
		}
		Static386.method5688();
	}
}
