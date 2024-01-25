import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIBI)V")
	public static void method4966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class3_Sub11_Sub4 local9 = Static583.method8201(11, (long) arg1);
		local9.method2195();
		local9.anInt2400 = arg2;
		local9.anInt2394 = arg0;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IB)V")
	public static void method4967(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static351.anInt5714 = arg0;
		Static208.aClass28_Sub7Array1 = new Class28_Sub7[Static292.anIntArray444[Static351.anInt5714] + 1];
		Static449.anInt7433 = 0;
		Static198.anInt10720 = 0;
	}
}
