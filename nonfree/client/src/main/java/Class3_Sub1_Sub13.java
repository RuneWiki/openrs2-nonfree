import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gja")
public final class Class3_Sub1_Sub13 extends Class3_Sub1 {

	@OriginalMember(owner = "client!gja", name = "B", descriptor = "Z")
	private boolean aBoolean220 = true;

	@OriginalMember(owner = "client!gja", name = "E", descriptor = "I")
	private int anInt3493 = 4096;

	@OriginalMember(owner = "client!gja", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub13() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(IILclient!ika;)V")
	@Override
	public void method9582(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt3493 = arg1.method2028(-14795);
		} else if (arg0 == 1) {
			this.aBoolean220 = arg1.method2048(255) == 1;
		}
	}

	@OriginalMember(owner = "client!gja", name = "b", descriptor = "(BI)[[I")
	@Override
	public int[][] method9580(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass281_41.method6493(arg0);
		if (super.aClass281_41.aBoolean509) {
			@Pc(31) int[] local31 = this.method9577(0, arg0 - 1 & Static652.anInt2344);
			@Pc(37) int[] local37 = this.method9577(0, arg0);
			@Pc(47) int[] local47 = this.method9577(0, arg0 + 1 & Static652.anInt2344);
			@Pc(51) int[] local51 = local11[0];
			@Pc(55) int[] local55 = local11[1];
			@Pc(59) int[] local59 = local11[2];
			for (@Pc(61) int local61 = 0; local61 < Static379.anInt5859; local61++) {
				@Pc(75) int local75 = this.anInt3493 * (local47[local61] - local31[local61]);
				@Pc(95) int local95 = (local37[Static711.anInt10997 & local61 + 1] - local37[local61 - 1 & Static711.anInt10997]) * this.anInt3493;
				@Pc(99) int local99 = local95 >> 12;
				@Pc(103) int local103 = local75 >> 12;
				@Pc(109) int local109 = local99 * local99 >> 12;
				@Pc(115) int local115 = local103 * local103 >> 12;
				@Pc(129) int local129 = (int) (Math.sqrt((double) ((float) (local115 + local109 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(146) int local146;
				@Pc(138) int local138;
				@Pc(142) int local142;
				if (local129 == 0) {
					local142 = 0;
					local138 = 0;
					local146 = 0;
				} else {
					local138 = local75 / local129;
					local142 = 16777216 / local129;
					local146 = local95 / local129;
				}
				if (this.aBoolean220) {
					local142 = (local142 >> 1) + 2048;
					local138 = (local138 >> 1) + 2048;
					local146 = (local146 >> 1) + 2048;
				}
				local51[local61] = local146;
				local55[local61] = local138;
				local59[local61] = local142;
			}
		}
		return local11;
	}
}
