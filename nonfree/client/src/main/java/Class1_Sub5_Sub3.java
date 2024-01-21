import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class1_Sub5_Sub3 extends Class1_Sub5 {

	@OriginalMember(owner = "client!cf", name = "N", descriptor = "I")
	private int anInt639;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3143(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass2_41.method19(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(30) int[] local30 = this.method3145(0, arg0 - 1 & Static151.anInt3420);
			@Pc(36) int[] local36 = this.method3145(0, arg0);
			@Pc(46) int[] local46 = this.method3145(0, arg0 + 1 & Static151.anInt3420);
			for (@Pc(48) int local48 = 0; local48 < Static177.anInt4018; local48++) {
				@Pc(62) int local62 = (local46[local48] - local30[local48]) * this.anInt639;
				@Pc(82) int local82 = this.anInt639 * (local36[local48 + 1 & Static47.anInt1130] - local36[Static47.anInt1130 & local48 - 1]);
				@Pc(86) int local86 = local82 >> 12;
				@Pc(92) int local92 = local86 * local86 >> 12;
				@Pc(96) int local96 = local62 >> 12;
				@Pc(102) int local102 = local96 * local96 >> 12;
				@Pc(116) int local116 = (int) (Math.sqrt((double) ((local92 + local102 + 4096) / 4096)) * 4096.0D);
				@Pc(127) int local127 = local116 == 0 ? 0 : 16777216 / local116;
				local16[local48] = 4096 - local127;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!ka;IZ)V")
	@Override
	public void method3148(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt639 = arg0.method359();
		}
	}
}
