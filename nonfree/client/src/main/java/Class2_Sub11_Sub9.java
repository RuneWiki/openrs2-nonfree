import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hu")
public final class Class2_Sub11_Sub9 extends Class2_Sub11 {

	@OriginalMember(owner = "client!hu", name = "M", descriptor = "Z")
	private boolean aBoolean354 = true;

	@OriginalMember(owner = "client!hu", name = "S", descriptor = "I")
	private int anInt4027 = 4096;

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "()V")
	public Class2_Sub11_Sub9() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9533(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass370_41.method8744(arg0);
		if (super.aClass370_41.aBoolean846) {
			@Pc(31) int[] local31 = this.method9540(Static332.anInt5074 & arg0 - 1, 0);
			@Pc(37) int[] local37 = this.method9540(arg0, 0);
			@Pc(47) int[] local47 = this.method9540(Static332.anInt5074 & arg0 + 1, 0);
			@Pc(51) int[] local51 = local11[0];
			@Pc(55) int[] local55 = local11[1];
			@Pc(59) int[] local59 = local11[2];
			for (@Pc(61) int local61 = 0; local61 < Static301.anInt10214; local61++) {
				@Pc(75) int local75 = (local47[local61] - local31[local61]) * this.anInt4027;
				@Pc(95) int local95 = this.anInt4027 * (local37[local61 + 1 & Static78.anInt1356] - local37[Static78.anInt1356 & local61 - 1]);
				@Pc(99) int local99 = local95 >> 12;
				@Pc(103) int local103 = local75 >> 12;
				@Pc(109) int local109 = local99 * local99 >> 12;
				@Pc(115) int local115 = local103 * local103 >> 12;
				@Pc(129) int local129 = (int) (Math.sqrt((double) ((float) (local115 + local109 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(133) int local133;
				@Pc(135) int local135;
				@Pc(137) int local137;
				if (local129 == 0) {
					local133 = 0;
					local135 = 0;
					local137 = 0;
				} else {
					local137 = 16777216 / local129;
					local135 = local75 / local129;
					local133 = local95 / local129;
				}
				if (this.aBoolean354) {
					local137 = (local137 >> 1) + 2048;
					local135 = (local135 >> 1) + 2048;
					local133 = (local133 >> 1) + 2048;
				}
				local51[local61] = local133;
				local55[local61] = local135;
				local59[local61] = local137;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILclient!et;Z)V")
	@Override
	public void method9532(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt4027 = arg1.method8575();
		} else if (arg0 == 1) {
			this.aBoolean354 = arg1.method8581(-17416) == 1;
		}
	}
}
