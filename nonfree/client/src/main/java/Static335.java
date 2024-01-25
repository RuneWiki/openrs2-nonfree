import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!to", name = "r", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_84 = new Class11(15, 8);

	@OriginalMember(owner = "client!to", name = "x", descriptor = "[Lclient!l;")
	public static final Class141[] aClass141Array1 = new Class141[8];

	@OriginalMember(owner = "client!to", name = "y", descriptor = "[I")
	public static final int[] anIntArray1167 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!to", name = "z", descriptor = "I")
	public static int anInt5738 = 0;

	@OriginalMember(owner = "client!to", name = "A", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_125 = new Class205(74, 10);

	@OriginalMember(owner = "client!to", name = "B", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_126 = new Class205(59, 1);

	@OriginalMember(owner = "client!to", name = "C", descriptor = "[I")
	public static final int[] anIntArray1168 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!to", name = "a", descriptor = "([[IB)V")
	public static void method4943(@OriginalArg(0) int[][] arg0) {
		Static15.anIntArrayArray1 = arg0;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIII)V")
	public static void method4944(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class251 local7 = Static64.aClass251ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class1_Sub2 local13 = local7.aClass1_Sub2_2;
		@Pc(16) Class1_Sub2 local16 = local7.aClass1_Sub2_3;
		if (local13 != null) {
			local13.anInt6258 = local13.anInt6258 * arg3 / 16;
			local13.anInt6266 = local13.anInt6266 * arg3 / 16;
		}
		if (local16 != null) {
			local16.anInt6258 = local16.anInt6258 * arg3 / 16;
			local16.anInt6266 = local16.anInt6266 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(III)V")
	public static void method4945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static64.aClass251ArrayArrayArray1[0][arg1][arg2] != null && Static64.aClass251ArrayArrayArray1[0][arg1][arg2].aClass251_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static64.aClass251ArrayArrayArray1[local22][arg1][arg2] == null) {
				@Pc(46) Class251 local46 = Static64.aClass251ArrayArrayArray1[local22][arg1][arg2] = new Class251(local22, arg1, arg2);
				if (local20) {
					local46.aByte71++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "e", descriptor = "(I)V")
	public static void method4947() {
		try {
			@Pc(16) Method local16 = Runtime.class.getMethod("availableProcessors");
			if (local16 != null) {
				try {
					@Pc(20) Runtime local20 = Runtime.getRuntime();
					@Pc(26) Integer local26 = (Integer) local16.invoke(local20, (Object[]) null);
					Static168.anInt3226 = local26;
				} catch (@Pc(31) Throwable local31) {
				}
			}
		} catch (@Pc(42) Exception local42) {
		}
	}

	@OriginalMember(owner = "client!to", name = "f", descriptor = "(I)Lclient!id;")
	public static Class2_Sub23 method4948() {
		if (Static338.aClass30_23 == null || Static21.aClass83_1 == null) {
			return null;
		}
		Static21.aClass83_1.method2275(Static338.aClass30_23);
		@Pc(25) Class2_Sub23 local25 = (Class2_Sub23) Static21.aClass83_1.method2274();
		if (local25 == null) {
			return null;
		} else {
			@Pc(35) Class243 local35 = Static338.aClass226_3.method4913(local25.anInt2801);
			return local35 != null && local35.aBoolean452 && local35.method5525(Static338.anInterface8_2) ? local25 : Static242.method4242();
		}
	}
}
