import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!rh", name = "W", descriptor = "I")
	public static int anInt3434;

	@OriginalMember(owner = "client!rh", name = "Z", descriptor = "[Lclient!va;")
	public static Class1_Sub3_Sub1_Sub5[] aClass1_Sub3_Sub1_Sub5Array8;

	@OriginalMember(owner = "client!rh", name = "jb", descriptor = "Lclient!jf;")
	public static Class51 aClass51_1;

	@OriginalMember(owner = "client!rh", name = "kb", descriptor = "Lclient!ab;")
	public static Class3 aClass3_31;

	@OriginalMember(owner = "client!rh", name = "X", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1670 = Static187.method3089("<col=ff0000>");

	@OriginalMember(owner = "client!rh", name = "Y", descriptor = "I")
	public static volatile int anInt3435 = 0;

	@OriginalMember(owner = "client!rh", name = "bb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1671 = Static187.method3089("<col=ff7000>");

	@OriginalMember(owner = "client!rh", name = "db", descriptor = "I")
	public static int anInt3438 = 0;

	@OriginalMember(owner = "client!rh", name = "ib", descriptor = "[I")
	public static final int[] anIntArray303 = new int[128];

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!je;B)V")
	public static void method2582(@OriginalArg(0) Class50 arg0) {
		Static24.aClass50_1 = arg0;
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(III)V")
	public static void method2584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static179.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass87_1 = null;
		}
	}
}
