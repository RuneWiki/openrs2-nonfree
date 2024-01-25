import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!iia", name = "D", descriptor = "I")
	public static int anInt4295;

	@OriginalMember(owner = "client!iia", name = "F", descriptor = "I")
	public static int anInt4297 = 999999;

	@OriginalMember(owner = "client!iia", name = "b", descriptor = "(III)V")
	public static void method3900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class5_Sub5_Sub21 local15 = Static101.method1629(17, arg1);
		local15.method8958();
		local15.anInt10530 = arg0;
	}
}
