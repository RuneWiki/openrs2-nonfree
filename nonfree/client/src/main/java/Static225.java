import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!ida", name = "c", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_49 = new Class46(76, -1);

	@OriginalMember(owner = "client!ida", name = "f", descriptor = "I")
	public static int anInt4205 = 0;

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(III)V")
	public static void method3819(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class5_Sub5_Sub21 local12 = Static101.method1629(6, arg0);
		local12.method8958();
		local12.anInt10530 = arg1;
	}
}
