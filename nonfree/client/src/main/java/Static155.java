import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!fi", name = "N", descriptor = "I")
	public static int anInt3953;

	@OriginalMember(owner = "client!fi", name = "L", descriptor = "Lclient!wq;")
	public static final Class375 aClass375_18 = new Class375(1);

	@OriginalMember(owner = "client!fi", name = "P", descriptor = "Lclient!kn;")
	public static final Class181 aClass181_4 = new Class181(12, 7);

	@OriginalMember(owner = "client!fi", name = "R", descriptor = "Lclient!tr;")
	public static final Class332 aClass332_2 = new Class332();

	@OriginalMember(owner = "client!fi", name = "S", descriptor = "Lclient!uh;")
	public static final Class341 aClass341_36 = new Class341();

	@OriginalMember(owner = "client!fi", name = "T", descriptor = "I")
	public static int anInt3956 = 0;

	@OriginalMember(owner = "client!fi", name = "U", descriptor = "[I")
	public static final int[] anIntArray207 = new int[13];

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(Z)V")
	public static void method3479() {
		for (@Pc(7) int local7 = 0; local7 < Static398.anInt7589; local7++) {
			@Pc(18) int local18 = Static301.anIntArray367[local7];
			@Pc(25) Class2_Sub33 local25 = (Class2_Sub33) Static600.aClass99_79.method3056((long) local18);
			if (local25 != null) {
				@Pc(30) Class3_Sub1_Sub3_Sub3_Sub1 local30 = local25.aClass3_Sub1_Sub3_Sub3_Sub1_2;
				Static8.method210(local30.aClass27_1.anInt666, local30);
			}
		}
	}
}
