import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static483 {

	@OriginalMember(owner = "client!qm", name = "m", descriptor = "Lclient!ks;")
	public static final Class209 aClass209_12 = new Class209("", 12);

	@OriginalMember(owner = "client!qm", name = "x", descriptor = "I")
	public static int anInt8316 = 0;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(III)V")
	public static void method7063(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class5_Sub2_Sub4 local9 = Static257.method3597(14, (long) arg0);
		local9.method2438();
		local9.anInt2749 = arg1;
	}
}
