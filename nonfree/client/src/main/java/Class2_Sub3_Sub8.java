import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class2_Sub3_Sub8 extends Class2_Sub3 {

	@OriginalMember(owner = "client!dq", name = "U", descriptor = "I")
	public static int anInt1586 = 1;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "()V", line = 74)
	public Class2_Sub3_Sub8() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILclient!bt;I)V", line = 59)
	@Override
	public void method6485(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4 arg1) {
		if (arg0 == 0) {
			super.aBoolean487 = arg1.method4816() == 1;
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(BI)[I", line = 105)
	@Override
	public int[] method6486(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass158_41.method3997(arg0);
		if (super.aClass158_41.aBoolean265) {
			@Pc(21) int[] local21 = this.method6474(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static211.anInt4031; local23++) {
				local11[local23] = 4096 - local21[local23];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(IB)[[I", line = 138)
	@Override
	public int[][] method6480(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass243_41.method6278(arg0);
		if (super.aClass243_41.aBoolean478) {
			@Pc(26) int[][] local26 = this.method6484(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static211.anInt4031; local52++) {
				local42[local52] = 4096 - local30[local52];
				local46[local52] = 4096 - local34[local52];
				local50[local52] = 4096 - local38[local52];
			}
		}
		return local16;
	}
}
