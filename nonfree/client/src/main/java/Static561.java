import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static561 {

	@OriginalMember(owner = "client!td", name = "e", descriptor = "D")
	public static double aDouble20;

	@OriginalMember(owner = "client!td", name = "f", descriptor = "I")
	public static int anInt9146;

	@OriginalMember(owner = "client!td", name = "j", descriptor = "I")
	public static int anInt9150;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!rv;I)Lclient!sc;")
	public static Class110_Sub3 method7681(@OriginalArg(0) Class5_Sub15 arg0) {
		@Pc(7) Class110 local7 = Static273.method3805(arg0);
		@Pc(13) int local13 = arg0.method3671();
		@Pc(17) int local17 = arg0.method3671();
		return new Class110_Sub3(local7.aClass112_16, local7.aClass4_11, local7.anInt8734, local7.anInt8739, local7.anInt8729, local7.anInt8731, local7.anInt8738, local7.anInt8732, local7.anInt8733, local13, local17);
	}
}
