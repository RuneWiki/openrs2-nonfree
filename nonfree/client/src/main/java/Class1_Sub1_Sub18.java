import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class1_Sub1_Sub18 extends Class1_Sub1 {

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3398(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass75_41.method2104(arg0);
		if (super.aClass75_41.aBoolean166) {
			@Pc(26) int[][] local26 = this.method3397(0, arg0);
			@Pc(30) int[] local30 = local26[1];
			@Pc(34) int[] local34 = local26[0];
			@Pc(38) int[] local38 = local16[0];
			@Pc(42) int[] local42 = local16[1];
			@Pc(46) int[] local46 = local26[2];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static107.anInt2321; local52++) {
				local38[local52] = 4096 - local34[local52];
				local42[local52] = 4096 - local30[local52];
				local50[local52] = 4096 - local46[local52];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!ka;BI)V")
	@Override
	public void method3390(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean241 = arg0.method3010() == 1;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3394(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass43_41.method1185(arg0);
		if (super.aClass43_41.aBoolean106) {
			@Pc(25) int[] local25 = this.method3393(arg0, 0);
			for (@Pc(27) int local27 = 0; local27 < Static107.anInt2321; local27++) {
				local15[local27] = 4096 - local25[local27];
			}
		}
		return local15;
	}
}
