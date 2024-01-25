import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class1_Sub1_Sub38 extends Class1_Sub1 {

	@OriginalMember(owner = "client!vf", name = "G", descriptor = "I")
	private int anInt9196 = 20;

	@OriginalMember(owner = "client!vf", name = "D", descriptor = "I")
	private int anInt9194 = 1365;

	@OriginalMember(owner = "client!vf", name = "L", descriptor = "I")
	private int anInt9200 = 0;

	@OriginalMember(owner = "client!vf", name = "H", descriptor = "I")
	private int anInt9197 = 0;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7706(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass223_41.method4438(arg0);
		if (super.aClass223_41.aBoolean442) {
			for (@Pc(25) int local25 = 0; local25 < Static279.anInt4906; local25++) {
				@Pc(40) int local40 = (Static557.anIntArray708[local25] << 12) / this.anInt9194 + this.anInt9197;
				@Pc(52) int local52 = this.anInt9200 + (Static445.anIntArray590[arg0] << 12) / this.anInt9194;
				@Pc(58) int local58 = local40;
				@Pc(60) int local60 = local52;
				@Pc(66) int local66 = local40 * local40 >> 12;
				@Pc(72) int local72 = local52 * local52 >> 12;
				@Pc(74) int local74 = 0;
				while (local72 + local66 < 16384 && local74 < this.anInt9196) {
					local60 = (local58 * local60 >> 12) * 2 + local52;
					local58 = local66 + local40 - local72;
					local72 = local60 * local60 >> 12;
					local74++;
					local66 = local58 * local58 >> 12;
				}
				local11[local25] = local74 < this.anInt9196 - 1 ? (local74 << 12) / this.anInt9196 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILclient!mo;I)V")
	@Override
	public void method7708(@OriginalArg(1) Class1_Sub35 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt9194 = arg0.method5771();
		} else if (arg1 == 1) {
			this.anInt9196 = arg0.method5771();
		} else if (arg1 == 2) {
			this.anInt9197 = arg0.method5771();
		} else if (arg1 == 3) {
			this.anInt9200 = arg0.method5771();
		}
	}
}
