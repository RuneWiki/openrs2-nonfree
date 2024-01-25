import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!rm", name = "z", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_166 = new Class41(2, -1);

	@OriginalMember(owner = "client!rm", name = "E", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_141 = new Class77(95, 3);

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILclient!gh;)V")
	public static void method4837(@OriginalArg(1) Class2_Sub2 arg0) {
		if (arg0.aClass2_Sub4_5 != null) {
			arg0.aClass2_Sub4_5.anInt953 = 0;
		}
		arg0.aBoolean431 = false;
		for (@Pc(22) Class2_Sub2 local22 = arg0.method4832(); local22 != null; local22 = arg0.method4830()) {
			method4837(local22);
		}
	}
}
