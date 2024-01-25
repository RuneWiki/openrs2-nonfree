import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
	public static int anInt227;

	@OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
	public static int anInt228;

	@OriginalMember(owner = "client!ah", name = "n", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_12 = new Class225(80, 2);

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(I[FI)[F")
	public static float[] method236(@OriginalArg(1) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) float[] local6 = new float[arg1];
		Static728.method270(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method237(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(12) int local12 = 0;
		@Pc(23) int local23 = arg0.length();
		while (local23 > local12 && Static224.method9652(arg0.charAt(local12))) {
			local12++;
		}
		while (local12 < local23 && Static224.method9652(arg0.charAt(local23 - 1))) {
			local23--;
		}
		@Pc(74) int local74 = local23 - local12;
		if (local74 < 1 || local74 > 12) {
			return null;
		}
		@Pc(90) StringBuffer local90 = new StringBuffer(local74);
		for (@Pc(92) int local92 = local12; local92 < local23; local92++) {
			@Pc(100) char local100 = arg0.charAt(local92);
			if (Static727.method9880(local100)) {
				@Pc(108) char local108 = Static347.method4806(local100);
				if (local108 != '\u0000') {
					local90.append(local108);
				}
			}
		}
		if (local90.length() == 0) {
			return null;
		} else {
			return local90.toString();
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(BII)Z")
	public static boolean method240(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x20) != 0;
	}
}
