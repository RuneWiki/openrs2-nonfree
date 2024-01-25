import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pt")
public final class Class1_Sub2_Sub30 extends Class1_Sub2 {

	@OriginalMember(owner = "client!pt", name = "J", descriptor = "I")
	private int anInt5485 = 20;

	@OriginalMember(owner = "client!pt", name = "K", descriptor = "I")
	private int anInt5486 = 1365;

	@OriginalMember(owner = "client!pt", name = "P", descriptor = "I")
	private int anInt5489 = 0;

	@OriginalMember(owner = "client!pt", name = "N", descriptor = "I")
	private int anInt5487 = 0;

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILclient!ti;I)V")
	@Override
	public void method5863(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5486 = arg0.method4498();
		} else if (arg1 == 1) {
			this.anInt5485 = arg0.method4498();
		} else if (arg1 == 2) {
			this.anInt5487 = arg0.method4498();
		} else if (arg1 == 3) {
			this.anInt5489 = arg0.method4498();
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5868(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass264_41.method5969(arg0);
		if (super.aClass264_41.aBoolean657) {
			for (@Pc(24) int local24 = 0; local24 < Static410.anInt7198; local24++) {
				@Pc(38) int local38 = this.anInt5487 + (Static400.anIntArray525[local24] << 12) / this.anInt5486;
				@Pc(50) int local50 = this.anInt5489 + (Static285.anIntArray17[arg0] << 12) / this.anInt5486;
				@Pc(56) int local56 = local38;
				@Pc(58) int local58 = local50;
				@Pc(64) int local64 = local38 * local38 >> 12;
				@Pc(70) int local70 = local50 * local50 >> 12;
				@Pc(72) int local72 = 0;
				while (local64 + local70 < 16384 && this.anInt5485 > local72) {
					local58 = local50 + (local58 * local56 >> 12) * 2;
					local56 = local64 + local38 - local70;
					local70 = local58 * local58 >> 12;
					local72++;
					local64 = local56 * local56 >> 12;
				}
				local18[local24] = this.anInt5485 - 1 <= local72 ? 0 : (local72 << 12) / this.anInt5485;
			}
		}
		return local18;
	}
}
