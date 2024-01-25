import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public final class Class4_Sub19 extends Class4 {

	@OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
	public final int anInt3049;

	@OriginalMember(owner = "client!ii", name = "o", descriptor = "I")
	public final int anInt3052;

	@OriginalMember(owner = "client!ii", name = "q", descriptor = "I")
	public final int anInt3053;

	@OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
	public final int anInt3051;

	@OriginalMember(owner = "client!ii", name = "p", descriptor = "Z")
	public final boolean aBoolean225;

	@OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
	public final int anInt3048;

	static {
		new Class15("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
	}

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class4_Sub19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt3049 = arg1;
		this.anInt3052 = arg0;
		this.anInt3053 = arg3;
		this.anInt3051 = arg4;
		this.aBoolean225 = arg5;
		this.anInt3048 = arg2;
	}
}
