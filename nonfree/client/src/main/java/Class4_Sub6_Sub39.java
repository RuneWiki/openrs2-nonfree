import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class4_Sub6_Sub39 extends Class4_Sub6 {

	@OriginalMember(owner = "client!w", name = "C", descriptor = "[I")
	private int[] anIntArray539;

	@OriginalMember(owner = "client!w", name = "M", descriptor = "[I")
	private int[] anIntArray540;

	@OriginalMember(owner = "client!w", name = "D", descriptor = "I")
	private int anInt7116 = 0;

	@OriginalMember(owner = "client!w", name = "H", descriptor = "I")
	private int anInt7120 = 10;

	@OriginalMember(owner = "client!w", name = "I", descriptor = "I")
	private int anInt7121 = 2048;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V")
	@Override
	public void method5509() {
		this.method5522();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IILclient!iv;)V")
	@Override
	public void method5518(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt7120 = arg1.method2490();
		} else if (arg0 == 1) {
			this.anInt7121 = arg1.method2536();
		} else if (arg0 == 2) {
			this.anInt7116 = arg1.method2490();
		}
	}

	@OriginalMember(owner = "client!w", name = "g", descriptor = "(I)V")
	private void method5522() {
		this.anIntArray539 = new int[this.anInt7120 + 1];
		this.anIntArray540 = new int[this.anInt7120 + 1];
		@Pc(21) int local21 = 0;
		@Pc(26) int local26 = 4096 / this.anInt7120;
		@Pc(33) int local33 = this.anInt7121 * local26 >> 12;
		for (@Pc(43) int local43 = 0; local43 < this.anInt7120; local43++) {
			this.anIntArray539[local43] = local21;
			this.anIntArray540[local43] = local33 + local21;
			local21 += local26;
		}
		this.anIntArray539[this.anInt7120] = 4096;
		this.anIntArray540[this.anInt7120] = this.anIntArray540[0] + 4096;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5510(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_41.method2265(arg0);
		if (super.aClass82_41.aBoolean243) {
			@Pc(27) int local27 = Static165.anIntArray209[arg0];
			@Pc(36) int local36;
			if (this.anInt7116 == 0) {
				@Pc(146) short local146 = 0;
				for (local36 = 0; local36 < this.anInt7120; local36++) {
					if (local27 >= this.anIntArray539[local36] && local27 < this.anIntArray539[local36 + 1]) {
						if (local27 < this.anIntArray540[local36]) {
							local146 = 4096;
						}
						break;
					}
				}
				Static459.method3327(local11, 0, Static80.anInt1616, local146);
			} else {
				for (@Pc(32) int local32 = 0; local32 < Static80.anInt1616; local32++) {
					local36 = 0;
					@Pc(38) short local38 = 0;
					@Pc(42) int local42 = Static341.anIntArray504[local32];
					@Pc(45) int local45 = this.anInt7116;
					if (local45 == 1) {
						local36 = local42;
					} else if (local45 == 2) {
						local36 = (local42 + local27 - 4096 >> 1) + 2048;
					} else if (local45 == 3) {
						local36 = (local42 - local27 >> 1) + 2048;
					}
					for (local45 = 0; local45 < this.anInt7120; local45++) {
						if (local36 >= this.anIntArray539[local45] && local36 < this.anIntArray539[local45 + 1]) {
							if (this.anIntArray540[local45] > local36) {
								local38 = 4096;
							}
							break;
						}
					}
					local11[local32] = local38;
				}
			}
		}
		return local11;
	}
}
