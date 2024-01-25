import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class1_Sub2_Sub13 extends Class1_Sub2 {

	@OriginalMember(owner = "client!i", name = "K", descriptor = "I")
	private int anInt2861 = 4096;

	static {
		new Class96("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
	}

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub13() {
		super(1, true);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5868(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass264_41.method5969(arg0);
		if (super.aClass264_41.aBoolean657) {
			@Pc(30) int[] local30 = this.method5872(0, Static421.anInt7373 & arg0 - 1);
			@Pc(36) int[] local36 = this.method5872(0, arg0);
			@Pc(46) int[] local46 = this.method5872(0, Static421.anInt7373 & arg0 + 1);
			for (@Pc(48) int local48 = 0; local48 < Static410.anInt7198; local48++) {
				@Pc(62) int local62 = (local46[local48] - local30[local48]) * this.anInt2861;
				@Pc(81) int local81 = (local36[local48 + 1 & Static301.anInt5026] - local36[Static301.anInt5026 & local48 - 1]) * this.anInt2861;
				@Pc(85) int local85 = local81 >> 12;
				@Pc(89) int local89 = local62 >> 12;
				@Pc(95) int local95 = local85 * local85 >> 12;
				@Pc(101) int local101 = local89 * local89 >> 12;
				@Pc(115) int local115 = (int) (Math.sqrt((double) ((float) (local101 + local95 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(126) int local126 = local115 == 0 ? 0 : 16777216 / local115;
				local16[local48] = 4096 - local126;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ILclient!ti;I)V")
	@Override
	public void method5863(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2861 = arg0.method4498();
		}
	}
}
