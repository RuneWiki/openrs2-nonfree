import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public final class Class49_Sub2 extends Class49 {

	@OriginalMember(owner = "client!pd", name = "j", descriptor = "Lclient!al;")
	public final Class4_Sub1_Sub1 aClass4_Sub1_Sub1_5;

	static {
		new Class182("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
	}

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lclient!da;II[B)V")
	public Class49_Sub2(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass4_Sub1_Sub1_5 = Static141.method2403(arg1, arg0, arg3, arg2);
		this.aClass4_Sub1_Sub1_5.method154(false, false);
	}
}
