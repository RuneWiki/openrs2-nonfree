import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "Lclient!pa;")
	public static Class86 aClass86_80;

	@OriginalMember(owner = "client!vd", name = "j", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!vd", name = "o", descriptor = "Lclient!qc;")
	public static Class90 aClass90_22;

	@OriginalMember(owner = "client!vd", name = "r", descriptor = "[Lclient!rh;")
	public static Class78_Sub1[] aClass78_Sub1Array8;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1348 = Static186.method3527(")4l=");

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
	public static int anInt4283 = -1;

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1349 = Static186.method3527("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1350 = Static186.method3527("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

	@OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
	public static int anInt4288 = -1;

	@OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
	public static int anInt4289 = 0;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!qi;)V")
	public static void method3388(@OriginalArg(0) Class94 arg0) {
		for (@Pc(2) int local2 = arg0.anInt3686; local2 <= arg0.anInt3692; local2++) {
			for (@Pc(6) int local6 = arg0.anInt3683; local6 <= arg0.anInt3684; local6++) {
				@Pc(16) Class1_Sub11 local16 = Static56.aClass1_Sub11ArrayArrayArray3[arg0.anInt3685][local2][local6];
				if (local16 != null) {
					@Pc(35) int local35;
					for (@Pc(20) int local20 = 0; local20 < local16.anInt1072; local20++) {
						if (local16.aClass94Array1[local20] == arg0) {
							local16.anInt1072--;
							for (local35 = local20; local35 < local16.anInt1072; local35++) {
								local16.aClass94Array1[local35] = local16.aClass94Array1[local35 + 1];
								local16.anIntArray91[local35] = local16.anIntArray91[local35 + 1];
							}
							local16.aClass94Array1[local16.anInt1072] = null;
							break;
						}
					}
					local16.anInt1076 = 0;
					for (local35 = 0; local35 < local16.anInt1072; local35++) {
						local16.anInt1076 |= local16.anIntArray91[local35];
					}
				}
			}
		}
	}
}
