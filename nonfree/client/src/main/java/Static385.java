import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!wl", name = "r", descriptor = "[[B")
	public static byte[][] aByteArrayArray24;

	@OriginalMember(owner = "client!wl", name = "k", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_206 = new Class41(72, -1);

	@OriginalMember(owner = "client!wl", name = "s", descriptor = "I")
	public static int anInt6688 = 0;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V")
	public static void method5708() {
		if (Static344.anInt6327 == 10) {
			Static345.method5253(28);
		}
		if (Static344.anInt6327 == 30) {
			Static345.method5253(25);
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(CBLjava/lang/String;)I")
	public static int method5711(@OriginalArg(0) char arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg1.length();
		for (@Pc(17) int local17 = 0; local17 < local10; local17++) {
			if (arg1.charAt(local17) == arg0) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!tq;)V")
	public static void method5712(@OriginalArg(0) Class12_Sub1 arg0) {
		for (@Pc(2) int local2 = arg0.aShort97; local2 <= arg0.aShort96; local2++) {
			for (@Pc(6) int local6 = arg0.aShort94; local6 <= arg0.aShort95; local6++) {
				@Pc(16) Class227 local16 = Static297.aClass227ArrayArrayArray7[arg0.aByte74][local2][local6];
				if (local16 != null) {
					@Pc(21) Class164 local21 = local16.aClass164_25;
					@Pc(23) Class164 local23 = null;
					while (local21 != null) {
						if (local21.aClass12_Sub1_2 == arg0) {
							if (local23 == null) {
								local16.aClass164_25 = local21.aClass164_19;
							} else {
								local23.aClass164_19 = local21.aClass164_19;
							}
							local21.method3902();
							break;
						}
						local23 = local21;
						local21 = local21.aClass164_19;
					}
					local16.aByte64 = 0;
					for (@Pc(56) Class164 local56 = local16.aClass164_25; local56 != null; local56 = local56.aClass164_19) {
						local16.aByte64 = (byte) (local16.aByte64 | local56.anInt4393);
					}
				}
			}
		}
	}
}
