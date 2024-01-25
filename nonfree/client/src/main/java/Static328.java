import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!up", name = "k", descriptor = "I")
	public static int anInt6269;

	@OriginalMember(owner = "client!up", name = "n", descriptor = "I")
	public static int anInt6272;

	@OriginalMember(owner = "client!up", name = "s", descriptor = "[I")
	public static final int[] anIntArray485 = new int[2500];

	@OriginalMember(owner = "client!up", name = "t", descriptor = "I")
	public static int anInt6276 = 0;

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(B)V")
	public static void method5311() {
		if (Static80.anInt2116 != 2) {
			try {
				Static366.method4253("tbrefresh", Static76.aClient1);
			} catch (@Pc(22) Throwable local22) {
			}
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!li;Lclient!vq;B)I")
	public static int method5313(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class47 arg1) {
		if (arg0.anInt3840 != -1) {
			return arg0.anInt3840;
		}
		if (arg0.anInt3837 != -1) {
			@Pc(31) Class102 local31 = Static141.anInterface3_6.method5441(arg1.method2712() ? arg0.anInt3837 : arg0.anInt3842);
			if (!local31.aBoolean263) {
				return local31.aShort52;
			}
		}
		return arg0.anInt3843;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IB)V")
	public static void method5314(@OriginalArg(0) int arg0) {
		Static273.anInt5435 = 100;
		Static289.anInt5645 = -1;
		Static33.anInt820 = 3;
		Static138.anInt2999 = arg0;
	}

	@OriginalMember(owner = "client!up", name = "c", descriptor = "(B)Lclient!ta;")
	public static Class2_Sub6 method5319() {
		@Pc(13) Class2_Sub6 local13 = (Class2_Sub6) Static63.aClass32_3.method843();
		if (local13 == null) {
			return new Class2_Sub6();
		} else {
			Static121.anInt4966--;
			return local13;
		}
	}
}
