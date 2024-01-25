import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class Class108 implements Interface7 {

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "([IBLclient!qu;J)Ljava/lang/String;")
	@Override
	public String method2553(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class204 arg1, @OriginalArg(3) long arg2) {
		if (arg1 == Static153.aClass204_9) {
			@Pc(13) Class165 local13 = Static389.aClass242_1.method5431(arg0[0]);
			return local13.method3794((int) arg2);
		} else if (Static205.aClass204_13 == arg1 || arg1 == Static58.aClass204_7) {
			@Pc(31) Class152 local31 = Static165.aClass19_1.method560((int) arg2);
			return local31.aString34;
		} else if (arg1 == Static8.aClass204_1 || Static26.aClass204_2 == arg1 || arg1 == Static297.aClass204_14) {
			return Static389.aClass242_1.method5431(arg0[0]).method3794((int) arg2);
		} else {
			return null;
		}
	}
}
