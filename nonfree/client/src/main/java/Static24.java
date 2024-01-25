import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!bh", name = "p", descriptor = "Lclient!na;")
	public static Class137 aClass137_1;

	@OriginalMember(owner = "client!bh", name = "w", descriptor = "Z")
	public static boolean aBoolean37;

	@OriginalMember(owner = "client!bh", name = "y", descriptor = "[[[Lclient!ls;")
	public static Class128[][][] aClass128ArrayArrayArray2;

	@OriginalMember(owner = "client!bh", name = "z", descriptor = "I")
	public static int anInt496;

	@OriginalMember(owner = "client!bh", name = "t", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_39 = new Class159("purple:", "lila:", "violet:", "roxo:");

	@OriginalMember(owner = "client!bh", name = "v", descriptor = "I")
	public static int anInt495 = 13156520;

	@OriginalMember(owner = "client!bh", name = "x", descriptor = "Lclient!ub;")
	public static Class198 aClass198_22 = new Class198(64);

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!lf;I)Lclient!fe;")
	public static Class65 method399(@OriginalArg(0) Class4_Sub11 arg0) {
		@Pc(7) Class65 local7 = new Class65();
		local7.anInt2395 = arg0.method3401();
		local7.aClass4_Sub4_Sub16_1 = Static318.method5246(local7.anInt2395);
		return local7;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "([Ljava/lang/Object;I[J)V")
	public static void method401(@OriginalArg(0) Object[] arg0, @OriginalArg(2) long[] arg1) {
		Static91.method5019(0, arg0, arg1.length - 1, arg1);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIII)V")
	public static void method402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = arg0 * Static26.anInt577 >> 8;
		if (local5 != 0 && arg1 != -1) {
			Static32.method558(arg1, Static210.aClass193_76, local5);
			Static74.aBoolean135 = true;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIII)V")
	public static void method403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static292.anInt5680 == 0 || arg2 == 0 || Static187.anInt3921 >= 50 || arg3 == -1) {
			return;
		}
		Static318.anIntArray482[Static187.anInt3921] = arg3;
		Static357.anIntArray514[Static187.anInt3921] = arg2;
		Static63.anIntArray95[Static187.anInt3921] = arg0;
		Static249.aClass152Array1[Static187.anInt3921] = null;
		Static276.anIntArray448[Static187.anInt3921] = 0;
		Static37.anIntArray45[Static187.anInt3921] = arg1;
		Static187.anInt3921++;
	}
}
