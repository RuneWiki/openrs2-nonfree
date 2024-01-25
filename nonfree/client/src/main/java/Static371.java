import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!nea", name = "C", descriptor = "I")
	public static int anInt7004;

	@OriginalMember(owner = "client!nea", name = "F", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_98 = new Class200(93, 0);

	@OriginalMember(owner = "client!nea", name = "G", descriptor = "I")
	public static int anInt7006 = 1;

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(Lclient!jf;Z)V")
	public static void method6017(@OriginalArg(0) Class4_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(2) int local2 = arg0.aShort118; local2 <= arg0.aShort117; local2++) {
			for (@Pc(6) int local6 = arg0.aShort116; local6 <= arg0.aShort119; local6++) {
				@Pc(16) Class77 local16 = Static330.aClass77ArrayArrayArray2[arg0.aByte123][local2][local6];
				if (local16 != null) {
					@Pc(21) Class128 local21 = local16.aClass128_1;
					@Pc(23) Class128 local23 = null;
					while (local21 != null) {
						if (local21.aClass4_Sub1_Sub2_1 == arg0) {
							if (local23 == null) {
								local16.aClass128_1 = local21.aClass128_2;
							} else {
								local23.aClass128_2 = local21.aClass128_2;
							}
							local21.method3217();
							break;
						}
						local23 = local21;
						local21 = local21.aClass128_2;
					}
				}
			}
		}
		if (!arg1) {
			Static475.method7133(arg0);
		}
	}

	@OriginalMember(owner = "client!nea", name = "c", descriptor = "(B)V")
	public static void method6019() {
		Static13.aBoolean727 = true;
	}
}
