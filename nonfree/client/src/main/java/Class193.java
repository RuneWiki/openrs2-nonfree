import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lga")
public final class Class193 implements Interface3 {

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(IJ[ILclient!vf;)Ljava/lang/String;")
	@Override
	public String method4643(@OriginalArg(1) long arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class342 arg2) {
		if (arg2 == Static198.aClass342_6) {
			@Pc(13) Class49 local13 = Static594.aClass9_1.method207(arg1[0]);
			return local13.method1308((int) arg0);
		} else if (Static99.aClass342_4 == arg2 || arg2 == Static309.aClass342_7) {
			@Pc(31) Class237 local31 = Static444.aClass322_2.method7141((int) arg0);
			return local31.aString58;
		} else if (Static314.aClass342_8 == arg2 || Static337.aClass342_10 == arg2 || Static480.aClass342_12 == arg2) {
			return Static594.aClass9_1.method207(arg1[0]).method1308((int) arg0);
		} else {
			return null;
		}
	}
}
