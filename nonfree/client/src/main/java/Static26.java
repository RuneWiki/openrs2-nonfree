import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!cf", name = "u", descriptor = "Lclient!ua;")
	public static Class77 aClass77_1;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "Z")
	public static boolean aBoolean29 = false;

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "Lclient!rf;")
	public static Class70 aClass70_245 = Static49.method1293("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "Lclient!fc;")
	public static Class25 aClass25_3 = new Class25(100);

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "[Z")
	public static boolean[] aBooleanArray3 = new boolean[100];

	@OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
	public static int anInt708 = 1;

	@OriginalMember(owner = "client!cf", name = "o", descriptor = "[I")
	public static int[] anIntArray46 = new int[2048];

	@OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
	public static int anInt709 = 0;

	@OriginalMember(owner = "client!cf", name = "q", descriptor = "Lclient!rf;")
	public static Class70 aClass70_246 = Static49.method1293("Fertigkeit)2");

	@OriginalMember(owner = "client!cf", name = "r", descriptor = "Lclient!rf;")
	public static Class70 aClass70_247 = Static49.method1293("titlebox");

	@OriginalMember(owner = "client!cf", name = "s", descriptor = "[I")
	public static int[] anIntArray47 = new int[4000];

	@OriginalMember(owner = "client!cf", name = "t", descriptor = "Lclient!rf;")
	public static Class70 aClass70_248 = Static49.method1293("<img=0>");

	@OriginalMember(owner = "client!cf", name = "v", descriptor = "Lclient!rf;")
	private static Class70 aClass70_249 = Static49.method1293(" more options");

	@OriginalMember(owner = "client!cf", name = "w", descriptor = "Lclient!rf;")
	public static Class70 aClass70_250 = aClass70_249;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
	public static void method550() {
		aClass70_247 = null;
		aClass25_3 = null;
		aClass70_245 = null;
		aClass70_250 = null;
		aBooleanArray3 = null;
		aClass70_248 = null;
		anIntArray46 = null;
		anIntArray47 = null;
		aClass70_249 = null;
		aClass77_1 = null;
		aClass70_246 = null;
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
	public static void method551() {
		@Pc(5) int local5 = Static124.aClass1_Sub1_Sub1_Sub2_Sub1_5.method2374(Static41.aClass70_455);
		@Pc(15) int local15;
		for (@Pc(7) int local7 = 0; local7 < Static162.anInt4331; local7++) {
			local15 = Static124.aClass1_Sub1_Sub1_Sub2_Sub1_5.method2374(Static158.method3173(local7));
			if (local15 > local5) {
				local5 = local15;
			}
		}
		Static3.anInt150 = Static162.anInt4331 * 15 + 22;
		local5 += 8;
		Static32.aBoolean47 = true;
		Static170.anInt4398 = local5;
		local15 = Static162.anInt4331 * 15 + 21;
		@Pc(60) int local60 = Static170.anInt4392 - local5 / 2;
		@Pc(62) int local62 = Static15.anInt450;
		if (local62 + local15 > 503) {
			local62 = 503 - local15;
		}
		if (local62 < 0) {
			local62 = 0;
		}
		if (local5 + local60 > 765) {
			local60 = 765 - local5;
		}
		if (local60 < 0) {
			local60 = 0;
		}
		Static110.anInt3091 = local60;
		Static18.anInt481 = local62;
	}

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)V")
	public static void method552() {
		if (!Static167.aBoolean170) {
			return;
		}
		@Pc(15) Class39 local15 = Static44.method1103(Static161.anInt4210, Static110.anInt3092);
		if (local15 != null && local15.anObjectArray3 != null) {
			@Pc(24) Class1_Sub19 local24 = new Class1_Sub19();
			local24.anObjectArray27 = local15.anObjectArray3;
			local24.aClass39_31 = local15;
			Static60.method1460(local24);
		}
		Static167.aBoolean170 = false;
		Static171.method3407(local15);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIILjava/awt/Component;Lclient!gg;)Lclient!ta;")
	public static Class2 method553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) Class32 arg3) {
		if (Static166.anInt4307 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(31) Class2 local31 = (Class2) Class.forName("Class2_Sub1").getDeclaredConstructor().newInstance();
			local31.anIntArray253 = new int[(Static9.aBoolean13 ? 2 : 1) * 256];
			local31.anInt2683 = arg0;
			local31.method1985(arg2);
			local31.anInt2679 = (arg0 & 0xFFFFFC00) + 1024;
			if (local31.anInt2679 > 16384) {
				local31.anInt2679 = 16384;
			}
			local31.method1983(local31.anInt2679);
			if (Static136.anInt3563 > 0 && Static67.aClass15_1 == null) {
				Static67.aClass15_1 = new Class15();
				Static67.aClass15_1.aClass32_2 = arg3;
				arg3.method1483(Static136.anInt3563, Static67.aClass15_1);
			}
			if (Static67.aClass15_1 != null) {
				if (Static67.aClass15_1.aClass2Array1[arg1] != null) {
					throw new IllegalArgumentException();
				}
				Static67.aClass15_1.aClass2Array1[arg1] = local31;
			}
			return local31;
		} catch (@Pc(111) Throwable local111) {
			try {
				@Pc(117) Class2_Sub2 local117 = new Class2_Sub2(arg3, arg1);
				local117.anIntArray253 = new int[(Static9.aBoolean13 ? 2 : 1) * 256];
				local117.anInt2683 = arg0;
				local117.method1985(arg2);
				local117.anInt2679 = 16384;
				local117.method1983(local117.anInt2679);
				if (Static136.anInt3563 > 0 && Static67.aClass15_1 == null) {
					Static67.aClass15_1 = new Class15();
					Static67.aClass15_1.aClass32_2 = arg3;
					arg3.method1483(Static136.anInt3563, Static67.aClass15_1);
				}
				if (Static67.aClass15_1 != null) {
					if (Static67.aClass15_1.aClass2Array1[arg1] != null) {
						throw new IllegalArgumentException();
					}
					Static67.aClass15_1.aClass2Array1[arg1] = local117;
				}
				return local117;
			} catch (@Pc(179) Throwable local179) {
				return new Class2();
			}
		}
	}
}
