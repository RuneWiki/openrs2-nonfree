import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!eb", name = "db", descriptor = "I")
	public static int anInt1376;

	@OriginalMember(owner = "client!eb", name = "S", descriptor = "Lclient!og;")
	public static final Class2_Sub3 aClass2_Sub3_1 = new Class2_Sub3(new byte[5000]);

	@OriginalMember(owner = "client!eb", name = "Y", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_318 = Static158.method3034("auf der Hautpseite)3");

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(Z)[Lclient!kc;")
	public static Class2_Sub1_Sub7_Sub4[] method973() {
		@Pc(10) Class2_Sub1_Sub7_Sub4[] local10 = new Class2_Sub1_Sub7_Sub4[Static176.anInt4297];
		for (@Pc(16) int local16 = 0; local16 < Static176.anInt4297; local16++) {
			@Pc(22) Class2_Sub1_Sub7_Sub4 local22 = new Class2_Sub1_Sub7_Sub4();
			local22.anInt2696 = Static93.anInt2723;
			local22.anInt2692 = Static175.anInt4257;
			local22.anInt2693 = Static30.anIntArray96[local16];
			local22.anInt2695 = Static30.anIntArray95[local16];
			local22.anInt2694 = Static178.anIntArray468[local16];
			local22.anInt2691 = Static103.anIntArray342[local16];
			@Pc(54) int local54 = local22.anInt2691 * local22.anInt2694;
			@Pc(58) byte[] local58 = Static197.aByteArrayArray10[local16];
			local22.anIntArray310 = new int[local54];
			for (@Pc(64) int local64 = 0; local64 < local54; local64++) {
				local22.anIntArray310[local64] = Static16.anIntArray43[local58[local64] & 0xFF];
			}
			local10[local16] = local22;
		}
		Static81.method1910();
		return local10;
	}
}
