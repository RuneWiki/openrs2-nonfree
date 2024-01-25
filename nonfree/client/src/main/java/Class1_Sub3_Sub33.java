import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class1_Sub3_Sub33 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub33() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5529(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass122_41.method3385(arg0);
		if (super.aClass122_41.aBoolean342) {
			@Pc(29) int[][] local29 = this.method5528(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			for (@Pc(43) int local43 = 0; local43 < Static153.anInt3378; local43++) {
				local11[local43] = (local33[local43] + local37[local43] + local41[local43]) / 3;
			}
		}
		return local11;
	}
}
