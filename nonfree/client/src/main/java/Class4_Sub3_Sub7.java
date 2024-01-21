import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class4_Sub3_Sub7 extends Class4_Sub3 {

	@OriginalMember(owner = "client!de", name = "ab", descriptor = "[I")
	private int[] anIntArray71;

	@OriginalMember(owner = "client!de", name = "gb", descriptor = "[I")
	private int[] anIntArray72;

	@OriginalMember(owner = "client!de", name = "W", descriptor = "I")
	private int anInt874;

	@OriginalMember(owner = "client!de", name = "U", descriptor = "I")
	private int anInt872;

	@OriginalMember(owner = "client!de", name = "ib", descriptor = "I")
	private int anInt880;

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(B)V")
	@Override
	public void method3148() {
		this.method569();
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3161(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass64_41.method2211(arg0);
		if (super.aClass64_41.aBoolean127) {
			@Pc(19) int local19 = Static148.anIntArray321[arg0];
			@Pc(26) int local26;
			if (this.anInt872 == 0) {
				@Pc(24) short local24 = 0;
				for (local26 = 0; local26 < this.anInt880; local26++) {
					if (local19 >= this.anIntArray71[local26] && this.anIntArray71[local26 + 1] > local19) {
						if (this.anIntArray72[local26] > local19) {
							local24 = 4096;
						}
						break;
					}
				}
				Static189.method189(local11, 0, Static134.anInt3188, local24);
			} else {
				for (@Pc(82) int local82 = 0; local82 < Static134.anInt3188; local82++) {
					local26 = 0;
					@Pc(88) short local88 = 0;
					@Pc(92) int local92 = Static67.anIntArray170[local82];
					@Pc(95) int local95 = this.anInt872;
					if (local95 == 1) {
						local26 = local92;
					} else if (local95 == 2) {
						local26 = (local92 + local19 - 4096 >> 1) + 2048;
					} else if (local95 == 3) {
						local26 = (local92 - local19 >> 1) + 2048;
					}
					for (local95 = 0; local95 < this.anInt880; local95++) {
						if (local26 >= this.anIntArray71[local95] && local26 < this.anIntArray71[local95 + 1]) {
							if (this.anIntArray72[local95] > local26) {
								local88 = 4096;
							}
							break;
						}
					}
					local11[local82] = local88;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!de", name = "f", descriptor = "(I)V")
	private void method569() {
		this.anIntArray71 = new int[this.anInt880 + 1];
		this.anIntArray72 = new int[this.anInt880 + 1];
		@Pc(21) int local21 = 0;
		@Pc(31) int local31 = 4096 / this.anInt880;
		@Pc(38) int local38 = this.anInt874 * local31 >> 12;
		for (@Pc(40) int local40 = 0; local40 < this.anInt880; local40++) {
			this.anIntArray71[local40] = local21;
			this.anIntArray72[local40] = local21 + local38;
			local21 += local31;
		}
		this.anIntArray71[this.anInt880] = 4096;
		this.anIntArray72[this.anInt880] = this.anIntArray72[0] + 4096;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!h;I)V")
	@Override
	public void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt880 = arg1.method1253();
		} else if (arg0 == 1) {
			this.anInt874 = arg1.method1252();
		} else if (arg0 == 2) {
			this.anInt872 = arg1.method1253();
		}
	}
}
