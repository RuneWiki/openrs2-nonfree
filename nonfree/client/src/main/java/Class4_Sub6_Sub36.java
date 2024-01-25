import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class4_Sub6_Sub36 extends Class4_Sub6 {

	@OriginalMember(owner = "client!vi", name = "C", descriptor = "I")
	private int anInt6968 = 4096;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub36() {
		super(1, true);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IILclient!iv;)V")
	@Override
	public void method5518(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt6968 = arg1.method2536();
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5510(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_41.method2265(arg0);
		if (super.aClass82_41.aBoolean243) {
			@Pc(33) int[] local33 = this.method5508(arg0 - 1 & Static211.anInt3929, 0);
			@Pc(39) int[] local39 = this.method5508(arg0, 0);
			@Pc(49) int[] local49 = this.method5508(Static211.anInt3929 & arg0 + 1, 0);
			for (@Pc(51) int local51 = 0; local51 < Static80.anInt1616; local51++) {
				@Pc(65) int local65 = (local49[local51] - local33[local51]) * this.anInt6968;
				@Pc(85) int local85 = this.anInt6968 * (local39[Static203.anInt3883 & local51 + 1] - local39[local51 - 1 & Static203.anInt3883]);
				@Pc(89) int local89 = local85 >> 12;
				@Pc(93) int local93 = local65 >> 12;
				@Pc(99) int local99 = local89 * local89 >> 12;
				@Pc(105) int local105 = local93 * local93 >> 12;
				@Pc(120) int local120 = (int) (Math.sqrt((double) ((float) (local99 + local105 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(128) int local128 = local120 == 0 ? 0 : 16777216 / local120;
				local11[local51] = 4096 - local128;
			}
		}
		return local11;
	}
}
