import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!pt", name = "q", descriptor = "[I")
	public static int[] anIntArray487;

	@OriginalMember(owner = "client!pt", name = "m", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_168 = new Class81(77, -1);

	@OriginalMember(owner = "client!pt", name = "n", descriptor = "[Lclient!vi;")
	public static final Class343[] aClass343Array1 = new Class343[16];

	@OriginalMember(owner = "client!pt", name = "o", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_131 = new Class319(81, -1);

	@OriginalMember(owner = "client!pt", name = "p", descriptor = "Z")
	public static boolean aBoolean509 = false;

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lclient!dp;I)V")
	public static void method5830(@OriginalArg(0) Class1_Sub10 arg0) {
		if (Static118.aClass293ArrayArrayArray14 == null) {
			return;
		}
		@Pc(12) Interface7 local12 = null;
		if (arg0.anInt2093 == 0) {
			local12 = (Interface7) Static387.method5565(arg0.anInt2083, arg0.anInt2090, arg0.anInt2089);
		}
		if (arg0.anInt2093 == 1) {
			local12 = (Interface7) Static89.method1752(arg0.anInt2083, arg0.anInt2090, arg0.anInt2089);
		}
		if (arg0.anInt2093 == 2) {
			local12 = (Interface7) Static18.method537(arg0.anInt2083, arg0.anInt2090, arg0.anInt2089, ge.class);
		}
		if (arg0.anInt2093 == 3) {
			local12 = (Interface7) Static17.method507(arg0.anInt2083, arg0.anInt2090, arg0.anInt2089);
		}
		if (local12 == null) {
			arg0.anInt2092 = 0;
			arg0.anInt2086 = 0;
			arg0.anInt2085 = -1;
		} else {
			arg0.anInt2085 = local12.method7276();
			arg0.anInt2086 = local12.method7279();
			arg0.anInt2092 = local12.method7278();
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIIII)V")
	public static void method5831(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static313.anInt4087 / (float) Static313.anInt4095;
		@Pc(11) int local11 = arg3;
		@Pc(13) int local13 = arg1;
		if (local9 < 1.0F) {
			local13 = (int) (local9 * (float) arg3);
		} else {
			local11 = (int) ((float) arg1 / local9);
		}
		@Pc(40) int local40 = arg2 - (arg3 - local11) / 2;
		@Pc(48) int local48 = arg0 - (arg1 - local13) / 2;
		Static222.anInt1235 = local40 * Static313.anInt4095 / local11;
		Static536.anInt8850 = Static313.anInt4087 - local48 * Static313.anInt4087 / local13;
		Static582.anInt9419 = -1;
		Static248.anInt4641 = -1;
		Static341.method5077();
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!ij;")
	public static RuntimeException_Sub1 method5832(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString42 = local12.aString42 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILclient!hca;I)V")
	public static void method5833(@OriginalArg(0) int arg0, @OriginalArg(1) Class131 arg1) {
		if (Static113.anInt2286 >= 50 || (arg1 == null || arg1.anIntArrayArray25 == null || arg1.anIntArrayArray25.length <= arg0 || arg1.anIntArrayArray25[arg0] == null)) {
			return;
		}
		@Pc(30) int local30 = arg1.anIntArrayArray25[arg0][0];
		@Pc(34) int local34 = local30 >> 8;
		@Pc(40) int local40 = local30 >> 5 & 0x7;
		if (arg1.anIntArrayArray25[arg0].length > 1) {
			@Pc(59) int local59 = (int) (Math.random() * (double) arg1.anIntArrayArray25[arg0].length);
			if (local59 > 0) {
				local34 = arg1.anIntArrayArray25[arg0][local59];
			}
		}
		if (arg1.aBoolean305) {
			Static291.method4575(local34, 0, local40, 255, false);
		} else {
			Static364.method5314(local40, local34, 255, 0);
		}
	}
}
