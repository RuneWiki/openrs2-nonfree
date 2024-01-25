import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "Lclient!kga;")
	public static final Class178 aClass178_3 = new Class178("LIVE", 0);

	@OriginalMember(owner = "client!lba", name = "g", descriptor = "I")
	public static int anInt5872 = 0;

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(B)Ljava/lang/String;")
	public static String method4601() {
		@Pc(7) String local7 = "www";
		if (Static252.aClass326_4 == Static342.aClass326_6) {
			local7 = "www-wtrc";
		} else if (Static492.aClass326_8 == Static342.aClass326_6) {
			local7 = "www-wtqa";
		} else if (Static342.aClass326_6 == Static173.aClass326_3) {
			local7 = "www-wtwip";
		}
		@Pc(33) String local33 = "";
		if (Static146.aString56 != null) {
			local33 = "/p=" + Static146.aString56;
		}
		return "http://" + local7 + "." + Static162.aClass128_1.aString66 + ".com/l=" + Static142.anInt3088 + "/a=" + Static446.anInt8497 + local33 + "/";
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(I)V")
	public static void method4602() {
		Static215.aClass155Array1 = null;
		Static505.method7286(Static71.anInt1872, 0, -1, 0, Static446.anInt8493, 0, Static123.anInt9150, 0);
		if (Static215.aClass155Array1 != null) {
			Static87.method1818(Static95.aClass155_1.anInt4829, Static245.anInt5069, 0, 0, Static71.anInt1872, Static215.aClass155Array1, Static529.anInt9711, Static123.anInt9150, -1412584499);
			Static215.aClass155Array1 = null;
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IZI)Lclient!lk;")
	public static Class4_Sub30 method4604(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) long local12 = (long) ((arg1 ? Integer.MIN_VALUE : 0) | arg0);
		return (Class4_Sub30) Static259.aClass221_16.method5075(local12);
	}
}
