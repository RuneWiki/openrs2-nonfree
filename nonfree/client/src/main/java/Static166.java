import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!fq", name = "B", descriptor = "Lclient!tba;")
	public static Class329 aClass329_3;

	@OriginalMember(owner = "client!fq", name = "G", descriptor = "[B")
	public static final byte[] aByteArray29 = new byte[2048];

	@OriginalMember(owner = "client!fq", name = "f", descriptor = "(I)V")
	public static void method1420() {
		Static436.aClass109_45.method2329();
		Static189.anInt3261 = 0;
	}

	@OriginalMember(owner = "client!fq", name = "g", descriptor = "(I)V")
	public static void method1421() {
		Static596.aClass47_4.method913();
	}

	@OriginalMember(owner = "client!fq", name = "h", descriptor = "(I)Lclient!oj;")
	public static Class183 method1422() {
		try {
			return (Class183) Class.forName("Class183_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(III)Lclient!fw;")
	public static Class13_Sub1_Sub4 method1427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class53 local7 = Static28.aClass53ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass13_Sub1_Sub4_1;
	}
}
