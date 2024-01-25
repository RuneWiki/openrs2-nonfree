import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class6_Sub4_Sub38 extends Class6_Sub4 {

	@OriginalMember(owner = "client!vp", name = "D", descriptor = "I")
	private int anInt9344 = 4096;

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub38() {
		super(1, true);
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7753(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass187_41.method4558(arg0);
		if (super.aClass187_41.aBoolean374) {
			@Pc(33) int[] local33 = this.method7748(0, Static457.anInt7873 & arg0 - 1);
			@Pc(39) int[] local39 = this.method7748(0, arg0);
			@Pc(49) int[] local49 = this.method7748(0, Static457.anInt7873 & arg0 + 1);
			for (@Pc(51) int local51 = 0; local51 < Static408.anInt7209; local51++) {
				@Pc(65) int local65 = this.anInt9344 * (local49[local51] - local33[local51]);
				@Pc(85) int local85 = (local39[Static368.anInt6505 & local51 + 1] - local39[local51 - 1 & Static368.anInt6505]) * this.anInt9344;
				@Pc(89) int local89 = local85 >> 12;
				@Pc(93) int local93 = local65 >> 12;
				@Pc(99) int local99 = local89 * local89 >> 12;
				@Pc(105) int local105 = local93 * local93 >> 12;
				@Pc(120) int local120 = (int) (Math.sqrt((double) ((float) (local99 + local105 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(131) int local131 = local120 == 0 ? 0 : 16777216 / local120;
				local19[local51] = 4096 - local131;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IILclient!ji;)V")
	@Override
	public void method7750(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt9344 = arg1.method6003();
		}
	}
}
