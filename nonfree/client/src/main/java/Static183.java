import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
	public static int anInt3513;

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
	public static int anInt3509 = 0;

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "Lclient!ui;")
	public static Class175 aClass175_28 = new Class175(64);

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "[Lclient!qi;")
	public static Class143[] aClass143Array1 = new Class143[8];

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
	public static int anInt3512 = 0;

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "[I")
	public static int[] anIntArray374 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "[I")
	public static int[] anIntArray375 = new int[14];

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "Lclient!ui;")
	public static Class175 aClass175_29 = new Class175(16);

	@OriginalMember(owner = "client!ne", name = "m", descriptor = "Z")
	public static volatile boolean aBoolean309 = true;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
	public static void method3108() {
		if (Static97.anInt2087 == 10 && Static71.aBoolean165) {
			Static197.method3406(28);
		}
		if (Static97.anInt2087 == 30) {
			Static197.method3406(25);
		}
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)Lclient!le;")
	public static Class1_Sub5_Sub6_Sub1 method3109() {
		@Pc(9) int local9 = Static206.anIntArray419[0] * Static69.anIntArray119[0];
		@Pc(17) byte[] local17 = Static25.aByteArrayArray19[0];
		@Pc(61) Class1_Sub5_Sub6_Sub1 local61;
		if (Static154.aBooleanArray10[0]) {
			@Pc(67) byte[] local67 = Static194.aByteArrayArray15[0];
			@Pc(70) int[] local70 = new int[local9];
			for (@Pc(72) int local72 = 0; local72 < local9; local72++) {
				local70[local72] = Static5.anIntArray17[local17[local72] & 0xFF] | (local67[local72] & 0xFF) << 24;
			}
			local61 = new Class1_Sub5_Sub6_Sub1_Sub1(Static94.anInt1976, Static222.anInt4184, Static192.anIntArray398[0], Static173.anIntArray353[0], Static69.anIntArray119[0], Static206.anIntArray419[0], local70);
		} else {
			@Pc(24) int[] local24 = new int[local9];
			for (@Pc(26) int local26 = 0; local26 < local9; local26++) {
				local24[local26] = Static5.anIntArray17[local17[local26] & 0xFF];
			}
			local61 = new Class1_Sub5_Sub6_Sub1(Static94.anInt1976, Static222.anInt4184, Static192.anIntArray398[0], Static173.anIntArray353[0], Static69.anIntArray119[0], Static206.anIntArray419[0], local24);
		}
		Static176.method3009();
		return local61;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZZII)V")
	public static void method3111(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		Static145.method2518(Static25.aClass4_Sub1Array3.length - 1, arg3, 0, arg0, arg2, arg1);
	}
}
