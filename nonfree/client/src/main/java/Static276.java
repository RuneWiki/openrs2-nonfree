import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
	public static int anInt5122 = 0;

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
	public static int anInt5123 = 0;

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
	public static int anInt5124 = 0;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLclient!ol;)Lclient!po;")
	public static Class139_Sub2_Sub1 method4673(@OriginalArg(1) Class2_Sub8 arg0) {
		@Pc(7) Class139_Sub2 local7 = Static607.method9112(arg0);
		@Pc(11) int local11 = arg0.method5174();
		return new Class139_Sub2_Sub1(local7.aClass236_12, local7.aClass103_12, local7.anInt11172, local7.anInt11180, local7.anInt11174, local7.anInt11179, local7.anInt11181, local7.anInt11175, local7.anInt11173, local7.anInt8365, local7.anInt8361, local7.anInt8362, local7.anInt8368, local7.anInt8359, local7.anInt8364, local11);
	}
}
