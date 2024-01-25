import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class255 implements Interface1 {

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "([IIJLclient!mt;)Ljava/lang/String;")
	@Override
	public String method6189(@OriginalArg(0) int[] arg0, @OriginalArg(2) long arg1, @OriginalArg(3) Class228 arg2) {
		if (arg2 == Static506.aClass228_12) {
			@Pc(21) Class330 local21 = Static249.aClass231_1.method5518(arg0[0]);
			return local21.method8024((int) arg1);
		} else if (arg2 == Static341.aClass228_7 || Static362.aClass228_8 == arg2) {
			@Pc(39) Class374 local39 = Static170.aClass370_1.method8900((int) arg1);
			return local39.aString121;
		} else if (Static154.aClass228_4 == arg2 || Static447.aClass228_9 == arg2 || Static5.aClass228_1 == arg2) {
			return Static249.aClass231_1.method5518(arg0[0]).method8024((int) arg1);
		} else {
			return null;
		}
	}
}
