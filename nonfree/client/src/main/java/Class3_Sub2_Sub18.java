import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class3_Sub2_Sub18 extends Class3_Sub2 {

	@OriginalMember(owner = "client!km", name = "G", descriptor = "[I")
	private int[] anIntArray335;

	@OriginalMember(owner = "client!km", name = "D", descriptor = "[I")
	private int[] anIntArray336;

	@OriginalMember(owner = "client!km", name = "P", descriptor = "I")
	private int anInt5888 = 10;

	@OriginalMember(owner = "client!km", name = "Q", descriptor = "I")
	private int anInt5892 = 0;

	@OriginalMember(owner = "client!km", name = "N", descriptor = "I")
	private int anInt5893 = 2048;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub18() {
		super(0, true);
	}

	@OriginalMember(owner = "client!km", name = "e", descriptor = "(I)V")
	private void method5019() {
		@Pc(7) int local7 = 0;
		this.anIntArray336 = new int[this.anInt5888 + 1];
		this.anIntArray335 = new int[this.anInt5888 + 1];
		@Pc(26) int local26 = 4096 / this.anInt5888;
		@Pc(41) int local41 = this.anInt5893 * local26 >> 12;
		for (@Pc(43) int local43 = 0; local43 < this.anInt5888; local43++) {
			this.anIntArray335[local43] = local7;
			this.anIntArray336[local43] = local41 + local7;
			local7 += local26;
		}
		this.anIntArray335[this.anInt5888] = 4096;
		this.anIntArray336[this.anInt5888] = this.anIntArray336[0] + 4096;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V")
	@Override
	public void method9205() {
		this.method5019();
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ILclient!rba;I)V")
	@Override
	public void method9214(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28 arg1) {
		if (arg0 == 0) {
			this.anInt5888 = arg1.method5322(-47);
		} else if (arg0 == 1) {
			this.anInt5893 = arg1.method5272();
		} else if (arg0 == 2) {
			this.anInt5892 = arg1.method5322(-16);
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9209(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass293_41.method7200(arg0);
		if (super.aClass293_41.aBoolean641) {
			@Pc(27) int local27 = Static123.anIntArray113[arg0];
			@Pc(36) int local36;
			if (this.anInt5892 == 0) {
				@Pc(157) short local157 = 0;
				for (local36 = 0; local36 < this.anInt5888; local36++) {
					if (this.anIntArray335[local36] <= local27 && this.anIntArray335[local36 + 1] > local27) {
						if (this.anIntArray336[local36] > local27) {
							local157 = 4096;
						}
						break;
					}
				}
				Static735.method9184(local11, 0, Static636.anInt10302, local157);
			} else {
				for (@Pc(32) int local32 = 0; local32 < Static636.anInt10302; local32++) {
					local36 = 0;
					@Pc(38) short local38 = 0;
					@Pc(42) int local42 = Static508.anIntArray472[local32];
					@Pc(45) int local45 = this.anInt5892;
					if (local45 == 1) {
						local36 = local42;
					} else if (local45 == 2) {
						local36 = (local42 + local27 - 4096 >> 1) + 2048;
					} else if (local45 == 3) {
						local36 = (local42 - local27 >> 1) + 2048;
					}
					for (local45 = 0; local45 < this.anInt5888; local45++) {
						if (this.anIntArray335[local45] <= local36 && this.anIntArray335[local45 + 1] > local36) {
							if (this.anIntArray336[local45] > local36) {
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
