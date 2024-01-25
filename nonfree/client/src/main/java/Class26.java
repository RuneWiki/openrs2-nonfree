import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!au")
public final class Class26 implements Interface18 {

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(J[IILclient!gh;)Ljava/lang/String;")
	@Override
	public String method351(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Class131 arg2) {
		if (arg2 == Static558.aClass131_14) {
			@Pc(13) Class221 local13 = Static548.aClass190_1.method4808(arg1[0]);
			return local13.method5370((int) arg0);
		} else if (arg2 == Static110.aClass131_4 || Static181.aClass131_18 == arg2) {
			@Pc(31) Class238 local31 = Static110.aClass105_1.method2659((int) arg0);
			return local31.aString57;
		} else if (Static174.aClass131_6 == arg2 || Static573.aClass131_19 == arg2 || arg2 == Static607.aClass131_16) {
			return Static548.aClass190_1.method4808(arg1[0]).method5370((int) arg0);
		} else {
			return null;
		}
	}
}
