import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class1_Sub5_Sub5 extends Class1_Sub5 {

	@OriginalMember(owner = "client!dd", name = "T", descriptor = "[I")
	private int[] anIntArray63;

	@OriginalMember(owner = "client!dd", name = "U", descriptor = "[I")
	private int[] anIntArray64;

	@OriginalMember(owner = "client!dd", name = "Q", descriptor = "I")
	private int anInt830;

	@OriginalMember(owner = "client!dd", name = "V", descriptor = "I")
	private int anInt833;

	@OriginalMember(owner = "client!dd", name = "Z", descriptor = "I")
	private int anInt837;

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "(I)V")
	private void method676() {
		this.anIntArray64 = new int[this.anInt830 + 1];
		@Pc(17) int local17 = 4096 / this.anInt830;
		this.anIntArray63 = new int[this.anInt830 + 1];
		@Pc(31) int local31 = this.anInt833 * local17 >> 12;
		@Pc(33) int local33 = 0;
		for (@Pc(39) int local39 = 0; local39 < this.anInt830; local39++) {
			this.anIntArray63[local39] = local33;
			this.anIntArray64[local39] = local33 + local31;
			local33 += local17;
		}
		this.anIntArray63[this.anInt830] = 4096;
		this.anIntArray64[this.anInt830] = this.anIntArray64[0] + 4096;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)V")
	@Override
	public void method3146() {
		this.method676();
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3143(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass2_41.method19(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(24) int local24 = Static34.anIntArray75[arg0];
			@Pc(33) int local33;
			if (this.anInt837 == 0) {
				@Pc(143) short local143 = 0;
				for (local33 = 0; local33 < this.anInt830; local33++) {
					if (local24 >= this.anIntArray63[local33] && local24 < this.anIntArray63[local33 + 1]) {
						if (this.anIntArray64[local33] > local24) {
							local143 = 4096;
						}
						break;
					}
				}
				Static190.method1385(local7, 0, Static177.anInt4018, local143);
			} else {
				for (@Pc(29) int local29 = 0; local29 < Static177.anInt4018; local29++) {
					local33 = 0;
					@Pc(37) int local37 = Static116.anIntArray275[local29];
					@Pc(40) int local40 = this.anInt837;
					if (local40 == 1) {
						local33 = local37;
					} else if (local40 == 2) {
						local33 = (local37 + local24 - 4096 >> 1) + 2048;
					} else if (local40 == 3) {
						local33 = (local37 - local24 >> 1) + 2048;
					}
					@Pc(82) short local82 = 0;
					for (local40 = 0; local40 < this.anInt830; local40++) {
						if (local33 >= this.anIntArray63[local40] && local33 < this.anIntArray63[local40 + 1]) {
							if (local33 < this.anIntArray64[local40]) {
								local82 = 4096;
							}
							break;
						}
					}
					local7[local29] = local82;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!ka;IZ)V")
	@Override
	public void method3148(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt830 = arg0.method336();
		} else if (arg1 == 1) {
			this.anInt833 = arg0.method359();
		} else if (arg1 == 2) {
			this.anInt837 = arg0.method336();
		}
	}
}
