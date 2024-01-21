import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!ec", name = "K", descriptor = "I")
	public static int anInt957;

	@OriginalMember(owner = "client!ec", name = "N", descriptor = "Lclient!oc;")
	public static Class70 aClass70_472;

	@OriginalMember(owner = "client!ec", name = "E", descriptor = "I")
	public static int anInt952 = 0;

	@OriginalMember(owner = "client!ec", name = "F", descriptor = "I")
	public static int anInt953 = 0;

	@OriginalMember(owner = "client!ec", name = "G", descriptor = "I")
	public static final int anInt954 = 5063219;

	@OriginalMember(owner = "client!ec", name = "M", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_471 = Static193.method3027("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)[Lclient!qc;")
	public static Class3_Sub3_Sub2_Sub2[] method739() {
		@Pc(6) Class3_Sub3_Sub2_Sub2[] local6 = new Class3_Sub3_Sub2_Sub2[Static76.anInt1503];
		for (@Pc(8) int local8 = 0; local8 < Static76.anInt1503; local8++) {
			@Pc(13) Class3_Sub3_Sub2_Sub2 local13 = new Class3_Sub3_Sub2_Sub2();
			local13.anInt3217 = Static88.anInt1712;
			local13.anInt3221 = Static126.anInt2492;
			local13.anInt3219 = Static176.anIntArray295[local8];
			local13.anInt3218 = Static160.anIntArray245[local8];
			local13.anInt3220 = Static163.anIntArray250[local8];
			local13.anInt3216 = Static172.anIntArray284[local8];
			local13.anIntArray235 = Static63.anIntArray75;
			local13.aByteArray32 = Static204.aByteArrayArray9[local8];
			local6[local8] = local13;
		}
		Static161.method2418();
		return local6;
	}
}
