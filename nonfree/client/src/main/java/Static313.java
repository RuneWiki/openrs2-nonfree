import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!tn", name = "f", descriptor = "I")
	public static int anInt6081 = -1;

	@OriginalMember(owner = "client!tn", name = "m", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_129 = new Class85("Attack", "Angreifen", "Attaquer", "Atacar");

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(BZ)V")
	public static void method5462(@OriginalArg(0) byte arg0) {
		if (Static167.aByteArrayArrayArray8 == null) {
			Static167.aByteArrayArrayArray8 = new byte[4][Static22.anInt481][Static269.anInt5281];
		}
		for (@Pc(16) int local16 = 0; local16 < 4; local16++) {
			for (@Pc(19) int local19 = 0; local19 < Static22.anInt481; local19++) {
				for (@Pc(22) int local22 = 0; local22 < Static269.anInt5281; local22++) {
					Static167.aByteArrayArrayArray8[local16][local19][local22] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIZI)Ljava/lang/String;")
	public static String method5468(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(35) int local35 = 2;
		for (@Pc(39) int local39 = arg0 / 10; local39 != 0; local39 /= 10) {
			local35++;
		}
		@Pc(53) char[] local53 = new char[local35];
		local53[0] = '+';
		for (@Pc(61) int local61 = local35 - 1; local61 > 0; local61--) {
			@Pc(64) int local64 = arg0;
			arg0 /= 10;
			@Pc(75) int local75 = local64 - arg0 * 10;
			if (local75 >= 10) {
				local53[local61] = (char) (local75 + 87);
			} else {
				local53[local61] = (char) (local75 + 48);
			}
		}
		return new String(local53);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(BI)Lclient!vk;")
	public static Class202 method5470(@OriginalArg(1) int arg0) {
		@Pc(5) Class109 local5 = Static60.aClass109_23;
		@Pc(23) Class202 local23;
		synchronized (Static60.aClass109_23) {
			local23 = (Class202) Static60.aClass109_23.method2857((long) arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(39) byte[] local39 = Static297.aClass93_115.method2410(arg0, 16);
		local23 = new Class202();
		if (local39 != null) {
			local23.method5857(new Class5_Sub12(local39));
		}
		local5 = Static60.aClass109_23;
		synchronized (Static60.aClass109_23) {
			Static60.aClass109_23.method2855((long) arg0, local23);
			return local23;
		}
	}
}
