import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class4_Sub4_Sub20 extends Class4_Sub4 {

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub20() {
		super(1, true);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method7883(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass343_41.method7596(arg0);
		if (super.aClass343_41.aBoolean638) {
			@Pc(29) int[][] local29 = this.method7892(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			for (@Pc(43) int local43 = 0; local43 < Static560.anInt9394; local43++) {
				local11[local43] = (local33[local43] + local37[local43] + local41[local43]) / 3;
			}
		}
		return local11;
	}
}
