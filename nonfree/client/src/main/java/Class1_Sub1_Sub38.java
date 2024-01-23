import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class1_Sub1_Sub38 extends Class1_Sub1 {

	@OriginalMember(owner = "client!uh", name = "K", descriptor = "I")
	private int anInt5652 = 1;

	@OriginalMember(owner = "client!uh", name = "T", descriptor = "I")
	private int anInt5657 = 0;

	@OriginalMember(owner = "client!uh", name = "U", descriptor = "I")
	private int anInt5658 = 0;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4717(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = this.aClass194_41.method4738(arg0);
		if (this.aClass194_41.aBoolean411) {
			@Pc(25) int local25 = Static256.anIntArray474[arg0];
			@Pc(31) int local31 = local25 - 2048 >> 1;
			for (@Pc(33) int local33 = 0; local33 < Static62.anInt1350; local33++) {
				@Pc(40) int local40 = Static3.anIntArray3[local33];
				@Pc(46) int local46 = local40 - 2048 >> 1;
				@Pc(72) int local72;
				if (this.anInt5657 == 0) {
					local72 = (local40 - local25) * this.anInt5652;
				} else {
					@Pc(62) int local62 = local31 * local31 + local46 * local46 >> 12;
					local72 = (int) (Math.sqrt((double) ((float) local62 / 4096.0F)) * 4096.0D);
					local72 = (int) ((double) (local72 * this.anInt5652) * 3.141592653589793D);
				}
				local72 -= local72 & 0xFFFFF000;
				if (this.anInt5658 == 0) {
					local72 = Static170.anIntArray341[local72 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt5658 == 2) {
					local72 -= 2048;
					if (local72 < 0) {
						local72 = -local72;
					}
					local72 = 2048 - local72 << 1;
				}
				local11[local33] = local72;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!qm;II)V")
	@Override
	public void method4712(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5657 = arg0.method2199();
		} else if (arg1 == 1) {
			this.anInt5658 = arg0.method2199();
		} else if (arg1 == 3) {
			this.anInt5652 = arg0.method2199();
		}
	}

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "(B)V")
	@Override
	public void method4720() {
		Static275.method4162();
	}
}
