import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!gha", name = "j", descriptor = "I")
	public static int anInt3742;

	@OriginalMember(owner = "client!gha", name = "n", descriptor = "J")
	public static long aLong97;

	@OriginalMember(owner = "client!gha", name = "w", descriptor = "I")
	public static int anInt3750;

	@OriginalMember(owner = "client!gha", name = "y", descriptor = "I")
	public static int anInt3752;

	@OriginalMember(owner = "client!gha", name = "i", descriptor = "Lclient!ada;")
	public static final Class8 aClass8_18 = new Class8();

	@OriginalMember(owner = "client!gha", name = "c", descriptor = "(III)V")
	public static void method3325(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static8.anInt159 = arg1;
		Static609.anInt10076 = arg0;
		if (Static469.anInt8256 == 0) {
			Static320.anInt6116 = Static449.anInt8044 * 2 + Static8.anInt159;
			Static164.anInt3399 = Static609.anInt10076 + Static173.anInt3607 * 2;
		} else if (Static469.anInt8256 == 1) {
			Static316.anInt6064 = Static152.anInt5119 + Static8.anInt159 / Static11.anInt221 + 2;
			Static406.anInt7520 = Static609.anInt10076 / Static345.anInt6515 + Static160.anInt3354 + 2;
			Static164.anInt3399 = Static345.anInt6515 * Static406.anInt7520;
			Static320.anInt6116 = Static11.anInt221 * Static316.anInt6064;
			Static173.anInt3607 = Static164.anInt3399 - Static609.anInt10076 >> 1;
			Static449.anInt8044 = Static320.anInt6116 - Static8.anInt159 >> 1;
		} else if (Static469.anInt8256 == 2) {
			Static320.anInt6116 = Static8.anInt159;
			Static164.anInt3399 = Static609.anInt10076;
			return;
		}
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(Lclient!rg;B)Lclient!kba;")
	public static Class22_Sub3 method3326(@OriginalArg(0) Class6_Sub40 arg0) {
		@Pc(7) Class22 local7 = Static282.method4956(arg0);
		@Pc(16) int local16 = arg0.method8579();
		@Pc(20) int local20 = arg0.method8579();
		return new Class22_Sub3(local7.aClass238_9, local7.aClass79_14, local7.anInt5439, local7.anInt5436, local7.anInt5441, local7.anInt5435, local7.anInt5432, local7.anInt5438, local7.anInt5431, local16, local20);
	}
}
