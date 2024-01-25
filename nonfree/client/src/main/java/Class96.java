import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!faa")
public final class Class96 implements Interface16 {

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(Lclient!oca;JB[I)Ljava/lang/String;")
	@Override
	public String method2686(@OriginalArg(0) Class225 arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int[] arg2) {
		if (Static148.aClass225_15 == arg0) {
			@Pc(13) Class305 local13 = Static461.aClass95_1.method2637(arg2[0]);
			return local13.method7724((int) arg1);
		} else if (arg0 == Static310.aClass225_23 || Static200.aClass225_9 == arg0) {
			@Pc(31) Class56 local31 = Static150.aClass254_2.method6340((int) arg1);
			return local31.aString12;
		} else if (arg0 == Static533.aClass225_27 || Static466.aClass225_22 == arg0 || Static542.aClass225_28 == arg0) {
			return Static461.aClass95_1.method2637(arg2[0]).method7724((int) arg1);
		} else {
			return null;
		}
	}
}
