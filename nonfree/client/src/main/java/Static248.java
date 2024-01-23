import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "[Z")
	public static boolean[] aBooleanArray33;

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
	public static int anInt4864;

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
	public static int anInt4865;

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
	public static int anInt4868;

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "Lclient!wb;")
	public static Class4_Sub2_Sub4 aClass4_Sub2_Sub4_9;

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
	public static int anInt4870 = 0;

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
	public static int anInt4872 = 3;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IBLclient!cg;)Lclient!vl;")
	public static Class4_Sub32 method3799(@OriginalArg(0) int arg0, @OriginalArg(2) Class22 arg1) {
		@Pc(8) byte[] local8 = arg1.method683(arg0);
		return local8 == null ? null : new Class4_Sub32(local8);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!cg;BLclient!cg;)V")
	public static void method3800(@OriginalArg(0) Class22 arg0, @OriginalArg(2) Class22 arg1) {
		Static216.aClass22_73 = arg0;
		Static236.aClass22_79 = arg1;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIII)V")
	public static void method3801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class4_Sub2_Sub15 local8 = Static131.method1210(arg0, 8);
		local8.method2876();
		local8.anInt3536 = arg3;
		local8.anInt3539 = arg1;
		local8.anInt3526 = arg2;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
	public static void method3803() {
		Static133.aClass172_22.method4350();
	}
}
