import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!ir", name = "r", descriptor = "I")
	public static int anInt4779;

	@OriginalMember(owner = "client!ir", name = "n", descriptor = "Lclient!iv;")
	public static final Class168 aClass168_3 = new Class168("RC", 1);

	@OriginalMember(owner = "client!ir", name = "o", descriptor = "Lclient!de;")
	public static final Class69 aClass69_25 = new Class69(32);

	@OriginalMember(owner = "client!ir", name = "q", descriptor = "[Lclient!no;")
	public static final Interface20[] anInterface20Array3 = new Interface20[128];

	@OriginalMember(owner = "client!ir", name = "s", descriptor = "I")
	public static int anInt4780 = -1;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method4173(@OriginalArg(0) String arg0) {
		@Pc(14) StringBuffer local14 = new StringBuffer();
		@Pc(17) int local17 = arg0.length();
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			@Pc(24) char local24 = arg0.charAt(local19);
			if (local24 == '%' && local19 + 2 < local17) {
				local24 = arg0.charAt(local19 + 1);
				@Pc(68) int local68;
				if (local24 >= '0' && local24 <= '9') {
					local68 = local24 - 48;
				} else if (local24 >= 'a' && local24 <= 'f') {
					local68 = local24 + '\n' - 97;
				} else {
					if (local24 < 'A' || local24 > 'F') {
						local14.append('%');
						continue;
					}
					local68 = local24 + '\n' - 65;
				}
				local68 *= 16;
				local24 = arg0.charAt(local19 + 2);
				if (local24 >= '0' && local24 <= '9') {
					local68 += local24 - '0';
				} else if (local24 >= 'a' && local24 <= 'f') {
					local68 += local24 + 10 - 97;
				} else {
					if (local24 < 'A' || local24 > 'F') {
						local14.append('%');
						continue;
					}
					local68 += local24 + 10 - 65;
				}
				local19 += 2;
				if (local68 != 0 && Static136.method2507((byte) local68)) {
					local14.append(Static95.method1918((byte) local68));
				}
			} else if (local24 == '+') {
				local14.append(' ');
			} else {
				local14.append(local24);
			}
		}
		return local14.toString();
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method4175(@OriginalArg(1) String arg0) {
		if (!Static83.aClass286_2.aBoolean536) {
			return -1;
		} else if (Static184.aHashtable2.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(18) String local18 = Static495.method8506(arg0);
			if (local18 == null) {
				return -1;
			}
			@Pc(31) String local31 = Static154.aString30 + local18;
			if (!Static16.aClass238_10.method5582("", local31)) {
				return -1;
			} else if (Static16.aClass238_10.method5570(local31)) {
				@Pc(55) byte[] local55 = Static16.aClass238_10.method5572(local31, "");
				@Pc(66) File local66;
				try {
					local66 = Static491.method6875(local18);
				} catch (@Pc(68) RuntimeException local68) {
					return -1;
				}
				if (local55 == null || local66 == null) {
					return -1;
				}
				@Pc(76) boolean local76 = true;
				@Pc(80) byte[] local80 = Static27.method630(local66);
				if (local80 != null && local80.length == local55.length) {
					for (@Pc(92) int local92 = 0; local92 < local80.length; local92++) {
						if (local55[local92] != local80[local92]) {
							local76 = false;
							break;
						}
					}
				} else {
					local76 = false;
				}
				try {
					if (!local76) {
						Static83.aClass286_2.method6586(local66, local55);
					}
				} catch (@Pc(118) Throwable local118) {
					return -1;
				}
				Static420.method6131(local66, arg0);
				return 100;
			} else {
				return Static16.aClass238_10.method5566(local31);
			}
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V")
	public static void method4176() {
		@Pc(15) Class2_Sub2 local15;
		for (local15 = (Class2_Sub2) Static536.aClass114_42.method2772(); local15 != null; local15 = (Class2_Sub2) Static536.aClass114_42.method2762()) {
			Static634.method8744(local15, false);
		}
		for (local15 = (Class2_Sub2) Static387.aClass114_33.method2772(); local15 != null; local15 = (Class2_Sub2) Static387.aClass114_33.method2762()) {
			Static634.method8744(local15, true);
		}
	}
}
