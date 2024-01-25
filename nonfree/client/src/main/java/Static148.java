import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!hg", name = "q", descriptor = "Lclient!jk;")
	public static final Class137 aClass137_24 = new Class137(4);

	@OriginalMember(owner = "client!hg", name = "u", descriptor = "I")
	public static int anInt2692 = 0;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IILclient!bf;)V")
	public static void method2077(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub3_Sub1 arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (arg1.anInt7351 > Static265.anInt4371) {
			Static435.method5780(arg1);
		} else if (Static265.anInt4371 <= arg1.anInt7349) {
			Static11.method158(arg1);
		} else {
			Static84.method4132(false, arg1);
			local9 = Static325.anInt5266;
			local7 = Static206.anInt4094;
		}
		if (arg1.anInt7339 < 128 || arg1.anInt7343 < 128 || arg1.anInt7339 >= Static337.anInt5497 * 128 - 128 || arg1.anInt7343 >= Static282.anInt4644 * 128 - 128) {
			local7 = -1;
			arg1.anInt7349 = 0;
			arg1.anInt7351 = 0;
			arg1.anInt7365 = -1;
			arg1.anInt7402 = -1;
			local9 = 0;
			arg1.anInt7387 = -1;
			arg1.anInt7339 = arg1.anIntArray560[0] * 128 + arg1.method5894() * 64;
			arg1.anInt7343 = arg1.anIntArray559[0] * 128 + arg1.method5894() * 64;
			arg1.method5886();
		}
		if (arg1 == Static401.aClass8_Sub3_Sub1_Sub1_2 && (arg1.anInt7339 < 1536 || arg1.anInt7343 < 1536 || arg1.anInt7339 >= (Static337.anInt5497 - 12) * 128 || arg1.anInt7343 >= (Static282.anInt4644 - 12) * 128)) {
			arg1.anInt7365 = -1;
			arg1.anInt7349 = 0;
			local9 = 0;
			arg1.anInt7402 = -1;
			local7 = -1;
			arg1.anInt7351 = 0;
			arg1.anInt7387 = -1;
			arg1.anInt7339 = arg1.anIntArray560[0] * 128 + arg1.method5894() * 64;
			arg1.anInt7343 = arg1.anIntArray559[0] * 128 + arg1.method5894() * 64;
			arg1.method5886();
		}
		@Pc(215) int local215 = Static231.method3152(arg1);
		Static261.method3392(arg1, local215, local9, local7);
		Static214.method2938(arg1);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)V")
	public static void method2078() {
		@Pc(5) Class137 local5 = Static31.aClass137_5;
		synchronized (Static31.aClass137_5) {
			Static31.aClass137_5.method2745(5);
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V")
	public static void method2079() {
		Static87.aClass67_6.method1431();
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
	public static void method2080() {
		Static351.anInt5841 = 0;
		Static41.aClass244_2.method5264();
		Static339.aBoolean390 = false;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(CI)Z")
	public static boolean method2082(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
