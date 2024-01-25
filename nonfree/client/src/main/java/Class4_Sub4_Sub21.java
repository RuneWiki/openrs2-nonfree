import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ov")
public final class Class4_Sub4_Sub21 extends Class4_Sub4 {

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub21() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method6037(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass103_41.method1977(arg0);
		if (super.aClass103_41.aBoolean164) {
			@Pc(29) int[][] local29 = this.method6049(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			for (@Pc(43) int local43 = 0; local43 < Static419.anInt6404; local43++) {
				local11[local43] = (local41[local43] + local37[local43] + local33[local43]) / 3;
			}
		}
		return local11;
	}
}
