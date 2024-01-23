import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
	public static int anInt2810;

	@OriginalMember(owner = "client!kl", name = "r", descriptor = "I")
	public static int anInt2816;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "Lclient!l;")
	public static Class98 aClass98_20 = new Class98(2);

	@OriginalMember(owner = "client!kl", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString102 = "rating: ";

	@OriginalMember(owner = "client!kl", name = "p", descriptor = "I")
	public static int anInt2815 = -1;

	@OriginalMember(owner = "client!kl", name = "q", descriptor = "Lclient!rc;")
	public static Class3_Sub26_Sub1 aClass3_Sub26_Sub1_1 = new Class3_Sub26_Sub1(5000);

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(III)J")
	public static long method2517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub25 local7 = Static146.aClass3_Sub25ArrayArrayArray7[arg0][arg1][arg2];
		return local7 == null || local7.aClass19_1 == null ? 0L : local7.aClass19_1.aLong20;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIII)I")
	public static int method2518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 7 - arg1;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)I")
	public static int method2519() {
		return Static177.aClass98_28.method2562();
	}
}
