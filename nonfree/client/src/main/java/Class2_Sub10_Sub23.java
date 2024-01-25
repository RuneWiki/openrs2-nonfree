import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class2_Sub10_Sub23 extends Class2_Sub10 {

	@OriginalMember(owner = "client!ob", name = "C", descriptor = "[I")
	private int[] anIntArray487;

	@OriginalMember(owner = "client!ob", name = "G", descriptor = "[I")
	private int[] anIntArray488;

	@OriginalMember(owner = "client!ob", name = "D", descriptor = "I")
	private int anInt7082 = 2048;

	@OriginalMember(owner = "client!ob", name = "B", descriptor = "I")
	private int anInt7081 = 10;

	@OriginalMember(owner = "client!ob", name = "K", descriptor = "I")
	private int anInt7087 = 0;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
	public Class2_Sub10_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8403(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass304_41.method7208(arg0);
		if (super.aClass304_41.aBoolean638) {
			@Pc(25) int local25 = Static353.anIntArray424[arg0];
			@Pc(34) int local34;
			if (this.anInt7087 == 0) {
				@Pc(135) short local135 = 0;
				for (local34 = 0; local34 < this.anInt7081; local34++) {
					if (this.anIntArray488[local34] <= local25 && local25 < this.anIntArray488[local34 + 1]) {
						if (this.anIntArray487[local34] > local25) {
							local135 = 4096;
						}
						break;
					}
				}
				Static649.method4858(local17, 0, Static93.anInt1862, local135);
			} else {
				for (@Pc(30) int local30 = 0; local30 < Static93.anInt1862; local30++) {
					local34 = 0;
					@Pc(36) short local36 = 0;
					@Pc(40) int local40 = Static561.anIntArray649[local30];
					@Pc(43) int local43 = this.anInt7087;
					if (local43 == 1) {
						local34 = local40;
					} else if (local43 == 2) {
						local34 = (local40 + local25 - 4096 >> 1) + 2048;
					} else if (local43 == 3) {
						local34 = (local40 - local25 >> 1) + 2048;
					}
					for (local43 = 0; local43 < this.anInt7081; local43++) {
						if (local34 >= this.anIntArray488[local43] && this.anIntArray488[local43 + 1] > local34) {
							if (local34 < this.anIntArray487[local43]) {
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

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "(Z)V")
	private void method6004() {
		this.anIntArray488 = new int[this.anInt7081 + 1];
		this.anIntArray487 = new int[this.anInt7081 + 1];
		@Pc(27) int local27 = 0;
		@Pc(32) int local32 = 4096 / this.anInt7081;
		@Pc(39) int local39 = this.anInt7082 * local32 >> 12;
		for (@Pc(41) int local41 = 0; local41 < this.anInt7081; local41++) {
			this.anIntArray488[local41] = local27;
			this.anIntArray487[local41] = local39 + local27;
			local27 += local32;
		}
		this.anIntArray488[this.anInt7081] = 4096;
		this.anIntArray487[this.anInt7081] = this.anIntArray487[0] + 4096;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!ud;II)V")
	@Override
	public void method8410(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7081 = arg0.method6904();
		} else if (arg1 == 1) {
			this.anInt7082 = arg0.method6884();
		} else if (arg1 == 2) {
			this.anInt7087 = arg0.method6904();
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(Z)V")
	@Override
	public void method8407() {
		this.method6004();
	}
}
