import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!vd", name = "n", descriptor = "[I")
	public static int[] anIntArray341;

	@OriginalMember(owner = "client!vd", name = "p", descriptor = "Lclient!t;")
	public static Class10_Sub1 aClass10_Sub1_20;

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "Z")
	public static boolean aBoolean121 = false;

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "Lclient!cb;")
	public static Class12 aClass12_27 = new Class12(20);

	@OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
	public static int anInt2825 = 0;

	@OriginalMember(owner = "client!vd", name = "o", descriptor = "Lclient!od;")
	public static Class60 aClass60_1110 = Static41.method597("k");

	@OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
	public static int anInt2827 = -1;

	@OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
	public static int anInt2828 = 0;

	@OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
	public static int anInt2829 = 0;

	@OriginalMember(owner = "client!vd", name = "t", descriptor = "Z")
	public static boolean aBoolean122 = false;

	@OriginalMember(owner = "client!vd", name = "u", descriptor = "Lclient!od;")
	public static Class60 aClass60_1111 = Static41.method597("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!vd", name = "v", descriptor = "I")
	public static int anInt2830 = 0;

	@OriginalMember(owner = "client!vd", name = "w", descriptor = "Lclient!od;")
	public static Class60 aClass60_1112 = Static41.method597("mapback");

	@OriginalMember(owner = "client!vd", name = "x", descriptor = "I")
	public static int anInt2831 = 0;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)Lclient!rd;")
	public static Class4_Sub3_Sub6_Sub3 method1933() {
		@Pc(5) Class4_Sub3_Sub6_Sub3 local5 = new Class4_Sub3_Sub6_Sub3();
		local5.anInt2318 = Static29.anIntArray91[0];
		local5.anInt2313 = Static31.anInt910;
		local5.anInt2314 = Static113.anIntArray132[0];
		local5.anInt2315 = Static2.anIntArray1[0];
		local5.anInt2316 = anIntArray341[0];
		@Pc(36) byte[] local36 = Static56.aByteArrayArray7[0];
		@Pc(42) int local42 = local5.anInt2316 * local5.anInt2314;
		local5.anIntArray297 = new int[local42];
		local5.anInt2317 = Static5.anInt70;
		for (@Pc(56) int local56 = 0; local56 < local42; local56++) {
			local5.anIntArray297[local56] = Static75.anIntArray125[local36[local56] & 0xFF];
		}
		Static53.method866();
		return local5;
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)V")
	public static void method1934() {
		aClass60_1110 = null;
		aClass60_1111 = null;
		aClass12_27 = null;
		anIntArray341 = null;
		aClass10_Sub1_20 = null;
		aClass60_1112 = null;
	}
}
