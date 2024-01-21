import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class1_Sub5_Sub17 extends Class1_Sub5 {

	@OriginalMember(owner = "client!ma", name = "N", descriptor = "I")
	private int anInt2244;

	@OriginalMember(owner = "client!ma", name = "R", descriptor = "I")
	private int anInt2247;

	@OriginalMember(owner = "client!ma", name = "Z", descriptor = "I")
	private int anInt2253;

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)V")
	@Override
	public void method3146() {
		Static80.method1357();
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!ka;IZ)V")
	@Override
	public void method3148(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2244 = arg0.method336();
		} else if (arg1 == 1) {
			this.anInt2253 = arg0.method336();
		} else if (arg1 == 3) {
			this.anInt2247 = arg0.method336();
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3143(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass2_41.method19(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(25) int local25 = Static34.anIntArray75[arg0];
			@Pc(31) int local31 = local25 - 2048 >> 1;
			for (@Pc(33) int local33 = 0; local33 < Static177.anInt4018; local33++) {
				@Pc(39) int local39 = Static116.anIntArray275[local33];
				@Pc(45) int local45 = local39 - 2048 >> 1;
				@Pc(59) int local59;
				if (this.anInt2244 == 0) {
					local59 = this.anInt2247 * (local39 - local25);
				} else {
					@Pc(72) int local72 = local45 * local45 + local31 * local31 >> 12;
					local59 = (int) (Math.sqrt((double) (local72 / 4096)) * 4096.0D);
					local59 = (int) ((double) (local59 * this.anInt2247) * 3.141592653589793D);
				}
				local59 -= local59 & 0xFFFFF000;
				if (this.anInt2253 == 0) {
					local59 = Static121.anIntArray285[local59 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt2253 == 2) {
					local59 -= 2048;
					if (local59 < 0) {
						local59 = -local59;
					}
					local59 = 2048 - local59 << 1;
				}
				local17[local33] = local59;
			}
		}
		return local17;
	}
}
