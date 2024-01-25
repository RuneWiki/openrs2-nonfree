import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public final class Class1_Sub2_Sub12 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ho", name = "Q", descriptor = "[I")
	private int[] anIntArray209;

	@OriginalMember(owner = "client!ho", name = "S", descriptor = "[I")
	private int[] anIntArray210;

	@OriginalMember(owner = "client!ho", name = "K", descriptor = "I")
	private int anInt2728 = 0;

	@OriginalMember(owner = "client!ho", name = "P", descriptor = "I")
	private int anInt2733 = 2048;

	@OriginalMember(owner = "client!ho", name = "V", descriptor = "I")
	private int anInt2735 = 10;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Z)V")
	@Override
	public void method5864() {
		this.method2428();
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5868(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass264_41.method5969(arg0);
		if (super.aClass264_41.aBoolean657) {
			@Pc(19) int local19 = Static285.anIntArray17[arg0];
			@Pc(31) int local31;
			if (this.anInt2728 == 0) {
				@Pc(143) short local143 = 0;
				for (local31 = 0; local31 < this.anInt2735; local31++) {
					if (local19 >= this.anIntArray210[local31] && local19 < this.anIntArray210[local31 + 1]) {
						if (this.anIntArray209[local31] > local19) {
							local143 = 4096;
						}
						break;
					}
				}
				Static459.method1547(local11, 0, Static410.anInt7198, local143);
			} else {
				for (@Pc(27) int local27 = 0; local27 < Static410.anInt7198; local27++) {
					local31 = 0;
					@Pc(33) short local33 = 0;
					@Pc(37) int local37 = Static400.anIntArray525[local27];
					@Pc(40) int local40 = this.anInt2728;
					if (local40 == 1) {
						local31 = local37;
					} else if (local40 == 2) {
						local31 = (local19 + local37 - 4096 >> 1) + 2048;
					} else if (local40 == 3) {
						local31 = (local37 - local19 >> 1) + 2048;
					}
					for (local40 = 0; local40 < this.anInt2735; local40++) {
						if (this.anIntArray210[local40] <= local31 && local31 < this.anIntArray210[local40 + 1]) {
							if (local31 < this.anIntArray209[local40]) {
								local33 = 4096;
							}
							break;
						}
					}
					local11[local27] = local33;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(ILclient!ti;I)V")
	@Override
	public void method5863(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2735 = arg0.method4548();
		} else if (arg1 == 1) {
			this.anInt2733 = arg0.method4498();
		} else if (arg1 == 2) {
			this.anInt2728 = arg0.method4548();
		}
	}

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "(I)V")
	private void method2428() {
		@Pc(13) int local13 = 0;
		this.anIntArray210 = new int[this.anInt2735 + 1];
		this.anIntArray209 = new int[this.anInt2735 + 1];
		@Pc(32) int local32 = 4096 / this.anInt2735;
		@Pc(39) int local39 = local32 * this.anInt2733 >> 12;
		for (@Pc(41) int local41 = 0; local41 < this.anInt2735; local41++) {
			this.anIntArray210[local41] = local13;
			this.anIntArray209[local41] = local13 + local39;
			local13 += local32;
		}
		this.anIntArray210[this.anInt2735] = 4096;
		this.anIntArray209[this.anInt2735] = this.anIntArray209[0] + 4096;
	}
}
