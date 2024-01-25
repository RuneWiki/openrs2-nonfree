import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class2_Sub4 extends Class2 {

	@OriginalMember(owner = "client!ah", name = "w", descriptor = "I")
	public final int anInt168;

	@OriginalMember(owner = "client!ah", name = "z", descriptor = "I")
	public final int anInt169;

	@OriginalMember(owner = "client!ah", name = "o", descriptor = "[I")
	public final int[] anIntArray22;

	@OriginalMember(owner = "client!ah", name = "C", descriptor = "[[I")
	public final int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!ah", name = "y", descriptor = "[I")
	public final int[] anIntArray23;

	@OriginalMember(owner = "client!ah", name = "v", descriptor = "[Z")
	public final boolean[] aBooleanArray3;

	static {
		new Class140("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
		new Class140("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
	}

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(I[B)V")
	public Class2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt168 = arg0;
		@Pc(11) Class2_Sub12 local11 = new Class2_Sub12(arg1);
		this.anInt169 = local11.method3124();
		this.anIntArray22 = new int[this.anInt169];
		this.anIntArrayArray3 = new int[this.anInt169][];
		this.anIntArray23 = new int[this.anInt169];
		this.aBooleanArray3 = new boolean[this.anInt169];
		for (@Pc(38) int local38 = 0; local38 < this.anInt169; local38++) {
			this.anIntArray23[local38] = local11.method3124();
		}
		for (@Pc(54) int local54 = 0; local54 < this.anInt169; local54++) {
			this.aBooleanArray3[local54] = local11.method3124() == 1;
		}
		for (@Pc(79) int local79 = 0; local79 < this.anInt169; local79++) {
			this.anIntArray22[local79] = local11.method3104();
		}
		for (@Pc(95) int local95 = 0; local95 < this.anInt169; local95++) {
			this.anIntArrayArray3[local95] = new int[local11.method3124()];
		}
		for (@Pc(116) int local116 = 0; local116 < this.anInt169; local116++) {
			for (@Pc(120) int local120 = 0; local120 < this.anIntArrayArray3[local116].length; local120++) {
				this.anIntArrayArray3[local116][local120] = local11.method3124();
			}
		}
	}
}
