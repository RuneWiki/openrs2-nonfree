import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!rh", name = "N", descriptor = "I")
	public static int anInt5290;

	@OriginalMember(owner = "client!rh", name = "E", descriptor = "[C")
	public static final char[] aCharArray6 = new char[128];

	@OriginalMember(owner = "client!rh", name = "G", descriptor = "Z")
	public static boolean aBoolean349 = false;

	@OriginalMember(owner = "client!rh", name = "H", descriptor = "Ljava/lang/String;")
	public static final String aString198 = "yellow:";

	@OriginalMember(owner = "client!rh", name = "I", descriptor = "[Lclient!oq;")
	public static final Class160[] aClass160Array1 = new Class160[6];

	@OriginalMember(owner = "client!rh", name = "J", descriptor = "Lclient!ne;")
	public static Class146 aClass146_51 = null;

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(BI)V")
	public static void method4714(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = Static153.anInt3257 - Static289.anInt5590;
		if (local8 >= 100) {
			Static205.anInt4115 = 1;
			return;
		}
		@Pc(17) int local17 = (int) Static274.aFloat100;
		if (local17 < Static313.anInt6043 >> 8) {
			local17 = Static313.anInt6043 >> 8;
		}
		if (Static189.aBooleanArray24[4] && local17 < Static325.anIntArray600[4] + 128) {
			local17 = Static325.anIntArray600[4] + 128;
		}
		@Pc(54) int local54 = (int) Static94.aFloat42 + Static70.anInt1688 & 0x3FFF;
		Static38.method914((local17 >> 3) * 3 + 600, local17, Static279.method4730(Static219.anInt4400, Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5910, Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5908) - 50, Static340.anInt6526, arg0, Static17.anInt349, local54);
		@Pc(96) float local96 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static124.anInt2717 = (int) ((float) (Static124.anInt2717 - Static31.anInt728) * local96 + (float) Static31.anInt728);
		Static141.anInt2986 = (int) ((float) Static281.anInt5363 + local96 * (float) (Static141.anInt2986 - Static281.anInt5363));
		Static112.anInt2486 = (int) (local96 * (float) (Static112.anInt2486 - Static269.anInt5120) + (float) Static269.anInt5120);
		Static103.anInt2301 = (int) (local96 * (float) (Static103.anInt2301 - Static99.anInt2253) + (float) Static99.anInt2253);
		@Pc(148) int local148 = Static249.anInt4824 - Static244.anInt4751;
		if (local148 > 8192) {
			local148 -= 16384;
		} else if (local148 < -8192) {
			local148 += 16384;
		}
		Static249.anInt4824 = (int) ((float) local148 * local96 + (float) Static244.anInt4751);
		Static249.anInt4824 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!rh", name = "g", descriptor = "(I)V")
	public static void method4715() {
		@Pc(1) Class11 local1 = Static22.aClass11_15;
		synchronized (Static22.aClass11_15) {
			Static22.aClass11_15.method214();
		}
		local1 = Static24.aClass11_16;
		synchronized (Static24.aClass11_16) {
			Static24.aClass11_16.method214();
		}
	}
}
