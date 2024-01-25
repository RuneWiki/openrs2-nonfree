import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class194 implements Interface16 {

	@OriginalMember(owner = "client!m", name = "a", descriptor = "([IBJLclient!laa;)Ljava/lang/String;")
	@Override
	public String method4619(@OriginalArg(0) int[] arg0, @OriginalArg(2) long arg1, @OriginalArg(3) Class179 arg2) {
		if (Static492.aClass179_12 == arg2) {
			@Pc(13) Class75 local13 = Static86.aClass94_7.method2175(arg0[0]);
			return local13.method1456((int) arg1);
		} else if (Static80.aClass179_1 == arg2 || arg2 == Static527.aClass179_15) {
			@Pc(31) Class236 local31 = Static119.aClass244_4.method5726((int) arg1);
			return local31.aString53;
		} else if (Static249.aClass179_3 == arg2 || Static346.aClass179_7 == arg2 || Static340.aClass179_10 == arg2) {
			return Static86.aClass94_7.method2175(arg0[0]).method1456((int) arg1);
		} else {
			return null;
		}
	}
}
