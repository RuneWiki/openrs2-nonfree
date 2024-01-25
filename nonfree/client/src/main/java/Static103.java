import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!dv", name = "s", descriptor = "Lclient!daa;")
	public static Class58 aClass58_6;

	@OriginalMember(owner = "client!dv", name = "d", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_44 = new Class298(5, -1);

	@OriginalMember(owner = "client!dv", name = "e", descriptor = "Z")
	public static boolean aBoolean199 = false;

	@OriginalMember(owner = "client!dv", name = "q", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_61 = new Class272(56, 4);

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(Z)V")
	public static void method2177() {
		if (!Static380.aBoolean537) {
			return;
		}
		@Pc(16) Class203 local16 = Static582.method7699(Static550.anInt7639, Static345.anInt6055);
		if (local16 != null && local16.anObjectArray4 != null) {
			@Pc(25) Class3_Sub45 local25 = new Class3_Sub45();
			local25.anObjectArray33 = local16.anObjectArray4;
			local25.aClass203_136 = local16;
			Static149.method2778(local25);
		}
		Static380.aBoolean537 = false;
		Static63.anInt1712 = -1;
		Static212.anInt4226 = -1;
		if (local16 != null) {
			Static138.method2656(local16);
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIIIII)V")
	public static void method2185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(19) int local19 = arg2 + 1;
		Static337.method5150(arg1, arg4, arg3, Static176.anIntArrayArray28[arg2]);
		@Pc(28) int local28 = arg0 - 1;
		Static337.method5150(arg1, arg4, arg3, Static176.anIntArrayArray28[arg0]);
		for (@Pc(32) int local32 = local19; local32 <= local28; local32++) {
			@Pc(38) int[] local38 = Static176.anIntArrayArray28[local32];
			local38[arg3] = local38[arg1] = arg4;
		}
	}
}
