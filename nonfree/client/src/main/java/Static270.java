import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(B)V")
	public static void method3404() {
		Static331.anInt5297 = 0;
		Static20.anInt428 = 0;
		Static305.anInt4782 = 0;
		Static95.anInt1639 = 0;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIILclient!em;Lclient!em;)V")
	public static void method3407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub4 arg3, @OriginalArg(4) Class2_Sub4 arg4) {
		@Pc(4) Class258 local4 = Static121.method1714(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass2_Sub4_2 = arg3;
			local4.aClass2_Sub4_3 = arg4;
		}
	}
}
