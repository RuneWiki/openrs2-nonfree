import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class4_Sub4_Sub9 extends Class4_Sub4 {

	@OriginalMember(owner = "client!gg", name = "G", descriptor = "[I")
	private int[] anIntArray354;

	@OriginalMember(owner = "client!gg", name = "H", descriptor = "[I")
	private int[] anIntArray355;

	@OriginalMember(owner = "client!gg", name = "I", descriptor = "I")
	private int anInt3596 = 2048;

	@OriginalMember(owner = "client!gg", name = "L", descriptor = "I")
	private int anInt3599 = 0;

	@OriginalMember(owner = "client!gg", name = "N", descriptor = "I")
	private int anInt3601 = 10;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(BILclient!eh;)V")
	@Override
	public void method7886(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt3601 = arg1.method6015();
		} else if (arg0 == 1) {
			this.anInt3596 = arg1.method5982();
		} else if (arg0 == 2) {
			this.anInt3599 = arg1.method6015();
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method7883(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass343_41.method7596(arg0);
		if (super.aClass343_41.aBoolean638) {
			@Pc(27) int local27 = Static450.anIntArray619[arg0];
			@Pc(36) int local36;
			if (this.anInt3599 == 0) {
				@Pc(143) short local143 = 0;
				for (local36 = 0; local36 < this.anInt3601; local36++) {
					if (this.anIntArray355[local36] <= local27 && local27 < this.anIntArray355[local36 + 1]) {
						if (local27 < this.anIntArray354[local36]) {
							local143 = 4096;
						}
						break;
					}
				}
				Static602.method1584(local19, 0, Static560.anInt9394, local143);
			} else {
				for (@Pc(32) int local32 = 0; local32 < Static560.anInt9394; local32++) {
					local36 = 0;
					@Pc(38) short local38 = 0;
					@Pc(42) int local42 = Static80.anIntArray212[local32];
					@Pc(45) int local45 = this.anInt3599;
					if (local45 == 1) {
						local36 = local42;
					} else if (local45 == 2) {
						local36 = (local42 + local27 - 4096 >> 1) + 2048;
					} else if (local45 == 3) {
						local36 = (local42 - local27 >> 1) + 2048;
					}
					for (local45 = 0; local45 < this.anInt3601; local45++) {
						if (local36 >= this.anIntArray355[local45] && this.anIntArray355[local45 + 1] > local36) {
							if (this.anIntArray354[local45] > local36) {
								local38 = 4096;
							}
							break;
						}
					}
					local19[local32] = local38;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "(B)V")
	private void method3204() {
		this.anIntArray354 = new int[this.anInt3601 + 1];
		this.anIntArray355 = new int[this.anInt3601 + 1];
		@Pc(21) int local21 = 0;
		@Pc(30) int local30 = 4096 / this.anInt3601;
		@Pc(37) int local37 = this.anInt3596 * local30 >> 12;
		for (@Pc(39) int local39 = 0; local39 < this.anInt3601; local39++) {
			this.anIntArray355[local39] = local21;
			this.anIntArray354[local39] = local21 + local37;
			local21 += local30;
		}
		this.anIntArray355[this.anInt3601] = 4096;
		this.anIntArray354[this.anInt3601] = this.anIntArray354[0] + 4096;
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)V")
	@Override
	public void method7894() {
		this.method3204();
	}
}
