import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iba")
public final class Class3_Sub1_Sub14 extends Class3_Sub1 {

	@OriginalMember(owner = "client!iba", name = "J", descriptor = "I")
	private int anInt4242 = 1;

	@OriginalMember(owner = "client!iba", name = "O", descriptor = "I")
	private int anInt4246 = 204;

	@OriginalMember(owner = "client!iba", name = "M", descriptor = "I")
	private int anInt4244 = 1;

	@OriginalMember(owner = "client!iba", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub14() {
		super(0, true);
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7767(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass85_41.method2548(arg0);
		if (super.aClass85_41.aBoolean239) {
			for (@Pc(25) int local25 = 0; local25 < Static206.anInt4182; local25++) {
				@Pc(31) int local31 = Static329.anIntArray456[local25];
				@Pc(35) int local35 = Static9.anIntArray15[arg0];
				@Pc(42) int local42 = local31 * this.anInt4244 >> 12;
				@Pc(49) int local49 = local35 * this.anInt4242 >> 12;
				@Pc(59) int local59 = this.anInt4244 * (local31 % (4096 / this.anInt4244));
				@Pc(69) int local69 = this.anInt4242 * (local35 % (4096 / this.anInt4242));
				if (local69 < this.anInt4246) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 != 1) {
						local11[local25] = 0;
						continue;
					}
					if (this.anInt4246 > local59) {
						local11[local25] = 0;
						continue;
					}
				}
				if (this.anInt4246 > local59) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 > 0) {
						local11[local25] = 0;
						continue;
					}
				}
				local11[local25] = 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(Lclient!qh;II)V")
	@Override
	public void method7761(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4244 = arg0.method3118();
		} else if (arg1 == 1) {
			this.anInt4242 = arg0.method3118();
		} else if (arg1 == 2) {
			this.anInt4246 = arg0.method3109();
		}
	}
}
