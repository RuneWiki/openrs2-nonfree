import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static558 {

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "I")
	public static int anInt9099;

	@OriginalMember(owner = "client!ts", name = "e", descriptor = "Lclient!sv;")
	public static Class326 aClass326_10;

	@OriginalMember(owner = "client!ts", name = "o", descriptor = "I")
	public static int anInt9109 = -1;

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(FFIIBIIFLclient!gaa;FFII[B)V")
	public static void method7639(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) float arg4, @OriginalArg(8) Class115 arg5, @OriginalArg(9) float arg6, @OriginalArg(10) float arg7, @OriginalArg(13) byte[] arg8) {
		@Pc(16) float[] local16 = new float[16384];
		@Pc(22) int local22;
		@Pc(56) int local56;
		for (@Pc(18) int local18 = 0; local18 < 8; local18++) {
			local22 = arg3;
			arg5.method8452(arg6 * 127.0F, arg7 / (float) 128, arg1 / (float) 128, arg0 / (float) 16, 0, local16, arg2);
			arg0 *= 2.0F;
			arg7 *= 2.0F;
			for (local56 = 0; local56 < 16384; local56++) {
				arg8[local22] = (byte) ((float) arg8[local22] + local16[local56]);
				local22++;
			}
			arg6 *= arg4;
			arg1 *= 2.0F;
		}
		local22 = arg3;
		for (local56 = 0; local56 < 16384; local56++) {
			arg8[local22] -= -127;
			local22++;
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)V")
	public static void method7640() {
		Static234.aClass2_Sub5_48.method176(1, Static234.aClass2_Sub5_48.aClass6_Sub13_2);
		Static234.aClass2_Sub5_48.method176(1, Static234.aClass2_Sub5_48.aClass6_Sub13_1);
		Static234.aClass2_Sub5_48.method176(2, Static234.aClass2_Sub5_48.aClass6_Sub18_1);
		Static234.aClass2_Sub5_48.method176(2, Static234.aClass2_Sub5_48.aClass6_Sub18_2);
		Static234.aClass2_Sub5_48.method176(1, Static234.aClass2_Sub5_48.aClass6_Sub4_1);
		Static234.aClass2_Sub5_48.method176(1, Static234.aClass2_Sub5_48.aClass6_Sub10_1);
		Static234.aClass2_Sub5_48.method176(1, Static234.aClass2_Sub5_48.aClass6_Sub12_1);
		Static234.aClass2_Sub5_48.method176(1, Static234.aClass2_Sub5_48.aClass6_Sub16_1);
		Static234.aClass2_Sub5_48.method176(1, Static234.aClass2_Sub5_48.aClass6_Sub23_1);
		Static234.aClass2_Sub5_48.method176(2, Static234.aClass2_Sub5_48.aClass6_Sub24_1);
		Static234.aClass2_Sub5_48.method176(1, Static234.aClass2_Sub5_48.aClass6_Sub25_1);
		Static234.aClass2_Sub5_48.method176(1, Static234.aClass2_Sub5_48.aClass6_Sub17_1);
		Static234.aClass2_Sub5_48.method176(2, Static234.aClass2_Sub5_48.aClass6_Sub15_1);
		Static234.aClass2_Sub5_48.method176(1, Static234.aClass2_Sub5_48.aClass6_Sub6_1);
		Static234.aClass2_Sub5_48.method176(0, Static234.aClass2_Sub5_48.aClass6_Sub11_1);
		Static234.aClass2_Sub5_48.method176(0, Static234.aClass2_Sub5_48.aClass6_Sub11_2);
		Static234.aClass2_Sub5_48.method176(2, Static234.aClass2_Sub5_48.aClass6_Sub19_1);
		Static234.aClass2_Sub5_48.method176(0, Static234.aClass2_Sub5_48.aClass6_Sub9_1);
		Static234.aClass2_Sub5_48.method176(0, Static234.aClass2_Sub5_48.aClass6_Sub8_1);
		Static238.method3337();
		Static234.aClass2_Sub5_48.method176(0, Static234.aClass2_Sub5_48.aClass6_Sub5_1);
		Static234.aClass2_Sub5_48.method176(4, Static234.aClass2_Sub5_48.aClass6_Sub7_1);
		Static45.method741();
		Static249.method3418();
		Static555.aBoolean676 = true;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIB)Z")
	public static boolean method7643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0xC580) != 0;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZIII)I")
	public static int method7644(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub8 local8 = Static384.method5147(arg1, arg0);
		if (local8 == null) {
			return 0;
		} else if (arg2 >= 0 && local8.anIntArray122.length > arg2) {
			return local8.anIntArray122[arg2];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(BFFF)I")
	public static int method7645(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(12) float local12 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(21) float local21 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(30) float local30 = arg0 < 0.0F ? -arg0 : arg0;
		if (local12 < local21 && local21 > local30) {
			return arg2 > 0.0F ? 0 : 1;
		} else if (local30 > local12 && local30 > local21) {
			return arg0 > 0.0F ? 2 : 3;
		} else if (arg1 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "(I)[Lclient!eaa;")
	public static Class80[] method7646() {
		return new Class80[] { Static162.aClass80_2, Static560.aClass80_7, Static449.aClass80_5, Static258.aClass80_4, Static122.aClass80_1, Static548.aClass80_6 };
	}
}
