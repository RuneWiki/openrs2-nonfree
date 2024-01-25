import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class4_Sub4_Sub7 extends Class4_Sub4 {

	@OriginalMember(owner = "client!er", name = "H", descriptor = "I")
	private int anInt2996 = 4096;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub7() {
		super(1, true);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(BILclient!eh;)V")
	@Override
	public void method7886(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt2996 = arg1.method5982();
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method7883(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass343_41.method7596(arg0);
		if (super.aClass343_41.aBoolean638) {
			@Pc(30) int[] local30 = this.method7890(0, Static360.anInt6375 & arg0 - 1);
			@Pc(36) int[] local36 = this.method7890(0, arg0);
			@Pc(46) int[] local46 = this.method7890(0, arg0 + 1 & Static360.anInt6375);
			for (@Pc(48) int local48 = 0; local48 < Static560.anInt9394; local48++) {
				@Pc(62) int local62 = (local46[local48] - local30[local48]) * this.anInt2996;
				@Pc(82) int local82 = this.anInt2996 * (local36[local48 + 1 & Static571.anInt9405] - local36[Static571.anInt9405 & local48 - 1]);
				@Pc(86) int local86 = local82 >> 12;
				@Pc(90) int local90 = local62 >> 12;
				@Pc(96) int local96 = local86 * local86 >> 12;
				@Pc(102) int local102 = local90 * local90 >> 12;
				@Pc(116) int local116 = (int) (Math.sqrt((double) ((float) (local102 + local96 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(127) int local127 = local116 == 0 ? 0 : 16777216 / local116;
				local11[local48] = 4096 - local127;
			}
		}
		return local11;
	}
}
