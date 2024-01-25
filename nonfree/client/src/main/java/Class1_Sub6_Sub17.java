import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class1_Sub6_Sub17 extends Class1_Sub6 {

	@OriginalMember(owner = "client!wp", name = "u", descriptor = "I")
	public int anInt6381 = 0;

	static {
		new Class169("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!re;Z)V")
	public void method5543(@OriginalArg(0) Class1_Sub33 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5174();
			if (local5 == 0) {
				return;
			}
			this.method5546(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IILclient!re;)V")
	private void method5546(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		if (arg0 == 2) {
			this.anInt6381 = arg1.method5177();
		}
	}
}
