import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
	public static int anInt2244;

	@OriginalMember(owner = "client!hk", name = "J", descriptor = "I")
	public static int anInt2266;

	@OriginalMember(owner = "client!hk", name = "O", descriptor = "Lclient!nj;")
	public static final Class1_Sub21 aClass1_Sub21_2 = new Class1_Sub21(new byte[5000]);

	@OriginalMember(owner = "client!hk", name = "Q", descriptor = "I")
	public static int anInt2270 = 0;

	@OriginalMember(owner = "client!hk", name = "R", descriptor = "[I")
	public static final int[] anIntArray194 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!hk", name = "S", descriptor = "[I")
	public static final int[] anIntArray195 = new int[32];

	@OriginalMember(owner = "client!hk", name = "T", descriptor = "[I")
	public static final int[] anIntArray196 = new int[14];

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIII)V")
	public static void method1844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 < arg1) {
			Static244.method5351(arg3, arg1, Static319.anIntArrayArray31[arg2], arg0);
		} else {
			Static244.method5351(arg1, arg3, Static319.anIntArrayArray31[arg2], arg0);
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
	public static void method1845() {
		@Pc(5) Class37 local5 = Static129.aClass37_44;
		synchronized (Static129.aClass37_44) {
			Static129.aClass37_44.method919();
		}
		local5 = Static50.aClass37_23;
		synchronized (Static50.aClass37_23) {
			Static50.aClass37_23.method919();
		}
	}
}
