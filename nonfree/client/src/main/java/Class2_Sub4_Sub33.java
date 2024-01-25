import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class2_Sub4_Sub33 extends Class2_Sub4 {

	@OriginalMember(owner = "client!te", name = "S", descriptor = "I")
	private int anInt5617 = 4096;

	@OriginalMember(owner = "client!te", name = "P", descriptor = "I")
	private int anInt5615 = 4096;

	@OriginalMember(owner = "client!te", name = "V", descriptor = "I")
	private int anInt5618 = 4096;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub33() {
		super(1, false);
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(BI)[[I")
	@Override
	public int[][] method5594(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass170_41.method3736(arg0);
		if (super.aClass170_41.aBoolean309) {
			@Pc(26) int[][] local26 = this.method5591(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static76.anInt1458; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local38[local52];
				@Pc(66) int local66 = local34[local52];
				if (local62 == local58 && local62 == local66) {
					local42[local52] = this.anInt5617 * local58 >> 12;
					local46[local52] = this.anInt5615 * local62 >> 12;
					local50[local52] = this.anInt5618 * local66 >> 12;
				} else {
					local42[local52] = this.anInt5617;
					local46[local52] = this.anInt5615;
					local50[local52] = this.anInt5618;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BLclient!kk;I)V")
	@Override
	public void method5601(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5617 = arg0.method5312();
		} else if (arg1 == 1) {
			this.anInt5615 = arg0.method5312();
		} else if (arg1 == 2) {
			this.anInt5618 = arg0.method5312();
		}
	}
}
