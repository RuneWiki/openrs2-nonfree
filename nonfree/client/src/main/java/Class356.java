import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vaa")
public final class Class356 implements Interface20 {

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(BLclient!mha;[IJ)Ljava/lang/String;")
	@Override
	public String method8030(@OriginalArg(1) Class222 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) long arg2) {
		if (arg0 == Static568.aClass222_17) {
			@Pc(13) Class159 local13 = Static587.aClass232_1.method5002(arg1[0]);
			return local13.method3414((int) arg2);
		} else if (arg0 == Static52.aClass222_7 || arg0 == Static476.aClass222_13) {
			@Pc(31) Class34 local31 = Static72.aClass225_2.method4789((int) arg2);
			return local31.aString11;
		} else if (Static337.aClass222_14 == arg0 || arg0 == Static457.aClass222_12 || Static58.aClass222_8 == arg0) {
			return Static587.aClass232_1.method5002(arg1[0]).method3414((int) arg2);
		} else {
			return null;
		}
	}
}
