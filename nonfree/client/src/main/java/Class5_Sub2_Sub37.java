import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wia")
public final class Class5_Sub2_Sub37 extends Class5_Sub2 {

	@OriginalMember(owner = "client!wia", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub37() {
		super(3, false);
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(ILclient!ofa;I)V")
	@Override
	public void method9040(@OriginalArg(1) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean762 = arg0.method5966() == 1;
		}
	}

	@OriginalMember(owner = "client!wia", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method9037(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass160_41.method3854(arg0);
		if (super.aClass160_41.aBoolean310) {
			@Pc(31) int[] local31 = this.method9042(arg0, 2);
			@Pc(37) int[][] local37 = this.method9033(0, arg0);
			@Pc(43) int[][] local43 = this.method9033(1, arg0);
			@Pc(47) int[] local47 = local19[0];
			@Pc(51) int[] local51 = local19[1];
			@Pc(55) int[] local55 = local19[2];
			@Pc(59) int[] local59 = local37[0];
			@Pc(63) int[] local63 = local37[1];
			@Pc(67) int[] local67 = local37[2];
			@Pc(71) int[] local71 = local43[0];
			@Pc(75) int[] local75 = local43[1];
			@Pc(79) int[] local79 = local43[2];
			for (@Pc(81) int local81 = 0; local81 < Static597.anInt10025; local81++) {
				@Pc(87) int local87 = local31[local81];
				if (local87 == 4096) {
					local47[local81] = local59[local81];
					local51[local81] = local63[local81];
					local55[local81] = local67[local81];
				} else if (local87 == 0) {
					local47[local81] = local71[local81];
					local51[local81] = local75[local81];
					local55[local81] = local79[local81];
				} else {
					@Pc(119) int local119 = 4096 - local87;
					local47[local81] = local59[local81] * local87 + local119 * local71[local81] >> 12;
					local51[local81] = local75[local81] * local119 + local63[local81] * local87 >> 12;
					local55[local81] = local119 * local79[local81] + local67[local81] * local87 >> 12;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9034(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass379_41.method9012(arg0);
		if (super.aClass379_41.aBoolean761) {
			@Pc(26) int[] local26 = this.method9042(arg0, 0);
			@Pc(32) int[] local32 = this.method9042(arg0, 1);
			@Pc(40) int[] local40 = this.method9042(arg0, 2);
			for (@Pc(42) int local42 = 0; local42 < Static597.anInt10025; local42++) {
				@Pc(48) int local48 = local40[local42];
				if (local48 == 4096) {
					local16[local42] = local26[local42];
				} else if (local48 == 0) {
					local16[local42] = local32[local42];
				} else {
					local16[local42] = local32[local42] * (4096 - local48) + local26[local42] * local48 >> 12;
				}
			}
		}
		return local16;
	}
}
