import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!fca", name = "w", descriptor = "Lclient!gga;")
	public static Class124 aClass124_42;

	@OriginalMember(owner = "client!fca", name = "A", descriptor = "Z")
	public static boolean aBoolean254;

	@OriginalMember(owner = "client!fca", name = "u", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_37 = new Class341(65, -1);

	@OriginalMember(owner = "client!fca", name = "y", descriptor = "Lclient!in;")
	public static final Class169 aClass169_78 = new Class169(46, -1);

	@OriginalMember(owner = "client!fca", name = "z", descriptor = "I")
	public static int anInt3387 = 0;

	@OriginalMember(owner = "client!fca", name = "B", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_38 = new Class341(54, 3);

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IILclient!gga;I)Lclient!jea;")
	public static Class2_Sub1_Sub9 method3161(@OriginalArg(0) int arg0, @OriginalArg(2) Class124 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class2_Sub8 local14 = new Class2_Sub8(arg1.method3641(arg0, arg2));
		@Pc(51) Class2_Sub1_Sub9 local51 = new Class2_Sub1_Sub9(arg2, local14.method5178(), local14.method5178(), local14.method5172(), local14.method5172(), local14.method5203() == 1, local14.method5203(), local14.method5203());
		@Pc(55) int local55 = local14.method5203();
		for (@Pc(57) int local57 = 0; local57 < local55; local57++) {
			local51.aClass271_26.method7174(new Class2_Sub29(local14.method5203(), local14.method5211(), local14.method5211(), local14.method5211(), local14.method5211(), local14.method5211(), local14.method5211(), local14.method5211(), local14.method5211()));
		}
		local51.method4705();
		return local51;
	}
}
