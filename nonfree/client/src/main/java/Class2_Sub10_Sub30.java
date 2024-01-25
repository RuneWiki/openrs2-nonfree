import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class2_Sub10_Sub30 extends Class2_Sub10 {

	@OriginalMember(owner = "client!sg", name = "K", descriptor = "I")
	private int anInt8627 = 0;

	@OriginalMember(owner = "client!sg", name = "F", descriptor = "I")
	private int anInt8623 = 1;

	@OriginalMember(owner = "client!sg", name = "C", descriptor = "I")
	private int anInt8621 = 0;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V")
	public Class2_Sub10_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8403(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass304_41.method7208(arg0);
		if (super.aClass304_41.aBoolean638) {
			@Pc(25) int local25 = Static353.anIntArray424[arg0];
			@Pc(31) int local31 = local25 - 2048 >> 1;
			for (@Pc(33) int local33 = 0; local33 < Static93.anInt1862; local33++) {
				@Pc(39) int local39 = Static561.anIntArray649[local33];
				@Pc(45) int local45 = local39 - 2048 >> 1;
				@Pc(59) int local59;
				if (this.anInt8621 == 0) {
					local59 = (local39 - local25) * this.anInt8623;
				} else {
					@Pc(72) int local72 = local45 * local45 + local31 * local31 >> 12;
					local59 = (int) (Math.sqrt((double) ((float) local72 / 4096.0F)) * 4096.0D);
					local59 = (int) ((double) (local59 * this.anInt8623) * 3.141592653589793D);
				}
				local59 -= local59 & 0xFFFFF000;
				if (this.anInt8627 == 0) {
					local59 = Static253.anIntArray343[local59 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt8627 == 2) {
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

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(Z)V")
	@Override
	public void method8407() {
		Static385.method5800();
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!ud;II)V")
	@Override
	public void method8410(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8621 = arg0.method6904();
		} else if (arg1 == 1) {
			this.anInt8627 = arg0.method6904();
		} else if (arg1 == 3) {
			this.anInt8623 = arg0.method6904();
		}
	}
}
