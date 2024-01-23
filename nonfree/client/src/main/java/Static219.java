import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!po", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString327 = " is already on your ignore list.";

	@OriginalMember(owner = "client!po", name = "c", descriptor = "[I")
	public static int[] anIntArray429 = new int[4];

	@OriginalMember(owner = "client!po", name = "e", descriptor = "[J")
	public static long[] aLongArray8 = new long[32];

	@OriginalMember(owner = "client!po", name = "h", descriptor = "I")
	public static int anInt4682 = 1;

	@OriginalMember(owner = "client!po", name = "i", descriptor = "Lclient!jl;")
	public static Class89 aClass89_34 = new Class89(64);

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(I)V")
	public static void method3467() {
		Static289.aClass89_47.method2266();
	}

	@OriginalMember(owner = "client!po", name = "c", descriptor = "(I)[Lclient!ml;")
	public static Class1_Sub3_Sub13[] method3468() {
		@Pc(4) Class1_Sub3_Sub13[] local4 = new Class1_Sub3_Sub13[Static165.anInt3668];
		for (@Pc(10) int local10 = 0; local10 < Static165.anInt3668; local10++) {
			@Pc(21) byte[] local21 = Static34.aByteArrayArray5[local10];
			@Pc(29) int local29 = Static50.anIntArray22[local10] * Static95.anIntArray212[local10];
			@Pc(32) int[] local32 = new int[local29];
			for (@Pc(34) int local34 = 0; local34 < local29; local34++) {
				local32[local34] = Static234.anIntArray454[local21[local34] & 0xFF];
			}
			if (Static294.aBoolean367) {
				local4[local10] = new Class1_Sub3_Sub13_Sub1(Static300.anInt5957, Static295.anInt5893, Static250.anIntArray469[local10], Static137.anIntArray227[local10], Static95.anIntArray212[local10], Static50.anIntArray22[local10], local32);
			} else {
				local4[local10] = new Class1_Sub3_Sub13_Sub2(Static300.anInt5957, Static295.anInt5893, Static250.anIntArray469[local10], Static137.anIntArray227[local10], Static95.anIntArray212[local10], Static50.anIntArray22[local10], local32);
			}
		}
		Static20.method432();
		return local4;
	}
}
