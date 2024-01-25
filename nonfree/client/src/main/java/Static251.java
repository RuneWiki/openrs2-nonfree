import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
	public static int anInt4676;

	@OriginalMember(owner = "client!qc", name = "p", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "[I")
	public static final int[] anIntArray417 = new int[14];

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "[I")
	public static final int[] anIntArray418 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!qc", name = "q", descriptor = "Z")
	public static boolean aBoolean454 = false;

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "(B)V")
	public static void method4209() {
		@Pc(1) Class87 local1 = Static115.aClass87_23;
		synchronized (Static115.aClass87_23) {
			Static115.aClass87_23.method2485();
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(III)V")
	public static void method4210(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class197 local15 = new Class197(16);
		for (@Pc(20) Class1_Sub7 local20 = (Class1_Sub7) Static339.aClass197_30.method5161(); local20 != null; local20 = (Class1_Sub7) Static339.aClass197_30.method5154()) {
			local20.method5628();
			@Pc(31) int local31 = (int) (local20.aLong213 >> 28);
			@Pc(42) int local42 = (int) (local20.aLong213 >> 14 & 0x3FFFL) - arg1;
			@Pc(51) int local51 = (int) (local20.aLong213 & 0x3FFFL) - arg0;
			if (local51 >= 0 && local42 >= 0 && Static233.anInt5573 > local51 && Static134.anInt2971 > local42) {
				local15.method5166(local20, (long) (local31 << 28 | local42 << 14 | local51));
			}
		}
		Static339.aClass197_30 = local15;
	}
}
