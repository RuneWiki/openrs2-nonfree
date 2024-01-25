import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uda")
public final class Class5_Sub3_Sub33 extends Class5_Sub3 {

	@OriginalMember(owner = "client!uda", name = "G", descriptor = "I")
	private int anInt9646 = 4096;

	@OriginalMember(owner = "client!uda", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub33() {
		super(1, true);
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(ILclient!wq;I)V")
	@Override
	public void method9211(@OriginalArg(1) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt9646 = arg0.method7333();
		}
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9208(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass234_41.method5232(arg0);
		if (super.aClass234_41.aBoolean392) {
			@Pc(33) int[] local33 = this.method9205(Static652.anInt10663 & arg0 - 1, 0);
			@Pc(39) int[] local39 = this.method9205(arg0, 0);
			@Pc(49) int[] local49 = this.method9205(arg0 + 1 & Static652.anInt10663, 0);
			for (@Pc(51) int local51 = 0; local51 < Static7.anInt102; local51++) {
				@Pc(65) int local65 = (local49[local51] - local33[local51]) * this.anInt9646;
				@Pc(85) int local85 = this.anInt9646 * (local39[local51 + 1 & Static517.anInt8205] - local39[local51 - 1 & Static517.anInt8205]);
				@Pc(89) int local89 = local85 >> 12;
				@Pc(93) int local93 = local65 >> 12;
				@Pc(99) int local99 = local89 * local89 >> 12;
				@Pc(105) int local105 = local93 * local93 >> 12;
				@Pc(119) int local119 = (int) (Math.sqrt((double) ((float) (local99 + local105 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(131) int local131 = local119 == 0 ? 0 : 16777216 / local119;
				local19[local51] = 4096 - local131;
			}
		}
		return local19;
	}
}
