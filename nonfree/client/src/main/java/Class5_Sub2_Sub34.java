import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class5_Sub2_Sub34 extends Class5_Sub2 {

	@OriginalMember(owner = "client!tq", name = "K", descriptor = "I")
	private int anInt9192 = 0;

	@OriginalMember(owner = "client!tq", name = "L", descriptor = "I")
	private int anInt9193 = 4096;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(IZ)[[I")
	@Override
	public int[][] method8827(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass370_41.method8551(arg0);
		if (super.aClass370_41.aBoolean819) {
			@Pc(26) int[][] local26 = this.method8823(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static314.anInt6320; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local34[local52];
				@Pc(66) int local66 = local38[local52];
				if (this.anInt9192 > local58) {
					local42[local52] = this.anInt9192;
				} else if (this.anInt9193 < local58) {
					local42[local52] = this.anInt9193;
				} else {
					local42[local52] = local58;
				}
				if (local62 < this.anInt9192) {
					local46[local52] = this.anInt9192;
				} else if (this.anInt9193 < local62) {
					local46[local52] = this.anInt9193;
				} else {
					local46[local52] = local62;
				}
				if (local66 < this.anInt9192) {
					local50[local52] = this.anInt9192;
				} else if (this.anInt9193 >= local66) {
					local50[local52] = local66;
				} else {
					local50[local52] = this.anInt9193;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!ee;BI)V")
	@Override
	public void method8825(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt9192 = arg0.method8631();
		} else if (arg1 == 1) {
			this.anInt9193 = arg0.method8631();
		} else if (arg1 == 2) {
			super.aBoolean834 = arg0.method8645() == 1;
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8820(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass246_41.method5949(arg0);
		if (super.aClass246_41.aBoolean561) {
			@Pc(26) int[] local26 = this.method8821(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static314.anInt6320; local28++) {
				@Pc(34) int local34 = local26[local28];
				if (local34 < this.anInt9192) {
					local11[local28] = this.anInt9192;
				} else if (this.anInt9193 >= local34) {
					local11[local28] = local34;
				} else {
					local11[local28] = this.anInt9193;
				}
			}
		}
		return local11;
	}
}
