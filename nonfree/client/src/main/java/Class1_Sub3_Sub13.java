import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fr")
public final class Class1_Sub3_Sub13 extends Class1_Sub3 {

	@OriginalMember(owner = "client!fr", name = "I", descriptor = "I")
	private int anInt2204 = 20;

	@OriginalMember(owner = "client!fr", name = "Q", descriptor = "I")
	private int anInt2211 = 0;

	@OriginalMember(owner = "client!fr", name = "N", descriptor = "I")
	private int anInt2208 = 1365;

	@OriginalMember(owner = "client!fr", name = "R", descriptor = "I")
	private int anInt2212 = 0;

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IILclient!bg;)V")
	@Override
	public void method5526(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt2208 = arg1.method4556();
		} else if (arg0 == 1) {
			this.anInt2204 = arg1.method4556();
		} else if (arg0 == 2) {
			this.anInt2211 = arg1.method4556();
		} else if (arg0 == 3) {
			this.anInt2212 = arg1.method4556();
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5529(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass122_41.method3385(arg0);
		if (super.aClass122_41.aBoolean342) {
			for (@Pc(25) int local25 = 0; local25 < Static153.anInt3378; local25++) {
				@Pc(40) int local40 = (Static107.anIntArray234[local25] << 12) / this.anInt2208 + this.anInt2211;
				@Pc(52) int local52 = this.anInt2212 + (Static266.anIntArray454[arg0] << 12) / this.anInt2208;
				@Pc(58) int local58 = local40;
				@Pc(60) int local60 = local52;
				@Pc(66) int local66 = local40 * local40 >> 12;
				@Pc(72) int local72 = local52 * local52 >> 12;
				@Pc(74) int local74 = 0;
				while (local66 + local72 < 16384 && local74 < this.anInt2204) {
					local60 = local52 + (local60 * local58 >> 12) * 2;
					local58 = local40 + local66 - local72;
					local72 = local60 * local60 >> 12;
					local74++;
					local66 = local58 * local58 >> 12;
				}
				local19[local25] = this.anInt2204 - 1 <= local74 ? 0 : (local74 << 12) / this.anInt2204;
			}
		}
		return local19;
	}
}
