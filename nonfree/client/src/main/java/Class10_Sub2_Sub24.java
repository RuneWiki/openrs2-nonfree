import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class10_Sub2_Sub24 extends Class10_Sub2 {

	@OriginalMember(owner = "client!of", name = "N", descriptor = "I")
	private int anInt5049 = 1024;

	@OriginalMember(owner = "client!of", name = "O", descriptor = "I")
	private int anInt5050 = 3072;

	@OriginalMember(owner = "client!of", name = "U", descriptor = "I")
	private int anInt5054 = 2048;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
	public Class10_Sub2_Sub24() {
		super(1, false);
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(Z)V")
	@Override
	public void method6036() {
		this.anInt5054 = this.anInt5050 - this.anInt5049;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IILclient!nn;)V")
	@Override
	public void method6044(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt5049 = arg1.method2485();
		} else if (arg0 == 1) {
			this.anInt5050 = arg1.method2485();
		} else if (arg0 == 2) {
			super.aBoolean499 = arg1.method2502() == 1;
		}
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method6037(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass102_41.method2566(arg0);
		if (super.aClass102_41.aBoolean216) {
			@Pc(30) int[][] local30 = this.method6045(0, arg0);
			@Pc(34) int[] local34 = local30[0];
			@Pc(38) int[] local38 = local30[1];
			@Pc(42) int[] local42 = local30[2];
			@Pc(46) int[] local46 = local13[0];
			@Pc(50) int[] local50 = local13[1];
			@Pc(54) int[] local54 = local13[2];
			for (@Pc(56) int local56 = 0; local56 < Static121.anInt2458; local56++) {
				local46[local56] = (this.anInt5054 * local34[local56] >> 12) + this.anInt5049;
				local50[local56] = (this.anInt5054 * local38[local56] >> 12) + this.anInt5049;
				local54[local56] = (local42[local56] * this.anInt5054 >> 12) + this.anInt5049;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6035(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass241_41.method5238(arg0);
		if (super.aClass241_41.aBoolean440) {
			@Pc(26) int[] local26 = this.method6041(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static121.anInt2458; local28++) {
				local16[local28] = (local26[local28] * this.anInt5054 >> 12) + this.anInt5049;
			}
		}
		return local16;
	}
}
