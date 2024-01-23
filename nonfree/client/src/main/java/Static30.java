import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!cj", name = "D", descriptor = "Lclient!ai;")
	public static Class7 aClass7_8;

	@OriginalMember(owner = "client!cj", name = "F", descriptor = "I")
	public static int anInt724;

	@OriginalMember(owner = "client!cj", name = "v", descriptor = "I")
	public static int anInt719 = -1;

	@OriginalMember(owner = "client!cj", name = "w", descriptor = "Lclient!kh;")
	private static Class60 aClass60_249 = Static200.method3116("Loading fonts )2 ");

	@OriginalMember(owner = "client!cj", name = "x", descriptor = "Lclient!kh;")
	public static Class60 aClass60_250 = aClass60_249;

	@OriginalMember(owner = "client!cj", name = "C", descriptor = "I")
	public static int anInt722 = 99;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!ai;I)V")
	public static void method548(@OriginalArg(0) Class7 arg0) {
		Static139.aClass7_29 = arg0;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILclient!ai;ZI)[Lclient!ch;")
	public static Class1_Sub1_Sub6[] method549(@OriginalArg(0) int arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(3) int arg2) {
		return Static87.method1515(arg0, arg2, arg1) ? Static11.method3526() : null;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!nc;I)Lclient!pc;")
	public static Class1_Sub2 method550(@OriginalArg(0) Class1_Sub9 arg0) {
		arg0.method895();
		@Pc(19) int local19 = arg0.method895();
		@Pc(23) Class1_Sub2 local23 = Static70.method1278(local19);
		local23.anInt4714 = arg0.method895();
		@Pc(36) int local36 = arg0.method895();
		for (@Pc(38) int local38 = 0; local38 < local36; local38++) {
			@Pc(44) int local44 = arg0.method895();
			local23.method3513(arg0, local44);
		}
		local23.method3503();
		return local23;
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V")
	public static void method551() {
		Static23.aBoolean144 = false;
		Static148.aBoolean266 = false;
	}
}
