import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class7_Sub4_Sub36 extends Class7_Sub4 {

	@OriginalMember(owner = "client!vf", name = "O", descriptor = "I")
	private int anInt6288 = 4096;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
	public Class7_Sub4_Sub36() {
		super(1, true);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!ap;BI)V")
	@Override
	public void method5636(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6288 = arg0.method2764();
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5628(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass219_41.method5708(arg0);
		if (super.aClass219_41.aBoolean495) {
			@Pc(33) int[] local33 = this.method5634(0, arg0 - 1 & Static153.anInt3263);
			@Pc(39) int[] local39 = this.method5634(0, arg0);
			@Pc(49) int[] local49 = this.method5634(0, Static153.anInt3263 & arg0 + 1);
			for (@Pc(51) int local51 = 0; local51 < Static201.anInt4174; local51++) {
				@Pc(65) int local65 = (local49[local51] - local33[local51]) * this.anInt6288;
				@Pc(84) int local84 = (local39[Static110.anInt2508 & local51 + 1] - local39[Static110.anInt2508 & local51 - 1]) * this.anInt6288;
				@Pc(88) int local88 = local84 >> 12;
				@Pc(92) int local92 = local65 >> 12;
				@Pc(98) int local98 = local88 * local88 >> 12;
				@Pc(104) int local104 = local92 * local92 >> 12;
				@Pc(119) int local119 = (int) (Math.sqrt((double) ((float) (local98 + local104 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(130) int local130 = local119 == 0 ? 0 : 16777216 / local119;
				local11[local51] = 4096 - local130;
			}
		}
		return local11;
	}
}
