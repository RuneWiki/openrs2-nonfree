import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!jm", name = "J", descriptor = "Ljava/lang/Object;")
	public static Object anObject19;

	@OriginalMember(owner = "client!jm", name = "K", descriptor = "I")
	public static int anInt3601;

	@OriginalMember(owner = "client!jm", name = "H", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_76 = new Class83("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

	@OriginalMember(owner = "client!jm", name = "I", descriptor = "Lclient!fa;")
	public static final Class68 aClass68_20 = new Class68(5);

	@OriginalMember(owner = "client!jm", name = "L", descriptor = "Lclient!ho;")
	public static final Class98 aClass98_8 = new Class98(9, 0, 4, 1);

	@OriginalMember(owner = "client!jm", name = "M", descriptor = "I")
	public static int anInt3602 = 0;

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "(III)Z")
	public static boolean method2975(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "(III)I")
	public static int method2976(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 >>> 31;
		return (local12 + arg0) / arg1 - local12;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!pe;)V")
	public static void method2978(@OriginalArg(0) Class16_Sub1 arg0) {
		for (@Pc(2) int local2 = arg0.aShort94; local2 <= arg0.aShort97; local2++) {
			for (@Pc(6) int local6 = arg0.aShort96; local6 <= arg0.aShort95; local6++) {
				@Pc(16) Class164 local16 = Static202.aClass164ArrayArrayArray5[arg0.aByte82][local2][local6];
				if (local16 != null) {
					@Pc(21) Class7 local21 = local16.aClass7_3;
					@Pc(23) Class7 local23 = null;
					while (local21 != null) {
						if (local21.aClass16_Sub1_1 == arg0) {
							if (local23 == null) {
								local16.aClass7_3 = local21.aClass7_1;
							} else {
								local23.aClass7_1 = local21.aClass7_1;
							}
							local21.method85();
							break;
						}
						local23 = local21;
						local21 = local21.aClass7_1;
					}
					local16.aByte50 = 0;
					for (@Pc(56) Class7 local56 = local16.aClass7_3; local56 != null; local56 = local56.aClass7_1) {
						local16.aByte50 = (byte) (local16.aByte50 | local56.anInt118);
					}
				}
			}
		}
	}
}
