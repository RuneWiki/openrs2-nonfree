import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class6_Sub1_Sub9 extends Class6_Sub1 {

	@OriginalMember(owner = "client!fc", name = "D", descriptor = "I")
	private int anInt2905 = 20;

	@OriginalMember(owner = "client!fc", name = "K", descriptor = "I")
	private int anInt2910 = 1365;

	@OriginalMember(owner = "client!fc", name = "N", descriptor = "I")
	private int anInt2913 = 0;

	@OriginalMember(owner = "client!fc", name = "L", descriptor = "I")
	private int anInt2911 = 0;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!iaa;Z)V")
	@Override
	public void method8167(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt2910 = arg1.method4999();
		} else if (arg0 == 1) {
			this.anInt2905 = arg1.method4999();
		} else if (arg0 == 2) {
			this.anInt2913 = arg1.method4999();
		} else if (arg0 == 3) {
			this.anInt2911 = arg1.method4999();
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8159(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass187_41.method4597(arg0);
		if (super.aClass187_41.aBoolean403) {
			for (@Pc(17) int local17 = 0; local17 < Static289.anInt5549; local17++) {
				@Pc(31) int local31 = this.anInt2913 + (Static473.anIntArray730[local17] << 12) / this.anInt2910;
				@Pc(44) int local44 = (Static346.anIntArray472[arg0] << 12) / this.anInt2910 + this.anInt2911;
				@Pc(50) int local50 = local31;
				@Pc(52) int local52 = local44;
				@Pc(58) int local58 = local31 * local31 >> 12;
				@Pc(64) int local64 = local44 * local44 >> 12;
				@Pc(66) int local66 = 0;
				while (local64 + local58 < 16384 && this.anInt2905 > local66) {
					local52 = local44 + (local52 * local50 >> 12) * 2;
					local50 = local58 + local31 - local64;
					local66++;
					local58 = local50 * local50 >> 12;
					local64 = local52 * local52 >> 12;
				}
				local11[local17] = local66 < this.anInt2905 - 1 ? (local66 << 12) / this.anInt2905 : 0;
			}
		}
		return local11;
	}
}
