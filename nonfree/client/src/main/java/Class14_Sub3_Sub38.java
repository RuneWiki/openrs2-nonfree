import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class14_Sub3_Sub38 extends Class14_Sub3 {

	@OriginalMember(owner = "client!wh", name = "N", descriptor = "I")
	private int anInt6611 = 2048;

	@OriginalMember(owner = "client!wh", name = "R", descriptor = "I")
	private int anInt6615 = 1024;

	@OriginalMember(owner = "client!wh", name = "K", descriptor = "I")
	private int anInt6609 = 3072;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V")
	public Class14_Sub3_Sub38() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)V")
	@Override
	public void method5998() {
		this.anInt6611 = this.anInt6609 - this.anInt6615;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6003(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass157_41.method4026(arg0);
		if (super.aClass157_41.aBoolean296) {
			@Pc(21) int[] local21 = this.method6004(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static294.anInt5657; local23++) {
				local11[local23] = (this.anInt6611 * local21[local23] >> 12) + this.anInt6615;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method6000(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6615 = arg0.method2498();
		} else if (arg1 == 1) {
			this.anInt6609 = arg0.method2498();
		} else if (arg1 == 2) {
			super.aBoolean446 = arg0.method2548() == 1;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5994(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass58_41.method1955(arg0);
		if (super.aClass58_41.aBoolean126) {
			@Pc(26) int[][] local26 = this.method5997(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static294.anInt5657; local52++) {
				local42[local52] = (local30[local52] * this.anInt6611 >> 12) + this.anInt6615;
				local46[local52] = this.anInt6615 + (local34[local52] * this.anInt6611 >> 12);
				local50[local52] = this.anInt6615 + (this.anInt6611 * local38[local52] >> 12);
			}
		}
		return local11;
	}
}
