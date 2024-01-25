import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class186 implements Interface17 {

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lclient!bn;J[IB)Ljava/lang/String;")
	@Override
	public String method4614(@OriginalArg(0) Class31 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int[] arg2) {
		if (Static450.aClass31_15 == arg0) {
			@Pc(23) Class214 local23 = Static4.aClass191_1.method4745(arg2[0]);
			return local23.method5120((int) arg1);
		} else if (Static359.aClass31_11 == arg0 || Static4.aClass31_1 == arg0) {
			@Pc(41) Class133 local41 = Static342.aClass250_2.method5980((int) arg1);
			return local41.aString38;
		} else if (arg0 == Static490.aClass31_18 || arg0 == Static391.aClass31_14 || Static480.aClass31_17 == arg0) {
			return Static4.aClass191_1.method4745(arg2[0]).method5120((int) arg1);
		} else {
			return null;
		}
	}
}
