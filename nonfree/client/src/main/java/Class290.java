import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rt")
public final class Class290 implements Interface17 {

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(BJLclient!mv;[I)Ljava/lang/String;")
	@Override
	public String method7106(@OriginalArg(1) long arg0, @OriginalArg(2) Class219 arg1, @OriginalArg(3) int[] arg2) {
		if (arg1 == Static139.aClass219_7) {
			@Pc(18) Class227 local18 = Static547.aClass207_1.method5258(arg2[0]);
			return local18.method5828((int) arg0);
		} else if (Static193.aClass219_3 == arg1 || Static88.aClass219_1 == arg1) {
			@Pc(38) Class18 local38 = Static517.aClass23_2.method901((int) arg0);
			return local38.aString6;
		} else if (Static152.aClass219_10 == arg1 || arg1 == Static274.aClass219_14 || arg1 == Static213.aClass219_11) {
			return Static547.aClass207_1.method5258(arg2[0]).method5828((int) arg0);
		} else {
			return null;
		}
	}
}
