import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
	public static int anInt6266;

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
	public static int anInt6269;

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "Lclient!fja;")
	public static Class126 aClass126_116;

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
	public static int anInt6265 = 0;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(CZ)I")
	public static int method5251(@OriginalArg(0) char arg0) {
		return arg0 >= '\u0000' && Class207.anIntArray361.length > arg0 ? Class207.anIntArray361[arg0] : -1;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZBI)V")
	public static void method5254(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		if (Static623.aClass62_45.method1682((long) arg2) != null) {
			return;
		}
		if (Static293.aBoolean420) {
			@Pc(26) Class3_Sub54 local26 = new Class3_Sub54(arg2, new Class133_Sub1(4096, Static270.aClass143_63, arg2), arg0, arg1);
			local26.aClass133_Sub1_1.method2965(Static452.aStringArray53[Static319.anInt5939]);
			Static623.aClass62_45.method1686((long) arg2, local26);
		} else {
			Static638.method8383(arg1, arg2);
		}
	}
}
