import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class1_Sub4_Sub32 extends Class1_Sub4 {

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub32() {
		super(1, true);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4746(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = this.aClass7_41.method116(arg0);
		if (this.aClass7_41.aBoolean4) {
			@Pc(28) int[][] local28 = this.method4749(0, arg0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			for (@Pc(42) int local42 = 0; local42 < Static182.anInt3492; local42++) {
				local17[local42] = (local40[local42] + local36[local42] + local32[local42]) / 3;
			}
		}
		return local17;
	}
}
