import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class1_Sub1_Sub23 extends Class1_Sub1 {

	@OriginalMember(owner = "client!og", name = "cb", descriptor = "[I")
	private int[] anIntArray217;

	@OriginalMember(owner = "client!og", name = "kb", descriptor = "[I")
	private int[] anIntArray218;

	@OriginalMember(owner = "client!og", name = "Y", descriptor = "I")
	private int anInt3186 = 2048;

	@OriginalMember(owner = "client!og", name = "eb", descriptor = "I")
	private int anInt3190 = 10;

	@OriginalMember(owner = "client!og", name = "ib", descriptor = "I")
	private int anInt3194 = 0;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(B)V")
	@Override
	public void method3739() {
		this.method2526();
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3729(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass17_41.method474(arg0);
		if (super.aClass17_41.aBoolean24) {
			@Pc(24) int local24 = Static211.anIntArray334[arg0];
			@Pc(36) int local36;
			if (this.anInt3194 == 0) {
				@Pc(142) short local142 = 0;
				for (local36 = 0; local36 < this.anInt3190; local36++) {
					if (local24 >= this.anIntArray217[local36] && this.anIntArray217[local36 + 1] > local24) {
						if (local24 < this.anIntArray218[local36]) {
							local142 = 4096;
						}
						break;
					}
				}
				Static233.method869(local11, 0, Static157.anInt3431, local142);
			} else {
				for (@Pc(32) int local32 = 0; local32 < Static157.anInt3431; local32++) {
					local36 = 0;
					@Pc(40) int local40 = Static73.anIntArray105[local32];
					@Pc(42) short local42 = 0;
					@Pc(45) int local45 = this.anInt3194;
					if (local45 == 1) {
						local36 = local40;
					} else if (local45 == 2) {
						local36 = (local40 + local24 - 4096 >> 1) + 2048;
					} else if (local45 == 3) {
						local36 = (local40 - local24 >> 1) + 2048;
					}
					for (local45 = 0; local45 < this.anInt3190; local45++) {
						if (local36 >= this.anIntArray217[local45] && this.anIntArray217[local45 + 1] > local36) {
							if (local36 < this.anIntArray218[local45]) {
								local42 = 4096;
							}
							break;
						}
					}
					local11[local32] = local42;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!k;BI)V")
	@Override
	public void method3738(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3190 = arg0.method3793();
		} else if (arg1 == 1) {
			this.anInt3186 = arg0.method3805();
		} else if (arg1 == 2) {
			this.anInt3194 = arg0.method3793();
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)V")
	private void method2526() {
		this.anIntArray217 = new int[this.anInt3190 + 1];
		@Pc(16) int local16 = 0;
		this.anIntArray218 = new int[this.anInt3190 + 1];
		@Pc(32) int local32 = 4096 / this.anInt3190;
		@Pc(39) int local39 = this.anInt3186 * local32 >> 12;
		for (@Pc(41) int local41 = 0; local41 < this.anInt3190; local41++) {
			this.anIntArray217[local41] = local16;
			this.anIntArray218[local41] = local39 + local16;
			local16 += local32;
		}
		this.anIntArray217[this.anInt3190] = 4096;
		this.anIntArray218[this.anInt3190] = this.anIntArray218[0] + 4096;
	}
}
