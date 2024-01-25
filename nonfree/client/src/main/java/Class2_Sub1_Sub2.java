import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class2_Sub1_Sub2 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ck", name = "L", descriptor = "I")
	private int anInt1004 = 1024;

	@OriginalMember(owner = "client!ck", name = "N", descriptor = "I")
	private int anInt1006 = 2048;

	@OriginalMember(owner = "client!ck", name = "M", descriptor = "I")
	private int anInt1005 = 3072;

	static {
		new Class62("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
		new Class62("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
	}

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub2() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6059(@OriginalArg(0) int arg0) {
		@Pc(20) int[] local20 = super.aClass156_41.method3899(arg0);
		if (super.aClass156_41.aBoolean318) {
			@Pc(30) int[] local30 = this.method6069(0, arg0);
			for (@Pc(32) int local32 = 0; local32 < Static391.anInt7118; local32++) {
				local20[local32] = (this.anInt1006 * local30[local32] >> 12) + this.anInt1004;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6060(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass26_41.method350(arg0);
		if (super.aClass26_41.aBoolean41) {
			@Pc(23) int[][] local23 = this.method6061(0, arg0);
			@Pc(27) int[] local27 = local23[0];
			@Pc(31) int[] local31 = local23[1];
			@Pc(35) int[] local35 = local23[2];
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[1];
			@Pc(47) int[] local47 = local11[2];
			for (@Pc(49) int local49 = 0; local49 < Static391.anInt7118; local49++) {
				local39[local49] = (local27[local49] * this.anInt1006 >> 12) + this.anInt1004;
				local43[local49] = (local31[local49] * this.anInt1006 >> 12) + this.anInt1004;
				local47[local49] = (local35[local49] * this.anInt1006 >> 12) + this.anInt1004;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)V")
	@Override
	public void method6067() {
		this.anInt1006 = this.anInt1005 - this.anInt1004;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IILclient!vt;)V")
	@Override
	public void method6064(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt1004 = arg1.method5753();
		} else if (arg0 == 1) {
			this.anInt1005 = arg1.method5753();
		} else if (arg0 == 2) {
			super.aBoolean498 = arg1.method5732() == 1;
		}
	}
}
