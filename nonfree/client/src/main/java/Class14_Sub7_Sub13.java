import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gda")
public final class Class14_Sub7_Sub13 extends Class14_Sub7 {

	@OriginalMember(owner = "client!gda", name = "K", descriptor = "I")
	private int anInt3084 = 4096;

	@OriginalMember(owner = "client!gda", name = "R", descriptor = "Z")
	private boolean aBoolean225 = true;

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "()V")
	public Class14_Sub7_Sub13() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method9391(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt3084 = arg1.method7717(-1978450544);
		} else if (arg0 == 1) {
			this.aBoolean225 = arg1.method7695(99) == 1;
		}
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method9388(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass340_41.method8152(arg0);
		if (super.aClass340_41.aBoolean655) {
			@Pc(35) int[] local35 = this.method9379(0, arg0 - 1 & Static660.anInt6757);
			@Pc(41) int[] local41 = this.method9379(0, arg0);
			@Pc(51) int[] local51 = this.method9379(0, Static660.anInt6757 & arg0 + 1);
			@Pc(55) int[] local55 = local11[0];
			@Pc(59) int[] local59 = local11[1];
			@Pc(63) int[] local63 = local11[2];
			for (@Pc(65) int local65 = 0; local65 < Static613.anInt10114; local65++) {
				@Pc(79) int local79 = this.anInt3084 * (local51[local65] - local35[local65]);
				@Pc(99) int local99 = (local41[local65 + 1 & Static677.anInt11036] - local41[local65 - 1 & Static677.anInt11036]) * this.anInt3084;
				@Pc(103) int local103 = local99 >> 12;
				@Pc(107) int local107 = local79 >> 12;
				@Pc(113) int local113 = local103 * local103 >> 12;
				@Pc(119) int local119 = local107 * local107 >> 12;
				@Pc(133) int local133 = (int) (Math.sqrt((double) ((float) (local113 + local119 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(137) int local137;
				@Pc(139) int local139;
				@Pc(141) int local141;
				if (local133 == 0) {
					local137 = 0;
					local139 = 0;
					local141 = 0;
				} else {
					local141 = 16777216 / local133;
					local139 = local79 / local133;
					local137 = local99 / local133;
				}
				if (this.aBoolean225) {
					local139 = (local139 >> 1) + 2048;
					local137 = (local137 >> 1) + 2048;
					local141 = (local141 >> 1) + 2048;
				}
				local55[local65] = local137;
				local59[local65] = local139;
				local63[local65] = local141;
			}
		}
		return local11;
	}
}
