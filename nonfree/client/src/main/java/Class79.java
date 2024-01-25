import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!du")
public final class Class79 implements Interface10 {

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(JLclient!lg;[IB)Ljava/lang/String;")
	@Override
	public String method1876(@OriginalArg(0) long arg0, @OriginalArg(1) Class201 arg1, @OriginalArg(2) int[] arg2) {
		if (arg1 == Static284.aClass201_25) {
			@Pc(13) Class129 local13 = Static327.aClass266_1.method6014(arg2[0]);
			return local13.method3227((int) arg0);
		} else if (arg1 == Static229.aClass201_46 || Static310.aClass201_43 == arg1) {
			@Pc(36) Class322 local36 = Static46.aClass234_1.method5390((int) arg0);
			return local36.aString89;
		} else if (Static331.aClass201_33 == arg1 || Static230.aClass201_34 == arg1 || arg1 == Static55.aClass201_10) {
			return Static327.aClass266_1.method6014(arg2[0]).method3227((int) arg0);
		} else {
			return null;
		}
	}
}
