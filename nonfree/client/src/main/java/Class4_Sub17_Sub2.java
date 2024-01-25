import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public final class Class4_Sub17_Sub2 extends Class4_Sub17 {

	static {
		new Class21("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
	}

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(IIIIIF)V")
	public Class4_Sub17_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BIII)V")
	@Override
	public void method6157(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.anInt7725 = arg0;
		super.anInt7718 = arg1;
		super.anInt7716 = arg2;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BF)V")
	@Override
	public void method6164(@OriginalArg(1) float arg0) {
		super.aFloat96 = arg0;
	}
}
