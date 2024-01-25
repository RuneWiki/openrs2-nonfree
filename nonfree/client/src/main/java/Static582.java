import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static582 {

	@OriginalMember(owner = "client!tm", name = "r", descriptor = "[Lclient!s;")
	public static Class21[] aClass21Array3;

	@OriginalMember(owner = "client!tm", name = "h", descriptor = "Lclient!ln;")
	public static final Class203 aClass203_5 = new Class203();

	@OriginalMember(owner = "client!tm", name = "o", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_138 = new Class218(8, 11);

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(III)V")
	public static void method8170(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class3_Sub11_Sub4 local9 = Static583.method8201(16, (long) arg1);
		local9.method2195();
		local9.anInt2394 = arg0;
	}
}
