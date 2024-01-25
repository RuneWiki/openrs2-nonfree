import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public final class Class18 implements Interface20 {

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!wd;[IZJ)Ljava/lang/String;")
	@Override
	public String method314(@OriginalArg(0) Class358 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) long arg2) {
		if (arg0 == Static15.aClass358_1) {
			@Pc(13) Class233 local13 = Static584.aClass138_1.method3398(arg1[0]);
			return local13.method5426((int) arg2);
		} else if (Static60.aClass358_5 == arg0 || arg0 == Static336.aClass358_10) {
			@Pc(31) Class197 local31 = Static6.aClass92_1.method2673((int) arg2);
			return local31.aString38;
		} else if (arg0 == Static94.aClass358_8 || arg0 == Static522.aClass358_20 || Static47.aClass358_21 == arg0) {
			return Static584.aClass138_1.method3398(arg1[0]).method5426((int) arg2);
		} else {
			return null;
		}
	}
}
