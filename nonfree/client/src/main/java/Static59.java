import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
	public static int anInt1436;

	@OriginalMember(owner = "client!jd", name = "k", descriptor = "[Lclient!vd;")
	public static Class5_Sub2_Sub1_Sub4[] aClass5_Sub2_Sub1_Sub4Array3;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "Lclient!r;")
	public static Class61 aClass61_456 = Static129.method2060("lila:");

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "Lclient!r;")
	private static Class61 aClass61_457 = Static129.method2060("Please contact customer support)3");

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "Lclient!r;")
	public static Class61 aClass61_458 = aClass61_457;

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "Lclient!r;")
	public static Class61 aClass61_459 = Static129.method2060("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "Lclient!ge;")
	public static Class29 aClass29_14 = new Class29(64);

	@OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
	public static int anInt1435 = 1;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!n;I)V")
	public static void method1017(@OriginalArg(0) Class5_Sub2_Sub1_Sub3 arg0) {
		for (@Pc(9) int local9 = 0; local9 < Static39.anIntArray174.length; local9++) {
			Static39.anIntArray174[local9] = 0;
		}
		@Pc(36) int local36;
		for (@Pc(26) int local26 = 0; local26 < 5000; local26++) {
			local36 = (int) ((double) 256 * 128.0D * Math.random());
			Static39.anIntArray174[local36] = (int) (Math.random() * 256.0D);
		}
		@Pc(61) int local61;
		@Pc(65) int local65;
		@Pc(73) int local73;
		for (local36 = 0; local36 < 20; local36++) {
			for (local61 = 1; local61 < 255; local61++) {
				for (local65 = 1; local65 < 127; local65++) {
					local73 = local65 + (local61 << 7);
					Static25.anIntArray127[local73] = (Static39.anIntArray174[local73 + 128] + Static39.anIntArray174[local73 - 128] + Static39.anIntArray174[local73 - -1] + Static39.anIntArray174[local73 + -1]) / 4;
				}
			}
			@Pc(113) int[] local113 = Static39.anIntArray174;
			Static39.anIntArray174 = Static25.anIntArray127;
			Static25.anIntArray127 = local113;
		}
		if (arg0 == null) {
			return;
		}
		local61 = 0;
		for (local65 = 0; local65 < arg0.anInt2090; local65++) {
			for (local73 = 0; local73 < arg0.anInt2091; local73++) {
				if (arg0.aByteArray31[local61++] != 0) {
					@Pc(146) int local146 = local73 + arg0.anInt2089 + 16;
					@Pc(153) int local153 = arg0.anInt2087 + local65 + 16;
					@Pc(160) int local160 = local146 + (local153 << 7);
					Static39.anIntArray174[local160] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
	public static void method1018() {
		aCRC32_2 = null;
		aClass61_456 = null;
		aClass29_14 = null;
		aClass61_458 = null;
		aClass61_459 = null;
		aClass61_457 = null;
		aClass5_Sub2_Sub1_Sub4Array3 = null;
	}
}
