import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class3_Sub6_Sub32 extends Class3_Sub6 {

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8009(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass170_41.method4104(arg0);
		if (super.aClass170_41.aBoolean337) {
			@Pc(30) int[] local30 = this.method8001(0, arg0);
			for (@Pc(32) int local32 = 0; local32 < Static481.anInt8358; local32++) {
				local11[local32] = 4096 - local30[local32];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8006(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass339_41.method7670(arg0);
		if (super.aClass339_41.aBoolean647) {
			@Pc(26) int[][] local26 = this.method8005(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static481.anInt8358; local52++) {
				local42[local52] = 4096 - local30[local52];
				local46[local52] = 4096 - local34[local52];
				local50[local52] = 4096 - local38[local52];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLclient!ie;I)V")
	@Override
	public void method8003(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean720 = arg0.method6814() == 1;
		}
	}
}
