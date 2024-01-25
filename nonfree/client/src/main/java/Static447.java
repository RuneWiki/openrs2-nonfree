import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static447 {

	@OriginalMember(owner = "client!se", name = "l", descriptor = "I")
	public static int anInt8134;

	@OriginalMember(owner = "client!se", name = "A", descriptor = "F")
	public static float aFloat181;

	@OriginalMember(owner = "client!se", name = "C", descriptor = "Lclient!fi;")
	public static Class12_Sub4_Sub7 aClass12_Sub4_Sub7_3;

	@OriginalMember(owner = "client!se", name = "t", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_75 = new Class77(56, -1);

	@OriginalMember(owner = "client!se", name = "E", descriptor = "I")
	public static int anInt8149 = 0;

	@OriginalMember(owner = "client!se", name = "F", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_130 = new Class45(25, 19);

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ZCI)I")
	public static int method6758(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local12 = (arg0 << 4) + 1;
		}
		if (arg0 == 'ñ' && arg1 == 0) {
			local12 = 1762;
		}
		return local12;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(III)Z")
	public static boolean method6759(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 | Static412.method6427(arg0, arg1) || Static226.method4100(arg0, arg1);
	}
}
