import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class3_Sub8_Sub37 extends Class3_Sub8 {

	@OriginalMember(owner = "client!vd", name = "E", descriptor = "I")
	private int anInt10461 = 4096;

	@OriginalMember(owner = "client!vd", name = "H", descriptor = "I")
	private int anInt10463 = 0;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
	public Class3_Sub8_Sub37() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILclient!dt;Z)V")
	@Override
	public void method8785(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt10463 = arg1.method7951();
		} else if (arg0 == 1) {
			this.anInt10461 = arg1.method7951();
		} else if (arg0 == 2) {
			super.aBoolean737 = arg1.method7954() == 1;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8784(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass87_41.method1796(arg0);
		if (super.aClass87_41.aBoolean163) {
			@Pc(26) int[] local26 = this.method8776(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static91.anInt1849; local28++) {
				@Pc(34) int local34 = local26[local28];
				if (local34 < this.anInt10463) {
					local11[local28] = this.anInt10463;
				} else if (local34 <= this.anInt10461) {
					local11[local28] = local34;
				} else {
					local11[local28] = this.anInt10461;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8774(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass326_41.method7329(arg0);
		if (super.aClass326_41.aBoolean628) {
			@Pc(26) int[][] local26 = this.method8779(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static91.anInt1849; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local34[local52];
				@Pc(66) int local66 = local38[local52];
				if (this.anInt10463 > local58) {
					local42[local52] = this.anInt10463;
				} else if (local58 > this.anInt10461) {
					local42[local52] = this.anInt10461;
				} else {
					local42[local52] = local58;
				}
				if (local62 < this.anInt10463) {
					local46[local52] = this.anInt10463;
				} else if (this.anInt10461 >= local62) {
					local46[local52] = local62;
				} else {
					local46[local52] = this.anInt10461;
				}
				if (local66 < this.anInt10463) {
					local50[local52] = this.anInt10463;
				} else if (local66 > this.anInt10461) {
					local50[local52] = this.anInt10461;
				} else {
					local50[local52] = local66;
				}
			}
		}
		return local16;
	}
}
