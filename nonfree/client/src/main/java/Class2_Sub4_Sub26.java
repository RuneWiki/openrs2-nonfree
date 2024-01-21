import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class2_Sub4_Sub26 extends Class2_Sub4 {

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub26() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IBLclient!kd;)V")
	@Override
	public void method3120(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			super.aBoolean190 = arg1.method1534() == 1;
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3127(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass78_41.method2318(arg0);
		if (super.aClass78_41.aBoolean144) {
			@Pc(23) int[] local23 = this.method3129(0, arg0);
			for (@Pc(25) int local25 = 0; local25 < Static118.anInt2608; local25++) {
				local13[local25] = 4096 - local23[local25];
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3122(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass99_41.method2748(arg0);
		if (super.aClass99_41.aBoolean176) {
			@Pc(26) int[][] local26 = this.method3130(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[2];
			@Pc(38) int[] local38 = local26[1];
			@Pc(42) int[] local42 = local16[1];
			@Pc(46) int[] local46 = local16[0];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static118.anInt2608; local52++) {
				local46[local52] = 4096 - local30[local52];
				local42[local52] = 4096 - local38[local52];
				local50[local52] = 4096 - local34[local52];
			}
		}
		return local16;
	}
}
