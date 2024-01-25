import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uga")
public final class Class5_Sub2_Sub33 extends Class5_Sub2 {

	@OriginalMember(owner = "client!uga", name = "F", descriptor = "I")
	private int anInt9813 = 4096;

	@OriginalMember(owner = "client!uga", name = "K", descriptor = "I")
	private int anInt9816 = 0;

	@OriginalMember(owner = "client!uga", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub33() {
		super(1, false);
	}

	@OriginalMember(owner = "client!uga", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8943(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass180_41.method4548(arg0);
		if (super.aClass180_41.aBoolean464) {
			@Pc(26) int[][] local26 = this.method8952(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static195.anInt3759; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local34[local52];
				@Pc(66) int local66 = local38[local52];
				if (this.anInt9816 > local58) {
					local42[local52] = this.anInt9816;
				} else if (local58 <= this.anInt9813) {
					local42[local52] = local58;
				} else {
					local42[local52] = this.anInt9813;
				}
				if (this.anInt9816 > local62) {
					local46[local52] = this.anInt9816;
				} else if (local62 > this.anInt9813) {
					local46[local52] = this.anInt9813;
				} else {
					local46[local52] = local62;
				}
				if (local66 < this.anInt9816) {
					local50[local52] = this.anInt9816;
				} else if (local66 > this.anInt9813) {
					local50[local52] = this.anInt9813;
				} else {
					local50[local52] = local66;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(Lclient!mc;II)V")
	@Override
	public void method8944(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt9816 = arg0.method7860();
		} else if (arg1 == 1) {
			this.anInt9813 = arg0.method7860();
		} else if (arg1 == 2) {
			super.aBoolean910 = arg0.method7816() == 1;
		}
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8942(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass333_41.method7747(arg0);
		if (super.aClass333_41.aBoolean779) {
			@Pc(21) int[] local21 = this.method8945(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static195.anInt3759; local23++) {
				@Pc(29) int local29 = local21[local23];
				if (this.anInt9816 > local29) {
					local11[local23] = this.anInt9816;
				} else if (this.anInt9813 < local29) {
					local11[local23] = this.anInt9813;
				} else {
					local11[local23] = local29;
				}
			}
		}
		return local11;
	}
}
