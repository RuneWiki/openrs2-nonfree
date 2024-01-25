import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class2_Sub2_Sub21 extends Class2_Sub2 {

	@OriginalMember(owner = "client!lr", name = "J", descriptor = "I")
	private int anInt4151 = 1024;

	@OriginalMember(owner = "client!lr", name = "M", descriptor = "I")
	private int anInt4154 = 2048;

	@OriginalMember(owner = "client!lr", name = "U", descriptor = "I")
	private int anInt4159 = 3072;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub21() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6274(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass234_41.method5375(arg0);
		if (super.aClass234_41.aBoolean454) {
			@Pc(21) int[] local21 = this.method6266(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static398.anInt6955; local23++) {
				local11[local23] = (this.anInt4154 * local21[local23] >> 12) + this.anInt4151;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6271(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass114_41.method2346(arg0);
		if (super.aClass114_41.aBoolean180) {
			@Pc(30) int[][] local30 = this.method6276(0, arg0);
			@Pc(34) int[] local34 = local30[0];
			@Pc(38) int[] local38 = local30[1];
			@Pc(42) int[] local42 = local30[2];
			@Pc(46) int[] local46 = local13[0];
			@Pc(50) int[] local50 = local13[1];
			@Pc(54) int[] local54 = local13[2];
			for (@Pc(56) int local56 = 0; local56 < Static398.anInt6955; local56++) {
				local46[local56] = this.anInt4151 + (this.anInt4154 * local34[local56] >> 12);
				local50[local56] = (this.anInt4154 * local38[local56] >> 12) + this.anInt4151;
				local54[local56] = (local42[local56] * this.anInt4154 >> 12) + this.anInt4151;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!hw;BI)V")
	@Override
	public void method6273(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4151 = arg0.method6148();
		} else if (arg1 == 1) {
			this.anInt4159 = arg0.method6148();
		} else if (arg1 == 2) {
			super.aBoolean518 = arg0.method6138() == 1;
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V")
	@Override
	public void method6262() {
		this.anInt4154 = this.anInt4159 - this.anInt4151;
	}
}
