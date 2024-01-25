import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!pn", name = "J", descriptor = "[C")
	public static final char[] aCharArray7 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!d;I)V")
	public static void method6171(@OriginalArg(0) Class21_Sub1_Sub1_Sub1_Sub1 arg0) {
		for (@Pc(16) Class4_Sub43 local16 = (Class4_Sub43) Static414.aClass22_53.method895(); local16 != null; local16 = (Class4_Sub43) Static414.aClass22_53.method889()) {
			if (local16.aClass21_Sub1_Sub1_Sub1_Sub1_2 == arg0) {
				if (local16.aClass4_Sub21_Sub2_3 != null) {
					Static472.aClass4_Sub21_Sub3_2.method5931(local16.aClass4_Sub21_Sub2_3);
					local16.aClass4_Sub21_Sub2_3 = null;
				}
				local16.method8193();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Z)V")
	public static void method6197() {
		Static25.aClass7_1.ra(((float) Static455.aClass4_Sub35_Sub1_1.anInt9913 * 0.1F + 0.7F) * Static492.aFloat195);
		Static25.aClass7_1.VA(Static489.anInt6943, Static145.aFloat72, Static61.aFloat48, (float) (Static557.anInt10159 << 2), (float) (Static20.anInt955 << 2), (float) (Static178.anInt3748 << 2));
		Static25.aClass7_1.method7784(Static557.aClass112_4);
	}
}
