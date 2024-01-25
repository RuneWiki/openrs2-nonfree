import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fga")
public final class Class5_Sub1_Sub7 extends Class5_Sub1 {

	@OriginalMember(owner = "client!fga", name = "G", descriptor = "Z")
	private boolean aBoolean237 = true;

	@OriginalMember(owner = "client!fga", name = "J", descriptor = "I")
	private int anInt2820 = 4096;

	@OriginalMember(owner = "client!fga", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub7() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method9205(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass307_41.method7497(arg0);
		if (super.aClass307_41.aBoolean662) {
			@Pc(31) int[] local31 = this.method9210(0, arg0 - 1 & Static542.anInt9254);
			@Pc(37) int[] local37 = this.method9210(0, arg0);
			@Pc(47) int[] local47 = this.method9210(0, Static542.anInt9254 & arg0 + 1);
			@Pc(51) int[] local51 = local17[0];
			@Pc(55) int[] local55 = local17[1];
			@Pc(59) int[] local59 = local17[2];
			for (@Pc(61) int local61 = 0; local61 < Static648.anInt9588; local61++) {
				@Pc(75) int local75 = this.anInt2820 * (local47[local61] - local31[local61]);
				@Pc(95) int local95 = (local37[local61 + 1 & Static116.anInt3312] - local37[local61 - 1 & Static116.anInt3312]) * this.anInt2820;
				@Pc(99) int local99 = local95 >> 12;
				@Pc(103) int local103 = local75 >> 12;
				@Pc(109) int local109 = local99 * local99 >> 12;
				@Pc(115) int local115 = local103 * local103 >> 12;
				@Pc(129) int local129 = (int) (Math.sqrt((double) ((float) (local115 + local109 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(135) int local135;
				@Pc(137) int local137;
				@Pc(133) int local133;
				if (local129 == 0) {
					local133 = 0;
					local135 = 0;
					local137 = 0;
				} else {
					local137 = local75 / local129;
					local133 = 16777216 / local129;
					local135 = local95 / local129;
				}
				if (this.aBoolean237) {
					local135 = (local135 >> 1) + 2048;
					local133 = (local133 >> 1) + 2048;
					local137 = (local137 >> 1) + 2048;
				}
				local51[local61] = local135;
				local55[local61] = local137;
				local59[local61] = local133;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(BILclient!ib;)V")
	@Override
	public void method9209(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 == 0) {
			this.anInt2820 = arg1.method8519();
		} else if (arg0 == 1) {
			this.aBoolean237 = arg1.method8529() == 1;
		}
	}
}
