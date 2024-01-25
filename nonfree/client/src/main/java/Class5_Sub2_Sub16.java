import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class Class5_Sub2_Sub16 extends Class5_Sub2 {

	@OriginalMember(owner = "client!hr", name = "H", descriptor = "[I")
	private int[] anIntArray228;

	@OriginalMember(owner = "client!hr", name = "M", descriptor = "[I")
	private int[] anIntArray229;

	@OriginalMember(owner = "client!hr", name = "G", descriptor = "I")
	private int anInt4438 = 10;

	@OriginalMember(owner = "client!hr", name = "F", descriptor = "I")
	private int anInt4437 = 0;

	@OriginalMember(owner = "client!hr", name = "Q", descriptor = "I")
	private int anInt4446 = 2048;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8942(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass333_41.method7747(arg0);
		if (super.aClass333_41.aBoolean779) {
			@Pc(24) int local24 = Static369.anIntArray377[arg0];
			@Pc(34) int local34;
			if (this.anInt4437 == 0) {
				@Pc(32) short local32 = 0;
				for (local34 = 0; local34 < this.anInt4438; local34++) {
					if (local24 >= this.anIntArray228[local34] && local24 < this.anIntArray228[local34 + 1]) {
						if (this.anIntArray229[local34] > local24) {
							local32 = 4096;
						}
						break;
					}
				}
				Static686.method4970(local16, 0, Static195.anInt3759, local32);
			} else {
				for (@Pc(82) int local82 = 0; local82 < Static195.anInt3759; local82++) {
					local34 = 0;
					@Pc(88) short local88 = 0;
					@Pc(92) int local92 = Static554.anIntArray510[local82];
					@Pc(95) int local95 = this.anInt4437;
					if (local95 == 1) {
						local34 = local92;
					} else if (local95 == 2) {
						local34 = (local92 + local24 - 4096 >> 1) + 2048;
					} else if (local95 == 3) {
						local34 = (local92 - local24 >> 1) + 2048;
					}
					for (local95 = 0; local95 < this.anInt4438; local95++) {
						if (this.anIntArray228[local95] <= local34 && this.anIntArray228[local95 + 1] > local34) {
							if (local34 < this.anIntArray229[local95]) {
								local88 = 4096;
							}
							break;
						}
					}
					local16[local82] = local88;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!hr", name = "f", descriptor = "(I)V")
	private void method3755() {
		@Pc(7) int local7 = 0;
		this.anIntArray228 = new int[this.anInt4438 + 1];
		this.anIntArray229 = new int[this.anInt4438 + 1];
		@Pc(30) int local30 = 4096 / this.anInt4438;
		@Pc(37) int local37 = this.anInt4446 * local30 >> 12;
		for (@Pc(39) int local39 = 0; local39 < this.anInt4438; local39++) {
			this.anIntArray228[local39] = local7;
			this.anIntArray229[local39] = local37 + local7;
			local7 += local30;
		}
		this.anIntArray228[this.anInt4438] = 4096;
		this.anIntArray229[this.anInt4438] = this.anIntArray229[0] + 4096;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!mc;II)V")
	@Override
	public void method8944(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4438 = arg0.method7816();
		} else if (arg1 == 1) {
			this.anInt4446 = arg0.method7860();
		} else if (arg1 == 2) {
			this.anInt4437 = arg0.method7816();
		}
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(B)V")
	@Override
	public void method8951() {
		this.method3755();
	}
}
