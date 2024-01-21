import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class2_Sub2_Sub33 extends Class2_Sub2 {

	@OriginalMember(owner = "client!si", name = "R", descriptor = "I")
	private int anInt4147 = 1365;

	@OriginalMember(owner = "client!si", name = "X", descriptor = "I")
	private int anInt4152 = 20;

	@OriginalMember(owner = "client!si", name = "W", descriptor = "I")
	private int anInt4151 = 0;

	@OriginalMember(owner = "client!si", name = "T", descriptor = "I")
	private int anInt4149 = 0;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IILclient!og;)V")
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt4147 = arg1.method234();
		} else if (arg0 == 1) {
			this.anInt4152 = arg1.method234();
		} else if (arg0 == 2) {
			this.anInt4149 = arg1.method234();
		} else if (arg0 == 3) {
			this.anInt4151 = arg1.method234();
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3562(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass57_41.method2569(arg0);
		if (super.aClass57_41.aBoolean122) {
			for (@Pc(25) int local25 = 0; local25 < Static106.anInt3045; local25++) {
				@Pc(39) int local39 = this.anInt4149 + (Static15.anIntArray41[local25] << 12) / this.anInt4147;
				@Pc(52) int local52 = (Static160.anIntArray187[arg0] << 12) / this.anInt4147 + this.anInt4151;
				@Pc(58) int local58 = local39;
				@Pc(64) int local64 = local39 * local39 >> 12;
				@Pc(70) int local70 = local52 * local52 >> 12;
				@Pc(72) int local72 = 0;
				@Pc(74) int local74 = local52;
				while (local64 + local70 < 16384 && local72 < this.anInt4152) {
					local72++;
					local74 = (local58 * local74 >> 12) * 2 + local52;
					local58 = local39 + local64 - local70;
					local70 = local74 * local74 >> 12;
					local64 = local58 * local58 >> 12;
				}
				local19[local25] = local72 >= this.anInt4152 - 1 ? 0 : (local72 << 12) / this.anInt4152;
			}
		}
		return local19;
	}
}
