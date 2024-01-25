import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class4_Sub2_Sub3 extends Class4_Sub2 {

	@OriginalMember(owner = "client!bm", name = "M", descriptor = "[I")
	private int[] anIntArray68;

	@OriginalMember(owner = "client!bm", name = "S", descriptor = "[I")
	private int[] anIntArray69;

	@OriginalMember(owner = "client!bm", name = "N", descriptor = "I")
	private int anInt828 = 10;

	@OriginalMember(owner = "client!bm", name = "R", descriptor = "I")
	private int anInt832 = 0;

	@OriginalMember(owner = "client!bm", name = "O", descriptor = "I")
	private int anInt829 = 2048;

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "(I)V")
	@Override
	public void method5845() {
		this.method654();
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5838(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass9_41.method279(arg0);
		if (super.aClass9_41.aBoolean15) {
			@Pc(25) int local25 = Static293.anIntArray461[arg0];
			@Pc(32) int local32;
			if (this.anInt832 == 0) {
				@Pc(30) short local30 = 0;
				for (local32 = 0; local32 < this.anInt828; local32++) {
					if (local25 >= this.anIntArray68[local32] && local25 < this.anIntArray68[local32 + 1]) {
						if (local25 < this.anIntArray69[local32]) {
							local30 = 4096;
						}
						break;
					}
				}
				Static457.method1217(local17, 0, Static350.anInt6330, local30);
			} else {
				for (@Pc(80) int local80 = 0; local80 < Static350.anInt6330; local80++) {
					local32 = 0;
					@Pc(86) short local86 = 0;
					@Pc(90) int local90 = Static197.anIntArray566[local80];
					@Pc(93) int local93 = this.anInt832;
					if (local93 == 1) {
						local32 = local90;
					} else if (local93 == 2) {
						local32 = (local90 + local25 - 4096 >> 1) + 2048;
					} else if (local93 == 3) {
						local32 = (local90 - local25 >> 1) + 2048;
					}
					for (local93 = 0; local93 < this.anInt828; local93++) {
						if (local32 >= this.anIntArray68[local93] && this.anIntArray68[local93 + 1] > local32) {
							if (this.anIntArray69[local93] > local32) {
								local86 = 4096;
							}
							break;
						}
					}
					local17[local80] = local86;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Z)V")
	private void method654() {
		@Pc(11) int local11 = 0;
		this.anIntArray68 = new int[this.anInt828 + 1];
		this.anIntArray69 = new int[this.anInt828 + 1];
		@Pc(30) int local30 = 4096 / this.anInt828;
		@Pc(37) int local37 = local30 * this.anInt829 >> 12;
		for (@Pc(39) int local39 = 0; local39 < this.anInt828; local39++) {
			this.anIntArray68[local39] = local11;
			this.anIntArray69[local39] = local11 + local37;
			local11 += local30;
		}
		this.anIntArray68[this.anInt828] = 4096;
		this.anIntArray69[this.anInt828] = this.anIntArray69[0] + 4096;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IBLclient!tl;)V")
	@Override
	public void method5843(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		if (arg0 == 0) {
			this.anInt828 = arg1.method4864();
		} else if (arg0 == 1) {
			this.anInt829 = arg1.method4877();
		} else if (arg0 == 2) {
			this.anInt832 = arg1.method4864();
		}
	}
}
