import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
	public static int anInt5526;

	@OriginalMember(owner = "client!rh", name = "p", descriptor = "I")
	public static int anInt5530;

	@OriginalMember(owner = "client!rh", name = "q", descriptor = "[I")
	public static int[] anIntArray461;

	@OriginalMember(owner = "client!rh", name = "w", descriptor = "Lclient!wo;")
	public static Class216 aClass216_86;

	@OriginalMember(owner = "client!rh", name = "x", descriptor = "I")
	public static int anInt5534;

	@OriginalMember(owner = "client!rh", name = "n", descriptor = "Lclient!hq;")
	public static final Class87 aClass87_48 = new Class87(20);

	@OriginalMember(owner = "client!rh", name = "s", descriptor = "I")
	public static int anInt5532 = 0;

	@OriginalMember(owner = "client!rh", name = "v", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray57 = new String[100];

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)Z")
	public static boolean method4748() {
		return Static63.anInt5669 != 0 || Static342.anInt2998 >= 2;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIII)V")
	public static void method4749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static290.anInt5761 == 1) {
			Static17.aClass5Array2[Static44.anInt1403 / 100].method3621(Static159.anInt3527 - 8, Static311.anInt6069 + -8);
		}
		if (Static290.anInt5761 == 2) {
			Static17.aClass5Array2[Static44.anInt1403 / 100 + 4].method3621(Static159.anInt3527 - 8, Static311.anInt6069 + -8);
		}
		Static228.method4248();
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)V")
	public static void method4750(@OriginalArg(1) int arg0) {
		Static230.anInt4748 = arg0;
		@Pc(7) Class87 local7 = Static306.aClass87_53;
		synchronized (Static306.aClass87_53) {
			Static306.aClass87_53.method2485();
		}
		local7 = Static307.aClass87_54;
		synchronized (Static307.aClass87_54) {
			Static307.aClass87_54.method2485();
		}
	}

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "(I)V")
	public static void method4752() {
		if (Static208.aClass32_11 == null) {
			return;
		}
		Static92.aClass217_8.method5688();
		Static263.method4659();
		Static299.method1010();
		Static345.method5539();
		Static127.method2616();
		Static6.method251();
		if (Static127.aClass212_1 != null) {
			Static127.aClass212_1.method5473();
		}
		Static8.method5005();
		Static334.method5421();
		Static277.method4849();
		Static130.method2653(false);
		Static314.method5205();
		for (@Pc(35) int local35 = 0; local35 < 2048; local35++) {
			@Pc(41) Class17_Sub1_Sub1_Sub1 local41 = Static102.aClass17_Sub1_Sub1_Sub1Array1[local35];
			if (local41 != null) {
				local41.anInterface5_3 = null;
				for (@Pc(48) int local48 = 0; local48 < local41.aClass73Array3.length; local48++) {
					local41.aClass73Array3[local48] = null;
				}
			}
		}
		for (@Pc(67) int local67 = 0; local67 < Static140.aClass17_Sub1_Sub1_Sub2Array1.length; local67++) {
			@Pc(73) Class17_Sub1_Sub1_Sub2 local73 = Static140.aClass17_Sub1_Sub1_Sub2Array1[local67];
			if (local73 != null) {
				for (@Pc(77) int local77 = 0; local77 < local73.aClass73Array3.length; local77++) {
					local73.aClass73Array3[local77] = null;
				}
			}
		}
		Static208.aClass32_11.method2197();
		Static208.aClass32_11 = null;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILclient!wo;)V")
	public static void method4753(@OriginalArg(1) Class216 arg0) {
		Static260.aClass216_87 = arg0;
		Static125.anInt2817 = Static260.aClass216_87.method5675(15);
	}
}
