import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class1_Sub1_Sub15 extends Class1_Sub1 {

	@OriginalMember(owner = "client!hl", name = "N", descriptor = "Z")
	private boolean aBoolean206 = true;

	@OriginalMember(owner = "client!hl", name = "Q", descriptor = "I")
	private int anInt2604 = 4096;

	static {
		new Class151("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
		new Class151("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
	}

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub15() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5626(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass117_41.method2345(arg0);
		if (super.aClass117_41.aBoolean221) {
			@Pc(34) int[] local34 = this.method5620(Static249.anInt4068 & arg0 - 1, 0);
			@Pc(44) int[] local44 = this.method5620(arg0, 0);
			@Pc(54) int[] local54 = this.method5620(arg0 + 1 & Static249.anInt4068, 0);
			@Pc(58) int[] local58 = local11[0];
			@Pc(62) int[] local62 = local11[1];
			@Pc(66) int[] local66 = local11[2];
			for (@Pc(68) int local68 = 0; local68 < Static434.anInt4326; local68++) {
				@Pc(82) int local82 = (local54[local68] - local34[local68]) * this.anInt2604;
				@Pc(102) int local102 = this.anInt2604 * (local44[local68 + 1 & Static429.anInt7144] - local44[local68 - 1 & Static429.anInt7144]);
				@Pc(106) int local106 = local102 >> 12;
				@Pc(110) int local110 = local82 >> 12;
				@Pc(116) int local116 = local106 * local106 >> 12;
				@Pc(122) int local122 = local110 * local110 >> 12;
				@Pc(136) int local136 = (int) (Math.sqrt((double) ((float) (local122 + local116 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(149) int local149;
				@Pc(145) int local145;
				@Pc(153) int local153;
				if (local136 == 0) {
					local145 = 0;
					local149 = 0;
					local153 = 0;
				} else {
					local145 = local82 / local136;
					local149 = local102 / local136;
					local153 = 16777216 / local136;
				}
				if (this.aBoolean206) {
					local149 = (local149 >> 1) + 2048;
					local145 = (local145 >> 1) + 2048;
					local153 = (local153 >> 1) + 2048;
				}
				local58[local68] = local149;
				local62[local68] = local145;
				local66[local68] = local153;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILclient!dh;I)V")
	@Override
	public void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt2604 = arg1.method4485();
		} else if (arg0 == 1) {
			this.aBoolean206 = arg1.method4463() == 1;
		}
	}
}
