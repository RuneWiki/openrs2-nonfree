import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!kk", name = "r", descriptor = "I")
	public static int anInt5078;

	@OriginalMember(owner = "client!kk", name = "q", descriptor = "I")
	public static int anInt5077 = 1;

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(III)V")
	public static void method4274(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub3_Sub1 local12 = Static374.method5445(14, arg1);
		local12.method491();
		local12.anInt548 = arg0;
	}
}
