import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
	public static int anInt5386;

	@OriginalMember(owner = "client!rh", name = "t", descriptor = "I")
	public static int anInt5393 = 0;

	@OriginalMember(owner = "client!rh", name = "z", descriptor = "Z")
	public static boolean aBoolean336 = false;

	@OriginalMember(owner = "client!rh", name = "A", descriptor = "[I")
	public static final int[] anIntArray430 = new int[200];

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V")
	public static void method4543() {
		@Pc(1) Class198 local1 = Static327.aClass198_59;
		synchronized (Static327.aClass198_59) {
			Static327.aClass198_59.method5236();
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILclient!ir;)V")
	public static void method4544(@OriginalArg(1) Class100 arg0) {
		Static277.aClass100_110 = arg0;
		Static351.anInt6820 = Static277.aClass100_110.method2309(16);
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)V")
	public static void method4545() {
		@Pc(5) Class198 local5 = Static270.aClass198_50;
		synchronized (Static270.aClass198_50) {
			Static270.aClass198_50.method5236();
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILclient!a;Lclient!tj;)I")
	public static int method4546(@OriginalArg(1) Class1 arg0, @OriginalArg(2) Class122 arg1) {
		if (arg0.anInt14 != -1) {
			return arg0.anInt14;
		}
		if (arg0.anInt15 != -1) {
			@Pc(28) Class171 local28 = Static127.anInterface9_3.method2396(arg1.method4747() ? arg0.anInt15 : arg0.anInt13);
			if (!local28.aBoolean318) {
				return local28.aShort83;
			}
		}
		return arg0.anInt11;
	}
}
