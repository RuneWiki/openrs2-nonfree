import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pw")
public final class Class6_Sub3_Sub28 extends Class6_Sub3 {

	@OriginalMember(owner = "client!pw", name = "K", descriptor = "I")
	private int anInt7081 = 0;

	@OriginalMember(owner = "client!pw", name = "H", descriptor = "I")
	private int anInt7078 = 0;

	@OriginalMember(owner = "client!pw", name = "P", descriptor = "I")
	private int anInt7085 = 20;

	@OriginalMember(owner = "client!pw", name = "O", descriptor = "I")
	private int anInt7084 = 1365;

	@OriginalMember(owner = "client!pw", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7828(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass174_41.method3731(arg0);
		if (super.aClass174_41.aBoolean271) {
			for (@Pc(25) int local25 = 0; local25 < Static447.anInt8568; local25++) {
				@Pc(40) int local40 = (Static157.anIntArray321[local25] << 12) / this.anInt7084 + this.anInt7078;
				@Pc(52) int local52 = this.anInt7081 + (Static564.anIntArray703[arg0] << 12) / this.anInt7084;
				@Pc(58) int local58 = local40;
				@Pc(60) int local60 = local52;
				@Pc(66) int local66 = local40 * local40 >> 12;
				@Pc(72) int local72 = local52 * local52 >> 12;
				@Pc(74) int local74 = 0;
				while (local66 + local72 < 16384 && local74 < this.anInt7085) {
					local60 = local52 + (local60 * local58 >> 12) * 2;
					local58 = local66 + local40 - local72;
					local66 = local58 * local58 >> 12;
					local74++;
					local72 = local60 * local60 >> 12;
				}
				local19[local25] = this.anInt7085 - 1 <= local74 ? 0 : (local74 << 12) / this.anInt7085;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(IILclient!dga;)V")
	@Override
	public void method7831(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt7084 = arg1.method6006();
		} else if (arg0 == 1) {
			this.anInt7085 = arg1.method6006();
		} else if (arg0 == 2) {
			this.anInt7078 = arg1.method6006();
		} else if (arg0 == 3) {
			this.anInt7081 = arg1.method6006();
		}
	}
}
