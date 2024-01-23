import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!je", name = "p", descriptor = "F")
	public static float aFloat35;

	@OriginalMember(owner = "client!je", name = "w", descriptor = "Lclient!si;")
	public static Class157 aClass157_7;

	@OriginalMember(owner = "client!je", name = "n", descriptor = "I")
	public static int anInt1523 = 0;

	@OriginalMember(owner = "client!je", name = "v", descriptor = "[I")
	public static int[] anIntArray124 = new int[2000];

	@OriginalMember(owner = "client!je", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString55 = "flash2:";

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(B)[Lclient!le;")
	public static Class1_Sub5_Sub6_Sub1[] method1367() {
		@Pc(8) Class1_Sub5_Sub6_Sub1[] local8 = new Class1_Sub5_Sub6_Sub1[Static48.anInt1075];
		for (@Pc(16) int local16 = 0; local16 < Static48.anInt1075; local16++) {
			@Pc(27) int local27 = Static206.anIntArray419[local16] * Static69.anIntArray119[local16];
			@Pc(31) byte[] local31 = Static25.aByteArrayArray19[local16];
			@Pc(34) int[] local34 = new int[local27];
			for (@Pc(36) int local36 = 0; local36 < local27; local36++) {
				local34[local36] = Static5.anIntArray17[local31[local36] & 0xFF];
			}
			local8[local16] = new Class1_Sub5_Sub6_Sub1(Static94.anInt1976, Static222.anInt4184, Static192.anIntArray398[local16], Static173.anIntArray353[local16], Static69.anIntArray119[local16], Static206.anIntArray419[local16], local34);
		}
		Static176.method3009();
		return local8;
	}
}
