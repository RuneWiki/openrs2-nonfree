import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class1_Sub4_Sub32 extends Class1_Sub4 {

	@OriginalMember(owner = "client!rj", name = "G", descriptor = "[I")
	private int[] anIntArray406;

	@OriginalMember(owner = "client!rj", name = "I", descriptor = "[I")
	private int[] anIntArray407;

	@OriginalMember(owner = "client!rj", name = "O", descriptor = "I")
	private int anInt5996 = 10;

	@OriginalMember(owner = "client!rj", name = "P", descriptor = "I")
	private int anInt5997 = 0;

	@OriginalMember(owner = "client!rj", name = "L", descriptor = "I")
	private int anInt5993 = 2048;

	static {
		new Class119("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
	}

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rj", name = "e", descriptor = "(I)V")
	@Override
	public void method5686() {
		this.method4736();
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5683(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass2_41.method10(arg0);
		if (super.aClass2_41.aBoolean5) {
			@Pc(25) int local25 = Static419.anIntArray472[arg0];
			@Pc(37) int local37;
			if (this.anInt5997 == 0) {
				@Pc(140) short local140 = 0;
				for (local37 = 0; local37 < this.anInt5996; local37++) {
					if (this.anIntArray406[local37] <= local25 && local25 < this.anIntArray406[local37 + 1]) {
						if (local25 < this.anIntArray407[local37]) {
							local140 = 4096;
						}
						break;
					}
				}
				Static468.method5037(local17, 0, Static395.anInt6592, local140);
			} else {
				for (@Pc(33) int local33 = 0; local33 < Static395.anInt6592; local33++) {
					local37 = 0;
					@Pc(39) short local39 = 0;
					@Pc(43) int local43 = Static119.anIntArray146[local33];
					@Pc(46) int local46 = this.anInt5997;
					if (local46 == 1) {
						local37 = local43;
					} else if (local46 == 2) {
						local37 = (local25 + local43 - 4096 >> 1) + 2048;
					} else if (local46 == 3) {
						local37 = (local43 - local25 >> 1) + 2048;
					}
					for (local46 = 0; local46 < this.anInt5996; local46++) {
						if (local37 >= this.anIntArray406[local46] && this.anIntArray406[local46 + 1] > local37) {
							if (local37 < this.anIntArray407[local46]) {
								local39 = 4096;
							}
							break;
						}
					}
					local17[local33] = local39;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)V")
	private void method4736() {
		this.anIntArray407 = new int[this.anInt5996 + 1];
		@Pc(14) int local14 = 0;
		this.anIntArray406 = new int[this.anInt5996 + 1];
		@Pc(26) int local26 = 4096 / this.anInt5996;
		@Pc(33) int local33 = this.anInt5993 * local26 >> 12;
		for (@Pc(38) int local38 = 0; local38 < this.anInt5996; local38++) {
			this.anIntArray406[local38] = local14;
			this.anIntArray407[local38] = local33 + local14;
			local14 += local26;
		}
		this.anIntArray406[this.anInt5996] = 4096;
		this.anIntArray407[this.anInt5996] = this.anIntArray407[0] + 4096;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!ug;II)V")
	@Override
	public void method5690(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5996 = arg0.method5337();
		} else if (arg1 == 1) {
			this.anInt5993 = arg0.method5335();
		} else if (arg1 == 2) {
			this.anInt5997 = arg0.method5337();
		}
	}
}
