import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class2_Sub3_Sub27 extends Class2_Sub3 {

	@OriginalMember(owner = "client!qe", name = "J", descriptor = "[I")
	private int[] anIntArray428;

	@OriginalMember(owner = "client!qe", name = "O", descriptor = "[I")
	private int[] anIntArray429;

	@OriginalMember(owner = "client!qe", name = "K", descriptor = "I")
	private int anInt5498 = 0;

	@OriginalMember(owner = "client!qe", name = "H", descriptor = "I")
	private int anInt5496 = 10;

	@OriginalMember(owner = "client!qe", name = "S", descriptor = "I")
	private int anInt5503 = 2048;

	static {
		new Class140(null, "geschickt werden.", null, null);
	}

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5699(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass137_41.method3984(arg0);
		if (super.aClass137_41.aBoolean400) {
			@Pc(24) int local24 = Static76.anIntArray121[arg0];
			@Pc(34) int local34;
			if (this.anInt5498 == 0) {
				@Pc(32) short local32 = 0;
				for (local34 = 0; local34 < this.anInt5496; local34++) {
					if (local24 >= this.anIntArray428[local34] && local24 < this.anIntArray428[local34 + 1]) {
						if (local24 < this.anIntArray429[local34]) {
							local32 = 4096;
						}
						break;
					}
				}
				Static369.method2580(local16, 0, Static263.anInt5504, local32);
			} else {
				for (@Pc(82) int local82 = 0; local82 < Static263.anInt5504; local82++) {
					local34 = 0;
					@Pc(88) short local88 = 0;
					@Pc(92) int local92 = Static269.anIntArray507[local82];
					@Pc(95) int local95 = this.anInt5498;
					if (local95 == 1) {
						local34 = local92;
					} else if (local95 == 2) {
						local34 = (local24 + local92 - 4096 >> 1) + 2048;
					} else if (local95 == 3) {
						local34 = (local92 - local24 >> 1) + 2048;
					}
					for (local95 = 0; local95 < this.anInt5496; local95++) {
						if (this.anIntArray428[local95] <= local34 && local34 < this.anIntArray428[local95 + 1]) {
							if (this.anIntArray429[local95] > local34) {
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

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)V")
	@Override
	public void method5708() {
		this.method4651();
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)V")
	private void method4651() {
		this.anIntArray429 = new int[this.anInt5496 + 1];
		this.anIntArray428 = new int[this.anInt5496 + 1];
		@Pc(29) int local29 = 0;
		@Pc(34) int local34 = 4096 / this.anInt5496;
		@Pc(41) int local41 = local34 * this.anInt5503 >> 12;
		for (@Pc(43) int local43 = 0; local43 < this.anInt5496; local43++) {
			this.anIntArray428[local43] = local29;
			this.anIntArray429[local43] = local41 + local29;
			local29 += local34;
		}
		this.anIntArray428[this.anInt5496] = 4096;
		this.anIntArray429[this.anInt5496] = this.anIntArray429[0] + 4096;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IILclient!ef;)V")
	@Override
	public void method5704(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt5496 = arg1.method3124();
		} else if (arg0 == 1) {
			this.anInt5503 = arg1.method3104();
		} else if (arg0 == 2) {
			this.anInt5498 = arg1.method3124();
		}
	}
}
