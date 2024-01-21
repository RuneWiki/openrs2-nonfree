import java.awt.Component;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "Lclient!ga;")
	public static Class20_Sub1 aClass20_Sub1_39;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "Lclient!ec;")
	public static Class22 aClass22_373 = Static60.method1113(")3");

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "Lclient!ja;")
	public static Class33 aClass33_20 = new Class33(100);

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "Lclient!ec;")
	private static Class22 aClass22_374 = Static60.method1113("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "Lclient!ec;")
	public static Class22 aClass22_375 = aClass22_374;

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "Lclient!ec;")
	public static Class22 aClass22_376 = Static60.method1113("p12_full");

	@OriginalMember(owner = "client!jb", name = "m", descriptor = "Lclient!ec;")
	public static Class22 aClass22_377 = Static60.method1113("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

	@OriginalMember(owner = "client!jb", name = "o", descriptor = "Lclient!ec;")
	private static Class22 aClass22_379 = Static60.method1113("No response from server)3");

	@OriginalMember(owner = "client!jb", name = "n", descriptor = "Lclient!ec;")
	public static Class22 aClass22_378 = aClass22_379;

	@OriginalMember(owner = "client!jb", name = "p", descriptor = "Lclient!ec;")
	public static Class22 aClass22_380 = Static60.method1113(")3runescape)3com");

	@OriginalMember(owner = "client!jb", name = "q", descriptor = "Lclient!ec;")
	public static Class22 aClass22_381 = Static60.method1113("<col=c0ff00>");

	@OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
	public static int anInt1498 = 0;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZI)Lclient!ec;")
	public static Class22 method1004(@OriginalArg(1) int arg0) {
		@Pc(12) Class22 local12 = new Class22();
		local12.aByteArray7 = new byte[arg0];
		local12.anInt668 = 0;
		return local12;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V")
	public static void method1005() {
		aBigInteger1 = null;
		aClass22_377 = null;
		aClass22_378 = null;
		aClass33_20 = null;
		aClass22_374 = null;
		aClass22_375 = null;
		aClass20_Sub1_39 = null;
		aClass22_376 = null;
		aClass22_380 = null;
		aClass22_373 = null;
		aClass22_381 = null;
		aClass22_379 = null;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)V")
	public static void method1006(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static24.method396(arg0)) {
			return;
		}
		@Pc(17) Class4_Sub7[] local17 = Static65.aClass4_Sub7ArrayArray1[arg0];
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			@Pc(27) Class4_Sub7 local27 = local17[local19];
			if (local27.anObjectArray26 != null) {
				@Pc(34) Class4_Sub3 local34 = new Class4_Sub3();
				local34.aClass4_Sub7_3 = local27;
				local34.anObjectArray1 = local27.anObjectArray26;
				Static133.method2036(local34);
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!dc;IIBLjava/awt/Component;)Lclient!qc;")
	public static Class15 method1007(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Component arg3) {
		if (Static116.anInt2873 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(36) Class15 local36 = (Class15) Class.forName("Class15_Sub2").getDeclaredConstructor().newInstance();
			local36.anInt1945 = arg2;
			local36.anIntArray197 = new int[(Static48.aBoolean123 ? 2 : 1) * 256];
			local36.method1194(arg3);
			local36.anInt1946 = (arg2 & 0xFFFFFC00) + 1024;
			if (local36.anInt1946 > 16384) {
				local36.anInt1946 = 16384;
			}
			local36.method1195(local36.anInt1946);
			if (Static28.anInt649 > 0 && Static110.aClass18_1 == null) {
				Static110.aClass18_1 = new Class18();
				Static110.aClass18_1.aClass17_2 = arg0;
				arg0.method383(Static28.anInt649, Static110.aClass18_1);
			}
			if (Static110.aClass18_1 != null) {
				if (Static110.aClass18_1.aClass15Array1[arg1] != null) {
					throw new IllegalArgumentException();
				}
				Static110.aClass18_1.aClass15Array1[arg1] = local36;
			}
			return local36;
		} catch (@Pc(108) Throwable local108) {
			try {
				@Pc(114) Class15_Sub1 local114 = new Class15_Sub1(arg0, arg1);
				local114.anInt1945 = arg2;
				local114.anIntArray197 = new int[(Static48.aBoolean123 ? 2 : 1) * 256];
				local114.method1194(arg3);
				local114.anInt1946 = 16384;
				local114.method1195(local114.anInt1946);
				if (Static28.anInt649 > 0 && Static110.aClass18_1 == null) {
					Static110.aClass18_1 = new Class18();
					Static110.aClass18_1.aClass17_2 = arg0;
					arg0.method383(Static28.anInt649, Static110.aClass18_1);
				}
				if (Static110.aClass18_1 != null) {
					if (Static110.aClass18_1.aClass15Array1[arg1] != null) {
						throw new IllegalArgumentException();
					}
					Static110.aClass18_1.aClass15Array1[arg1] = local114;
				}
				return local114;
			} catch (@Pc(178) Throwable local178) {
				return new Class15();
			}
		}
	}
}
