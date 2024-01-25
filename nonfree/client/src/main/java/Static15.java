import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
	public static int anInt3200 = 500;

	@OriginalMember(owner = "client!ao", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray33 = new String[100];

	@OriginalMember(owner = "client!ao", name = "k", descriptor = "I")
	public static int anInt3203 = 0;

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)[Lclient!hp;")
	public static Class108[] method2738() {
		return new Class108[] { Static20.aClass108_1, Static20.aClass108_2, Static20.aClass108_3, Static20.aClass108_4, Static20.aClass108_5, Static20.aClass108_6, Static20.aClass108_7, Static20.aClass108_8, Static20.aClass108_9, Static20.aClass108_10 };
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)V")
	public static void method2739(@OriginalArg(1) int arg0) {
		if (!Static130.method1891(arg0)) {
			return;
		}
		@Pc(14) Class219[] local14 = Static448.aClass219ArrayArray2[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class219 local22 = local14[local16];
			if (local22 != null) {
				local22.anInt6396 = 0;
				local22.anInt6420 = 1;
				local22.anInt6425 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(B)Ljava/lang/String;")
	public static String method2742() {
		@Pc(7) String local7 = "www";
		if (Static221.aClass176_5 == Static132.aClass176_4) {
			local7 = "www-wtrc";
		} else if (Static221.aClass176_5 == Static359.aClass176_8) {
			local7 = "www-wtqa";
		} else if (Static221.aClass176_5 == Static212.aClass176_2) {
			local7 = "www-wtwip";
		}
		@Pc(28) String local28 = "";
		if (Static143.aString15 != null) {
			local28 = "/p=" + Static143.aString15;
		}
		return "http://" + local7 + "." + Static248.aClass145_2.aString32 + ".com/l=" + Static167.anInt3118 + "/a=" + Static253.anInt4554 + local28 + "/";
	}
}
