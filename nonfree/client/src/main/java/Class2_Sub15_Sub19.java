import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class2_Sub15_Sub19 extends Class2_Sub15 {

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V")
	public Class2_Sub15_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9724(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass338_41.method8470(arg0);
		if (super.aClass338_41.aBoolean712) {
			@Pc(26) int[] local26 = this.method9725(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static329.anInt6017; local28++) {
				local16[local28] = 4096 - local26[local28];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method9723(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass38_41.method1080(arg0);
		if (super.aClass38_41.aBoolean64) {
			@Pc(26) int[][] local26 = this.method9727(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static329.anInt6017; local52++) {
				local42[local52] = 4096 - local30[local52];
				local46[local52] = 4096 - local34[local52];
				local50[local52] = 4096 - local38[local52];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IZLclient!ol;)V")
	@Override
	public void method9718(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 0) {
			super.aBoolean803 = arg1.method5203() == 1;
		}
	}
}
