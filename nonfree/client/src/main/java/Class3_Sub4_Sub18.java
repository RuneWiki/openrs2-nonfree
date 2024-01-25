import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class3_Sub4_Sub18 extends Class3_Sub4 {

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub18() {
		super(1, true);
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method6134(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass109_41.method2831(arg0);
		if (super.aClass109_41.aBoolean250) {
			@Pc(21) int[][] local21 = this.method6138(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			for (@Pc(35) int local35 = 0; local35 < Static148.anInt2687; local35++) {
				local11[local35] = (local33[local35] + local29[local35] + local25[local35]) / 3;
			}
		}
		return local11;
	}
}
