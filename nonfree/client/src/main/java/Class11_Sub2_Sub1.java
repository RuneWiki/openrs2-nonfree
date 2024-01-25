import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class11_Sub2_Sub1 extends Class11_Sub2 {

	@OriginalMember(owner = "client!al", name = "K", descriptor = "I")
	private int anInt150 = 4096;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "()V")
	public Class11_Sub2_Sub1() {
		super(1, true);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!kh;BI)V")
	@Override
	public void method5711(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt150 = arg0.method5187();
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method5716(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass124_41.method2853(arg0);
		if (super.aClass124_41.aBoolean221) {
			@Pc(33) int[] local33 = this.method5710(0, arg0 - 1 & Static75.anInt1419);
			@Pc(39) int[] local39 = this.method5710(0, arg0);
			@Pc(49) int[] local49 = this.method5710(0, Static75.anInt1419 & arg0 + 1);
			for (@Pc(51) int local51 = 0; local51 < Static339.anInt6549; local51++) {
				@Pc(65) int local65 = this.anInt150 * (local49[local51] - local33[local51]);
				@Pc(85) int local85 = this.anInt150 * (local39[local51 + 1 & Static323.anInt6272] - local39[Static323.anInt6272 & local51 - 1]);
				@Pc(89) int local89 = local85 >> 12;
				@Pc(93) int local93 = local65 >> 12;
				@Pc(99) int local99 = local89 * local89 >> 12;
				@Pc(105) int local105 = local93 * local93 >> 12;
				@Pc(120) int local120 = (int) (Math.sqrt((double) ((float) (local99 + local105 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(128) int local128 = local120 == 0 ? 0 : 16777216 / local120;
				local19[local51] = 4096 - local128;
			}
		}
		return local19;
	}
}
