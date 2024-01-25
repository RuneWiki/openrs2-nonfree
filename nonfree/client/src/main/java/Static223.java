import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!mq", name = "v", descriptor = "Z")
	public static boolean aBoolean308;

	@OriginalMember(owner = "client!mq", name = "i", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_143 = new Class221("Take", "Nehmen", "Prendre", "Pegar");

	@OriginalMember(owner = "client!mq", name = "q", descriptor = "I")
	public static int anInt4127 = 0;

	@OriginalMember(owner = "client!mq", name = "w", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_109 = new Class77(27, 7);

	@OriginalMember(owner = "client!mq", name = "y", descriptor = "[I")
	public static final int[] anIntArray504 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(I)V")
	public static void method3750() {
		try {
			if (Static35.anInt745 == 1) {
				@Pc(16) int local16 = Static222.aClass2_Sub2_Sub3_1.method3421();
				if (local16 > 0 && Static222.aClass2_Sub2_Sub3_1.method3420()) {
					local16 -= Static48.anInt940;
					if (local16 < 0) {
						local16 = 0;
					}
					Static222.aClass2_Sub2_Sub3_1.method3415(local16);
				} else {
					Static222.aClass2_Sub2_Sub3_1.method3423();
					Static222.aClass2_Sub2_Sub3_1.method3404();
					Static265.aClass2_Sub25_2 = null;
					if (Static48.aClass71_15 == null) {
						Static35.anInt745 = 0;
					} else {
						Static35.anInt745 = 2;
					}
					Static371.aClass142_1 = null;
				}
			}
		} catch (@Pc(58) Exception local58) {
			local58.printStackTrace();
			Static222.aClass2_Sub2_Sub3_1.method3423();
			Static35.anInt745 = 0;
			Static48.aClass71_15 = null;
			Static371.aClass142_1 = null;
			Static265.aClass2_Sub25_2 = null;
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!ms;BLclient!km;)V")
	public static void method3755(@OriginalArg(0) Class155 arg0, @OriginalArg(2) Class82 arg1) {
		@Pc(31) boolean local31 = Static106.aClass250_1.method5737(arg0.anInt4204, arg0.anInt4142 | 0xFF000000, arg0.anInt4145, arg1, arg0.aBoolean321 ? Static267.aClass12_Sub1_Sub2_Sub2_1.aClass247_1 : null, arg0.anInt4148, arg0.anInt4212) == null;
		if (local31) {
			Static148.aClass210_21.method5044(new Class2_Sub15(arg0.anInt4212, arg0.anInt4204, arg0.anInt4148, arg0.anInt4142 | 0xFF000000, arg0.anInt4145, arg0.aBoolean321));
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(BB)C")
	public static char method3757(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(39) char local39 = Static303.aCharArray9[local7 - 128];
			if (local39 == '\u0000') {
				local39 = '?';
			}
			local7 = local39;
		}
		return (char) local7;
	}
}
