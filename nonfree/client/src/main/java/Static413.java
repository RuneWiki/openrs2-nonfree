import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!pn", name = "f", descriptor = "I")
	public static int anInt7145;

	@OriginalMember(owner = "client!pn", name = "o", descriptor = "Lclient!kca;")
	public static Class189 aClass189_8;

	@OriginalMember(owner = "client!pn", name = "u", descriptor = "I")
	public static final int anInt7159 = 1337;

	@OriginalMember(owner = "client!pn", name = "v", descriptor = "Lclient!gj;")
	public static final Class124 aClass124_45 = new Class124();

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IC)Z")
	public static boolean method5931(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(BZ)C")
	public static char method5932(@OriginalArg(0) byte arg0) {
		@Pc(14) int local14 = arg0 & 0xFF;
		if (local14 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local14, 16) + " provided");
		}
		if (local14 >= 128 && local14 < 160) {
			@Pc(48) char local48 = Static426.aCharArray8[local14 - 128];
			if (local48 == '\u0000') {
				local48 = '?';
			}
			local14 = local48;
		}
		return (char) local14;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!bi;BLclient!ii;)V")
	public static void method5933(@OriginalArg(0) Class31 arg0, @OriginalArg(2) Class161 arg1) {
		Static488.aString90 = "";
		Static296.aClass31_67 = arg0;
		Static96.aClass161_2 = arg1;
		if (Class191.aString62.startsWith("win")) {
			Static488.aString90 = Static488.aString90 + "windows/";
		} else if (Class191.aString62.startsWith("linux")) {
			Static488.aString90 = Static488.aString90 + "linux/";
		} else if (Class191.aString62.startsWith("mac")) {
			Static488.aString90 = Static488.aString90 + "macos/";
		}
		if (Static96.aClass161_2.aBoolean345) {
			Static488.aString90 = Static488.aString90 + "msjava/";
		} else if (Class191.aString63.startsWith("amd64") || Class191.aString63.startsWith("x86_64")) {
			Static488.aString90 = Static488.aString90 + "x86_64/";
		} else if (Class191.aString63.startsWith("i386") || Class191.aString63.startsWith("i486") || Class191.aString63.startsWith("i586") || Class191.aString63.startsWith("x86")) {
			Static488.aString90 = Static488.aString90 + "x86/";
		} else if (Class191.aString63.startsWith("ppc")) {
			Static488.aString90 = Static488.aString90 + "ppc/";
		} else {
			Static488.aString90 = Static488.aString90 + "universal/";
		}
	}
}
