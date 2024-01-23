import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class1_Sub1_Sub6 extends Class1_Sub1 {

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub6() {
		super(1, true);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method4465(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass190_41.method4648(arg0);
		if (this.aClass190_41.aBoolean527) {
			@Pc(21) int[][] local21 = this.method4456(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[2];
			@Pc(33) int[] local33 = local21[1];
			for (@Pc(35) int local35 = 0; local35 < Static6.anInt4960; local35++) {
				local11[local35] = (local33[local35] + local25[local35] + local29[local35]) / 3;
			}
		}
		return local11;
	}
}
