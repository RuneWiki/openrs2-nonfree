import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ws")
public final class Class1_Sub3_Sub38 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub38() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6084(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass172_41.method3962(arg0);
		if (super.aClass172_41.aBoolean327) {
			@Pc(28) int[][] local28 = this.method6072(0, arg0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			for (@Pc(42) int local42 = 0; local42 < Static347.anInt5974; local42++) {
				local16[local42] = (local36[local42] + local32[local42] + local40[local42]) / 3;
			}
		}
		return local16;
	}
}
