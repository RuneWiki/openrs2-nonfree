import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class8_Sub3_Sub12 extends Class8_Sub3 {

	@OriginalMember(owner = "client!fg", name = "M", descriptor = "I")
	private int anInt1640 = 4096;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
	public Class8_Sub3_Sub12() {
		super(1, true);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method4227(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = this.aClass59_41.method1366(arg0);
		if (this.aClass59_41.aBoolean131) {
			@Pc(31) int[] local31 = this.method4230(arg0 - 1 & Static51.anInt1120, 0);
			@Pc(37) int[] local37 = this.method4230(arg0, 0);
			@Pc(47) int[] local47 = this.method4230(arg0 + 1 & Static51.anInt1120, 0);
			for (@Pc(49) int local49 = 0; local49 < Static239.anInt4789; local49++) {
				@Pc(63) int local63 = this.anInt1640 * (local47[local49] - local31[local49]);
				@Pc(83) int local83 = this.anInt1640 * (local37[Static214.anInt4402 & local49 + 1] - local37[local49 - 1 & Static214.anInt4402]);
				@Pc(87) int local87 = local83 >> 12;
				@Pc(93) int local93 = local87 * local87 >> 12;
				@Pc(97) int local97 = local63 >> 12;
				@Pc(103) int local103 = local97 * local97 >> 12;
				@Pc(117) int local117 = (int) (Math.sqrt((double) ((float) (local103 + local93 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(128) int local128 = local117 == 0 ? 0 : 16777216 / local117;
				local17[local49] = 4096 - local128;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IILclient!aj;)V")
	@Override
	public void method4223(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt1640 = arg1.method2375();
		}
	}
}
