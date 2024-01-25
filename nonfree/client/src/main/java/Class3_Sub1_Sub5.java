import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class3_Sub1_Sub5 extends Class3_Sub1 {

	@OriginalMember(owner = "client!dd", name = "K", descriptor = "I")
	private int anInt2105 = 3072;

	@OriginalMember(owner = "client!dd", name = "S", descriptor = "I")
	private int anInt2112 = 1024;

	@OriginalMember(owner = "client!dd", name = "V", descriptor = "I")
	private int anInt2114 = 2048;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub5() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method7773(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass144_41.method3782(arg0);
		if (super.aClass144_41.aBoolean326) {
			@Pc(27) int[][] local27 = this.method7766(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local11[0];
			@Pc(47) int[] local47 = local11[1];
			@Pc(51) int[] local51 = local11[2];
			for (@Pc(53) int local53 = 0; local53 < Static206.anInt4182; local53++) {
				local43[local53] = this.anInt2112 + (this.anInt2114 * local31[local53] >> 12);
				local47[local53] = this.anInt2112 + (this.anInt2114 * local35[local53] >> 12);
				local51[local53] = this.anInt2112 + (this.anInt2114 * local39[local53] >> 12);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!qh;II)V")
	@Override
	public void method7761(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2112 = arg0.method3109();
		} else if (arg1 == 1) {
			this.anInt2105 = arg0.method3109();
		} else if (arg1 == 2) {
			super.aBoolean728 = arg0.method3118() == 1;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7767(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass85_41.method2548(arg0);
		if (super.aClass85_41.aBoolean239) {
			@Pc(26) int[] local26 = this.method7765(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static206.anInt4182; local28++) {
				local11[local28] = (local26[local28] * this.anInt2114 >> 12) + this.anInt2112;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
	@Override
	public void method7763() {
		this.anInt2114 = this.anInt2105 - this.anInt2112;
	}
}
