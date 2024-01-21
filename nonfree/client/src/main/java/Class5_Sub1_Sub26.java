import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class5_Sub1_Sub26 extends Class5_Sub1 {

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub26() {
		super(1, false);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3195(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass101_41.method2886(arg0);
		if (super.aClass101_41.aBoolean174) {
			@Pc(25) int[] local25 = this.method3196(arg0, 0);
			for (@Pc(27) int local27 = 0; local27 < Static174.anInt3489; local27++) {
				local15[local27] = 4096 - local25[local27];
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3193(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass105_41.method3106(arg0);
		if (super.aClass105_41.aBoolean183) {
			@Pc(27) int[][] local27 = this.method3191(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[2];
			@Pc(51) int[] local51 = local17[1];
			for (@Pc(53) int local53 = 0; local53 < Static174.anInt3489; local53++) {
				local43[local53] = 4096 - local31[local53];
				local51[local53] = 4096 - local35[local53];
				local47[local53] = 4096 - local39[local53];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3190(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean189 = arg0.method3062() == 1;
		}
	}
}
