import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class8_Sub3_Sub36 extends Class8_Sub3 {

	@OriginalMember(owner = "client!tj", name = "M", descriptor = "I")
	private int anInt5099 = 2048;

	@OriginalMember(owner = "client!tj", name = "X", descriptor = "I")
	private int anInt5107 = 3072;

	@OriginalMember(owner = "client!tj", name = "ab", descriptor = "I")
	private int anInt5110 = 1024;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V")
	public Class8_Sub3_Sub36() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method4227(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = this.aClass59_41.method1366(arg0);
		if (this.aClass59_41.aBoolean131) {
			@Pc(21) int[] local21 = this.method4230(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static239.anInt4789; local23++) {
				local11[local23] = this.anInt5110 + (local21[local23] * this.anInt5099 >> 12);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(B)V")
	@Override
	public void method4220() {
		this.anInt5099 = this.anInt5107 - this.anInt5110;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IILclient!aj;)V")
	@Override
	public void method4223(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt5110 = arg1.method2375();
		} else if (arg0 == 1) {
			this.anInt5107 = arg1.method2375();
		} else if (arg0 == 2) {
			this.aBoolean469 = arg1.method2334() == 1;
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4217(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = this.aClass166_41.method4037(arg0);
		if (this.aClass166_41.aBoolean451) {
			@Pc(26) int[][] local26 = this.method4224(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local16[0];
			@Pc(42) int[] local42 = local16[1];
			@Pc(46) int[] local46 = local26[2];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static239.anInt4789; local52++) {
				local38[local52] = (this.anInt5099 * local30[local52] >> 12) + this.anInt5110;
				local42[local52] = this.anInt5110 + (this.anInt5099 * local34[local52] >> 12);
				local50[local52] = this.anInt5110 + (this.anInt5099 * local46[local52] >> 12);
			}
		}
		return local16;
	}
}
