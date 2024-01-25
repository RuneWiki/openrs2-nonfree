import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class6_Sub1_Sub32 extends Class6_Sub1 {

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub32() {
		super(1, true);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method8954(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass135_41.method3057(arg0);
		if (super.aClass135_41.aBoolean210) {
			@Pc(37) int[][] local37 = this.method8959(arg0, 0);
			@Pc(41) int[] local41 = local37[0];
			@Pc(45) int[] local45 = local37[1];
			@Pc(49) int[] local49 = local37[2];
			for (@Pc(51) int local51 = 0; local51 < Static479.anInt8231; local51++) {
				local11[local51] = (local45[local51] + local41[local51] + local49[local51]) / 3;
			}
		}
		return local11;
	}
}
