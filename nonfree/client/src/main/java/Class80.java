import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class80 implements Interface3 {

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!kl;ZJ[I)Ljava/lang/String;")
	@Override
	public String method2011(@OriginalArg(0) Class142 arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int[] arg2) {
		if (arg0 == Static388.aClass142_123) {
			@Pc(18) Class255 local18 = Static390.aClass125_1.method2841(arg2[0]);
			return local18.method5653((int) arg1);
		} else if (Static212.aClass142_73 == arg0 || Static160.aClass142_75 == arg0) {
			@Pc(36) Class45 local36 = Static318.aClass144_6.method3265((int) arg1);
			return local36.aString6;
		} else if (arg0 == Static287.aClass142_93 || arg0 == Static274.aClass142_89 || Static259.aClass142_83 == arg0) {
			return Static390.aClass125_1.method2841(arg2[0]).method5653((int) arg1);
		} else {
			return null;
		}
	}
}
