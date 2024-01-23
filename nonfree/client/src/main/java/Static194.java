import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!of", name = "t", descriptor = "Lclient!cg;")
	public static Class22 aClass22_68;

	@OriginalMember(owner = "client!of", name = "o", descriptor = "I")
	public static int anInt3905 = 0;

	@OriginalMember(owner = "client!of", name = "y", descriptor = "Z")
	public static boolean aBoolean243 = false;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(II)Lclient!rl;")
	public static Class149 method3177(@OriginalArg(0) int arg0) {
		@Pc(6) Class149 local6 = (Class149) Static133.aClass172_22.method4347((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(30) byte[] local30 = Static22.aClass22_11.method665(Static159.method2571(arg0), Static92.method1526(arg0));
		local6 = new Class149();
		if (local30 != null) {
			local6.method3713(new Class4_Sub24(local30));
		}
		Static133.aClass172_22.method4345(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(II)Ljava/lang/String;")
	public static String method3179(@OriginalArg(1) int arg0) {
		if (arg0 >= 100000) {
			return arg0 < 10000000 ? "<col=ffffff>" + arg0 / 1000 + Static158.aString112 + "</col>" : "<col=00ff80>" + arg0 / 1000000 + Static67.aString50 + "</col>";
		} else {
			return "<col=ffff00>" + arg0 + "</col>";
		}
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(II)V")
	public static void method3180(@OriginalArg(0) int arg0) {
		Static233.anInt4654 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIILclient!uk;JZ)V")
	public static void method3181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class13 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) boolean arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class67 local6 = new Class67();
		local6.aClass13_3 = arg4;
		local6.anInt2118 = arg1 * 128 + 64;
		local6.anInt2120 = arg2 * 128 + 64;
		local6.anInt2116 = arg3;
		local6.aLong80 = arg5;
		local6.aBoolean123 = arg6;
		if (Static261.aClass4_Sub21ArrayArrayArray4[arg0][arg1][arg2] == null) {
			Static261.aClass4_Sub21ArrayArrayArray4[arg0][arg1][arg2] = new Class4_Sub21(arg0, arg1, arg2);
		}
		Static261.aClass4_Sub21ArrayArrayArray4[arg0][arg1][arg2].aClass67_1 = local6;
	}
}
