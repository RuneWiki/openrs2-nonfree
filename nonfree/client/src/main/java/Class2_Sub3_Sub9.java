import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class2_Sub3_Sub9 extends Class2_Sub3 {

	@OriginalMember(owner = "client!fi", name = "K", descriptor = "I")
	private int anInt3951 = 4096;

	@OriginalMember(owner = "client!fi", name = "O", descriptor = "I")
	private int anInt3954 = 0;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub9() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!cea;II)V")
	@Override
	public void method9157(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3954 = arg0.method8326();
		} else if (arg1 == 1) {
			this.anInt3951 = arg0.method8326();
		} else if (arg1 == 2) {
			super.aBoolean748 = arg0.method8383() == 1;
		}
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "(II)[[I")
	@Override
	public int[][] method9155(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass10_41.method211(arg0);
		if (super.aClass10_41.aBoolean11) {
			@Pc(26) int[][] local26 = this.method9147(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static222.anInt4971; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local34[local52];
				@Pc(66) int local66 = local38[local52];
				if (local58 < this.anInt3954) {
					local42[local52] = this.anInt3954;
				} else if (local58 <= this.anInt3951) {
					local42[local52] = local58;
				} else {
					local42[local52] = this.anInt3951;
				}
				if (this.anInt3954 > local62) {
					local46[local52] = this.anInt3954;
				} else if (this.anInt3951 >= local62) {
					local46[local52] = local62;
				} else {
					local46[local52] = this.anInt3951;
				}
				if (local66 < this.anInt3954) {
					local50[local52] = this.anInt3954;
				} else if (this.anInt3951 >= local66) {
					local50[local52] = local66;
				} else {
					local50[local52] = this.anInt3951;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method9150(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass281_41.method7189(arg0);
		if (super.aClass281_41.aBoolean607) {
			@Pc(23) int[] local23 = this.method9156(arg0, 0);
			for (@Pc(25) int local25 = 0; local25 < Static222.anInt4971; local25++) {
				@Pc(31) int local31 = local23[local25];
				if (local31 < this.anInt3954) {
					local13[local25] = this.anInt3954;
				} else if (local31 > this.anInt3951) {
					local13[local25] = this.anInt3951;
				} else {
					local13[local25] = local31;
				}
			}
		}
		return local13;
	}
}
