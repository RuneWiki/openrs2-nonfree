import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!ef", name = "t", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!ef", name = "v", descriptor = "Lclient!tj;")
	public static Class193 aClass193_20;

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
	public static int anInt1882 = 0;

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_105 = new Class159("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray3 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!ef", name = "l", descriptor = "[I")
	public static final int[] anIntArray107 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

	@OriginalMember(owner = "client!ef", name = "r", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_106 = new Class159("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!ef", name = "s", descriptor = "[[B")
	public static final byte[][] aByteArrayArray7 = new byte[1000][];

	@OriginalMember(owner = "client!ef", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString15 = "";

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
	public static void method1714(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(18) Class2_Sub7 local18 = new Class2_Sub7();
		local18.anInt5776 = arg4;
		local18.anInt5777 = arg3 + Static199.anInt4137;
		local18.aString61 = arg0;
		local18.anInt5775 = arg2;
		local18.anInt5774 = arg1;
		local18.anInt5778 = arg5;
		Static283.aClass32_10.method844(local18);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)Lclient!mj;")
	public static Class132 method1717(@OriginalArg(1) int arg0) {
		@Pc(5) Class198 local5 = Static86.aClass198_74;
		@Pc(14) Class132 local14;
		synchronized (Static86.aClass198_74) {
			local14 = (Class132) Static86.aClass198_74.method5210((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(35) byte[] local35 = Static6.aClass193_4.method5047(3, arg0);
		local14 = new Class132();
		if (local35 != null) {
			local14.method3731(new Class4_Sub11(local35));
		}
		@Pc(50) Class198 local50 = Static86.aClass198_74;
		synchronized (Static86.aClass198_74) {
			Static86.aClass198_74.method5201(local14, (long) arg0);
			return local14;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZII)V")
	public static void method1718(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			Static274.aClass47_9 = Static344.method2669(arg1, Static141.anInterface3_6, Static300.aCanvas5, Static1.aClass134_7, Static347.anInt6585 * 2);
		} else {
			if (arg0) {
				Static274.aClass47_9 = Static344.method2669(0, Static141.anInterface3_6, Static300.aCanvas5, Static1.aClass134_7, 0);
				Static274.aClass47_9.method2728(0);
				@Pc(32) Class16 local32 = Static48.method959(Static103.aClass193_38, Static281.anInt5557);
				@Pc(41) Class51 local41 = Static274.aClass47_9.method2693(local32, Static362.method3088(Static316.aClass193_99, Static281.anInt5557));
				Static3.method124(true, Static341.aClass159_23.method4311(Static180.anInt3835), local41);
				Static274.aClass47_9.method2756();
				Static12.method241();
				Static274.aClass47_9.method2673();
			}
			try {
				Static274.aClass47_9 = Static344.method2669(arg1, Static141.anInterface3_6, Static300.aCanvas5, Static1.aClass134_7, Static347.anInt6585 * 2);
			} catch (@Pc(68) Throwable local68) {
				arg1 = 0;
				Static274.aClass47_9 = Static344.method2669(0, Static141.anInterface3_6, Static300.aCanvas5, Static1.aClass134_7, 0);
			}
		}
		if (Static274.aClass47_9.method2686()) {
			@Pc(90) Class4_Sub5 local90 = Static274.aClass47_9.method2696();
			Static274.aClass47_9.method2674(local90);
		}
		Static225.anInt4568 = arg1;
		Static73.method1854();
		if (!Static274.aClass47_9.method2680()) {
			Static142.anInt3231 = 1;
		}
		Static274.aClass47_9.method2738(Static142.anInt3231);
		Static274.aClass47_9.method2744(0);
		Static288.aClass57_6 = Static274.aClass47_9.method2705();
		Static281.aClass57_4 = Static274.aClass47_9.method2705();
		@Pc(128) int local128 = (int) ((double) Static350.anInt6637 * 34.46D);
		if (Static274.aClass47_9.method2736()) {
			local128 += 128;
		}
		Static274.aClass47_9.method2655(50, local128);
		Static274.aClass47_9.method2676(!Static166.aBoolean285);
		if (Static274.aClass47_9.method2731()) {
			Static31.method553(Static306.aBoolean438);
		}
		Static103.aBoolean185 = !Static76.method1750();
		Static142.method2955(Static274.aClass47_9, Static105.anInt2647 >> 3, Static350.anInt6637 >> 3);
		Static244.method4316();
		Static313.aBoolean449 = false;
	}
}
