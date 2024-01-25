import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_181 = new Class25(47, 5);

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_105 = new Class208(50, 2);

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "J")
	public static long aLong388 = 0L;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!tm;)V")
	public static void method6031(@OriginalArg(0) Class11_Sub5 arg0) {
		for (@Pc(2) int local2 = arg0.aShort108; local2 <= arg0.aShort107; local2++) {
			for (@Pc(6) int local6 = arg0.aShort109; local6 <= arg0.aShort106; local6++) {
				@Pc(16) Class36 local16 = Static175.aClass36ArrayArrayArray1[arg0.aByte101][local2][local6];
				if (local16 != null) {
					@Pc(21) Class195 local21 = local16.aClass195_1;
					@Pc(23) Class195 local23 = null;
					while (local21 != null) {
						if (local21.aClass11_Sub5_1 == arg0) {
							if (local23 == null) {
								local16.aClass195_1 = local21.aClass195_2;
							} else {
								local23.aClass195_2 = local21.aClass195_2;
							}
							local21.method4423();
							break;
						}
						local23 = local21;
						local21 = local21.aClass195_2;
					}
					local16.aByte7 = 0;
					for (@Pc(56) Class195 local56 = local16.aClass195_1; local56 != null; local56 = local56.aClass195_2) {
						local16.aByte7 = (byte) (local16.aByte7 | local56.anInt5542);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
	public static void method6032(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		Static25.anInt7276 = 2;
		Static199.anInt3422 = arg0;
		Static192.method2760(arg2, arg1);
	}
}
