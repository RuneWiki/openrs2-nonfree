import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class1_Sub1_Sub23 extends Class1_Sub1 {

	@OriginalMember(owner = "client!mi", name = "O", descriptor = "I")
	private int anInt3844 = 4096;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub23() {
		super(1, true);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!qm;II)V")
	@Override
	public void method4712(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3844 = arg0.method2244();
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4717(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = this.aClass194_41.method4738(arg0);
		if (this.aClass194_41.aBoolean411) {
			@Pc(28) int[] local28 = this.method4716(0, Static279.anInt5616 & arg0 - 1);
			@Pc(34) int[] local34 = this.method4716(0, arg0);
			@Pc(44) int[] local44 = this.method4716(0, arg0 + 1 & Static279.anInt5616);
			for (@Pc(46) int local46 = 0; local46 < Static62.anInt1350; local46++) {
				@Pc(65) int local65 = this.anInt3844 * (local44[local46] - local28[local46]);
				@Pc(85) int local85 = (local34[Static302.anInt6003 & local46 + 1] - local34[local46 - 1 & Static302.anInt6003]) * this.anInt3844;
				@Pc(89) int local89 = local65 >> 12;
				@Pc(93) int local93 = local85 >> 12;
				@Pc(99) int local99 = local89 * local89 >> 12;
				@Pc(105) int local105 = local93 * local93 >> 12;
				@Pc(120) int local120 = (int) (Math.sqrt((double) ((float) (local105 + local99 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(131) int local131 = local120 == 0 ? 0 : 16777216 / local120;
				local13[local46] = 4096 - local131;
			}
		}
		return local13;
	}
}
