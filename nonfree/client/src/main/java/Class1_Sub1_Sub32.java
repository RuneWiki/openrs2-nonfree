import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class1_Sub1_Sub32 extends Class1_Sub1 {

	@OriginalMember(owner = "client!uh", name = "V", descriptor = "I")
	private int anInt4629 = 0;

	@OriginalMember(owner = "client!uh", name = "cb", descriptor = "I")
	private int anInt4635 = 20;

	@OriginalMember(owner = "client!uh", name = "db", descriptor = "I")
	private int anInt4636 = 1365;

	@OriginalMember(owner = "client!uh", name = "W", descriptor = "I")
	private int anInt4630 = 0;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!vf;II)V")
	@Override
	public void method3711(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4636 = arg0.method2964();
		} else if (arg1 == 1) {
			this.anInt4635 = arg0.method2964();
		} else if (arg1 == 2) {
			this.anInt4629 = arg0.method2964();
		} else if (arg1 == 3) {
			this.anInt4630 = arg0.method2964();
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3705(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass37_41.method1168(arg0);
		if (super.aClass37_41.aBoolean131) {
			for (@Pc(17) int local17 = 0; local17 < Static11.anInt294; local17++) {
				@Pc(31) int local31 = this.anInt4629 + (Static36.anIntArray81[local17] << 12) / this.anInt4636;
				@Pc(43) int local43 = this.anInt4630 + (Static187.anIntArray345[arg0] << 12) / this.anInt4636;
				@Pc(47) int local47 = local43;
				@Pc(53) int local53 = local31 * local31 >> 12;
				@Pc(55) int local55 = local31;
				@Pc(59) int local59 = 0;
				@Pc(65) int local65 = local43 * local43 >> 12;
				while (local53 + local65 < 16384 && local59 < this.anInt4635) {
					local59++;
					local47 = (local47 * local55 >> 12) * 2 + local43;
					local55 = local53 + local31 - local65;
					local65 = local47 * local47 >> 12;
					local53 = local55 * local55 >> 12;
				}
				local11[local17] = this.anInt4635 - 1 <= local59 ? 0 : (local59 << 12) / this.anInt4635;
			}
		}
		return local11;
	}
}
