import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class Class2_Sub6_Sub35 extends Class2_Sub6 {

	@OriginalMember(owner = "client!ts", name = "M", descriptor = "I")
	private int anInt6108 = 1024;

	@OriginalMember(owner = "client!ts", name = "O", descriptor = "I")
	private int anInt6110 = 2048;

	@OriginalMember(owner = "client!ts", name = "J", descriptor = "I")
	private int anInt6105 = 3072;

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub35() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5642(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass166_41.method3993(arg0);
		if (super.aClass166_41.aBoolean336) {
			@Pc(28) int[] local28 = this.method5635(arg0, 0);
			for (@Pc(30) int local30 = 0; local30 < Static151.anInt2711; local30++) {
				local18[local30] = this.anInt6108 + (this.anInt6110 * local28[local30] >> 12);
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5641(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass208_41.method4986(arg0);
		if (super.aClass208_41.aBoolean443) {
			@Pc(21) int[][] local21 = this.method5640(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static151.anInt2711; local47++) {
				local37[local47] = (this.anInt6110 * local25[local47] >> 12) + this.anInt6108;
				local41[local47] = (local29[local47] * this.anInt6110 >> 12) + this.anInt6108;
				local45[local47] = this.anInt6108 + (local33[local47] * this.anInt6110 >> 12);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ts", name = "e", descriptor = "(I)V")
	@Override
	public void method5639() {
		this.anInt6110 = this.anInt6105 - this.anInt6108;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lclient!lk;II)V")
	@Override
	public void method5637(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6108 = arg0.method4245();
		} else if (arg1 == 1) {
			this.anInt6105 = arg0.method4245();
		} else if (arg1 == 2) {
			super.aBoolean491 = arg0.method4240() == 1;
		}
	}
}
