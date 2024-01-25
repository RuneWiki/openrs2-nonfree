import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!ima", name = "a", descriptor = "[[Lclient!av;")
	public static Class20[][] aClass20ArrayArray1;

	@OriginalMember(owner = "client!ima", name = "b", descriptor = "I")
	public static int anInt5117;

	@OriginalMember(owner = "client!ima", name = "g", descriptor = "I")
	public static int anInt5114 = 0;

	@OriginalMember(owner = "client!ima", name = "a", descriptor = "(B[[S[[F)[[S")
	public static short[][] method4254(@OriginalArg(1) short[][] arg0, @OriginalArg(2) float[][] arg1) {
		for (@Pc(10) int local10 = 0; local10 < arg1.length; local10++) {
			for (@Pc(16) int local16 = 0; local16 < arg0[local10].length; local16++) {
				arg0[local10][local16] = (short) (int) (arg1[local10][local16] * 16383.0F);
			}
		}
		anInt5117++;
		return arg0;
	}

	@OriginalMember(owner = "client!ima", name = "b", descriptor = "(I)V")
	public static void method4255() {
		@Pc(8) Class3_Sub28_Sub2 local8 = Static532.aClass400_3.aClass3_Sub28_Sub2_2;
		Static231.anInt4426 = local8.method5308();
		@Pc(16) int local16 = local8.method5305();
		@Pc(28) boolean local28 = local8.method5334() == 1;
		@Pc(32) int local32 = local8.method5293();
		@Pc(36) int local36 = local8.method5301();
		Static235.method3668();
		Static58.method725(local32, -100);
		local8.method5343();
		@Pc(52) int local52;
		@Pc(56) int local56;
		@Pc(65) int local65;
		for (@Pc(48) int local48 = 0; local48 < 4; local48++) {
			for (local52 = 0; local52 < Static362.anInt8653 >> 3; local52++) {
				for (local56 = 0; local56 < Static206.anInt11291 >> 3; local56++) {
					local65 = local8.method5344(1);
					if (local65 == 1) {
						Static486.anIntArrayArrayArray6[local48][local52][local56] = local8.method5344(26);
					} else {
						Static486.anIntArrayArrayArray6[local48][local52][local56] = -1;
					}
				}
			}
		}
		local8.method5346();
		local52 = (Static532.aClass400_3.anInt11061 - local8.anInt6241) / 16;
		Static101.anIntArrayArray10 = new int[local52][4];
		for (local56 = 0; local56 < local52; local56++) {
			for (local65 = 0; local65 < 4; local65++) {
				Static101.anIntArrayArray10[local56][local65] = local8.method5312();
			}
		}
		Static484.aByteArrayArray13 = new byte[local52][];
		Static23.anIntArray13 = new int[local52];
		Static423.aByteArrayArray9 = new byte[local52][];
		Static551.aByteArrayArray18 = null;
		Static74.aByteArrayArray2 = new byte[local52][];
		Static504.anIntArray469 = new int[local52];
		if (255 != 255) {
			aClass20ArrayArray1 = null;
		}
		Static257.aByteArrayArray8 = new byte[local52][];
		Static423.anIntArray399 = null;
		Static83.anIntArray86 = new int[local52];
		Static46.anIntArray54 = new int[local52];
		Static718.anIntArray638 = new int[local52];
		local52 = 0;
		for (local65 = 0; local65 < 4; local65++) {
			for (@Pc(227) int local227 = 0; local227 < Static362.anInt8653 >> 3; local227++) {
				for (@Pc(231) int local231 = 0; local231 < Static206.anInt11291 >> 3; local231++) {
					@Pc(241) int local241 = Static486.anIntArrayArrayArray6[local65][local227][local231];
					if (local241 != -1) {
						@Pc(250) int local250 = local241 >> 14 & 0x3FF;
						@Pc(256) int local256 = local241 >> 3 & 0x7FF;
						@Pc(266) int local266 = (local250 / 8 << 8) + local256 / 8;
						for (@Pc(268) int local268 = 0; local268 < local52; local268++) {
							if (Static46.anIntArray54[local268] == local266) {
								local266 = -1;
								break;
							}
						}
						if (local266 != -1) {
							Static46.anIntArray54[local52] = local266;
							@Pc(313) int local313 = local266 >> 8 & 0xFF;
							@Pc(317) int local317 = local266 & 0xFF;
							Static718.anIntArray638[local52] = Static397.aClass221_113.method5096("m" + local313 + "_" + local317);
							Static504.anIntArray469[local52] = Static397.aClass221_113.method5096("l" + local313 + "_" + local317);
							Static23.anIntArray13[local52] = Static397.aClass221_113.method5096("um" + local313 + "_" + local317);
							Static83.anIntArray86[local52] = Static397.aClass221_113.method5096("ul" + local313 + "_" + local317);
							local52++;
						}
					}
				}
			}
		}
		Static524.method7459(local16, local28, local36, 12);
	}
}
