import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rr")
public final class Class1_Sub5_Sub29 extends Class1_Sub5 {

	@OriginalMember(owner = "client!rr", name = "R", descriptor = "I")
	private int anInt5579 = 4096;

	@OriginalMember(owner = "client!rr", name = "S", descriptor = "I")
	private int anInt5580 = 0;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "()V")
	public Class1_Sub5_Sub29() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5811(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass151_41.method4015(arg0);
		if (super.aClass151_41.aBoolean368) {
			@Pc(26) int[][] local26 = this.method5807(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static75.anInt1566; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local34[local52];
				@Pc(66) int local66 = local38[local52];
				if (this.anInt5580 > local58) {
					local42[local52] = this.anInt5580;
				} else if (local58 > this.anInt5579) {
					local42[local52] = this.anInt5579;
				} else {
					local42[local52] = local58;
				}
				if (local62 < this.anInt5580) {
					local46[local52] = this.anInt5580;
				} else if (local62 > this.anInt5579) {
					local46[local52] = this.anInt5579;
				} else {
					local46[local52] = local62;
				}
				if (local66 < this.anInt5580) {
					local50[local52] = this.anInt5580;
				} else if (local66 > this.anInt5579) {
					local50[local52] = this.anInt5579;
				} else {
					local50[local52] = local66;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method5814(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5580 = arg0.method5715();
		} else if (arg1 == 1) {
			this.anInt5579 = arg0.method5715();
		} else if (arg1 == 2) {
			super.aBoolean552 = arg0.method5720() == 1;
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5805(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass214_41.method5651(arg0);
		if (super.aClass214_41.aBoolean544) {
			@Pc(28) int[] local28 = this.method5802(0, arg0);
			for (@Pc(30) int local30 = 0; local30 < Static75.anInt1566; local30++) {
				@Pc(36) int local36 = local28[local30];
				if (this.anInt5580 > local36) {
					local18[local30] = this.anInt5580;
				} else if (local36 > this.anInt5579) {
					local18[local30] = this.anInt5579;
				} else {
					local18[local30] = local36;
				}
			}
		}
		return local18;
	}
}
