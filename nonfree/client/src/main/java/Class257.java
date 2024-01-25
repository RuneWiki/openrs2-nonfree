import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class257 implements Interface3 {

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(JLclient!de;B[I)Ljava/lang/String;")
	@Override
	public String method5449(@OriginalArg(0) long arg0, @OriginalArg(1) Class50 arg1, @OriginalArg(3) int[] arg2) {
		if (Static303.aClass50_22 == arg1) {
			@Pc(13) Class244 local13 = Static128.aClass11_1.method172(arg2[0]);
			return local13.method5158((int) arg0);
		} else if (Static147.aClass50_8 == arg1 || arg1 == Static397.aClass50_25) {
			@Pc(36) Class208 local36 = Static384.aClass164_2.method3458((int) arg0);
			return local36.lb;
		} else if (Static396.aClass50_30 == arg1 || Static258.aClass50_19 == arg1 || arg1 == Static402.aClass50_26) {
			return Static128.aClass11_1.method172(arg2[0]).method5158((int) arg0);
		} else {
			return null;
		}
	}
}
