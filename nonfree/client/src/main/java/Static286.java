import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!kaa", name = "l", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_163 = new Class194(14, 6);

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ILclient!mga;)Z")
	public static boolean method4618(@OriginalArg(1) Class220 arg0) {
		return Static1.aClass220_12 == arg0 || arg0 == Static601.aClass220_14 || Static579.aClass220_13 == arg0 || Static606.aClass220_15 == arg0;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ZII)I")
	public static int method4619(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local12 *= arg0;
			}
			arg1 >>= 0x1;
			arg0 *= arg0;
		}
		if (arg1 == 1) {
			return local12 * arg0;
		} else {
			return local12;
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(BILclient!uv;I)V")
	public static void method4620(@OriginalArg(1) int arg0, @OriginalArg(2) Class344 arg1, @OriginalArg(3) int arg2) {
		Static518.anInt8728 = arg0;
		Static291.anInt5615 = arg2;
		Static91.aClass344_2 = arg1;
	}
}
