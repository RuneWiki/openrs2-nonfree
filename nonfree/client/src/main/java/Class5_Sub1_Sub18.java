import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class5_Sub1_Sub18 extends Class5_Sub1 {

	@OriginalMember(owner = "client!ii", name = "Q", descriptor = "[I")
	private int[] anIntArray180;

	@OriginalMember(owner = "client!ii", name = "Y", descriptor = "[I")
	private int[] anIntArray181;

	@OriginalMember(owner = "client!ii", name = "W", descriptor = "I")
	private int anInt1851 = 0;

	@OriginalMember(owner = "client!ii", name = "M", descriptor = "I")
	private int anInt1844 = 2048;

	@OriginalMember(owner = "client!ii", name = "R", descriptor = "I")
	private int anInt1847 = 10;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub18() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ii", name = "h", descriptor = "(I)V")
	private void method1436() {
		this.anIntArray180 = new int[this.anInt1847 + 1];
		@Pc(14) int local14 = 0;
		this.anIntArray181 = new int[this.anInt1847 + 1];
		@Pc(31) int local31 = 4096 / this.anInt1847;
		@Pc(38) int local38 = local31 * this.anInt1844 >> 12;
		for (@Pc(40) int local40 = 0; local40 < this.anInt1847; local40++) {
			this.anIntArray181[local40] = local14;
			this.anIntArray180[local40] = local14 + local38;
			local14 += local31;
		}
		this.anIntArray181[this.anInt1847] = 4096;
		this.anIntArray180[this.anInt1847] = this.anIntArray180[0] + 4096;
	}

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "(I)V")
	@Override
	public void method3200() {
		this.method1436();
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3195(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass101_41.method2886(arg0);
		if (super.aClass101_41.aBoolean174) {
			@Pc(24) int local24 = Static147.anIntArray321[arg0];
			@Pc(34) int local34;
			if (this.anInt1851 == 0) {
				@Pc(32) short local32 = 0;
				for (local34 = 0; local34 < this.anInt1847; local34++) {
					if (this.anIntArray181[local34] <= local24 && this.anIntArray181[local34 + 1] > local24) {
						if (local24 < this.anIntArray180[local34]) {
							local32 = 4096;
						}
						break;
					}
				}
				Static220.method48(local16, 0, Static174.anInt3489, local32);
			} else {
				for (@Pc(90) int local90 = 0; local90 < Static174.anInt3489; local90++) {
					local34 = 0;
					@Pc(96) short local96 = 0;
					@Pc(100) int local100 = Static117.anIntArray274[local90];
					@Pc(103) int local103 = this.anInt1851;
					if (local103 == 1) {
						local34 = local100;
					} else if (local103 == 2) {
						local34 = (local24 + local100 - 4096 >> 1) + 2048;
					} else if (local103 == 3) {
						local34 = (local100 - local24 >> 1) + 2048;
					}
					for (local103 = 0; local103 < this.anInt1847; local103++) {
						if (local34 >= this.anIntArray181[local103] && local34 < this.anIntArray181[local103 + 1]) {
							if (this.anIntArray180[local103] > local34) {
								local96 = 4096;
							}
							break;
						}
					}
					local16[local90] = local96;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3190(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1847 = arg0.method3062();
		} else if (arg1 == 1) {
			this.anInt1844 = arg0.method3077();
		} else if (arg1 == 2) {
			this.anInt1851 = arg0.method3062();
		}
	}
}
