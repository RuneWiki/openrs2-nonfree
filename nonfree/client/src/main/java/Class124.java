import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class124 implements Interface8 {

	@OriginalMember(owner = "client!li", name = "a", descriptor = "([IIJZ)Ljava/lang/String;")
	@Override
	public String method3457(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		if (arg1 == 0) {
			@Pc(19) Class1_Sub4_Sub19 local19 = Static330.method5564(arg0[0]);
			return local19.method3965((int) arg2);
		} else if (arg1 == 1 || arg1 == 10) {
			@Pc(39) Class22 local39 = Static243.aClass220_2.method5972((int) arg2);
			return local39.aString2;
		} else if (arg1 == 6 || arg1 == 7 || arg1 == 11) {
			return Static330.method5564(arg0[0]).method3965((int) arg2);
		} else {
			return null;
		}
	}
}
