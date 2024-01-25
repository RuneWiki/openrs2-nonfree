import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!un", name = "M", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_139 = new Class85("Discard", "Ablegen", "Jeter", "Descartar");

	@OriginalMember(owner = "client!un", name = "eb", descriptor = "Z")
	public static boolean aBoolean529 = false;

	@OriginalMember(owner = "client!un", name = "fb", descriptor = "Z")
	public static boolean aBoolean530 = true;

	@OriginalMember(owner = "client!un", name = "gb", descriptor = "J")
	public static long aLong220 = 0L;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!ti;)V")
	public static void method5657(@OriginalArg(0) Class4_Sub5 arg0) {
		for (@Pc(2) int local2 = arg0.aShort92; local2 <= arg0.aShort91; local2++) {
			for (@Pc(6) int local6 = arg0.aShort93; local6 <= arg0.aShort90; local6++) {
				@Pc(16) Class174 local16 = Static178.aClass174ArrayArrayArray3[arg0.aByte75][local2][local6];
				if (local16 != null) {
					@Pc(21) Class84 local21 = local16.aClass84_3;
					@Pc(23) Class84 local23 = null;
					while (local21 != null) {
						if (local21.aClass4_Sub5_1 == arg0) {
							if (local23 == null) {
								local16.aClass84_3 = local21.aClass84_2;
							} else {
								local23.aClass84_2 = local21.aClass84_2;
							}
							local21.method1990();
							break;
						}
						local23 = local21;
						local21 = local21.aClass84_2;
					}
					local16.aByte45 = 0;
					for (@Pc(56) Class84 local56 = local16.aClass84_3; local56 != null; local56 = local56.aClass84_2) {
						local16.aByte45 = (byte) (local16.aByte45 | local56.anInt2103);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!ij;I)V")
	public static void method5659(@OriginalArg(0) Class93 arg0) {
		Static176.anInt3500 = arg0.method2393("titlebg");
		Static46.anInt863 = arg0.method2393("logo");
	}
}
