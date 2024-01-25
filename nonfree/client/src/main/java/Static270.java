import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!kga", name = "c", descriptor = "Lclient!tj;")
	public static Class316 aClass316_4;

	@OriginalMember(owner = "client!kga", name = "f", descriptor = "I")
	public static int anInt5668;

	@OriginalMember(owner = "client!kga", name = "i", descriptor = "Lclient!lq;")
	public static Class202 aClass202_4;

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_41 = new Class344(2, 4);

	@OriginalMember(owner = "client!kga", name = "j", descriptor = "I")
	public static int anInt5671 = 0;

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(BII)Z")
	public static boolean method4365(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(III)I")
	public static int method4366(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg0 > 0) {
			local7 = local7 << 1 | arg1 & 0x1;
			arg0--;
			arg1 >>>= 0x1;
		}
		return local7;
	}
}
