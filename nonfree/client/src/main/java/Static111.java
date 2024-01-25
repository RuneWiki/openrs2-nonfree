import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!ds", name = "p", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_28 = new Class185(21, -1);

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(BB)C")
	public static char method2501(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(41) char local41 = Static125.aCharArray7[local7 - 128];
			if (local41 == '\u0000') {
				local41 = '?';
			}
			local7 = local41;
		}
		return (char) local7;
	}

	@OriginalMember(owner = "client!ds", name = "d", descriptor = "(I)V")
	public static void method2503() {
		for (@Pc(15) Class6_Sub39 local15 = (Class6_Sub39) Static475.aClass380_36.method8755(); local15 != null; local15 = (Class6_Sub39) Static475.aClass380_36.method8752()) {
			if (local15.aClass62_Sub1_1.method2406()) {
				Static122.method2609(local15.anInt7975);
			} else {
				local15.aClass62_Sub1_1.method2420();
				try {
					local15.aClass62_Sub1_1.method2408();
				} catch (@Pc(32) Exception local32) {
					Static358.method5809(local32, "TV: " + local15.anInt7975);
					Static122.method2609(local15.anInt7975);
				}
				if (!local15.aBoolean637 && !local15.aBoolean635) {
					@Pc(58) Class6_Sub13_Sub1 local58 = local15.aClass62_Sub1_1.method2404();
					if (local58 != null) {
						@Pc(64) Class6_Sub4_Sub4 local64 = local58.method2042();
						if (local64 != null) {
							local64.method8519(local15.anInt7973);
							Static152.aClass6_Sub4_Sub3_2.method5194(local64);
							local15.aBoolean637 = true;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method2505(@OriginalArg(0) Class5 arg0) {
		for (@Pc(6) Class9_Sub5 local6 = (Class9_Sub5) Static470.aClass234_11.method6092(); local6 != null; local6 = (Class9_Sub5) Static470.aClass234_11.method6098()) {
			if (local6.aBoolean488) {
				local6.method5224(arg0);
			}
		}
	}
}
