import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class1_Sub4_Sub6 extends Class1_Sub4 {

	@OriginalMember(owner = "client!ga", name = "gb", descriptor = "I")
	private int anInt1667;

	@OriginalMember(owner = "client!ga", name = "fb", descriptor = "[I")
	private int[] anIntArray134;

	@OriginalMember(owner = "client!ga", name = "nb", descriptor = "I")
	private int anInt1673;

	@OriginalMember(owner = "client!ga", name = "qb", descriptor = "I")
	private int anInt1675;

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)V")
	private void method1101() {
		@Pc(6) double local6 = Math.cos((double) (this.anInt1667 / 4096));
		this.anIntArray134[0] = (int) (local6 * Math.sin((double) (this.anInt1675 / 4096)) * 4096.0D);
		this.anIntArray134[1] = (int) (Math.cos((double) (this.anInt1675 / 4096)) * local6 * 4096.0D);
		this.anIntArray134[2] = (int) (Math.sin((double) (this.anInt1667 / 4096)) * 4096.0D);
		@Pc(70) int local70 = this.anIntArray134[2] * this.anIntArray134[2] >> 12;
		@Pc(82) int local82 = this.anIntArray134[0] * this.anIntArray134[0] >> 12;
		@Pc(94) int local94 = this.anIntArray134[1] * this.anIntArray134[1] >> 12;
		@Pc(107) int local107 = (int) (Math.sqrt((double) (local70 + local82 + local94 >> 12)) * 4096.0D);
		if (local107 != 0) {
			this.anIntArray134[1] = (this.anIntArray134[1] << 12) / local107;
			this.anIntArray134[2] = (this.anIntArray134[2] << 12) / local107;
			this.anIntArray134[0] = (this.anIntArray134[0] << 12) / local107;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!hc;IZ)V")
	@Override
	public void method3205(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1673 = arg0.method546();
		} else if (arg1 == 1) {
			this.anInt1675 = arg0.method546();
		} else if (arg1 == 2) {
			this.anInt1667 = arg0.method546();
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3216(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass39_38.method1880(arg0);
		if (super.aClass39_38.aBoolean110) {
			@Pc(30) int[] local30 = this.method3215(Static125.anInt3628 & arg0 - 1, 0);
			@Pc(36) int[] local36 = this.method3215(arg0, 0);
			@Pc(46) int[] local46 = this.method3215(arg0 + 1 & Static125.anInt3628, 0);
			for (@Pc(48) int local48 = 0; local48 < Static73.anInt1888; local48++) {
				@Pc(61) int local61 = this.anInt1673 * (local46[local48] - local30[local48]);
				@Pc(81) int local81 = (local36[Static35.anInt672 & local48 + 1] - local36[Static35.anInt672 & local48 - 1]) * this.anInt1673;
				@Pc(85) int local85 = local81 >> 12;
				@Pc(89) int local89 = local61 >> 12;
				@Pc(95) int local95 = local85 * local85 >> 12;
				@Pc(101) int local101 = local89 * local89 >> 12;
				@Pc(114) int local114 = (int) (Math.sqrt((double) ((local101 + local95 + 4096) / 4096)) * 4096.0D);
				@Pc(123) int local123;
				@Pc(121) int local121;
				@Pc(125) int local125;
				if (local114 == 0) {
					local121 = 0;
					local123 = 0;
					local125 = 0;
				} else {
					local125 = 16777216 / local114;
					local123 = local81 / local114;
					local121 = local61 / local114;
				}
				local125 = local125 * this.anIntArray134[2] >> 12;
				local123 = local123 * this.anIntArray134[0] >> 12;
				local121 = local121 * this.anIntArray134[1] >> 12;
				local16[local48] = local125 + local121 + local123;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)V")
	@Override
	public void method3207() {
		this.method1101();
	}
}
