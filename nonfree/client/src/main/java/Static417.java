import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!up", name = "Q", descriptor = "[Lclient!li;")
	public static Class160[] aClass160Array2;

	@OriginalMember(owner = "client!up", name = "T", descriptor = "I")
	public static int anInt7156;

	@OriginalMember(owner = "client!up", name = "db", descriptor = "Lclient!la;")
	public static Class14 aClass14_4;

	@OriginalMember(owner = "client!up", name = "eb", descriptor = "[Lclient!o;")
	public static Class41[] aClass41Array13;

	@OriginalMember(owner = "client!up", name = "E", descriptor = "F")
	public static float aFloat93 = 0.0F;

	@OriginalMember(owner = "client!up", name = "Y", descriptor = "I")
	public static int anInt7158 = 0;

	@OriginalMember(owner = "client!up", name = "ab", descriptor = "I")
	public static final int anInt7159 = 1400;

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIII)V")
	public static void method5725(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static118.anInt2005 = 0;
		Static347.anInt6160 = 0;
		Static123.anInt2069 = arg1;
		Static385.anInt6686 = arg0;
	}

	@OriginalMember(owner = "client!up", name = "e", descriptor = "(I)V")
	public static void method5727() {
		for (@Pc(3) int local3 = 0; local3 < Static458.anInt7721; local3++) {
			@Pc(9) int local9 = Static164.anIntArray253[local3];
			@Pc(16) Class2_Sub34 local16 = (Class2_Sub34) Static400.aClass220_41.method5099((long) local9);
			if (local16 != null) {
				@Pc(21) Class11_Sub5_Sub2_Sub2 local21 = local16.aClass11_Sub5_Sub2_Sub2_2;
				Static448.method6075(local21.aClass82_1.anInt1963, local21);
			}
		}
	}
}
