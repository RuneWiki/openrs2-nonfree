import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static669 {

	@OriginalMember(owner = "client!wk", name = "C", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_128 = new Class387(87, 8);

	@OriginalMember(owner = "client!wk", name = "G", descriptor = "I")
	public static int anInt10710 = 0;

	@OriginalMember(owner = "client!wk", name = "I", descriptor = "I")
	public static int anInt10711 = -1;

	@OriginalMember(owner = "client!wk", name = "J", descriptor = "I")
	public static int anInt10712 = -1;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZZ)V")
	public static void method9214(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(15) Class5_Sub48 local15 = Static507.method7441(arg0, arg1);
		if (local15 != null) {
			local15.method9327(1);
		}
	}
}
