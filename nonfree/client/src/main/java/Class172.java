import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jt")
public final class Class172 implements Interface23 {

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(JI[ILclient!ja;)Ljava/lang/String;")
	@Override
	public String method4316(@OriginalArg(0) long arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class158 arg2) {
		if (arg2 == Static351.aClass158_10) {
			@Pc(19) Class129 local19 = Static11.aClass155_1.method3928(arg1[0]);
			return local19.method3303((int) arg0);
		} else if (arg2 == Static216.aClass158_7 || Static475.aClass158_15 == arg2) {
			@Pc(37) Class339 local37 = Static517.aClass145_1.method3798((int) arg0);
			return local37.aString120;
		} else if (Static124.aClass158_5 == arg2 || arg2 == Static488.aClass158_16 || arg2 == Static367.aClass158_11) {
			return Static11.aClass155_1.method3928(arg1[0]).method3303((int) arg0);
		} else {
			return null;
		}
	}
}
