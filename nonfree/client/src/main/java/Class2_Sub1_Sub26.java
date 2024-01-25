import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class2_Sub1_Sub26 extends Class2_Sub1 {

	static {
		new Class62("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
	}

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub26() {
		super(1, false);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6060(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass26_41.method350(arg0);
		if (super.aClass26_41.aBoolean41) {
			@Pc(26) int[][] local26 = this.method6061(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static391.anInt7118; local52++) {
				local42[local52] = 4096 - local30[local52];
				local46[local52] = 4096 - local34[local52];
				local50[local52] = 4096 - local38[local52];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IILclient!vt;)V")
	@Override
	public void method6064(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub24 arg1) {
		if (arg0 == 0) {
			super.aBoolean498 = arg1.method5732() == 1;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6059(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass156_41.method3899(arg0);
		if (super.aClass156_41.aBoolean318) {
			@Pc(26) int[] local26 = this.method6069(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static391.anInt7118; local28++) {
				local16[local28] = 4096 - local26[local28];
			}
		}
		return local16;
	}
}
