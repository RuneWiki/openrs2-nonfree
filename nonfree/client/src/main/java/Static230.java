import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
	public static int anInt5095;

	@OriginalMember(owner = "client!ia", name = "m", descriptor = "I")
	public static int anInt5094 = 0;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIII)V")
	public static void method4187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class6_Sub5_Sub19 local8 = Static348.method5721(arg3, 4);
		local8.method5179();
		local8.anInt6195 = arg0;
		local8.anInt6198 = arg2;
		local8.anInt6197 = arg1;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method4188(@OriginalArg(1) String arg0) {
		if (!Static141.aBoolean262 || (Static38.anInt1411 & 0x18) == 0) {
			return;
		}
		@Pc(21) boolean local21 = false;
		@Pc(23) int local23 = Static6.anInt462;
		@Pc(25) int[] local25 = Static551.anIntArray503;
		for (@Pc(27) int local27 = 0; local27 < local23; local27++) {
			@Pc(35) Class9_Sub4_Sub2_Sub1_Sub2 local35 = Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local25[local27]];
			if (local35.aString46 != null && local35.aString46.equalsIgnoreCase(arg0) && (Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1 == local35 && (Static38.anInt1411 & 0x10) != 0 || local35 != null && (Static38.anInt1411 & 0x8) != 0)) {
				@Pc(65) Class6_Sub17 local65 = Static330.method7824(Static300.aClass185_65, Static569.aClass134_2);
				local65.aClass6_Sub8_Sub1_2.method8255(local25[local27]);
				local65.aClass6_Sub8_Sub1_2.method8199(Static541.anInt9362);
				local65.aClass6_Sub8_Sub1_2.method8262(Static350.anInt6854);
				local65.aClass6_Sub8_Sub1_2.method8248(0);
				local65.aClass6_Sub8_Sub1_2.method8199(Static641.anInt10722);
				Static452.method6867(local65);
				Static168.method3192(0, 0, local35.method3620(), -2, local35.anIntArray198[0], local35.anIntArray197[0], true, local35.method3620());
				local21 = true;
				break;
			}
		}
		if (!local21) {
			Static238.method4329(Static536.aClass316_23.method7577(Static638.anInt10709) + arg0);
		}
		if (Static141.aBoolean262) {
			Static516.method7391();
		}
	}
}
