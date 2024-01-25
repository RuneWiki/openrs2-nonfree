import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!ls", name = "k", descriptor = "Lclient!jka;")
	public static Class6_Sub2_Sub11 aClass6_Sub2_Sub11_3;

	@OriginalMember(owner = "client!ls", name = "m", descriptor = "I")
	public static int anInt6041;

	@OriginalMember(owner = "client!ls", name = "t", descriptor = "F")
	public static float aFloat110;

	@OriginalMember(owner = "client!ls", name = "n", descriptor = "[Lclient!saa;")
	public static final Class321[] aClass321Array1 = new Class321[100];

	@OriginalMember(owner = "client!ls", name = "o", descriptor = "Lclient!rj;")
	public static final Class318 aClass318_13 = new Class318();

	@OriginalMember(owner = "client!ls", name = "l", descriptor = "I")
	public static int anInt6046 = 0;

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIIII)V")
	public static void method5445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class6_Sub2_Sub4 local9 = Static602.method8315((long) arg0, 4);
		local9.method2040();
		local9.anInt2111 = arg1;
		local9.anInt2113 = arg2;
		local9.anInt2116 = arg3;
	}
}
