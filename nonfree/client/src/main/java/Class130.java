import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class130 implements Interface8 {

	static {
		new Class83("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(JB[ILclient!ho;)Ljava/lang/String;")
	@Override
	public String method3205(@OriginalArg(0) long arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class98 arg2) {
		if (Static289.aClass98_13 == arg2) {
			@Pc(15) Class200 local15 = Static416.aClass158_1.method3790(arg1[0]);
			return local15.method4538((int) arg0);
		} else if (Static446.aClass98_18 == arg2 || arg2 == Static340.aClass98_15) {
			@Pc(40) Class211 local40 = Static444.aClass206_3.method4703((int) arg0);
			return local40.aString61;
		} else if (arg2 == Static46.aClass98_11 || Static370.aClass98_16 == arg2 || arg2 == Static41.aClass98_3) {
			return Static416.aClass158_1.method3790(arg1[0]).method4538((int) arg0);
		} else {
			return null;
		}
	}
}
