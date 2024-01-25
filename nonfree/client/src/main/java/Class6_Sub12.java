import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class6_Sub12 extends Class6 {

	@OriginalMember(owner = "client!ds", name = "u", descriptor = "I")
	public final int anInt1957;

	@OriginalMember(owner = "client!ds", name = "q", descriptor = "I")
	public final int anInt1955;

	@OriginalMember(owner = "client!ds", name = "p", descriptor = "[I")
	public final int[] anIntArray114;

	@OriginalMember(owner = "client!ds", name = "w", descriptor = "[Z")
	public final boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!ds", name = "t", descriptor = "[[I")
	public final int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!ds", name = "r", descriptor = "[I")
	public final int[] anIntArray115;

	static {
		new Class267("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
	}

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(I[B)V")
	public Class6_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt1957 = arg0;
		@Pc(11) Class6_Sub1 local11 = new Class6_Sub1(arg1);
		this.anInt1955 = local11.method6433();
		this.anIntArray114 = new int[this.anInt1955];
		this.aBooleanArray5 = new boolean[this.anInt1955];
		this.anIntArrayArray10 = new int[this.anInt1955][];
		this.anIntArray115 = new int[this.anInt1955];
		for (@Pc(38) int local38 = 0; local38 < this.anInt1955; local38++) {
			this.anIntArray115[local38] = local11.method6433();
		}
		for (@Pc(58) int local58 = 0; local58 < this.anInt1955; local58++) {
			this.aBooleanArray5[local58] = local11.method6433() == 1;
		}
		for (@Pc(79) int local79 = 0; local79 < this.anInt1955; local79++) {
			this.anIntArray114[local79] = local11.method6485();
		}
		for (@Pc(99) int local99 = 0; local99 < this.anInt1955; local99++) {
			this.anIntArrayArray10[local99] = new int[local11.method6433()];
		}
		for (@Pc(116) int local116 = 0; local116 < this.anInt1955; local116++) {
			for (@Pc(120) int local120 = 0; local120 < this.anIntArrayArray10[local116].length; local120++) {
				this.anIntArrayArray10[local116][local120] = local11.method6433();
			}
		}
	}
}
