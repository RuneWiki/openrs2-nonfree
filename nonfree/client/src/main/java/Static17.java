import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!aj", name = "P", descriptor = "I")
	public static int anInt432 = 0;

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(II)I")
	public static int method511(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(III)V")
	public static void method513(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class3_Sub11_Sub4 local9 = Static583.method8201(17, (long) arg1);
		local9.method2195();
		local9.anInt2394 = arg0;
	}
}
