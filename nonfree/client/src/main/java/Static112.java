import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
	public static int anInt2016;

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
	public static int anInt2017;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!lh;B)Lclient!oh;")
	public static Class1_Sub3 method1698(@OriginalArg(0) Class1_Sub1 arg0) {
		arg0.method4130();
		@Pc(20) int local20 = arg0.method4130();
		@Pc(24) Class1_Sub3 local24 = Static79.method1379(local20);
		local24.anInt7832 = arg0.method4130();
		@Pc(35) int local35 = arg0.method4130();
		for (@Pc(37) int local37 = 0; local37 < local35; local37++) {
			@Pc(43) int local43 = arg0.method4130();
			local24.method6079(arg0, local43);
		}
		local24.method6074();
		return local24;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)Lclient!os;")
	public static Class26_Sub5 method1699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class211 local7 = Static268.aClass211ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class26_Sub5 local14 = local7.aClass26_Sub5_1;
			local7.aClass26_Sub5_1 = null;
			return local14;
		}
	}
}
