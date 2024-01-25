import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class10_Sub2_Sub38 extends Class10_Sub2 {

	@OriginalMember(owner = "client!wf", name = "Q", descriptor = "I")
	private int anInt7497 = 4096;

	@OriginalMember(owner = "client!wf", name = "P", descriptor = "I")
	private int anInt7496 = 0;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V")
	public Class10_Sub2_Sub38() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IILclient!nn;)V")
	@Override
	public void method6044(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt7496 = arg1.method2485();
		} else if (arg0 == 1) {
			this.anInt7497 = arg1.method2485();
		} else if (arg0 == 2) {
			super.aBoolean499 = arg1.method2502() == 1;
		}
	}

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method6037(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass102_41.method2566(arg0);
		if (super.aClass102_41.aBoolean216) {
			@Pc(26) int[][] local26 = this.method6045(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static121.anInt2458; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local34[local52];
				@Pc(66) int local66 = local38[local52];
				if (local58 < this.anInt7496) {
					local42[local52] = this.anInt7496;
				} else if (local58 <= this.anInt7497) {
					local42[local52] = local58;
				} else {
					local42[local52] = this.anInt7497;
				}
				if (this.anInt7496 > local62) {
					local46[local52] = this.anInt7496;
				} else if (local62 <= this.anInt7497) {
					local46[local52] = local62;
				} else {
					local46[local52] = this.anInt7497;
				}
				if (local66 < this.anInt7496) {
					local50[local52] = this.anInt7496;
				} else if (this.anInt7497 < local66) {
					local50[local52] = this.anInt7497;
				} else {
					local50[local52] = local66;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6035(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass241_41.method5238(arg0);
		if (super.aClass241_41.aBoolean440) {
			@Pc(38) int[] local38 = this.method6041(arg0, 0);
			for (@Pc(40) int local40 = 0; local40 < Static121.anInt2458; local40++) {
				@Pc(46) int local46 = local38[local40];
				if (this.anInt7496 > local46) {
					local11[local40] = this.anInt7496;
				} else if (local46 <= this.anInt7497) {
					local11[local40] = local46;
				} else {
					local11[local40] = this.anInt7497;
				}
			}
		}
		return local11;
	}
}
