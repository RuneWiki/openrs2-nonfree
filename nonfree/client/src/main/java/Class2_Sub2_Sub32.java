import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class2_Sub2_Sub32 extends Class2_Sub2 {

	@OriginalMember(owner = "client!tg", name = "M", descriptor = "Z")
	private boolean aBoolean544 = true;

	@OriginalMember(owner = "client!tg", name = "O", descriptor = "I")
	private int anInt6068 = 4096;

	static {
		new Class93("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
	}

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILclient!dg;I)V")
	@Override
	public void method5882(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		if (arg0 == 0) {
			this.anInt6068 = arg1.method4464();
		} else if (arg0 == 1) {
			this.aBoolean544 = arg1.method4421() == 1;
		}
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5884(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass88_41.method2632(arg0);
		if (super.aClass88_41.aBoolean238) {
			@Pc(25) int[] local25 = this.method5876(0, Static285.anInt5782 & arg0 - 1);
			@Pc(31) int[] local31 = this.method5876(0, arg0);
			@Pc(41) int[] local41 = this.method5876(0, arg0 + 1 & Static285.anInt5782);
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static339.anInt6735; local55++) {
				@Pc(69) int local69 = this.anInt6068 * (local41[local55] - local25[local55]);
				@Pc(88) int local88 = this.anInt6068 * (local31[local55 + 1 & Static25.anInt1346] - local31[local55 - 1 & Static25.anInt1346]);
				@Pc(92) int local92 = local88 >> 12;
				@Pc(96) int local96 = local69 >> 12;
				@Pc(102) int local102 = local92 * local92 >> 12;
				@Pc(108) int local108 = local96 * local96 >> 12;
				@Pc(123) int local123 = (int) (Math.sqrt((double) ((float) (local102 + local108 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(133) int local133;
				@Pc(129) int local129;
				@Pc(137) int local137;
				if (local123 == 0) {
					local129 = 0;
					local133 = 0;
					local137 = 0;
				} else {
					local129 = local69 / local123;
					local133 = local88 / local123;
					local137 = 16777216 / local123;
				}
				if (this.aBoolean544) {
					local133 = (local133 >> 1) + 2048;
					local137 = (local137 >> 1) + 2048;
					local129 = (local129 >> 1) + 2048;
				}
				local45[local55] = local133;
				local49[local55] = local129;
				local53[local55] = local137;
			}
		}
		return local11;
	}
}
