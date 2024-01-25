import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hs")
public final class Class2_Sub15_Sub14 extends Class2_Sub15 {

	@OriginalMember(owner = "client!hs", name = "H", descriptor = "[I")
	private int[] anIntArray217;

	@OriginalMember(owner = "client!hs", name = "P", descriptor = "[I")
	private int[] anIntArray219;

	@OriginalMember(owner = "client!hs", name = "E", descriptor = "I")
	private int anInt4703 = 0;

	@OriginalMember(owner = "client!hs", name = "N", descriptor = "I")
	private int anInt4710 = 10;

	@OriginalMember(owner = "client!hs", name = "Q", descriptor = "I")
	private int anInt4711 = 2048;

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "()V")
	public Class2_Sub15_Sub14() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "(B)V")
	private void method4256() {
		this.anIntArray219 = new int[this.anInt4710 + 1];
		@Pc(14) int local14 = 0;
		this.anIntArray217 = new int[this.anInt4710 + 1];
		@Pc(26) int local26 = 4096 / this.anInt4710;
		@Pc(33) int local33 = this.anInt4711 * local26 >> 12;
		for (@Pc(39) int local39 = 0; local39 < this.anInt4710; local39++) {
			this.anIntArray219[local39] = local14;
			this.anIntArray217[local39] = local33 + local14;
			local14 += local26;
		}
		this.anIntArray219[this.anInt4710] = 4096;
		this.anIntArray217[this.anInt4710] = this.anIntArray217[0] + 4096;
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(B)V")
	@Override
	public void method9722() {
		this.method4256();
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IZLclient!ol;)V")
	@Override
	public void method9718(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt4710 = arg1.method5203();
		} else if (arg0 == 1) {
			this.anInt4711 = arg1.method5211();
		} else if (arg0 == 2) {
			this.anInt4703 = arg1.method5203();
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9724(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass338_41.method8470(arg0);
		if (super.aClass338_41.aBoolean712) {
			@Pc(25) int local25 = Static401.anIntArray357[arg0];
			@Pc(34) int local34;
			if (this.anInt4703 == 0) {
				@Pc(140) short local140 = 0;
				for (local34 = 0; local34 < this.anInt4710; local34++) {
					if (local25 >= this.anIntArray219[local34] && local25 < this.anIntArray219[local34 + 1]) {
						if (local25 < this.anIntArray217[local34]) {
							local140 = 4096;
						}
						break;
					}
				}
				Static679.method4130(local17, 0, Static329.anInt6017, local140);
			} else {
				for (@Pc(30) int local30 = 0; local30 < Static329.anInt6017; local30++) {
					local34 = 0;
					@Pc(36) short local36 = 0;
					@Pc(40) int local40 = Static537.anIntArray480[local30];
					@Pc(43) int local43 = this.anInt4703;
					if (local43 == 1) {
						local34 = local40;
					} else if (local43 == 2) {
						local34 = (local40 + local25 - 4096 >> 1) + 2048;
					} else if (local43 == 3) {
						local34 = (local40 - local25 >> 1) + 2048;
					}
					for (local43 = 0; local43 < this.anInt4710; local43++) {
						if (local34 >= this.anIntArray219[local43] && this.anIntArray219[local43 + 1] > local34) {
							if (local34 < this.anIntArray217[local43]) {
								local36 = 4096;
							}
							break;
						}
					}
					local17[local30] = local36;
				}
			}
		}
		return local17;
	}
}
