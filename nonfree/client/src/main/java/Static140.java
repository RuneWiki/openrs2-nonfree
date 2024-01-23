import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!ka", name = "L", descriptor = "[Lclient!t;")
	public static Class165[] aClass165Array1;

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "I")
	public static int anInt2709 = 0;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!rn;II)Lclient!qn;")
	public static Class3_Sub4_Sub12_Sub2 method2389(@OriginalArg(0) Class155 arg0, @OriginalArg(2) int arg1) {
		return Static287.method4736(arg1, arg0) ? Static183.method3085() : null;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!rn;B)V")
	public static void method2390(@OriginalArg(0) Class155 arg0) {
		Static59.aClass81_Sub2Array1 = Static254.method4305(arg0, Static129.anInt2459);
		Static152.anIntArray330 = new int[256];
		@Pc(15) int local15;
		for (local15 = 0; local15 < 3; local15++) {
			@Pc(27) float local27 = (float) (Static58.anIntArray103[local15] >> 16 & 0xFF);
			@Pc(37) int local37 = Static58.anIntArray103[local15 + 1] >> 16 & 0xFF;
			@Pc(44) float local44 = ((float) local37 - local27) / 64.0F;
			@Pc(53) float local53 = (float) (Static58.anIntArray103[local15] >> 8 & 0xFF);
			@Pc(63) int local63 = Static58.anIntArray103[local15 + 1] >> 8 & 0xFF;
			@Pc(71) float local71 = ((float) local63 - local53) / 64.0F;
			@Pc(78) float local78 = (float) (Static58.anIntArray103[local15] & 0xFF);
			@Pc(86) int local86 = Static58.anIntArray103[local15 + 1] & 0xFF;
			@Pc(94) float local94 = ((float) local86 - local78) / 64.0F;
			for (@Pc(96) int local96 = 0; local96 < 64; local96++) {
				Static152.anIntArray330[local15 * 64 + local96] = (int) local53 << 8 | (int) local27 << 16 | (int) local78;
				local53 += local71;
				local27 += local44;
				local78 += local94;
			}
		}
		for (local15 = 192; local15 < 255; local15++) {
			Static152.anIntArray330[local15] = Static58.anIntArray103[3];
		}
		Static36.anIntArray57 = new int[32768];
		Static33.anIntArray50 = new int[32768];
		Static220.method4261(null);
		Static309.anIntArray627 = new int[32768];
		Static255.anIntArray551 = new int[32768];
		Static90.aClass3_Sub4_Sub12_Sub2_1 = new Class3_Sub4_Sub12_Sub2(128, 254);
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(B)V")
	public static void method2392() {
		Static96.aClass151ArrayArray1 = new Class151[Static277.aClass155_114.method4119()][];
		Static230.aBooleanArray107 = new boolean[Static277.aClass155_114.method4119()];
	}
}
