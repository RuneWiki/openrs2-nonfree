import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class244 implements Interface1 {

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[IJLclient!lp;)Ljava/lang/String;")
	@Override
	public String method5559(@OriginalArg(1) int[] arg0, @OriginalArg(2) long arg1, @OriginalArg(3) Class188 arg2) {
		if (arg2 == Static557.aClass188_17) {
			@Pc(13) Class177 local13 = Static447.aClass338_3.method7594(arg0[0]);
			return local13.method3824((int) arg1);
		} else if (arg2 == Static238.aClass188_7 || Static169.aClass188_5 == arg2) {
			@Pc(36) Class110 local36 = Static295.aClass256_2.method5924((int) arg1);
			return local36.aString41;
		} else if (Static438.aClass188_14 == arg2 || arg2 == Static276.aClass188_8 || arg2 == Static441.aClass188_15) {
			return Static447.aClass338_3.method7594(arg0[0]).method3824((int) arg1);
		} else {
			return null;
		}
	}
}
