import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class4_Sub4_Sub27 extends Class4_Sub4 {

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub27() {
		super(1, false);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method7883(@OriginalArg(0) int arg0) {
		@Pc(21) int[] local21 = super.aClass343_41.method7596(arg0);
		if (super.aClass343_41.aBoolean638) {
			@Pc(33) int[] local33 = this.method7890(0, arg0);
			for (@Pc(35) int local35 = 0; local35 < Static560.anInt9394; local35++) {
				local21[local35] = 4096 - local33[local35];
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7887(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass201_41.method4419(arg0);
		if (super.aClass201_41.aBoolean392) {
			@Pc(26) int[][] local26 = this.method7892(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static560.anInt9394; local52++) {
				local42[local52] = 4096 - local30[local52];
				local46[local52] = 4096 - local34[local52];
				local50[local52] = 4096 - local38[local52];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BILclient!eh;)V")
	@Override
	public void method7886(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			super.aBoolean679 = arg1.method6015() == 1;
		}
	}
}
