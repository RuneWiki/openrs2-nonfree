import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class6_Sub9 extends Class6 {

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
	public final int anInt1600;

	@OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
	public final int anInt1604;

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "[I")
	public final int[] anIntArray164;

	@OriginalMember(owner = "client!eb", name = "r", descriptor = "[I")
	public final int[] anIntArray165;

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "[[I")
	public final int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "[Z")
	public final boolean[] aBooleanArray11;

	static {
		new Class231("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
	}

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(I[B)V")
	public Class6_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt1600 = arg0;
		@Pc(11) Class6_Sub15 local11 = new Class6_Sub15(arg1);
		this.anInt1604 = local11.method3111();
		this.anIntArray164 = new int[this.anInt1604];
		this.anIntArray165 = new int[this.anInt1604];
		this.anIntArrayArray19 = new int[this.anInt1604][];
		this.aBooleanArray11 = new boolean[this.anInt1604];
		for (@Pc(38) int local38 = 0; local38 < this.anInt1604; local38++) {
			this.anIntArray165[local38] = local11.method3111();
		}
		for (@Pc(58) int local58 = 0; local58 < this.anInt1604; local58++) {
			this.aBooleanArray11[local58] = local11.method3111() == 1;
		}
		for (@Pc(79) int local79 = 0; local79 < this.anInt1604; local79++) {
			this.anIntArray164[local79] = local11.method3108();
		}
		for (@Pc(95) int local95 = 0; local95 < this.anInt1604; local95++) {
			this.anIntArrayArray19[local95] = new int[local11.method3111()];
		}
		for (@Pc(116) int local116 = 0; local116 < this.anInt1604; local116++) {
			for (@Pc(120) int local120 = 0; local120 < this.anIntArrayArray19[local116].length; local120++) {
				this.anIntArrayArray19[local116][local120] = local11.method3111();
			}
		}
	}
}
