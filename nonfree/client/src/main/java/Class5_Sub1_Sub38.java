import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public final class Class5_Sub1_Sub38 extends Class5_Sub1 {

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub38() {
		super(1, true);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5770(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass239_41.method5400(arg0);
		if (super.aClass239_41.aBoolean460) {
			@Pc(28) int[][] local28 = this.method5764(0, arg0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			for (@Pc(42) int local42 = 0; local42 < Static148.anInt2666; local42++) {
				local13[local42] = (local36[local42] + local32[local42] + local40[local42]) / 3;
			}
		}
		return local13;
	}
}
