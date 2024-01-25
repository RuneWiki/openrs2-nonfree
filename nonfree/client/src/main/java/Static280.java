import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!kaa", name = "q", descriptor = "Lclient!pc;")
	public static Class255 aClass255_3;

	@OriginalMember(owner = "client!kaa", name = "u", descriptor = "Lclient!in;")
	public static Class157 aClass157_136;

	@OriginalMember(owner = "client!kaa", name = "x", descriptor = "Lclient!db;")
	public static Class2_Sub6_Sub3 aClass2_Sub6_Sub3_3;

	@OriginalMember(owner = "client!kaa", name = "m", descriptor = "Lclient!tr;")
	public static final Class332 aClass332_4 = new Class332();

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(II[III)V")
	public static void method5108(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg2--;
		@Pc(7) int local7 = arg0 - 1;
		@Pc(11) int local11 = local7 - 7;
		while (local11 > arg2) {
			@Pc(17) int local17 = arg2 + 1;
			arg1[local17] = arg3;
			@Pc(22) int local22 = local17 + 1;
			arg1[local22] = arg3;
			@Pc(27) int local27 = local22 + 1;
			arg1[local27] = arg3;
			@Pc(32) int local32 = local27 + 1;
			arg1[local32] = arg3;
			@Pc(37) int local37 = local32 + 1;
			arg1[local37] = arg3;
			@Pc(42) int local42 = local37 + 1;
			arg1[local42] = arg3;
			@Pc(47) int local47 = local42 + 1;
			arg1[local47] = arg3;
			arg2 = local47 + 1;
			arg1[arg2] = arg3;
		}
		while (local7 > arg2) {
			arg2++;
			arg1[arg2] = arg3;
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IB)V")
	public static void method5109(@OriginalArg(0) int arg0) {
		Static26.anInt543 = 2;
		Static291.anInt6172 = arg0;
		if (Static431.aString91 == null) {
			Static557.method8312(35);
		} else {
			@Pc(24) Class2_Sub11 local24 = new Class2_Sub11(Static341.method5874(Static344.method5903(Static431.aString91)));
			@Pc(28) long local28 = local24.method8361();
			Static476.aLong219 = local24.method8361();
			Static380.method6293(Static224.method4292(local28), true, "");
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(III)Z")
	public static boolean method5110(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}
}
