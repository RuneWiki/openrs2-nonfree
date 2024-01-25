import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class1_Sub3_Sub36 extends Class1_Sub3 {

	@OriginalMember(owner = "client!vq", name = "E", descriptor = "[I")
	private int[] anIntArray759;

	@OriginalMember(owner = "client!vq", name = "M", descriptor = "[I")
	private int[] anIntArray761;

	@OriginalMember(owner = "client!vq", name = "C", descriptor = "I")
	private int anInt8829 = 2048;

	@OriginalMember(owner = "client!vq", name = "D", descriptor = "I")
	private int anInt8830 = 0;

	@OriginalMember(owner = "client!vq", name = "J", descriptor = "I")
	private int anInt8834 = 10;

	static {
		new Class114("Your friends list is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
	}

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vq", name = "g", descriptor = "(I)V")
	@Override
	public void method7912() {
		this.method7413();
	}

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method7906(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass227_41.method5672(arg0);
		if (super.aClass227_41.aBoolean433) {
			@Pc(19) int local19 = Static305.anIntArray416[arg0];
			@Pc(28) int local28;
			if (this.anInt8830 == 0) {
				@Pc(135) short local135 = 0;
				for (local28 = 0; local28 < this.anInt8834; local28++) {
					if (local19 >= this.anIntArray761[local28] && local19 < this.anIntArray761[local28 + 1]) {
						if (local19 < this.anIntArray759[local28]) {
							local135 = 4096;
						}
						break;
					}
				}
				Static555.method5097(local11, 0, Static236.anInt4609, local135);
			} else {
				for (@Pc(24) int local24 = 0; local24 < Static236.anInt4609; local24++) {
					local28 = 0;
					@Pc(30) short local30 = 0;
					@Pc(34) int local34 = Static201.anIntArray324[local24];
					@Pc(37) int local37 = this.anInt8830;
					if (local37 == 1) {
						local28 = local34;
					} else if (local37 == 2) {
						local28 = (local19 + local34 - 4096 >> 1) + 2048;
					} else if (local37 == 3) {
						local28 = (local34 - local19 >> 1) + 2048;
					}
					for (local37 = 0; local37 < this.anInt8834; local37++) {
						if (this.anIntArray761[local37] <= local28 && this.anIntArray761[local37 + 1] > local28) {
							if (local28 < this.anIntArray759[local37]) {
								local30 = 4096;
							}
							break;
						}
					}
					local11[local24] = local30;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!gw;II)V")
	@Override
	public void method7901(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8834 = arg0.method3043();
		} else if (arg1 == 1) {
			this.anInt8829 = arg0.method3056();
		} else if (arg1 == 2) {
			this.anInt8830 = arg0.method3043();
		}
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(B)V")
	private void method7413() {
		this.anIntArray759 = new int[this.anInt8834 + 1];
		this.anIntArray761 = new int[this.anInt8834 + 1];
		@Pc(26) int local26 = 0;
		@Pc(31) int local31 = 4096 / this.anInt8834;
		@Pc(38) int local38 = local31 * this.anInt8829 >> 12;
		for (@Pc(40) int local40 = 0; local40 < this.anInt8834; local40++) {
			this.anIntArray761[local40] = local26;
			this.anIntArray759[local40] = local26 + local38;
			local26 += local31;
		}
		this.anIntArray761[this.anInt8834] = 4096;
		this.anIntArray759[this.anInt8834] = this.anIntArray759[0] + 4096;
	}
}
