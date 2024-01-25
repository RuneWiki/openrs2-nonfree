import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rfa")
public final class Class3_Sub2_Sub27 extends Class3_Sub2 {

	@OriginalMember(owner = "client!rfa", name = "M", descriptor = "[I")
	private int[] anIntArray527;

	@OriginalMember(owner = "client!rfa", name = "O", descriptor = "[I")
	private int[] anIntArray528;

	@OriginalMember(owner = "client!rfa", name = "C", descriptor = "I")
	private int anInt8520 = 0;

	@OriginalMember(owner = "client!rfa", name = "G", descriptor = "I")
	private int anInt8524 = 2048;

	@OriginalMember(owner = "client!rfa", name = "F", descriptor = "I")
	private int anInt8523 = 10;

	@OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lclient!sl;IB)V")
	@Override
	public void method8600(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt8523 = arg0.method4225();
		} else if (arg1 == 1) {
			this.anInt8524 = arg0.method4221();
		} else if (arg1 == 2) {
			this.anInt8520 = arg0.method4225();
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8594(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass40_41.method1572(arg0);
		if (super.aClass40_41.aBoolean97) {
			@Pc(19) int local19 = Static372.anIntArray207[arg0];
			@Pc(26) int local26;
			if (this.anInt8520 == 0) {
				@Pc(24) short local24 = 0;
				for (local26 = 0; local26 < this.anInt8523; local26++) {
					if (local19 >= this.anIntArray528[local26] && this.anIntArray528[local26 + 1] > local19) {
						if (this.anIntArray527[local26] > local19) {
							local24 = 4096;
						}
						break;
					}
				}
				Static653.method6860(local11, 0, Static491.anInt8519, local24);
			} else {
				for (@Pc(70) int local70 = 0; local70 < Static491.anInt8519; local70++) {
					local26 = 0;
					@Pc(76) short local76 = 0;
					@Pc(80) int local80 = Static546.anIntArray582[local70];
					@Pc(83) int local83 = this.anInt8520;
					if (local83 == 1) {
						local26 = local80;
					} else if (local83 == 2) {
						local26 = (local19 + local80 - 4096 >> 1) + 2048;
					} else if (local83 == 3) {
						local26 = (local80 - local19 >> 1) + 2048;
					}
					for (local83 = 0; local83 < this.anInt8523; local83++) {
						if (local26 >= this.anIntArray528[local83] && local26 < this.anIntArray528[local83 + 1]) {
							if (local26 < this.anIntArray527[local83]) {
								local76 = 4096;
							}
							break;
						}
					}
					local11[local70] = local76;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(B)V")
	private void method7314() {
		@Pc(7) int local7 = 0;
		this.anIntArray527 = new int[this.anInt8523 + 1];
		this.anIntArray528 = new int[this.anInt8523 + 1];
		@Pc(31) int local31 = 4096 / this.anInt8523;
		@Pc(38) int local38 = local31 * this.anInt8524 >> 12;
		for (@Pc(40) int local40 = 0; local40 < this.anInt8523; local40++) {
			this.anIntArray528[local40] = local7;
			this.anIntArray527[local40] = local38 + local7;
			local7 += local31;
		}
		this.anIntArray528[this.anInt8523] = 4096;
		this.anIntArray527[this.anInt8523] = this.anIntArray527[0] + 4096;
	}

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(I)V")
	@Override
	public void method8598() {
		this.method7314();
	}
}
