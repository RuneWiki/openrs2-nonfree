import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
	public static int anInt2662;

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "Z")
	public static boolean aBoolean105;

	@OriginalMember(owner = "client!nf", name = "o", descriptor = "Lclient!bc;")
	public static Class1 aClass1_18;

	@OriginalMember(owner = "client!nf", name = "r", descriptor = "Z")
	public static boolean aBoolean106;

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "Lclient!of;")
	public static final Class70 aClass70_16 = new Class70();

	@OriginalMember(owner = "client!nf", name = "i", descriptor = "[Lclient!rd;")
	public static final Class80[] aClass80Array19 = new Class80[8];

	@OriginalMember(owner = "client!nf", name = "k", descriptor = "[I")
	public static final int[] anIntArray354 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!nf", name = "q", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1049 = Static120.method1824("Ausw-=hlen");

	@OriginalMember(owner = "client!nf", name = "s", descriptor = "I")
	public static int anInt2668 = 500;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!dh;B)V")
	public static void method1835(@OriginalArg(0) Class3_Sub1_Sub4_Sub1 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static184.anIntArray497.length; local7++) {
			Static184.anIntArray497[local7] = 0;
		}
		@Pc(36) int local36;
		for (@Pc(26) int local26 = 0; local26 < 5000; local26++) {
			local36 = (int) ((double) 256 * 128.0D * Math.random());
			Static184.anIntArray497[local36] = (int) (Math.random() * 256.0D);
		}
		@Pc(53) int local53;
		@Pc(57) int local57;
		@Pc(66) int local66;
		for (local36 = 0; local36 < 20; local36++) {
			for (local53 = 1; local53 < 255; local53++) {
				for (local57 = 1; local57 < 127; local57++) {
					local66 = local57 + (local53 << 7);
					Static90.anIntArray227[local66] = (Static184.anIntArray497[local66 - 1] + Static184.anIntArray497[local66 + 1] + Static184.anIntArray497[local66 + -128] + Static184.anIntArray497[local66 - -128]) / 4;
				}
			}
			@Pc(111) int[] local111 = Static184.anIntArray497;
			Static184.anIntArray497 = Static90.anIntArray227;
			Static90.anIntArray227 = local111;
		}
		if (arg0 == null) {
			return;
		}
		local53 = 0;
		for (local57 = 0; local57 < arg0.anInt818; local57++) {
			for (local66 = 0; local66 < arg0.anInt819; local66++) {
				if (arg0.aByteArray2[local53++] != 0) {
					@Pc(149) int local149 = local66 + arg0.anInt817 + 16;
					@Pc(156) int local156 = arg0.anInt821 + local57 + 16;
					@Pc(162) int local162 = local149 + (local156 << 7);
					Static184.anIntArray497[local162] = 0;
				}
			}
		}
	}
}
