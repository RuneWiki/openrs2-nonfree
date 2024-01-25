import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aja")
public final class Class16 implements Interface25 {

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(JB[ILclient!rh;)Ljava/lang/String;")
	@Override
	public String method270(@OriginalArg(0) long arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class307 arg2) {
		if (Static255.aClass307_5 == arg2) {
			@Pc(13) Class82 local13 = Static429.aClass309_1.method7317(arg1[0]);
			return local13.method1801((int) arg0);
		} else if (Static435.aClass307_12 == arg2 || Static496.aClass307_15 == arg2) {
			@Pc(31) Class219 local31 = Static259.aClass135_1.method2776((int) arg0);
			return local31.aString61;
		} else if (Static352.aClass307_8 == arg2 || arg2 == Static394.aClass307_9 || Static408.aClass307_11 == arg2) {
			return Static429.aClass309_1.method7317(arg1[0]).method1801((int) arg0);
		} else {
			return null;
		}
	}
}
