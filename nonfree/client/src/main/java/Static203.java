import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!uh", name = "U", descriptor = "I")
	public static int anInt4318;

	@OriginalMember(owner = "client!uh", name = "T", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1480 = Static200.method3116(")1");

	@OriginalMember(owner = "client!uh", name = "Y", descriptor = "Lclient!cd;")
	public static Class1_Sub5 aClass1_Sub5_1 = new Class1_Sub5(0, 0);

	@OriginalMember(owner = "client!uh", name = "ab", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1481 = Static200.method3116("Ok");

	@OriginalMember(owner = "client!uh", name = "bb", descriptor = "[I")
	public static int[] anIntArray563 = new int[500];

	@OriginalMember(owner = "client!uh", name = "cb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1482 = aClass60_1481;

	@OriginalMember(owner = "client!uh", name = "db", descriptor = "I")
	public static int anInt4323 = 0;

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "(III)V")
	public static void method3159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub22 local7 = Static100.aClass1_Sub22ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass106_1 = null;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIII)V")
	public static void method3160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class1_Sub22 local7 = Static100.aClass1_Sub22ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 != null) {
			Static100.aClass1_Sub22ArrayArrayArray3[arg0][arg1][arg2].anInt3362 = arg3;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!kh;I)V")
	public static void method3161(@OriginalArg(0) Class60 arg0) {
		if (Static116.aClass65_4.anApplet1 == null) {
			return;
		}
		try {
			@Pc(13) Class60 local13 = Static111.aClass60_831.method1804(Static116.aClass65_4.anApplet1);
			@Pc(19) Class60 local19 = Static110.aClass60_823.method1804(Static116.aClass65_4.anApplet1);
			@Pc(44) Class60 local44 = Static34.method611(new Class60[] { local13, Static59.aClass60_459, arg0, Static141.aClass60_1112, local19 });
			if (arg0.method1835() == 0) {
				local44 = Static34.method611(new Class60[] { local44, Static22.aClass60_177 });
			} else {
				local44 = Static34.method611(new Class60[] { local44, Static199.aClass60_1459, Static148.method3506(Static3.method57() + 94608000000L), Static22.aClass60_173, Static135.method2254(94608000L) });
			}
			Static34.method611(new Class60[] { Static183.aClass60_1320, local44, Static99.aClass60_742 }).method1819(Static116.aClass65_4.anApplet1);
		} catch (@Pc(121) Throwable local121) {
		}
	}
}
