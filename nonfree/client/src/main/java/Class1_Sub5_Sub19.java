import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class1_Sub5_Sub19 extends Class1_Sub5 {

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3149(@OriginalArg(0) int arg0) {
		@Pc(15) int[][] local15 = super.aClass53_41.method1591(arg0);
		if (super.aClass53_41.aBoolean90) {
			@Pc(25) int[][] local25 = this.method3144(arg0, 0);
			@Pc(29) int[] local29 = local25[0];
			@Pc(33) int[] local33 = local25[1];
			@Pc(37) int[] local37 = local25[2];
			@Pc(41) int[] local41 = local15[0];
			@Pc(45) int[] local45 = local15[1];
			@Pc(49) int[] local49 = local15[2];
			for (@Pc(51) int local51 = 0; local51 < Static177.anInt4018; local51++) {
				local41[local51] = 4096 - local29[local51];
				local45[local51] = 4096 - local33[local51];
				local49[local51] = 4096 - local37[local51];
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!ka;IZ)V")
	@Override
	public void method3148(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean173 = arg0.method336() == 1;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3143(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass2_41.method19(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(30) int[] local30 = this.method3145(0, arg0);
			for (@Pc(32) int local32 = 0; local32 < Static177.anInt4018; local32++) {
				local18[local32] = 4096 - local30[local32];
			}
		}
		return local18;
	}
}
