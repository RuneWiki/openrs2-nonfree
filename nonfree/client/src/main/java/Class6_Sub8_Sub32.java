import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sv")
public final class Class6_Sub8_Sub32 extends Class6_Sub8 {

	@OriginalMember(owner = "client!sv", name = "D", descriptor = "I")
	private int anInt9180 = 0;

	@OriginalMember(owner = "client!sv", name = "K", descriptor = "I")
	private int anInt9179 = 1365;

	@OriginalMember(owner = "client!sv", name = "G", descriptor = "I")
	private int anInt9175 = 0;

	@OriginalMember(owner = "client!sv", name = "H", descriptor = "I")
	private int anInt9181 = 20;

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "()V")
	public Class6_Sub8_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8935(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass325_41.method7756(arg0);
		if (super.aClass325_41.aBoolean671) {
			for (@Pc(25) int local25 = 0; local25 < Static83.anInt1268; local25++) {
				@Pc(40) int local40 = (Static2.anIntArray1[local25] << 12) / this.anInt9179 + this.anInt9175;
				@Pc(52) int local52 = (Static424.anIntArray466[arg0] << 12) / this.anInt9179 + this.anInt9180;
				@Pc(58) int local58 = local40;
				@Pc(60) int local60 = local52;
				@Pc(66) int local66 = local40 * local40 >> 12;
				@Pc(72) int local72 = local52 * local52 >> 12;
				@Pc(74) int local74 = 0;
				while (local66 + local72 < 16384 && this.anInt9181 > local74) {
					local60 = (local58 * local60 >> 12) * 2 + local52;
					local58 = local66 + local40 - local72;
					local74++;
					local66 = local58 * local58 >> 12;
					local72 = local60 * local60 >> 12;
				}
				local19[local25] = this.anInt9181 - 1 > local74 ? (local74 << 12) / this.anInt9181 : 0;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method8929(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt9179 = arg1.method3018();
		} else if (arg0 == 1) {
			this.anInt9181 = arg1.method3018();
		} else if (arg0 == 2) {
			this.anInt9175 = arg1.method3018();
		} else if (arg0 == 3) {
			this.anInt9180 = arg1.method3018();
		}
	}
}
