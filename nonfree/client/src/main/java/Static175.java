import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!mm", name = "I", descriptor = "I")
	public static int anInt3410;

	@OriginalMember(owner = "client!mm", name = "N", descriptor = "I")
	public static int anInt3414;

	@OriginalMember(owner = "client!mm", name = "O", descriptor = "Lclient!lj;")
	public static Class1_Sub5_Sub6 aClass1_Sub5_Sub6_7;

	@OriginalMember(owner = "client!mm", name = "P", descriptor = "I")
	public static int anInt3415;

	@OriginalMember(owner = "client!mm", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString111 = "glow3:";

	@OriginalMember(owner = "client!mm", name = "L", descriptor = "[Lclient!sb;")
	public static Class152[] aClass152Array1 = new Class152[14];

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIIZ)V")
	public static void method2997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static19.method322(arg1)) {
			Static102.method1974(arg3, -1, Static176.aClass157ArrayArray1[arg1], arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "(I)Lclient!lj;")
	public static Class1_Sub5_Sub6 method2998() {
		@Pc(17) int local17 = Static206.anIntArray419[0] * Static69.anIntArray119[0];
		@Pc(24) int[] local24 = new int[local17];
		@Pc(28) byte[] local28 = Static25.aByteArrayArray19[0];
		for (@Pc(30) int local30 = 0; local30 < local17; local30++) {
			local24[local30] = Static5.anIntArray17[local28[local30] & 0xFF];
		}
		@Pc(67) Class1_Sub5_Sub6 local67;
		if (Static71.aBoolean165) {
			local67 = new Class1_Sub5_Sub6_Sub2(Static94.anInt1976, Static222.anInt4184, Static192.anIntArray398[0], Static173.anIntArray353[0], Static69.anIntArray119[0], Static206.anIntArray419[0], local24);
		} else {
			local67 = new Class1_Sub5_Sub6_Sub1(Static94.anInt1976, Static222.anInt4184, Static192.anIntArray398[0], Static173.anIntArray353[0], Static69.anIntArray119[0], Static206.anIntArray419[0], local24);
		}
		Static176.method3009();
		return local67;
	}
}
