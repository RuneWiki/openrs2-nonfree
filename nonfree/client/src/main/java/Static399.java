import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!nja", name = "qb", descriptor = "I")
	public static int anInt7112;

	@OriginalMember(owner = "client!nja", name = "rb", descriptor = "Lclient!tq;")
	public static final Class340 aClass340_41 = new Class340(8);

	@OriginalMember(owner = "client!nja", name = "b", descriptor = "(III)Z")
	public static boolean method5893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		@Pc(21) Class164 local21 = Static568.aClass315_5.method7511(arg1);
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local21.method3918(arg0);
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(B)I")
	public static int method5896() {
		if (Static493.aBoolean702) {
			return 6;
		} else if (Static355.aClass5_Sub3_Sub20_3 == null) {
			return 0;
		} else {
			@Pc(19) int local19 = Static355.aClass5_Sub3_Sub20_3.anInt10178;
			if (Static229.method3559(local19)) {
				return 1;
			} else if (Static408.method5981(local19)) {
				return 2;
			} else if (Static591.method8116(local19)) {
				return 3;
			} else if (Static335.method5134(local19)) {
				return 4;
			} else {
				return 5;
			}
		}
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(IIB)Z")
	public static boolean method5900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static169.method2949(arg0, arg1) | Static378.method5638(arg0, arg1) | Static270.method4167(arg1, arg0)) & Static195.method3231(arg0, arg1);
	}
}
