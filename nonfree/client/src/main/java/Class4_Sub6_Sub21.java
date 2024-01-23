import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class4_Sub6_Sub21 extends Class4_Sub6 {

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub21() {
		super(1, true);
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method4375(@OriginalArg(1) int arg0) {
		@Pc(25) int[] local25 = this.aClass156_41.method3763(arg0);
		if (this.aClass156_41.aBoolean307) {
			@Pc(36) int[][] local36 = this.method4377(arg0, 0);
			@Pc(40) int[] local40 = local36[0];
			@Pc(44) int[] local44 = local36[1];
			@Pc(48) int[] local48 = local36[2];
			for (@Pc(50) int local50 = 0; local50 < Static2.anInt19; local50++) {
				local25[local50] = (local48[local50] + local40[local50] + local44[local50]) / 3;
			}
		}
		return local25;
	}
}
