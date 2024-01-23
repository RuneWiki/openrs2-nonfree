import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class2_Sub1_Sub30 extends Class2_Sub1 {

	@OriginalMember(owner = "client!rd", name = "V", descriptor = "[I")
	public static int[] anIntArray392 = new int[4096];

	@OriginalMember(owner = "client!rd", name = "T", descriptor = "I")
	private int anInt4693 = 1365;

	@OriginalMember(owner = "client!rd", name = "U", descriptor = "I")
	private int anInt4694 = 0;

	@OriginalMember(owner = "client!rd", name = "R", descriptor = "I")
	private int anInt4691 = 20;

	@OriginalMember(owner = "client!rd", name = "Q", descriptor = "I")
	private int anInt4690 = 0;

	static {
		for (@Pc(4) int local4 = 0; local4 < 4096; local4++) {
			anIntArray392[local4] = Static13.method294(local4);
		}
	}

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method4938(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4693 = arg0.method4242();
		} else if (arg1 == 1) {
			this.anInt4691 = arg0.method4242();
		} else if (arg1 == 2) {
			this.anInt4694 = arg0.method4242();
		} else if (arg1 == 3) {
			this.anInt4690 = arg0.method4242();
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4940(@OriginalArg(1) int arg0) {
		@Pc(22) int[] local22 = this.aClass136_41.method3410(arg0);
		if (this.aClass136_41.aBoolean349) {
			for (@Pc(28) int local28 = 0; local28 < Static114.anInt1359; local28++) {
				@Pc(43) int local43 = this.anInt4694 + (Static281.anIntArray506[local28] << 12) / this.anInt4693;
				@Pc(55) int local55 = (Static234.anIntArray435[arg0] << 12) / this.anInt4693 + this.anInt4690;
				@Pc(61) int local61 = local43;
				@Pc(63) int local63 = local55;
				@Pc(69) int local69 = local43 * local43 >> 12;
				@Pc(75) int local75 = local55 * local55 >> 12;
				@Pc(77) int local77 = 0;
				while (local69 + local75 < 16384 && local77 < this.anInt4691) {
					local77++;
					local63 = (local63 * local61 >> 12) * 2 + local55;
					local61 = local43 + local69 - local75;
					local75 = local63 * local63 >> 12;
					local69 = local61 * local61 >> 12;
				}
				local22[local28] = local77 >= this.anInt4691 - 1 ? 0 : (local77 << 12) / this.anInt4691;
			}
		}
		return local22;
	}
}
