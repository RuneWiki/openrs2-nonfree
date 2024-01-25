import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dka")
public final class Class83 implements Interface21 {

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(JZ[ILclient!wg;)Ljava/lang/String;")
	@Override
	public String method2094(@OriginalArg(0) long arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class387 arg2) {
		if (arg2 == Static63.aClass387_20) {
			@Pc(13) Class300 local13 = Static466.aClass49_1.method1528(arg1[0]);
			return local13.method7155((int) arg0);
		} else if (Static515.aClass387_21 == arg2 || arg2 == Static487.aClass387_19) {
			@Pc(31) Class146 local31 = Static237.aClass371_2.method8305((int) arg0);
			return local31.aString46;
		} else if (arg2 == Static27.aClass387_2 || arg2 == Static142.aClass387_13 || Static568.aClass387_22 == arg2) {
			return Static466.aClass49_1.method1528(arg1[0]).method7155((int) arg0);
		} else {
			return null;
		}
	}
}
