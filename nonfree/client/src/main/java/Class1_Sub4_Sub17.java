import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ht")
public final class Class1_Sub4_Sub17 extends Class1_Sub4 {

	@OriginalMember(owner = "client!ht", name = "K", descriptor = "I")
	private int anInt2677 = 204;

	@OriginalMember(owner = "client!ht", name = "O", descriptor = "I")
	private int anInt2681 = 1;

	@OriginalMember(owner = "client!ht", name = "J", descriptor = "I")
	private int anInt2676 = 1;

	static {
		new Class119("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
	}

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub17() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5683(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass2_41.method10(arg0);
		if (super.aClass2_41.aBoolean5) {
			for (@Pc(22) int local22 = 0; local22 < Static395.anInt6592; local22++) {
				@Pc(28) int local28 = Static119.anIntArray146[local22];
				@Pc(32) int local32 = Static419.anIntArray472[arg0];
				@Pc(39) int local39 = local28 * this.anInt2681 >> 12;
				@Pc(46) int local46 = this.anInt2676 * local32 >> 12;
				@Pc(56) int local56 = this.anInt2681 * (local28 % (4096 / this.anInt2681));
				@Pc(66) int local66 = local32 % (4096 / this.anInt2676) * this.anInt2676;
				if (local66 < this.anInt2677) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 != 1) {
						local11[local22] = 0;
						continue;
					}
					if (this.anInt2677 > local56) {
						local11[local22] = 0;
						continue;
					}
				}
				if (this.anInt2677 > local56) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 > 0) {
						local11[local22] = 0;
						continue;
					}
				}
				local11[local22] = 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lclient!ug;II)V")
	@Override
	public void method5690(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2681 = arg0.method5337();
		} else if (arg1 == 1) {
			this.anInt2676 = arg0.method5337();
		} else if (arg1 == 2) {
			this.anInt2677 = arg0.method5335();
		}
	}
}
