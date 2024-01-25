import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static492 {

	@OriginalMember(owner = "client!pka", name = "l", descriptor = "Z")
	public static boolean aBoolean688 = true;

	@OriginalMember(owner = "client!pka", name = "h", descriptor = "[I")
	public static final int[] anIntArray560 = new int[32];

	@OriginalMember(owner = "client!pka", name = "a", descriptor = "(IIIIILclient!ha;Ljava/lang/String;I)V")
	public static void method7047(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class145 arg3, @OriginalArg(6) String arg4, @OriginalArg(7) int arg5) {
		if (Static236.aClass43_18 == null || Static160.aClass43_16 == null) {
			if (Static117.aClass254_47.method6072(Static195.anInt3170) && Static117.aClass254_47.method6072(Static476.anInt7648)) {
				Static236.aClass43_18 = arg3.method9683(Static737.method8362(Static117.aClass254_47, Static195.anInt3170, 0), true);
				@Pc(62) Class355 local62 = Static737.method8362(Static117.aClass254_47, Static476.anInt7648, 0);
				Static160.aClass43_16 = arg3.method9683(local62, true);
				local62.method8352();
				Static625.aClass43_28 = arg3.method9683(local62, true);
			} else {
				arg3.aa(arg2, arg5, arg0, 20, Static409.anInt6712 | 255 - Static122.anInt2070 << 24, 1);
			}
		}
		if (Static236.aClass43_18 != null && Static160.aClass43_16 != null) {
			@Pc(91) int local91 = (arg0 - Static160.aClass43_16.method9601() * 2) / Static236.aClass43_18.method9601();
			for (@Pc(93) int local93 = 0; local93 < local91; local93++) {
				Static236.aClass43_18.method9588(Static160.aClass43_16.method9601() + arg2 + Static236.aClass43_18.method9601() * local93, arg5);
			}
			Static160.aClass43_16.method9588(arg2, arg5);
			Static625.aClass43_28.method9588(arg0 + arg2 - Static625.aClass43_28.method9601(), arg5);
		}
		Static387.aClass68_12.method7882(arg2 + 3, Static615.anInt3801 | 0xFF000000, arg4, arg5 + 14, -1);
		arg3.aa(arg2, arg5 + 20, arg0, arg1 - 20, Static409.anInt6712 | -Static122.anInt2070 + 255 << 24, 1);
	}
}
