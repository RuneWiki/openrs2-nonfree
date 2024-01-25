import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class2_Sub15_Sub29 extends Class2_Sub15 {

	@OriginalMember(owner = "client!sh", name = "K", descriptor = "I")
	private int anInt9512 = 4096;

	@OriginalMember(owner = "client!sh", name = "F", descriptor = "I")
	private int anInt9510 = 0;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
	public Class2_Sub15_Sub29() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IZLclient!ol;)V")
	@Override
	public void method9718(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt9510 = arg1.method5211();
		} else if (arg0 == 1) {
			this.anInt9512 = arg1.method5211();
		} else if (arg0 == 2) {
			super.aBoolean803 = arg1.method5203() == 1;
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method9723(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass38_41.method1080(arg0);
		if (super.aClass38_41.aBoolean64) {
			@Pc(26) int[][] local26 = this.method9727(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static329.anInt6017; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local34[local52];
				@Pc(66) int local66 = local38[local52];
				if (local58 < this.anInt9510) {
					local42[local52] = this.anInt9510;
				} else if (local58 <= this.anInt9512) {
					local42[local52] = local58;
				} else {
					local42[local52] = this.anInt9512;
				}
				if (this.anInt9510 > local62) {
					local46[local52] = this.anInt9510;
				} else if (local62 > this.anInt9512) {
					local46[local52] = this.anInt9512;
				} else {
					local46[local52] = local62;
				}
				if (local66 < this.anInt9510) {
					local50[local52] = this.anInt9510;
				} else if (local66 > this.anInt9512) {
					local50[local52] = this.anInt9512;
				} else {
					local50[local52] = local66;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9724(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass338_41.method8470(arg0);
		if (super.aClass338_41.aBoolean712) {
			@Pc(27) int[] local27 = this.method9725(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static329.anInt6017; local29++) {
				@Pc(35) int local35 = local27[local29];
				if (this.anInt9510 > local35) {
					local11[local29] = this.anInt9510;
				} else if (this.anInt9512 < local35) {
					local11[local29] = this.anInt9512;
				} else {
					local11[local29] = local35;
				}
			}
		}
		return local11;
	}
}
