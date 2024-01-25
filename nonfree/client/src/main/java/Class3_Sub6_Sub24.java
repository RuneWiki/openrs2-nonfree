import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!naa")
public final class Class3_Sub6_Sub24 extends Class3_Sub6 {

	@OriginalMember(owner = "client!naa", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub24() {
		super(3, false);
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method7776(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass155_41.method3666(arg0);
		if (super.aClass155_41.aBoolean306) {
			@Pc(26) int[] local26 = this.method7769(arg0, 2);
			@Pc(32) int[][] local32 = this.method7773(0, arg0);
			@Pc(38) int[][] local38 = this.method7773(1, arg0);
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			@Pc(54) int[] local54 = local32[0];
			@Pc(58) int[] local58 = local32[1];
			@Pc(62) int[] local62 = local32[2];
			@Pc(66) int[] local66 = local38[0];
			@Pc(70) int[] local70 = local38[1];
			@Pc(74) int[] local74 = local38[2];
			for (@Pc(76) int local76 = 0; local76 < Static521.anInt8383; local76++) {
				@Pc(82) int local82 = local26[local76];
				if (local82 == 4096) {
					local42[local76] = local54[local76];
					local46[local76] = local58[local76];
					local50[local76] = local62[local76];
				} else if (local82 == 0) {
					local42[local76] = local66[local76];
					local46[local76] = local70[local76];
					local50[local76] = local74[local76];
				} else {
					@Pc(92) int local92 = 4096 - local82;
					local42[local76] = local82 * local54[local76] + local66[local76] * local92 >> 12;
					local46[local76] = local58[local76] * local82 + local92 * local70[local76] >> 12;
					local50[local76] = local92 * local74[local76] + local62[local76] * local82 >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(ILclient!np;I)V")
	@Override
	public void method7771(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean729 = arg0.method5175() == 1;
		}
	}

	@OriginalMember(owner = "client!naa", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7775(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass213_41.method4803(arg0);
		if (super.aClass213_41.aBoolean407) {
			@Pc(23) int[] local23 = this.method7769(arg0, 0);
			@Pc(29) int[] local29 = this.method7769(arg0, 1);
			@Pc(37) int[] local37 = this.method7769(arg0, 2);
			for (@Pc(39) int local39 = 0; local39 < Static521.anInt8383; local39++) {
				@Pc(45) int local45 = local37[local39];
				if (local45 == 4096) {
					local11[local39] = local23[local39];
				} else if (local45 == 0) {
					local11[local39] = local29[local39];
				} else {
					local11[local39] = local23[local39] * local45 + local29[local39] * (4096 - local45) >> 12;
				}
			}
		}
		return local11;
	}
}
