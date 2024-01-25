import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public final class Class320 implements Interface16 {

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(JBLclient!fv;[I)Ljava/lang/String;")
	@Override
	public String method7633(@OriginalArg(0) long arg0, @OriginalArg(2) Class112 arg1, @OriginalArg(3) int[] arg2) {
		if (arg1 == Static486.aClass112_13) {
			@Pc(21) Class252 local21 = Static550.aClass94_1.method2506(arg2[0]);
			return local21.method6269((int) arg0);
		} else if (Static175.aClass112_6 == arg1 || arg1 == Static539.aClass112_15) {
			@Pc(39) Class145 local39 = Static98.aClass203_1.method4899((int) arg0);
			return local39.aString52;
		} else if (Static247.aClass112_7 == arg1 || arg1 == Static434.aClass112_10 || arg1 == Static3.aClass112_9) {
			return Static550.aClass94_1.method2506(arg2[0]).method6269((int) arg0);
		} else {
			return null;
		}
	}
}
