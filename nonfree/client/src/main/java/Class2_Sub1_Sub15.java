import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ht")
public final class Class2_Sub1_Sub15 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ht", name = "P", descriptor = "[I")
	private int[] anIntArray227;

	@OriginalMember(owner = "client!ht", name = "Q", descriptor = "[I")
	private int[] anIntArray228;

	@OriginalMember(owner = "client!ht", name = "R", descriptor = "I")
	private int anInt2973 = 0;

	@OriginalMember(owner = "client!ht", name = "S", descriptor = "I")
	private int anInt2974 = 2048;

	@OriginalMember(owner = "client!ht", name = "Y", descriptor = "I")
	private int anInt2978 = 10;

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ht", name = "e", descriptor = "(B)V")
	private void method2405() {
		this.anIntArray227 = new int[this.anInt2978 + 1];
		this.anIntArray228 = new int[this.anInt2978 + 1];
		@Pc(21) int local21 = 0;
		@Pc(26) int local26 = 4096 / this.anInt2978;
		@Pc(33) int local33 = this.anInt2974 * local26 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt2978; local35++) {
			this.anIntArray228[local35] = local21;
			this.anIntArray227[local35] = local33 + local21;
			local21 += local26;
		}
		this.anIntArray228[this.anInt2978] = 4096;
		this.anIntArray227[this.anInt2978] = this.anIntArray227[0] + 4096;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IILclient!vt;)V")
	@Override
	public void method6064(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt2978 = arg1.method5732();
		} else if (arg0 == 1) {
			this.anInt2974 = arg1.method5753();
		} else if (arg0 == 2) {
			this.anInt2973 = arg1.method5732();
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6059(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass156_41.method3899(arg0);
		if (super.aClass156_41.aBoolean318) {
			@Pc(25) int local25 = Static229.anIntArray382[arg0];
			@Pc(37) int local37;
			if (this.anInt2973 == 0) {
				@Pc(141) short local141 = 0;
				for (local37 = 0; local37 < this.anInt2978; local37++) {
					if (this.anIntArray228[local37] <= local25 && local25 < this.anIntArray228[local37 + 1]) {
						if (this.anIntArray227[local37] > local25) {
							local141 = 4096;
						}
						break;
					}
				}
				Static394.method2439(local17, 0, Static391.anInt7118, local141);
			} else {
				for (@Pc(33) int local33 = 0; local33 < Static391.anInt7118; local33++) {
					local37 = 0;
					@Pc(39) short local39 = 0;
					@Pc(43) int local43 = Static167.anIntArray267[local33];
					@Pc(46) int local46 = this.anInt2973;
					if (local46 == 1) {
						local37 = local43;
					} else if (local46 == 2) {
						local37 = (local25 + local43 - 4096 >> 1) + 2048;
					} else if (local46 == 3) {
						local37 = (local43 - local25 >> 1) + 2048;
					}
					for (local46 = 0; local46 < this.anInt2978; local46++) {
						if (local37 >= this.anIntArray228[local46] && this.anIntArray228[local46 + 1] > local37) {
							if (local37 < this.anIntArray227[local46]) {
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

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(I)V")
	@Override
	public void method6067() {
		this.method2405();
	}
}
