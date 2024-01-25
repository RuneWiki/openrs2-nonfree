import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class6_Sub4_Sub14 extends Class6_Sub4 {

	@OriginalMember(owner = "client!hi", name = "F", descriptor = "I")
	private int anInt4181 = 0;

	@OriginalMember(owner = "client!hi", name = "J", descriptor = "I")
	private int anInt4184 = 4096;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8320(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass307_41.method7792(arg0);
		if (super.aClass307_41.aBoolean613) {
			@Pc(26) int[][] local26 = this.method8319(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static6.anInt111; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local34[local52];
				@Pc(66) int local66 = local38[local52];
				if (this.anInt4181 > local58) {
					local42[local52] = this.anInt4181;
				} else if (this.anInt4184 >= local58) {
					local42[local52] = local58;
				} else {
					local42[local52] = this.anInt4184;
				}
				if (this.anInt4181 > local62) {
					local46[local52] = this.anInt4181;
				} else if (local62 <= this.anInt4184) {
					local46[local52] = local62;
				} else {
					local46[local52] = this.anInt4184;
				}
				if (this.anInt4181 > local66) {
					local50[local52] = this.anInt4181;
				} else if (this.anInt4184 < local66) {
					local50[local52] = this.anInt4184;
				} else {
					local50[local52] = local66;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8323(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass372_41.method8736(arg0);
		if (super.aClass372_41.aBoolean691) {
			@Pc(21) int[] local21 = this.method8313(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static6.anInt111; local23++) {
				@Pc(29) int local29 = local21[local23];
				if (this.anInt4181 > local29) {
					local11[local23] = this.anInt4181;
				} else if (local29 > this.anInt4184) {
					local11[local23] = this.anInt4184;
				} else {
					local11[local23] = local29;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IILclient!rg;)V")
	@Override
	public void method8314(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub40 arg1) {
		if (arg0 == 0) {
			this.anInt4181 = arg1.method8571();
		} else if (arg0 == 1) {
			this.anInt4184 = arg1.method8571();
		} else if (arg0 == 2) {
			super.aBoolean674 = arg1.method8604() == 1;
		}
	}
}
