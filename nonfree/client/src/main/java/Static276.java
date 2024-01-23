import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!ua", name = "G", descriptor = "Lclient!nm;")
	public static Class119 aClass119_86;

	@OriginalMember(owner = "client!ua", name = "O", descriptor = "I")
	public static int anInt5071;

	@OriginalMember(owner = "client!ua", name = "J", descriptor = "Ljava/lang/String;")
	public static String aString195 = null;

	@OriginalMember(owner = "client!ua", name = "T", descriptor = "I")
	public static volatile int anInt5076 = -1;

	@OriginalMember(owner = "client!ua", name = "bb", descriptor = "[Z")
	public static boolean[] aBooleanArray22 = new boolean[100];

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)Lclient!oh;")
	public static Class57 method4230() {
		@Pc(31) Class57 local31;
		if (Static71.aBoolean165) {
			local31 = new Class57_Sub2(Static94.anInt1976, Static222.anInt4184, Static192.anIntArray398[0], Static173.anIntArray353[0], Static69.anIntArray119[0], Static206.anIntArray419[0], Static25.aByteArrayArray19[0], Static5.anIntArray17);
		} else {
			local31 = new Class57_Sub1(Static94.anInt1976, Static222.anInt4184, Static192.anIntArray398[0], Static173.anIntArray353[0], Static69.anIntArray119[0], Static206.anIntArray419[0], Static25.aByteArrayArray19[0], Static5.anIntArray17);
		}
		Static176.method3009();
		return local31;
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)V")
	public static void method4233(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub5_Sub21 local8 = Static278.method4266(1, arg0);
		local8.method4064();
	}

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "(B)V")
	public static void method4234() {
		Static203.method2967();
		for (@Pc(16) int local16 = 0; local16 < 4; local16++) {
			Static122.aClass60Array1[local16].method1700();
		}
		System.gc();
	}

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "(I)V")
	public static void method4235() {
		Static273.aClass175_41.method4294();
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!fh;B)V")
	public static void method4236(@OriginalArg(0) Class1_Sub13 arg0) {
		@Pc(11) int local11 = arg0.method1830();
		Static174.aClass145Array4 = new Class145[local11];
		@Pc(20) int local20;
		for (local20 = 0; local20 < local11; local20++) {
			Static174.aClass145Array4[local20] = new Class145();
			Static174.aClass145Array4[local20].anInt4466 = arg0.method1830();
			Static174.aClass145Array4[local20].aString158 = arg0.method1859();
		}
		Static310.anInt5535 = arg0.method1830();
		Static103.anInt2199 = arg0.method1830();
		Static21.anInt448 = arg0.method1830();
		Static314.aClass4_Sub1Array4 = new Class4_Sub1[Static103.anInt2199 + 1 - Static310.anInt5535];
		for (local20 = 0; local20 < Static21.anInt448; local20++) {
			@Pc(89) int local89 = arg0.method1830();
			@Pc(97) Class4_Sub1 local97 = Static314.aClass4_Sub1Array4[local89] = new Class4_Sub1();
			local97.anInt196 = arg0.method1853();
			local97.anInt193 = arg0.method1860();
			local97.anInt208 = Static310.anInt5535 + local89;
			local97.aString5 = arg0.method1859();
			local97.aString4 = arg0.method1859();
		}
		Static280.anInt5135 = arg0.method1860();
		Static179.aBoolean302 = true;
	}
}
