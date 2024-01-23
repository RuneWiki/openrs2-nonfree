import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class4_Sub6_Sub16 extends Class4_Sub6 {

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub16() {
		super(1, false);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!p;II)V")
	@Override
	public void method4381(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean355 = arg0.method1874() == 1;
		}
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method4375(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = this.aClass156_41.method3763(arg0);
		if (this.aClass156_41.aBoolean307) {
			@Pc(21) int[] local21 = this.method4372(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static2.anInt19; local23++) {
				local7[local23] = 4096 - local21[local23];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4379(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = this.aClass84_41.method2153(arg0);
		if (this.aClass84_41.aBoolean183) {
			@Pc(26) int[][] local26 = this.method4377(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[2];
			@Pc(38) int[] local38 = local26[1];
			@Pc(42) int[] local42 = local7[2];
			@Pc(46) int[] local46 = local7[1];
			@Pc(50) int[] local50 = local7[0];
			for (@Pc(52) int local52 = 0; local52 < Static2.anInt19; local52++) {
				local50[local52] = 4096 - local30[local52];
				local46[local52] = 4096 - local38[local52];
				local42[local52] = 4096 - local34[local52];
			}
		}
		return local7;
	}
}
