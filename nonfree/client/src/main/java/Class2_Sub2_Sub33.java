import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class2_Sub2_Sub33 extends Class2_Sub2 {

	@OriginalMember(owner = "client!sa", name = "ab", descriptor = "I")
	private int anInt4266 = 204;

	@OriginalMember(owner = "client!sa", name = "fb", descriptor = "I")
	private int anInt4270 = 1;

	@OriginalMember(owner = "client!sa", name = "hb", descriptor = "I")
	private int anInt4272 = 1;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLclient!nh;I)V")
	@Override
	public void method3957(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4272 = arg0.method2122();
		} else if (arg1 == 1) {
			this.anInt4270 = arg0.method2122();
		} else if (arg1 == 2) {
			this.anInt4266 = arg0.method2095();
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3961(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass16_41.method300(arg0);
		if (super.aClass16_41.aBoolean12) {
			for (@Pc(25) int local25 = 0; local25 < Static54.anInt953; local25++) {
				@Pc(31) int local31 = Static179.anIntArray682[local25];
				@Pc(35) int local35 = Static157.anIntArray604[arg0];
				@Pc(45) int local45 = local35 % (4096 / this.anInt4270) * this.anInt4270;
				@Pc(52) int local52 = this.anInt4272 * local31 >> 12;
				@Pc(59) int local59 = this.anInt4270 * local35 >> 12;
				@Pc(69) int local69 = local31 % (4096 / this.anInt4272) * this.anInt4272;
				if (local45 < this.anInt4266) {
					for (local52 -= local59; local52 < 0; local52 += 4) {
					}
					while (local52 > 3) {
						local52 -= 4;
					}
					if (local52 != 1) {
						local19[local25] = 0;
						continue;
					}
					if (local69 < this.anInt4266) {
						local19[local25] = 0;
						continue;
					}
				}
				if (this.anInt4266 > local69) {
					for (local52 -= local59; local52 < 0; local52 += 4) {
					}
					while (local52 > 3) {
						local52 -= 4;
					}
					if (local52 > 0) {
						local19[local25] = 0;
						continue;
					}
				}
				local19[local25] = 4096;
			}
		}
		return local19;
	}
}
