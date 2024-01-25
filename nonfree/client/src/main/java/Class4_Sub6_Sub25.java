import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class4_Sub6_Sub25 extends Class4_Sub6 {

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub25() {
		super(1, false);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILclient!iv;)V")
	@Override
	public void method5518(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub12 arg1) {
		if (arg0 == 0) {
			super.aBoolean665 = arg1.method2490() == 1;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5514(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass153_41.method3679(arg0);
		if (super.aClass153_41.aBoolean437) {
			@Pc(26) int[][] local26 = this.method5516(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static80.anInt1616; local52++) {
				local42[local52] = 4096 - local30[local52];
				local46[local52] = 4096 - local34[local52];
				local50[local52] = 4096 - local38[local52];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5510(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass82_41.method2265(arg0);
		if (super.aClass82_41.aBoolean243) {
			@Pc(29) int[] local29 = this.method5508(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static80.anInt1616; local31++) {
				local19[local31] = 4096 - local29[local31];
			}
		}
		return local19;
	}
}
