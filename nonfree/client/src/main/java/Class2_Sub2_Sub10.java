import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class2_Sub2_Sub10 extends Class2_Sub2 {

	@OriginalMember(owner = "client!hi", name = "Q", descriptor = "I")
	private int anInt1937 = 4096;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub10() {
		super(1, true);
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BLclient!nh;I)V")
	@Override
	public void method3957(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1937 = arg0.method2095();
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3961(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass16_41.method300(arg0);
		if (super.aClass16_41.aBoolean12) {
			@Pc(30) int[] local30 = this.method3955(0, arg0 - 1 & Static156.anInt3604);
			@Pc(36) int[] local36 = this.method3955(0, arg0);
			@Pc(46) int[] local46 = this.method3955(0, arg0 + 1 & Static156.anInt3604);
			for (@Pc(48) int local48 = 0; local48 < Static54.anInt953; local48++) {
				@Pc(62) int local62 = this.anInt1937 * (local46[local48] - local30[local48]);
				@Pc(66) int local66 = local62 >> 12;
				@Pc(72) int local72 = local66 * local66 >> 12;
				@Pc(91) int local91 = (local36[Static74.anInt1601 & local48 + 1] - local36[local48 - 1 & Static74.anInt1601]) * this.anInt1937;
				@Pc(95) int local95 = local91 >> 12;
				@Pc(101) int local101 = local95 * local95 >> 12;
				@Pc(116) int local116 = (int) (Math.sqrt((double) ((float) (local101 + local72 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(127) int local127 = local116 == 0 ? 0 : 16777216 / local116;
				local16[local48] = 4096 - local127;
			}
		}
		return local16;
	}
}
