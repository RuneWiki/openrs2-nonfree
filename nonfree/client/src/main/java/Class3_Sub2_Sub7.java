import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class3_Sub2_Sub7 extends Class3_Sub2 {

	@OriginalMember(owner = "client!de", name = "N", descriptor = "[I")
	private int[] anIntArray88;

	@OriginalMember(owner = "client!de", name = "W", descriptor = "[I")
	private int[] anIntArray89;

	@OriginalMember(owner = "client!de", name = "O", descriptor = "I")
	private int anInt989 = 2048;

	@OriginalMember(owner = "client!de", name = "T", descriptor = "I")
	private int anInt993 = 10;

	@OriginalMember(owner = "client!de", name = "Q", descriptor = "I")
	private int anInt990 = 0;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V")
	@Override
	public void method4952() {
		this.method817();
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4961(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = this.aClass168_41.method4366(arg0);
		if (this.aClass168_41.aBoolean373) {
			@Pc(24) int local24 = Static205.anIntArray450[arg0];
			@Pc(34) int local34;
			if (this.anInt990 == 0) {
				@Pc(134) short local134 = 0;
				for (local34 = 0; local34 < this.anInt993; local34++) {
					if (this.anIntArray88[local34] <= local24 && this.anIntArray88[local34 + 1] > local24) {
						if (this.anIntArray89[local34] > local24) {
							local134 = 4096;
						}
						break;
					}
				}
				Static326.method4267(local16, 0, Static22.anInt421, local134);
			} else {
				for (@Pc(29) int local29 = 0; local29 < Static22.anInt421; local29++) {
					local34 = 0;
					@Pc(38) int local38 = Static185.anIntArray424[local29];
					@Pc(41) int local41 = this.anInt990;
					if (local41 == 1) {
						local34 = local38;
					} else if (local41 == 2) {
						local34 = (local38 + local24 - 4096 >> 1) + 2048;
					} else if (local41 == 3) {
						local34 = (local38 - local24 >> 1) + 2048;
					}
					@Pc(82) short local82 = 0;
					for (local41 = 0; local41 < this.anInt993; local41++) {
						if (local34 >= this.anIntArray88[local41] && this.anIntArray88[local41 + 1] > local34) {
							if (this.anIntArray89[local41] > local34) {
								local82 = 4096;
							}
							break;
						}
					}
					local16[local29] = local82;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(B)V")
	private void method817() {
		@Pc(3) int local3 = 0;
		this.anIntArray89 = new int[this.anInt993 + 1];
		this.anIntArray88 = new int[this.anInt993 + 1];
		@Pc(26) int local26 = 4096 / this.anInt993;
		@Pc(33) int local33 = local26 * this.anInt989 >> 12;
		for (@Pc(39) int local39 = 0; local39 < this.anInt993; local39++) {
			this.anIntArray88[local39] = local3;
			this.anIntArray89[local39] = local3 + local33;
			local3 += local26;
		}
		this.anIntArray88[this.anInt993] = 4096;
		this.anIntArray89[this.anInt993] = this.anIntArray89[0] + 4096;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IZLclient!ug;)V")
	@Override
	public void method4958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt993 = arg1.method3915();
		} else if (arg0 == 1) {
			this.anInt989 = arg1.method3948();
		} else if (arg0 == 2) {
			this.anInt990 = arg1.method3915();
		}
	}
}
