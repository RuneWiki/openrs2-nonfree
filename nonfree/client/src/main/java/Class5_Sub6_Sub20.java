import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public final class Class5_Sub6_Sub20 extends Class5_Sub6 {

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "()V")
	public Class5_Sub6_Sub20() {
		super(3, false);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8123(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass296_41.method7185(arg0);
		if (super.aClass296_41.aBoolean614) {
			@Pc(21) int[] local21 = this.method8117(arg0, 0);
			@Pc(27) int[] local27 = this.method8117(arg0, 1);
			@Pc(33) int[] local33 = this.method8117(arg0, 2);
			for (@Pc(35) int local35 = 0; local35 < Static421.anInt7443; local35++) {
				@Pc(41) int local41 = local33[local35];
				if (local41 == 4096) {
					local11[local35] = local21[local35];
				} else if (local41 == 0) {
					local11[local35] = local27[local35];
				} else {
					local11[local35] = local21[local35] * local41 + local27[local35] * (4096 - local41) >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILclient!rv;I)V")
	@Override
	public void method8120(@OriginalArg(1) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean718 = arg0.method3642() == 1;
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8122(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass242_41.method5691(arg0);
		if (super.aClass242_41.aBoolean487) {
			@Pc(26) int[] local26 = this.method8117(arg0, 2);
			@Pc(32) int[][] local32 = this.method8116(0, arg0);
			@Pc(38) int[][] local38 = this.method8116(1, arg0);
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			@Pc(54) int[] local54 = local32[0];
			@Pc(58) int[] local58 = local32[1];
			@Pc(62) int[] local62 = local32[2];
			@Pc(66) int[] local66 = local38[0];
			@Pc(70) int[] local70 = local38[1];
			@Pc(74) int[] local74 = local38[2];
			for (@Pc(76) int local76 = 0; local76 < Static421.anInt7443; local76++) {
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
					@Pc(112) int local112 = 4096 - local82;
					local42[local76] = local112 * local66[local76] + local54[local76] * local82 >> 12;
					local46[local76] = local112 * local70[local76] + local58[local76] * local82 >> 12;
					local50[local76] = local74[local76] * local112 + local62[local76] * local82 >> 12;
				}
			}
		}
		return local16;
	}
}
