import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!ln", name = "P", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray4;

	@OriginalMember(owner = "client!ln", name = "T", descriptor = "[[I")
	public static int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILclient!vh;)V")
	public static void method3354(@OriginalArg(1) Class2_Sub16_Sub2 arg0) {
		arg0.method5378();
		@Pc(10) int local10 = Static176.anInt3381;
		@Pc(20) Class1_Sub5_Sub1_Sub1 local20 = Static206.aClass1_Sub5_Sub1_Sub1_1 = Static125.aClass1_Sub5_Sub1_Sub1Array1[local10] = new Class1_Sub5_Sub1_Sub1();
		local20.anInt6413 = local10;
		@Pc(28) int local28 = arg0.method5380(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(43) int local43 = local28 >> 14 & 0x3FFF;
		@Pc(47) int local47 = local28 & 0x3FFF;
		local20.anIntArray1324[0] = local43 - Static28.anInt606;
		local20.anInt6390 = (local20.anIntArray1324[0] << 7) + (local20.method5547() << 6);
		local20.anIntArray1323[0] = local47 - Static319.anInt5425;
		local20.anInt6386 = (local20.anIntArray1323[0] << 7) + (local20.method5547() << 6);
		Static382.anInt6523 = local20.aByte69 = local33;
		if (Static43.aClass2_Sub16Array1[local10] != null) {
			local20.method2251(Static43.aClass2_Sub16Array1[local10]);
		}
		Static335.anInt5738 = 0;
		Static242.anIntArray933[Static335.anInt5738++] = local10;
		Static328.aByteArray104[local10] = 0;
		Static365.anInt6198 = 0;
		for (@Pc(128) int local128 = 1; local128 < 2048; local128++) {
			if (local128 != local10) {
				@Pc(142) int local142 = arg0.method5380(18);
				@Pc(146) int local146 = local142 >> 16;
				@Pc(152) int local152 = local142 >> 8 & 0xFF;
				@Pc(156) int local156 = local142 & 0xFF;
				Static77.anIntArray337[local128] = local156 + (local152 << 14) + (local146 << 28);
				Static141.anIntArray582[local128] = 0;
				Static72.anIntArray892[local128] = -1;
				Static294.anIntArray1001[Static365.anInt6198++] = local128;
				Static328.aByteArray104[local128] = 0;
			}
		}
		arg0.method5383();
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(II)V")
	public static void method3356(@OriginalArg(1) int arg0) {
		Static293.anInt6496 = 1000 / arg0;
	}
}
