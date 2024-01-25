import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class6_Sub1_Sub27 extends Class6_Sub1 {

	@OriginalMember(owner = "client!q", name = "F", descriptor = "I")
	private int anInt8064 = 4096;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub27() {
		super(1, true);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method8954(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass135_41.method3057(arg0);
		if (super.aClass135_41.aBoolean210) {
			@Pc(30) int[] local30 = this.method8963(0, Static476.anInt8174 & arg0 - 1);
			@Pc(36) int[] local36 = this.method8963(0, arg0);
			@Pc(46) int[] local46 = this.method8963(0, Static476.anInt8174 & arg0 + 1);
			for (@Pc(48) int local48 = 0; local48 < Static479.anInt8231; local48++) {
				@Pc(62) int local62 = (local46[local48] - local30[local48]) * this.anInt8064;
				@Pc(82) int local82 = this.anInt8064 * (local36[Static413.anInt7225 & local48 + 1] - local36[Static413.anInt7225 & local48 - 1]);
				@Pc(86) int local86 = local82 >> 12;
				@Pc(90) int local90 = local62 >> 12;
				@Pc(96) int local96 = local86 * local86 >> 12;
				@Pc(102) int local102 = local90 * local90 >> 12;
				@Pc(116) int local116 = (int) (Math.sqrt((double) ((float) (local102 + local96 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(124) int local124 = local116 == 0 ? 0 : 16777216 / local116;
				local16[local48] = 4096 - local124;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!gga;IB)V")
	@Override
	public void method8962(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt8064 = arg0.method8363();
		}
	}
}
