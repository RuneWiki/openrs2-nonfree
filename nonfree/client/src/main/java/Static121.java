import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!dt", name = "d", descriptor = "I")
	public static int anInt2492;

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "I")
	public static int anInt2490 = -1;

	@OriginalMember(owner = "client!dt", name = "e", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray1 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!dt", name = "f", descriptor = "[I")
	public static final int[] anIntArray86 = new int[2];

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Z)Lclient!cc;")
	public static Class54 method2237() {
		try {
			return (Class54) Class.forName("Class54_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lclient!mc;I)Lclient!jk;")
	public static Class181 method2238(@OriginalArg(0) Class5_Sub41 arg0) {
		@Pc(7) String local7 = arg0.method7847();
		@Pc(19) Class275 local19 = Static393.method5771()[arg0.method7816()];
		@Pc(26) Class81 local26 = Static584.method8024()[arg0.method7816()];
		@Pc(30) int local30 = arg0.method7849();
		@Pc(34) int local34 = arg0.method7849();
		@Pc(38) int local38 = arg0.method7816();
		@Pc(42) int local42 = arg0.method7816();
		@Pc(46) int local46 = arg0.method7816();
		@Pc(50) int local50 = arg0.method7860();
		@Pc(54) int local54 = arg0.method7860();
		@Pc(58) int local58 = arg0.method7804();
		@Pc(62) int local62 = arg0.method7804();
		@Pc(66) int local66 = arg0.method7804();
		return new Class181(local7, local19, local26, local30, local34, local38, local42, local46, local50, local54, local58, local62, local66);
	}
}
