import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public final class Class52 {

	@OriginalMember(owner = "client!dk", name = "j", descriptor = "S")
	public final short aShort19;

	@OriginalMember(owner = "client!dk", name = "o", descriptor = "Z")
	public final boolean aBoolean93;

	@OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
	public final int anInt1684;

	@OriginalMember(owner = "client!dk", name = "f", descriptor = "S")
	public final short aShort18;

	@OriginalMember(owner = "client!dk", name = "r", descriptor = "B")
	public final byte aByte26;

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "S")
	public final short aShort17;

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
	public final int anInt1679;

	@OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
	public final int anInt1680;

	@OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
	public final int anInt1681;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
	public final int anInt1677;

	@OriginalMember(owner = "client!dk", name = "m", descriptor = "B")
	public final byte aByte25;

	static {
		new Class7("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
	}

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class52(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aShort19 = (short) arg4;
		this.aBoolean93 = arg10;
		this.anInt1684 = arg2;
		this.aShort18 = (short) arg6;
		this.aByte26 = (byte) arg8;
		this.aShort17 = (short) arg5;
		this.anInt1679 = arg0;
		this.anInt1680 = arg1;
		this.anInt1681 = arg3;
		this.anInt1677 = arg11;
		this.aByte25 = (byte) arg7;
	}
}
