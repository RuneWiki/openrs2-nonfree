import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!nda", name = "i", descriptor = "I")
	public static int anInt6991;

	@OriginalMember(owner = "client!nda", name = "k", descriptor = "I")
	public static int anInt6992;

	@OriginalMember(owner = "client!nda", name = "h", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_89 = new Class276(58, -1);

	@OriginalMember(owner = "client!nda", name = "j", descriptor = "Lclient!ki;")
	public static final Class183 aClass183_44 = new Class183();

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(I)V")
	public static void method5818() {
		Static547.aClass153_1 = new Class153(8);
		Static314.anInt6320 = 0;
		for (@Pc(23) Class55_Sub8 local23 = (Class55_Sub8) Static388.aClass134_7.method3233(); local23 != null; local23 = (Class55_Sub8) Static388.aClass134_7.method3230()) {
			local23.method7118();
		}
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIIZI)V")
	public static void method5819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		Static206.aLong218 = 0L;
		@Pc(8) int local8 = Static216.method3759();
		if (arg0 == 3 || local8 == 3) {
			arg3 = true;
		}
		if (!Static546.aClass15_16.method5323()) {
			arg3 = true;
		}
		Static158.method3010(arg2, arg0, local8, arg1, arg3);
	}

	@OriginalMember(owner = "client!nda", name = "b", descriptor = "(I)V")
	public static void method5821() {
		Static198.aClass211_25.method5537();
		Static402.aClass211_65.method5537();
		Static228.aClass211_33.method5537();
		Static237.aClass211_36.method5537();
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(ILclient!fd;)Lclient!kp;")
	public static Class43_Sub2 method5822(@OriginalArg(1) Class3_Sub7 arg0) {
		return new Class43_Sub2(arg0.method6525(), arg0.method6525(), arg0.method6525(), arg0.method6525(), arg0.method6525(), arg0.method6525(), arg0.method6525(), arg0.method6525(), arg0.method6506(), arg0.method6538());
	}
}
