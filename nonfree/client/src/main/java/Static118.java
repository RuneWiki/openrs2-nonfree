import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
	public static int anInt2181;

	@OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
	public static int anInt2182;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)V")
	public static void method1790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class5_Sub5_Sub21 local16 = Static101.method1629(5, arg0);
		local16.method8958();
		local16.anInt10530 = arg1;
	}
}
