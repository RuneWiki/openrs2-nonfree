import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class403 implements Interface27 {

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!ji;JB[I)Ljava/lang/String;")
	@Override
	public String method9476(@OriginalArg(0) Class197 arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int[] arg2) {
		if (arg0 == Static30.aClass197_1) {
			@Pc(19) Class54 local19 = Static10.aClass57_1.method1192(arg2[0]);
			return local19.method1097((int) arg1);
		} else if (arg0 == Static475.aClass197_20 || Static171.aClass197_10 == arg0) {
			@Pc(39) Class203 local39 = Static543.aClass37_2.method605((int) arg1);
			return local39.aString52;
		} else if (arg0 == Static639.aClass197_28 || arg0 == Static142.aClass197_12 || Static114.aClass197_6 == arg0) {
			return Static10.aClass57_1.method1192(arg2[0]).method1097((int) arg1);
		} else {
			return null;
		}
	}
}
