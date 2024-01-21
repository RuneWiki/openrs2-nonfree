import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
	public static int anInt2675 = 0;

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "Lclient!eh;")
	public static Class28 aClass28_851 = Static170.method3101("_");

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "Lclient!eh;")
	public static Class28 aClass28_852 = Static170.method3101("Einloggen");

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!nb", name = "p", descriptor = "Lclient!eh;")
	private static Class28 aClass28_856 = Static170.method3101("You can(Wt add yourself to your own friend list)3");

	@OriginalMember(owner = "client!nb", name = "k", descriptor = "Lclient!eh;")
	public static Class28 aClass28_853 = aClass28_856;

	@OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
	public static final int anInt2677 = 4;

	@OriginalMember(owner = "client!nb", name = "l", descriptor = "[I")
	public static int[] anIntArray469 = new int[anInt2677];

	@OriginalMember(owner = "client!nb", name = "m", descriptor = "Lclient!eh;")
	private static Class28 aClass28_854 = Static170.method3101("The server is being updated)3");

	@OriginalMember(owner = "client!nb", name = "n", descriptor = "[[Lclient!pg;")
	public static Class65[][] aClass65ArrayArray1 = new Class65[anInt2677][500];

	@OriginalMember(owner = "client!nb", name = "o", descriptor = "Lclient!eh;")
	public static Class28 aClass28_855 = aClass28_854;

	@OriginalMember(owner = "client!nb", name = "q", descriptor = "Lclient!eh;")
	public static Class28 aClass28_857 = Static170.method3101("VOLL");

	@OriginalMember(owner = "client!nb", name = "s", descriptor = "Lclient!eh;")
	public static Class28 aClass28_858 = Static170.method3101("<)4col> x");

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
	public static void method2119() {
		aClass28_858 = null;
		aClass28_853 = null;
		aClass28_857 = null;
		aCRC32_2 = null;
		aClass28_851 = null;
		aClass28_856 = null;
		aClass28_854 = null;
		aClass28_855 = null;
		aClass65ArrayArray1 = null;
		anIntArray469 = null;
		aClass28_852 = null;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)V")
	public static void method2120() {
		for (@Pc(1) int local1 = 0; local1 < Static7.anInt228; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static90.anInt2564; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static87.anInt2536; local7++) {
					@Pc(16) Class3_Sub20 local16 = Static149.aClass3_Sub20ArrayArrayArray1[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class25 local21 = local16.aClass25_1;
						if (local21 != null && local21.aClass3_Sub2_Sub1_1 instanceof Class3_Sub2_Sub1_Sub4) {
							@Pc(31) Class3_Sub2_Sub1_Sub4 local31 = (Class3_Sub2_Sub1_Sub4) local21.aClass3_Sub2_Sub1_1;
							Static172.method3133(local31, local1, local4, local7, 1, 1);
							if (local21.aClass3_Sub2_Sub1_2 instanceof Class3_Sub2_Sub1_Sub4) {
								@Pc(46) Class3_Sub2_Sub1_Sub4 local46 = (Class3_Sub2_Sub1_Sub4) local21.aClass3_Sub2_Sub1_2;
								Static172.method3133(local46, local1, local4, local7, 1, 1);
								Static89.method2030(local31, local46, 0, 0, 0, false);
								local21.aClass3_Sub2_Sub1_2 = local46.method2041(local46.aShort33, local46.aShort32, -50, -10, -50, false);
							}
							local21.aClass3_Sub2_Sub1_1 = local31.method2041(local31.aShort33, local31.aShort32, -50, -10, -50, false);
						}
						@Pc(104) Class3_Sub2_Sub1_Sub4 local104;
						for (@Pc(88) int local88 = 0; local88 < local16.anInt3336; local88++) {
							@Pc(94) Class32 local94 = local16.aClass32Array3[local88];
							if (local94 != null && local94.aClass3_Sub2_Sub1_3 instanceof Class3_Sub2_Sub1_Sub4) {
								local104 = (Class3_Sub2_Sub1_Sub4) local94.aClass3_Sub2_Sub1_3;
								Static172.method3133(local104, local1, local4, local7, local94.anInt1439 + 1 - local94.anInt1450, local94.anInt1447 - local94.anInt1449 + 1);
								local94.aClass3_Sub2_Sub1_3 = local104.method2041(local104.aShort33, local104.aShort32, -50, -10, -50, false);
							}
						}
						@Pc(144) Class84 local144 = local16.aClass84_1;
						if (local144 != null && local144.aClass3_Sub2_Sub1_9 instanceof Class3_Sub2_Sub1_Sub4) {
							local104 = (Class3_Sub2_Sub1_Sub4) local144.aClass3_Sub2_Sub1_9;
							Static30.method786(local104, local1, local4, local7);
							local144.aClass3_Sub2_Sub1_9 = local104.method2041(local104.aShort33, local104.aShort32, -50, -10, -50, false);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIIIIIB)V")
	public static void method2121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(1) Class3_Sub25 local1 = null;
		for (@Pc(6) Class3_Sub25 local6 = (Class3_Sub25) Static24.aClass23_3.method858(); local6 != null; local6 = (Class3_Sub25) Static24.aClass23_3.method861()) {
			if (arg6 == local6.anInt4181 && arg2 == local6.anInt4177 && local6.anInt4168 == arg4 && local6.anInt4173 == arg3) {
				local1 = local6;
				break;
			}
		}
		if (local1 == null) {
			local1 = new Class3_Sub25();
			local1.anInt4181 = arg6;
			local1.anInt4173 = arg3;
			local1.anInt4177 = arg2;
			local1.anInt4168 = arg4;
			Static12.method475(local1);
			Static24.aClass23_3.method850(local1);
		}
		local1.anInt4180 = arg1;
		local1.anInt4179 = arg5;
		local1.anInt4171 = arg8;
		local1.anInt4170 = arg7;
		local1.anInt4182 = arg0;
	}
}
