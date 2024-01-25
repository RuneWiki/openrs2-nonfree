import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pv")
public final class Class269 implements Interface1 {

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IJLclient!vea;[I)Ljava/lang/String;")
	@Override
	public String method6822(@OriginalArg(1) long arg0, @OriginalArg(2) Class352 arg1, @OriginalArg(3) int[] arg2) {
		if (arg1 == Static643.aClass352_14) {
			@Pc(13) Class313 local13 = Static251.aClass43_1.method1765(arg2[0]);
			return local13.method7525((int) arg0);
		} else if (Static394.aClass352_7 == arg1 || arg1 == Static611.aClass352_13) {
			@Pc(31) Class306 local31 = Static356.aClass221_1.method5923((int) arg0);
			return local31.aString93;
		} else if (arg1 == Static428.aClass352_9 || arg1 == Static440.aClass352_10 || Static528.aClass352_11 == arg1) {
			return Static251.aClass43_1.method1765(arg2[0]).method7525((int) arg0);
		} else {
			return null;
		}
	}
}
