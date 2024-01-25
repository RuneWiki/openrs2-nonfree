import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class7_Sub4_Sub33 extends Class7_Sub4 {

	@OriginalMember(owner = "client!tn", name = "J", descriptor = "I")
	private int anInt5891 = 3072;

	@OriginalMember(owner = "client!tn", name = "F", descriptor = "I")
	private int anInt5888 = 2048;

	@OriginalMember(owner = "client!tn", name = "O", descriptor = "I")
	private int anInt5895 = 1024;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "()V")
	public Class7_Sub4_Sub33() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!ap;BI)V")
	@Override
	public void method5636(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5895 = arg0.method2764();
		} else if (arg1 == 1) {
			this.anInt5891 = arg0.method2764();
		} else if (arg1 == 2) {
			super.aBoolean481 = arg0.method2772() == 1;
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5631(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass42_41.method1058(arg0);
		if (super.aClass42_41.aBoolean109) {
			@Pc(26) int[][] local26 = this.method5638(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static201.anInt4174; local52++) {
				local42[local52] = (this.anInt5888 * local30[local52] >> 12) + this.anInt5895;
				local46[local52] = this.anInt5895 + (local34[local52] * this.anInt5888 >> 12);
				local50[local52] = this.anInt5895 + (local38[local52] * this.anInt5888 >> 12);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "(B)V")
	@Override
	public void method5635() {
		this.anInt5888 = this.anInt5891 - this.anInt5895;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5628(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass219_41.method5708(arg0);
		if (super.aClass219_41.aBoolean495) {
			@Pc(29) int[] local29 = this.method5634(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static201.anInt4174; local31++) {
				local11[local31] = (this.anInt5888 * local29[local31] >> 12) + this.anInt5895;
			}
		}
		return local11;
	}
}
