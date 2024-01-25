import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ws")
public final class Class4_Sub4_Sub39 extends Class4_Sub4 {

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method6037(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass103_41.method1977(arg0);
		if (super.aClass103_41.aBoolean164) {
			@Pc(26) int[] local26 = this.method6040(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static419.anInt6404; local28++) {
				local16[local28] = 4096 - local26[local28];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6043(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass163_41.method3181(arg0);
		if (super.aClass163_41.aBoolean296) {
			@Pc(26) int[][] local26 = this.method6049(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static419.anInt6404; local52++) {
				local42[local52] = 4096 - local30[local52];
				local46[local52] = 4096 - local34[local52];
				local50[local52] = 4096 - local38[local52];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(BILclient!fh;)V")
	@Override
	public void method6046(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			super.aBoolean535 = arg1.method5007() == 1;
		}
	}
}
