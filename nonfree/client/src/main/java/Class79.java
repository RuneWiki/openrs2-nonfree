import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class79 implements Interface10 {

	static {
		new Class96("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(BJ[ILclient!sv;)Ljava/lang/String;")
	@Override
	public String method1607(@OriginalArg(1) long arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class222 arg2) {
		if (Static390.aClass222_19 == arg2) {
			@Pc(18) Class74 local18 = Static178.aClass138_1.method3163(arg1[0]);
			return local18.method1462((int) arg0);
		} else if (arg2 == Static28.aClass222_4 || arg2 == Static401.aClass222_20) {
			@Pc(36) Class206 local36 = Static388.aClass193_3.method4249((int) arg0);
			return local36.aString72;
		} else if (Static205.aClass222_14 == arg2 || arg2 == Static379.aClass222_18 || arg2 == Static362.aClass222_16) {
			return Static178.aClass138_1.method3163(arg1[0]).method1462((int) arg0);
		} else {
			return null;
		}
	}
}
